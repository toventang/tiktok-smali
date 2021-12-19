package com.squareup.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.z;
import java.util.LinkedHashSet;
import java.util.Set;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Set<z> f57774a = new LinkedHashSet();

    static {
        Covode.recordClassIndex(35982);
    }

    public final synchronized void a(z zVar) {
        MethodCollector.i(11278);
        this.f57774a.add(zVar);
        MethodCollector.o(11278);
    }

    public final synchronized void b(z zVar) {
        MethodCollector.i(11279);
        this.f57774a.remove(zVar);
        MethodCollector.o(11279);
    }

    public final synchronized boolean c(z zVar) {
        boolean contains;
        MethodCollector.i(11427);
        contains = this.f57774a.contains(zVar);
        MethodCollector.o(11427);
        return contains;
    }
}
