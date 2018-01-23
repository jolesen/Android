package com.example.lenovo.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BasicActivity {

    //在res中创建了menu菜单文件后，重写该方法创建菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    //实现菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


    //处理返回结果，要重写该函数
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

    //主布局，放一个button在中间，并提供点击事件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity",this.toString());

        //加载布局
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){



                //10
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);


                /*9 standard模式
                Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);
                */

                /*8 返回数据
                Intent uitent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
                */

                /*7 传递数据给SecondActivity
                String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
                */


                /* 6  弹出拨号界面 Intent.ACTION_DIAL是android系统的内置动作
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10010"));
                startActivity(intent);
                */

                /* 5    选择调用系统自带浏览器或者打开button3
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //用parse将字符串解析成一个Uri对象
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
                */

                /* 4    Intent 隐式地启动第二个活动
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
                */

                /* 3  inten显式启动第二个活动
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                */

                //1
                //Toast.makeText(FirstActivity.this, "You cliked Button1",
                //        Toast.LENGTH_SHORT).show();

                //2
                //修改为点击button销毁活动
                //finish();
            }
        });


    }
}
