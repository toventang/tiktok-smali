package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.m;
import h.f.b.l;
import h.f.b.z;
import h.h;
import h.i;
import h.z;
import java.util.Map;

public final class CWebViewInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static String f78851a;

    /* renamed from: b  reason: collision with root package name */
    static String f78852b;

    /* renamed from: c  reason: collision with root package name */
    public static final CWebViewInterceptor f78853c = new CWebViewInterceptor();

    /* renamed from: d  reason: collision with root package name */
    private static final h f78854d = i.a((h.f.a.a) b.f78855a);

    interface Api {
        static {
            Covode.recordClassIndex(48919);
        }

        @com.bytedance.retrofit2.b.h
        com.bytedance.retrofit2.b<String> getResponse(@ag String str, @m Map<String, String> map);
    }

    private CWebViewInterceptor() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.crossplatform.d.b $commerceInfo$inlined;
        final /* synthetic */ z.e $origin$inlined;
        final /* synthetic */ Map $responseHeader$inlined;

        static {
            Covode.recordClassIndex(48920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z.e eVar, Map map, com.ss.android.ugc.aweme.crossplatform.d.b bVar) {
            super(0);
            this.$origin$inlined = eVar;
            this.$responseHeader$inlined = map;
            this.$commerceInfo$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            CWebViewInterceptor.f78852b = CWebViewInterceptor.f78851a;
            com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "adx_ad_load_success", String.valueOf(this.$commerceInfo$inlined.f78759a), this.$commerceInfo$inlined.f78767i, null).a("web_url", CWebViewInterceptor.f78851a).b();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78855a = new b();

        static {
            Covode.recordClassIndex(48921);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            f d2 = com.bytedance.ies.ugc.aweme.network.ext.a.b("https://securepubads.g.doubleclick.net/").a().d();
            l.b(d2, "");
            return d2.a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(48918);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.webkit.WebResourceResponse a(java.lang.String r11, android.webkit.WebResourceRequest r12, com.ss.android.ugc.aweme.crossplatform.d.b r13) {
        /*
        // Method dump skipped, instructions count: 541
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor.a(java.lang.String, android.webkit.WebResourceRequest, com.ss.android.ugc.aweme.crossplatform.d.b):android.webkit.WebResourceResponse");
    }
}
