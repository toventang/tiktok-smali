package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.i;
import com.bytedance.ies.d.a.l;
import com.bytedance.ies.d.a.n;
import com.bytedance.ies.d.a.x;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.lynx.tasm.LynxView;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14504a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final b f14505b;

    /* renamed from: c  reason: collision with root package name */
    private final l f14506c;

    static {
        Covode.recordClassIndex(8061);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8062);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f14506c.a();
    }

    public ai() {
        b bVar = new b(this);
        this.f14505b = bVar;
        h.f.b.l.c(bVar, "");
        com.bytedance.ies.d.a.a.a aVar = com.bytedance.ies.d.a.a.a.f33162f;
        if (aVar == null) {
            h.f.b.l.a();
        }
        h.f.b.l.c(bVar, "");
        this.f14506c = new x(aVar, bVar);
    }

    public static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f14507a;

        static {
            Covode.recordClassIndex(8063);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ai aiVar) {
            this.f14507a = aiVar;
        }

        @Override // com.bytedance.ies.d.a.n.a, com.bytedance.ies.d.a.n
        public final void a(Throwable th) {
            h.f.b.l.d(th, "");
            super.a(th);
            this.f14507a.a(-1);
            this.f14507a.finishWithFailure(th);
        }

        @Override // com.bytedance.ies.d.a.n.a
        public final void a(i.c cVar) {
            h.f.b.l.d(cVar, "");
            super.a(cVar);
            JSONObject b2 = cVar.b();
            if (b2.has("status_code")) {
                b2.remove("status_code");
            }
            this.f14507a.a(cVar.f33241f);
            this.f14507a.finishWithResult(b2);
        }
    }

    private static JSONObject c(int i2) {
        int i3;
        if (i2 == 0) {
            i3 = 0;
        } else if (i2 != 1) {
            i3 = -1;
        } else {
            i3 = 3;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", i3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private final JSONObject b(int i2) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cached", i2);
            g gVar = this.callContext;
            h.f.b.l.b(gVar, "");
            View view = gVar.f35649d;
            if (view instanceof WebView) {
                str = "webview";
            } else if (view instanceof LynxView) {
                str = "lynx";
            } else {
                str = "unknown";
            }
            jSONObject.put("live_container_type", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(int i2) {
        int i3;
        g gVar = this.callContext;
        h.f.b.l.b(gVar, "");
        View view = gVar.f35649d;
        if (view instanceof WebView) {
            i3 = 0;
        } else if (view instanceof LynxView) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        JSONObject b2 = b(i2);
        JSONObject c2 = c(i3);
        if (i3 == 0) {
            c cVar = com.bytedance.android.monitor.webview.i.f23764a;
            g gVar2 = this.callContext;
            h.f.b.l.b(gVar2, "");
            g gVar3 = this.callContext;
            h.f.b.l.b(gVar3, "");
            cVar.a((WebView) gVar2.f35649d, gVar3.f35647b, "prefetch_cached", b2, null, null, c2, false);
        } else if (i3 == 1) {
            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
            g gVar4 = this.callContext;
            h.f.b.l.b(gVar4, "");
            g gVar5 = this.callContext;
            h.f.b.l.b(gVar5, "");
            bVar.a((LynxView) gVar4.f35649d, "prefetch_cached", gVar5.f35647b, b2, null, null, c2, false);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        h.f.b.l.d(jSONObject2, "");
        h.f.b.l.d(gVar, "");
        this.f14506c.a(jSONObject2);
    }
}
