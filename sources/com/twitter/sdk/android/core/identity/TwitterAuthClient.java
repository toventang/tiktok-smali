package com.twitter.sdk.android.core.identity;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.h;
import com.twitter.sdk.android.core.j;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.s;
import com.twitter.sdk.android.core.u;

public class TwitterAuthClient {

    /* renamed from: a  reason: collision with root package name */
    final q f155918a;

    /* renamed from: b  reason: collision with root package name */
    public final b f155919b;

    /* renamed from: c  reason: collision with root package name */
    final j<u> f155920c;

    /* renamed from: d  reason: collision with root package name */
    final TwitterAuthConfig f155921d;

    static {
        Covode.recordClassIndex(103596);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f155922a = new b();

        static {
            Covode.recordClassIndex(103597);
        }
    }

    public TwitterAuthClient() {
        this(q.a(), q.a().f156179e, q.a().f156176b, a.f155922a);
    }

    static class b extends com.twitter.sdk.android.core.b<u> {

        /* renamed from: a  reason: collision with root package name */
        private final j<u> f155923a;

        /* renamed from: b  reason: collision with root package name */
        private final com.twitter.sdk.android.core.b<u> f155924b;

        static {
            Covode.recordClassIndex(103598);
        }

        @Override // com.twitter.sdk.android.core.b
        public final void a(s sVar) {
            k.c().a();
            this.f155924b.a(sVar);
        }

        @Override // com.twitter.sdk.android.core.b
        public final void a(h<u> hVar) {
            k.c().b();
            this.f155923a.a(hVar.f155911a);
            this.f155924b.a(hVar);
        }

        b(j<u> jVar, com.twitter.sdk.android.core.b<u> bVar) {
            this.f155923a = jVar;
            this.f155924b = bVar;
        }
    }

    private TwitterAuthClient(q qVar, TwitterAuthConfig twitterAuthConfig, j<u> jVar, b bVar) {
        this.f155918a = qVar;
        this.f155919b = bVar;
        this.f155921d = twitterAuthConfig;
        this.f155920c = jVar;
    }
}
