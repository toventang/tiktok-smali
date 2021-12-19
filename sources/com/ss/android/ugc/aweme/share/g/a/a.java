package com.ss.android.ugc.aweme.share.g.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import java.util.concurrent.Callable;

public final class a extends b<String> {
    static {
        Covode.recordClassIndex(81081);
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
            /* class com.ss.android.ugc.aweme.share.g.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(81082);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ShareDependService a2 = ShareDependService.a.a();
                Object[] objArr = objArr;
                return a2.a((Aweme) objArr[0], ((Integer) objArr[1]).intValue());
            }
        }, 0);
        return true;
    }
}
