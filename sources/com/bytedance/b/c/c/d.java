package com.bytedance.b.c.c;

import com.bytedance.b.j.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26091a;

    /* renamed from: b  reason: collision with root package name */
    public c f26092b;

    /* renamed from: c  reason: collision with root package name */
    public g f26093c;

    /* renamed from: d  reason: collision with root package name */
    public g f26094d;

    /* renamed from: e  reason: collision with root package name */
    public g f26095e;

    /* renamed from: f  reason: collision with root package name */
    public g f26096f;

    /* renamed from: g  reason: collision with root package name */
    public g f26097g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26098h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f26099i;

    /* renamed from: j  reason: collision with root package name */
    private a f26100j;

    /* renamed from: k  reason: collision with root package name */
    private g f26101k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.b.c.b.c f26102l;

    static {
        Covode.recordClassIndex(15183);
    }

    public final synchronized void b() {
        a(this.f26097g);
    }

    public final synchronized void c() {
        a(this.f26093c);
    }

    public final synchronized void d() {
        a(this.f26094d);
    }

    public final synchronized void e() {
        a(this.f26095e);
    }

    public final synchronized void f() {
        a(this.f26096f);
    }

    public final synchronized void a() {
        g gVar = this.f26101k;
        if (gVar != null) {
            if (this.f26098h) {
                gVar.a();
                this.f26098h = false;
            }
        }
    }

    public d(a aVar) {
        this.f26100j = aVar;
    }

    private void a(g gVar) {
        boolean z;
        if (this.f26098h && this.f26091a) {
            this.f26101k = gVar;
            com.bytedance.b.c.b.c cVar = this.f26102l;
            a aVar = this.f26100j;
            if (aVar == null || !aVar.a()) {
                z = true;
            } else {
                z = false;
            }
            gVar.a(cVar, z);
        }
    }

    public final synchronized void a(com.bytedance.b.c.b.c cVar) {
        if (!this.f26098h) {
            if (this.f26091a) {
                this.f26102l = cVar;
                boolean z = true;
                this.f26098h = true;
                b.f26082a = com.bytedance.b.c.a.a().b();
                if (this.f26100j.a()) {
                    z = false;
                }
                this.f26099i = z;
                c();
            }
        }
    }

    public final synchronized void a(boolean z) {
        g gVar = this.f26101k;
        if (gVar != null) {
            if (this.f26098h) {
                if (this.f26099i != z) {
                    this.f26099i = z;
                    gVar.a(z);
                }
            }
        }
    }
}
