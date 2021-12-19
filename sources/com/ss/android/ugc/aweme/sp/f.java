package com.ss.android.ugc.aweme.sp;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final /* synthetic */ class f implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f133999a = new f();

    static {
        Covode.recordClassIndex(87667);
    }

    private f() {
    }

    public final void execute(Runnable runnable) {
        new Thread(runnable, "SharedPreferencesImpl-load").start();
    }
}
