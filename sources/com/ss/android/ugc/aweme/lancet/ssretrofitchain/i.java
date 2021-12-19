package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.d.e;
import com.ss.android.ugc.aweme.base.d.f;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.g;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import java.util.List;
import org.json.JSONObject;

public final class i extends c {
    static {
        Covode.recordClassIndex(68620);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    static final class a extends m implements b<com.bytedance.retrofit2.client.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107272a = new a();

        static {
            Covode.recordClassIndex(68621);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.bytedance.retrofit2.client.b bVar) {
            com.bytedance.retrofit2.client.b bVar2 = bVar;
            l.b(bVar2, "");
            return Boolean.valueOf(l.a((Object) bVar2.f42471a, (Object) "x-tt-logid"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u<?> uVar) {
        g.a aVar;
        String str;
        g.a aVar2;
        com.bytedance.retrofit2.client.b bVar;
        String path;
        String str2 = "";
        if (gVar != null && (aVar2 = gVar.f107266a) != null && aVar2.f107268a == 9) {
            com.ss.android.ugc.d.a.c.a(new e());
            if (request != null) {
                try {
                    List<com.bytedance.retrofit2.client.b> headers = request.getHeaders();
                    if (headers != null) {
                        bVar = (com.bytedance.retrofit2.client.b) k.c(k.a(n.t(headers), (b) a.f107272a));
                        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                        if (request == null || (r0 = request.getPath()) == null) {
                            String str3 = str2;
                        }
                        com.ss.android.ugc.aweme.app.f.c a2 = cVar.a("URL", str3).a("errorCode", (Integer) 8);
                        if (bVar == null || (r0 = bVar.f42472b) == null) {
                            String str4 = str2;
                        }
                        JSONObject a3 = a2.a("x-tt-logid", str4).a();
                        l.b(a3, str2);
                        com.ss.android.ugc.aweme.account.m.b.a("request_force_logout_log", 0, a3);
                        return new c.a(true, false);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com.ss.android.ugc.aweme.app.f.c cVar2 = new com.ss.android.ugc.aweme.app.f.c();
                    if (!(request == null || (path = request.getPath()) == null)) {
                        str2 = path;
                    }
                    com.bytedance.apm.b.a("request_force_logout_log", 0, cVar2.a("URL", str2).a("errorCode", (Integer) 9).a("error_desc", Log.getStackTraceString(e2)).a());
                }
            }
            bVar = null;
            com.ss.android.ugc.aweme.app.f.c cVar3 = new com.ss.android.ugc.aweme.app.f.c();
            String str32 = str2;
            com.ss.android.ugc.aweme.app.f.c a22 = cVar3.a("URL", str32).a("errorCode", (Integer) 8);
            String str42 = str2;
            JSONObject a32 = a22.a("x-tt-logid", str42).a();
            l.b(a32, str2);
            com.ss.android.ugc.aweme.account.m.b.a("request_force_logout_log", 0, a32);
            return new c.a(true, false);
        } else if (gVar == null || (aVar = gVar.f107266a) == null || aVar.f107268a != 14) {
            c.a aVar3 = b.f107258a;
            l.b(aVar3, str2);
            return aVar3;
        } else {
            g.a aVar4 = gVar.f107266a;
            if (!(aVar4 == null || (str = aVar4.f107269b) == null)) {
                str2 = str;
            }
            com.ss.android.ugc.d.a.c.a(new f(str2));
            return new c.a(true, false);
        }
    }
}
