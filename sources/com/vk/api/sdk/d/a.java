package com.vk.api.sdk.d;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.f.a.c;
import com.vk.api.sdk.f.e;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import okhttp3.Interceptor;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public final class a implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f156271a = {new y(ab.a(a.class), "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;")};

    /* renamed from: b  reason: collision with root package name */
    public final boolean f156272b;

    /* renamed from: c  reason: collision with root package name */
    public final c f156273c;

    /* renamed from: d  reason: collision with root package name */
    private final com.vk.api.sdk.f.c f156274d = e.a(new b(this));

    private final HttpLoggingInterceptor a() {
        return (HttpLoggingInterceptor) e.a(this.f156274d, f156271a[0]);
    }

    /* renamed from: com.vk.api.sdk.d.a$a  reason: collision with other inner class name */
    public static final class C4123a {

        /* renamed from: a  reason: collision with root package name */
        static final androidx.c.a<c.a, HttpLoggingInterceptor.Level> f156275a;

        /* renamed from: b  reason: collision with root package name */
        public static final C4123a f156276b = new C4123a();

        private C4123a() {
        }

        static {
            Covode.recordClassIndex(103789);
            androidx.c.a<c.a, HttpLoggingInterceptor.Level> aVar = new androidx.c.a<>();
            f156275a = aVar;
            aVar.put(c.a.NONE, HttpLoggingInterceptor.Level.NONE);
            aVar.put(c.a.ERROR, HttpLoggingInterceptor.Level.NONE);
            aVar.put(c.a.WARNING, HttpLoggingInterceptor.Level.BASIC);
            aVar.put(c.a.DEBUG, HttpLoggingInterceptor.Level.HEADERS);
            aVar.put(c.a.VERBOSE, HttpLoggingInterceptor.Level.BODY);
        }
    }

    static final class b extends m implements h.f.a.a<HttpLoggingInterceptor> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(103790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HttpLoggingInterceptor invoke() {
            return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger(this) {
                /* class com.vk.api.sdk.d.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f156277a;

                static {
                    Covode.recordClassIndex(103791);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f156277a = r1;
                }

                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void log(String str) {
                    l.c(str, "");
                    if (this.f156277a.this$0.f156272b) {
                        new h.m.l("client_secret=[a-zA-Z0-9]+").replace(new h.m.l("key=[a-z0-9]+").replace(new h.m.l("access_token=[a-z0-9]+").replace(str, "access_token=<HIDE>"), "key=<HIDE>"), "client_secret=<HIDE>");
                    }
                    this.f156277a.this$0.f156273c.a(this.f156277a.this$0.f156273c.a().getValue());
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(103788);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        long j2;
        HttpLoggingInterceptor.Level level;
        l.c(chain, "");
        RequestBody body = chain.request().body();
        if (body != null) {
            j2 = body.contentLength();
        } else {
            j2 = 0;
        }
        HttpLoggingInterceptor a2 = a();
        if (j2 > 1024) {
            level = HttpLoggingInterceptor.Level.BASIC;
        } else {
            level = C4123a.f156275a.get(this.f156273c.a().getValue());
        }
        a2.setLevel(level);
        Response intercept = a().intercept(chain);
        l.a((Object) intercept, "");
        return intercept;
    }

    public a(boolean z, c cVar) {
        l.c(cVar, "");
        this.f156272b = z;
        this.f156273c = cVar;
    }
}
