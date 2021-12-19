package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.ss.android.ugc.aweme.IApiGuardService;
import com.ss.android.ugc.aweme.account.apiguard.ApiGuardService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;

public final class b implements b.e, b.f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f112363a = i.a((h.f.a.a) C2870b.f112365a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f112364b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(72207);
        }

        public static IApiGuardService a() {
            return (IApiGuardService) b.f112363a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.i.b$b  reason: collision with other inner class name */
    static final class C2870b extends m implements h.f.a.a<IApiGuardService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2870b f112365a = new C2870b();

        static {
            Covode.recordClassIndex(72208);
        }

        C2870b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IApiGuardService invoke() {
            return ApiGuardService.createIApiGuardServicebyMonsterPlugin(false);
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    static {
        Covode.recordClassIndex(72206);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.f
    public final void a(g<?> gVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        if (!(!l.a(aVar.a(this), (Object) true))) {
            a.a().parseHeaders(gVar);
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        Map<String, String> appendHeaders;
        l.d(fVar, "");
        l.d(aVar, "");
        if (a.a().isEnabled() && (appendHeaders = a.a().appendHeaders(fVar)) != null) {
            for (Map.Entry<String, String> entry : appendHeaders.entrySet()) {
                fVar.f35270c.a(entry.getKey(), entry.getValue());
            }
            aVar.a(this, true);
        }
    }
}
