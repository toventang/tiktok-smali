package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.r.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f132339a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f132340b;

    static {
        Covode.recordClassIndex(86660);
    }

    o(Activity activity, Intent intent) {
        this.f132339a = activity;
        this.f132340b = intent;
    }

    public final void run() {
        a.a().c(this.f132339a, this.f132340b);
    }
}
