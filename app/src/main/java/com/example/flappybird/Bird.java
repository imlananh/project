package com.example.flappybird;

public class Bird {
    private int birdX, birdY, currentFrame , velocity;
    public static int maxFrame;

    public Bird(){
        birdX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getBirdWidth()/2;
        birdY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getBirdHeight()/2;
        currentFrame = 0;
        maxFrame = 3;
        velocity = 0;




    }

    //getter method for volocity
    public int getVelocity(){
        return velocity;

    }
    //setter method for velocity
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    //getter method for current frame

    public int getCurrentFrame(){
        return currentFrame;

    }
    //setter method for curent frame
    public void setCurrentFrame(int currentFrame){
        this.currentFrame = currentFrame;

    }
    //getter method for getting X -coordinate of the bird
    public int getX(){
        return birdX;

    }
    //getter method for getting Y - coordinate of the bird
    public int getY(){
        return birdY;
    }
    // setter method for setting the X - coordinate
    public void setX(int birdX){

        this.birdX = birdX;
    }
//    public void setỴX(int birdX){
//        this.birdX = birdY;
//    }

    //setter method for setting the y - coordinate

    public void setY(int birdY){

        this.birdY = birdY;
    }





}
