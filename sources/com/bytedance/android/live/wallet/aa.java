package com.bytedance.android.live.wallet;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnClickListener f13005a = new aa();

    static {
        Covode.recordClassIndex(7229);
    }

    private aa() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        b.a.a("livesdk_auto_balance_exchange_click").a("click", "cancel").b();
    }
}
