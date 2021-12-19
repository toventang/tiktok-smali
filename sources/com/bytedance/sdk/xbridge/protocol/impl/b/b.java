package com.bytedance.sdk.xbridge.protocol.impl.b;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.c.f;
import com.bytedance.sdk.xbridge.protocol.c.g;
import com.bytedance.sdk.xbridge.protocol.d.e;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends e implements g {

    /* renamed from: d  reason: collision with root package name */
    private final String f44013d = "bytedance";

    /* renamed from: e  reason: collision with root package name */
    private final String f44014e = "IESJSBridgeSupport";

    static {
        Covode.recordClassIndex(26877);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void a(String str) {
        l.c(str, "");
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final void a(String str, JSONObject jSONObject) {
        l.c(str, "");
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String b() {
        return "";
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void c() {
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e, com.bytedance.sdk.xbridge.protocol.c.e
    public final void a() {
        f fVar = this.f43955c.f43921c;
        if (fVar != null) {
            fVar.a(this);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final void c(String str) {
        l.c(str, "");
        g(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.sdk.xbridge.protocol.a aVar) {
        super(aVar);
        l.c(aVar, "");
    }

    /* access modifiers changed from: package-private */
    public final void e(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                a(jSONArray.getJSONObject(i2).toString(), (a.d.C1071a) null);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements ValueCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f44015a;

        static {
            Covode.recordClassIndex(26878);
        }

        a(b bVar) {
            this.f44015a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(String str) {
            String str2 = str;
            b bVar = this.f44015a;
            l.a((Object) str2, "");
            try {
                String optString = new JSONObject("{a=" + str2 + '}').optString("a", "");
                l.a((Object) optString, "");
                bVar.e(optString);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.g
    public final boolean b(String str) {
        String str2;
        if (str != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f44013d)) {
            Uri parse = Uri.parse(str);
            l.a((Object) parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                str2 = scheme.toLowerCase();
                l.a((Object) str2, "");
            } else {
                str2 = null;
            }
            if (!l.a((Object) this.f44013d, (Object) str2) || !g(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean g(String str) {
        if (!p.b(str, this.f44013d, false)) {
            return false;
        }
        String str2 = this.f44013d + "://private/setresult/";
        try {
            if (str.equals(this.f44013d + "://dispatch_message/")) {
                a("javascript:ToutiaoJSBridge._fetchQueue()", (ValueCallback<String>) new a(this));
                return true;
            }
            if (p.b(str, str2, false)) {
                int i2 = Build.VERSION.SDK_INT;
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final com.bytedance.sdk.xbridge.protocol.a.a d(String str) {
        String a2;
        String str2 = "";
        l.c(str, str2);
        JSONObject jSONObject = new JSONObject(str);
        com.bytedance.sdk.xbridge.protocol.a.a aVar = new com.bytedance.sdk.xbridge.protocol.a.a();
        String string = jSONObject.getString("__msg_type");
        l.a((Object) string, str2);
        aVar.d(string);
        String optString = jSONObject.optString("__callback_id", null);
        l.a((Object) optString, str2);
        aVar.a(optString);
        String optString2 = jSONObject.optString("func");
        l.a((Object) optString2, str2);
        aVar.b(optString2);
        aVar.f43931e = jSONObject.opt("params");
        String optString3 = jSONObject.optString("JSSDK");
        l.a((Object) optString3, str2);
        aVar.e(optString3);
        String optString4 = jSONObject.optString("namespace", "DEFAULT");
        l.a((Object) optString4, str2);
        aVar.f(optString4);
        String optString5 = jSONObject.optString("__iframe_url");
        l.a((Object) optString5, str2);
        aVar.g(optString5);
        f fVar = this.f44018a;
        if (!(fVar == null || (a2 = fVar.a()) == null)) {
            str2 = a2;
        }
        aVar.c(str2);
        e.b("JsBridge", "parseMsQueue:" + Thread.currentThread());
        aVar.a(a.b.Web);
        return aVar;
    }

    private static JSONObject b(com.bytedance.sdk.xbridge.protocol.a.a aVar, com.bytedance.sdk.xbridge.protocol.a.b bVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__msg_type", "callback");
        if (aVar != null) {
            str = aVar.f43927a;
        } else {
            str = null;
        }
        jSONObject.put("__callback_id", str);
        jSONObject.put("__params", bVar.f43940a);
        return jSONObject;
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.b.e
    public final String a(com.bytedance.sdk.xbridge.protocol.a.a aVar, com.bytedance.sdk.xbridge.protocol.a.b bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        if (!TextUtils.isEmpty(aVar.f43934h)) {
            String a2 = com.a.a("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", Arrays.copyOf(new Object[]{aVar.f43934h, b(aVar, bVar).toString(), aVar.f43934h}, 3));
            l.a((Object) a2, "");
            return a2;
        }
        return "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + b(aVar, bVar) + ')';
    }
}
