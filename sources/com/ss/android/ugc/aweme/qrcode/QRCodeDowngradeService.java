package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class QRCodeDowngradeService implements IQRCodeService {
    static {
        Covode.recordClassIndex(77745);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int a(String str) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final b a(View view, String str, boolean z) {
        l.d(view, "");
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, boolean z, boolean z2) {
        l.d(context, "");
    }
}
