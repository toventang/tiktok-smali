package com.bytedance.sdk.bdlynx.report;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.c;
import com.bytedance.sdk.bdlynx.a.a.c;
import com.bytedance.sdk.bdlynx.a.a.d;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class BDLynxReportModule extends LynxModule {
    public static final a Companion = new a((byte) 0);
    private final Context context;

    static {
        Covode.recordClassIndex(26774);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26775);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BDLynxReportModule(Context context2) {
        super(context2);
        l.c(context2, "");
        this.context = context2;
    }

    static final class b extends m implements h.f.a.b<c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43769a = new b();

        static {
            Covode.recordClassIndex(26776);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c cVar) {
            boolean z;
            c cVar2 = cVar;
            l.c(cVar2, "");
            int i2 = cVar2.f28526a;
            if (200 <= i2 && 299 >= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d.a("BDLynxReportModule", "errMsg:ok");
            } else {
                d.a("BDLynxReportModule", "errMsg:fail");
            }
            return z.f158842a;
        }
    }

    @com.lynx.jsbridge.d
    public final void systemLog(ReadableMap readableMap) {
        l.c(readableMap, "");
        String string = readableMap.getString("tag");
        ReadableMap map = readableMap.getMap("data");
        l.a((Object) string, "");
        com.bytedance.sdk.bdlynx.a.a.b bVar = new com.bytedance.sdk.bdlynx.a.a.b(string, (byte) 0);
        l.a((Object) map, "");
        l.c(map, "");
        l.c(map, "");
        bVar.a(new JSONObject(map.toHashMap())).a();
    }

    @com.lynx.jsbridge.d
    public final void sentryReport(String str) {
        JSONObject jSONObject;
        Iterator<String> keys;
        l.c(str, "");
        JSONObject jSONObject2 = new JSONObject(str);
        String optString = jSONObject2.optString("url");
        String optString2 = jSONObject2.optString("method", com.bytedance.sdk.bdlynx.a.a.c.f43630a);
        l.a((Object) optString2, "");
        if (optString2.length() == 0) {
            optString2 = com.bytedance.sdk.bdlynx.a.a.c.f43631b;
        }
        String optString3 = jSONObject2.optString("data");
        JSONObject optJSONObject = jSONObject2.optJSONObject("header");
        jSONObject2.optString("responseType", "text");
        JSONArray optJSONArray = jSONObject2.optJSONArray("__nativeBuffers__");
        byte[] bArr = null;
        if (optJSONArray != null) {
            jSONObject = optJSONArray.optJSONObject(0);
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString4 = jSONObject.optString("key");
            String optString5 = jSONObject.optString("base64");
            if (!TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                l.a((Object) optString5, "");
                Charset charset = h.m.d.f158808a;
                if (optString5 != null) {
                    byte[] bytes = optString5.getBytes(charset);
                    l.a((Object) bytes, "");
                    bArr = Base64.decode(bytes, 0);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                l.a((Object) next, "");
                String optString6 = optJSONObject.optString(next);
                l.a((Object) optString6, "");
                linkedHashMap.put(next, optString6);
            }
        }
        b bVar = b.f43769a;
        if (l.a((Object) optString2, (Object) com.bytedance.sdk.bdlynx.a.a.c.f43630a)) {
            Context context2 = this.context;
            l.a((Object) optString, "");
            l.c(context2, "");
            l.c(optString, "");
            l.c(bVar, "");
            l.c(context2, "");
            l.c(optString, "");
            l.c(bVar, "");
            com.bytedance.d.a.a.a.a.b bVar2 = new com.bytedance.d.a.a.a.a.b(com.bytedance.d.a.a.a.a.a.f28511a, optString);
            bVar2.f28518b.putAll(linkedHashMap);
            com.bytedance.sdk.bdlynx.a.a.c.a().request(context2, bVar2.a(), new c.a(bVar));
        } else if (l.a((Object) optString2, (Object) com.bytedance.sdk.bdlynx.a.a.c.f43631b)) {
            if (bArr == null) {
                l.a((Object) optString3, "");
                Charset charset2 = h.m.d.f158808a;
                if (optString3 != null) {
                    bArr = optString3.getBytes(charset2);
                    l.a((Object) bArr, "");
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            Context context3 = this.context;
            l.a((Object) optString, "");
            l.c(context3, "");
            l.c(optString, "");
            l.c(bVar, "");
            l.c(context3, "");
            l.c(optString, "");
            l.c(bVar, "");
            com.bytedance.sdk.bdlynx.a.a.c.a(context3, new com.bytedance.d.a.a.a.a.b(com.bytedance.d.a.a.a.a.a.f28512b, optString), linkedHashMap, bArr, bVar);
        }
    }
}
