package com.bytedance.provider.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.provider.d;
import com.bytedance.provider.g;
import h.f.b.l;

public final class c implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final c f42017b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final g f42018c = b.f42020f;

    /* renamed from: d  reason: collision with root package name */
    private static final String f42019d = "GScope_Key";

    private c() {
    }

    @Override // com.bytedance.provider.d
    public final g a() {
        return f42018c;
    }

    public static final class a extends RuntimeException {
        static {
            Covode.recordClassIndex(25693);
        }

        public a() {
            super("Don't operate on GScope");
        }
    }

    public static final class b extends g {

        /* renamed from: f  reason: collision with root package name */
        public static final b f42020f = new b();

        private b() {
            super(c.f42017b);
        }

        @Override // com.bytedance.provider.g
        public final d a() {
            throw new a();
        }

        @Override // com.bytedance.provider.g
        public final void b() {
            throw new a();
        }

        static {
            Covode.recordClassIndex(25694);
        }

        @Override // com.bytedance.provider.g
        public final void a(d dVar, d.a aVar) {
            l.c(dVar, "");
            l.c(aVar, "");
            throw new a();
        }
    }

    static {
        Covode.recordClassIndex(25692);
    }
}
