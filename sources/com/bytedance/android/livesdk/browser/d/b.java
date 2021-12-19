package com.bytedance.android.livesdk.browser.d;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f14348a;

    static {
        Covode.recordClassIndex(7946);
    }

    b(a aVar) {
        this.f14348a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f14348a;
        if (aVar.p != null && (aVar.p instanceof h)) {
            ((h) aVar.p).b();
        }
    }
}
