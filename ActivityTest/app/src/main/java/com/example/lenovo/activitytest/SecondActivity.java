package com.example.lenovo.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BasicActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //8 返回数据
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                /*9
                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
                startActivity(intent);
                */
                /*8
                Intent intent = new Intent();//构造这个intent为了传递数据
                intent.putExtra("data_return","Hello FirstActivity ");
                setResult(RESULT_OK，intent);//向上一个活动回传数据，第一个参数为向上一个活动返回处理结果
                finish();//销毁当前活动
                */
            }
        });



        /*7 传递数据
        Intent intent = getIntent(); //获得启动SecondActivity的Intent
        String data = intent.getStringExtra("extra_data");//通过键extra_data得到data
        Log.d("SecondActivity",data);//在logcat中打印信息
        */
    }
}
