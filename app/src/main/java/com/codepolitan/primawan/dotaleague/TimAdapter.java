package com.codepolitan.primawan.dotaleague;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TimAdapter extends BaseAdapter {

    Context context;
    ArrayList<Tim> arrayList;

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public TimAdapter(Context context, ArrayList<Tim> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = new ViewHolder();

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.tim_item, null);
        }

        holder.namaTim = (TextView) view.findViewById(R.id.nama);
        holder.logo = (ImageView) view.findViewById(R.id.logo);

        Tim tim = arrayList.get(position);

        holder.namaTim.setText(tim.getNama());
        holder.logo.setImageResource(tim.getIdLogo());

        return view;
    }
    static class ViewHolder {
        TextView namaTim;
        ImageView logo;
    }
}


