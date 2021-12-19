package com.ss.android.ugc.aweme.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mvtemplate.a;
import com.ss.android.ugc.aweme.utils.bt;
import h.f.a.a;

final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass1 f112162a;

    static {
        Covode.recordClassIndex(72060);
    }

    c(a.AnonymousClass1 r1) {
        this.f112162a = r1;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        a.AnonymousClass1 r1 = this.f112162a;
        if (a.this.f112118a != null) {
            bt.b(a.this.f112118a);
        }
        if (a.this.f112124g == null) {
            return null;
        }
        a.this.f112124g.onFinish(0);
        return null;
    }
}
