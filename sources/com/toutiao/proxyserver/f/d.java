package com.toutiao.proxyserver.f;

import com.bytedance.covode.number.Covode;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public volatile long f154850a;

    static {
        Covode.recordClassIndex(103133);
    }

    public d() {
    }

    @Override // com.toutiao.proxyserver.f.g
    public final long a() {
        return this.f154850a;
    }

    public d(long j2) {
        this.f154850a = j2;
    }

    public final void a(long j2) {
        this.f154850a += j2;
    }
}
