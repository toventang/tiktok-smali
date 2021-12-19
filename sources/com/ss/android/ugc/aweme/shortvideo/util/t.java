package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f132369a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132370b;

    static {
        Covode.recordClassIndex(86675);
    }

    t(Activity activity, String str) {
        this.f132369a = activity;
        this.f132370b = str;
    }

    public final void run() {
        Activity activity = this.f132369a;
        new a(activity).a(this.f132370b).a();
    }
}
