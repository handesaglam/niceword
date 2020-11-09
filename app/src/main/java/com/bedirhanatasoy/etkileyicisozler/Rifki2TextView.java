package com.bedirhanatasoy.etkileyicisozler;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Bedirhan Atasoy on 23/06/2016.
 */
public class Rifki2TextView extends TextView {
    public Rifki2TextView(Context context) {
        super(context);
        init();
    }

    public Rifki2TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Rifki2TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"fonts/font2.otf");
        setTypeface(typeface);
    }
}