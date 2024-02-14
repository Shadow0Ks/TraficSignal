package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



//What i need to do is figure out how to change the state from 0 to 1 on each of the lights
public class SignalClass {
    Traffic_Signal trafficSignal = new Traffic_Signal("");
    private boolean isRunning;
    private int redSignal;
    private int yellowSignal;
    private int greenSignal;

    public SignalClass(boolean isRunning) {

        this.isRunning = isRunning;
        redSignal = 0;
        yellowSignal = 0;
        greenSignal = 0;
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
        for (int i = 1; i <= 20; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public int getRedState(){
        if (redSignal == 0){
            redSignal = trafficSignal.x;
        }
        return redSignal;
    }
    public void run(){
        while (isRunning){
            getRedState();
            //forStartTimer();
            isRunning = false;
        }
    }


}
