package com.ss.android.ugc.aweme.qrcode.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;

public final class j implements d {
    static {
        Covode.recordClassIndex(77781);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final String a() {
        return "web";
    }

    @Override // com.ss.android.ugc.aweme.qrcode.c.d
    public final boolean a(String str, int i2) {
        QrCodeScanService b2 = QrCodeScanImpl.b();
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://reactnative/"))) {
            t.a(t.a(), str);
            return true;
        } else if (TextUtils.isEmpty(str) || (!str.startsWith("snssdk1180") && !str.startsWith("snssdk1233"))) {
            return false;
        } else {
            b2.a(d.a(), str);
            return true;
        }
    }
}
