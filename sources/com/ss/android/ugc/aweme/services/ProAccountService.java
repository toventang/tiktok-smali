package com.ss.android.ugc.aweme.services;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.l;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.base.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class ProAccountService extends BaseProAccountService implements au {
    static {
        Covode.recordClassIndex(79545);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService
    public void switchBusinessAccount(String str, final IAccountService.g gVar) {
        super.switchBusinessAccount(str, gVar);
        l.a(AccountApiInModule.f62857b.switchBusinessAccount(str), new k<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.services.ProAccountService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(79547);
            }

            @Override // com.google.c.h.a.k
            public void onFailure(Throwable th) {
                IAccountService.g gVar = gVar;
                if (gVar != null) {
                    gVar.onResult(14, 3, null);
                }
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (gVar != null) {
                    if (baseResponse == null || baseResponse.status_code != 0) {
                        gVar.onResult(14, 3, null);
                    } else {
                        gVar.onResult(14, 1, null);
                    }
                }
            }
        }, a.f62883a);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseProAccountService, com.ss.android.ugc.aweme.bs
    public void switchProAccount(int i2, String str, String str2, int i3, final IAccountService.g gVar) {
        super.switchProAccount(i2, str, str2, i3, gVar);
        l.a(AccountApiInModule.f62857b.switchProAccount(i2, str, str2, i3), new k<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.services.ProAccountService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79546);
            }

            @Override // com.google.c.h.a.k
            public void onFailure(Throwable th) {
                IAccountService.g gVar = gVar;
                if (gVar != null) {
                    gVar.onResult(14, 3, null);
                }
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (gVar != null) {
                    if (baseResponse == null || baseResponse.status_code != 0) {
                        gVar.onResult(14, 3, null);
                    } else {
                        gVar.onResult(14, 1, null);
                    }
                }
            }
        }, a.f62883a);
    }
}
