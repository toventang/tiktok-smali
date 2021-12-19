package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import f.a.v;
import f.a.w;

final /* synthetic */ class bk implements w {

    /* renamed from: a  reason: collision with root package name */
    private final bj f14581a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14582b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14583c;

    static {
        Covode.recordClassIndex(8113);
    }

    bk(bj bjVar, byte[] bArr, String str) {
        this.f14581a = bjVar;
        this.f14582b = bArr;
        this.f14583c = str;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        g.a().submit(new bm(this.f14581a, vVar, this.f14582b, this.f14583c));
    }
}
