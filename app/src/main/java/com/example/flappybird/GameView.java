package com.example.flappybird;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

//định nghĩa lơp sgameview đc kế thừa từ surfaceView(tp giao diện đc udngf trong and để vẽ trưc jtieep lên mặt
//imple surfaceh(giao diện cung cấp phương thức để quản lí bề mặt) - callback(giao diện lắng nghe sự kiện)


public class GameView extends SurfaceView implements SurfaceHolder.Callback {



//surfaceHolder.callback cung cấp các phương thúc (sfcraetes + sfchanged +sfdestroy)

    GameThread gameThread;


//hàm tạo lấy bối cảnh là tham số , triển khai surfaceholder ????

    public GameView(Context context) {
        super(context);
        //gọi initView bên tỏng hàm tạo
        //khởi tạo các icon surface holder và thread , khai báo tham chiếu đối tượng gamethread trong gameview ,
        //khởi tạo initView
        initView();
    }
    //??? if ...else
    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        if(!gameThread.isRunning()){
            gameThread = new GameThread(holder);
            gameThread.start();
        }else{
            gameThread.start();


        }

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        if(gameThread.isRunning()){
            gameThread.setIsRunning(false);
            boolean retry = true;
            while(retry){
                try{
                    gameThread.join();
                    retry = false;

                }catch(InterruptedException e){}
            }
        }

    }

    //khởi tạo các icon surface holder và thread , khai báo tham chiếu đối tượng gamethread trong gameview ,
    //khởi tạo initView
    void initView(){
        SurfaceHolder holder = getHolder();
        holder.addCallback(this); //???
        setFocusable(true);//???
        gameThread = new GameThread(holder);
        //trong phương thức surfacecreate (), kiểm tra trạng thái luồng  , nếu ko chạy sẽ tạo mọt đối tượng gamethread new



    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        //tap is detected
        if (action == MotionEvent.ACTION_DOWN) {
            AppConstants.getGameEngine().gameState = 1;
            AppConstants.getGameEngine().bird.setVelocity(AppConstants.VELOCITY_WHEN_JUMPED);


        }
        return true;

    }
}
