package com.nahuo.test.library;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by JorsonWong on 2015/7/15.
 */
public class MyCustomView extends ImageView {

    private static final String TAG = "MyCustomView";

    public MyCustomView(Context context) {
        super(context);
    }

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
