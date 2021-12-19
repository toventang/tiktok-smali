package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.android.monitor.webview.f;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.a.r;
import h.f.b.j;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;
import java.util.Map;
import org.json.JSONObject;

public final class y extends ad implements q {

    /* renamed from: g  reason: collision with root package name */
    private final h f67759g = i.a(m.NONE, new a(this));

    /* renamed from: h  reason: collision with root package name */
    private String f67760h;

    /* renamed from: i  reason: collision with root package name */
    private long f67761i;

    /* renamed from: j  reason: collision with root package name */
    private long f67762j;

    /* renamed from: k  reason: collision with root package name */
    private long f67763k;

    /* renamed from: l  reason: collision with root package name */
    private long f67764l;

    /* renamed from: m  reason: collision with root package name */
    private long f67765m;
    private long n;
    private long o;
    private long p;

    static {
        Covode.recordClassIndex(41718);
    }

    private c c() {
        return (c) this.f67759g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void j() {
        this.f67762j = System.currentTimeMillis();
    }

    static final class a extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ y this$0;

        public final /* synthetic */ class b implements com.bytedance.android.monitor.webview.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ r f67766a;

            static {
                Covode.recordClassIndex(41721);
            }

            public b(r rVar) {
                this.f67766a = rVar;
            }

            @Override // com.bytedance.android.monitor.webview.a
            public final /* synthetic */ void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
                l.b(this.f67766a.a(str, Integer.valueOf(i2), jSONObject, jSONObject2), "");
            }
        }

        static {
            Covode.recordClassIndex(41719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = com.bytedance.android.monitor.webview.i.f23764a;
            c.a d2 = cVar.d();
            d2.f23695g = "HybridMonitor";
            d2.y = "mt";
            d2.f23690b = f.a();
            d2.a(new b(new C1529a(this.this$0)));
            return cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ax.a.y$a$a  reason: collision with other inner class name */
        static final /* synthetic */ class C1529a extends j implements r<String, Integer, JSONObject, JSONObject, z> {
            static {
                Covode.recordClassIndex(41720);
            }

            C1529a(y yVar) {
                super(4, yVar, y.class, "monitorStatusAndDuration", "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.r
            public final /* bridge */ /* synthetic */ z a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((ad) this.receiver).a(str, num, jSONObject, jSONObject2);
                return z.f158842a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    @Override // com.ss.android.ugc.aweme.ax.a.s
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ax.a.y.k():void");
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void a(b bVar, c cVar) {
        l.d(bVar, "");
        w q = q();
        JSONObject jSONObject = new JSONObject();
        e.a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            e.a(jSONObject, cVar.getFormatData());
        }
        ad.a(this, "hybrid_app_monitor_fetch_api_error", q, jSONObject, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.a, com.ss.android.ugc.aweme.ax.a.r
    public final void a(String str, boolean z) {
        l.d(str, "");
        super.a(str, z);
        this.f67761i = System.currentTimeMillis();
        v a2 = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        ad.a(this, "hybrid_app_monitor_load_url_event", a2, jSONObject, null, 24);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(Uri uri, g gVar, Map<String, String> map) {
        super(uri, gVar, map);
        l.d(uri, "");
        l.d(gVar, "");
        l.d(map, "");
    }

    @Override // com.ss.android.ugc.aweme.ax.a.ad
    public final void a(String str, t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        l.d(str, "");
        l.d(tVar, "");
        try {
            a(tVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e2) {
            a(e2, tVar.b(), "rn");
        }
    }

    private final void a(t tVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        c c2 = c();
        String b2 = tVar.b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(StringSet.type, "rn");
        if (p() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        e.a(jSONObject, tVar.getFormatData());
        v r = r();
        if (r != null) {
            e.a(jSONObject, r.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            e.a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            e.a(jSONObject7, jSONObject3);
        }
        c2.a(null, b2, str, jSONObject4, jSONObject6, jSONObject7.toString());
        c().a((WebView) null);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.s
    public final void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        l.d(str, "");
        l.d(str2, "");
        v a2 = a();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            e.a(jSONObject4, jSONObject);
        }
        a(str, a2, jSONObject4, jSONObject2, jSONObject3);
    }
}
