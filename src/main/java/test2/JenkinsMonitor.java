package test2;

import com.google.gson.Gson;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by zhivkokasabov on 7/5/2017.
 */
public class JenkinsMonitor {


    public static void main(String[] args) throws Exception {

        String protocol = "http";
        String host = "//192.168.4.208/";
        int port = 8080;
        String usernName = "vera";
        String password = "1q2w3e4r5t";

        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getCredentialsProvider().setCredentials(
                new AuthScope(host, port),
                new UsernamePasswordCredentials(usernName, password));

        String jenkinsUrl = protocol + "://" + host + ":" + port + "/jenkins/";

        try {
            // get the crumb from Jenkins
            // do this only once per HTTP session
            // keep the crumb for every coming request
            System.out.println("... issue crumb");
            HttpGet httpGet = new HttpGet("http://192.168.4.208:8080" + "crumbIssuer/api/json");
            String crumbResponse= toString(httpclient, httpGet);
            CrumbJson crumbJson = new Gson()
                    .fromJson(crumbResponse, CrumbJson.class);

            // add the issued crumb to each request header
            // the header field name is also contained in the json response
            System.out.println("... issue rss of latest builds");
            HttpPost httpost = new HttpPost(jenkinsUrl + "rssLatest");
            httpost.addHeader(crumbJson.crumbRequestField, crumbJson.crumb);
            toString(httpclient, httpost);

        } finally {
            httpclient.getConnectionManager().shutdown();
        }

    }

    // helper construct to deserialize crumb json into
    public static class CrumbJson {
        public String crumb;
        public String crumbRequestField;
    }

    private static String toString(DefaultHttpClient client,
                                   HttpRequestBase request) throws Exception {
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = client.execute(request, responseHandler);
        System.out.println(responseBody + "\n");
        return responseBody;
    }

}
