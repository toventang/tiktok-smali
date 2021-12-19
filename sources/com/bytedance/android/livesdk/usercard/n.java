package com.bytedance.android.livesdk.usercard;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.bf;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnDismissListener f21856a = new n();

    static {
        Covode.recordClassIndex(12870);
    }

    private n() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        bf.a().c();
    }
}
