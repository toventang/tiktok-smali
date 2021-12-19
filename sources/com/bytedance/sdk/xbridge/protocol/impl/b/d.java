package com.bytedance.sdk.xbridge.protocol.impl.b;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.a.b;
import com.bytedance.sdk.xbridge.protocol.c.f;
import com.bytedance.sdk.xbridge.protocol.d.e;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.json.JSONObject;

public final class d extends e {

    /* renamed from: d  reason: collision with root package name */
    private final String f44017d = "JSB4BridgeImpl";

    static {
        Covode.recordClassIndex(26880);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String b() {
        return "BDXBridge";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(aVar);
        l.c(aVar, "");
    }

    @JavascriptInterface
    public final void _invokeMethod(String str) {
        a(str, new a.d.C1071a());
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final com.bytedance.sdk.xbridge.protocol.a.a d(String str) {
        String str2;
        l.c(str, "");
        JSONObject jSONObject = new JSONObject(str);
        com.bytedance.sdk.xbridge.protocol.a.a aVar = new com.bytedance.sdk.xbridge.protocol.a.a();
        String optString = jSONObject.optString("func");
        l.a((Object) optString, "");
        aVar.b(optString);
        aVar.f43931e = jSONObject.opt("params");
        String optString2 = jSONObject.optString("JSSDK");
        l.a((Object) optString2, "");
        aVar.e(optString2);
        aVar.f43935i = jSONObject.optLong("__timestamp");
        String optString3 = jSONObject.optString("__msg_type");
        l.a((Object) optString3, "");
        aVar.d(optString3);
        String optString4 = jSONObject.optString("__iframe_url");
        l.a((Object) optString4, "");
        aVar.g(optString4);
        String optString5 = jSONObject.optString("__callback_id");
        l.a((Object) optString5, "");
        aVar.a(optString5);
        f fVar = this.f44018a;
        if (fVar == null || (str2 = fVar.a()) == null) {
            str2 = "";
        }
        aVar.c(str2);
        String optString6 = jSONObject.optString("namespace", "DEFAULT");
        l.a((Object) optString6, "");
        aVar.f(optString6);
        l.c(str, "");
        aVar.f43936j = str;
        aVar.a(a.b.Web);
        return aVar;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String a(com.bytedance.sdk.xbridge.protocol.a.a aVar, b bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__msg_type", "callback");
        jSONObject.put("__callback_id", aVar.f43927a);
        jSONObject.put("__params", bVar.a());
        jSONObject.put("__timestamp", System.currentTimeMillis());
        jSONObject.put("__sdk_version", "4.0");
        if (TextUtils.isEmpty(aVar.f43934h)) {
            return "javascript:BDXBridge._handleMessageFromApp(" + jSONObject + ')';
        }
        String str = aVar.f43934h;
        Charset charset = h.m.d.f158808a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            l.a((Object) bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            l.a((Object) encodeToString, "");
            String a2 = com.a.a("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
            l.a((Object) a2, "");
            Charset charset2 = h.m.d.f158808a;
            if (a2 != null) {
                byte[] bytes2 = a2.getBytes(charset2);
                l.a((Object) bytes2, "");
                String encodeToString2 = Base64.encodeToString(bytes2, 2);
                l.a((Object) encodeToString2, "");
                String a3 = com.a.a("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Arrays.copyOf(new Object[]{encodeToString2, jSONObject, encodeToString}, 3));
                l.a((Object) a3, "");
                return a3;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final void a(String str, JSONObject jSONObject) {
        l.c(str, "");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject().put("code", 1);
            } catch (Throwable th) {
                Throwable r3 = q.m226exceptionOrNullimpl(q.m223constructorimpl(r.a(th)));
                if (r3 != null) {
                    e.a(this.f44017d, "parse event failed,reason=" + r3.getMessage());
                    return;
                }
                return;
            }
        } else if (!jSONObject.has("code")) {
            jSONObject.put("code", 1);
        }
        jSONObject2.put("__msg_type", "event");
        jSONObject2.put("__event_id", str);
        jSONObject2.put("__params", jSONObject);
        jSONObject2.put("__timestamp", System.currentTimeMillis());
        jSONObject2.put("__sdk_version", "4.0");
        a((e) ("javascript:window.BDXBridge && BDXBridge._handleMessageFromApp && BDXBridge._handleMessageFromApp(" + jSONObject2 + ')'), (String) ((ValueCallback<String>) null));
    }
}
