package com.bytedance.b.c.c.a;

import com.bytedance.b.c.c.f;
import com.bytedance.b.c.c.g;
import com.bytedance.b.j.c;
import com.bytedance.b.j.d.a;
import com.bytedance.b.j.d.b;
import com.bytedance.covode.number.Covode;

public final class d extends b implements f {

    /* renamed from: a  reason: collision with root package name */
    private volatile com.bytedance.b.c.c.d f26065a = new com.bytedance.b.c.c.d(this.f26066b);

    /* renamed from: b  reason: collision with root package name */
    private a f26066b = ((a) c.a(a.class));

    /* renamed from: c  reason: collision with root package name */
    private g f26067c = new f(this.f26065a);

    /* renamed from: d  reason: collision with root package name */
    private g f26068d = new g(this.f26065a);

    /* renamed from: e  reason: collision with root package name */
    private g f26069e = new h(this.f26065a);

    /* renamed from: f  reason: collision with root package name */
    private g f26070f = new c(this.f26065a);

    /* renamed from: g  reason: collision with root package name */
    private g f26071g = new e(this.f26065a);

    static {
        Covode.recordClassIndex(15173);
    }

    @Override // com.bytedance.b.j.d.b, com.bytedance.b.j.d.c
    public final void a() {
        this.f26065a.a(false);
    }

    @Override // com.bytedance.b.j.d.b, com.bytedance.b.j.d.c
    public final void b() {
        this.f26065a.a(true);
    }

    @Override // com.bytedance.b.c.c.f
    public final void c() {
        this.f26065a.a();
    }

    public d() {
        com.bytedance.b.c.c.d dVar = this.f26065a;
        g gVar = this.f26067c;
        g gVar2 = this.f26068d;
        g gVar3 = this.f26069e;
        g gVar4 = this.f26070f;
        g gVar5 = this.f26071g;
        if (!dVar.f26091a) {
            dVar.f26093c = gVar;
            dVar.f26094d = gVar2;
            dVar.f26095e = gVar3;
            dVar.f26096f = gVar4;
            dVar.f26097g = gVar5;
            try {
                dVar.f26092b = com.bytedance.z.a.a.b.a(com.bytedance.apm.c.f24685a);
            } catch (Throwable unused) {
            }
            dVar.f26091a = true;
        }
        this.f26066b.a(this);
    }

    @Override // com.bytedance.b.c.c.f
    public final void a(com.bytedance.b.c.b.c cVar) {
        this.f26065a.a(cVar);
    }
}
