package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

public final class g extends c<b<BaseResponse>, b> {
    static {
        Covode.recordClassIndex(80430);
    }

    public g() {
        a(new b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80431);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr.length < 2 || objArr.length > 5) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = (String) objArr[0];
                final int intValue = ((Integer) objArr[1]).intValue();
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.setting.serverpush.b.g.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(80432);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        if (objArr.length == 2) {
                            return PushSettingsApiManager.b(str, intValue);
                        }
                        if (objArr.length == 3 && (objArr[2] instanceof Integer)) {
                            return PushSettingsApiManager.a(str, intValue, ((Integer) objArr[2]).intValue());
                        }
                        if (objArr.length == 4) {
                            PushSettingsApiManager.b(str, intValue);
                            Object[] objArr2 = objArr;
                            return PushSettingsApiManager.b((String) objArr2[2], ((Integer) objArr2[3]).intValue());
                        } else if (objArr.length != 5) {
                            return PushSettingsApiManager.a(str, intValue, (String) objArr[2]);
                        } else {
                            PushSettingsApiManager.a(str, intValue, ((Integer) objArr[4]).intValue());
                            Object[] objArr3 = objArr;
                            return PushSettingsApiManager.b((String) objArr3[2], ((Integer) objArr3[3]).intValue());
                        }
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
