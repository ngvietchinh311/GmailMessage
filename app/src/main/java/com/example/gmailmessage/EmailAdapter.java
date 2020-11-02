package com.example.gmailmessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.TreeMap;

public class EmailAdapter extends BaseAdapter {
    List<EmailPacketModel> list;
    Context context;

    public EmailAdapter(Context context, List<EmailPacketModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_email_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.ic_textview = convertView.findViewById(R.id.ic_textview);
            viewHolder.label = convertView.findViewById(R.id.label);
            viewHolder.sub_string = convertView.findViewById(R.id.sub_string);
            viewHolder.time = convertView.findViewById(R.id.time);
            viewHolder.label_important = convertView.findViewById(R.id.label_important);
            viewHolder.star_border = convertView.findViewById(R.id.star_border);
            convertView.setTag(viewHolder);
        }else viewHolder = (ViewHolder) convertView.getTag();

        EmailPacketModel sample = list.get(position);

        String tmp = sample.string.charAt(0) + "";
        viewHolder.ic_textview.setText(tmp.toUpperCase());
//        viewHolder.ic_textview.setBackgroundColor(sample.getColor());
        viewHolder.label.setText(sample.getString());
        viewHolder.sub_string.setText(sample.getSubString());
        viewHolder.time.setText(sample.getTime());

        return convertView;
    }

    private class ViewHolder{
        TextView ic_textview;
        TextView label;
        TextView sub_string;
        TextView time;
        ImageView label_important;
        ImageView star_border;
    }
}
