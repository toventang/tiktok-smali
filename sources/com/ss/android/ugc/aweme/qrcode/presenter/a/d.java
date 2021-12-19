package com.ss.android.ugc.aweme.qrcode.presenter.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f119790a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f119791b;

    static {
        Covode.recordClassIndex(77827);
    }

    d(c cVar, boolean z) {
        this.f119790a = cVar;
        this.f119791b = z;
    }

    public final void run() {
        new b(this.f119790a.f119761a).e(this.f119791b ? R.string.co9 : R.string.dmg).b();
    }
}
