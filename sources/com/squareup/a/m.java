package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Deque;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f57867a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f57868b = 5;

    /* renamed from: c  reason: collision with root package name */
    private final Deque<Object> f57869c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final Deque<Object> f57870d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private final Deque<e> f57871e = new ArrayDeque();

    static {
        Covode.recordClassIndex(36008);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(e eVar) {
        MethodCollector.i(9504);
        this.f57871e.add(eVar);
        MethodCollector.o(9504);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(e eVar) {
        MethodCollector.i(9649);
        if (this.f57871e.remove(eVar)) {
            MethodCollector.o(9649);
        } else {
            AssertionError assertionError = new AssertionError("Call wasn't in-flight!");
            MethodCollector.o(9649);
            throw assertionError;
        }
    }
}
