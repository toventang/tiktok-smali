package com.bytedance.frameworks.baselib.network.http.cronet.b;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.frameworks.baselib.network.http.b;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.l;
import com.bytedance.retrofit2.m;
import com.bytedance.retrofit2.s;
import java.io.IOException;
import java.net.HttpURLConnection;

/* access modifiers changed from: package-private */
public class d implements com.bytedance.retrofit2.client.d, l, m {

    /* renamed from: k  reason: collision with root package name */
    private static boolean f29031k;

    /* renamed from: l  reason: collision with root package name */
    private static final String f29032l = d.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private static ICronetClient f29033m;

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f29034a;

    /* renamed from: b  reason: collision with root package name */
    a f29035b = a.a();

    /* renamed from: c  reason: collision with root package name */
    long f29036c;

    /* renamed from: d  reason: collision with root package name */
    String f29037d = null;

    /* renamed from: e  reason: collision with root package name */
    Request f29038e;

    /* renamed from: f  reason: collision with root package name */
    boolean f29039f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f29040g = false;

    /* renamed from: h  reason: collision with root package name */
    s f29041h;

    /* renamed from: i  reason: collision with root package name */
    private volatile long f29042i = 0;

    /* renamed from: j  reason: collision with root package name */
    private String f29043j;

    @Override // com.bytedance.retrofit2.m
    public Object getRequestInfo() {
        return this.f29035b;
    }

    static {
        Covode.recordClassIndex(17019);
    }

    @Override // com.bytedance.retrofit2.l
    public void doCollect() {
        h.a(this.f29034a, this.f29035b, this.f29041h);
    }

    private int c() {
        HttpURLConnection httpURLConnection = this.f29034a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        String url = this.f29038e.getUrl();
        try {
            this.f29034a = h.a(url, this.f29038e, this.f29035b, this.f29042i);
            this.f29035b.I = true;
            this.f29034a.addRequestProperty("x-tt-bdturing-retry", "1");
            return h.a(this.f29038e, this.f29034a);
        } catch (Exception e2) {
            h.a(url, this.f29036c, this.f29035b, this.f29037d, e2, this.f29034a, this.f29041h);
            this.f29039f = true;
            if (e2 instanceof IOException) {
                throw e2;
            }
            throw new IOException(e2.getMessage(), e2.getCause());
        }
    }

    @Override // com.bytedance.retrofit2.client.d
    public final void b() {
        HttpURLConnection httpURLConnection = this.f29034a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            if (this.f29038e.isResponseStreaming() && !this.f29039f) {
                doCollect();
                this.f29035b.K = h.b(this.f29043j);
                this.f29035b.f28920h = System.currentTimeMillis();
                if (this.f29035b.f28914b == null || this.f29035b.f28914b.p) {
                    long j2 = this.f29035b.f28920h;
                    long j3 = this.f29036c;
                    e.a(j2 - j3, j3, this.f29038e.getUrl(), this.f29037d, this.f29035b);
                }
                j.a().a(this.f29038e.getUrl(), this.f29035b.s, this.f29035b.t, this.f29035b.K, this.f29035b.y);
            }
            this.f29039f = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe A[Catch:{ Exception -> 0x0187, all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018f A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b8 A[Catch:{ all -> 0x01e1 }] */
    @Override // com.bytedance.retrofit2.client.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.c a() {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.b.d.a():com.bytedance.retrofit2.client.c");
    }

    @Override // com.bytedance.retrofit2.client.d
    public final boolean a(long j2) {
        this.f29042i = j2;
        HttpURLConnection httpURLConnection = this.f29034a;
        if (httpURLConnection != null) {
            try {
                Reflect.on(httpURLConnection).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j2));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public d(Request request, ICronetClient iCronetClient) {
        this.f29038e = request;
        f29033m = iCronetClient;
        String url = request.getUrl();
        this.f29034a = null;
        s metrics = request.getMetrics();
        this.f29041h = metrics;
        if (metrics != null) {
            this.f29035b.f28915c = metrics.f42596g;
            this.f29035b.f28916d = this.f29041h.f42597h;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f29036c = currentTimeMillis;
        this.f29035b.f28917e = currentTimeMillis;
        this.f29035b.v = 0;
        if (this.f29038e.isResponseStreaming()) {
            this.f29035b.A = true;
        } else {
            this.f29035b.A = false;
        }
        if (request.getExtraInfo() instanceof b) {
            this.f29035b.f28914b = (T) ((b) request.getExtraInfo());
            this.f29040g = this.f29035b.f28914b.f28950k;
        }
        try {
            this.f29034a = h.a(url, request, this.f29035b, this.f29042i);
        } catch (Exception e2) {
            h.a(url, this.f29036c, this.f29035b, this.f29037d, e2, this.f29034a, this.f29041h);
            this.f29039f = true;
            if (e2 instanceof IOException) {
                throw e2;
            }
            throw new IOException(e2.getMessage(), e2.getCause());
        }
    }
}
