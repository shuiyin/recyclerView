package com.example.lance.recyclerview;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lance on 2017/3/6.
 */

public class TypeThreeViewHolder extends TypeAbstractViewHolder<DataModelThree> {
    public ImageView avatar;
    public TextView name;
    public TextView content;
    public ImageView contentImage;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        name = (TextView) itemView.findViewById(R.id.name);
        content = (TextView) itemView.findViewById(R.id.content);
        contentImage = (ImageView) itemView.findViewById(R.id.contentImage);
        itemView.setBackgroundColor(Color.GRAY);
    }
    @Override
    public void bindHolder(DataModelThree model){
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        contentImage.setBackgroundResource(model.contentColor);
        content.setText(model.content);
    }

}
