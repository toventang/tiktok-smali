package com.ss.android.ugc.aweme.ad.feed.button.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class FeedAdButtonView extends a {
    static {
        Covode.recordClassIndex(40465);
    }

    public FeedAdButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.ad.a.a
    public final int getLayoutId$c_feed_impl_tiktokI18nRelease() {
        return R.layout.a_e;
    }

    @Override // com.ss.android.ugc.aweme.ad.a.a
    public final void setLabelVisibility$c_feed_impl_tiktokI18nRelease(int i2) {
        setVisibility(i2);
    }

    @Override // com.ss.android.ugc.aweme.ad.a.a
    public final void a(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) getResources().getDimensionPixelOffset(R.dimen.jw));
        gradientDrawable.setColor(i2);
        setBackground(gradientDrawable);
    }

    private /* synthetic */ FeedAdButtonView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdButtonView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setDefaultBackgroundColor$c_feed_impl_tiktokI18nRelease(b.c(context, R.color.oc));
    }
}
