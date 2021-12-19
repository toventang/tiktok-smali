package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f119871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119872b;

    static {
        Covode.recordClassIndex(77880);
    }

    l(ScanQRCodeActivityV2 scanQRCodeActivityV2, String str) {
        this.f119871a = scanQRCodeActivityV2;
        this.f119872b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f119871a.a(this.f119872b);
        return null;
    }
}
