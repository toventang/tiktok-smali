package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;

public class AVAutoRTLImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(98848);
    }

    public AVAutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(true);
        }
    }

    public AVAutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AVAutoRTLImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        int i3 = Build.VERSION.SDK_INT;
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        Drawable drawable2 = Build.VERSION.SDK_INT >= 23 ? getForeground() : null;
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        if (background != null) {
            background.setAutoMirrored(true);
        }
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
        }
    }
}
