package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

public final class o extends b<PrivateUrlModel> {

    /* renamed from: a  reason: collision with root package name */
    public static final FeedStatsApi f94056a = ((FeedStatsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(FeedStatsApi.class));

    static {
        Covode.recordClassIndex(59787);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.feed.u.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59788);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                FeedStatsApi feedStatsApi = o.f94056a;
                Object[] objArr = objArr;
                return feedStatsApi.feedStats((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
            }
        }, 0);
        return true;
    }
}
