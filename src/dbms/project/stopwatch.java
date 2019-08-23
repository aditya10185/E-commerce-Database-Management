/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class stopwatch {
static int interval;
static Timer timer;

public void watch()
{
   // Scanner sc = new Scanner(System.in);
    //System.out.print("Input seconds => : ");
    
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = 3600;
    //System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            setInterval();

        }
     

    }, delay, period);
     
}

private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
}
}


