package com.vk.api.sdk.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f156328a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantLock f156329b;

    /* renamed from: c  reason: collision with root package name */
    private static final Condition f156330c;

    private h() {
    }

    static {
        Covode.recordClassIndex(103820);
        ReentrantLock reentrantLock = new ReentrantLock();
        f156329b = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        l.a((Object) newCondition, "");
        f156330c = newCondition;
    }

    public static void a() {
        try {
            ReentrantLock reentrantLock = f156329b;
            reentrantLock.lock();
            try {
                f156330c.await();
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = f156329b;
        reentrantLock.lock();
        try {
            f156330c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }
}
