package com.ss.android.ugc.aweme.share.k.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.setting.api.RestrictApi;
import com.ss.android.ugc.aweme.setting.model.f;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.bw.a.a<f> {
    static {
        Covode.recordClassIndex(81452);
    }

    public final void a(final String str) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.share.k.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(81453);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RestrictApi.b(str);
            }
        }, 0);
    }
}
