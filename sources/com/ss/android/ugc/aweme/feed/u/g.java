package com.ss.android.ugc.aweme.feed.u;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d f94026a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94027b;

    /* renamed from: c  reason: collision with root package name */
    private final Message f94028c;

    /* renamed from: d  reason: collision with root package name */
    private final Lock f94029d;

    static {
        Covode.recordClassIndex(59779);
    }

    g(d dVar, int i2, Message message, Lock lock) {
        this.f94026a = dVar;
        this.f94027b = i2;
        this.f94028c = message;
        this.f94029d = lock;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f94026a.a(this.f94027b, this.f94028c, this.f94029d);
    }
}
