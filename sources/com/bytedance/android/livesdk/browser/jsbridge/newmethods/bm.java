package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.v;

final /* synthetic */ class bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bj f14585a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14586b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f14587c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14588d;

    static {
        Covode.recordClassIndex(8115);
    }

    bm(bj bjVar, v vVar, byte[] bArr, String str) {
        this.f14585a = bjVar;
        this.f14586b = vVar;
        this.f14587c = bArr;
        this.f14588d = str;
    }

    public final void run() {
        bj bjVar = this.f14585a;
        v vVar = this.f14586b;
        try {
            vVar.a(bjVar.a(bjVar.f14571b, this.f14587c, this.f14588d));
        } catch (Exception e2) {
            vVar.a((Throwable) e2);
        }
    }
}
