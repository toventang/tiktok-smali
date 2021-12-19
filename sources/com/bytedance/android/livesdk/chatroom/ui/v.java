package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class v implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnCancelListener f16221a = new v();

    static {
        Covode.recordClassIndex(8985);
    }

    private v() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        c.a((com.bytedance.android.livesdk.ao.c) a.cr, (Object) false);
        b.a.a("livesdk_mini_window_pop_up_click").a("click_icon", "not_allowed").b();
    }
}
