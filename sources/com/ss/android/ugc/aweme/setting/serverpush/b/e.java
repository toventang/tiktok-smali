package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

public final class e extends c<b<BaseResponse>, b> {
    static {
        Covode.recordClassIndex(80424);
    }

    public e() {
        a(new b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80425);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final int intValue = ((Integer) objArr[0]).intValue();
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.setting.serverpush.b.e.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(80426);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return PushSettingsApiManager.b(intValue);
                    }
                }, 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76396h != null && this.f76396h.mData != null && this.f76397i != null) {
            ((b) this.f76397i).av_();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((b) this.f76397i).cf_();
        }
    }
}
