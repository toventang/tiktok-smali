package com.ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public final class c {
    static {
        Covode.recordClassIndex(58788);
    }

    public static void c(Lock lock) {
        if (lock != null) {
            try {
                lock.unlock();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Lock lock) {
        if (lock != null) {
            return lock.tryLock();
        }
        return false;
    }

    public static void b(Lock lock) {
        if (lock != null) {
            try {
                lock.tryLock(1500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            } finally {
                c(lock);
            }
        }
    }
}
