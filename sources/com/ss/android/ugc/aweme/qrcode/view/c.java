package com.ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import com.bytedance.ies.powerpermissions.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final QRCodePermissionActivity f119855a;

    static {
        Covode.recordClassIndex(77871);
    }

    c(QRCodePermissionActivity qRCodePermissionActivity) {
        this.f119855a = qRCodePermissionActivity;
    }

    @Override // com.bytedance.ies.powerpermissions.f
    public final void a(a[] aVarArr) {
        QRCodePermissionActivity qRCodePermissionActivity = this.f119855a;
        for (a aVar : aVarArr) {
            if (aVar.f34455b != a.EnumC0768a.GRANTED) {
                qRCodePermissionActivity.a();
                return;
            }
        }
        qRCodePermissionActivity.b();
    }
}
