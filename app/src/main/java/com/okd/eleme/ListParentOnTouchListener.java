package com.okd.eleme;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Vin on 08/12/2016.
 */

public class ListParentOnTouchListener implements View.OnTouchListener {

    public static boolean SCROLL_ENABLE = true; //是否允许滚动

    TouchDelegate mDelegate;

    public ListParentOnTouchListener(TouchDelegate mDelegate) {
        this.mDelegate = mDelegate;
    }

    float x1 = 0;
    float x2 = 0;
    float y1 = 0;
    float y2 = 0;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            x1 = motionEvent.getX();
            y1 = motionEvent.getY();
        }
        if(motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
            x2 = motionEvent.getX();
            y2 = motionEvent.getY();
            if(y1 - y2 > 50) {
                mDelegate.onTouchDone(view,TouchDelegate.TouchOrientation.DOWN_2_UP,y1 - y2);
//                Toast.makeText(MainActivity.this, "向上滑", Toast.LENGTH_SHORT).show();
            } else if(y2 - y1 > 50) {
                mDelegate.onTouchDone(view,TouchDelegate.TouchOrientation.UP_2_DOWN,y2 - y1);
//                Toast.makeText(MainActivity.this, "向下滑", Toast.LENGTH_SHORT).show();
            } else if(x1 - x2 > 50) {
//                Toast.makeText(MainActivity.this, "向左滑", Toast.LENGTH_SHORT).show();
            } else if(x2 - x1 > 50) {
//                Toast.makeText(MainActivity.this, "向右滑", Toast.LENGTH_SHORT).show();
            }
        }
        return !SCROLL_ENABLE;
    }

}
