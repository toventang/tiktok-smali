package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;

public final class b extends OverScroller {
    static {
        Covode.recordClassIndex(22506);
    }

    public b(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
        super.startScroll(i2, i3, i4, i5, Math.min(300, i6));
    }
}
