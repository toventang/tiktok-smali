package com.bytedance.ies.ugc.statisticlogger;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.i.d;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final Runnable f35351a = new g();

    static {
        Covode.recordClassIndex(21167);
    }

    private g() {
    }

    public final void run() {
        if (f.f35350b != null) {
            Activity activity = f.f35350b.get();
            if (activity != null) {
                d.a.f59589a.a(activity);
            }
            f.f35350b = null;
        }
    }
}
