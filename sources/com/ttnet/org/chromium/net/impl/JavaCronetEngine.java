package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.a;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.w;
import com.ttnet.org.chromium.net.x;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;

public final class JavaCronetEngine extends c {

    /* renamed from: b  reason: collision with root package name */
    private final String f155644b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f155645c;

    static {
        Covode.recordClassIndex(103474);
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.c
    public final w a(w.b bVar, Executor executor, int i2, List<String> list, int i3, int i4) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final x a(x.b bVar, Executor executor, List<String> list, int i2, String str, long j2, int i3, long j3, String str2, int i4, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final x a(x.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(t.a aVar) {
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int c() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int d() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int e() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.c
    public final URLConnection a(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
        if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
            R r = m2.f112459b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new a(r);
            }
            return aVar2;
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m2.f112462e;
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final p a(String str, ab.b bVar, Executor executor, int i2, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4, t.a aVar) {
        return new h(bVar, this.f155645c, executor, str, this.f155644b, z3, z4, i3, z5, i4);
    }
}
