package com.bytedance.geckox.l;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.statistic.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<Class<?>, Set<?>> f29925a;

    static {
        Covode.recordClassIndex(17351);
    }

    /* renamed from: com.bytedance.geckox.l.a$a  reason: collision with other inner class name */
    public static class C0632a {

        /* renamed from: a  reason: collision with root package name */
        public static a f29926a = new a((byte) 0);

        static {
            Covode.recordClassIndex(17352);
        }
    }

    private a() {
        this.f29925a = new ConcurrentHashMap<>();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final <T> Set<T> a(Class<T> cls) {
        Throwable th;
        Set<T> set;
        Set<T> set2 = null;
        try {
            Set<?> set3 = this.f29925a.get(cls);
            if (set3 == null) {
                try {
                    set = new HashSet<>();
                } catch (Throwable th2) {
                    th = th2;
                    set2 = set3;
                }
            } else {
                set = set3;
            }
            Iterator it = ServiceLoader.load(cls, Looper.getMainLooper().getThread().getContextClassLoader()).iterator();
            while (it.hasNext()) {
                set.add((T) it.next());
            }
            this.f29925a.put(cls, set);
            return set;
        } catch (Throwable th3) {
            th = th3;
            c.a(1, 12, th.getMessage(), "");
            com.bytedance.geckox.i.a.a("gecko service manager get services failed:" + th.getMessage());
            return set2;
        }
    }
}
