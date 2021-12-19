package com.bytedance.android.livesdk.browser.d;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f14352a;

    static {
        Covode.recordClassIndex(7950);
    }

    f(a aVar) {
        this.f14352a = aVar;
    }

    public final void onClick(View view) {
        this.f14352a.dismissAllowingStateLoss();
    }
}
