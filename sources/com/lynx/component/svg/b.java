package com.lynx.component.svg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public final class b extends AppCompatImageView {
    static {
        Covode.recordClassIndex(34701);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final void setImageDrawable(Drawable drawable) {
        setLayerType(1, null);
        super.setImageDrawable(drawable);
    }
}
