package com.bytedance.retrofit2;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class s {
    public long A = -1;
    public long B = -1;
    public long C = -1;
    public long D = -1;
    public long E = -1;
    public long F = -1;
    public long G = -1;
    public long H = -1;
    public long I = -1;
    public long J = -1;
    public long K = -1;
    public long L = -1;
    public Map<String, Long> M = new HashMap();
    public String N = "";
    public JSONArray O;
    public Map<String, Long> P = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f42590a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f42591b = "";

    /* renamed from: c  reason: collision with root package name */
    public List<JSONObject> f42592c;

    /* renamed from: d  reason: collision with root package name */
    public String f42593d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42594e;

    /* renamed from: f  reason: collision with root package name */
    public long f42595f;

    /* renamed from: g  reason: collision with root package name */
    public long f42596g;

    /* renamed from: h  reason: collision with root package name */
    public long f42597h;

    /* renamed from: i  reason: collision with root package name */
    public long f42598i;

    /* renamed from: j  reason: collision with root package name */
    public long f42599j;

    /* renamed from: k  reason: collision with root package name */
    public long f42600k;

    /* renamed from: l  reason: collision with root package name */
    public long f42601l;

    /* renamed from: m  reason: collision with root package name */
    public long f42602m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public Map<String, Long> x = new HashMap();
    public Map<String, Long> y = new HashMap();
    public long z = -1;

    static {
        Covode.recordClassIndex(26090);
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", Build.MODEL);
            String str = "";
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null && strArr.length > 0) {
                    str = Arrays.asList(strArr).toString();
                }
            }
            jSONObject.put("abis", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Long> entry : this.P.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public s() {
    }

    private JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.z);
            jSONObject.put("addCommonParam", this.A);
            jSONObject.put("requestVerify", this.B);
            jSONObject.put("encryptRequest", this.D);
            jSONObject.put("genReqTicket", this.E);
            jSONObject.put("checkReqTicket", this.F);
            jSONObject.put("preCdnVerify", this.G);
            jSONObject.put("postCdnVerify", this.J);
            jSONObject.put("addClientKey", this.H);
            jSONObject.put("updateClientKey", this.I);
            jSONObject.put("commandListener", this.K);
            jSONObject.put("filterDupQuery", this.C);
            jSONObject.put("queryFilter", this.L);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.x.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Long> entry : this.x.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.y.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Long> entry2 : this.y.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f42590a != -1) {
                jSONObject.put("model", b());
            }
            List<JSONObject> list = this.f42592c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (JSONObject jSONObject2 : this.f42592c) {
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("connectionAttempts", jSONArray);
            }
            jSONObject.put("concurrent", this.f42594e);
            jSONObject.put("base", c());
            jSONObject.put("callback", e());
            jSONObject.put("interceptor", f());
            jSONObject.put("ttnetVersion", this.N);
            JSONArray jSONArray2 = this.O;
            if (jSONArray2 != null) {
                jSONObject.put("actionInfo", jSONArray2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject c() {
        boolean a2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.f42590a);
            if (!TextUtils.isEmpty(this.f42591b)) {
                jSONObject.put("fallbackMessage", this.f42591b);
            }
            jSONObject.put("createRetrofitTime", this.f42595f);
            jSONObject.put("appRequestStartTime", this.f42596g);
            jSONObject.put("beforeAllInterceptTime", this.f42597h);
            jSONObject.put("callServerInterceptTime", this.f42598i);
            jSONObject.put("callExecuteStartTime", this.f42599j);
            jSONObject.put("reportTime", this.f42600k);
            jSONObject.put("delayWait", this.p);
            jSONObject.put("injectInterceptorTime", d());
            if (!TextUtils.isEmpty(this.f42593d)) {
                jSONObject.put("transactionId", this.f42593d);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        boolean a3 = a(jSONObject, "loadServiceMethod", this.f42601l, this.f42602m, true);
        long j2 = this.n;
        if (j2 > 0) {
            a2 = a(jSONObject, "enqueueWait", j2, this.q, a3);
        } else {
            a2 = a(jSONObject, "executeWait", this.o, this.q, a3);
        }
        a(jSONObject, "responseParse", this.v, this.w, a(jSONObject, "requestParse", this.r, this.s, a(jSONObject, "executeCall", this.t, this.u, a2)));
        return jSONObject;
    }

    public s(long j2, long j3) {
        this.f42596g = j2;
        this.f42597h = j3;
    }

    private static boolean a(JSONObject jSONObject, String str, long j2, long j3, boolean z2) {
        if (!z2 || j2 > j3) {
            jSONObject.put(str, -1);
            return false;
        }
        try {
            jSONObject.put(str, j3 - j2);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
