package com.bytedance.lynx.hybrid;

import android.content.Context;
import android.net.Uri;
import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.c;
import com.bytedance.lynx.hybrid.a.f;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import javax.xml.transform.Transformer;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public final String f40848a = "DefaultLynxViewClient";

    /* renamed from: b  reason: collision with root package name */
    public Uri f40849b;

    /* renamed from: c  reason: collision with root package name */
    public final j f40850c;

    /* renamed from: d  reason: collision with root package name */
    public f f40851d;

    /* renamed from: e  reason: collision with root package name */
    private final IResourceService f40852e;

    /* renamed from: f  reason: collision with root package name */
    private b f40853f;

    static {
        Covode.recordClassIndex(25042);
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void e() {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void f() {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().f();
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void d() {
        c cVar;
        List<o> list;
        j jVar = this.f40850c;
        if (!(jVar == null || (list = jVar.p) == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
        f fVar = this.f40851d;
        if (fVar != null) {
            j jVar2 = this.f40850c;
            if (jVar2 == null || (cVar = jVar2.f40997a) == null) {
                cVar = c.UNKNOWN;
            }
            fVar.a(cVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(o.b bVar) {
        super.b(bVar);
        b bVar2 = this.f40853f;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(LynxPerfMetric lynxPerfMetric) {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(String str) {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(str);
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        List<o> list;
        j jVar2 = this.f40850c;
        if (jVar2 != null && (list = jVar2.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(jVar);
            }
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(o.b bVar) {
        String str;
        super.a(bVar);
        String str2 = null;
        if (!(bVar == null || (str = bVar.f56808c) == null || str.length() == 0 || this.f40853f != null)) {
            try {
                if (bVar != null) {
                    str2 = bVar.f56808c;
                }
                this.f40853f = new b(str2);
            } catch (Exception e2) {
                com.bytedance.lynx.hybrid.j.c.a("FpsTracer failed to initialize : " + e2.getMessage(), com.bytedance.lynx.hybrid.j.b.E, this.f40848a);
            }
        }
        b bVar2 = this.f40853f;
        if (bVar2 != null) {
            bVar2.a();
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        List<o> list;
        j jVar = this.f40850c;
        if (!(jVar == null || (list = jVar.p) == null)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str);
            }
        }
        this.f40849b = Uri.parse(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0218  */
    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.a.d(java.lang.String):java.lang.String");
    }

    public a(j jVar, IResourceService iResourceService) {
        this.f40850c = jVar;
        this.f40852e = iResourceService;
    }

    @Override // com.lynx.tasm.o
    public final void a(String str, String str2, int i2) {
        List<o> list;
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2, i2);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    public final void a(Context context, String str, String str2, float f2, float f3, Transformer transformer, f.a aVar) {
        List<o> list;
        l.c(context, "");
        l.c(aVar, "");
        j jVar = this.f40850c;
        if (jVar != null && (list = jVar.p) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(context, str, str2, f2, f3, transformer, aVar);
            }
        }
    }
}
