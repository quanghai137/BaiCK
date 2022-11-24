package com.example.quanghai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class feedAdapter extends RecyclerView.Adapter<feedAdapter.ViewHolder> {

    private Context mContext;
    private List<feed> mListfeed;

    public feedAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<feed> list){
        this.mListfeed = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_back, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        feed feed  = mListfeed.get(position);
        if (feed == null){
            return;
        }

        holder.img.setImageResource(feed.getHinh());
        holder.name.setText(feed.getTen());
        holder.star1.setImageResource(feed.getStar());
        holder.star2.setImageResource(feed.getStar());
        holder.star3.setImageResource(feed.getStar());
        holder.star4.setImageResource(feed.getStar());
        holder.star5.setImageResource(feed.getStar());
        holder.mota.setText(feed.getMota());

    }

    @Override
    public int getItemCount() {
        if (mListfeed != null ){
            return mListfeed.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img,star1,star2,star3,star4,star5;
        private TextView name,mota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            star1 = itemView.findViewById(R.id.star1);
            star2 = itemView.findViewById(R.id.star2);
            star3 = itemView.findViewById(R.id.star3);
            star4 = itemView.findViewById(R.id.star4);
            star5 = itemView.findViewById(R.id.star5);
            name = itemView.findViewById(R.id.name);
            mota = itemView.findViewById(R.id.mota);



        }
    }
}
