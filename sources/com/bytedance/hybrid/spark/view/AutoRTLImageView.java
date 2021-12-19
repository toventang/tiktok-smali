package com.bytedance.hybrid.spark.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;

public final class AutoRTLImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(18134);
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            drawable.setAutoMirrored(true);
        }
    }

    private /* synthetic */ AutoRTLImageView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoRTLImageView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.c(context, "");
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
