package com.bytedance.android.livesdk.chatroom.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.bf;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnDismissListener f16660a = new j();

    static {
        Covode.recordClassIndex(9238);
    }

    private j() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        bf.a().c();
    }
}
