package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;

public class t {

    /* renamed from: c  reason: collision with root package name */
    protected Method f159827c;

    /* renamed from: d  reason: collision with root package name */
    final ThreadMode f159828d;

    /* renamed from: e  reason: collision with root package name */
    final Class<?> f159829e;

    /* renamed from: f  reason: collision with root package name */
    final int f159830f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f159831g;

    /* renamed from: h  reason: collision with root package name */
    String f159832h;

    static {
        Covode.recordClassIndex(106492);
    }

    public Method b() {
        return this.f159827c;
    }

    public int hashCode() {
        return this.f159827c.hashCode();
    }

    /* access modifiers changed from: protected */
    public synchronized void a() {
        MethodCollector.i(5372);
        if (this.f159832h == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f159827c.getDeclaringClass().getName());
            sb.append('#').append(this.f159827c.getName());
            sb.append('(').append(this.f159829e.getName());
            this.f159832h = sb.toString();
        }
        MethodCollector.o(5372);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        a();
        t tVar = (t) obj;
        tVar.a();
        return this.f159832h.equals(tVar.f159832h);
    }

    public t(Method method, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
        this.f159827c = method;
        this.f159828d = threadMode;
        this.f159829e = cls;
        this.f159830f = i2;
        this.f159831g = z;
    }
}
