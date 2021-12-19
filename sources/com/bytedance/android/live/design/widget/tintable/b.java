package com.bytedance.android.live.design.widget.tintable;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f9622a;

    static {
        Covode.recordClassIndex(4877);
    }

    b(a aVar) {
        this.f9622a = aVar;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        a aVar = this.f9622a;
        if (aVar.f9614a != null) {
            aVar.f9614a.setBounds(0, 0, i4 - i2, i5 - i3);
        }
    }
}
