package com.facebook.imagepipeline.f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.k.c;
import com.facebook.imagepipeline.n.ak;
import com.facebook.imagepipeline.n.au;
import com.facebook.imagepipeline.n.b;
import com.facebook.imagepipeline.n.d;

public abstract class a<T> extends com.facebook.d.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final au f47959a;

    /* renamed from: b  reason: collision with root package name */
    private final c f47960b;

    static {
        Covode.recordClassIndex(28996);
    }

    public final synchronized void h() {
        i.b(a());
    }

    @Override // com.facebook.d.c, com.facebook.d.a
    public final boolean g() {
        if (!super.g()) {
            return false;
        }
        if (super.b()) {
            return true;
        }
        this.f47960b.onRequestCancellation(this.f47959a.f48308b);
        d.a(this.f47959a.i());
        return true;
    }

    public final void b(Throwable th) {
        if (super.a(th)) {
            this.f47960b.onRequestFailure(this.f47959a.f48307a, this.f47959a.f48308b, th, this.f47959a.f());
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t, int i2) {
        boolean a2 = b.a(i2);
        if (super.a(t, a2) && a2) {
            this.f47960b.onRequestSuccess(this.f47959a.f48307a, this.f47959a.f48308b, this.f47959a.f());
        }
    }

    protected a(ak<T> akVar, au auVar, c cVar) {
        com.facebook.imagepipeline.p.b.a();
        this.f47959a = auVar;
        this.f47960b = cVar;
        com.facebook.imagepipeline.p.b.a();
        cVar.onRequestStart(auVar.f48307a, auVar.f48309c, auVar.f48308b, auVar.f());
        com.facebook.imagepipeline.p.b.a();
        com.facebook.imagepipeline.p.b.a();
        akVar.a(new b<T>() {
            /* class com.facebook.imagepipeline.f.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28997);
            }

            @Override // com.facebook.imagepipeline.n.b
            public final void a() {
                a.this.h();
            }

            @Override // com.facebook.imagepipeline.n.b
            public final void a(float f2) {
                a.this.a(f2);
            }

            @Override // com.facebook.imagepipeline.n.b
            public final void a(Throwable th) {
                a.this.b(th);
            }

            @Override // com.facebook.imagepipeline.n.b
            public final void a(T t, int i2) {
                a.this.a(t, i2);
            }
        }, auVar);
        com.facebook.imagepipeline.p.b.a();
        com.facebook.imagepipeline.p.b.a();
    }
}
