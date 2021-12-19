package com.benchmark.collection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f6115a = new b();

    /* renamed from: b  reason: collision with root package name */
    public a f6116b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f6117c;

    static {
        Covode.recordClassIndex(2964);
    }

    private b() {
    }

    public final synchronized f a() {
        MethodCollector.i(7202);
        if (!com.benchmark.port.b.a()) {
            MethodCollector.o(7202);
            return null;
        }
        if (this.f6117c == null) {
            this.f6117c = new d();
        }
        f fVar = this.f6117c;
        MethodCollector.o(7202);
        return fVar;
    }
}
