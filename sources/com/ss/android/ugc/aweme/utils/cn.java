package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.z;
import h.f.a.a;
import h.f.b.l;

public final class cn<T> implements b, z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<T, h.z> f142778a;

    /* renamed from: b  reason: collision with root package name */
    public final a<h.z> f142779b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<Throwable, h.z> f142780c;

    /* renamed from: d  reason: collision with root package name */
    private b f142781d;

    static {
        Covode.recordClassIndex(93395);
    }

    public cn() {
        this(null, null, null, 7);
    }

    @Override // f.a.b.b
    public final void dispose() {
        b bVar = this.f142781d;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        b bVar = this.f142781d;
        if (bVar != null) {
            return bVar.isDisposed();
        }
        return true;
    }

    @Override // f.a.z
    public final void onComplete() {
        try {
            this.f142779b.invoke();
        } catch (Exception e2) {
            onError(e2);
        } finally {
            dispose();
        }
    }

    @Override // f.a.z
    public final void onSubscribe(b bVar) {
        l.d(bVar, "");
        this.f142781d = bVar;
    }

    @Override // f.a.z
    public final void onError(Throwable th) {
        l.d(th, "");
        try {
            this.f142780c.invoke(th);
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            dispose();
        }
    }

    @Override // f.a.z
    public final void onNext(T t) {
        try {
            this.f142778a.invoke(t);
        } catch (Throwable th) {
            onError(th);
        } finally {
            dispose();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private cn(h.f.a.b<? super T, h.z> bVar, a<h.z> aVar, h.f.a.b<? super Throwable, h.z> bVar2) {
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(bVar2, "");
        this.f142778a = bVar;
        this.f142779b = aVar;
        this.f142780c = bVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn(h.f.a.b bVar, a aVar, h.f.a.b bVar2, int i2) {
        this((i2 & 1) != 0 ? AnonymousClass1.f142782a : bVar, (i2 & 2) != 0 ? AnonymousClass2.f142783a : aVar, (i2 & 4) != 0 ? AnonymousClass3.f142784a : bVar2);
    }
}
