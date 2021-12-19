package com.bytedance.frameworks.baselib.network.http.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.h;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.bf.d;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ boolean f29346l = true;

    /* renamed from: m  reason: collision with root package name */
    private static volatile b f29347m;
    private static final String n = b.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f29348a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f29349b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f29350c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f29351d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f29352e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f29353f = "";

    /* renamed from: g  reason: collision with root package name */
    public List<String> f29354g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public Context f29355h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f29356i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f29357j = false;

    /* renamed from: k  reason: collision with root package name */
    public a f29358k;
    private List<String> o = new ArrayList();

    public interface a {
        static {
            Covode.recordClassIndex(17118);
        }

        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    static {
        Covode.recordClassIndex(17117);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(1948);
        if (f29347m == null) {
            synchronized (b.class) {
                try {
                    if (f29347m == null) {
                        f29347m = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1948);
                    throw th;
                }
            }
        }
        b bVar = f29347m;
        MethodCollector.o(1948);
        return bVar;
    }

    public final void b() {
        if (!this.f29351d.isEmpty()) {
            this.f29348a = this.f29351d;
            this.f29352e = "uid";
        } else if (!this.f29350c.isEmpty()) {
            this.f29348a = this.f29350c;
            this.f29352e = "did";
        } else if (!this.f29353f.isEmpty()) {
            this.f29348a = this.f29353f;
            this.f29352e = "local";
        } else {
            this.f29352e = "none";
            this.f29348a = "";
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("uid") || str.equals("did")) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : this.o) {
            if (i.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static String a(HttpURLConnection httpURLConnection, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    public final String a(Response response, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str);
            jSONObject2.put("headers", response.headers().toString());
            jSONObject.put("base", jSONObject2);
            jSONObject.put("report_time", System.currentTimeMillis());
            jSONObject.put("store_idc", this.f29349b);
            jSONObject.put("store_region", this.f29348a);
            jSONObject.put("source", this.f29352e);
            jSONObject.put("did_region", this.f29350c);
            jSONObject.put("uid_region", this.f29351d);
            jSONObject.put("local", this.f29353f);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final void a(Request request, Request.a aVar, List<com.bytedance.retrofit2.client.b> list) {
        if (!TextUtils.isEmpty(request.getPath())) {
            for (String str : this.o) {
                if (i.a(request.getPath(), str)) {
                    if (!this.f29350c.isEmpty()) {
                        list.add(new com.bytedance.retrofit2.client.b("x-tt-store-region-did", this.f29350c));
                    } else {
                        list.add(new com.bytedance.retrofit2.client.b("x-tt-store-region-did", "none"));
                    }
                    if (!this.f29351d.isEmpty()) {
                        list.add(new com.bytedance.retrofit2.client.b("x-tt-store-region-uid", this.f29351d));
                    } else {
                        list.add(new com.bytedance.retrofit2.client.b("x-tt-store-region-uid", "none"));
                    }
                    h hVar = new h(request.getUrl());
                    hVar.a("okhttp_version", "4.0.71.7-tiktok");
                    aVar.a(hVar.a());
                    return;
                }
            }
        }
    }

    public final void a(String str, String str2, Context context, a aVar) {
        if (!TextUtils.isEmpty(str2) && context != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String string = optJSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        this.o.add(string);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    String string2 = optJSONArray2.getString(i3);
                    if (!TextUtils.isEmpty(string2)) {
                        this.f29354g.add(string2);
                    }
                }
                this.f29355h = context;
                this.f29358k = aVar;
                if (!TextUtils.isEmpty(str)) {
                    this.f29353f = str;
                }
                if (!(this.o.isEmpty() || this.o.isEmpty())) {
                    this.f29356i = true;
                    SharedPreferences a2 = d.a(this.f29355h, "ttnet_store_region", 0);
                    this.f29349b = a2.getString("store_idc", "");
                    this.f29348a = a2.getString("store_region", "");
                    this.f29351d = a2.getString("store_region_uid", "");
                    this.f29350c = a2.getString("store_region_did", "");
                    this.f29352e = a2.getString("store_region_src", "");
                    this.f29357j = a2.getBoolean("disable_store_region", false);
                    b();
                    this.f29358k.a(this.f29349b, this.f29348a, this.f29352e);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
