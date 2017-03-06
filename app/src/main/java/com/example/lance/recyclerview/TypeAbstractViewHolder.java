package com.example.lance.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lance on 2017/3/6.
 */

public abstract class TypeAbstractViewHolder<T> extends RecyclerView.ViewHolder{

    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindHolder(T model);
}
