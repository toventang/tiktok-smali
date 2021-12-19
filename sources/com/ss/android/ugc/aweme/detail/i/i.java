package com.ss.android.ugc.aweme.detail.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final class i extends b<Aweme> {
    static {
        Covode.recordClassIndex(49584);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        final String str;
        final int i2;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str2 = (String) objArr[0];
        final String str3 = "";
        if (objArr.length <= 1 || objArr[1] == null) {
            str = str3;
        } else {
            str = (String) objArr[1];
        }
        if (objArr.length <= 2 || objArr[2] == null) {
            i2 = 0;
        } else {
            i2 = ((Integer) objArr[2]).intValue();
        }
        if (objArr.length > 3 && objArr[3] != null) {
            str3 = (String) objArr[3];
        }
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.detail.i.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49585);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DetailApi.a(str2, str, i2, str3);
            }
        }, 0);
        return true;
    }
}
