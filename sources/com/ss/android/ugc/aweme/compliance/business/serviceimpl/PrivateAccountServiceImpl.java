package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;

public final class PrivateAccountServiceImpl implements IPrivateAccountService {
    static {
        Covode.recordClassIndex(47711);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean b() {
        Boolean forcePrivateAccount;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (forcePrivateAccount = c2.getForcePrivateAccount()) == null) {
            return false;
        }
        return forcePrivateAccount.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final int c() {
        Integer notifyPrivateAccount;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (notifyPrivateAccount = c2.getNotifyPrivateAccount()) == null) {
            return 0;
        }
        return notifyPrivateAccount.intValue();
    }

    public static IPrivateAccountService e() {
        MethodCollector.i(6865);
        Object a2 = com.ss.android.ugc.b.a(IPrivateAccountService.class, false);
        if (a2 != null) {
            IPrivateAccountService iPrivateAccountService = (IPrivateAccountService) a2;
            MethodCollector.o(6865);
            return iPrivateAccountService;
        }
        if (com.ss.android.ugc.b.aI == null) {
            synchronized (IPrivateAccountService.class) {
                try {
                    if (com.ss.android.ugc.b.aI == null) {
                        com.ss.android.ugc.b.aI = new PrivateAccountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6865);
                    throw th;
                }
            }
        }
        PrivateAccountServiceImpl privateAccountServiceImpl = (PrivateAccountServiceImpl) com.ss.android.ugc.b.aI;
        MethodCollector.o(6865);
        return privateAccountServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final boolean a() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        if (a.i().b() && !com.ss.android.ugc.aweme.account.b.g().getCurUser().isSecret()) {
            ProfileServiceImpl.g().newUserPresenter().a();
            SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().b(true);
        }
        if (a.i().c() <= 0 || com.ss.android.ugc.aweme.account.b.g().getCurUser().isSecret()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    public final void d() {
        ComplianceSetting complianceSetting;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553407, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33551359, null);
        }
        b.b(complianceSetting);
    }
}
