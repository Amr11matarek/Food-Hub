package Adabters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodhub.R;

import java.util.ArrayList;

import Models.Catagory;

public class CatagoryAdabter extends RecyclerView.Adapter<CatagoryAdabter.CatagoryHolder> {

    Context context;
    ArrayList<Catagory> data;


    public CatagoryAdabter(Context context, ArrayList<Catagory> data ) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public CatagoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View Catagoryitems = inflater.inflate(R.layout.catagory , parent ,false);
        return new CatagoryAdabter.CatagoryHolder (Catagoryitems);


    }

    @Override
    public void onBindViewHolder(@NonNull CatagoryHolder holder, int position) {

        holder.catagoryName.setText(data.get(position).getCatagoryName());
        holder.catagoryImage.setImageResource(data.get(position).getCatagoryImage());

    }

    @Override
    public int getItemCount() {return data.size();}

    public static class CatagoryHolder extends RecyclerView.ViewHolder{
        public TextView catagoryName;
        public ImageView catagoryImage;

        public CatagoryHolder(@NonNull View itemView ) {
            super(itemView);

            this.catagoryName = itemView.findViewById(R.id.catagorytxt);
            this.catagoryImage = itemView.findViewById(R.id.catagoryimage);

        }
    }
}
