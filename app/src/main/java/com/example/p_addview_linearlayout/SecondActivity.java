package com.example.p_addview_linearlayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.YELLOW);

        // 将Button1 加入到RelativeLayout 中
        Button btn1 = new Button(this);
        btn1.setText("確定");//设置显示的字符
        relativeLayout.addView(btn1);

        // 将Button2 加入到RelativeLayout 中
        Button btn2 = new Button(this);
        btn2.setText("取消");//设置显示的字符
        relativeLayout.addView(btn2);

        //取得父容器佈局
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        //將btn1按鈕設置在父容器的右上
        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        lp.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        btn1.setLayoutParams(lp);  // 设置按钮的布局属性

        ////將btn1按鈕設置在父容器的左下
        lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT,RelativeLayout.TRUE);
        lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        btn2.setLayoutParams(lp);   //设置按钮的布局属性
        setContentView(relativeLayout);
    }
}