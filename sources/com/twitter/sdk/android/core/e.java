package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final j<d> f155899a;

    /* renamed from: b  reason: collision with root package name */
    private final OAuth2Service f155900b;

    static {
        Covode.recordClassIndex(103589);
    }

    private void b() {
        k.c().b();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f155900b.a(new b<GuestAuthToken>() {
            /* class com.twitter.sdk.android.core.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103590);
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(s sVar) {
                e.this.f155899a.c();
                countDownLatch.countDown();
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(h<GuestAuthToken> hVar) {
                e.this.f155899a.a(new d(hVar.f155911a));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            this.f155899a.c();
        }
    }

    public final synchronized d a() {
        MethodCollector.i(13918);
        d a2 = this.f155899a.a();
        if (a2 == null || a2.f155913a == null || ((GuestAuthToken) a2.f155913a).a()) {
            b();
            d a3 = this.f155899a.a();
            MethodCollector.o(13918);
            return a3;
        }
        MethodCollector.o(13918);
        return a2;
    }

    public final synchronized d a(d dVar) {
        d a2;
        MethodCollector.i(13970);
        d a3 = this.f155899a.a();
        if (dVar != null && dVar.equals(a3)) {
            b();
        }
        a2 = this.f155899a.a();
        MethodCollector.o(13970);
        return a2;
    }

    public e(OAuth2Service oAuth2Service, j<d> jVar) {
        this.f155900b = oAuth2Service;
        this.f155899a = jVar;
    }
}
