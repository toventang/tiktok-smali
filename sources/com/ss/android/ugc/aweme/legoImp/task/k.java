package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.x;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements x.b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107979a;

    /* renamed from: b  reason: collision with root package name */
    private final long f107980b;

    static {
        Covode.recordClassIndex(69217);
    }

    k(boolean z, long j2) {
        this.f107979a = z;
        this.f107980b = j2;
    }

    @Override // com.bytedance.ies.web.jsbridge2.x.b
    public final void a() {
        if (!this.f107979a) {
            x.a("host");
        }
        System.currentTimeMillis();
    }
}
