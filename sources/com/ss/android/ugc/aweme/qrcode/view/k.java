package com.ss.android.ugc.aweme.qrcode.view;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;

final /* synthetic */ class k implements ScanQRCodeActivityV2.b {

    /* renamed from: a  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f119869a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119870b;

    static {
        Covode.recordClassIndex(77879);
    }

    k(ScanQRCodeActivityV2 scanQRCodeActivityV2, String str) {
        this.f119869a = scanQRCodeActivityV2;
        this.f119870b = str;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.b
    public final void a() {
        i.b(new l(this.f119869a, this.f119870b), m.f68150a);
    }
}
