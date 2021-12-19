package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final ReentrantLock f112256a;

    /* renamed from: b  reason: collision with root package name */
    final Condition f112257b;

    static {
        Covode.recordClassIndex(72140);
    }

    public c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f112256a = reentrantLock;
        this.f112257b = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f112256a;
        reentrantLock.lock();
        try {
            this.f112257b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
