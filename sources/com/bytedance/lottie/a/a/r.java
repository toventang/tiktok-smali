package com.bytedance.lottie.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.q;
import java.util.ArrayList;
import java.util.List;

public final class r implements b, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    public final q.a f40410a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, Float> f40411b;

    /* renamed from: c  reason: collision with root package name */
    public final a<?, Float> f40412c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f40413d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40414e;

    /* renamed from: f  reason: collision with root package name */
    private final List<a.AbstractC0986a> f40415f = new ArrayList();

    static {
        Covode.recordClassIndex(24850);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40414e;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        for (int i2 = 0; i2 < this.f40415f.size(); i2++) {
            this.f40415f.get(i2).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a.AbstractC0986a aVar) {
        this.f40415f.add(aVar);
    }

    public r(com.bytedance.lottie.c.c.a aVar, q qVar) {
        this.f40414e = qVar.f40577a;
        this.f40410a = qVar.f40578b;
        a<Float, Float> a2 = qVar.f40579c.a();
        this.f40411b = a2;
        a<Float, Float> a3 = qVar.f40580d.a();
        this.f40412c = a3;
        a<Float, Float> a4 = qVar.f40581e.a();
        this.f40413d = a4;
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }
}
