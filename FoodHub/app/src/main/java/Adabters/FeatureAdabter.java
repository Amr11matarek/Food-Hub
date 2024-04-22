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
import com.example.foodhub.FeatureRecyclerOnclick;

import java.util.ArrayList;

import Models.Features;

public class FeatureAdabter extends RecyclerView.Adapter<FeatureAdabter.FeatureHolder>{

    Context context2;
    ArrayList<Features> data2;

    //onClick Recyclerview Items
    FeatureRecyclerOnclick FeatureRecyclerOnclick;

    public FeatureAdabter(Context context2, ArrayList<Features> data2, FeatureRecyclerOnclick recyclerOnclick) {
        this.context2 = context2;
        this.data2 = data2;
        this.FeatureRecyclerOnclick = recyclerOnclick;
    }

    @NonNull
    @Override
    public FeatureHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View Featureitem = inflater.inflate(R.layout.features , parent ,false);
        return new FeatureAdabter.FeatureHolder(Featureitem , FeatureRecyclerOnclick);
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureHolder holder, int position) {
        holder.featureimage.setImageResource(data2.get(position).getFeaturesImage());
        holder.featuredelivary.setText(data2.get(position).getFeaturesDelivary());
        holder.featureName.setText(data2.get(position).getFeaturesName());
        holder.featuretime.setText(data2.get(position).getFeaturesTime());
    }

    @Override
    public int getItemCount() {return data2.size();}

    public class FeatureHolder extends RecyclerView.ViewHolder {

        public TextView featureName;
        public TextView featuredelivary;
        public TextView featuretime;
        public ImageView featureimage;


        public FeatureHolder(@NonNull View itemView , FeatureRecyclerOnclick recyclerOnclick) {
            super(itemView);

            this.featureName = itemView.findViewById(R.id.featuretxt);
            this.featuredelivary = itemView.findViewById(R.id.featuredelivary);
            this.featuretime = itemView.findViewById(R.id.featuretime);
            this.featureimage = itemView.findViewById(R.id.featureimage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recyclerOnclick !=null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            recyclerOnclick.onItemClick(pos);
                        }

                    }

                }
            });
        }

    }
}

