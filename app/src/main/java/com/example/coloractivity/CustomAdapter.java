package com.example.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    int count;
    String[] colors = new String[]{"red", "blue", "green", "black", "gray", "cyan", "yellow", "magenta", "darkgray", "lightgray"};
    public CustomAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final TextView textView = new TextView(context);
        textView.findViewById(R.id.spinner);
        String colorName = (String) getItem(position);
        textView.setText(colorName.toUpperCase());
        textView.setBackgroundColor(Color.parseColor(colors[position]));
        return textView;
    }
}
