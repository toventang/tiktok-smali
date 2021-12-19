package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.concurrent.Callable;

final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final i f93939a;

    static {
        Covode.recordClassIndex(59752);
    }

    k(i iVar) {
        this.f93939a = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        i iVar = this.f93939a;
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = i.d();
        }
        if (!j.f107229h) {
            return null;
        }
        if (iVar.f93934a) {
            iVar.f93934a = false;
            return null;
        }
        FeedItemList fetchFeedList = FeedApiService.a().fetchFeedList(0, 0, 0, 6, null, null, 0, 0, "", null, null, 0, j.f93938a, null, false);
        if (fetchFeedList != null) {
            fetchFeedList.appendCache = e.a();
            d.f93914a.a(4).b(fetchFeedList);
        }
        return fetchFeedList;
    }
}
