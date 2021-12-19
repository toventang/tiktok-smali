package com.ss.android.ugc.aweme.web.jsbridge.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.h;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.fd;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import com.ss.android.ugc.aweme.web.jsbridge.g;
import com.ss.android.ugc.aweme.web.jsbridge.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f144992a = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private h f144993b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f144994c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f144995d;

    /* renamed from: e  reason: collision with root package name */
    private a f144996e;

    /* renamed from: f  reason: collision with root package name */
    private a.AbstractC3854a f144997f;

    /* renamed from: g  reason: collision with root package name */
    private a.c f144998g;

    /* renamed from: h  reason: collision with root package name */
    private t f144999h;

    /* renamed from: i  reason: collision with root package name */
    private String f145000i;

    /* renamed from: j  reason: collision with root package name */
    private String f145001j;

    /* renamed from: k  reason: collision with root package name */
    private String f145002k;

    /* renamed from: l  reason: collision with root package name */
    private JSONObject f145003l;

    /* renamed from: m  reason: collision with root package name */
    private JSONObject f145004m;
    private List<b> n;
    private String o;
    private Exception p;
    private Callable<JSONObject> q = new e(this);
    private Callable<JSONObject> r = new f(this);
    private Callable<JSONObject> s = new g(this);
    private Callable<JSONObject> t = new h(this);
    private CommonApi u = ((CommonApi) com.bytedance.ies.ugc.aweme.network.ext.a.a(Api.f66569d, CommonApi.class));

    static {
        Covode.recordClassIndex(94809);
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject c() {
        String str;
        Exception e2;
        String str2 = "";
        String a2 = a(this.f145001j, this.f145003l);
        this.f145001j = a2;
        try {
            JSONObject jSONObject = this.f145004m;
            String str3 = this.o;
            if (str3 == null) {
                str3 = "application/x-www-form-urlencoded";
            }
            u<String> a3 = fd.a(a2, jSONObject, str3, this.n);
            T t2 = a3.f42630b;
            try {
                JSONObject jSONObject2 = new JSONObject();
                String a4 = a(a3.f42629a.f42476d, "x-tt-logid");
                jSONObject2.put("code", 1);
                jSONObject2.put("response", new JSONObject((String) t2).put("_AME_Header_RequestID", a4));
                jSONObject2.put("_raw", t2);
                return jSONObject2;
            } catch (Exception e3) {
                e2 = e3;
                str = str2;
                str2 = t2;
                this.p = e2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("code", 0);
                    jSONObject3.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                    jSONObject3.put("_raw", str2);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                return jSONObject3;
            }
        } catch (Exception e5) {
            e2 = e5;
            str = str2;
            this.p = e2;
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("code", 0);
            jSONObject32.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
            jSONObject32.put("_raw", str2);
            return jSONObject32;
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject b() {
        String str;
        Exception e2;
        T t2;
        String str2 = "";
        this.f145001j = a(this.f145001j, this.f145003l);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.o != null) {
                u<String> c2 = fd.f142903a.c(this.f145001j, this.f145004m, this.o, this.n);
                t2 = c2.f42630b;
                try {
                    str2 = a(c2.f42629a.f42476d, "x-tt-logid");
                } catch (Exception e3) {
                    e2 = e3;
                    str = str2;
                    str2 = t2;
                }
            } else {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject2 = this.f145004m;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, this.f145004m.optString(next, str2));
                    }
                }
                q.b(hashMap, true);
                u<String> execute = this.u.doPost(this.f145001j, 0, hashMap).execute();
                t2 = execute.f42630b;
                str2 = a(execute.f42629a.f42476d, "x-tt-logid");
                Api.a(t2, this.f145001j);
            }
            str = str2;
            str2 = t2;
            try {
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                jSONObject.put("_raw", str2);
                return jSONObject;
            } catch (Exception e4) {
                e2 = e4;
                this.p = e2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("code", 0);
                    jSONObject3.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                    jSONObject3.put("_raw", str2);
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                return jSONObject3;
            }
        } catch (Exception e6) {
            e2 = e6;
            str = str2;
            this.p = e2;
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("code", 0);
            jSONObject32.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
            jSONObject32.put("_raw", str2);
            return jSONObject32;
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject d() {
        String a2 = a(this.f145001j, this.f145003l);
        this.f145001j = a2;
        try {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = f();
            }
            if (j.f107229h) {
                String str = (String) Api.a(this.u.doDelete(a2, this.n).execute().f42630b, Api.d.f66578a, (String) null, a2);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                return jSONObject;
            }
            throw new IOException();
        } catch (com.ss.android.http.a.a.b e2) {
            this.p = e2;
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject2, e2.getStatusCode(), e2.getMessage(), "");
            return jSONObject2;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
            this.p = e3;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e3.getResponse());
            } catch (JSONException unused) {
            }
            a(jSONObject3, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt());
            return jSONObject3;
        } catch (Exception e4) {
            this.p = e4;
            JSONObject jSONObject4 = new JSONObject();
            a(jSONObject4, -408, e4.getMessage(), "");
            return jSONObject4;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        r8.p = r0;
        r2 = new org.json.JSONObject();
        a(r2, r0.getStatusCode(), r0.getMessage(), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r8.p = r0;
        r2 = new org.json.JSONObject();
        a(r2, -408, r0.getMessage(), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e A[ExcHandler: b (r0v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004f A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject e() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.a.d.e():org.json.JSONObject");
    }

    @Override // com.ss.android.ugc.aweme.web.jsbridge.a.b
    public final void a() {
        h hVar = this.f144993b;
        this.f145000i = hVar.f35531b;
        JSONObject jSONObject = hVar.f35533d;
        this.f145001j = jSONObject.optString("url", "");
        this.f145002k = jSONObject.optString("method", "get");
        this.f145003l = jSONObject.optJSONObject("params");
        this.f145004m = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.n = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    this.n.add(new b(next, optString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.o = optString;
                    }
                }
            }
        }
        this.f144999h = g.a();
        if ("get".equalsIgnoreCase(this.f145002k)) {
            n.a().a(this.f144995d, this.q, 25);
        } else if (UGCMonitor.TYPE_POST.equalsIgnoreCase(this.f145002k)) {
            n.a().a(this.f144995d, this.r, 32);
        } else if ("put".equalsIgnoreCase(this.f145002k)) {
            n.a().a(this.f144995d, this.s, 33);
        } else if ("delete".equalsIgnoreCase(this.f145002k)) {
            n.a().a(this.f144995d, this.t, 34);
        }
    }

    private void a(com.ss.android.common.util.g gVar) {
        t tVar = this.f144999h;
        if (tVar != null) {
            Map<String, String> a2 = tVar.a();
            if (!a2.isEmpty()) {
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        gVar.a(key, value);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(Message message) {
        if (message.what != 25 && message.what != 32 && message.what != 33 && message.what != 34) {
            return false;
        }
        if (message.obj == null) {
            return true;
        }
        try {
            JSONObject jSONObject = (JSONObject) message.obj;
            if (this.f144998g != null) {
                a.b bVar = new a.b(this.f145002k, a(this.f145001j, this.f145003l), this.f145004m);
                JSONObject jSONObject2 = null;
                if (jSONObject != null && jSONObject.has("response")) {
                    jSONObject2 = jSONObject.optJSONObject("response");
                }
                this.f144998g.a(bVar, new a.d(jSONObject2, this.p));
            }
            if (this.f144996e == null || TextUtils.isEmpty(this.f145000i)) {
                a.AbstractC3854a aVar = this.f144997f;
                if (aVar == null) {
                    return false;
                }
                aVar.a(jSONObject);
                return false;
            }
            this.f144996e.a(this.f145000i, jSONObject);
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private String a(String str, JSONObject jSONObject) {
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(str);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                gVar.a(next, jSONObject.optString(next, ""));
            }
        }
        a(gVar);
        a(gVar, "request_tag_from", "h5");
        return gVar.a();
    }

    private static String a(List<b> list, String str) {
        for (b bVar : list) {
            if (str.equals(bVar.f42471a.toLowerCase())) {
                return bVar.f42472b;
            }
        }
        return "";
    }

    private static void a(com.ss.android.common.util.g gVar, String str, String str2) {
        List<com.ss.android.http.a.b.d> list = gVar.f59389a;
        if (list != null && !list.isEmpty()) {
            for (com.ss.android.http.a.b.d dVar : list) {
                if (str.equalsIgnoreCase(dVar.f59532a)) {
                    return;
                }
            }
        }
        gVar.a(str, str2);
    }

    private static void a(JSONObject jSONObject, int i2, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            b(jSONObject2, i2, str, str2);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void b(JSONObject jSONObject, int i2, String str, String str2) {
        try {
            jSONObject.put("errCode", i2);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public d(h hVar, JSONObject jSONObject, com.bytedance.ies.web.a.a aVar, a.AbstractC3854a aVar2, a.c cVar) {
        this.f144993b = hVar;
        this.f144994c = jSONObject;
        this.f144996e = aVar;
        this.f144997f = aVar2;
        this.f144998g = cVar;
        this.f144995d = new Handler(Looper.getMainLooper(), new i(this));
    }
}
