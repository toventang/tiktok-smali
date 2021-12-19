package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.b;

final /* synthetic */ class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f145431a;

    static {
        Covode.recordClassIndex(95093);
    }

    af(Activity activity) {
        this.f145431a = activity;
    }

    public final void run() {
        Activity activity = this.f145431a;
        if (aa.f145425a == 0) {
            c.a("method_push_start_redbadge_client_init");
            b a2 = b.a(activity);
            if (a2.f59997a != null) {
                if (!a2.f60001e) {
                    a2.f60001e = true;
                    a2.f59998b.sendEmptyMessage(0);
                } else if (a2.f60000d) {
                    a2.f60000d = false;
                    a2.f59998b.sendEmptyMessage(3);
                }
                Logger.debug();
                a2.f59998b.removeCallbacks(a2.f60002f);
            }
            c.b("method_push_start_redbadge_client_init");
        }
    }
}
