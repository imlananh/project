package com.example.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {
    Bitmap background;
    Bitmap[] bird;


    //tạo constructor
    //truyền đối tượng tài nguyên khi gọi hàm tạo này
    //sao chép hình nền và dán vào drawable
    public BitmapBank(Resources res) {
        //lớp bitmapfac cung cấp phương thức giải mã
        background = BitmapFactory.decodeResource(res,R.drawable.background2);
        background = scaleImage(background);
        bird = new Bitmap[4];
        bird[0] = BitmapFactory.decodeResource(res, R.drawable.bird_frame1);
        bird[1] = BitmapFactory.decodeResource(res, R.drawable.bird_frame2);
        bird[2] = BitmapFactory.decodeResource(res, R.drawable.bird_frame3);
        bird[3] = BitmapFactory.decodeResource(res, R.drawable.bird_frame4);



    }
    //return bird bitmap of frame
    public Bitmap getBird(int frame){
        return bird[frame];


    }
    public int getBirdWidth(){
        return bird[0].getWidth();

    }
    public int getBirdHeight(){
        return bird[0].getHeight();
    }




    //tạo phương thức getmethod trong lướp này
    //return background bitmap
    public Bitmap getBackground(){
        return background;

    }
    //return background width
    public int getBackgroundWidth(){
        return background.getWidth();

    }
    //return background height
    public int getBackgroundHeight(){
        return background.getHeight();

    }
    public Bitmap scaleImage(Bitmap bitmap){
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
//
        int backgroundScaledWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaledWidth,AppConstants.SCREEN_HEIGHT , false);

    }

}
