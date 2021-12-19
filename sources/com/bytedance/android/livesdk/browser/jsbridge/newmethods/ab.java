package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.util.Base64;
import com.bytedance.android.live.base.model.a;
import com.bytedance.android.live.network.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.ss.android.common.util.g;
import com.ss.android.http.a.b.d;
import f.a.ae;
import f.a.b.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public b f14498a;

    static {
        Covode.recordClassIndex(8050);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14498a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    static List<a> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new a(next, jSONObject.optString(next, "")));
            }
        }
        return arrayList;
    }

    static String a(String str, JSONObject jSONObject) {
        g gVar = new g(str);
        for (a aVar : a(jSONObject)) {
            gVar.a(aVar.getName(), aVar.getValue());
        }
        com.bytedance.android.live.core.c.a.a(3, "FetchPbMethod", "build url is " + gVar.a());
        return gVar.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, com.bytedance.ies.web.jsbridge2.g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("url", "");
        f.a.ab.a(jSONObject2.optString("method", "get").toLowerCase()).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new ac(optString, jSONObject2.optJSONObject("headers"), jSONObject2.optJSONObject("params"), jSONObject2.optJSONObject("data"))).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<String>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8051);
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                ab.this.finishWithFailure(th);
            }

            @Override // f.a.ae
            public final void onSubscribe(b bVar) {
                ab.this.f14498a = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw", str);
                    ab.this.finishWithResult(jSONObject);
                } catch (JSONException e2) {
                    ab.this.finishWithFailure(e2);
                }
            }
        });
    }

    static String a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        MethodCollector.i(10154);
        String a2 = a(str, jSONObject2);
        ArrayList<d> arrayList = new ArrayList();
        if (jSONObject3 != null) {
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new d(next, jSONObject3.optString(next, "")));
            }
        }
        String a3 = com.bytedance.android.livesdk.browser.jsbridge.b.a.a(a2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (d dVar : arrayList) {
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
                MethodCollector.o(10154);
                throw runtimeException;
            }
        }
        String encodeToString = Base64.encodeToString(h.a().a(a3, a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).a().f23268e, 2);
        MethodCollector.o(10154);
        return encodeToString;
    }
}
