package com.example.flappybird;

public class BackgroundImage {
    private int backgroundImageX, backgroundImageY , backgroundImageVelocity;

    public BackgroundImage(){
        backgroundImageX = 0;
        backgroundImageY = 0;
        backgroundImageVelocity = 3;
    }
    //getter method for getting the X - coordinate
    public int getX(){
        return backgroundImageX;

    }
    //getter method for getting the Y-coordinate
    public int getY(){
        return backgroundImageY;

    }
    //Setter method for setting the X - coordinate
    public void setX(int backgroundImageX){
        this.backgroundImageX = backgroundImageX;

    }
    //setter method forr setting the Y  - coordinate
    public void setY(int backgroundImageY){
        this.backgroundImageY = backgroundImageY;
    }

    //getter method for getting the velocity
    public int getVelocity(){
        return backgroundImageVelocity;
    }

}
