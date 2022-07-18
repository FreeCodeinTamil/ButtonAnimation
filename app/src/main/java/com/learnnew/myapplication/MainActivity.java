package com.learnnew.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.bt1);
        btn_2 = findViewById(R.id.bt2);

        btn_1.setOnClickListener(v->{

            btn_2.setVisibility(View.VISIBLE);
            btn_2.setEnabled(true);
            taptoAnimate(v);
        });



    }

    public void taptoAnimate(View  view){

        Button button=(Button)findViewById(R.id.bt2);
        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
        MyBounceInterpolator interpolator=new MyBounceInterpolator(0.2,20);
        animation.setInterpolator(interpolator);
        button.startAnimation(animation);

    }
}
