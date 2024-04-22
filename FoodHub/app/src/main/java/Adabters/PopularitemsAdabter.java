package Adabters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodhub.PopulareitemsRecyclerOnclick;
import com.example.foodhub.R;

import java.util.ArrayList;

import Models.Features;
import Models.Popularitems;

public class PopularitemsAdabter extends RecyclerView.Adapter<PopularitemsAdabter.PopularitemsHolder> {

    Context context3;
    ArrayList<Popularitems> data3;

    //onclick Recycler Items
    PopulareitemsRecyclerOnclick populareitemsRecyclerOnclick;

    public PopularitemsAdabter(Context context3, ArrayList<Popularitems> data3, PopulareitemsRecyclerOnclick populareitemsRecyclerOnclick) {
        this.context3 = context3;
        this.data3 = data3;
        this.populareitemsRecyclerOnclick = populareitemsRecyclerOnclick;
    }

    @NonNull
    @Override
    public PopularitemsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View PopularITEM = inflater.inflate(R.layout.popularitems,parent,false);
        return new PopularitemsAdabter.PopularitemsHolder(PopularITEM , populareitemsRecyclerOnclick);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularitemsHolder holder, int position) {
        holder.PopularitemImage.setImageResource(data3.get(position).getPopularitemsImage());
        holder.PopularitemDecs.setText(data3.get(position).getPopularitemsDesc());
        holder.PopularitemTxt.setText(data3.get(position).getPopularitemesName());

    }

    @Override
    public int getItemCount() {return data3.size();}

    public class PopularitemsHolder extends RecyclerView.ViewHolder {

        public TextView PopularitemTxt;
        public TextView PopularitemDecs;
        public ImageView PopularitemImage;

        public PopularitemsHolder(@NonNull View itemView , PopulareitemsRecyclerOnclick populareitemsRecyclerOnclick) {
            super(itemView);

            this.PopularitemTxt = itemView.findViewById(R.id.Popularitemstxt);
            this.PopularitemDecs = itemView.findViewById(R.id.Popularitemsdesc);
            this.PopularitemImage = itemView.findViewById(R.id.Popularitemimage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (populareitemsRecyclerOnclick != null){
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION){
                            populareitemsRecyclerOnclick.PopularitemonItemClick(pos);
                        }
                    }
                }
            });

        }
    }
}
