package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class SquareImageView extends AnimatedImageView {
    static {
        Covode.recordClassIndex(42067);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAspectRatio(1.0f);
    }
}
