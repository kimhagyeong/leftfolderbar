package com.example.testtesttest;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GridImageAdapter extends RecyclerView.Adapter<GridImageAdapter.ViewHolder> {

    private ArrayList<Bitmap> mData = null ;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView) ;

            // 뷰 객체에 대한 참조. (hold strong reference)
            imageView = itemView.findViewById(R.id.chipImageView) ;
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    GridImageAdapter(ArrayList<Bitmap> list) {
        mData = list ;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public GridImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recyclerview_item_gridimage, parent, false) ;
        GridImageAdapter.ViewHolder vh = new GridImageAdapter.ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(GridImageAdapter.ViewHolder holder, int position) {
        Bitmap image = mData.get(position) ;
        holder.imageView.setImageBitmap(image);
        holder.imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}