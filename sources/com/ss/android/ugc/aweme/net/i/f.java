package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import h.f.b.l;

public final class f implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public final int f112368a;

    static {
        Covode.recordClassIndex(72212);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    public f(int i2) {
        this.f112368a = i2;
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.d
    public final boolean a(com.bytedance.ies.ugc.network.partner.b.f fVar, a aVar, Throwable th, boolean z) {
        l.d(fVar, "");
        l.d(aVar, "");
        l.d(th, "");
        if (z || this.f112368a > 0) {
            return true;
        }
        return false;
    }
}
