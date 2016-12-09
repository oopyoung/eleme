package com.okd.eleme;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vin on 08/12/2016.
 */

public class LeftAdapter extends BaseAdapter{

    private Context mContext;

    private List<Model> mData;

    private LayoutInflater mInflater;

    private int mSelectedPosition = 0;

    public LeftAdapter(@NonNull Context mContext, @NonNull List<Model> mData) {
        this.mContext = mContext;
        this.mData = mData;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if (null == view) {
            view = mInflater.inflate(R.layout.left_item,null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }


        Model model = mData.get(i);
        holder.name.setText(model.getcName());
        holder.num.setVisibility(model.getBadge() == 0 ? View.GONE : View.VISIBLE);
        holder.num.setText(String.valueOf(model.getBadge()));
        view.setBackgroundResource(mSelectedPosition == i ? R.drawable.left_item_selected : R.drawable.left_item_default);

        return view;
    }

    public void updateSelected(int position){
        this.mSelectedPosition = position;
        notifyDataSetChanged();
    }

    public void update(int position,Model model){
        mData.set(position,model);
        notifyDataSetChanged();
    }

    class ViewHolder {

        TextView name;
        TextView num;

        public ViewHolder(View view) {
            name = (TextView) view.findViewById(R.id.name);
            num = (TextView) view.findViewById(R.id.num);
        }
    }
}
