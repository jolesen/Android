package com.example.lenovo.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        //调用活动管理器得结束全部活动得方法，退出全部活动
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v){
              ActivityCollector.finishAll();
          }
        });
    }
}
