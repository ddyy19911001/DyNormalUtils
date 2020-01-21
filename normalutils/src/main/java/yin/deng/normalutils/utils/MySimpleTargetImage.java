package yin.deng.normalutils.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

public class MySimpleTargetImage extends SimpleTarget<Drawable> {
    public Context context;
    public ImageView imageView;

    public MySimpleTargetImage(Context context, ImageView imageView) {
        this.context = context;
        this.imageView = imageView;
    }

    public MySimpleTargetImage(int width, int height, Context context, ImageView imageView) {
        super(width, height);
        this.context = context;
        this.imageView = imageView;
    }


    @Override
    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
        imageView.setImageDrawable(resource);
    }

}
