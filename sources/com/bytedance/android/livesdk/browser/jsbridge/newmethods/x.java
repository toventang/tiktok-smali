package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements g {

    /* renamed from: a  reason: collision with root package name */
    private final t f14791a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14792b;

    static {
        Covode.recordClassIndex(8199);
    }

    x(t tVar, byte[] bArr) {
        this.f14791a = tVar;
        this.f14792b = bArr;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        t tVar = this.f14791a;
        return tVar.a((String) obj, this.f14792b, tVar.f14749h);
    }
}
