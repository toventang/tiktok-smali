package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.a.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f54460a = h.f54461a;

    static {
        Covode.recordClassIndex(33803);
    }

    static ExecutorService a() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));
    }
}
