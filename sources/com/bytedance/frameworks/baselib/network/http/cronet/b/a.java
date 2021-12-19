package com.bytedance.frameworks.baselib.network.http.cronet.b;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.b.c;
import com.bytedance.frameworks.baselib.network.b.f;
import com.bytedance.frameworks.baselib.network.http.b;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.d;
import com.bytedance.retrofit2.l;
import com.bytedance.retrofit2.m;
import com.bytedance.retrofit2.s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class a implements WeakHandler.IHandler, d, l, m {
    private static boolean A = false;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f29013c = true;

    /* renamed from: d  reason: collision with root package name */
    private static final String f29014d = a.class.getSimpleName();
    private static HandlerThread u = new HandlerThread("Concurrent-Handler");
    private static Class y;

    /* renamed from: a  reason: collision with root package name */
    public s f29015a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.frameworks.baselib.network.http.a f29016b = com.bytedance.frameworks.baselib.network.http.a.a();

    /* renamed from: e  reason: collision with root package name */
    private volatile long f29017e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29018f;

    /* renamed from: g  reason: collision with root package name */
    private String f29019g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f29020h;

    /* renamed from: i  reason: collision with root package name */
    private Request f29021i;

    /* renamed from: j  reason: collision with root package name */
    private String f29022j;

    /* renamed from: k  reason: collision with root package name */
    private long f29023k;

    /* renamed from: l  reason: collision with root package name */
    private String f29024l;

    /* renamed from: m  reason: collision with root package name */
    private String f29025m;
    private List<String> n = new ArrayList();
    private final Object o = new Object();
    private volatile AtomicInteger p = new AtomicInteger(0);
    private List<HttpURLConnection> q = new CopyOnWriteArrayList();
    private volatile HttpURLConnection r = null;
    private List<C0623a> s = new CopyOnWriteArrayList();
    private CountDownLatch t = new CountDownLatch(1);
    private WeakHandler v = new WeakHandler(u.getLooper(), this);
    private long w;
    private long x;
    private String z;

    @Override // com.bytedance.retrofit2.m
    public Object getRequestInfo() {
        return this.f29016b;
    }

    @Override // com.bytedance.retrofit2.l
    public void doCollect() {
        h.a(this.r, this.f29016b, this.f29015a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.a$a  reason: collision with other inner class name */
    public static class C0623a {

        /* renamed from: a  reason: collision with root package name */
        String f29028a;

        /* renamed from: b  reason: collision with root package name */
        IOException f29029b;

        static {
            Covode.recordClassIndex(17016);
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("domain", this.f29028a);
                jSONObject.put("exception", this.f29029b.getMessage());
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        C0623a(String str, IOException iOException) {
            this.f29028a = str;
            this.f29029b = iOException;
        }
    }

    private void d() {
        f.b().b(new com.bytedance.frameworks.baselib.network.b.a("Concurrent-Call", c.a.IMMEDIATE, 0, new b(this), this.f29016b.A));
        b(this.w);
    }

    static {
        Covode.recordClassIndex(17014);
        try {
            y = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        u.start();
    }

    private void e() {
        MethodCollector.i(1997);
        this.v.removeCallbacksAndMessages(null);
        synchronized (this.o) {
            try {
                List<HttpURLConnection> list = this.q;
                if (list != null) {
                    for (HttpURLConnection httpURLConnection : list) {
                        if (httpURLConnection != null) {
                            this.s.add(new C0623a(httpURLConnection.getURL().getHost(), new IOException("Connection disconnected because of winner connection has decided.")));
                            httpURLConnection.disconnect();
                            this.q.remove(httpURLConnection);
                        }
                    }
                    this.q = null;
                    MethodCollector.o(1997);
                }
            } finally {
                MethodCollector.o(1997);
            }
        }
    }

    private int f() {
        if (this.r != null) {
            this.r.disconnect();
        }
        String url = this.f29021i.getUrl();
        try {
            this.r = h.a(url, this.f29021i, this.f29016b, this.f29017e);
            this.f29016b.I = true;
            this.r.addRequestProperty("x-tt-bdturing-retry", "1");
            return h.a(this.f29021i, this.r);
        } catch (Exception e2) {
            h.a(url, this.f29023k, this.f29016b, this.f29019g, e2, this.r, this.f29015a);
            this.f29020h = true;
            if (e2 instanceof IOException) {
                throw e2;
            }
            throw new IOException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // com.bytedance.retrofit2.client.d
    public final void b() {
        MethodCollector.i(2015);
        this.t.countDown();
        e();
        synchronized (this.o) {
            try {
                if (this.r != null) {
                    this.r.disconnect();
                    if (this.f29021i.isResponseStreaming() && !this.f29020h) {
                        doCollect();
                        this.f29016b.K = h.b(this.z);
                        this.f29016b.f28920h = System.currentTimeMillis();
                        if (this.f29016b.f28914b == null || this.f29016b.f28914b.p) {
                            long j2 = this.f29016b.f28920h;
                            long j3 = this.f29023k;
                            e.a(j2 - j3, j3, this.f29021i.getUrl(), this.f29019g, this.f29016b);
                        }
                        j.a().a(this.f29021i.getUrl(), this.f29016b.s, this.f29016b.t, this.f29016b.K, this.f29016b.y);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(2015);
                throw th;
            }
        }
        this.f29020h = true;
        MethodCollector.o(2015);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0198, code lost:
        r20.t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ae, code lost:
        if ((android.os.SystemClock.uptimeMillis() - r10) < (r20.w * 1000)) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b0, code lost:
        r1 = android.os.Message.obtain();
        r1.what = 1;
        r1.obj = r20;
        r20.v.sendMessage(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01be, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c4, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = com.bytedance.frameworks.baselib.network.http.cronet.b.h.a(r20.f29021i, r5);
        r8 = r5.getHeaderField("tt-api-source-5xx");
        r4 = r20.f29025m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r2 < 200) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r2 >= 300) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r8 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r2 < 300) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r2 >= 600) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.b.e.a().f29050b <= 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.b.e.a().a(r2, r4) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r8.equals("1") == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        r1 = r20.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        r4 = r5.getResponseMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r15 = r20.f29021i.getMaxLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r16 = r5.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r16 = r5.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r1 = new java.lang.StringBuilder("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        if (r4 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        r4 = r1.append(r4).append("  exception = ").append(r3.getMessage()).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        if (r20.r != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r20.r = r5;
        r20.f29022j = r9;
        r20.t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        r5.disconnect();
        r0 = r20.q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        r0.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0132, code lost:
        if (r5 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r20.q != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013b, code lost:
        r20.s.add(new com.bytedance.frameworks.baselib.network.http.cronet.b.a.C0623a(r5.getURL().getHost(), a(r4, r9, r5)));
        r20.q.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0162, code lost:
        if (r20.s.size() >= r20.n.size()) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        r20.t.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0 = com.bytedance.frameworks.baselib.network.http.cronet.b.a.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0196, code lost:
        if (com.bytedance.frameworks.baselib.network.http.cronet.b.e.a().a(((java.lang.Integer) com.bytedance.common.utility.reflect.Reflect.on(r4).call("getCronetInternalErrorCode").get()).intValue(), r20.f29025m) != false) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void c() {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.a.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x014e A[Catch:{ Exception -> 0x01cb, all -> 0x01c9, all -> 0x01d8 }] */
    @Override // com.bytedance.retrofit2.client.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.c a() {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.a.a():com.bytedance.retrofit2.client.c");
    }

    private void b(long j2) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this;
        this.v.sendMessageDelayed(obtain, j2 * 1000);
    }

    @Override // com.bytedance.retrofit2.client.d
    public final boolean a(long j2) {
        this.f29017e = j2;
        if (this.r != null) {
            try {
                Reflect.on(this.r).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j2));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && (message.obj instanceof a)) {
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    ((a) message.obj).d();
                } else if (i2 == 1) {
                    a aVar = (a) message.obj;
                    if (aVar.v.obtainMessage(0) != null) {
                        aVar.v.removeMessages(0);
                        aVar.d();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private IOException a(Exception exc, String str, HttpURLConnection httpURLConnection) {
        String str2 = str;
        if ((exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f29022j;
        }
        h.a(str2, this.f29023k, this.f29016b, this.f29019g, exc, httpURLConnection, this.f29015a);
        try {
            h.a(this.f29018f, exc.getMessage());
            return new c(exc, this.f29016b, this.f29019g);
        } catch (com.bytedance.frameworks.baselib.network.http.b.d e2) {
            return e2;
        }
    }

    public a(Request request, List<String> list, String str) {
        this.f29021i = request;
        this.f29015a = request.getMetrics();
        String url = request.getUrl();
        this.f29022j = url;
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        String str2 = scheme + "://" + parse.getHost();
        String query = parse.getQuery();
        Iterator<String> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String replaceFirst = this.f29022j.replaceFirst(str2, scheme + "://" + it.next());
            if (!TextUtils.isEmpty(query)) {
                replaceFirst = !query.contains("concurrent=") ? replaceFirst + "&concurrent=" + i2 : replaceFirst;
                if (i2 > 0 && !query.contains("is_retry=")) {
                    replaceFirst = replaceFirst + "&is_retry=1";
                }
            }
            i2++;
            this.n.add(replaceFirst);
        }
        if (f29013c || this.n.size() >= 2) {
            this.f29024l = UUID.randomUUID().toString();
            this.f29025m = str;
            this.w = (long) e.a().f29051c;
            this.x = 30000;
            if (request.getExtraInfo() instanceof b) {
                b bVar = (b) request.getExtraInfo();
                if (bVar.f28948i > 0) {
                    this.x = bVar.f28948i;
                } else if (bVar.f28942c > 0 && bVar.f28943d > 0) {
                    this.x = bVar.f28942c + bVar.f28943d;
                }
            }
            this.x += 1000;
            s sVar = this.f29015a;
            if (sVar != null) {
                sVar.f42593d = this.f29024l;
                this.f29015a.f42594e = true;
                this.f29016b.f28915c = this.f29015a.f42596g;
                this.f29016b.f28916d = this.f29015a.f42597h;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f29023k = currentTimeMillis;
            this.f29016b.f28917e = currentTimeMillis;
            this.f29016b.v = 0;
            if (this.f29021i.isResponseStreaming()) {
                this.f29016b.A = true;
            } else {
                this.f29016b.A = false;
            }
            if (request.getExtraInfo() instanceof b) {
                this.f29016b.f28914b = (T) ((b) request.getExtraInfo());
                this.f29018f = this.f29016b.f28914b.f28950k;
                return;
            }
            return;
        }
        throw new AssertionError();
    }
}
