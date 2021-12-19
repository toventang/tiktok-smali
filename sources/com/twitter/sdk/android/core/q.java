package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.d;
import com.twitter.sdk.android.core.internal.b.c;
import com.twitter.sdk.android.core.internal.m;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.r;
import com.twitter.sdk.android.core.u;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public class q {

    /* renamed from: a  reason: collision with root package name */
    static volatile q f156175a;

    /* renamed from: b  reason: collision with root package name */
    public j<u> f156176b;

    /* renamed from: c  reason: collision with root package name */
    j<d> f156177c;

    /* renamed from: d  reason: collision with root package name */
    m<u> f156178d;

    /* renamed from: e  reason: collision with root package name */
    public final TwitterAuthConfig f156179e;

    /* renamed from: f  reason: collision with root package name */
    final Context f156180f;

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentHashMap<i, l> f156181g;

    /* renamed from: h  reason: collision with root package name */
    private volatile l f156182h;

    /* renamed from: i  reason: collision with root package name */
    private volatile e f156183i;

    static {
        Covode.recordClassIndex(103725);
    }

    public final e b() {
        if (this.f156183i == null) {
            c();
        }
        return this.f156183i;
    }

    public static q a() {
        MethodCollector.i(13802);
        if (f156175a == null) {
            synchronized (q.class) {
                try {
                    if (f156175a == null) {
                        f156175a = new q(k.a().f156142f);
                        k.a().f156141e.execute(r.f156184a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13802);
                    throw th;
                }
            }
        }
        q qVar = f156175a;
        MethodCollector.o(13802);
        return qVar;
    }

    private synchronized void c() {
        MethodCollector.i(13804);
        if (this.f156183i == null) {
            this.f156183i = new e(new OAuth2Service(this, new com.twitter.sdk.android.core.internal.q()), this.f156177c);
        }
        MethodCollector.o(13804);
    }

    private q(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap());
    }

    private q(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<i, l> concurrentHashMap) {
        this.f156179e = twitterAuthConfig;
        this.f156181g = concurrentHashMap;
        this.f156182h = null;
        p pVar = new p(k.a().f156139c, "com.twitter.sdk.android:twitter-core", ".TwitterKit" + File.separator + "com.twitter.sdk.android:twitter-core");
        this.f156180f = pVar;
        this.f156176b = new g(new c(pVar, "session_store"), new u.a(), "active_twittersession", "twittersession");
        this.f156177c = new g(new c(pVar, "session_store"), new d.a(), "active_guestsession", "guestsession");
        this.f156178d = new m<>(this.f156176b, k.a().f156141e, new r());
    }
}
