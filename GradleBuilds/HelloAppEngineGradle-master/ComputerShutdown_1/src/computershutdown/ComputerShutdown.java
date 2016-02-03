/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computershutdown;

import java.io.IOException;
import java.time.LocalTime;

/**
 *
 * @author mhunter
 */
public class ComputerShutdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        LocalTime currentTime = LocalTime.now();
        LocalTime restrictionTimeLate = LocalTime.of(22, 0);
        LocalTime restrictionTimeEarly = LocalTime.of(6, 0);

        //compares the current time to restriction time.
        int timeDifferenceLate = currentTime.compareTo(restrictionTimeLate);
        int timeDifferenceEarly = currentTime.compareTo(restrictionTimeEarly);

        System.out.println("Time Difference Late = " + timeDifferenceLate);
        System.out.println("Time Difference Early = " + timeDifferenceEarly);

        if (timeDifferenceLate > 0 && timeDifferenceEarly < 0) {
            System.out.println("In between " + restrictionTimeLate.toString() + " and " + restrictionTimeEarly.toString());
            // the below will shutdown the computer immediately
                    Runtime rt = Runtime.getRuntime();
            
            //FOR WINDOWS 10
                    Process pr = rt.exec("shutdown /s");
            
            //FOR MAC
             //       Process pr = rt.exec("shutdown -s -t 0");
             // System.exit(0)
        }

        if (timeDifferenceLate < 0 && timeDifferenceEarly > 0) {
            System.out.println("Okay time frame :)");
        }


    }

}
