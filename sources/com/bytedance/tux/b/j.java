package com.bytedance.tux.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.k.c;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, b> f44696a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    final Map<Integer, b<h, z>> f44697b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<Integer, i> f44698c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(27324);
    }

    public final j a(int i2, b<? super h, z> bVar) {
        l.c(bVar, "");
        if (f.f44676a) {
            this.f44697b.put(Integer.valueOf(i2), bVar);
            return this;
        }
        h hVar = new h();
        bVar.invoke(hVar);
        this.f44696a.put(Integer.valueOf(i2), hVar.a());
        return this;
    }

    public final void a(int i2, c<?> cVar, boolean z) {
        i iVar = new i(i2, cVar, z);
        this.f44698c.put(Integer.valueOf(iVar.f44693a), iVar);
        if (f.f44676a) {
            this.f44698c.put(Integer.valueOf(i2), iVar);
            return;
        }
        new h();
        this.f44696a.put(Integer.valueOf(i2), h.a(iVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.tux.b.j */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(j jVar, int i2, c cVar, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            cVar = null;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        jVar.a(i2, cVar, z);
    }
}
