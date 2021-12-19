package com.bytedance.b.c.c.a;

import com.bytedance.b.c.b.c;
import com.bytedance.b.c.c.d;
import com.bytedance.b.c.c.e;
import com.bytedance.b.k.d.b;
import com.bytedance.covode.number.Covode;

public abstract class a extends com.bytedance.b.c.c.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f26052b;

    /* renamed from: c  reason: collision with root package name */
    private c f26053c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.b.k.d.a f26054d = new com.bytedance.b.k.d.a(c(), c()) {
        /* class com.bytedance.b.c.c.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15169);
        }

        public final void run() {
            a.this.b();
        }
    };

    static {
        Covode.recordClassIndex(15168);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(boolean z);

    /* access modifiers changed from: protected */
    public abstract long c();

    /* access modifiers changed from: protected */
    public abstract boolean d();

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a() {
        super.a();
        b.a(com.bytedance.b.k.d.c.IO).b(this.f26054d);
    }

    public final void b() {
        boolean z;
        if (!com.bytedance.b.c.c.b.a()) {
            double a2 = e.a();
            com.bytedance.z.a.a.c cVar = this.f26051a.f26092b;
            if (cVar == null || (z = cVar.a((float) a2))) {
                z = com.bytedance.b.c.c.b.a(this.f26053c, a2, this.f26052b);
            }
            if (b(z)) {
                b.a(com.bytedance.b.k.d.c.IO).b(this.f26054d);
            }
        } else if (d()) {
            b.a(com.bytedance.b.k.d.c.IO).b(this.f26054d);
        }
    }

    public a(d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public void a(boolean z) {
        super.a(z);
        b.a(com.bytedance.b.k.d.c.IO).b(this.f26054d);
        this.f26051a.b();
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a(c cVar, boolean z) {
        super.a(cVar, z);
        this.f26053c = cVar;
        this.f26052b = z;
        b.a(com.bytedance.b.k.d.c.IO).a(this.f26054d);
    }
}
