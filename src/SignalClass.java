package src;

import java.awt.*;

public class SignalClass extends Traffic_Signal {
    //delta time (not sure if needed)
    float dt;

    public SignalClass(String msg) {
        super(msg);
        dt = 60;
    }
    public void forStartTimer(){
        for (int i = 1; i <= 30; i++){

            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public void forStopTimer() {
        for (int i = 1; i <= 50; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void updateFromRedToGreen(){

        forStartTimer();
    }

    public void run(){
        boolean isRunning = false;
        if (start.isSelected() == true)
            isRunning = true;
        while (isRunning){
            updateFromRedToGreen();



            if (stop.isSelected()){
                isRunning = false;
            }
        }

    }
}