package com.bytedance.android.live.design.widget.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class LiveAutoRtlImageView extends AppCompatImageView {
    static {
        Covode.recordClassIndex(4866);
    }

    private void a() {
        b();
        c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private void b() {
        Drawable background = getBackground();
        if (background != null && !a.a(background)) {
            background.mutate();
            a.a(background, true);
        }
    }

    private void c() {
        Drawable drawable = getDrawable();
        if (drawable != null && !a.a(drawable)) {
            drawable.mutate();
            a.a(drawable, true);
        }
    }

    public LiveAutoRtlImageView(Context context) {
        super(context);
        a();
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        c();
    }

    public LiveAutoRtlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
