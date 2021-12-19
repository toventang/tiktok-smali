package com.bytedance.b.c.c.a;

import com.bytedance.b.c.c.a;
import com.bytedance.b.c.c.d;
import com.bytedance.b.k.d.b;
import com.bytedance.covode.number.Covode;

final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f26061b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.b.k.d.a f26062c;

    static {
        Covode.recordClassIndex(15171);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a() {
        super.a();
        b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).b(this.f26062c);
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a(boolean z) {
        super.a(z);
        this.f26061b = z;
    }

    public c(final d dVar) {
        super(dVar);
        long j2;
        if (this.f26061b) {
            j2 = 1200000;
        } else {
            j2 = 120000;
        }
        this.f26062c = new com.bytedance.b.k.d.a(j2) {
            /* class com.bytedance.b.c.c.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15172);
            }

            public final void run() {
                boolean z = c.this.f26061b;
                dVar.b();
            }
        };
    }

    @Override // com.bytedance.b.c.c.g, com.bytedance.b.c.c.a
    public final void a(com.bytedance.b.c.b.c cVar, boolean z) {
        super.a(cVar, z);
        b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(this.f26062c);
    }
}
