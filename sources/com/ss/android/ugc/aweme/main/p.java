package com.ss.android.ugc.aweme.main;

import androidx.appcompat.app.f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MainActivity f109274a;

    /* renamed from: b  reason: collision with root package name */
    private final f f109275b;

    static {
        Covode.recordClassIndex(69988);
    }

    p(MainActivity mainActivity, f fVar) {
        this.f109274a = mainActivity;
        this.f109275b = fVar;
    }

    public final void run() {
        this.f109274a.lambda$onCreate$0$MainActivity(this.f109275b);
    }
}
