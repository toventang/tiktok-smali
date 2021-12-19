package com.ss.android.sdk.webview;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.x;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.ax.a.s;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class p {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, HashMap<String, String>> f60246d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f60247e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public l f60248a;

    /* renamed from: b  reason: collision with root package name */
    public final x f60249b;

    /* renamed from: c  reason: collision with root package name */
    public final c f60250c;

    public static final class a {
        static {
            Covode.recordClassIndex(37209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(37208);
    }

    public p(x xVar, c cVar) {
        this.f60249b = xVar;
        this.f60250c = cVar;
    }

    public static final class b extends m implements q<HashMap<String, String>, Boolean, JSONObject, z> {
        final /* synthetic */ k $monitorSession;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(37210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar, k kVar, Uri uri) {
            super(3);
            this.this$0 = pVar;
            this.$monitorSession = kVar;
            this.$uri = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(HashMap<String, String> hashMap, Boolean bool, JSONObject jSONObject) {
            String str;
            com.ss.android.ugc.aweme.ax.a.m mVar;
            HashMap<String, String> hashMap2 = hashMap;
            boolean booleanValue = bool.booleanValue();
            p pVar = this.this$0;
            if (hashMap2 != null) {
                k kVar = this.$monitorSession;
                if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StringSet.type, "jsb");
                    jSONObject2.put("bridge_name", "openConfig");
                    jSONObject2.put("bridge_access", "true");
                    jSONObject2.put("bridge_list", hashMap2.toString());
                    jSONObject2.put("stage", "open_jsb_auth");
                    s.a.a(mVar, "open_jsb_monitor", "open_jsb_list", jSONObject2);
                }
                Uri uri = this.$uri;
                l.b(uri, "");
                String host = uri.getHost();
                if (host != null) {
                    HashMap<String, HashMap<String, String>> hashMap3 = p.f60246d;
                    l.b(host, "");
                    hashMap3.put(host, hashMap2);
                }
            }
            x xVar = pVar.f60249b;
            if (xVar != null && !xVar.f35715f) {
                if (booleanValue) {
                    str = "openConfigSuccess";
                } else {
                    str = "openConfigError";
                }
                xVar.a(str, jSONObject);
            }
            return z.f158842a;
        }
    }
}
