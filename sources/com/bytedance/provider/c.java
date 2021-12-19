package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.h;
import f.a.d.f;
import f.a.l.b;
import f.a.t;
import h.f.b.l;

public final class c<T extends h> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    final t<T> f41992a;

    /* renamed from: b  reason: collision with root package name */
    public String f41993b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f41994c;

    static {
        Covode.recordClassIndex(25670);
    }

    @Override // com.bytedance.provider.b
    public final T a() {
        T i2 = this.f41994c.i();
        if (i2 == null) {
            l.a();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f41995a;

        static {
            Covode.recordClassIndex(25671);
        }

        a(f fVar) {
            this.f41995a = fVar;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.f41995a.accept(obj);
        }
    }

    public c(T t) {
        l.c(t, "");
        b<T> a2 = b.a(t);
        l.a((Object) a2, "");
        this.f41994c = a2;
        this.f41992a = a2.c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.l.b<T extends com.bytedance.provider.h> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.provider.b
    public final void a(h.f.a.b<? super T, ? extends T> bVar) {
        l.c(bVar, "");
        this.f41993b = a().getSourceId();
        this.f41994c.onNext(bVar.invoke(a()));
    }
}
