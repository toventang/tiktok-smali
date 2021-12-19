package com.bytedance.ies.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.d.a.n;
import com.bytedance.ies.d.a.y;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private y f33265a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<n> f33266b;

    /* renamed from: c  reason: collision with root package name */
    private final m f33267c;

    static {
        Covode.recordClassIndex(19877);
    }

    @Override // com.bytedance.ies.d.a.l
    public final void a() {
        y yVar = this.f33265a;
        if (yVar != null) {
            l.c(this, "");
            yVar.f33269a.remove(this);
        }
    }

    private void a(z zVar) {
        l.c(zVar, "");
        y a2 = this.f33267c.a(zVar, this);
        this.f33265a = a2;
        if (a2 != null) {
            a2.a(this);
        }
    }

    @Override // com.bytedance.ies.d.a.aa
    public final void a(i.c cVar) {
        y.b bVar;
        l.c(cVar, "");
        y yVar = this.f33265a;
        if (yVar == null || (bVar = yVar.f33271c) == null) {
            bVar = y.b.FALLBACK;
        }
        cVar.f33241f = bVar.ordinal();
        n nVar = this.f33266b.get();
        if (nVar == null) {
            return;
        }
        if (nVar instanceof n.a) {
            ((n.a) nVar).a(cVar);
        } else {
            nVar.a(cVar.b());
        }
    }

    @Override // com.bytedance.ies.d.a.aa
    public final void a(Throwable th) {
        l.c(th, "");
        n nVar = this.f33266b.get();
        if (nVar != null) {
            nVar.a(th);
        }
    }

    @Override // com.bytedance.ies.d.a.l
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        a(new z(jSONObject));
    }

    public x(m mVar, n nVar) {
        l.c(mVar, "");
        l.c(nVar, "");
        this.f33267c = mVar;
        this.f33266b = new WeakReference<>(nVar);
    }
}
