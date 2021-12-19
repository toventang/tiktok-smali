package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class TuxPlayerStateView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f44989a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f44990b;

    static {
        Covode.recordClassIndex(27458);
    }

    public final void a() {
        setImageDrawable(this.f44989a);
    }

    public final void b() {
        setImageDrawable(this.f44990b);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerStateView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap3, R.attr.aqp});
            l.a((Object) obtainStyledAttributes, "");
            this.f44989a = obtainStyledAttributes.getDrawable(0);
            this.f44990b = obtainStyledAttributes.getDrawable(1);
            setImageDrawable(this.f44989a);
            obtainStyledAttributes.recycle();
        }
    }
}
