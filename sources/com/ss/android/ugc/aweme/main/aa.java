package com.ss.android.ugc.aweme.main;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MainActivity f109133a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f109134b;

    static {
        Covode.recordClassIndex(69883);
    }

    aa(MainActivity mainActivity, Bundle bundle) {
        this.f109133a = mainActivity;
        this.f109134b = bundle;
    }

    public final void run() {
        this.f109133a.lambda$onCreate$7$MainActivity(this.f109134b);
    }
}
