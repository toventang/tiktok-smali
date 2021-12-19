package com.ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.compliance.api.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f109029a;

    static {
        Covode.recordClassIndex(69818);
    }

    i(Activity activity) {
        this.f109029a = activity;
    }

    public final void run() {
        Context context = this.f109029a;
        if (context == null) {
            context = d.a();
        }
        a.q().b(context);
    }
}
