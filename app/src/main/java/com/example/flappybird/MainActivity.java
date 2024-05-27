package com.example.flappybird;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        AppConstants.initialization(this.getApplicationContext());



    }
    //xác định start game
    //sự kiện click , sử dụng phương thức log và tham số tag&msg
    public void startGame(View view){
        //Log.i("ImageButton","clicked");
        Intent intent  = new Intent(this,GameActivity.class);
        startActivity(intent);
//        finish();




    }
}