package com.example.lance.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lance on 2017/3/6.
 */

public class TypeOneViewHolder extends TypeAbstractViewHolder<DataModelOne> {
    public ImageView avatar;
    public TextView name;

    public TypeOneViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        name = (TextView) itemView.findViewById(R.id.name);
        itemView.setBackgroundColor(Color.BLACK);
    }
    @Override
    public void bindHolder(DataModelOne model){
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
    }

}
