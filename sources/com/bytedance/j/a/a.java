package com.bytedance.j.a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.e.b;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.f.b.l;
import java.util.Iterator;
import javax.xml.transform.Transformer;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public Uri f38938a;

    /* renamed from: b  reason: collision with root package name */
    public final c f38939b;

    /* renamed from: c  reason: collision with root package name */
    private final IResourceLoaderService f38940c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.ies.bullet.service.base.a.o f38941d;

    /* renamed from: e  reason: collision with root package name */
    private b f38942e;

    static {
        Covode.recordClassIndex(23852);
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.lynx.tasm.o
    public final void d() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // com.lynx.tasm.o
    public final void e() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // com.lynx.tasm.o
    public final void f() {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(LynxPerfMetric lynxPerfMetric) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().b(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(String str) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a(jVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
        this.f38938a = Uri.parse(str);
        Uri uri = this.f38938a;
        if (uri == null) {
            l.a();
        }
        this.f38942e = new b(uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0112 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115  */
    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.j.a.a.d(java.lang.String):java.lang.String");
    }

    public a(c cVar, IResourceLoaderService iResourceLoaderService, com.bytedance.ies.bullet.service.base.a.o oVar) {
        l.c(cVar, "");
        this.f38939b = cVar;
        this.f38940c = iResourceLoaderService;
        this.f38941d = oVar;
    }

    @Override // com.lynx.tasm.o
    public final void a(String str, String str2, int i2) {
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2, i2);
        }
    }

    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    public final void a(Context context, String str, String str2, float f2, float f3, Transformer transformer, f.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        Iterator<T> it = this.f38939b.f38972m.iterator();
        while (it.hasNext()) {
            it.next().a(context, str, str2, f2, f3, transformer, aVar);
        }
    }
}
