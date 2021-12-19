package com.ss.android.ugc.aweme.homepage.api.data;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class b extends ReentrantLock {
    private volatile boolean mReleased;

    static {
        Covode.recordClassIndex(63159);
    }

    public final void unlock() {
        super.unlock();
        this.mReleased = true;
    }

    public final boolean tryLock() {
        if (!this.mReleased) {
            return super.tryLock();
        }
        return true;
    }

    @Override // java.util.concurrent.locks.Lock, java.util.concurrent.locks.ReentrantLock
    public final boolean tryLock(long j2, TimeUnit timeUnit) {
        if (!this.mReleased) {
            return super.tryLock(j2, timeUnit);
        }
        return true;
    }
}
