package com.ss.android.ugc.aweme.compliance.business.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.compliance.business.d.b;
import com.ss.android.ugc.aweme.net.j.g;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.model.c;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.utils.gn;
import h.f.b.l;
import h.m.p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;
import k.f;
import k.q;
import k.s;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends com.ss.android.ugc.aweme.net.monitor.a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f76847a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f76848b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final Random f76849c = new Random();

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Long> f76850d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f76851e;

    /* renamed from: f  reason: collision with root package name */
    private final b f76852f;

    public static final class a {
        static {
            Covode.recordClassIndex(47503);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean a(MediaType mediaType) {
        String type = mediaType.type();
        return !TextUtils.equals(type, "application") && !TextUtils.equals(type, "text");
    }

    private static boolean a(RequestBody requestBody) {
        Field[] declaredFields = requestBody.getClass().getDeclaredFields();
        l.b(declaredFields, "");
        for (Field field : declaredFields) {
            l.b(field, "");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            if (field.get(requestBody) instanceof s) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0170, code lost:
        r2 = 5972;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d7, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d8, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01da, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01db, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d7 A[ExcHandler: IOException (e java.io.IOException), PHI: r8 
      PHI: (r8v11 long) = (r8v12 long), (r8v12 long), (r8v14 long), (r8v14 long) binds: [B:63:0x017f, B:64:?, B:52:0x016b, B:53:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:52:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01da A[ExcHandler: URISyntaxException (e java.net.URISyntaxException), PHI: r8 
      PHI: (r8v10 long) = (r8v12 long), (r8v12 long), (r8v14 long), (r8v14 long) binds: [B:63:0x017f, B:64:?, B:52:0x016b, B:53:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:52:0x016b] */
    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.u<?>> a(com.ss.android.ugc.aweme.net.model.e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.u<?>> r25) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.c.d.a(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    static {
        Covode.recordClassIndex(47502);
        Charset forName = Charset.forName("utf-8");
        l.b(forName, "");
        f76847a = forName;
    }

    private static boolean b() {
        g a2 = h.a();
        if (!a2.f112414a || !(!a2.f112426m.isEmpty())) {
            return false;
        }
        return true;
    }

    public d() {
        g a2 = h.a();
        this.f76850d = new LinkedBlockingQueue(a2.f112422i);
        this.f76852f = new b(a2.f112424k);
        this.f76851e = new ConcurrentHashMap(8);
    }

    private static boolean a(String str) {
        if (TextUtils.equals(str, "/service/2/app_log/") || TextUtils.equals(str, "/monitor/collect/batch/") || TextUtils.equals(str, "/monitor/collect/c/logcollect") || TextUtils.equals(str, "/monitor/collect/c/exception") || TextUtils.equals(str, "/monitor/collect/c/code_coverage")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> e(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        if (!h.a().f112414a) {
            return super.e(eVar);
        }
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (b()) {
            a(eVar, (e<HttpURLConnection, Integer>) null, new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502));
        }
        return super.e(eVar);
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, InputStream> g(e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        if (!h.a().f112414a) {
            return super.g(eVar);
        }
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (b()) {
            a(eVar, (e<HttpURLConnection, Integer>) null, new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502));
        }
        return super.g(eVar);
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.i
    public final e<HttpURLConnection, Integer> i(e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        l.d(eVar, "");
        if (!h.a().f112414a) {
            return super.i(eVar);
        }
        Q q = eVar.f112458a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (b()) {
            a((e<HttpURLConnection, InputStream>) null, eVar, new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502));
        }
        return super.i(eVar);
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.f
    public final e<com.ss.android.ugc.aweme.net.model.a, Boolean> a_(e<com.ss.android.ugc.aweme.net.model.a, Boolean> eVar) {
        e<com.ss.android.ugc.aweme.net.model.a, Boolean> eVar2;
        l.d(eVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        Q q = eVar.f112458a;
        if (q == null) {
            return super.a_(eVar);
        }
        long incrementAndGet = gn.f143021a.incrementAndGet();
        try {
            if (!a(incrementAndGet, h.a().f112419f)) {
                eVar2 = super.a_(eVar);
            } else {
                StringBuilder append = new StringBuilder().append(q.f112449a).append('/').append(q.f112450b).append('/');
                String str = q.f112451c;
                if (str == null) {
                    str = "";
                }
                String sb = append.append(str).toString();
                com.ss.android.ugc.aweme.compliance.api.model.e eVar3 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, sb, null, null, null, null, null, 502);
                String jSONObject = q.f112452d.toString();
                l.b(jSONObject, "");
                b bVar = this.f76852f;
                Charset charset = f76847a;
                if (jSONObject != null) {
                    byte[] bytes = jSONObject.getBytes(charset);
                    l.b(bytes, "");
                    long b2 = bVar.b((long) bytes.length);
                    if (b2 <= 0) {
                        eVar2 = super.a_(eVar);
                    } else {
                        this.f76852f.a(b2);
                        a(jSONObject, h.a().f112426m, eVar3);
                        if (eVar3.f76649a) {
                            if (h.a().f112415b && h.a().f112425l.contains(sb)) {
                                eVar.a(com.ss.android.ugc.aweme.net.model.d.INTERCEPT);
                            }
                            a(sb, "6", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        return super.a_(eVar);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return eVar2;
        } finally {
            this.f76850d.remove(Long.valueOf(incrementAndGet));
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.g
    public final e<com.ss.android.ugc.aweme.net.model.b, Boolean> b_(e<com.ss.android.ugc.aweme.net.model.b, Boolean> eVar) {
        e<com.ss.android.ugc.aweme.net.model.b, Boolean> eVar2;
        l.d(eVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        Q q = eVar.f112458a;
        if (q == null) {
            return super.b_(eVar);
        }
        long incrementAndGet = gn.f143021a.incrementAndGet();
        String optString = q.f112455c.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            optString = q.f112455c.optString(StringSet.type);
        }
        String str = q.f112453a + '/' + optString;
        try {
            if (!a(incrementAndGet, h.a().f112420g)) {
                eVar2 = super.b_(eVar);
            } else {
                com.ss.android.ugc.aweme.compliance.api.model.e eVar3 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502);
                c[] values = c.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        String jSONObject = q.f112455c.toString();
                        l.b(jSONObject, "");
                        b bVar = this.f76852f;
                        Charset charset = f76847a;
                        if (jSONObject != null) {
                            byte[] bytes = jSONObject.getBytes(charset);
                            l.b(bytes, "");
                            long b2 = bVar.b((long) bytes.length);
                            if (b2 <= 0) {
                                eVar2 = super.b_(eVar);
                            } else {
                                this.f76852f.a(b2);
                                a(jSONObject, h.a().f112426m, eVar3);
                                if (eVar3.f76649a) {
                                    if (h.a().f112415b && h.a().f112425l.contains(str)) {
                                        eVar.a(com.ss.android.ugc.aweme.net.model.d.INTERCEPT);
                                    }
                                    a(str, "7", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                                }
                                this.f76850d.remove(Long.valueOf(incrementAndGet));
                                return super.b_(eVar);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (l.a((Object) optString, (Object) values[i2].getLogType())) {
                        eVar2 = super.b_(eVar);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return eVar2;
        } finally {
            this.f76850d.remove(Long.valueOf(incrementAndGet));
        }
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.a, com.ss.android.ugc.aweme.net.monitor.k
    public final e<Request, Response> c(e<Request, Response> eVar) {
        String str;
        long j2;
        Throwable th;
        IOException e2;
        HttpUrl url;
        d dVar = this;
        MethodCollector.i(6121);
        l.d(eVar, "");
        if (!h.a().f112414a) {
            e<Request, Response> c2 = super.c(eVar);
            MethodCollector.o(6121);
            return c2;
        }
        Q q = eVar.f112458a;
        if (q == null || (url = q.url()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (b()) {
            com.ss.android.ugc.aweme.compliance.api.model.e eVar2 = new com.ss.android.ugc.aweme.compliance.api.model.e(false, str, null, null, null, null, null, 502);
            long uptimeMillis = SystemClock.uptimeMillis();
            long incrementAndGet = gn.f143021a.incrementAndGet();
            try {
                Q q2 = eVar.f112458a;
                if (q2 != null) {
                    HttpUrl url2 = q2.url();
                    String str2 = url2.scheme() + "://" + url2.host() + url2.encodedPath();
                    String encodedPath = url2.encodedPath();
                    l.b(encodedPath, "");
                    if (!a(encodedPath)) {
                        g a2 = h.a();
                        RequestBody body = q2.body();
                        if (body != null) {
                            l.b(body, "");
                            if (dVar.a(incrementAndGet, a2.f112417d)) {
                                MediaType contentType = body.contentType();
                                if (contentType != null) {
                                    l.b(contentType, "");
                                    if (!a(contentType)) {
                                        Charset charset = contentType.charset(f76847a);
                                        if (charset != null) {
                                            l.b(charset, "");
                                            if (!a(body)) {
                                                if (!l.a((Object) "x-www-form-urlencoded", (Object) contentType.subtype())) {
                                                    com.ss.android.ugc.aweme.compliance.business.d.a aVar = new com.ss.android.ugc.aweme.compliance.business.d.a(q.a(new ByteArrayOutputStream()), dVar.f76852f);
                                                    body.writeTo(aVar);
                                                    f fVar = aVar.f76911a;
                                                    l.b(fVar, "");
                                                    if (a(fVar)) {
                                                        dVar.a(aVar.f76911a.a(charset), h.a().f112426m, eVar2);
                                                    } else {
                                                        aVar.f76911a.v();
                                                    }
                                                } else if (body.contentLength() != -1) {
                                                    try {
                                                        if (!dVar.f76852f.c(body.contentLength())) {
                                                            f fVar2 = new f();
                                                            body.writeTo(fVar2);
                                                            dVar.f76852f.a(fVar2.f158864b);
                                                            if (a(fVar2)) {
                                                                dVar.a(fVar2.a(charset), h.a().f112426m, eVar2);
                                                            } else {
                                                                fVar2.v();
                                                            }
                                                        }
                                                    } catch (IOException e3) {
                                                        e2 = e3;
                                                        j2 = incrementAndGet;
                                                        try {
                                                            e2.printStackTrace();
                                                            eo.a(e2, "error occur.");
                                                            dVar.f76850d.remove(Long.valueOf(j2));
                                                            e<Request, Response> c3 = super.c(eVar);
                                                            MethodCollector.o(6121);
                                                            return c3;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            dVar.f76850d.remove(Long.valueOf(j2));
                                                            MethodCollector.o(6121);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        j2 = incrementAndGet;
                                                        dVar.f76850d.remove(Long.valueOf(j2));
                                                        MethodCollector.o(6121);
                                                        throw th;
                                                    }
                                                }
                                                if (eVar2.f76649a) {
                                                    try {
                                                        if (a2.f112415b && a2.f112425l.contains(str2)) {
                                                            eVar.a(com.ss.android.ugc.aweme.net.model.d.INTERCEPT);
                                                            eVar.f112459b = (R) new Response.Builder().code(1001).protocol(Protocol.HTTP_2).message("").request(eVar.f112458a).body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"status_code\": 1001}")).build();
                                                        }
                                                        j2 = incrementAndGet;
                                                    } catch (IOException e4) {
                                                        e2 = e4;
                                                        dVar = dVar;
                                                        j2 = incrementAndGet;
                                                        e2.printStackTrace();
                                                        eo.a(e2, "error occur.");
                                                        dVar.f76850d.remove(Long.valueOf(j2));
                                                        e<Request, Response> c32 = super.c(eVar);
                                                        MethodCollector.o(6121);
                                                        return c32;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        dVar = dVar;
                                                        j2 = incrementAndGet;
                                                        dVar.f76850d.remove(Long.valueOf(j2));
                                                        MethodCollector.o(6121);
                                                        throw th;
                                                    }
                                                    try {
                                                        a(url2.toString(), "4", eVar2, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                                                    } catch (IOException e5) {
                                                        e2 = e5;
                                                        dVar = dVar;
                                                        e2.printStackTrace();
                                                        eo.a(e2, "error occur.");
                                                        dVar.f76850d.remove(Long.valueOf(j2));
                                                        e<Request, Response> c322 = super.c(eVar);
                                                        MethodCollector.o(6121);
                                                        return c322;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        dVar = dVar;
                                                        dVar.f76850d.remove(Long.valueOf(j2));
                                                        MethodCollector.o(6121);
                                                        throw th;
                                                    }
                                                } else {
                                                    j2 = incrementAndGet;
                                                }
                                                eo.a("handleOkHttp id: " + j2 + ", api: " + str2 + ", cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms, method: " + q2.method() + ", type: " + contentType + ", size: " + body.contentLength() + "-byte");
                                                dVar = dVar;
                                                dVar.f76850d.remove(Long.valueOf(j2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                dVar.f76850d.remove(Long.valueOf(incrementAndGet));
            } catch (IOException e6) {
                e2 = e6;
                j2 = incrementAndGet;
                e2.printStackTrace();
                eo.a(e2, "error occur.");
                dVar.f76850d.remove(Long.valueOf(j2));
                e<Request, Response> c3222 = super.c(eVar);
                MethodCollector.o(6121);
                return c3222;
            } catch (Throwable th6) {
                th = th6;
                j2 = incrementAndGet;
                dVar.f76850d.remove(Long.valueOf(j2));
                MethodCollector.o(6121);
                throw th;
            }
        }
        e<Request, Response> c32222 = super.c(eVar);
        MethodCollector.o(6121);
        return c32222;
    }

    private static boolean a(f fVar) {
        long j2;
        try {
            f fVar2 = new f();
            if (fVar.f158864b < 64) {
                j2 = fVar.f158864b;
            } else {
                j2 = 64;
            }
            fVar.a(fVar2, 0, j2);
            int i2 = 0;
            while (!fVar2.e()) {
                int t = fVar2.t();
                if (!Character.isISOControl(t) || Character.isWhitespace(t)) {
                    i2++;
                    if (i2 >= 16) {
                        break;
                    }
                } else {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    private final boolean a(long j2, int i2) {
        if (((long) this.f76849c.nextInt(10001)) > ((long) i2)) {
            return false;
        }
        return this.f76850d.offer(Long.valueOf(j2));
    }

    private final void a(String str, Set<String> set, com.ss.android.ugc.aweme.compliance.api.model.e eVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        l.b(lowerCase, "");
        Iterator<String> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Objects.requireNonNull(next, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = next.toLowerCase();
            l.b(lowerCase2, "");
            if (a(lowerCase, lowerCase2, linkedHashSet2)) {
                linkedHashSet.add(next);
                break;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            eVar.f76649a = true;
            l.d(linkedHashSet2, "");
            eVar.f76655g = linkedHashSet2;
            l.d(linkedHashSet, "");
            eVar.f76657i = linkedHashSet;
        }
    }

    private final boolean a(String str, String str2, Set<String> set) {
        int a2;
        int length;
        if (p.a((CharSequence) str, (CharSequence) str2, false)) {
            int i2 = h.a().f112421h;
            int i3 = 0;
            do {
                a2 = p.a((CharSequence) str, str2, i3, false, 4);
                int i4 = a2 - i2;
                if (i4 < 0) {
                    i4 = 0;
                }
                if (str2.length() + a2 + i2 > str.length()) {
                    length = str.length();
                } else {
                    length = str2.length() + a2 + i2;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(i4, length);
                l.b(substring, "");
                String str3 = this.f76851e.get(str2);
                if (str3 == null || p.a((CharSequence) str3)) {
                    String str4 = h.a().f112423j;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "^(.*)([^a-z0-9]+)([^\\/])%s([^a-z0-9]+)(.*)$";
                    }
                    Map<String, String> map = this.f76851e;
                    String a3 = com.a.a(str4, Arrays.copyOf(new Object[]{str2}, 1));
                    l.b(a3, "");
                    map.put(str2, a3);
                }
                if (Pattern.compile(this.f76851e.get(str2)).matcher(substring).find()) {
                    set.add(substring);
                    return true;
                }
                i3 = str2.length() + a2;
            } while (a2 != -1);
        }
        return false;
    }

    private final void a(e<HttpURLConnection, InputStream> eVar, e<HttpURLConnection, Integer> eVar2, com.ss.android.ugc.aweme.compliance.api.model.e eVar3) {
        Q q;
        long incrementAndGet;
        boolean z;
        MethodCollector.i(5882);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (eVar != null) {
            q = eVar.f112458a;
        } else if (eVar2 != null) {
            q = eVar2.f112458a;
        } else {
            q = null;
        }
        if (q instanceof com.ss.android.ugc.aweme.net.l.b) {
            incrementAndGet = q.f112446d;
        } else if (q instanceof com.ss.android.ugc.aweme.net.l.a) {
            incrementAndGet = q.f112440d;
        } else {
            incrementAndGet = gn.f143021a.incrementAndGet();
        }
        if (q == null) {
            MethodCollector.o(5882);
            return;
        }
        URL url = q.getURL();
        StringBuilder sb = new StringBuilder();
        l.b(url, "");
        String sb2 = sb.append(url.getProtocol()).append("://").append(url.getHost()).append(url.getPath()).toString();
        String path = url.getPath();
        l.b(path, "");
        if (a(path)) {
            MethodCollector.o(5882);
        } else if (!q.getDoOutput()) {
            MethodCollector.o(5882);
        } else {
            try {
                if (q instanceof com.ss.android.ugc.aweme.net.l.b) {
                    z = q.a();
                } else {
                    if (q instanceof com.ss.android.ugc.aweme.net.l.a) {
                        z = q.a();
                    }
                    this.f76850d.remove(Long.valueOf(incrementAndGet));
                    MethodCollector.o(5882);
                }
                if (!z) {
                    if (!a(incrementAndGet, h.a().f112418e)) {
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.o(5882);
                        return;
                    }
                    String requestProperty = q.getRequestProperty("Content-Type");
                    MediaType parse = MediaType.parse(requestProperty);
                    if (parse == null) {
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.o(5882);
                        return;
                    }
                    l.b(parse, "");
                    if (a(parse)) {
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.o(5882);
                        return;
                    }
                    Charset charset = parse.charset(f76847a);
                    if (charset == null) {
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.o(5882);
                        return;
                    }
                    l.b(charset, "");
                    OutputStream outputStream = q.getOutputStream();
                    l.b(outputStream, "");
                    f a2 = q.a(q.a(outputStream)).a();
                    long b2 = this.f76852f.b(a2.f158864b);
                    if (b2 > 0) {
                        this.f76852f.a(b2);
                        if (a(a2)) {
                            a(a2.a(charset), h.a().f112426m, eVar3);
                        }
                        if (eVar3.f76649a) {
                            if (h.a().f112415b && h.a().f112425l.contains(sb2)) {
                                if (eVar != null) {
                                    eVar.a(com.ss.android.ugc.aweme.net.model.d.INTERCEPT);
                                    byte[] bytes = "{\"status_code\": 1001}".getBytes(h.m.d.f158808a);
                                    l.b(bytes, "");
                                    eVar.f112459b = (R) new ByteArrayInputStream(bytes);
                                } else if (eVar2 != null) {
                                    eVar2.a(com.ss.android.ugc.aweme.net.model.d.INTERCEPT);
                                    eVar2.f112459b = (R) 1001;
                                }
                                if (q instanceof com.ss.android.ugc.aweme.net.l.a) {
                                    Q q2 = q;
                                    q2.f112438b = 1001;
                                    q2.f112439c = "{\"status_code\": 1001}";
                                } else if (q instanceof com.ss.android.ugc.aweme.net.l.b) {
                                    Q q3 = q;
                                    q3.f112444b = 1001;
                                    q3.f112445c = "{\"status_code\": 1001}";
                                }
                            }
                            a(q.getURL().toString(), "3", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        eo.a("handleURLConnection id: " + incrementAndGet + ", url: " + sb2 + " cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms, method: " + q.getRequestMethod() + ", type: " + requestProperty);
                        this.f76850d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.o(5882);
                        return;
                    }
                    return;
                }
                this.f76850d.remove(Long.valueOf(incrementAndGet));
                MethodCollector.o(5882);
            } finally {
                this.f76850d.remove(Long.valueOf(incrementAndGet));
                MethodCollector.o(5882);
            }
        }
    }

    private static void a(String str, String str2, com.ss.android.ugc.aweme.compliance.api.model.e eVar, long j2, long j3) {
        JSONObject jSONObject = new JSONObject();
        String str3 = eVar.f76652d;
        if ((str3 != null && !p.a((CharSequence) str3)) || (str != null && !p.a((CharSequence) str))) {
            String str4 = eVar.f76652d;
            if (str4 != null) {
                str = str4;
            }
            eVar.f76652d = str;
            jSONObject.put("url", eVar.f76652d);
        }
        Set<String> set = eVar.f76655g;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = eVar.f76655g.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("payload_segment", jSONArray);
        }
        Set<String> set2 = eVar.f76657i;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it2 = eVar.f76657i.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("config_rules", jSONArray2);
        }
        jSONObject.put("net_type", str2);
        jSONObject.put("cost", j3);
        com.bytedance.apm.b.a(c.COMPLIANCE_PAYLOAD_MONITOR_LOG.getLogType(), jSONObject);
        eo.a("reportMonitor id: " + j2 + ", netType: " + str2 + ", data: " + jSONObject);
    }
}
