package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.c.b;

public final class UserInfoUpdateAdapterService implements IAccountInfoUpdateAdapterService {
    static {
        Covode.recordClassIndex(79577);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public final int userDefaultAllowStatus() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService
    public final User getUser() {
        return new b().a();
    }

    public static IAccountInfoUpdateAdapterService createIAccountInfoUpdateAdapterServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(12794);
        Object a2 = com.ss.android.ugc.b.a(IAccountInfoUpdateAdapterService.class, z);
        if (a2 != null) {
            IAccountInfoUpdateAdapterService iAccountInfoUpdateAdapterService = (IAccountInfoUpdateAdapterService) a2;
            MethodCollector.o(12794);
            return iAccountInfoUpdateAdapterService;
        }
        if (com.ss.android.ugc.b.dB == null) {
            synchronized (IAccountInfoUpdateAdapterService.class) {
                try {
                    if (com.ss.android.ugc.b.dB == null) {
                        com.ss.android.ugc.b.dB = new UserInfoUpdateAdapterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12794);
                    throw th;
                }
            }
        }
        UserInfoUpdateAdapterService userInfoUpdateAdapterService = (UserInfoUpdateAdapterService) com.ss.android.ugc.b.dB;
        MethodCollector.o(12794);
        return userInfoUpdateAdapterService;
    }
}
