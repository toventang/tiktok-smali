package com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.uikit.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SearchAdTransformButton extends a {
    static {
        Covode.recordClassIndex(20819);
    }

    public SearchAdTransformButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a
    public final int getLayoutId$commercialize_search_impl_release() {
        return R.layout.auq;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a
    public final boolean a() {
        if (getMAwemeRawAd$commercialize_search_impl_release() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a
    public final void setTransformButtonVisibility$commercialize_search_impl_release(int i2) {
        setVisibility(i2);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a
    public final void a(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) getResources().getDimensionPixelOffset(R.dimen.rq));
        if (i3 == 0) {
            gradientDrawable.setColor(i2);
            setBackground(gradientDrawable);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        a.a(this, gradientDrawable, getBackGroundColor(), i2, (long) i3);
    }

    private /* synthetic */ SearchAdTransformButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchAdTransformButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setDefaultBackgroundColor(b.c(context, R.color.bz));
    }
}
