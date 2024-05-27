package com.example.flappybird;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread {
    SurfaceHolder surfaceHolder ; //surfaceholder object reference
    boolean isRunning;//flag to detect whether th ethraed is running or not
    long startTime, loopTime ; //loop start time and loop duảtion
    long DELAY = 33;//delay in milliseconds between screen refreshes




    public GameThread(SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
        isRunning = true;

    }
    @Override
    public void run(){
        //looping until the boolean is false
        while(isRunning){
            startTime = SystemClock.uptimeMillis();
            //locking the canvas
            Canvas canvas = surfaceHolder.lockCanvas(null);
            if(canvas != null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas);
                    AppConstants.getGameEngine().updateAndDrawBird(canvas);

                    //unlocking the camvas
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }



            }
                //loop time
            loopTime = SystemClock.uptimeMillis() - startTime;
                //pausing here to make sure we update the right amuont per second
            if(loopTime < DELAY){
                try{
                    Thread.sleep(DELAY - loopTime);

                }catch(InterruptedException e ){
                    Log.e("Interrupted", "Interrupted while sleeping");
                }
            }


        }


    }


    //return whether the thread is running
    public boolean isRunning (){
        return isRunning;

    }
    //sét the thread state , false = stopped, true = running
    public void setIsRunning(boolean state){
        isRunning = state;
    }

}
