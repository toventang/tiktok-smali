package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.live.e;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.browser.jsbridge.a;
import com.bytedance.android.monitor.d.d;
import com.bytedance.android.monitor.lynx.c.a.c;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.lynx.tasm.LynxView;
import f.a.ab;
import f.a.ae;
import f.a.b.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    int f14796a;

    /* renamed from: b  reason: collision with root package name */
    String f14797b;

    /* renamed from: c  reason: collision with root package name */
    public int f14798c;

    /* renamed from: d  reason: collision with root package name */
    public String f14799d = "";

    /* renamed from: e  reason: collision with root package name */
    String f14800e;

    /* renamed from: f  reason: collision with root package name */
    public String f14801f = "";

    /* renamed from: g  reason: collision with root package name */
    public b f14802g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14803h;

    static {
        Covode.recordClassIndex(8201);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14802g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public z(int i2) {
        this.f14803h = i2;
    }

    private String a(Throwable th) {
        return e.a.f9628b.b(new a(this.f14796a, this.f14797b, this.f14798c, this.f14799d, this.f14800e, this.f14801f, th));
    }

    static List<com.bytedance.android.live.base.model.a> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new com.bytedance.android.live.base.model.a(next, jSONObject.optString(next, "")));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.livesdkapi.model.a aVar) {
        List<com.bytedance.android.live.base.model.a> list = aVar.f23266c;
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.bytedance.android.live.base.model.a aVar2 = list.get(i2);
                if (aVar2.getName().equals("x-tt-logid")) {
                    this.f14801f = aVar2.getValue();
                    return;
                }
            }
        }
    }

    static com.bytedance.android.livesdkapi.model.a a(String str, JSONObject jSONObject) {
        return h.a().a(str, a(jSONObject), null).a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("url", "");
        final String optString2 = jSONObject2.optString("method", "get");
        String lowerCase = optString2.toLowerCase(Locale.US);
        JSONObject optJSONObject = jSONObject2.optJSONObject("headers");
        ab.a(lowerCase).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new aa(this, optString, jSONObject2.optJSONObject("params"), optJSONObject, jSONObject2.optJSONObject("data"))).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<JSONObject>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.z.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8202);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                z.this.f14802g = bVar;
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                z.this.finishWithFailure(th);
                z.this.a(gVar.f35649d, optString2, th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject2.put("_AME_Header_RequestID", z.this.f14801f);
                    int optInt = jSONObject2.optInt("status_code", 0);
                    if (optInt != 0) {
                        z.this.f14798c = optInt;
                        JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("prompts");
                            if (TextUtils.isEmpty(optString)) {
                                optString = optJSONObject.optString("message");
                            }
                            z.this.f14799d = optString;
                        }
                        z.this.a(gVar.f35649d, optString2, (Throwable) null);
                    }
                    jSONObject3.put("raw", jSONObject2);
                    z.this.finishWithResult(jSONObject3);
                } catch (JSONException e2) {
                    z.this.finishWithFailure(e2);
                    z.this.a(gVar.f35649d, optString2, e2);
                }
            }
        });
    }

    public final void a(View view, String str, Throwable th) {
        int i2 = this.f14803h;
        if (i2 == 0) {
            if (view instanceof WebView) {
                d dVar = new d();
                dVar.f23452a = str;
                dVar.f23453b = this.f14800e;
                dVar.f23454c = this.f14796a;
                dVar.f23455d = this.f14798c;
                dVar.f23456e = a(th);
                dVar.f23459h = this.f14798c;
                dVar.f23458g = this.f14799d;
                i.f23764a.a((WebView) view, dVar);
            }
        } else if (i2 == 1 && (view instanceof LynxView)) {
            c cVar = new c();
            cVar.f23623b = str;
            cVar.f23624c = this.f14800e;
            cVar.f23625d = this.f14796a;
            cVar.f23626e = this.f14798c;
            cVar.f23627f = a(th);
            cVar.f23631j = this.f14798c;
            cVar.f23630i = this.f14799d;
            com.bytedance.android.monitor.lynx.b.f23580f.a((LynxView) view, cVar);
        }
    }

    static com.bytedance.android.livesdkapi.model.a a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        MethodCollector.i(8415);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str2 = "application/x-www-form-urlencoded; charset=UTF-8";
        if (jSONObject == null) {
            ArrayList<com.ss.android.http.a.b.d> arrayList = new ArrayList();
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(new com.ss.android.http.a.b.d(next, jSONObject2.optString(next, "")));
                }
            }
            for (com.ss.android.http.a.b.d dVar : arrayList) {
                if (byteArrayOutputStream.size() > 0) {
                    byteArrayOutputStream.write(38);
                }
                try {
                    String encode = URLEncoder.encode(dVar.f59532a, "UTF-8");
                    String encode2 = URLEncoder.encode(dVar.f59533b, "UTF-8");
                    byteArrayOutputStream.write(encode.getBytes(Charset.forName("UTF-8")));
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(encode2.getBytes(Charset.forName("UTF-8")));
                } catch (IOException e2) {
                    RuntimeException runtimeException = new RuntimeException(e2);
                    MethodCollector.o(8415);
                    throw runtimeException;
                }
            }
        } else {
            String optString = jSONObject.optString("Content-Type");
            if (TextUtils.isEmpty(optString) || !optString.contains("json")) {
                ArrayList<com.ss.android.http.a.b.d> arrayList2 = new ArrayList();
                if (jSONObject2 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        arrayList2.add(new com.ss.android.http.a.b.d(next2, jSONObject2.optString(next2, "")));
                    }
                }
                for (com.ss.android.http.a.b.d dVar2 : arrayList2) {
                    if (byteArrayOutputStream.size() > 0) {
                        byteArrayOutputStream.write(38);
                    }
                    try {
                        String encode3 = URLEncoder.encode(dVar2.f59532a, "UTF-8");
                        String encode4 = URLEncoder.encode(dVar2.f59533b, "UTF-8");
                        byteArrayOutputStream.write(encode3.getBytes(Charset.forName("UTF-8")));
                        byteArrayOutputStream.write(61);
                        byteArrayOutputStream.write(encode4.getBytes(Charset.forName("UTF-8")));
                    } catch (IOException e3) {
                        RuntimeException runtimeException2 = new RuntimeException(e3);
                        MethodCollector.o(8415);
                        throw runtimeException2;
                    }
                }
            } else {
                byteArrayOutputStream.write(jSONObject2.toString().getBytes(Charset.forName("UTF-8")));
                str2 = "application/json; charset=UTF-8";
            }
        }
        com.bytedance.android.livesdkapi.model.a a2 = h.a().a(com.bytedance.android.livesdk.browser.jsbridge.b.a.a(str), a(jSONObject), str2, byteArrayOutputStream.toByteArray()).a();
        MethodCollector.o(8415);
        return a2;
    }
}
