package com.example.user.recycler_task;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 21-10-2017.
 */
public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {

    private ArrayList<String> infos;
    private Context context;

    public InfoAdapter(Context context, ArrayList<String> infos) {
        this.context = context;
        this.infos = infos;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View view = inflater.inflate(R.layout.cardview_row, parent, false);


        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {

        holder.nameTextView.setText(infos.get(position));
        //holder.itemView.setBackgroundColor(position % 2 == 0 ? ContextCompat.getColor(context, R.color.colorPrimaryDark) : ContextCompat.getColor(context, R.color.green));

    }

    @Override
    public int getItemCount() {
        return infos.size();
    }


    public static class InfoViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;

        public InfoViewHolder(View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.textView2);
        }
    }

}

