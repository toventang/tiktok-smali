package com.ss.android.ugc.aweme.ecommerce.pdp.repository.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b;
import f.a.t;
import h.f.b.l;
import java.util.Map;
import l.b.o;

public interface PdpApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86537a = a.f86539b;

    static {
        Covode.recordClassIndex(54213);
    }

    @o(a = "/api/v1/shop/product_info/get")
    t<b> getProductInfo(@l.b.a Map<String, Object> map);

    @o(a = "/api/v1/shop/product_info/batch")
    t<b> getProductInfoBatch(@l.b.a Map<String, Object> map);

    @o(a = "https://oec-api.tiktokv.com/aweme/v1/oec/creator_union/chain_collector/visit_event/report")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<Object>> reportEnterPdp(@l.b.a Map<String, Object> map);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final f f86538a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f86539b = new a();

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi$a$a  reason: collision with other inner class name */
        public static final class C2086a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C2086a f86540a = new C2086a();

            static {
                Covode.recordClassIndex(54215);
            }

            C2086a() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f86541a = new b();

            static {
                Covode.recordClassIndex(54216);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c implements f.a.d.a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f86542a = new c();

            static {
                Covode.recordClassIndex(54217);
            }

            c() {
            }

            @Override // f.a.d.a
            public final void a() {
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f86543a = new d();

            static {
                Covode.recordClassIndex(54218);
            }

            d() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(54214);
        }

        public static void a(Map<String, Object> map) {
            l.d(map, "");
            map.put("click_time_millis", Long.valueOf(System.currentTimeMillis()));
            map.put("request_time_millis", Long.valueOf(System.currentTimeMillis()));
            ((PdpApi) f86538a.a(PdpApi.class)).reportEnterPdp(map).b(f.a.h.a.b(f.a.k.a.f158006c)).a(C2086a.f86540a, b.f86541a, c.f86542a, d.f86543a);
        }
    }
}
