package com.example.xkcdreader.view.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xkcdreader.R;
import com.example.xkcdreader.model.Comic;

import com.example.xkcdreader.view.ComicActivity;

public class AdapterMainLayout extends RecyclerView.Adapter<com.example.xkcdreader.view.adapter.AdapterMainLayout.ViewHolder> {

    // Attributes
    private ArrayList<Comic> comics;
    private List<String> firstLineDataSet;
    private List<String> secondLineDataSet;


    // Inner Class

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View view) {
            super(view);
            layout = view;
            txtHeader = view.findViewById(R.id.firstLine);
            txtFooter = view.findViewById(R.id.secondLine);
        }
    }


    // Constructor

    public AdapterMainLayout(ArrayList<Comic> comicsList) {
        this.comics = comicsList;
        this.firstLineDataSet = new ArrayList<>();
        this.secondLineDataSet = new ArrayList<>();
    }


    // Misc Methods

    public void add(String firstLine, String secondLine) {
        firstLineDataSet.add(firstLine);
        secondLineDataSet.add(secondLine);
        notifyItemInserted(firstLineDataSet.size()-1);
    }

    public void remove(int position) {
        firstLineDataSet.remove(position);
        secondLineDataSet.remove(position);
        notifyItemRemoved(position);
    }

    //create new views (invoked by the layout manager)
    @Override
    public com.example.xkcdreader.view.adapter.AdapterMainLayout.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from( parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final String firstLine = firstLineDataSet.get(position);
        final String secondLine = secondLineDataSet.get(position);
        holder.txtHeader.setText(firstLine);
        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Context content = v.getContext();
                Intent intent = new Intent(content, ComicActivity.class);
                intent.putExtra("URL", comics.get(position).getImg());
                content.startActivity(intent);
            }
        });
        holder.txtFooter.setText(secondLine);
    }

    //return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return firstLineDataSet.size();
    }

}