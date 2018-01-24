package com.example.lenovo.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
    private String[] data = {"ASgdi","ASBBBBBgdi","ASgdCCCCCi","ASgDDDDDDdi","ASgdiEEEEE",
            "AFFFFSgdi","ASGGGGGgdi"};
    */

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();//初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);




        /*
        //数组中的数据无法传递给ListView,需要借助适配器
        //在构造函数中依次传递当前上下文、子布局、要适配的数据
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        //找到ListView
        */
        ListView listView = (ListView) findViewById(R.id.list_view);
        //将配置好的适配器对象传递进去 调用对象的setAdapter方法
        listView.setAdapter(adapter);

        ListView.setOnItemOnClickListener(new AdapterView.OnItemClickListen()){
            @Override
                    public void onItemClick(AdapterView<?>parent,View view,int position,long id){
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }

        }





    }


    private void initFruits(){
        for (int i=0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.img1);
            fruitList.add(apple);
        }
    }
}
