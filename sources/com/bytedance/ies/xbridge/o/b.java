package com.bytedance.ies.xbridge.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.c;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f;
import h.f.b.l;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f36360a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(21785);
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map.Entry f36361a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f36362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36363c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.model.b.c f36364d;

        static {
            Covode.recordClassIndex(21786);
        }

        @Override // com.bytedance.ies.xbridge.c
        public final com.bytedance.ies.xbridge.b a() {
            com.bytedance.ies.xbridge.b bVar = (com.bytedance.ies.xbridge.b) ((Class) this.f36361a.getValue()).newInstance();
            bVar.a(this.f36364d);
            l.a((Object) bVar, "");
            return bVar;
        }

        public a(Map.Entry entry, f fVar, e eVar, com.bytedance.ies.xbridge.model.b.c cVar) {
            this.f36361a = entry;
            this.f36362b = fVar;
            this.f36363c = eVar;
            this.f36364d = cVar;
        }
    }
}
