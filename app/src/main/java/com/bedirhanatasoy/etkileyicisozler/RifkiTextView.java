package com.bedirhanatasoy.etkileyicisozler;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Bedirhan Atasoy on 23/06/2016.
 */
public class RifkiTextView extends TextView {
    public RifkiTextView(Context context) {
        super(context);
        init();
    }

    public RifkiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RifkiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),"fonts/hanged.ttf");
        setTypeface(typeface);
    }
}