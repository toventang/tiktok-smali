package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.twitter.sdk.android.core.internal.q;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.models.c;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import l.a.a.a;
import l.m;
import okhttp3.OkHttpClient;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Class, Object> f156146a;

    /* renamed from: b  reason: collision with root package name */
    public final m f156147b;

    static {
        Covode.recordClassIndex(103709);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l() {
        /*
            r3 = this;
            com.twitter.sdk.android.core.q r0 = com.twitter.sdk.android.core.q.a()
            com.twitter.sdk.android.core.e r2 = r0.b()
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            okhttp3.CertificatePinner r0 = com.twitter.sdk.android.core.internal.a.e.a()
            okhttp3.OkHttpClient$Builder r1 = r1.certificatePinner(r0)
            com.twitter.sdk.android.core.internal.a.c r0 = new com.twitter.sdk.android.core.internal.a.c
            r0.<init>(r2)
            okhttp3.OkHttpClient$Builder r1 = r1.authenticator(r0)
            com.twitter.sdk.android.core.internal.a.a r0 = new com.twitter.sdk.android.core.internal.a.a
            r0.<init>(r2)
            okhttp3.OkHttpClient$Builder r1 = r1.addInterceptor(r0)
            com.twitter.sdk.android.core.internal.a.b r0 = new com.twitter.sdk.android.core.internal.a.b
            r0.<init>()
            okhttp3.OkHttpClient$Builder r0 = r1.addNetworkInterceptor(r0)
            okhttp3.OkHttpClient r1 = r0.build()
            com.twitter.sdk.android.core.internal.q r0 = new com.twitter.sdk.android.core.internal.q
            r0.<init>()
            r3.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.l.<init>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(com.twitter.sdk.android.core.u r4) {
        /*
            r3 = this;
            com.twitter.sdk.android.core.q r0 = com.twitter.sdk.android.core.q.a()
            com.twitter.sdk.android.core.TwitterAuthConfig r2 = r0.f156179e
            if (r4 == 0) goto L_0x002b
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            okhttp3.CertificatePinner r0 = com.twitter.sdk.android.core.internal.a.e.a()
            okhttp3.OkHttpClient$Builder r1 = r1.certificatePinner(r0)
            com.twitter.sdk.android.core.internal.a.d r0 = new com.twitter.sdk.android.core.internal.a.d
            r0.<init>(r4, r2)
            okhttp3.OkHttpClient$Builder r0 = r1.addInterceptor(r0)
            okhttp3.OkHttpClient r1 = r0.build()
            com.twitter.sdk.android.core.internal.q r0 = new com.twitter.sdk.android.core.internal.q
            r0.<init>()
            r3.<init>(r1, r0)
            return
        L_0x002b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Session must not be null."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.l.<init>(com.twitter.sdk.android.core.u):void");
    }

    private l(OkHttpClient okHttpClient, q qVar) {
        this.f156146a = new ConcurrentHashMap<>();
        this.f156147b = new m.a().a(okHttpClient).a(qVar.f156021a).a(a.a(new g().a(new SafeListAdapter()).a(new SafeMapAdapter()).a((Type) c.class, (Object) new BindingValuesAdapter()).b())).a();
    }
}
