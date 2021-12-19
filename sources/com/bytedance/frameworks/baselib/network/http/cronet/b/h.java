package com.bytedance.frameworks.baselib.network.http.cronet.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.e.d;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.s;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.logger.a;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UnknownFormatConversionException;
import org.json.JSONObject;

public class h implements c, ICronetClient.ICronetBootFailureChecker {

    /* renamed from: a  reason: collision with root package name */
    public static final String f29073a = h.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static Context f29074b;

    /* renamed from: c  reason: collision with root package name */
    public static ICronetClient f29075c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f29076d = false;

    /* renamed from: e  reason: collision with root package name */
    public static volatile int f29077e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static a f29078f;

    /* renamed from: g  reason: collision with root package name */
    public static b f29079g;

    /* renamed from: h  reason: collision with root package name */
    private static String f29080h = "";

    /* renamed from: i  reason: collision with root package name */
    private static volatile h f29081i = null;

    public interface a {
        static {
            Covode.recordClassIndex(17026);
        }

        boolean b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(17027);
        }

        boolean c();
    }

    private static boolean a(int i2) {
        return i2 >= 8192 && i2 <= 20971520;
    }

    public static void a(SharedPreferences sharedPreferences) {
        f29077e = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
    }

    protected static boolean a(com.bytedance.frameworks.baselib.network.http.a aVar) {
        return (aVar == null || aVar.f28914b == null || !aVar.f28914b.f28949j) ? false : true;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        b();
        ICronetClient iCronetClient = f29075c;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(this);
            f29075c.setCronetEngine(f29074b, false, z, false, z2, e.f29332d, new com.bytedance.frameworks.baselib.network.http.retrofit.a(), z3);
        }
    }

    public static void a() {
        if (f29075c == null) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        if (r3.f29054b == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        if (r3.f29054b.size() < 2) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        return new com.bytedance.frameworks.baselib.network.http.cronet.b.a(r10, r3.f29054b, r3.f29061i);
     */
    @Override // com.bytedance.retrofit2.client.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.d a(com.bytedance.retrofit2.client.Request r10) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(com.bytedance.retrofit2.client.Request):com.bytedance.retrofit2.client.d");
    }

    private static void a(String str, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (!m.a(str) && aVar != null) {
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

    protected static void a(HttpURLConnection httpURLConnection, com.bytedance.frameworks.baselib.network.http.a aVar, s sVar) {
        if (httpURLConnection != null && aVar != null) {
            try {
                if (f29075c != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f29075c.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        aVar.f28913a = (String) a(linkedHashMap.get("remote_ip"), String.class, "");
                        aVar.f28922j = ((Long) a(linkedHashMap.get("dns_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f28923k = ((Long) a(linkedHashMap.get("connect_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f28924l = ((Long) a(linkedHashMap.get("ssl_time"), Long.class, (Object) -1L)).longValue();
                        aVar.f28925m = ((Long) a(linkedHashMap.get("send_time"), Long.class, (Object) -1L)).longValue();
                        aVar.n = ((Long) a(linkedHashMap.get("push_time"), Long.class, (Object) -1L)).longValue();
                        aVar.o = ((Long) a(linkedHashMap.get("receive_time"), Long.class, (Object) -1L)).longValue();
                        aVar.p = ((Boolean) a(linkedHashMap.get("socket_reused"), Boolean.class, (Object) false)).booleanValue();
                        aVar.q = ((Long) a(linkedHashMap.get("ttfb"), Long.class, (Object) -1L)).longValue();
                        aVar.r = ((Long) a(linkedHashMap.get("total_time"), Long.class, (Object) -1L)).longValue();
                        aVar.s = ((Long) a(linkedHashMap.get("send_byte_count"), Long.class, (Object) -1L)).longValue();
                        aVar.t = ((Long) a(linkedHashMap.get("received_byte_count"), Long.class, (Object) -1L)).longValue();
                        aVar.y = (String) a(linkedHashMap.get("request_log"), String.class, "");
                        aVar.u = ((Long) a(linkedHashMap.get("retry_attempts"), Long.class, (Object) -1L)).longValue();
                        aVar.B = (String) a(linkedHashMap.get("request_headers"), String.class, "");
                        aVar.C = (String) a(linkedHashMap.get("response_headers"), String.class, "");
                        aVar.E = ((Long) a(linkedHashMap.get("post_task_start"), Long.class, (Object) -1L)).longValue();
                        aVar.D = ((Long) a(linkedHashMap.get("request_start"), Long.class, (Object) -1L)).longValue();
                        aVar.F = ((Long) a(linkedHashMap.get("wait_ctx"), Long.class, (Object) -1L)).longValue();
                    }
                }
                if (sVar != null) {
                    sVar.f42590a = aVar.w;
                    sVar.u = SystemClock.uptimeMillis();
                    sVar.f42600k = System.currentTimeMillis();
                    sVar.N = "4.0.71.7-tiktok";
                    sVar.M.put("sentByteCount", Long.valueOf(aVar.s));
                    sVar.M.put("receivedByteCount", Long.valueOf(aVar.t));
                    JSONObject jSONObject = aVar.z;
                    if (aVar.G) {
                        jSONObject.put("turing_callback", aVar.H);
                    }
                    if (aVar.I) {
                        jSONObject.put("turing_retry", "1");
                    }
                    jSONObject.put("retrofit", sVar.a());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static byte[] a(java.lang.String r28, int r29, java.net.HttpURLConnection r30, long r31, com.bytedance.frameworks.baselib.network.http.a r33, java.lang.String r34, int r35, com.bytedance.retrofit2.s r36) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, int, com.bytedance.retrofit2.s):byte[]");
    }

    /* JADX INFO: finally extract failed */
    protected static void a(boolean z, Map<String, List<String>> map, int i2, InputStream inputStream, String str, String str2, s sVar) {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a2 = d.a(z, map, i2, inputStream, iArr, sVar);
                d.b(inputStream);
                int i3 = iArr[0];
                byte[] bArr = new byte[i3];
                if (a2 != null && iArr[0] > 0) {
                    System.arraycopy(a2, 0, bArr, 0, iArr[0]);
                }
                if (i3 > 0 && !m.a(str) && Logger.debug()) {
                    try {
                        com.bytedance.frameworks.baselib.network.http.e.a aVar = new com.bytedance.frameworks.baselib.network.http.e.a(str);
                        if ("text".equalsIgnoreCase(aVar.getPrimaryType()) || "application/json".equalsIgnoreCase(aVar.getBaseType())) {
                            String parameter = aVar.getParameter("charset");
                            if (m.a(parameter)) {
                                parameter = "utf-8";
                            }
                            String str3 = f29073a;
                            StringBuilder append = new StringBuilder(" response body = ").append(new String(bArr, parameter)).append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            Logger.d(str3, append.append(str2).toString());
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                d.b(inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r13 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a(java.lang.String r10, long r11, com.bytedance.frameworks.baselib.network.http.a r13, java.lang.String r14, java.lang.Exception r15, java.net.HttpURLConnection r16, com.bytedance.retrofit2.s r17) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, java.net.HttpURLConnection, com.bytedance.retrofit2.s):void");
    }

    protected static void a(boolean z, String str) {
        if (!f29076d && !z && f29074b != null && !d()) {
            throw new com.bytedance.frameworks.baselib.network.http.b.d("network not available");
        } else if (f29076d && !TextUtils.isEmpty(str) && str.contains("net::ERR_INTERNET_DISCONNECTED")) {
            throw new com.bytedance.frameworks.baselib.network.http.b.d("network not available");
        }
    }

    static List<com.bytedance.retrofit2.client.b> a(HttpURLConnection httpURLConnection, boolean z) {
        if (httpURLConnection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key == null || !key.equalsIgnoreCase("bdturing-verify") || !z) {
                for (String str : entry.getValue()) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(key, str));
                }
            }
        }
        return arrayList;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker
    public boolean isCronetBootFailureExpected() {
        a aVar = f29078f;
        if (aVar == null) {
            return false;
        }
        return aVar.b();
    }

    static {
        Covode.recordClassIndex(17025);
    }

    private static boolean d() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean c2 = c();
        j.f107226e = c2;
        return c2;
    }

    private static void b() {
        String str;
        if (f29075c == null) {
            if (!m.a(f29080h)) {
                str = f29080h;
            } else {
                str = "org.chromium.CronetClient";
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f29075c = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected static void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        f29074b = applicationContext;
    }

    private static String a(Exception exc) {
        String[] split;
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (!(message == null || (split = message.split("\\|")) == null || split.length < 2)) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String b(String str) {
        try {
            if (!m.a(str)) {
                return new com.bytedance.frameworks.baselib.network.http.e.a(str).getBaseType();
            }
            return "";
        } catch (com.bytedance.frameworks.baselib.network.http.e.c e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static HttpURLConnection c(String str) {
        boolean c2;
        b();
        ICronetClient iCronetClient = f29075c;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(f29081i);
            ICronetClient iCronetClient2 = f29075c;
            Context context = f29074b;
            b bVar = f29079g;
            if (bVar == null) {
                c2 = false;
            } else {
                c2 = bVar.c();
            }
            HttpURLConnection openConnection = iCronetClient2.openConnection(context, str, c2, e.f29332d, new com.bytedance.frameworks.baselib.network.http.retrofit.a());
            openConnection.setConnectTimeout(15000);
            openConnection.setReadTimeout(15000);
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    public static h a(Context context) {
        MethodCollector.i(256);
        if (f29081i == null) {
            synchronized (h.class) {
                try {
                    if (f29081i == null) {
                        f29081i = new h(context);
                        b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(256);
                    throw th;
                }
            }
        }
        h hVar = f29081i;
        MethodCollector.o(256);
        return hVar;
    }

    private static JSONObject c(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            ICronetClient iCronetClient = f29075c;
            if (iCronetClient != null) {
                jSONObject.put("hcv", iCronetClient.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static k a(String str) {
        ICronetClient iCronetClient = f29075c;
        if (iCronetClient != null) {
            String[] strArr = (String[]) Reflect.on(iCronetClient).call("ttUrlDispatch", new Class[]{String.class}, str).get();
            if (strArr.length != 3 || TextUtils.isEmpty(strArr[0])) {
                throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
            }
            try {
                new URL(strArr[0]).toURI();
                return new k(str, strArr[0], strArr[1], strArr[2]);
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    private static String b(HttpURLConnection httpURLConnection) {
        List<String> value;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            if (!m.a(key) && (value = entry.getValue()) != null && !value.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                int i2 = 0;
                                for (String str : value) {
                                    if (!m.a(str)) {
                                        if (i2 == 0) {
                                            sb.append(str);
                                        } else {
                                            sb.append("; ").append(str);
                                        }
                                        i2++;
                                    }
                                }
                                jSONObject.put(key, sb.toString());
                            }
                        }
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    protected static int a(Request request, HttpURLConnection httpURLConnection) {
        if (request == null || httpURLConnection == null) {
            return -1;
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            body.writeTo(httpURLConnection.getOutputStream());
        }
        if (e.f29340l && !e.a(request.getExtraInfo())) {
            e.b();
        }
        return httpURLConnection.getResponseCode();
    }

    protected static String a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, Class<T> cls, T t) {
        if (obj == 0 || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    static boolean b(HttpURLConnection httpURLConnection, com.bytedance.frameworks.baselib.network.http.a aVar, int i2) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || !headerFields.containsKey("bdturing-verify")) {
            return false;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(headerFields);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean a2 = e.a(i2, treeMap);
        aVar.H = SystemClock.uptimeMillis() - uptimeMillis;
        if (!treeMap.containsKey("bdturing-verify")) {
            aVar.G = true;
        }
        return a2;
    }

    protected static String a(HttpURLConnection httpURLConnection, com.bytedance.frameworks.baselib.network.http.a aVar, int i2) {
        if (httpURLConnection == null) {
            return null;
        }
        a(a(httpURLConnection, "x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f28914b == null)) {
            aVar.f28914b.f28941b = i2;
        }
        return a(httpURLConnection, "X-TT-LOGID");
    }

    protected static HttpURLConnection a(String str, Request request, com.bytedance.frameworks.baselib.network.http.a aVar, long j2) {
        long j3 = j2;
        String url = request.getUrl();
        boolean z = false;
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !com.ss.android.ugc.aweme.lancet.b.b.f107185a.getAndSet(true)) {
            a.b.f109011a.a("feed_cookie_before_feed_duration", false);
        }
        try {
            if (!e.f29340l && !e.a(request.getExtraInfo())) {
                e.b();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(url) && url.contains("aweme/v2/feed") && !com.ss.android.ugc.aweme.lancet.b.b.f107186b.getAndSet(true)) {
            a.b.f109011a.b("feed_cookie_before_feed_duration", false);
        }
        HttpURLConnection c2 = c(str);
        if (a(f29077e)) {
            try {
                Reflect.on(c2).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(f29077e));
            } catch (Throwable unused2) {
            }
        }
        c2.setInstanceFollowRedirects(true);
        if (aVar.f28914b instanceof com.bytedance.frameworks.baselib.network.http.b) {
            T t = aVar.f28914b;
            if (t.f28942c > 0) {
                c2.setConnectTimeout((int) t.f28942c);
            }
            if (t.f28943d > 0) {
                c2.setReadTimeout((int) t.f28943d);
            }
            if (t.f28948i > 0) {
                try {
                    Reflect.on(c2).call("setRequestTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f28948i));
                    c2.setConnectTimeout(0);
                    c2.setReadTimeout(0);
                    if (t.f28945f > 0 || t.f28947h > 0 || t.f28946g > 0) {
                        Reflect.on(c2).call("setSocketConnectTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f28945f));
                        Reflect.on(c2).call("setSocketReadTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f28947h));
                        Reflect.on(c2).call("setSocketWriteTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.f28946g));
                    }
                } catch (Throwable unused3) {
                }
            }
            if (!a(f29077e) && a(t.f28951l)) {
                try {
                    Reflect.on(c2).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(t.f28951l));
                } catch (Throwable unused4) {
                }
            }
            if (t.f28952m > 0) {
                try {
                    Reflect.on(c2).call("setRequestFlag", new Class[]{Integer.TYPE}, Integer.valueOf(t.f28952m));
                } catch (Throwable unused5) {
                }
            }
            if (t.n > 0 && j3 == 0) {
                j3 = t.n;
            }
            if (!t.o) {
                c2.setInstanceFollowRedirects(false);
            }
        }
        try {
            Reflect.on(c2).call("setRequestPriority", new Class[]{Integer.TYPE}, Integer.valueOf(request.getRequestPriorityLevel()));
        } catch (Throwable unused6) {
        }
        if (j3 > 0) {
            try {
                Reflect.on(c2).call("setThrottleNetSpeed", new Class[]{Integer.TYPE}, Long.valueOf(j3));
            } catch (Throwable unused7) {
            }
        }
        c2.setRequestMethod(request.getMethod());
        c2.setDoInput(true);
        for (com.bytedance.retrofit2.client.b bVar : request.getHeaders()) {
            if (!m.a(bVar.f42471a) && !m.a(bVar.f42472b)) {
                if ("User-Agent".equalsIgnoreCase(bVar.f42471a)) {
                    z = true;
                }
                c2.setRequestProperty(bVar.f42471a, bVar.f42472b);
            }
        }
        if (!z) {
            String str2 = e.f29332d;
            if (!m.a(str2)) {
                if (f29075c != null) {
                    str2 = str2 + " cronet/" + f29075c.getCronetVersion();
                }
                c2.setRequestProperty("User-Agent", str2);
            }
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            c2.setDoOutput(true);
            c2.setRequestProperty("Content-Type", body.mimeType());
            String md5Stub = body.md5Stub();
            if (md5Stub != null) {
                c2.setRequestProperty("X-SS-STUB", md5Stub);
            }
            long length = body.length();
            if (length != -1) {
                c2.setFixedLengthStreamingMode((int) length);
                c2.setRequestProperty("Content-Length", String.valueOf(length));
            } else {
                c2.setChunkedStreamingMode(4096);
            }
        }
        aVar.z = c(c2);
        return c2;
    }
}
