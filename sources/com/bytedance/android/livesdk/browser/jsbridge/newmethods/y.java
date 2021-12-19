package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.t;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;

final /* synthetic */ class y implements w {

    /* renamed from: a  reason: collision with root package name */
    private final t.AnonymousClass8 f14793a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14794b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14795c;

    static {
        Covode.recordClassIndex(8200);
    }

    y(t.AnonymousClass8 r1, byte[] bArr, String str) {
        this.f14793a = r1;
        this.f14794b = bArr;
        this.f14795c = str;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        t.AnonymousClass8 r5 = this.f14793a;
        vVar.a(new t.c(this.f14795c, t.this.a(t.this.f14748g, this.f14794b, t.this.f14749h)));
    }
}
