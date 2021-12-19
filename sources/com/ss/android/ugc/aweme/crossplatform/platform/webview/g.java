package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.l;
import com.ss.android.ugc.aweme.app.api.Api;
import f.a.d.f;
import f.a.t;
import h.f.a.q;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78883a = new a((byte) 0);

    static {
        Covode.recordClassIndex(48955);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48956);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f78884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f78885b;

        static {
            Covode.recordClassIndex(48957);
        }

        b(JSONObject jSONObject, q qVar) {
            this.f78884a = jSONObject;
            this.f78885b = qVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            JSONArray optJSONArray;
            try {
                HashMap hashMap = new HashMap();
                String optString = this.f78884a.optString("config_json");
                h.f.b.l.b(optString, "");
                hashMap.put("config_json", optString);
                String str = Api.f66569d;
                h.f.b.l.b(str, "");
                JSONObject jSONObject = new JSONObject((String) ((JsbNetworkApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(JsbNetworkApi.class)).doPost(-1, "/aweme/v1/open/jsb/list/", new LinkedHashMap(), hashMap, null, null, true).execute().f42630b);
                if (!Api.a(jSONObject) || (optJSONArray = jSONObject.optJSONArray("jsb_list")) == null) {
                    this.f78885b.invoke(null, false, jSONObject);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = optJSONArray.get(i2);
                    if (obj2 != null) {
                        String str2 = (String) obj2;
                        hashMap2.put(str2, str2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                this.f78885b.invoke(hashMap2, true, null);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                this.f78885b.invoke(null, false, null);
            }
        }
    }

    @Override // com.ss.android.sdk.webview.l
    public final void a(JSONObject jSONObject, q<? super HashMap<String, String>, ? super Boolean, ? super JSONObject, z> qVar) {
        h.f.b.l.d(jSONObject, "");
        h.f.b.l.d(qVar, "");
        t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(new b(jSONObject, qVar));
    }
}
