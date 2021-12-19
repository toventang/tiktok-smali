package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.a.b;
import com.ss.android.ugc.aweme.filter.repository.a.l;

public final class d implements l {

    /* renamed from: a  reason: collision with root package name */
    private final String f95651a;

    static {
        Covode.recordClassIndex(60617);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String b(int i2) {
        return this.f95651a;
    }

    public d(String str) {
        h.f.b.l.d(str, "");
        this.f95651a = str;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String a(int i2) {
        return i2 + ".zip";
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String c(int i2) {
        return b.a(b.a(this.f95651a) + i2);
    }
}
