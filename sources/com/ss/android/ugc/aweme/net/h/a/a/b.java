package com.ss.android.ugc.aweme.net.h.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class b extends d {
    static {
        Covode.recordClassIndex(72190);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.h.a.a.d
    public final boolean a() {
        a.b.f109011a.b("feed_network_to_ensure_main_interceptor", false);
        if (!com.ss.android.ugc.aweme.feed.r.b.f93856b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.h.a.a.d
    public final Response a(Interceptor.Chain chain) {
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.aweme.feed.r.b.a();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        a.b.f109011a.a("ensure_main_activity_interceptor_duration", currentTimeMillis2);
        if (currentTimeMillis2 >= 5000) {
            return com.ss.android.ugc.aweme.net.h.b.a(chain, "ensure_main_interceptor");
        }
        return super.a(chain);
    }
}
