package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k implements IQRCodeService {

    /* renamed from: a  reason: collision with root package name */
    public static final k f119754a = new k();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IQRCodeService f119755b;

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final int a(String str) {
        return this.f119755b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final b a(View view, String str, boolean z) {
        l.d(view, "");
        l.d(str, "");
        return this.f119755b.a(view, str, z);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        this.f119755b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeService
    public final void a(Context context, boolean z, boolean z2) {
        l.d(context, "");
        this.f119755b.a(context, z, z2);
    }

    static {
        Covode.recordClassIndex(77810);
    }

    private k() {
        IQRCodeService a2 = QRCodeServiceImpl.a();
        l.b(a2, "");
        this.f119755b = a2;
    }
}
