package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    final Context f156163a;

    /* renamed from: b  reason: collision with root package name */
    final f f156164b;

    /* renamed from: c  reason: collision with root package name */
    final TwitterAuthConfig f156165c;

    /* renamed from: d  reason: collision with root package name */
    final ExecutorService f156166d;

    /* renamed from: e  reason: collision with root package name */
    final Boolean f156167e;

    static {
        Covode.recordClassIndex(103722);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TwitterAuthConfig f156168a;

        /* renamed from: b  reason: collision with root package name */
        public Boolean f156169b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f156170c;

        /* renamed from: d  reason: collision with root package name */
        private f f156171d;

        /* renamed from: e  reason: collision with root package name */
        private ExecutorService f156172e;

        static {
            Covode.recordClassIndex(103723);
        }

        public final o a() {
            return new o(this.f156170c, this.f156171d, this.f156168a, this.f156172e, this.f156169b, (byte) 0);
        }

        public a(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                this.f156170c = applicationContext;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private o(Context context, f fVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool) {
        this.f156163a = context;
        this.f156164b = fVar;
        this.f156165c = twitterAuthConfig;
        this.f156166d = executorService;
        this.f156167e = bool;
    }

    /* synthetic */ o(Context context, f fVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool, byte b2) {
        this(context, fVar, twitterAuthConfig, executorService, bool);
    }
}
