package com.heiko.rotatecircleimageviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.heiko.rotatecircleimageview.RotateCircleImageView;

public class MainActivity extends AppCompatActivity {
    private RotateCircleImageView imgRotateCircle;
    private Button btnRotate;
    private Button btnPauseRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgRotateCircle = (RotateCircleImageView) findViewById(R.id.img_rotate_circle);
        btnRotate = (Button) findViewById(R.id.btn_rotate);
        btnPauseRotate = (Button) findViewById(R.id.btn_pause_rotate);

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgRotateCircle.startRotate();
            }
        });

        btnPauseRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgRotateCircle.pauseRotate();
            }
        });

        Glide.with(MainActivity.this)
                .load("http://n.sinaimg.cn/tech/crawl/20171110/N_yZ-fynstfh3220635.jpg")
                .into(imgRotateCircle);
    }
}
