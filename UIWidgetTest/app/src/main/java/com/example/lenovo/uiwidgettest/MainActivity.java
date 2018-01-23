package com.example.lenovo.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:


                /*显示一个进度条
                创建对象，然后设置标题、信息以及可否取消等属性
                然后用show()显示出来
                 */

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();

                /*对话框
                    用Builder创建一个实例，然后为这个对话框设置标题、内容以及可否取消等属性
                    接下来调用setPositiveButton方法为对话框设置确定按钮的点击事件，
                    setNegativeButton设置取消按钮的点击事件，最后用show()显示。

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Somethingf important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.
                    OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                   @Override
                    public void onClick(DialogInterface dialog, int which){
                   }
                });
                dialog.show();
                */

                /*进度条
                int progress = progressBar.getProgress();
                if(progress>=100)
                    progress = 0;
                else
                    progress = progress  + 10;
                progressBar.setProgress(progress);
                */

                /*if(progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }*/

                //点击button切换图片
                //imageView.setImageResource(R.drawable.img_2);

                //点击button，会显示输入框输入的内容
                //String inputText = editText.getText().toString();
                //Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
