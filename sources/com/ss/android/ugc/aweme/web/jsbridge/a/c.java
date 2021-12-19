package com.ss.android.ugc.aweme.web.jsbridge.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.h;
import com.bytedance.retrofit2.client.b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import com.ss.android.ugc.aweme.web.jsbridge.g;
import com.ss.android.ugc.aweme.web.jsbridge.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f144973a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public a f144974b;

    /* renamed from: c  reason: collision with root package name */
    public a.AbstractC3854a f144975c;

    /* renamed from: d  reason: collision with root package name */
    public a.c f144976d;

    /* renamed from: e  reason: collision with root package name */
    public String f144977e;

    /* renamed from: f  reason: collision with root package name */
    public String f144978f;

    /* renamed from: g  reason: collision with root package name */
    public String f144979g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f144980h;

    /* renamed from: i  reason: collision with root package name */
    public JSONObject f144981i;

    /* renamed from: j  reason: collision with root package name */
    public Exception f144982j = null;

    /* renamed from: k  reason: collision with root package name */
    private h f144983k;

    /* renamed from: l  reason: collision with root package name */
    private JSONObject f144984l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f144985m;
    private t n;
    private CommonApi o = ((CommonApi) com.bytedance.ies.ugc.aweme.network.ext.a.a(Api.f66569d, CommonApi.class));
    private List<b> p;
    private String q;
    private Callable<JSONObject> r = new Callable<JSONObject>() {
        /* class com.ss.android.ugc.aweme.web.jsbridge.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(94804);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return c.this.e();
        }
    };
    private Callable<JSONObject> s = new Callable<JSONObject>() {
        /* class com.ss.android.ugc.aweme.web.jsbridge.a.c.AnonymousClass2 */

        static {
            Covode.recordClassIndex(94805);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return c.this.b();
        }
    };
    private Callable<JSONObject> t = new Callable<JSONObject>() {
        /* class com.ss.android.ugc.aweme.web.jsbridge.a.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(94806);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return c.this.c();
        }
    };
    private Callable<JSONObject> u = new Callable<JSONObject>() {
        /* class com.ss.android.ugc.aweme.web.jsbridge.a.c.AnonymousClass4 */

        static {
            Covode.recordClassIndex(94807);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return c.this.d();
        }
    };

    static {
        Covode.recordClassIndex(94803);
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r2 = r3;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r14.f144982j = r4;
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.put("code", 0);
        r2 = new org.json.JSONObject();
        r2.put("errCode", r4.getStatusCode());
        r2.put("message", r4.getMessage());
        r3.put("error", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[ExcHandler: b (r4v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject b() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.a.c.b():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r2 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r10.f144982j = r4;
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.put("code", 0);
        r2 = new org.json.JSONObject();
        r2.put("errCode", r4.getStatusCode());
        r2.put("message", r4.getMessage());
        r3.put("error", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[ExcHandler: b (r4v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject c() {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.a.c.c():org.json.JSONObject");
    }

    public final JSONObject d() {
        String a2 = a(this.f144978f, this.f144980h);
        this.f144978f = a2;
        try {
            d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = f();
            }
            if (j.f107229h) {
                ArrayList arrayList = new ArrayList();
                if (!com.ss.android.ugc.aweme.base.utils.d.a(this.p)) {
                    for (b bVar : this.p) {
                        arrayList.add(new b(bVar.f42471a, bVar.f42472b));
                    }
                }
                String str = (String) Api.a(this.o.doDelete(a2, 0, arrayList).execute().f42630b, Api.d.f66578a, (String) null, a2);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                return jSONObject;
            }
            throw new IOException();
        } catch (com.ss.android.http.a.a.b e2) {
            this.f144982j = e2;
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject2, e2.getStatusCode(), e2.getMessage(), "");
            return jSONObject2;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
            this.f144982j = e3;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e3.getResponse());
            } catch (JSONException unused) {
            }
            a(jSONObject3, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt());
            return jSONObject3;
        } catch (Exception e4) {
            this.f144982j = e4;
            JSONObject jSONObject4 = new JSONObject();
            a(jSONObject4, -408, e4.getMessage(), "");
            return jSONObject4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r8.f144982j = r0;
        r2 = new org.json.JSONObject();
        a(r2, -408, r0.getMessage(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r8.f144982j = r0;
        r2 = new org.json.JSONObject();
        a(r2, r0.getStatusCode(), r0.getMessage(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7 A[ExcHandler: b (r0v2 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject e() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.a.c.e():org.json.JSONObject");
    }

    @Override // com.ss.android.ugc.aweme.web.jsbridge.a.b
    public final void a() {
        h hVar = this.f144983k;
        this.f144977e = hVar.f35531b;
        JSONObject jSONObject = hVar.f35533d;
        this.f144978f = jSONObject.optString("url", "");
        this.f144979g = jSONObject.optString("method", "get");
        this.f144980h = jSONObject.optJSONObject("params");
        this.f144981i = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.p = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    this.p.add(new b(next, optString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.q = optString;
                    }
                }
            }
        }
        this.n = g.a();
        if ("get".equalsIgnoreCase(this.f144979g)) {
            n.a().a(this.f144985m, this.r, 25);
        } else if (UGCMonitor.TYPE_POST.equalsIgnoreCase(this.f144979g)) {
            n.a().a(this.f144985m, this.s, 32);
        } else if ("put".equalsIgnoreCase(this.f144979g)) {
            n.a().a(this.f144985m, this.t, 33);
        } else if ("delete".equalsIgnoreCase(this.f144979g)) {
            n.a().a(this.f144985m, this.u, 34);
        }
    }

    private void a(com.ss.android.common.util.g gVar) {
        t tVar = this.n;
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

    private static String a(List<b> list, String str) {
        for (b bVar : list) {
            if (str.equals(bVar.f42471a.toLowerCase())) {
                return bVar.f42472b;
            }
        }
        return "";
    }

    public final String a(String str, JSONObject jSONObject) {
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

    public c(h hVar, JSONObject jSONObject, com.bytedance.ies.web.a.a aVar, a.AbstractC3854a aVar2, a.c cVar) {
        this.f144983k = hVar;
        this.f144984l = jSONObject;
        this.f144974b = aVar;
        this.f144975c = aVar2;
        this.f144976d = cVar;
        this.f144985m = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            /* class com.ss.android.ugc.aweme.web.jsbridge.a.c.AnonymousClass5 */

            static {
                Covode.recordClassIndex(94808);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 25 && message.what != 32 && message.what != 33 && message.what != 34) {
                    return false;
                }
                if (message.obj == null) {
                    return true;
                }
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    if (c.this.f144976d != null) {
                        String str = c.this.f144979g;
                        c cVar = c.this;
                        a.b bVar = new a.b(str, cVar.a(cVar.f144978f, c.this.f144980h), c.this.f144981i);
                        JSONObject jSONObject2 = null;
                        if (jSONObject != null && jSONObject.has("response")) {
                            jSONObject2 = jSONObject.optJSONObject("response");
                        }
                        c.this.f144976d.a(bVar, new a.d(jSONObject2, c.this.f144982j));
                    }
                    if (c.this.f144974b != null && !TextUtils.isEmpty(c.this.f144977e)) {
                        c.this.f144974b.a(c.this.f144977e, jSONObject);
                        return false;
                    } else if (c.this.f144975c == null) {
                        return false;
                    } else {
                        c.this.f144975c.a(jSONObject);
                        return false;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return false;
                }
            }
        });
    }
}
