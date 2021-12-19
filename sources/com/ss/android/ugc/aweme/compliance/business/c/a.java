package com.ss.android.ugc.aweme.compliance.business.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.i;
import com.ss.android.ugc.aweme.net.monitor.k;
import com.ss.android.ugc.aweme.net.monitor.l;
import com.ss.android.ugc.aweme.utils.in;
import h.a.am;
import h.a.n;
import h.a.z;
import h.m.p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements i, k, l {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f76826a = am.a((Object[]) new String[]{"/tfe/api/request_combine/v1/", "/aweme/v1/compliance/settings/", "/tiktok/v1/kids/settings/"});

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f76827b = am.a((Object[]) new String[]{"did", "deviceid", "device_id"});

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f76828c = am.a((Object[]) new String[]{"iid", "installid", "install_id"});

    /* renamed from: d  reason: collision with root package name */
    public static final TypedByteArray f76829d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f76830e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f76831f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final List<JSONObject> f76832g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public static final C1758a f76833h = new C1758a((byte) 0);

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> b(e<Request, u<?>> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> d(e<okhttp3.Request, Response> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> f(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> h(e<HttpURLConnection, InputStream> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> j(e<HttpURLConnection, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.c.a$a  reason: collision with other inner class name */
    public static final class C1758a {
        static {
            Covode.recordClassIndex(47498);
        }

        private C1758a() {
        }

        public /* synthetic */ C1758a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.l
    public final e<Request, u<?>> a(e<Request, u<?>> eVar) {
        Q q;
        List<b> list;
        h.f.b.l.d(eVar, "");
        Q q2 = eVar.f112458a;
        String url = q2 != null ? q2.getUrl() : null;
        com.ss.android.ugc.aweme.compliance.api.model.e a2 = a(url);
        if (a2.f76649a) {
            Q q3 = eVar.f112458a;
            if (q3 == null || (list = q3.getHeaders()) == null) {
                list = z.INSTANCE;
            }
            c cVar = new c(url, 1001, "", list, f76829d);
            eVar.a(d.INTERCEPT);
            eVar.f112459b = (R) u.a(cVar.f42477e, cVar);
            a(url, "2", 0, a2);
        } else if (b() && (q = eVar.f112458a) != null) {
            com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, url, null, null, null, null, null, 502);
            a(eVar2);
            HashMap hashMap = new HashMap();
            List<b> headers = q.getHeaders();
            if (headers != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) headers, 10));
                for (T t : headers) {
                    h.f.b.l.b(t, "");
                    String str = t.f42471a;
                    h.f.b.l.b(str, "");
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = p.b((CharSequence) str).toString();
                    String str2 = t.f42472b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put(obj, str2);
                    arrayList.add(h.z.f158842a);
                }
            }
            HashMap<String, String> a3 = a(eVar2, hashMap, 2);
            if (eVar2.f76649a) {
                ArrayList arrayList2 = new ArrayList(a3.size());
                for (Map.Entry<String, String> entry : a3.entrySet()) {
                    arrayList2.add(new b(entry.getKey(), entry.getValue()));
                }
                List<b> k2 = n.k(arrayList2);
                Request.a newBuilder = q.newBuilder();
                newBuilder.a(eVar2.f76652d);
                newBuilder.f42460c = k2;
                eVar.f112458a = (Q) newBuilder.a();
                a(url, "2", 1, eVar2);
            }
        }
        return eVar;
    }

    private final void a(String str, String str2, int i2, com.ss.android.ugc.aweme.compliance.api.model.e eVar) {
        MethodCollector.i(6627);
        List<JSONObject> list = f76832g;
        if (!list.isEmpty()) {
            synchronized (f76831f) {
                try {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            com.bytedance.apm.b.a(com.ss.android.ugc.aweme.net.model.c.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), (JSONObject) it.next());
                        }
                        f76832g.clear();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6627);
                    throw th;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "hit_rule");
        jSONObject.put("flag", eVar.f76649a);
        String str3 = eVar.f76652d;
        if ((str3 != null && !p.a((CharSequence) str3)) || (str != null && !p.a((CharSequence) str))) {
            String str4 = eVar.f76652d;
            if (str4 != null) {
                str = str4;
            }
            eVar.f76652d = str;
            a(eVar);
            jSONObject.put("url", eVar.f76652d);
        }
        Set<String> set = eVar.f76653e;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it2 = eVar.f76653e.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("header_keys", jSONArray);
        }
        Set<String> set2 = eVar.f76654f;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it3 = eVar.f76654f.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
            jSONObject.put("query_keys", jSONArray2);
        }
        Set<String> set3 = eVar.f76657i;
        if (set3 != null && !set3.isEmpty()) {
            jSONObject.put("config", eVar.f76657i.toString());
        }
        jSONObject.put("action", i2);
        jSONObject.put("net_type", str2);
        com.bytedance.apm.b.a(com.ss.android.ugc.aweme.net.model.c.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), jSONObject);
        MethodCollector.o(6627);
    }

    static {
        Covode.recordClassIndex(47497);
        byte[] bytes = "{\"status_code\": 1001}".getBytes(h.m.d.f158808a);
        h.f.b.l.b(bytes, "");
        f76829d = new TypedByteArray("application/json; charset=utf-8", bytes, new String[0]);
        String simpleName = a.class.getSimpleName();
        h.f.b.l.b(simpleName, "");
        f76830e = simpleName;
    }

    private static boolean b() {
        List<InterfaceControlRule> rules;
        InterfaceControlSettings a2 = com.ss.android.ugc.aweme.compliance.common.b.a();
        ArrayList arrayList = null;
        if (!(a2 == null || (rules = a2.getRules()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : rules) {
                List<RuleConfig> ruleThens = t.getRuleThens();
                if (ruleThens != null) {
                    Iterator<T> it = ruleThens.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (n.a((Iterable) ConfigTypeEnum.a.b(), (Object) next.getType())) {
                            if (next != null) {
                                arrayList2.add(t);
                            }
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (in.d() || (arrayList != null && !arrayList.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        com.ss.android.ugc.aweme.compliance.api.model.e a2 = a(str);
        if (a2.f76649a) {
            eVar.a(d.INTERCEPT);
            eVar.f112459b = (R) 1001;
            a(str, "3", 0, a2);
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        MethodCollector.i(6392);
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        com.ss.android.ugc.aweme.compliance.api.model.e a2 = a(str);
        if (a2.f76649a) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(h.m.d.f158808a);
            h.f.b.l.b(bytes, "");
            eVar.a(d.INTERCEPT);
            eVar.f112459b = (R) new ByteArrayInputStream(bytes);
            a(str, "3", 0, a2);
        }
        MethodCollector.o(6392);
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        MethodCollector.i(6395);
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        com.ss.android.ugc.aweme.compliance.api.model.e a2 = a(str);
        if (a2.f76649a) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(h.m.d.f158808a);
            h.f.b.l.b(bytes, "");
            eVar.a(d.INTERCEPT);
            eVar.f112459b = (R) new ByteArrayInputStream(bytes);
            a(str, "3", 0, a2);
        }
        MethodCollector.o(6395);
        return eVar;
    }

    private static com.ss.android.ugc.aweme.compliance.api.model.e a(com.ss.android.ugc.aweme.compliance.api.model.e eVar) {
        if (!TextUtils.isEmpty(eVar.f76652d)) {
            Uri parse = Uri.parse(eVar.f76652d);
            h.f.b.l.b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList(n.a(queryParameterNames, 10));
                for (T t : queryParameterNames) {
                    h.f.b.l.b(t, "");
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = p.b((CharSequence) t).toString();
                    String queryParameter = parse.getQueryParameter(t);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    h.f.b.l.b(queryParameter, "");
                    hashMap.put(obj, queryParameter);
                    arrayList.add(h.z.f158842a);
                }
                HashMap<String, String> a2 = a(eVar, hashMap, 0);
                if (eVar.f76649a) {
                    Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    for (Map.Entry<String, String> entry : a2.entrySet()) {
                        clearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    eVar.f76652d = clearQuery.build().toString();
                }
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> k(e<HttpURLConnection, InputStream> eVar) {
        String str;
        String str2;
        String str3;
        URL url;
        String str4 = "";
        h.f.b.l.d(eVar, str4);
        if (b()) {
            JSONObject jSONObject = eVar.f112461d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", str4);
                str2 = jSONObject.optString("value", str4);
            } else {
                str = str4;
                str2 = str;
            }
            if (str != null && !p.a((CharSequence) str)) {
                com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, null, null, null, null, null, null, 510);
                HashMap hashMap = new HashMap();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) str).toString();
                if (str2 != null) {
                    str4 = str2;
                }
                hashMap.put(obj, str4);
                HashMap<String, String> a2 = a(eVar2, hashMap, 2);
                if (eVar2.f76649a) {
                    Q q = eVar.f112458a;
                    if (q == null || (url = q.getURL()) == null) {
                        str3 = null;
                    } else {
                        str3 = url.toString();
                    }
                    if (a2 == null || a2.isEmpty()) {
                        eVar.a(d.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : a2.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    a(str3, "3", 1, eVar2);
                }
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> l(e<HttpURLConnection, InputStream> eVar) {
        String str;
        String str2;
        String str3;
        URL url;
        String str4 = "";
        h.f.b.l.d(eVar, str4);
        if (b()) {
            JSONObject jSONObject = eVar.f112461d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", str4);
                str2 = jSONObject.optString("value", str4);
            } else {
                str = str4;
                str2 = str;
            }
            if (str != null && !p.a((CharSequence) str)) {
                com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, null, null, null, null, null, null, 510);
                HashMap hashMap = new HashMap();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) str).toString();
                if (str2 != null) {
                    str4 = str2;
                }
                hashMap.put(obj, str4);
                HashMap<String, String> a2 = a(eVar2, hashMap, 2);
                if (eVar2.f76649a) {
                    Q q = eVar.f112458a;
                    if (q == null || (url = q.getURL()) == null) {
                        str3 = null;
                    } else {
                        str3 = url.toString();
                    }
                    if (a2 == null || a2.isEmpty()) {
                        eVar.a(d.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : a2.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    a(str3, "3", 1, eVar2);
                }
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.i
    public final e<URL, URLConnection> m(e<URL, URLConnection> eVar) {
        String str;
        R r;
        HttpURLConnection httpURLConnection;
        h.f.b.l.d(eVar, "");
        Q q = eVar.f112458a;
        if (q != null) {
            str = q.toString();
        } else {
            str = null;
        }
        if (b() && eVar.f112458a != null) {
            com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502);
            a(eVar2);
            if (eVar2.f76649a) {
                URL url = new URL(eVar2.f76652d);
                e<URL, URLConnection> m2 = com.ss.android.ugc.aweme.net.monitor.n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
                if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
                    r = m2.f112459b;
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new com.ss.android.ugc.aweme.net.l.b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                        }
                        eVar.f112459b = r;
                        eVar.a(d.INTERCEPT);
                        a(str, "3", 1, eVar2);
                    }
                } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
                    r = (R) url.openConnection();
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new com.ss.android.ugc.aweme.net.l.b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new com.ss.android.ugc.aweme.net.l.a(r);
                        }
                        eVar.f112459b = r;
                        eVar.a(d.INTERCEPT);
                        a(str, "3", 1, eVar2);
                    }
                } else {
                    throw m2.f112462e;
                }
                r = (R) httpURLConnection;
                eVar.f112459b = r;
                eVar.a(d.INTERCEPT);
                a(str, "3", 1, eVar2);
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.k
    public final e<okhttp3.Request, Response> c(e<okhttp3.Request, Response> eVar) {
        Q q;
        Set<String> names;
        HttpUrl url;
        h.f.b.l.d(eVar, "");
        Q q2 = eVar.f112458a;
        String str = null;
        if (!(q2 == null || (url = q2.url()) == null)) {
            str = url.toString();
        }
        com.ss.android.ugc.aweme.compliance.api.model.e a2 = a(str);
        if (a2.f76649a) {
            Response.Builder message = new Response.Builder().code(1001).protocol(Protocol.HTTP_2).message("");
            Q q3 = eVar.f112458a;
            if (q3 == null) {
                h.f.b.l.b();
            }
            eVar.a(d.INTERCEPT);
            eVar.f112459b = (R) message.request(q3).body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"status_code\": 1001}")).build();
            a(str, "4", 0, a2);
        } else if (b() && (q = eVar.f112458a) != null) {
            Headers headers = q.headers();
            com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502);
            a(eVar2);
            HashMap hashMap = new HashMap();
            if (!(headers == null || (names = headers.names()) == null)) {
                ArrayList arrayList = new ArrayList(n.a(names, 10));
                for (T t : names) {
                    h.f.b.l.b(t, "");
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = p.b((CharSequence) t).toString();
                    String str2 = headers.get(t);
                    if (str2 == null) {
                        str2 = "";
                    }
                    h.f.b.l.b(str2, "");
                    hashMap.put(obj, str2);
                    arrayList.add(h.z.f158842a);
                }
            }
            HashMap<String, String> a3 = a(eVar2, hashMap, 2);
            if (eVar2.f76649a) {
                Headers.Builder builder = new Headers.Builder();
                for (Map.Entry<String, String> entry : a3.entrySet()) {
                    builder.add(entry.getKey(), entry.getValue());
                }
                Request.Builder newBuilder = q.newBuilder();
                String str3 = eVar2.f76652d;
                if (str3 == null) {
                    h.f.b.l.b();
                }
                newBuilder.url(str3);
                newBuilder.headers(builder.build());
                eVar.f112458a = (Q) newBuilder.build();
                a(str, "4", 1, eVar2);
            }
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x017f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x00cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[SYNTHETIC, Splitter:B:40:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.compliance.api.model.e a(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.a.a(java.lang.String):com.ss.android.ugc.aweme.compliance.api.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r8, com.ss.android.ugc.aweme.compliance.api.model.RuleWhen r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.a.a(java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.RuleWhen):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r1 == com.ss.android.ugc.aweme.compliance.api.a.b.NOT_LOGIN) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.ss.android.ugc.aweme.compliance.api.model.e r9, java.util.HashMap<java.lang.String, java.lang.String> r10, java.util.Set<java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.a.a(com.ss.android.ugc.aweme.compliance.api.model.e, java.util.HashMap, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r16.isEmpty() == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> a(com.ss.android.ugc.aweme.compliance.api.model.e r15, java.util.HashMap<java.lang.String, java.lang.String> r16, int r17) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.a.a(com.ss.android.ugc.aweme.compliance.api.model.e, java.util.HashMap, int):java.util.HashMap");
    }
}
