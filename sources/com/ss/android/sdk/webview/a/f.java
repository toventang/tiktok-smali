package com.ss.android.sdk.webview.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.sdk.webview.c;
import com.ss.android.sdk.webview.p;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.m;
import h.f.b.l;
import org.json.JSONObject;

public final class f extends com.bytedance.ies.web.jsbridge2.f<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60174a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final p f60175b;

    /* renamed from: c  reason: collision with root package name */
    private final c f60176c;

    static {
        Covode.recordClassIndex(37168);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(37169);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f(p pVar, c cVar) {
        this.f60175b = pVar;
        this.f60176c = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
        k kVar;
        k kVar2;
        m mVar;
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        c cVar = this.f60176c;
        if (!(cVar == null || (kVar2 = (k) cVar.a(k.class)) == null || (mVar = (m) kVar2.a(m.class)) == null)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(StringSet.type, "jsb");
            jSONObject3.put("bridge_name", "openConfig");
            jSONObject3.put("bridge_access", "true");
            jSONObject3.put("stage", "open_jsb_auth");
            mVar.a("open_jsb_monitor", "open_jsb_invoke", jSONObject3, null, null);
        }
        p pVar = this.f60175b;
        if (pVar != null) {
            String str = gVar.f35647b;
            l.d(jSONObject2, "");
            if (str != null) {
                Uri parse = Uri.parse(str);
                c cVar2 = pVar.f60250c;
                if (cVar2 != null) {
                    kVar = (k) cVar2.a(k.class);
                } else {
                    kVar = null;
                }
                com.ss.android.sdk.webview.l lVar = pVar.f60248a;
                if (lVar != null) {
                    lVar.a(jSONObject2, new p.b(pVar, kVar, parse));
                }
            }
        }
        return null;
    }
}
