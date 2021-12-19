package com.bytedance.ies.ugc.network.partner;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f35245a;

    /* renamed from: b  reason: collision with root package name */
    public final s f35246b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.ugc.network.partner.a.a f35247c = new com.bytedance.ies.ugc.network.partner.a.a();

    /* renamed from: d  reason: collision with root package name */
    private final h f35248d = i.a((h.f.a.a) C0799a.f35256a);

    static {
        Covode.recordClassIndex(21115);
    }

    private final Map<? super b, Object> a() {
        return (Map) this.f35248d.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.a$a  reason: collision with other inner class name */
    static final class C0799a extends m implements h.f.a.a<Map<b, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0799a f35256a = new C0799a();

        static {
            Covode.recordClassIndex(21116);
        }

        C0799a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<b, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public final Object a(b bVar) {
        l.d(bVar, "");
        return a().get(bVar);
    }

    public a(a.AbstractC1036a aVar) {
        l.d(aVar, "");
        this.f35245a = aVar.b();
        this.f35246b = aVar.c();
    }

    public final void a(b bVar, Object obj) {
        l.d(bVar, "");
        if (obj == null) {
            a().remove(bVar);
        } else {
            a().put(bVar, obj);
        }
    }
}
