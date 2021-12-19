package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33218a = true;

    /* renamed from: b  reason: collision with root package name */
    public final String f33219b;

    /* renamed from: c  reason: collision with root package name */
    public final j f33220c;

    /* renamed from: d  reason: collision with root package name */
    public final e f33221d;

    static {
        Covode.recordClassIndex(19841);
    }

    @Override // com.bytedance.ies.d.a.m
    public final void a(String str) {
        l.c(str, "");
        if (this.f33218a) {
            this.f33220c.a(str);
        }
    }

    @Override // com.bytedance.ies.d.a.m
    public final List<y> b(String str) {
        l.c(str, "");
        if (this.f33218a) {
            return this.f33220c.b(str);
        }
        return null;
    }

    @Override // com.bytedance.ies.d.a.m
    public final y a(z zVar, aa aaVar) {
        l.c(zVar, "");
        l.c(aaVar, "");
        if (this.f33218a) {
            return this.f33220c.a(zVar, aaVar);
        }
        return this.f33220c.b(zVar, aaVar);
    }

    public b(String str, j jVar, e eVar) {
        l.c(str, "");
        l.c(jVar, "");
        l.c(eVar, "");
        this.f33219b = str;
        this.f33220c = jVar;
        this.f33221d = eVar;
    }
}
