package com.bytedance.android.livesdk.feed.c;

import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.feed.feed.f;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.tab.b.b;
import com.bytedance.android.livesdk.feed.tab.b.c;
import com.bytedance.android.livesdk.feed.tab.b.g;
import com.bytedance.android.livesdk.feed.tab.b.k;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.t;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17325a;

    /* renamed from: b  reason: collision with root package name */
    private static a f17326b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(9614);
    }

    public static synchronized void a() {
        t<R> b2;
        synchronized (a.class) {
            MethodCollector.i(854);
            g b3 = g.b();
            if (b3.f17669b == null) {
                b3.f17669b = new k((FeedTabApi) e.a().a(FeedTabApi.class));
            }
            t<com.bytedance.android.live.network.response.a<ah, f>> a2 = b3.f17669b.a();
            if (!(a2 == null || (b2 = a2.d(new b(b3)).b(new c(b3))) == null)) {
                b2.a(b.f17328a, c.f17330a);
            }
            MethodCollector.o(854);
        }
    }
}
