package com.example.ex4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.media.MediaPlayer;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap [16]; //16 frames
    int i=0;
    long last_tick = 0;
    long period = 20;
    Context ctext;
    MediaPlayer mPlayer;
    public GraphicsView(Context context){
        super(context);
        ctext = context;

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

        mPlayer = MediaPlayer.create(context, R.raw.song);
        //mPlayer.setLooping(true);
        mPlayer.start();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 16){
            long time = (System.currentTimeMillis() - last_tick);
            if(time <= period)
            {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 40, 40, new Paint());
                i++;
                postInvalidate();
            }
            else
            {
                canvas.drawBitmap(frames[i], 40, 40, new Paint());
                postInvalidate();
            }
        }
        else {
            i =0;
            postInvalidate();
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mPlayer.stop();
        mPlayer.release();
    }
}
