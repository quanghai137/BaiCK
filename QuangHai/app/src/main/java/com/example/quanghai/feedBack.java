package com.example.quanghai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class feedBack extends AppCompatActivity {
    private RecyclerView rcvFeed;
    private feedAdapter mfeedAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        rcvFeed = findViewById(R.id.rcv_feed);
        mfeedAdapter = new feedAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        rcvFeed.setLayoutManager(gridLayoutManager);

        mfeedAdapter.setData(getListFeed());
        rcvFeed.setAdapter(mfeedAdapter);
    }
    private List<feed> getListFeed(){
        List<feed> list = new ArrayList<>();

        list.add(new feed(R.drawable.profile,"Hương Lê",R.drawable.star,"Giao đúng mẫu mình chọn nên rất ưng. Đóng gói cẩn thận. CHúc shop mua may bán đắt."));
        list.add(new feed(R.drawable.profile,"Hương Lê",R.drawable.star,"Giao đúng mẫu mình chọn nên rất ưng. Đóng gói cẩn thận. CHúc shop mua may bán đắt."));
        list.add(new feed(R.drawable.profile,"Hương Lê",R.drawable.star,"Giao đúng mẫu mình chọn nên rất ưng. Đóng gói cẩn thận. CHúc shop mua may bán đắt."));
        list.add(new feed(R.drawable.profile,"Hương Lê",R.drawable.star,"Giao đúng mẫu mình chọn nên rất ưng. Đóng gói cẩn thận. CHúc shop mua may bán đắt."));
        list.add(new feed(R.drawable.profile,"Hương Lê",R.drawable.star,"Giao đúng mẫu mình chọn nên rất ưng. Đóng gói cẩn thận. CHúc shop mua may bán đắt."));
        return list;
    }
}