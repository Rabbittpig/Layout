package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_color = findViewById(R.id.tv_color);
        String text = "请设置紧急出库归还日期";
        SpannableStringBuilder style=new SpannableStringBuilder(text);
        style.setSpan(new ForegroundColorSpan(Color.RED),3,7,Spannable.SPAN_EXCLUSIVE_INCLUSIVE);     //设置指定位置文字的颜色
        tv_color.setText(style);
    }
}