package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final ReentrantLock f112507a;

    /* renamed from: b  reason: collision with root package name */
    final Condition f112508b;

    static {
        Covode.recordClassIndex(72307);
    }

    public c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f112507a = reentrantLock;
        this.f112508b = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f112507a;
        reentrantLock.lock();
        try {
            this.f112508b.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
