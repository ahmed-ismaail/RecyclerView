package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder> {

    private ArrayList<String> countriesNamesList;
    private Context context;

    public CountryListAdapter(ArrayList<String> countriesNamesList, Context context) {
        this.countriesNamesList = countriesNamesList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater => Instantiates a layout XML file into its corresponding View objects
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_tem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, final int position) {
        holder.countryNameTextView.setText(countriesNamesList.get(position));

        holder.listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, countriesNamesList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return countriesNamesList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {
        TextView countryNameTextView;
        ConstraintLayout listItem;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            listItem = itemView.findViewById(R.id.list_item);
            countryNameTextView = itemView.findViewById(R.id.countryName_textview);
        }
    }
}
