package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashSet;
import java.util.Set;

public final class a<StateT> {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<com.google.android.play.core.c.a<StateT>> f53115a = new HashSet();

    static {
        Covode.recordClassIndex(32781);
    }

    public final synchronized void a(com.google.android.play.core.c.a<StateT> aVar) {
        MethodCollector.i(6896);
        this.f53115a.add(aVar);
        MethodCollector.o(6896);
    }

    public final synchronized void a(StateT statet) {
        MethodCollector.i(7033);
        for (com.google.android.play.core.c.a<StateT> aVar : this.f53115a) {
            aVar.a(statet);
        }
        MethodCollector.o(7033);
    }

    public final synchronized void b(com.google.android.play.core.c.a<StateT> aVar) {
        MethodCollector.i(6969);
        this.f53115a.remove(aVar);
        MethodCollector.o(6969);
    }
}
