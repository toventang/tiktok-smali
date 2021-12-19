package com.airbnb.lottie.a.a;

import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.q;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class s implements c, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    public final q.a f5251a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, Float> f5252b;

    /* renamed from: c  reason: collision with root package name */
    public final a<?, Float> f5253c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Float> f5254d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5255e;

    /* renamed from: f  reason: collision with root package name */
    private final List<a.AbstractC0073a> f5256f = new ArrayList();

    static {
        Covode.recordClassIndex(2206);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5255e;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        for (int i2 = 0; i2 < this.f5256f.size(); i2++) {
            this.f5256f.get(i2).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a.AbstractC0073a aVar) {
        this.f5256f.add(aVar);
    }

    public s(com.airbnb.lottie.e.c.a aVar, q qVar) {
        this.f5255e = qVar.f5453a;
        this.f5251a = qVar.f5454b;
        a<Float, Float> a2 = qVar.f5455c.a();
        this.f5252b = a2;
        a<Float, Float> a3 = qVar.f5456d.a();
        this.f5253c = a3;
        a<Float, Float> a4 = qVar.f5457e.a();
        this.f5254d = a4;
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }
}
