package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f14668a;

    static {
        Covode.recordClassIndex(8145);
    }

    d(b bVar) {
        this.f14668a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b bVar = this.f14668a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new b.C0314b(false, (byte) 0));
    }
}
