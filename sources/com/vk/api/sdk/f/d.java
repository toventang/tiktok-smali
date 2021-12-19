package com.vk.api.sdk.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<T> f156323a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadLocal<T> f156324b = new a(this);

    static {
        Covode.recordClassIndex(103815);
    }

    public static final class a extends ThreadLocal<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f156325a;

        static {
            Covode.recordClassIndex(103816);
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return this.f156325a.f156323a.invoke();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f156325a = dVar;
        }
    }

    @Override // com.vk.api.sdk.f.c
    public final T a() {
        T t = this.f156324b.get();
        if (t == null) {
            l.a();
        }
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(h.f.a.a<? extends T> aVar) {
        l.c(aVar, "");
        this.f156323a = aVar;
    }
}
