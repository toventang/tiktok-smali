package com.bytedance.sdk.xbridge.protocol;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.b;
import com.bytedance.sdk.xbridge.protocol.c.e;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f43951b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static com.bytedance.sdk.xbridge.protocol.impl.a.a f43952c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f43953d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f43954a;

    public static final class a {
        static {
            Covode.recordClassIndex(26852);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(26851);
    }

    public c() {
        a aVar = new a();
        this.f43954a = aVar;
        aVar.f43919a = new com.bytedance.sdk.xbridge.protocol.b.a();
        if (com.bytedance.sdk.xbridge.registry.core_api.b.a.f44061a == null) {
            b bVar = b.f43912b;
            l.c(bVar, "");
            com.bytedance.sdk.xbridge.registry.core_api.b.a.f44061a = bVar;
        }
    }

    public final void a(e eVar) {
        l.c(eVar, "");
        a aVar = this.f43954a;
        l.c(eVar, "");
        aVar.f43924f.add(eVar);
    }
}
