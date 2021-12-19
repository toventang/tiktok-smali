package com.bytedance.frameworks.baselib.network.http.d.a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.frameworks.baselib.network.http.d.a.a.a;
import com.bytedance.frameworks.baselib.network.http.d.a.a.h;
import com.bytedance.frameworks.baselib.network.http.d.a.b.k;
import com.bytedance.frameworks.baselib.network.http.d.a.b.l;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.g.g;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.d;
import com.bytedance.retrofit2.m;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.s;
import com.ss.android.ugc.aweme.base.utils.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import org.json.JSONException;
import org.json.JSONObject;

public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f29273a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile int f29274b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f29275c = "";

    /* renamed from: d  reason: collision with root package name */
    public static volatile int f29276d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f29277e = null;

    /* renamed from: f  reason: collision with root package name */
    public static volatile String[] f29278f = null;

    /* renamed from: g  reason: collision with root package name */
    public static volatile String[] f29279g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Context f29280h;

    /* renamed from: i  reason: collision with root package name */
    public static g f29281i;

    /* renamed from: j  reason: collision with root package name */
    public static e f29282j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile o f29283k;

    /* renamed from: l  reason: collision with root package name */
    private static final Object f29284l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static int f29285m = 0;
    private static volatile String n = "";

    public static class a implements d, m {
        static boolean n;

        /* renamed from: a  reason: collision with root package name */
        OkHttpClient f29287a;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.frameworks.baselib.network.http.a f29288b = com.bytedance.frameworks.baselib.network.http.a.a();

        /* renamed from: c  reason: collision with root package name */
        long f29289c = 0;

        /* renamed from: d  reason: collision with root package name */
        ResponseBody f29290d;

        /* renamed from: e  reason: collision with root package name */
        String f29291e;

        /* renamed from: f  reason: collision with root package name */
        Request f29292f;

        /* renamed from: g  reason: collision with root package name */
        okhttp3.Request f29293g;

        /* renamed from: h  reason: collision with root package name */
        Response f29294h;

        /* renamed from: i  reason: collision with root package name */
        Call f29295i;

        /* renamed from: j  reason: collision with root package name */
        boolean f29296j;

        /* renamed from: k  reason: collision with root package name */
        s f29297k;

        /* renamed from: l  reason: collision with root package name */
        volatile k f29298l;

        /* renamed from: m  reason: collision with root package name */
        boolean f29299m;

        static {
            Covode.recordClassIndex(17092);
        }

        @Override // com.bytedance.retrofit2.client.d
        public final boolean a(long j2) {
            return false;
        }

        @Override // com.bytedance.retrofit2.m
        public final Object getRequestInfo() {
            return this.f29288b;
        }

        private static boolean c() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.bytedance.retrofit2.client.d
        public final void b() {
            Call call = this.f29295i;
            if (call != null) {
                call.cancel();
                if (this.f29292f.isResponseStreaming() && !this.f29299m) {
                    this.f29288b.f28920h = System.currentTimeMillis();
                    if (this.f29288b.f28914b == null || this.f29288b.f28914b.p) {
                        long j2 = this.f29288b.f28920h;
                        long j3 = this.f29289c;
                        e.a(j2 - j3, j3, this.f29292f.getUrl(), this.f29291e, this.f29288b);
                    }
                }
                this.f29299m = true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x0286 A[Catch:{ all -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0289 A[Catch:{ all -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x023b A[Catch:{ all -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0246 A[Catch:{ all -> 0x0299 }] */
        @Override // com.bytedance.retrofit2.client.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.client.c a() {
            /*
            // Method dump skipped, instructions count: 725
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.o.a.a():com.bytedance.retrofit2.client.c");
        }

        private static List<b> a(Headers headers) {
            int size = headers.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                String name = headers.name(i2);
                if (name == null || !name.equalsIgnoreCase("bdturing-verify") || !n) {
                    arrayList.add(new b(headers.name(i2), headers.value(i2)));
                }
            }
            return arrayList;
        }

        public a(Request request) {
            EventListener eventListener;
            String method;
            String md5Stub;
            RequestBody requestBody = null;
            this.f29290d = null;
            this.f29291e = null;
            this.f29296j = false;
            this.f29297k = null;
            this.f29298l = null;
            this.f29299m = false;
            this.f29287a = o.f29281i.a();
            if (!e.a(request.getExtraInfo())) {
                e.b();
            }
            this.f29292f = request;
            String url = request.getUrl();
            s metrics = request.getMetrics();
            this.f29297k = metrics;
            if (metrics != null) {
                this.f29288b.f28915c = metrics.f42596g;
                this.f29288b.f28916d = this.f29297k.f42597h;
            }
            this.f29298l = new k();
            this.f29298l.O = url;
            long currentTimeMillis = System.currentTimeMillis();
            this.f29289c = currentTimeMillis;
            this.f29288b.f28917e = currentTimeMillis;
            this.f29288b.v = 1;
            if (this.f29292f.isResponseStreaming()) {
                this.f29288b.A = true;
            } else {
                this.f29288b.A = false;
            }
            try {
                OkHttpClient.Builder newBuilder = this.f29287a.newBuilder();
                newBuilder.connectTimeout(15000, TimeUnit.MILLISECONDS);
                newBuilder.readTimeout(15000, TimeUnit.MILLISECONDS);
                newBuilder.writeTimeout(15000, TimeUnit.MILLISECONDS);
                if (request.getExtraInfo() instanceof com.bytedance.frameworks.baselib.network.http.b) {
                    this.f29288b.f28914b = (T) ((com.bytedance.frameworks.baselib.network.http.b) request.getExtraInfo());
                    T t = this.f29288b.f28914b;
                    if (t.f28942c > 0 || t.f28943d > 0 || t.f28944e > 0) {
                        if (t.f28942c > 0) {
                            newBuilder.connectTimeout(t.f28942c, TimeUnit.MILLISECONDS);
                        }
                        if (t.f28944e > 0) {
                            newBuilder.writeTimeout(t.f28944e, TimeUnit.MILLISECONDS);
                        }
                        if (t.f28943d > 0) {
                            newBuilder.readTimeout(t.f28943d, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.f29296j = t.f28950k;
                    if (!t.o) {
                        newBuilder.followRedirects(false);
                    }
                }
                if (this.f29287a.eventListenerFactory() != null) {
                    eventListener = this.f29287a.eventListenerFactory().create(this.f29295i);
                } else {
                    eventListener = null;
                }
                newBuilder.eventListener(new j(eventListener, this.f29298l));
                this.f29287a = newBuilder.build();
                String method2 = request.getMethod();
                if (!k.a().c()) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    com.bytedance.frameworks.baselib.network.http.d.a.b.e a2 = k.a().a(new l(url, method2));
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (a2 != null) {
                        a(this.f29298l, this.f29292f.getMethod(), a2.f29188a, currentTimeMillis3 - currentTimeMillis2);
                        this.f29298l.R = a2.f29190c;
                        this.f29298l.Q = false;
                        if (!url.equals(a2.f29188a)) {
                            if (a2.f29188a.isEmpty() && !a2.f29189b.isEmpty()) {
                                throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                            } else if (i.b(a2.f29188a)) {
                                url = a2.f29188a;
                            }
                        }
                    }
                } else {
                    long currentTimeMillis4 = System.currentTimeMillis();
                    String a3 = k.a().a(url);
                    long currentTimeMillis5 = System.currentTimeMillis();
                    if (!url.equals(a3) && i.b(a3)) {
                        a(this.f29298l, this.f29292f.getMethod(), a3, currentTimeMillis5 - currentTimeMillis4);
                        this.f29298l.Q = true;
                        this.f29298l.S = k.a().f29208e.size();
                        url = a3;
                    }
                }
                String a4 = com.bytedance.frameworks.baselib.network.http.g.a.a(o.f29280h, url, this.f29292f.getHeaders());
                URI a5 = g.a(a4);
                if (a5 != null && !TextUtils.isEmpty(a5.getHost())) {
                    this.f29298l.V = a5.getHost();
                    i a6 = i.a();
                    String host = a5.getHost();
                    k kVar = this.f29298l;
                    if (kVar != null) {
                        if (a6.f29243a.containsKey(host)) {
                            a6.f29243a.get(host).add(kVar);
                        } else {
                            CopyOnWriteArrayList<k> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                            copyOnWriteArrayList.add(kVar);
                            a6.f29243a.put(host, copyOnWriteArrayList);
                        }
                    }
                }
                Request.Builder url2 = new Request.Builder().url(a4);
                if (!HttpMethod.permitsRequestBody(this.f29292f.getMethod())) {
                    method = this.f29292f.getMethod();
                } else {
                    method = this.f29292f.getMethod();
                    final TypedOutput body = this.f29292f.getBody();
                    RequestBody requestBody2 = this.f29292f.getRequestBody();
                    if (requestBody2 == null) {
                        if (body == null) {
                            requestBody = RequestBody.create((MediaType) null, "body=null");
                        } else {
                            final MediaType parse = MediaType.parse(body.mimeType());
                            requestBody2 = new RequestBody() {
                                /* class com.bytedance.frameworks.baselib.network.http.d.a.o.a.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(17093);
                                }

                                @Override // okhttp3.RequestBody
                                public final MediaType contentType() {
                                    return parse;
                                }

                                @Override // okhttp3.RequestBody
                                public final long contentLength() {
                                    return body.length();
                                }

                                @Override // okhttp3.RequestBody
                                public final void writeTo(k.g gVar) {
                                    body.writeTo(gVar.d());
                                }
                            };
                        }
                    }
                    requestBody = requestBody2;
                }
                Request.Builder method3 = url2.method(method, requestBody);
                List<b> headers = this.f29292f.getHeaders();
                if (!(this.f29292f.getBody() == null || (md5Stub = this.f29292f.getBody().md5Stub()) == null)) {
                    method3.addHeader("X-SS-STUB", md5Stub);
                }
                okhttp3.Request a7 = o.a(method3, headers);
                this.f29293g = a7;
                this.f29295i = this.f29287a.newCall(a7);
                com.bytedance.frameworks.baselib.network.http.a aVar = this.f29288b;
                aVar.z = o.a(this.f29293g, aVar);
            } catch (Exception e2) {
                o.a(this.f29293g, url, this.f29289c, this.f29288b, this.f29291e, e2, this.f29295i, this.f29294h, this.f29297k, this.f29298l);
                if (e2 instanceof IOException) {
                    throw e2;
                }
                throw new IOException(e2.getMessage(), e2.getCause());
            }
        }

        private static void a(k kVar, String str, String str2, long j2) {
            m mVar = new m();
            mVar.f29263a = 307;
            mVar.f29266d = true;
            mVar.f29264b = str;
            mVar.f29265c = str2;
            kVar.J.add(mVar);
            kVar.I++;
            kVar.r = j2;
            kVar.P = true;
        }
    }

    private static void a(String str, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (!com.bytedance.common.utility.m.a(str) && aVar != null) {
            try {
                Logger.debug();
                aVar.f28913a = str;
                if (aVar.f28914b != null) {
                    aVar.f28914b.f28940a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(com.bytedance.frameworks.baselib.network.http.a aVar) {
        return (aVar == null || aVar.f28914b == null || !aVar.f28914b.f28949j) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r22, int r23, okhttp3.Response r24, long r25, com.bytedance.frameworks.baselib.network.http.a r27, java.lang.String r28, com.bytedance.retrofit2.s r29, com.bytedance.frameworks.baselib.network.http.d.a.k r30) {
        /*
        // Method dump skipped, instructions count: 551
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.o.a(java.lang.String, int, okhttp3.Response, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, com.bytedance.retrofit2.s, com.bytedance.frameworks.baselib.network.http.d.a.k):byte[]");
    }

    private static void a(com.bytedance.frameworks.baselib.network.http.a aVar, s sVar, k kVar) {
        if (aVar != null && sVar != null) {
            sVar.f42590a = aVar.w;
            sVar.f42591b = aVar.x;
            sVar.u = SystemClock.uptimeMillis();
            sVar.f42600k = System.currentTimeMillis();
            sVar.N = "4.0.71.7-tiktok";
            try {
                aVar.z.put("retrofit", sVar.a());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (kVar != null) {
                kVar.a(aVar, f29280h);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void a(boolean z, Map<String, List<String>> map, int i2, InputStream inputStream, String str, s sVar) {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a2 = com.bytedance.frameworks.baselib.network.http.e.d.a(z, map, i2, inputStream, iArr, sVar);
                com.bytedance.frameworks.baselib.network.http.e.d.b(inputStream);
                int i3 = iArr[0];
                byte[] bArr = new byte[i3];
                if (a2 != null && iArr[0] > 0) {
                    System.arraycopy(a2, 0, bArr, 0, iArr[0]);
                }
                if (i3 > 0 && !com.bytedance.common.utility.m.a(str) && Logger.debug()) {
                    try {
                        com.bytedance.frameworks.baselib.network.http.e.a aVar = new com.bytedance.frameworks.baselib.network.http.e.a(str);
                        if ("text".equalsIgnoreCase(aVar.getPrimaryType()) || "application/json".equalsIgnoreCase(aVar.getBaseType())) {
                            com.bytedance.common.utility.m.a(aVar.getParameter("charset"));
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.frameworks.baselib.network.http.e.d.b(inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r14 == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(okhttp3.Request r10, java.lang.String r11, long r12, com.bytedance.frameworks.baselib.network.http.a r14, java.lang.String r15, java.lang.Exception r16, okhttp3.Call r17, okhttp3.Response r18, com.bytedance.retrofit2.s r19, com.bytedance.frameworks.baselib.network.http.d.a.k r20) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.o.a(okhttp3.Request, java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, okhttp3.Call, okhttp3.Response, com.bytedance.retrofit2.s, com.bytedance.frameworks.baselib.network.http.d.a.k):void");
    }

    @Override // com.bytedance.retrofit2.client.a
    public final d a(com.bytedance.retrofit2.client.Request request) {
        try {
            com.bytedance.frameworks.baselib.network.http.f.b a2 = com.bytedance.frameworks.baselib.network.http.f.b.a();
            if (a2.f29356i && !a2.f29357j) {
                if (!TextUtils.isEmpty(request.getHost())) {
                    Iterator<String> it = a2.f29354g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (i.a(request.getHost(), it.next())) {
                            ArrayList arrayList = new ArrayList();
                            if (request.getHeaders() != null) {
                                arrayList.addAll(request.getHeaders());
                            }
                            if (!TextUtils.isEmpty(a2.f29349b)) {
                                arrayList.add(new b("x-tt-store-idc", a2.f29349b));
                            }
                            if (TextUtils.isEmpty(a2.f29348a)) {
                                arrayList.add(new b("x-tt-local-region", "unknown"));
                            } else if (com.bytedance.frameworks.baselib.network.http.f.b.a(a2.f29352e)) {
                                arrayList.add(new b("x-tt-store-region", a2.f29348a));
                                arrayList.add(new b("x-tt-store-region-src", a2.f29352e));
                            } else if (a2.f29352e.equals("local")) {
                                arrayList.add(new b("x-tt-local-region", a2.f29353f));
                            }
                            Request.a newBuilder = request.newBuilder();
                            a2.a(request, newBuilder, arrayList);
                            newBuilder.f42460c = arrayList;
                            com.bytedance.retrofit2.client.Request a3 = newBuilder.a();
                            if (a3 != null) {
                                request = a3;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.retrofit2.client.Request a4 = com.bytedance.frameworks.baselib.network.c.c.a().a(request);
        if (request.getMetrics() != null) {
            request.getMetrics().L = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (a4 != null) {
            request = a4;
        }
        return new a(request);
    }

    public static void a(int i2, String str) {
        f29276d = i2;
        f29277e = str;
        f29279g = null;
        f29278f = null;
    }

    static {
        Covode.recordClassIndex(17090);
    }

    public static void a(e eVar) {
        f29282j = eVar;
    }

    public static void a(ResponseBody responseBody) {
        if (responseBody != null) {
            com.bytedance.frameworks.baselib.network.http.e.d.b(responseBody);
        }
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static o a(Context context) {
        MethodCollector.i(4058);
        if (f29283k == null) {
            synchronized (o.class) {
                try {
                    if (f29283k == null) {
                        f29283k = new o(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4058);
                    throw th;
                }
            }
        }
        o oVar = f29283k;
        MethodCollector.o(4058);
        return oVar;
    }

    private static int b(Context context) {
        int i2;
        MethodCollector.i(4191);
        synchronized (f29284l) {
            try {
                if (f29285m == 0) {
                    try {
                        f29285m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                i2 = f29285m;
            } finally {
                MethodCollector.o(4191);
            }
        }
        return i2;
    }

    public static String a(Headers headers) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : headers.toMultimap().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null && value.size() > 0) {
                    for (String str : value) {
                        jSONObject.put(key, str);
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private o(Context context) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        f29280h = applicationContext;
        f29281i = new g();
        k.a();
        k.a(f29280h);
        com.bytedance.frameworks.baselib.network.http.d.a.a.e a2 = com.bytedance.frameworks.baselib.network.http.d.a.a.e.a();
        AnonymousClass1 r1 = new h() {
            /* class com.bytedance.frameworks.baselib.network.http.d.a.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17091);
            }

            @Override // com.bytedance.frameworks.baselib.network.http.d.a.a.h
            public final Context a() {
                return o.f29280h;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.d.a.a.h
            public final String[] b() {
                return o.f29278f;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.d.a.a.h
            public final String d() {
                return o.f29277e;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.d.a.a.h
            public final String[] e() {
                return o.f29279g;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.d.a.a.h
            public final String c() {
                return String.valueOf(o.f29276d);
            }
        };
        if (a2.f29143k) {
            return;
        }
        if (r1.a() == null || TextUtils.isEmpty(r1.d()) || r1.c() == null) {
            a2.f29142j = null;
            throw new IllegalArgumentException("you must set correct httpdns depend");
        }
        a2.f29142j = r1;
        if (TextUtils.isEmpty(a2.f29135c)) {
            a2.f29135c = r1.d();
        }
        a2.f29143k = true;
        com.bytedance.frameworks.baselib.network.http.d.a.a.e.b();
        f fVar = a2.f29141i;
        Context a3 = r1.a();
        if (a3 != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f.a(a3, fVar.f29236b, intentFilter);
        }
        if ((a3 instanceof Application) && (application = (Application) a3) != null) {
            fVar.f29235a.f29114b = fVar;
            application.registerActivityLifecycleCallbacks(fVar.f29235a);
        }
        if (a2.f29137e.size() <= 0) {
            if (a2.f29142j.b() != null && a2.f29142j.b().length > 0 && a2.f29142j.b().length <= 10) {
                a2.f29137e.addAll(Arrays.asList(a2.f29142j.b()));
            }
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.obj = a2;
            com.bytedance.frameworks.baselib.network.http.d.a.a.e.f29133m.sendMessage(obtain);
        }
        a2.a(a.EnumC0624a.PRELOAD_BATCH);
        Message obtain2 = Message.obtain();
        obtain2.what = 5;
        obtain2.obj = a2;
        com.bytedance.frameworks.baselib.network.http.d.a.a.e.f29133m.sendMessage(obtain2);
    }

    private static String a(Response response) {
        List<String> values;
        if (response == null) {
            return "";
        }
        try {
            Headers headers = response.headers();
            if (headers == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : headers.names()) {
                if (!com.bytedance.common.utility.m.a(str) && (values = headers.values(str)) != null && !values.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    for (String str2 : values) {
                        if (!com.bytedance.common.utility.m.a(str2)) {
                            if (i2 == 0) {
                                sb.append(str2);
                            } else {
                                sb.append("; ").append(str2);
                            }
                            i2++;
                        }
                    }
                    jSONObject.put(str, sb.toString());
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Response a(OkHttpClient okHttpClient, Call call) {
        if (okHttpClient == null || call == null) {
            return null;
        }
        return call.execute();
    }

    public static String a(Response response, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (response == null) {
            return null;
        }
        a(response.header("x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f28914b == null)) {
            aVar.f28914b.f28941b = response.code();
        }
        return response.header("X-TT-LOGID");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r5 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Request a(okhttp3.Request.Builder r6, java.util.List<com.bytedance.retrofit2.client.b> r7) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.d.a.o.a(okhttp3.Request$Builder, java.util.List):okhttp3.Request");
    }

    public static JSONObject a(okhttp3.Request request, com.bytedance.frameworks.baselib.network.http.a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (request == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsOkHttp3Client");
            jSONObject.put("hcv", "tt-ok/3.10.0.2");
            jSONObject.put("ua", request.header("User-Agent"));
            if (aVar.G) {
                jSONObject.put("turing_callback", aVar.H);
            }
            if (aVar.I) {
                jSONObject.put("turing_retry", "1");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
