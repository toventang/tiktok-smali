package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.internal.a.d;
import com.twitter.sdk.android.core.internal.g;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l.b;
import l.b.c;
import l.b.k;
import l.b.o;
import l.b.s;
import l.m;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* access modifiers changed from: package-private */
public final class ScribeFilesSender implements q {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f156024a = {44};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f156025b = {91};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f156026c = {93};

    /* renamed from: d  reason: collision with root package name */
    private final Context f156027d;

    /* renamed from: e  reason: collision with root package name */
    private final u f156028e;

    /* renamed from: f  reason: collision with root package name */
    private final long f156029f;

    /* renamed from: g  reason: collision with root package name */
    private final TwitterAuthConfig f156030g;

    /* renamed from: h  reason: collision with root package name */
    private final j<? extends i<TwitterAuthToken>> f156031h;

    /* renamed from: i  reason: collision with root package name */
    private final e f156032i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReference<ScribeService> f156033j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private final ExecutorService f156034k;

    /* renamed from: l  reason: collision with root package name */
    private final l f156035l;

    /* access modifiers changed from: package-private */
    public interface ScribeService {
        static {
            Covode.recordClassIndex(103666);
        }

        @o(a = "/{version}/jot/{type}")
        @l.b.e
        @k(a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        b<ResponseBody> upload(@s(a = "version") String str, @s(a = "type") String str2, @c(a = "log[]") String str3);

        @o(a = "/scribe/{sequence}")
        @l.b.e
        @k(a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        b<ResponseBody> uploadSequence(@s(a = "sequence") String str, @c(a = "log[]") String str2);
    }

    static {
        Covode.recordClassIndex(103665);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.util.concurrent.atomic.AtomicReference<com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender$ScribeService> */
    /* JADX WARN: Multi-variable type inference failed */
    private synchronized ScribeService a() {
        ScribeService scribeService;
        OkHttpClient build;
        MethodCollector.i(13440);
        if (this.f156033j.get() == null) {
            i a2 = this.f156031h.a(this.f156029f);
            if (a2 == null || a2.f155913a == null) {
                build = new OkHttpClient.Builder().certificatePinner(com.twitter.sdk.android.core.internal.a.e.a()).addInterceptor(new a(this.f156028e, this.f156035l)).addInterceptor(new com.twitter.sdk.android.core.internal.a.a(this.f156032i)).build();
            } else {
                build = new OkHttpClient.Builder().certificatePinner(com.twitter.sdk.android.core.internal.a.e.a()).addInterceptor(new a(this.f156028e, this.f156035l)).addInterceptor(new d(a2, this.f156030g)).build();
            }
            this.f156033j.compareAndSet(null, new m.a().a(this.f156028e.f156122b).a(build).a().a(ScribeService.class));
        }
        scribeService = this.f156033j.get();
        MethodCollector.o(13440);
        return scribeService;
    }

    /* access modifiers changed from: package-private */
    public static class a implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        private final u f156036a;

        /* renamed from: b  reason: collision with root package name */
        private final l f156037b;

        static {
            Covode.recordClassIndex(103667);
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Request.Builder newBuilder = chain.request().newBuilder();
            if (!TextUtils.isEmpty(this.f156036a.f156126f)) {
                newBuilder.header("User-Agent", this.f156036a.f156126f);
            }
            if (!TextUtils.isEmpty(this.f156037b.a())) {
                newBuilder.header("X-Client-UUID", this.f156037b.a());
            }
            newBuilder.header("X-Twitter-Polling", "true");
            return chain.proceed(newBuilder.build());
        }

        a(u uVar, l lVar) {
            this.f156036a = uVar;
            this.f156037b = lVar;
        }
    }

    private static String b(List<File> list) {
        Throwable th;
        MethodCollector.i(13438);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(f156025b);
        for (File file : list) {
            r rVar = null;
            try {
                r rVar2 = new r(file);
                try {
                    rVar2.a(new y(zArr, byteArrayOutputStream));
                    g.a(rVar2);
                } catch (Throwable th2) {
                    th = th2;
                    rVar = rVar2;
                    g.a(rVar);
                    MethodCollector.o(13438);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                g.a(rVar);
                MethodCollector.o(13438);
                throw th;
            }
        }
        byteArrayOutputStream.write(f156026c);
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        MethodCollector.o(13438);
        return byteArrayOutputStream2;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.q
    public final boolean a(List<File> list) {
        l.l<ResponseBody> a2;
        if (a() != null) {
            try {
                String b2 = b(list);
                g.a(this.f156027d, b2);
                ScribeService a3 = a();
                if (!TextUtils.isEmpty(this.f156028e.f156125e)) {
                    a2 = a3.uploadSequence(this.f156028e.f156125e, b2).a();
                } else {
                    a2 = a3.upload(this.f156028e.f156123c, this.f156028e.f156124d, b2).a();
                }
                if (a2.f159305a.code() == 200) {
                    return true;
                }
                g.b(this.f156027d, "Failed sending files");
                if (a2.f159305a.code() == 500 || a2.f159305a.code() == 400) {
                    return true;
                }
            } catch (Exception unused) {
                g.b(this.f156027d, "Failed sending files");
            }
        } else {
            g.a(this.f156027d, "Cannot attempt upload at this time");
        }
        return false;
    }

    ScribeFilesSender(Context context, u uVar, long j2, TwitterAuthConfig twitterAuthConfig, j<? extends i<TwitterAuthToken>> jVar, e eVar, ExecutorService executorService, l lVar) {
        this.f156027d = context;
        this.f156028e = uVar;
        this.f156029f = j2;
        this.f156030g = twitterAuthConfig;
        this.f156031h = jVar;
        this.f156032i = eVar;
        this.f156034k = executorService;
        this.f156035l = lVar;
    }
}
