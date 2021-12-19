package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f119867a;

    static {
        Covode.recordClassIndex(77877);
    }

    i(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f119867a = scanQRCodeActivityV2;
    }

    public final void run() {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f119867a;
        if (!scanQRCodeActivityV2.isFinishing()) {
            scanQRCodeActivityV2.finish();
        }
    }
}
