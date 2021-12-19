package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.setting.api.RestrictApi;
import java.util.concurrent.Callable;

public final class l extends a<k> {
    static {
        Covode.recordClassIndex(80216);
    }

    public final void a(final String str) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.setting.model.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80217);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RestrictApi.a(str);
            }
        }, 0);
    }
}
