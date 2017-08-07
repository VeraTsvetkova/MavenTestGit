package test.test1;

import javax.swing.*;

/**
 * Created by zhivkokasabov on 7/4/2017.
 */
public class FrameDemo {

        public static void main(String args[]){
            JFrame myFrame = new JFrame("Sample Frame");
            myFrame.setSize(300,400);
            myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
        }


}
