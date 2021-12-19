package com.vk.api.sdk.d;

import android.content.Context;
import android.os.Looper;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.vk.api.sdk.f.a.c;
import com.vk.api.sdk.internal.e;
import com.vk.api.sdk.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f156278g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f156279a = 500;

    /* renamed from: b  reason: collision with root package name */
    public final Context f156280b;

    /* renamed from: c  reason: collision with root package name */
    public final String f156281c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f156282d;

    /* renamed from: e  reason: collision with root package name */
    public volatile String f156283e;

    /* renamed from: f  reason: collision with root package name */
    public final c f156284f;

    /* renamed from: h  reason: collision with root package name */
    private final Object f156285h;

    /* renamed from: i  reason: collision with root package name */
    private final h f156286i;

    /* renamed from: j  reason: collision with root package name */
    private final d<OkHttpClient> f156287j;

    static {
        Covode.recordClassIndex(103792);
    }

    private final j a() {
        return (j) this.f156286i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103793);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.vk.api.sdk.d.b$b  reason: collision with other inner class name */
    static final class C4124b extends m implements h.f.a.a<j> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(103794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4124b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            if (!l.a(Looper.getMainLooper(), Looper.myLooper())) {
                b bVar = this.this$0;
                bVar.f156284f.f156289a.f156233f.a(new c(bVar));
                return this.this$0.f156284f.f156289a.f156233f;
            }
            throw new IllegalStateException("UI thread");
        }
    }

    public static final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f156288a;

        static {
            Covode.recordClassIndex(103795);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f156288a = bVar;
        }

        @Override // com.vk.api.sdk.j.a
        public final OkHttpClient.Builder a(OkHttpClient.Builder builder) {
            l.c(builder, "");
            if (c.a.NONE != this.f156288a.f156284f.f156289a.f156236i.a().getValue()) {
                builder.addInterceptor(new a(this.f156288a.f156284f.f156289a.f156239l, this.f156288a.f156284f.f156289a.f156236i));
            }
            return builder;
        }
    }

    private final OkHttpClient b(long j2) {
        return this.f156287j.a(j2);
    }

    public b(c cVar) {
        l.c(cVar, "");
        this.f156284f = cVar;
        this.f156280b = cVar.f156289a.f156228a;
        this.f156285h = new Object();
        this.f156286i = i.a((h.f.a.a) new C4124b(this));
        this.f156281c = cVar.a();
        this.f156282d = cVar.b();
        this.f156283e = cVar.c();
        this.f156287j = new d<>();
    }

    private final OkHttpClient c(long j2) {
        OkHttpClient build = a().a().newBuilder().readTimeout(j2, TimeUnit.MILLISECONDS).connectTimeout(j2, TimeUnit.MILLISECONDS).build();
        d<OkHttpClient> dVar = this.f156287j;
        l.a((Object) build, "");
        com.vk.api.sdk.f.a.a(dVar, j2, build);
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        h.e.c.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(okhttp3.Response r4) {
        /*
            java.lang.String r2 = ""
            h.f.b.l.c(r4, r2)
            int r1 = r4.code()
            r0 = 413(0x19d, float:5.79E-43)
            if (r1 == r0) goto L_0x0042
            okhttp3.ResponseBody r2 = r4.body()
            r3 = 0
            if (r2 == 0) goto L_0x0027
            r0 = r2
            okhttp3.ResponseBody r0 = (okhttp3.ResponseBody) r0     // Catch:{ all -> 0x001c }
            java.lang.String r0 = r0.string()     // Catch:{ all -> 0x001c }
            goto L_0x0023
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            h.e.c.a(r2, r1)
            throw r0
        L_0x0023:
            h.e.c.a(r2, r3)
            r3 = r0
        L_0x0027:
            r2 = 599(0x257, float:8.4E-43)
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = r4.code()
            if (r1 <= r0) goto L_0x0032
        L_0x0031:
            return r3
        L_0x0032:
            if (r2 < r0) goto L_0x0031
            com.vk.api.sdk.c.d r1 = new com.vk.api.sdk.c.d
            int r0 = r4.code()
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = "null"
        L_0x003e:
            r1.<init>(r0, r3)
            throw r1
        L_0x0042:
            com.vk.api.sdk.c.e r1 = new com.vk.api.sdk.c.e
            java.lang.String r0 = r4.message()
            h.f.b.l.a(r0, r2)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.d.b.a(okhttp3.Response):java.lang.String");
    }

    public final OkHttpClient a(long j2) {
        boolean z;
        OkHttpClient b2;
        MethodCollector.i(872);
        synchronized (this.f156285h) {
            try {
                OkHttpClient a2 = a().a();
                long j3 = this.f156284f.f156289a.f156234g;
                OkHttpClient b3 = b(j3);
                if (b3 == null) {
                    b3 = c(j3);
                }
                if (a2.connectTimeoutMillis() != b3.connectTimeoutMillis() || a2.readTimeoutMillis() != b3.readTimeoutMillis() || a2.writeTimeoutMillis() != b3.writeTimeoutMillis() || a2.pingIntervalMillis() != b3.pingIntervalMillis() || !l.a(a2.proxy(), b3.proxy()) || !l.a(a2.proxySelector(), b3.proxySelector()) || !l.a(a2.cookieJar(), b3.cookieJar()) || !l.a(a2.cache(), b3.cache()) || !l.a(a2.dns(), b3.dns()) || !l.a(a2.socketFactory(), b3.socketFactory()) || !l.a(a2.sslSocketFactory(), b3.sslSocketFactory()) || !l.a(a2.sslSocketFactory(), b3.sslSocketFactory()) || !l.a(a2.hostnameVerifier(), b3.hostnameVerifier()) || !l.a(a2.certificatePinner(), b3.certificatePinner()) || !l.a(a2.authenticator(), b3.authenticator()) || !l.a(a2.proxyAuthenticator(), b3.proxyAuthenticator()) || !l.a(a2.connectionPool(), b3.connectionPool()) || a2.followSslRedirects() != b3.followSslRedirects() || a2.followRedirects() != b3.followRedirects() || a2.retryOnConnectionFailure() != b3.retryOnConnectionFailure() || !l.a(a2.dispatcher(), b3.dispatcher()) || !l.a(a2.protocols(), b3.protocols()) || !l.a(a2.connectionSpecs(), b3.connectionSpecs()) || !l.a(a2.interceptors(), b3.interceptors()) || !l.a(a2.networkInterceptors(), b3.networkInterceptors())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    this.f156287j.c();
                }
                long j4 = j2 + ((long) this.f156279a);
                b2 = b(j4);
                if (b2 == null) {
                    b2 = c(j4);
                }
            } finally {
                MethodCollector.o(872);
            }
        }
        return b2;
    }

    public final void a(String str, String str2) {
        l.c(str, "");
        e.a(str);
        this.f156282d = str;
        this.f156283e = str2;
    }
}
