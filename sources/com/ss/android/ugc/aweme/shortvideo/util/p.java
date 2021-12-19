package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.r.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f132341a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f132342b;

    static {
        Covode.recordClassIndex(86661);
    }

    p(Activity activity, Intent intent) {
        this.f132341a = activity;
        this.f132342b = intent;
    }

    public final void run() {
        a.a().c(this.f132341a, this.f132342b);
    }
}
