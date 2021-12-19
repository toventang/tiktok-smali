package com.ss.android.ugc.aweme.adaptation;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f66256a;

    static {
        Covode.recordClassIndex(40706);
    }

    i(h hVar) {
        this.f66256a = hVar;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f66256a.b(i5, i9);
    }
}
