package com.example.ktl2_ct2_phamthikimphuong;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.ktl2_ct2_phamthikimphuong.CountryDetailActivity;
import com.example.ktl2_ct2_phamthikimphuong.Models.Country;
import com.example.ktl2_ct2_phamthikimphuong.databinding.LayoutItemCountryListviewBinding;

import java.util.ArrayList;

public class CustomAdapterCountryListView extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList<Country> list = new ArrayList<>();
    public CustomAdapterCountryListView(@NonNull Context context, int resource, @NonNull ArrayList<Country> list) {
        super(context, resource, list);
        this.context = context;
        this.layoutItem = resource;
        this.list = list;
    }

    private LayoutItemCountryListviewBinding customCountryItemListviewBinding;
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Country item = list.get(position);
        if(convertView==null) {
            // Inflate layout và gán giá trị cho customCountryItemListviewBinding
            LayoutInflater inflater = LayoutInflater.from(context);
            customCountryItemListviewBinding = LayoutItemCountryListviewBinding.inflate(inflater, parent, false);
            convertView = customCountryItemListviewBinding.getRoot();
            convertView.setTag(customCountryItemListviewBinding); // Gán tag cho convertView để lưu trữ customCountryItemListviewBinding
        } else {
            // Lấy customCountryItemListviewBinding từ convertView đã lưu trữ trước đó
            customCountryItemListviewBinding = (LayoutItemCountryListviewBinding) convertView.getTag();
        }

        // Set các giá trị cho các view trong customCountryItemListviewBinding
        customCountryItemListviewBinding.textViewName.setText(item.getCommonName());
        customCountryItemListviewBinding.textViewRegion.setText("Continent: " + item.getContinent());
        Glide.with(context).load(item.getImgUrl()).into(customCountryItemListviewBinding.imageViewItem);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CountryDetailActivity.class);
                intent.putExtra("country", item);
                context.startActivity(intent);
            }
        });
        return convertView;
    }

}
