package com.example.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items; // data source

    public MyCustomAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.length;  // returns the length of the items in the data source
    }

    @Override
    public Object getItem(int position) {
        return items[position];  // returns the data item at the given position
    }

    @Override
    public long getItemId(int position) {
        return position;  // returns a unique identifier at the given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null)
        {
            // views that go off screen can be recycled as new ones appear
            // convertView(reduces minimum overhead) is a recycled view that you can use to improve performance of your list
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.my_list_item, parent, false);

        }
        else {
            // reusing the view
            holder = (ViewHolder) convertView.getTag();
        }

        return convertView; // displays data at a position in the dataset
    }

    static class ViewHolder{
        // it holds references to views within an item layout
        TextView textView;
    }
}
