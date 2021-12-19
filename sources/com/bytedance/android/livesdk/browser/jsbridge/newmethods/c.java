package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f14659a;

    static {
        Covode.recordClassIndex(8140);
    }

    c(b bVar) {
        this.f14659a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b bVar = this.f14659a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new b.C0314b(true, (byte) 0));
    }
}
