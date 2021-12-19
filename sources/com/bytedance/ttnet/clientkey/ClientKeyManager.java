package com.bytedance.ttnet.clientkey;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.g;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.ttnet.TTNetInit;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClientKeyManager {

    /* renamed from: a  reason: collision with root package name */
    public static Keva f44556a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f44557b;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f44558g = true;

    /* renamed from: h  reason: collision with root package name */
    public static Map<String, String> f44559h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile ClientKeyManager f44560i;

    /* renamed from: l  reason: collision with root package name */
    private static final String f44561l = ClientKeyManager.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public String f44562c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f44563d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f44564e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f44565f = "";

    /* renamed from: j  reason: collision with root package name */
    private List<String> f44566j = new CopyOnWriteArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<String> f44567k = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(27266);
    }

    private ClientKeyManager() {
    }

    public static ClientKeyManager a() {
        MethodCollector.i(6645);
        if (f44560i == null) {
            synchronized (ClientKeyManager.class) {
                try {
                    if (f44560i == null) {
                        f44560i = new ClientKeyManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6645);
                    throw th;
                }
            }
        }
        ClientKeyManager clientKeyManager = f44560i;
        MethodCollector.o(6645);
        return clientKeyManager;
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (f44556a == null || !f44557b) {
            return null;
        }
        if (f44558g) {
            return f44559h;
        }
        return a(f44556a.getString("client_key", ""), f44556a.getString("kms_version", ""));
    }

    public final void b(String str) {
        if (f44556a != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).getJSONObject("data").optJSONObject("client_key_config");
                if (optJSONObject == null) {
                    f44557b = false;
                    f44556a.clear();
                    return;
                }
                f44556a.storeString("client_key_config", optJSONObject.toString());
                a(optJSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("report_time", new StringBuilder().append(System.currentTimeMillis()).toString());
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", this.f44563d);
            jSONObject.put("url", this.f44564e);
            TTNetInit.getTTNetDepend().a("cookie_mismatch", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public final void a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.optInt("client_key_sign_enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        f44557b = z;
        if (!z) {
            f44556a.clear();
            return;
        }
        this.f44566j.clear();
        String optString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(optString)) {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    this.f44566j.add(string);
                }
            }
        }
        this.f44567k.clear();
        String optString2 = jSONObject.optString("update_path_list", null);
        if (!TextUtils.isEmpty(optString2)) {
            JSONArray jSONArray2 = new JSONArray(optString2);
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                String string2 = jSONArray2.getString(i3);
                if (!TextUtils.isEmpty(string2)) {
                    this.f44567k.add(string2);
                }
            }
        }
    }

    public static Map<String, String> a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-bd-client-key", str);
        hashMap.put("x-bd-kmsv", str2);
        return hashMap;
    }

    public final synchronized void a(Request request, c cVar) {
        MethodCollector.i(6674);
        if (f44556a == null || !f44557b) {
            MethodCollector.o(6674);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        URI uri = null;
        try {
            uri = g.a(request.getUrl());
        } catch (Throwable unused) {
        }
        if (uri == null || !uri.getScheme().equals("https")) {
            MethodCollector.o(6674);
            return;
        }
        if (!this.f44566j.isEmpty()) {
            for (String str : this.f44566j) {
                if (i.a(uri.getHost(), str)) {
                }
            }
            MethodCollector.o(6674);
            return;
        }
        if (!this.f44567k.isEmpty()) {
            for (String str2 : this.f44567k) {
                if (i.a(uri.getPath(), str2)) {
                    String str3 = "";
                    String str4 = "";
                    List<b> b2 = cVar.b("Set-Cookie");
                    if (b2 != null && !b2.isEmpty()) {
                        Iterator<b> it = b2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String trim = it.next().f42472b.trim();
                            if (trim.toLowerCase().startsWith("sessionid=")) {
                                str3 = trim;
                                break;
                            }
                        }
                    }
                    String[] split = str3.split(";");
                    if (split != null && split.length > 0) {
                        str4 = split[0].trim();
                    }
                    if (TextUtils.isEmpty(str4)) {
                        MethodCollector.o(6674);
                        return;
                    }
                    String str5 = "";
                    String str6 = "";
                    b a2 = cVar.a("x-bd-lanusk");
                    b a3 = cVar.a("x-bd-lanusv");
                    if (a2 != null && a3 != null) {
                        str5 = a2.f42472b;
                        str6 = a3.f42472b;
                        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                            this.f44562c = "";
                            this.f44565f = "";
                        }
                    } else if (str4.equals(this.f44563d)) {
                        str5 = this.f44562c;
                        str6 = this.f44565f;
                    }
                    this.f44562c = str5;
                    this.f44565f = str6;
                    String url = request.getUrl();
                    this.f44564e = url;
                    this.f44563d = str4;
                    f44556a.storeString("session_url", url);
                    f44556a.storeString("session_id", str3);
                    f44556a.storeString("client_key", this.f44562c);
                    f44556a.storeString("kms_version", this.f44565f);
                    f44556a.storeLong("session_time", System.currentTimeMillis());
                    f44559h = a(this.f44562c, this.f44565f);
                    if (request.getMetrics() != null) {
                        request.getMetrics().I = SystemClock.uptimeMillis() - valueOf.longValue();
                    }
                    MethodCollector.o(6674);
                    return;
                }
            }
        }
        MethodCollector.o(6674);
    }

    public static String a(String[] strArr, long j2, String str) {
        String[] strArr2;
        String str2;
        if (strArr != null && strArr.length >= 2) {
            long j3 = 0;
            if (j2 > 0) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        strArr2 = null;
                        str2 = null;
                        break;
                    }
                    str2 = strArr[i2];
                    if (!TextUtils.isEmpty(str2) && str2.toLowerCase().trim().startsWith("Max-Age=".toLowerCase())) {
                        strArr2 = str2.split("=");
                        break;
                    }
                    i2++;
                }
                if (strArr2 != null && strArr2.length == 2) {
                    try {
                        long parseLong = Long.parseLong(strArr2[1]);
                        if (parseLong <= 0) {
                            return null;
                        }
                        long currentTimeMillis = parseLong - ((System.currentTimeMillis() - j2) / 1000);
                        if (currentTimeMillis > 0) {
                            j3 = currentTimeMillis;
                        }
                        return str.replaceFirst(str2.trim(), "Max-Age=".concat(String.valueOf(j3)));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return null;
    }

    public static void a(String str, CookieHandler cookieHandler, URI uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        linkedHashMap.put("Set-Cookie", arrayList);
        cookieHandler.put(uri, linkedHashMap);
    }
}
