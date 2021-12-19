package com.bytedance.ies.powerlist;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class f<T extends a> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f34289b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f34290c = new ReentrantLock();

    static {
        Covode.recordClassIndex(20487);
    }

    public final int b() {
        return this.f34289b.size();
    }

    public final List<a> c() {
        return new ArrayList(this.f34289b);
    }

    /* JADX INFO: finally extract failed */
    public final void a() {
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.clear();
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final T b(int i2) {
        return this.f34289b.get(i2);
    }

    public final int c(T t) {
        l.c(t, "");
        return this.f34289b.indexOf(t);
    }

    /* JADX INFO: finally extract failed */
    public final void b(T t) {
        l.c(t, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.remove(t);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(Collection<? extends T> collection) {
        l.c(collection, "");
        this.f34289b.clear();
        this.f34289b.addAll(collection);
        a((List) this.f34289b, true);
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.remove(i2);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b(Collection<? extends T> collection) {
        l.c(collection, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.clear();
            this.f34289b.addAll(collection);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(T t) {
        l.c(t, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.add(t);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(Collection<? extends T> collection) {
        l.c(collection, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.addAll(collection);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b(int i2, T t) {
        l.c(t, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.remove(i2);
            this.f34289b.add(i2, t);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2, T t) {
        l.c(t, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.add(i2, t);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2, Collection<? extends T> collection) {
        l.c(collection, "");
        ReentrantLock reentrantLock = this.f34290c;
        reentrantLock.lock();
        try {
            this.f34289b.addAll(i2, collection);
            reentrantLock.unlock();
            a.a(this, this.f34289b);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
