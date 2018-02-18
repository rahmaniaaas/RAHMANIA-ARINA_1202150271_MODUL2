package com.rahmaniaaas.tegalanresto;

import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.LinkedList;

public class daftarMenuAdapter extends
        RecyclerView.Adapter<daftarMenuAdapter.MenuViewHolder>{

    private final LinkedList<String> mFoodList;
    private final LinkedList<Integer> mPriceList;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    public daftarMenuAdapter(Context context, LinkedList<String> foodList, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mFoodList = foodList;
        this.mPriceList = priceList;
        this.mPhotoList = photoList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_daftar_menu_adapter, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentFood = mFoodList.get(position);
        Integer mCurrentPrice = mPriceList.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.foodItemView.setText(mCurrentFood);
        holder.priceItemView.setText("Rp."+mCurrentPrice.toString());
        holder.photoItemView.setImageResource(mCurrentPhoto);
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView foodItemView;
        public final TextView priceItemView;
        public final ImageView photoItemView;

        final daftarMenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, daftarMenuAdapter adapter) {
            super(itemView);
            foodItemView = (TextView)itemView.findViewById(R.id.tv_food);
            priceItemView = (TextView)itemView.findViewById(R.id.tv_price);
            photoItemView = (ImageView)itemView.findViewById(R.id.iv_photo);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String food = mFoodList.get(mPosition);
                    Integer price = mPriceList.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(), com.rahmaniaaas.tegalanresto.detailMenu.class);
                    intent.putExtra("makanan",food);
                    intent.putExtra("harga",price);
                    intent.putExtra("foto",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }


        @Override
        public void onClick(View v) {

        }
    }
}