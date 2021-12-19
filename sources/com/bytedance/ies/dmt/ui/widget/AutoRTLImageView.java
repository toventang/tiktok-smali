package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class AutoRTLImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(IHostUser.MESSAGE_NICKNAME_DUPLICATE);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public AutoRTLImageView(Context context) {
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

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AutoRTLImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        int i2 = Build.VERSION.SDK_INT;
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
