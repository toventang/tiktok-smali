package com.facebook.common.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.util.IdentityHashMap;
import java.util.Map;

public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Map<Object, Integer> f47109a = new IdentityHashMap();

    /* renamed from: b  reason: collision with root package name */
    T f47110b;

    /* renamed from: c  reason: collision with root package name */
    final c<T> f47111c;

    /* renamed from: d  reason: collision with root package name */
    private int f47112d = 1;

    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(28670);
        }

        public a() {
            super("Null shared reference");
        }
    }

    static {
        Covode.recordClassIndex(28669);
    }

    private void e() {
        if (!a(this)) {
            throw new a();
        }
    }

    private synchronized boolean d() {
        MethodCollector.i(4926);
        if (this.f47112d > 0) {
            MethodCollector.o(4926);
            return true;
        }
        MethodCollector.o(4926);
        return false;
    }

    public final synchronized T a() {
        T t;
        MethodCollector.i(4925);
        t = this.f47110b;
        MethodCollector.o(4925);
        return t;
    }

    public final synchronized void b() {
        MethodCollector.i(4929);
        e();
        this.f47112d++;
        MethodCollector.o(4929);
    }

    /* access modifiers changed from: package-private */
    public final synchronized int c() {
        boolean z;
        int i2;
        MethodCollector.i(4930);
        e();
        if (this.f47112d > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        i2 = this.f47112d - 1;
        this.f47112d = i2;
        MethodCollector.o(4930);
        return i2;
    }

    private static boolean a(d<?> dVar) {
        if (dVar.d()) {
            return true;
        }
        return false;
    }

    public d(T t, c<T> cVar) {
        MethodCollector.i(4851);
        this.f47110b = (T) i.a(t);
        this.f47111c = (c) i.a(cVar);
        Map<Object, Integer> map = f47109a;
        synchronized (map) {
            try {
                Integer num = map.get(t);
                if (num == null) {
                    map.put(t, 1);
                } else {
                    map.put(t, Integer.valueOf(num.intValue() + 1));
                }
            } finally {
                MethodCollector.o(4851);
            }
        }
    }
}
