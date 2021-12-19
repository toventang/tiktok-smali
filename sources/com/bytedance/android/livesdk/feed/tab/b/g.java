package com.bytedance.android.livesdk.feed.tab.b;

import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.feed.s;
import com.bytedance.android.livesdk.feed.tab.a.a;
import com.bytedance.android.livesdk.feed.tab.a.d;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class g extends a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f17685c;

    static {
        Covode.recordClassIndex(9808);
    }

    public static g b() {
        MethodCollector.i(1702);
        if (f17685c == null) {
            synchronized (g.class) {
                try {
                    if (f17685c == null) {
                        f17685c = new g(new j(new a(), new d(), new s()), new k((FeedTabApi) e.a().a(FeedTabApi.class)));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1702);
                    throw th;
                }
            }
        }
        g gVar = f17685c;
        MethodCollector.o(1702);
        return gVar;
    }

    private g(h hVar, i iVar) {
        super(hVar, iVar);
    }
}
