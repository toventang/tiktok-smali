package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

final /* synthetic */ class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f54461a = new h();

    static {
        Covode.recordClassIndex(33804);
    }

    private h() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
