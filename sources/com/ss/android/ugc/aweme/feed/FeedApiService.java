package com.ss.android.ugc.aweme.feed;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.cache.j;
import com.ss.android.ugc.aweme.feed.experiment.f;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.p.a;
import com.ss.android.ugc.aweme.feed.p.a.c;
import com.ss.android.ugc.aweme.feed.p.a.d;
import com.ss.android.ugc.aweme.feed.p.b.e;
import com.ss.android.ugc.b;
import h.f.b.l;

public class FeedApiService implements IFeedApi {
    static {
        Covode.recordClassIndex(57540);
    }

    public static IFeedApi a() {
        Object a2 = b.a(IFeedApi.class, false);
        if (a2 != null) {
            return (IFeedApi) a2;
        }
        return new FeedApiService();
    }

    static final /* synthetic */ FeedItemList a(int i2, long j2, long j3, int i3, Integer num, String str, int i4, int i5, String str2, String str3, String str4, j jVar, Boolean bool) {
        try {
            return FeedApi.a(i2, j2, j3, i3, num, str, i4, i5, str2, str3, str4, jVar, bool);
        } catch (Throwable th) {
            throw new d(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.cache.IFeedApi
    public FeedItemList fetchFeedList(int i2, long j2, long j3, int i3, Integer num, String str, int i4, int i5, String str2, String str3, String str4, long j4, j jVar, Bundle bundle, Boolean bool) {
        e eVar;
        boolean z = f.f93059a;
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = com.ss.android.ugc.aweme.feed.p.b.b();
        }
        if ((z & com.ss.android.ugc.aweme.lancet.j.f107229h) && com.ss.android.ugc.aweme.feed.p.b.a(i2, i4)) {
            eVar = new e(a.a());
            l.d(eVar, "");
            if (f.f93059a) {
                a.a().a(eVar);
            }
        } else {
            eVar = null;
        }
        return (FeedItemList) c.a(eVar, new u(i2, j2, j3, i3, num, str, i4, i5, str2, str3, str4, j4, jVar, bundle, bool));
    }
}
