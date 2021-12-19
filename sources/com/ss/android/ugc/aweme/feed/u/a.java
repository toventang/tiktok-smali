package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;

public final class a extends b {
    static {
        Covode.recordClassIndex(59763);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof c)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.mHandler.postDelayed(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.u.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59764);
            }

            public final void run() {
                n.a().a(a.this.mHandler, new b(objArr), 0);
            }
        }, 500);
        return true;
    }
}
