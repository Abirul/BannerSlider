package com.example.bannerslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    List<SliderModel> sliderModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView =  findViewById(R.id.imageSlider);
        sliderModelList = new ArrayList<>();

        sliderModelList.add(new SliderModel("https://i.ibb.co/W22bV9c/2.jpg"));
        sliderModelList.add(new SliderModel("https://i.ibb.co/Sxy3Wsg/1.jpg"));
        sliderModelList.add(new SliderModel("https://i.ibb.co/bB2zyHQ/3.jpg"));
        sliderModelList.add(new SliderModel("https://i.ibb.co/8KfPW5z/4.jpg"));
        sliderModelList.add(new SliderModel("https://i.ibb.co/wJHP9yH/5.jpg"));

        sliderView.setSliderAdapter(new SliderAdapter(this,sliderModelList));
    }
}