package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f119866a;

    static {
        Covode.recordClassIndex(77876);
    }

    h(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f119866a = scanQRCodeActivityV2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f119866a.j();
    }
}
