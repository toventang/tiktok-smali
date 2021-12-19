package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.internal.b.a;
import com.twitter.sdk.android.core.internal.g;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.internal.p;
import com.twitter.sdk.android.core.internal.scribe.v;
import com.twitter.sdk.android.core.j;
import com.twitter.sdk.android.core.k;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

public class t {

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<Long, z> f156112a = new ConcurrentHashMap<>(2);

    /* renamed from: b  reason: collision with root package name */
    private final Context f156113b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f156114c;

    /* renamed from: d  reason: collision with root package name */
    private final u f156115d;

    /* renamed from: e  reason: collision with root package name */
    private final v.a f156116e;

    /* renamed from: f  reason: collision with root package name */
    private final TwitterAuthConfig f156117f;

    /* renamed from: g  reason: collision with root package name */
    private final j<? extends i<TwitterAuthToken>> f156118g;

    /* renamed from: h  reason: collision with root package name */
    private final e f156119h;

    /* renamed from: i  reason: collision with root package name */
    private final l f156120i;

    static {
        Covode.recordClassIndex(103699);
    }

    public final boolean a(v vVar, long j2) {
        o bVar;
        try {
            if (!this.f156112a.containsKey(Long.valueOf(j2))) {
                ConcurrentHashMap<Long, z> concurrentHashMap = this.f156112a;
                Long valueOf = Long.valueOf(j2);
                Context context = this.f156113b;
                Context context2 = new a(this.f156113b).f155955a;
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = context2.getFilesDir();
                }
                File file = d.f107195c;
                if (file == null) {
                    k.c().b();
                    file = null;
                } else if (!file.exists() && !file.mkdirs()) {
                    k.c().c();
                    file = null;
                }
                x xVar = new x(this.f156113b, this.f156116e, new p(), new s(context, file, j2 + "_se.tap", j2 + "_se_to_send"), this.f156115d.f156127g);
                Context context3 = this.f156113b;
                if (this.f156115d.f156121a) {
                    g.a(this.f156113b, "Scribe enabled");
                    bVar = new d(this.f156113b, this.f156114c, xVar, this.f156115d, new ScribeFilesSender(this.f156113b, this.f156115d, j2, this.f156117f, this.f156118g, this.f156119h, this.f156114c, this.f156120i));
                } else {
                    g.a(this.f156113b, "Scribe disabled");
                    bVar = new b();
                }
                concurrentHashMap.putIfAbsent(valueOf, new z(context3, bVar, xVar, this.f156114c));
            }
            this.f156112a.get(Long.valueOf(j2)).a(vVar);
            return true;
        } catch (IOException unused) {
            g.b(this.f156113b, "Failed to scribe event");
            return false;
        }
    }

    public t(Context context, ScheduledExecutorService scheduledExecutorService, u uVar, v.a aVar, TwitterAuthConfig twitterAuthConfig, j<? extends i<TwitterAuthToken>> jVar, e eVar, l lVar) {
        this.f156113b = context;
        this.f156114c = scheduledExecutorService;
        this.f156115d = uVar;
        this.f156116e = aVar;
        this.f156117f = twitterAuthConfig;
        this.f156118g = jVar;
        this.f156119h = eVar;
        this.f156120i = lVar;
    }
}
