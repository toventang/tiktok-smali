package com.bytedance.b.c.c;

import com.bytedance.b.c.a;
import com.bytedance.b.c.c.a.d;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f26083a;

    /* renamed from: b  reason: collision with root package name */
    public a.b f26084b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26085c;

    /* renamed from: d  reason: collision with root package name */
    private f f26086d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.b.c.b.c f26087e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26088f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26089g;

    static {
        Covode.recordClassIndex(15181);
    }

    public final synchronized boolean a() {
        return this.f26088f;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f26090a = new c((byte) 0);

        static {
            Covode.recordClassIndex(15182);
        }
    }

    private c() {
        this.f26086d = new d();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final synchronized void a(com.bytedance.b.c.b.c cVar) {
        if (cVar != null) {
            if (com.bytedance.b.e.a.a.c() || cVar.f26048f) {
                this.f26087e = cVar;
                if (this.f26089g) {
                    if (!this.f26085c) {
                        this.f26085c = true;
                        this.f26088f = true;
                        this.f26086d.a(cVar);
                    }
                } else if (cVar.f26043a) {
                    this.f26085c = true;
                    this.f26088f = true;
                    this.f26086d.a(cVar);
                } else {
                    this.f26085c = false;
                    this.f26086d.c();
                }
            }
        }
    }
}
