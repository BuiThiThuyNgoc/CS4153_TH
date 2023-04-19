package com.example.ex2;

import android.content.Context;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.MotionEvent;

public class GraphicsView extends View {
    int x = 0;
    int y= 0;

    int d = 100;
    int r = 50;

    public GraphicsView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //Drawing commands go here
        if (x!=0 && y!=0 ){
            int right = x + d;
            int bottom = y + r;
            Rect r = new Rect(x,y,right,bottom);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLUE);
            canvas.drawRect(r, paint);

        }

        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //TODO Auto-generated method stub
        x = (int) event.getX();
        y = (int) event.getY();
        return super.onTouchEvent(event);
    }
}
