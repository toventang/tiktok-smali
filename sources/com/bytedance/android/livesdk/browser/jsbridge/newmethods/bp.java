package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bp implements g {

    /* renamed from: a  reason: collision with root package name */
    private final bo f14623a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14624b;

    static {
        Covode.recordClassIndex(8124);
    }

    bp(bo boVar, byte[] bArr) {
        this.f14623a = boVar;
        this.f14624b = bArr;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return ((h) obj).a((g) new bq(this.f14623a, this.f14624b));
    }
}
