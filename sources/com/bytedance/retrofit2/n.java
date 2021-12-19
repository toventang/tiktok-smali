package com.bytedance.retrofit2;

import com.a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Method f42521a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f42522b;

    static {
        Covode.recordClassIndex(26054);
    }

    public final String toString() {
        return a.a("%s.%s() %s", new Object[]{this.f42521a.getDeclaringClass().getName(), this.f42521a.getName(), this.f42522b});
    }

    n(Method method, List<?> list) {
        this.f42521a = method;
        this.f42522b = Collections.unmodifiableList(list);
    }
}
