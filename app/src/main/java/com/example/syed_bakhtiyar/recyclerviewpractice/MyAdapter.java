package com.example.syed_bakhtiyar.recyclerviewpractice;

import android.content.Context;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ItemData[] itemsData;

    private Context cont;

    public MyAdapter(ItemData[] itemsData, Context cont) {


        this.itemsData = itemsData;

        this.cont = cont;


    }
    
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                               .inflate(R.layout.item_layout, null);

        // create ViewHolder



        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        
    	// - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData
    	
    	viewHolder.txtViewTitle.setText(itemsData[position].getTitle());
    	viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageUrl());

        viewHolder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(cont, ""+position, Toast.LENGTH_SHORT).show();

            }
        });



    }
    
    // inner class to hold a reference to each item of RecyclerView 
    public static class ViewHolder extends RecyclerView.ViewHolder {
       
    	public TextView txtViewTitle;
        public ImageView imgViewIcon;

        public Button btn;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);

            btn = (Button) itemLayoutView.findViewById(R.id.btn);

        }
    }

   

   

    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }
}