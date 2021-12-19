package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ai.c;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.s.k;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

final /* synthetic */ class t implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f16219a;

    static {
        Covode.recordClassIndex(8983);
    }

    t(Activity activity) {
        this.f16219a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Activity activity = this.f16219a;
        c.a((com.bytedance.android.livesdk.ao.c) a.cr, (Object) true);
        if (!com.bytedance.android.livesdk.ai.a.a()) {
            c.b.a();
            l.d(activity, "");
            k.c(activity);
        }
        b.a.a("livesdk_mini_window_pop_up_click").a("click_icon", "allow").b();
        dialogInterface.dismiss();
    }
}
