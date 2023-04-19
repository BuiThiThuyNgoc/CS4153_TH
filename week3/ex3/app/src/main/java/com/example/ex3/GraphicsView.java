package com.example.ex3;

import android.content.Context;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap [16]; //16 frames
    int i=0;
    public GraphicsView(Context context){
        super(context);

        frames [0] = BitmapFactory.decodeResource (getResources () ,R.drawable.images_1);
        frames [1] = BitmapFactory.decodeResource (getResources () , R.drawable.images_2);
        frames [2] = BitmapFactory.decodeResource (getResources () , R.drawable.images_3);
        frames [3] = BitmapFactory. decodeResource (getResources () , R.drawable.images_4);
        frames [4] = BitmapFactory.decodeResource (getResources () , R.drawable.images_5);

        frames [5] = BitmapFactory.decodeResource (getResources () ,R.drawable.images_6);
        frames [6] = BitmapFactory.decodeResource (getResources () , R.drawable.images_7);
        frames [7] = BitmapFactory.decodeResource (getResources () , R.drawable.images_8);
        frames [8] = BitmapFactory. decodeResource (getResources () , R.drawable.images_9);
        frames [9] = BitmapFactory.decodeResource (getResources () , R.drawable.images_10);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 16){
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        }
        else {
            i =0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}
