package com.example.postest5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Favorites extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbIds = {
        R.drawable.wendyy,R.drawable.raon,
        R.drawable.milet,R.drawable.reona
    };

    public Favorites(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        CircleImageView imageView = new CircleImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));
        return imageView;
    }
}
