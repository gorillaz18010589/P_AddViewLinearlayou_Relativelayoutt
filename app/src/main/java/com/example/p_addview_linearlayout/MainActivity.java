package com.example.p_addview_linearlayout;
//1.LineraLayout動態新增佈局
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalAddView();
    }

    private void normalAddView() {
        linContainer = findViewById(R.id.linContainer);

        //新增TextView到佈局
        TextView tvAccount = new TextView(this);
        tvAccount.setText("哈摟");
        linContainer.addView(tvAccount);

        //新增btn到佈局
        Button btn1 = new Button(this);
        btn1.setText("第二頁");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        linContainer.addView(btn1);


        Button btn2 = new Button(this);
        btn2.setText("456");
        linContainer.addView(btn2);

        //刪除btn佈局
        linContainer.removeView(btn2);
    }
}