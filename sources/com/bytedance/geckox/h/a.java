package com.bytedance.geckox.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.utils.FileLock;
import com.bytedance.geckox.utils.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Lock> f29898a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private FileLock f29899b;

    /* renamed from: c  reason: collision with root package name */
    private String f29900c;

    static {
        Covode.recordClassIndex(17337);
    }

    public final void a() {
        MethodCollector.i(8853);
        Map<String, Lock> map = f29898a;
        synchronized (map) {
            try {
                this.f29899b.a();
                this.f29899b.b();
                try {
                    map.get(this.f29900c).unlock();
                } finally {
                    MethodCollector.o(8853);
                }
            } catch (Throwable th) {
                f29898a.get(this.f29900c).unlock();
                MethodCollector.o(8853);
                throw th;
            }
        }
    }

    public static a a(String str) {
        MethodCollector.i(8540);
        Map<String, Lock> map = f29898a;
        synchronized (map) {
            try {
                Lock lock = map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
                if (!lock.tryLock()) {
                    return null;
                }
                try {
                    FileLock c2 = FileLock.c(str);
                    if (c2 == null) {
                        lock.unlock();
                        MethodCollector.o(8540);
                        return null;
                    }
                    a aVar = new a(str, c2);
                    MethodCollector.o(8540);
                    return aVar;
                } catch (Exception e2) {
                    lock.unlock();
                    d.a(new RuntimeException(e2));
                    MethodCollector.o(8540);
                    return null;
                }
            } finally {
                MethodCollector.o(8540);
            }
        }
    }

    private a(String str, FileLock fileLock) {
        this.f29900c = str;
        this.f29899b = fileLock;
    }
}
