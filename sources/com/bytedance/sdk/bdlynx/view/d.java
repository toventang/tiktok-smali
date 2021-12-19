package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.a.a.f;
import com.bytedance.sdk.bdlynx.d.b;
import com.bytedance.sdk.bdlynx.d.c;
import com.bytedance.sdk.bdlynx.report.a;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.f.b.l;
import org.json.JSONObject;

public class d extends o {

    /* renamed from: e  reason: collision with root package name */
    public static final a f43808e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private b f43809a;

    /* renamed from: b  reason: collision with root package name */
    c f43810b = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    String f43811c = "not_set";

    /* renamed from: d  reason: collision with root package name */
    String f43812d = "not_set";

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.bdlynx.c.b f43813f;

    static {
        Covode.recordClassIndex(26791);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26792);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        super.a();
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.d();
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onLoadSuccess");
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        super.b();
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.e();
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onFirstScreen");
    }

    @Override // com.lynx.tasm.o
    public final void c() {
        super.c();
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.f();
        com.bytedance.sdk.bdlynx.a.a.d.b("BDLynxViewClient", "onPageUpdate");
    }

    @Override // com.lynx.tasm.o
    public void d() {
        super.d();
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.c();
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onRuntimeReady");
    }

    @Override // com.lynx.tasm.o
    public final void c(String str) {
        super.c(str);
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        this.f43809a = bVar;
    }

    @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
    public final String d(String str) {
        b bVar = this.f43809a;
        if (bVar == null) {
            l.a("imageUrlReWriter");
        }
        return bVar.a(this.f43810b, str);
    }

    public final void a(com.bytedance.sdk.bdlynx.c.b bVar) {
        if (bVar != null) {
            this.f43813f = bVar;
            b bVar2 = this.f43809a;
            if (bVar2 == null) {
                l.a("imageUrlReWriter");
            }
            bVar2.a(bVar);
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.b(lynxPerfMetric);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        bVar.b(jSONObject);
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onUpdatePerfReady: metric=".concat(String.valueOf(lynxPerfMetric)));
    }

    @Override // com.lynx.tasm.o
    public final void c(j jVar) {
        String str;
        super.c(jVar);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        String str2 = null;
        if (jVar != null) {
            str = jVar.a();
        } else {
            str = null;
        }
        bVar.c(str);
        com.bytedance.sdk.bdlynx.a.d.a.f43661a.a(com.bytedance.sdk.bdlynx.a.e.b.class);
        StringBuilder sb = new StringBuilder("onReceivedError: info=");
        if (jVar != null) {
            str2 = jVar.a();
        }
        com.bytedance.sdk.bdlynx.a.a.d.c("BDLynxViewClient", sb.append(str2).toString());
    }

    @Override // com.lynx.tasm.o
    public final void d(j jVar) {
        String str;
        super.a(jVar);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        String str2 = null;
        if (jVar != null) {
            str = jVar.a();
        } else {
            str = null;
        }
        bVar.c(str);
        com.bytedance.sdk.bdlynx.a.d.a.f43661a.a(com.bytedance.sdk.bdlynx.a.e.b.class);
        StringBuilder sb = new StringBuilder("onReceivedNativeError: info=");
        if (jVar != null) {
            str2 = jVar.a();
        }
        com.bytedance.sdk.bdlynx.a.a.d.c("BDLynxViewClient", sb.append(str2).toString());
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.a(lynxPerfMetric);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        bVar.a(jSONObject);
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onFirstLoadPerfReady: metric=".concat(String.valueOf(lynxPerfMetric)));
    }

    @Override // com.lynx.tasm.o
    public final void b(j jVar) {
        String str;
        String str2;
        super.b(jVar);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        String str3 = null;
        if (jVar != null) {
            str = jVar.a();
        } else {
            str = null;
        }
        bVar.c(str);
        if (jVar != null) {
            str2 = jVar.a();
        } else {
            str2 = null;
        }
        String str4 = this.f43811c;
        String str5 = this.f43812d;
        l.c(str4, "");
        l.c(str5, "");
        f.b(new a.b(str2, str4, str5));
        StringBuilder sb = new StringBuilder("onReceivedJSError: info=");
        if (jVar != null) {
            str3 = jVar.a();
        }
        com.bytedance.sdk.bdlynx.a.a.d.c("BDLynxViewClient", sb.append(str3).toString());
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        super.a(str);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.a(str);
        com.bytedance.sdk.bdlynx.a.a.d.a("BDLynxViewClient", "onPageStart: url=".concat(String.valueOf(str)));
    }

    @Override // com.lynx.tasm.o
    public final void b(String str) {
        super.b(str);
        com.bytedance.sdk.bdlynx.c.b bVar = this.f43813f;
        if (bVar == null) {
            l.a("monitorSession");
        }
        bVar.b(str);
        com.bytedance.sdk.bdlynx.a.a.d.c("BDLynxViewClient", "onLoadFailed: msg=".concat(String.valueOf(str)));
    }
}
