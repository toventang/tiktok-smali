package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class u implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnClickListener f16220a = new u();

    static {
        Covode.recordClassIndex(8984);
    }

    private u() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        c.a((com.bytedance.android.livesdk.ao.c) a.cr, (Object) false);
        b.a.a("livesdk_mini_window_pop_up_click").a("click_icon", "not_allowed").b();
        dialogInterface.dismiss();
    }
}
