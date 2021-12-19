package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import java.util.concurrent.Callable;

public final class af extends b<String> {
    static {
        Covode.recordClassIndex(59770);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
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
            /* class com.ss.android.ugc.aweme.feed.u.af.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59771);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = (String) objArr[0];
                FeedActionApi.f91922a.deleteScheduleItem(str).get();
                return str;
            }
        }, 0);
        return true;
    }
}
