package com.vk.api.sdk;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public abstract class j {

    public interface a {
        static {
            Covode.recordClassIndex(103835);
        }

        OkHttpClient.Builder a(OkHttpClient.Builder builder);
    }

    static {
        Covode.recordClassIndex(103834);
    }

    public abstract OkHttpClient a();

    public abstract void a(a aVar);

    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        private volatile OkHttpClient f156351a;

        static {
            Covode.recordClassIndex(103836);
        }

        @Override // com.vk.api.sdk.j
        public final OkHttpClient a() {
            if (this.f156351a == null) {
                this.f156351a = new OkHttpClient().newBuilder().connectTimeout(20, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS).followRedirects(true).followSslRedirects(true).build();
            }
            OkHttpClient okHttpClient = this.f156351a;
            if (okHttpClient == null) {
                l.a();
            }
            return okHttpClient;
        }

        @Override // com.vk.api.sdk.j
        public final void a(a aVar) {
            l.c(aVar, "");
            OkHttpClient.Builder newBuilder = a().newBuilder();
            l.a((Object) newBuilder, "");
            this.f156351a = aVar.a(newBuilder).build();
        }
    }
}
