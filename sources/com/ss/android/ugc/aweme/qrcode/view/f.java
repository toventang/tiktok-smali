package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

final /* synthetic */ class f implements IAVCameraService.IAVCameraReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ScanQRCodeActivityV2 f119863a;

    /* renamed from: b  reason: collision with root package name */
    private final ScanQRCodeActivityV2.b f119864b;

    static {
        Covode.recordClassIndex(77874);
    }

    f(ScanQRCodeActivityV2 scanQRCodeActivityV2, ScanQRCodeActivityV2.b bVar) {
        this.f119863a = scanQRCodeActivityV2;
        this.f119864b = bVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback
    public final void finish(Object obj) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f119863a;
        ScanQRCodeActivityV2.b bVar = this.f119864b;
        IQRCodeScanner iQRCodeScanner = (IQRCodeScanner) obj;
        if (iQRCodeScanner != null) {
            scanQRCodeActivityV2.f119815d = iQRCodeScanner;
            if (scanQRCodeActivityV2.f119816e == scanQRCodeActivityV2.f119817f) {
                scanQRCodeActivityV2.f119815d.setScanListener(scanQRCodeActivityV2.r);
            }
        }
        if (bVar != null) {
            bVar.a();
        }
    }
}
