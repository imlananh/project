package com.example.flappybird;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
//tạo và ghi đè phương thức onCreat
public class GameActivity extends Activity {

    GameView gameView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        setContentView(gameView);
    }
}
