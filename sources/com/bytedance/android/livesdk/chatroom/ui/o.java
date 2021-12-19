package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f16214a;

    static {
        Covode.recordClassIndex(8978);
    }

    o(a aVar) {
        this.f16214a = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16214a.t();
    }
}
