package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.c;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    final List<AbstractC0986a> f40416a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f40417b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f40418c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    protected c<A> f40419d;

    /* renamed from: e  reason: collision with root package name */
    private final List<? extends com.bytedance.lottie.g.a<K>> f40420e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.lottie.g.a<K> f40421f;

    /* renamed from: com.bytedance.lottie.a.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0986a {
        static {
            Covode.recordClassIndex(24852);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(24851);
    }

    /* access modifiers changed from: package-private */
    public abstract A a(com.bytedance.lottie.g.a<K> aVar, float f2);

    private float f() {
        if (this.f40420e.isEmpty()) {
            return 0.0f;
        }
        return ((com.bytedance.lottie.g.a) this.f40420e.get(0)).a();
    }

    public void a() {
        for (int i2 = 0; i2 < this.f40416a.size(); i2++) {
            this.f40416a.get(i2).a();
        }
    }

    /* access modifiers changed from: package-private */
    public float c() {
        if (this.f40420e.isEmpty()) {
            return 1.0f;
        }
        List<? extends com.bytedance.lottie.g.a<K>> list = this.f40420e;
        return ((com.bytedance.lottie.g.a) list.get(list.size() - 1)).b();
    }

    public A d() {
        float interpolation;
        com.bytedance.lottie.g.a<K> e2 = e();
        com.bytedance.lottie.g.a<K> e3 = e();
        if (e3.c()) {
            interpolation = 0.0f;
        } else {
            interpolation = e3.f40722e.getInterpolation(b());
        }
        return a(e2, interpolation);
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        if (this.f40417b) {
            return 0.0f;
        }
        com.bytedance.lottie.g.a<K> e2 = e();
        if (e2.c()) {
            return 0.0f;
        }
        return (this.f40418c - e2.a()) / (e2.b() - e2.a());
    }

    private com.bytedance.lottie.g.a<K> e() {
        com.bytedance.lottie.g.a<K> aVar = this.f40421f;
        if (aVar != null && aVar.a(this.f40418c)) {
            return this.f40421f;
        }
        List<? extends com.bytedance.lottie.g.a<K>> list = this.f40420e;
        com.bytedance.lottie.g.a<K> aVar2 = (com.bytedance.lottie.g.a) list.get(list.size() - 1);
        if (this.f40418c < aVar2.a()) {
            for (int size = this.f40420e.size() - 1; size >= 0; size--) {
                aVar2 = (com.bytedance.lottie.g.a) this.f40420e.get(size);
                if (aVar2.a(this.f40418c)) {
                    break;
                }
            }
        }
        this.f40421f = aVar2;
        return aVar2;
    }

    public final void a(AbstractC0986a aVar) {
        this.f40416a.add(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.lottie.a.b.a<K, A> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(c<A> cVar) {
        c<A> cVar2 = this.f40419d;
        if (cVar2 != null) {
            cVar2.f40735a = null;
        }
        this.f40419d = cVar;
        if (cVar != null) {
            cVar.f40735a = this;
        }
    }

    a(List<? extends com.bytedance.lottie.g.a<K>> list) {
        this.f40420e = list;
    }

    public void a(float f2) {
        if (f2 < f()) {
            f2 = f();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 != this.f40418c) {
            this.f40418c = f2;
            a();
        }
    }
}
