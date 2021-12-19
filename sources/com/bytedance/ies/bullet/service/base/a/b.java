package com.bytedance.ies.bullet.service.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.m;
import h.f.b.l;

public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    private final q f32519a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32520b;

    /* renamed from: c  reason: collision with root package name */
    private final m f32521c;

    static {
        Covode.recordClassIndex(19281);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final String f() {
        return this.f32520b;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final m g() {
        return this.f32521c;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return this.f32519a;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T> T a_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.o
    public final <T extends c> T b_(Class<T> cls) {
        l.c(cls, "");
        return (T) o.a.a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        o.a.a(this, th, str);
    }

    public b(String str, m mVar) {
        l.c(str, "");
        l.c(mVar, "");
        this.f32520b = str;
        this.f32521c = mVar;
        this.f32519a = new q((m) e.a.a().a(str, m.class), "Token");
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        o.a.a(this, str, pVar, str2);
    }
}
