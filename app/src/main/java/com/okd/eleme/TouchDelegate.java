package com.okd.eleme;

import android.view.View;

/**
 * Created by Vin on 08/12/2016.
 */

public abstract class TouchDelegate {

    public enum TouchOrientation{
        UP_2_DOWN,
        DOWN_2_UP
    }

    abstract void onTouchDone(View view, TouchOrientation orientation, float offset);
}
