package com.example.cricbuzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customadptr extends BaseAdapter {

    listview_activity listview_activity;
    String[] title;
    String[] subtitle;
    int[] imagearr;

    public customadptr(com.example.cricbuzz.listview_activity listview_activity, String[] title, String[] subtitle, int[] imagearr) {
        this.listview_activity = listview_activity;
        this.title = title;
        this.subtitle = subtitle;
        this.imagearr = imagearr;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(listview_activity).inflate(R.layout.listitem_activity,viewGroup,false);
        ImageView imageView=view.findViewById(R.id.imageview);
        TextView txt1=view.findViewById(R.id.txt1);
        TextView txt2=view.findViewById(R.id.txt2);

        imageView.setImageResource(imagearr[i]);
        txt1.setText(title[i]);
        txt2.setText(subtitle[i]);
        return view;
    }
}
