package com.bytedance.android.livesdk.browser.d;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f14350a;

    static {
        Covode.recordClassIndex(7948);
    }

    d(a aVar) {
        this.f14350a = aVar;
    }

    public final void onClick(View view) {
        this.f14350a.dismissAllowingStateLoss();
    }
}
