package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f54466a = new k();

    static {
        Covode.recordClassIndex(33807);
    }

    private k() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
