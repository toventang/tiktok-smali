package com.bytedance.ies.bullet.service.f.a.b;

import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.l;

public class m<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f32706a;

    /* renamed from: b  reason: collision with root package name */
    public final T f32707b;

    /* renamed from: c  reason: collision with root package name */
    private T f32708c;

    /* renamed from: d  reason: collision with root package name */
    private f f32709d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32710e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32711f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32712g;

    static {
        Covode.recordClassIndex(19454);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final String a() {
        return this.f32712g;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final boolean c() {
        b();
        return this.f32711f;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final T b() {
        f fVar;
        if (!this.f32710e && !this.f32711f && (fVar = this.f32709d) != null) {
            fVar.a(this);
            this.f32710e = true;
        }
        T t = this.f32708c;
        if (t == null) {
            return this.f32707b;
        }
        return t;
    }

    public String toString() {
        return "Param(" + this.f32706a + "){key: " + this.f32712g + ", value: " + ((Object) b()) + '}';
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final void a(f fVar) {
        this.f32709d = fVar;
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final void a(T t) {
        this.f32708c = t;
        this.f32711f = true;
    }

    public /* synthetic */ m(String str, e eVar) {
        this(str, eVar, null);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final <R> void a(Class<R> cls, R r) {
        T invoke;
        l.c(cls, "");
        h.f.a.m<R, String, T> a2 = this.f32706a.a(cls);
        if (a2 != null && (invoke = a2.invoke(r, this.f32712g)) != null) {
            a((Object) invoke);
        }
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.d
    public final <R> R b(Class<R> cls, R r) {
        T t;
        l.c(cls, "");
        q<R, String, T, R> b2 = this.f32706a.b(cls);
        if (b2 == null || (t = this.f32708c) == null) {
            return r;
        }
        return b2.invoke(r, this.f32712g, t);
    }

    public m(String str, e<T> eVar, T t) {
        l.c(str, "");
        l.c(eVar, "");
        this.f32712g = str;
        this.f32706a = eVar;
        this.f32707b = t;
    }
}
