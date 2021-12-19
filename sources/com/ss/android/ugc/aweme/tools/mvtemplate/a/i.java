package com.ss.android.ugc.aweme.tools.mvtemplate.a;

import android.content.Context;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;

public final class i extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    public int f140780a = 1500;

    static {
        Covode.recordClassIndex(91922);
    }

    public i(Context context) {
        super(context);
    }

    public final void startScroll(int i2, int i3, int i4, int i5) {
        startScroll(i2, i3, i4, i5, this.f140780a);
    }

    public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
        super.startScroll(i2, i3, i4, i5, this.f140780a);
    }
}
