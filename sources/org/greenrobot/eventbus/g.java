package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;

public final class g extends t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final Class<?> f159805a;

    /* renamed from: b  reason: collision with root package name */
    final String f159806b;

    /* renamed from: i  reason: collision with root package name */
    private final Object f159807i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private volatile Method f159808j;

    static {
        Covode.recordClassIndex(106476);
    }

    public final void run() {
        b();
        EventBus.c((Class<?>) this.f159829e);
    }

    @Override // org.greenrobot.eventbus.t
    public final int hashCode() {
        return this.f159805a.getName().hashCode() ^ this.f159806b.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // org.greenrobot.eventbus.t
    public final synchronized void a() {
        MethodCollector.i(4409);
        if (this.f159832h == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f159805a.getName());
            sb.append('#').append(this.f159806b);
            sb.append('(').append(this.f159829e.getName());
            this.f159832h = sb.toString();
        }
        MethodCollector.o(4409);
    }

    @Override // org.greenrobot.eventbus.t
    public final Method b() {
        MethodCollector.i(4455);
        Method method = this.f159827c;
        if (method == null) {
            Method method2 = this.f159808j;
            if (method2 != null) {
                this.f159827c = method2;
                MethodCollector.o(4455);
                return method2;
            }
            synchronized (this.f159807i) {
                try {
                    Method method3 = this.f159808j;
                    if (method3 != null) {
                        this.f159827c = method3;
                        return method3;
                    }
                    try {
                        this.f159808j = this.f159805a.getDeclaredMethod(this.f159806b, this.f159829e);
                        method = this.f159808j;
                        this.f159827c = method;
                    } catch (NoSuchMethodException e2) {
                        d dVar = new d("Could not find subscriber method in " + this.f159805a + ". Maybe a missing ProGuard rule?", e2);
                        MethodCollector.o(4455);
                        throw dVar;
                    }
                } finally {
                    MethodCollector.o(4455);
                }
            }
        }
        MethodCollector.o(4455);
        return method;
    }

    public g(Class<?> cls, String str, Class<?> cls2, ThreadMode threadMode, int i2, boolean z) {
        super(null, cls2, threadMode, i2, z);
        this.f159805a = cls;
        this.f159806b = str;
    }
}
