package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f54610a = new f();

    static {
        Covode.recordClassIndex(33883);
    }

    private f() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
