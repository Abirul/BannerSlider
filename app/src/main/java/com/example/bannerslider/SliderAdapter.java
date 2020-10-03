package com.example.bannerslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderViewHolder> {

    Context context;
    List<SliderModel> sliderModelList;

    public SliderAdapter(Context context, List<SliderModel> sliderModelList) {
        this.context = context;
        this.sliderModelList = sliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
//        viewHolder.imageView.setImageResource(sliderModelList.get(position).getImage());
                Glide.with(viewHolder.itemView).load(sliderModelList.get(position).getImage()).into(viewHolder.imageView);
    }

    @Override
    public int getCount() {
        return sliderModelList.size();
    }
}

class SliderViewHolder extends SliderViewAdapter.ViewHolder{
    ImageView imageView;
    View itemView;
    public SliderViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        imageView = itemView.findViewById(R.id.imgView);
    }
}