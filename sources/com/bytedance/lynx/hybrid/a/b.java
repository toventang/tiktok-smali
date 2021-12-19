package com.bytedance.lynx.hybrid.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.h.a;
import com.bytedance.lynx.hybrid.j.f;
import h.f.b.l;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final a f40854a;

    /* renamed from: b  reason: collision with root package name */
    public final f f40855b;

    static {
        Covode.recordClassIndex(25044);
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void a() {
        f.a(this.f40854a.f40979f, "prepare_component_start", System.currentTimeMillis());
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void b() {
        f.a(this.f40854a.f40979f, "prepare_component_end", System.currentTimeMillis());
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void c() {
        String str = this.f40854a.f40979f;
        l.c(str, "");
        l.c(str, "");
        com.bytedance.android.monitorV2.i.b.b("ContainerStandardApi", "invalidateID [monitorId:" + str + ']');
        l.c(str, "");
        com.bytedance.android.monitorV2.k.a.f24005a.remove(str);
        com.bytedance.android.monitorV2.k.a.f24006b.remove(str);
        c a2 = c.a.a();
        a aVar = this.f40854a;
        l.c(aVar, "");
        a2.f40903c.remove(aVar);
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void a(c cVar) {
        l.c(cVar, "");
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.a(cVar);
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void a(h hVar) {
        l.c(hVar, "");
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.a(hVar);
        }
    }

    public b(a aVar, f fVar) {
        l.c(aVar, "");
        this.f40854a = aVar;
        this.f40855b = fVar;
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void b(h hVar, String str) {
        l.c(hVar, "");
        l.c(str, "");
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.b(hVar, str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void a(h hVar, String str) {
        l.c(hVar, "");
        l.c(str, "");
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.a(hVar, str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.a.f
    public final void a(h hVar, String str, String str2) {
        l.c(hVar, "");
        l.c(str, "");
        f fVar = this.f40855b;
        if (fVar != null) {
            fVar.a(hVar, str, str2);
        }
    }
}
