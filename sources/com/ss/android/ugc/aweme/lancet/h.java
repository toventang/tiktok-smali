package com.ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import java.lang.Thread;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    static final Thread.UncaughtExceptionHandler f107218a = new h();

    static {
        Covode.recordClassIndex(68581);
    }

    private h() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        a.a(th);
    }
}
