package com.bytedance.ies.bullet.c.d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.n;
import com.bytedance.ies.bullet.c.c.t;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.f.a.b.f;
import h.f.a.q;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public d f32075a;

    /* renamed from: b  reason: collision with root package name */
    private final n f32076b = new t();

    /* renamed from: c  reason: collision with root package name */
    private String f32077c = "";

    static {
        Covode.recordClassIndex(18806);
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        if (this.f32075a != null) {
            d dVar = this.f32075a;
            if (dVar == null) {
                l.a("core");
            }
            dVar.b(this.f32076b);
        }
        this.f32076b.a();
    }

    @Override // com.bytedance.ies.bullet.c.d.c
    public final void b(String str) {
        l.c(str, "");
        this.f32077c = str;
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> i a(Class<? extends T> cls) {
        l.c(cls, "");
        return this.f32076b.a(cls);
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final i a(String str) {
        l.c(str, "");
        return this.f32076b.a(str);
    }

    @Override // com.bytedance.ies.bullet.c.d.a
    public final void a(d.b bVar) {
        l.c(bVar, "");
        d a2 = bVar.a();
        a2.a(this.f32076b);
        this.f32075a = a2;
    }

    @Override // com.bytedance.ies.bullet.c.d.c
    public final void a(Uri uri, b bVar, q<? super i, ? super Uri, ? super Boolean, z> qVar, h.f.a.b<? super Throwable, z> bVar2) {
        ArrayList arrayList;
        l.c(uri, "");
        l.c(bVar, "");
        l.c(qVar, "");
        l.c(bVar2, "");
        bVar.b(f.class, new com.bytedance.ies.bullet.service.f.a.b.i());
        com.bytedance.ies.bullet.service.f.a.a aVar = new com.bytedance.ies.bullet.service.f.a.a();
        aVar.a(Uri.class, uri, null);
        Uri b2 = aVar.f32682b.b();
        if (b2 != null) {
            d dVar = this.f32075a;
            if (dVar == null) {
                l.a("core");
            }
            n nVar = this.f32076b;
            com.bytedance.ies.bullet.c.c.z zVar = new com.bytedance.ies.bullet.c.c.z(this.f32077c);
            List<String> b3 = aVar.f32681a.b();
            if (b3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : b3) {
                    if (!p.a((CharSequence) t) && t != null) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = h.a.z.INSTANCE;
            }
            dVar.a(nVar, zVar, b2, arrayList, bVar, qVar, bVar2);
            return;
        }
        bVar2.invoke(new IllegalStateException("bullet uri parse failed ".concat(String.valueOf(uri))));
    }
}
