import java.awt.*;
import java.awt.event.KeyEvent;

public class MainClass {

    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot localRobot = new Robot();
        int time = 5000; // default
        int mode = 0; // default 0 = f15, 1 = comma, 2 = caps
        int cycle = 10; // max time


        if(args.length != 0) {
            if (args[0] != null){
                time = Integer.parseInt(args[0]);
            }
            if (args[1]!= null){
                mode = Integer.parseInt(args[1]);
            }

            if (args[2]!= null){
                cycle = Integer.parseInt(args[2]);
            }
        }

        System.out.println("time = " + time + "\tmode = " + mode + "\tcycle = " + cycle);

        for (int i = 1; i < cycle; i++) {

            Thread.sleep(time);

            if  ( mode == 0 ) {
                localRobot.keyPress(KeyEvent.VK_F15);
            }
            if  ( mode == 1 ) {
                localRobot.keyPress(KeyEvent.VK_COMMA);
                Thread.sleep(1000);
                localRobot.keyPress(KeyEvent.VK_BACK_SPACE);
            }
            if  ( mode == 2 ) {
                localRobot.keyPress(KeyEvent.VK_CAPS_LOCK);
                Thread.sleep(1000);
                localRobot.keyPress(KeyEvent.VK_CAPS_LOCK);
            }

        }
    }
}

