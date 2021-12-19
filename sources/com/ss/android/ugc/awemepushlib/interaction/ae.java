package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.b;

final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f145430a;

    static {
        Covode.recordClassIndex(95092);
    }

    ae(Activity activity) {
        this.f145430a = activity;
    }

    public final void run() {
        Activity activity = this.f145430a;
        if (aa.f145425a == 0) {
            b.a(activity).b();
        }
    }
}
