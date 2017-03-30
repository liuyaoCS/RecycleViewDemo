package com.gz01.baochen.recycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.gz01.baochen.recycleviewdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baochen on 2016/1/13.
 */
public class StaggeredAdapter extends RecyclerViewAdapter{
    private List<Integer> mHeight;



    public StaggeredAdapter(Context context,List<String> datas) {
        super(context,datas);
        mHeight=new ArrayList<Integer>();

        for (int i=0;i<mData.size();i++){
            mHeight.add((int) (100+Math.random()*300));
        }

    }


    /**
     * 绑定数据ViewHolder里面的数据
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       ViewGroup.LayoutParams lp= holder.itemView.getLayoutParams();
        lp.height=mHeight.get(position);
        holder.itemView.setLayoutParams(lp);

        holder.item_recyclerview.setText(mData.get(position));
        setUpItemEvent(holder);

    }


}

