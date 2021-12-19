package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.d.n;

public class r implements n {

    /* renamed from: a  reason: collision with root package name */
    private static volatile r f40026a;

    /* renamed from: b  reason: collision with root package name */
    private h<?, ?> f40027b;

    /* renamed from: c  reason: collision with root package name */
    private h<?, ?> f40028c;

    /* renamed from: d  reason: collision with root package name */
    private int f40029d;

    /* renamed from: e  reason: collision with root package name */
    private int f40030e;

    /* renamed from: f  reason: collision with root package name */
    private int f40031f;

    /* renamed from: g  reason: collision with root package name */
    private int f40032g;

    /* renamed from: h  reason: collision with root package name */
    private int f40033h;

    /* renamed from: i  reason: collision with root package name */
    private int f40034i;

    static {
        Covode.recordClassIndex(24674);
    }

    private r() {
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void b() {
        this.f40029d++;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void c() {
        this.f40030e++;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void d() {
        this.f40031f++;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void e() {
        this.f40032g++;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void f() {
        this.f40033h++;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void g() {
        this.f40034i++;
    }

    public static r a() {
        MethodCollector.i(12190);
        if (f40026a == null) {
            synchronized (r.class) {
                try {
                    if (f40026a == null) {
                        f40026a = new r();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12190);
                    throw th;
                }
            }
        }
        r rVar = f40026a;
        MethodCollector.o(12190);
        return rVar;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void a(h<?, ?> hVar) {
        this.f40027b = hVar;
    }

    @Override // com.facebook.imagepipeline.d.n
    public final void b(h<?, ?> hVar) {
        this.f40028c = hVar;
    }
}
