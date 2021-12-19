package com.ss.android.ugc.aweme.net.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.g;
import com.bytedance.frameworks.baselib.network.http.d.a.l;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.h.a.a.a;
import com.ss.android.ugc.aweme.net.h.a.a.b;
import com.ss.android.ugc.aweme.net.h.a.a.c;
import com.ss.android.ugc.aweme.net.h.a.a.e;
import com.ss.android.ugc.aweme.net.h.a.a.f;
import com.ss.android.ugc.aweme.net.o;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements g.a {

    /* renamed from: a  reason: collision with root package name */
    static final g.a f112357a = new d();

    static {
        Covode.recordClassIndex(72199);
    }

    private d() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.g.a
    public final void a(OkHttpClient.Builder builder) {
        if (cx.a()) {
            builder.addInterceptor(new b()).addInterceptor(new a()).addInterceptor(new c());
        }
        builder.eventListener(new com.ss.android.ugc.aweme.net.h.d());
        List<Interceptor> interceptors = builder.interceptors();
        if (interceptors != null) {
            Iterator<Interceptor> it = interceptors.iterator();
            Interceptor interceptor = null;
            while (it.hasNext()) {
                Interceptor next = it.next();
                if (next != null && (next instanceof l)) {
                    it.remove();
                    interceptor = next;
                }
            }
            if (interceptor != null) {
                interceptors.add(new f(interceptor));
                interceptors.add(new e());
            }
        }
        builder.addInterceptor(new com.ss.android.ugc.aweme.net.h.a());
        a.b.f109011a.a("feed_ok_init_keystore", false);
        if (Keva.getRepo("network_keva").getBoolean("opaque_data_enabled", true)) {
            h.f.b.l.d(builder, "");
            KeyStore a2 = o.a(o.a());
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(a2);
            SSLContext instance2 = SSLContext.getInstance("TLS");
            h.f.b.l.b(instance, "");
            instance2.init(null, instance.getTrustManagers(), new SecureRandom());
            h.f.b.l.b(instance2, "");
            SSLSocketFactory socketFactory = instance2.getSocketFactory();
            TrustManager[] trustManagers = instance.getTrustManagers();
            h.f.b.l.b(trustManagers, "");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            builder.sslSocketFactory(socketFactory, (X509TrustManager) arrayList.get(0));
        }
        a.b.f109011a.b("feed_ok_init_keystore", false);
    }
}
