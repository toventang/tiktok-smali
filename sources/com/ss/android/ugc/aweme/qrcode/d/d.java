package com.ss.android.ugc.aweme.qrcode.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.qrcode.api.RiskApi;
import java.util.concurrent.Callable;

public final class d extends a<c> {
    static {
        Covode.recordClassIndex(77788);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.bw.a.a
    public final /* bridge */ /* synthetic */ void handleData(c cVar) {
        super.handleData(cVar);
        this.mData = cVar;
    }

    public final void a(final String str) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.qrcode.d.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77789);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RiskApi.a(str);
            }
        }, 0);
    }
}
