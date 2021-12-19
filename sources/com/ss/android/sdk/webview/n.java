package com.ss.android.sdk.webview;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.utils.f;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class n {

    /* renamed from: d  reason: collision with root package name */
    private static n f60228d;

    /* renamed from: a  reason: collision with root package name */
    final c<String, o> f60229a = new c<>(16, 16);

    /* renamed from: b  reason: collision with root package name */
    final o f60230b = new o("", null, null);

    /* renamed from: c  reason: collision with root package name */
    List<a> f60231c;

    public interface a {
        static {
            Covode.recordClassIndex(37206);
        }

        void a(String str, o oVar, String str2);
    }

    static {
        Covode.recordClassIndex(37203);
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private n() {
    }

    public static n a() {
        MethodCollector.i(1714);
        if (f60228d == null) {
            synchronized (n.class) {
                try {
                    if (f60228d == null) {
                        f60228d = new n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1714);
                    throw th;
                }
            }
        }
        n nVar = f60228d;
        MethodCollector.o(1714);
        return nVar;
    }

    private static void a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == null)) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    static o a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            g gVar = new g(com.ss.android.sdk.webview.di.a.a().f60182a.getJSSDKConfigUrl());
            gVar.a("client_id", str3);
            gVar.a("partner_domain", str2);
            String executeGet = NetworkUtils.executeGet(-1, gVar.a());
            if (TextUtils.isEmpty(executeGet)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(executeGet);
            if (!com.ss.android.sdk.webview.di.a.a().f60182a.isApiSuccess(jSONObject)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                return null;
            }
            o oVar = new o(str, str2, str3);
            try {
                a(optJSONObject.optJSONArray("call"), oVar.f60243e);
                a(optJSONObject.optJSONArray("info"), oVar.f60244f);
                a(optJSONObject.optJSONArray("event"), oVar.f60245g);
            } catch (Exception unused) {
            }
            return oVar;
        } catch (Exception unused2) {
            return null;
        }
    }
}
