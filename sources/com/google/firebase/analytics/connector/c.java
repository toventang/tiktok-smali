package com.google.firebase.analytics.connector;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final /* synthetic */ class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f54271a = new c();

    static {
        Covode.recordClassIndex(33696);
    }

    private c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
