package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.feed.r.b;
import com.ss.android.ugc.aweme.logger.a;

public class EnsureMainActivityCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72233);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final boolean a() {
        a.b.f109011a.b("feed_network_to_ensure_main_interceptor", false);
        boolean z = !b.f93856b;
        if (!z && cx.f89739d) {
            a.b.f109011a.a("feed_preload_ensuremain_interceptor", false);
            a.b.f109011a.b("feed_preload_ensuremain_interceptor", false);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final u a(a.AbstractC1036a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        b.a();
        a.b.f109011a.a("ensure_main_activity_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        a.b.f109011a.a("feed_preload_ensuremain_interceptor", false);
        a.b.f109011a.b("feed_preload_ensuremain_interceptor", false);
        return super.a(aVar);
    }
}
