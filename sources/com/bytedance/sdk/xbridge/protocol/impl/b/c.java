package com.bytedance.sdk.xbridge.protocol.impl.b;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.a.b;
import com.bytedance.sdk.xbridge.protocol.c.f;
import com.bytedance.sdk.xbridge.protocol.d.e;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import h.f.b.l;
import h.m.d;
import h.q;
import h.r;
import h.w;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.json.JSONObject;

public final class c extends e {

    /* renamed from: d  reason: collision with root package name */
    private final String f44016d = "JSB3BridgeImpl";

    static {
        Covode.recordClassIndex(26879);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String b() {
        return "ToutiaoJSBridge";
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        a(str, (a.d.C1071a) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.bytedance.sdk.xbridge.protocol.a aVar) {
        super(aVar);
        l.c(aVar, "");
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final com.bytedance.sdk.xbridge.protocol.a.a d(String str) {
        String str2;
        l.c(str, "");
        JSONObject jSONObject = new JSONObject(str);
        com.bytedance.sdk.xbridge.protocol.a.a aVar = new com.bytedance.sdk.xbridge.protocol.a.a();
        String optString = jSONObject.optString("__callback_id");
        l.a((Object) optString, "");
        aVar.a(optString);
        String optString2 = jSONObject.optString("func");
        l.a((Object) optString2, "");
        aVar.b(optString2);
        f fVar = this.f44018a;
        if (fVar == null || (str2 = fVar.a()) == null) {
            str2 = "";
        }
        aVar.c(str2);
        String optString3 = jSONObject.optString("__msg_type");
        l.a((Object) optString3, "");
        aVar.d(optString3);
        aVar.f43931e = jSONObject.opt("params");
        String optString4 = jSONObject.optString("JSSDK");
        l.a((Object) optString4, "");
        aVar.e(optString4);
        String optString5 = jSONObject.optString("namespace", "DEFAULT");
        l.a((Object) optString5, "");
        aVar.f(optString5);
        String optString6 = jSONObject.optString("__iframe_url");
        l.a((Object) optString6, "");
        aVar.g(optString6);
        aVar.a(a.b.Web);
        return aVar;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final void a(String str, JSONObject jSONObject) {
        l.c(str, "");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            jSONObject2.put("__params", jSONObject);
            a((e) ("javascript:window.ToutiaoJSBridge && ToutiaoJSBridge._handleMessageFromToutiao && ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject2 + ')'), (String) ((ValueCallback<String>) null));
        } catch (Throwable th) {
            Throwable r3 = q.m226exceptionOrNullimpl(q.m223constructorimpl(r.a(th)));
            if (r3 != null) {
                e.a(this.f44016d, "parse event failed,reason=" + r3.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String a(com.bytedance.sdk.xbridge.protocol.a.a aVar, b bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__callback_id", aVar.f43927a);
        jSONObject.put("__params", bVar.a());
        jSONObject.put("__msg_type", "callback");
        if (TextUtils.isEmpty(aVar.f43934h)) {
            return "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ')';
        }
        String str = aVar.f43934h;
        Charset charset = d.f158808a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            l.a((Object) bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            l.a((Object) encodeToString, "");
            String a2 = com.a.a("iframe[src=\"%s\"", Arrays.copyOf(new Object[]{str}, 1));
            l.a((Object) a2, "");
            Charset charset2 = d.f158808a;
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
}
