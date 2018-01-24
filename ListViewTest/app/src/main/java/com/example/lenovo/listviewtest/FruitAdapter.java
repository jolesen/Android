package com.example.lenovo.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Lenovo on 2018/1/24.
 */


public class FruitAdapter extends ArrayAdapter<Fruit>{
    private int resourceId;

    //重写了父类的构造函数，将上下文、ListView子项布局id和数据传递进来
    public FruitAdapter(Context context, int textViewResourceId,List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){

        //获取当前项的Fruit实例
        Fruit fruit = getItem(position);

        //提高性能，利用convetView是否缓存
        View view;
        //利用内部类ViewHolder对控件的实例进行缓存，当convetView为null，创建一个ViewHolder对象，
        //实例存放在ViewHolder中，调用setTat()方法，将ViewHolder存储在View中
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitNmae = (TextView) view .findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将ViewHolder存储在View中
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view .getTag();//重新获取ViewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitNmae.setText(fruit.getName());
/*

       //使用LayoutInflater为这个子项加载我们传入的布局
        //View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);


        //分别获取ImageView和TextView的实例
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        //调用set方法来显示图片和文字
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        //将布局返回，完成自定义适配器
 */
        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitNmae;
    }
}
