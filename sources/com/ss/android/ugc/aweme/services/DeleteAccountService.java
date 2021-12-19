package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.framework.services.IDeleteAccountService;
import h.f.b.l;

public final class DeleteAccountService implements IDeleteAccountService {
    static {
        Covode.recordClassIndex(79446);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IDeleteAccountService
    public final boolean toAccountRecover(String str) {
        l.d(str, "");
        return b.b().toRecoverDeletedAccount(str);
    }

    public static IDeleteAccountService createIDeleteAccountServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(13509);
        Object a2 = com.ss.android.ugc.b.a(IDeleteAccountService.class, z);
        if (a2 != null) {
            IDeleteAccountService iDeleteAccountService = (IDeleteAccountService) a2;
            MethodCollector.o(13509);
            return iDeleteAccountService;
        }
        if (com.ss.android.ugc.b.dr == null) {
            synchronized (IDeleteAccountService.class) {
                try {
                    if (com.ss.android.ugc.b.dr == null) {
                        com.ss.android.ugc.b.dr = new DeleteAccountService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13509);
                    throw th;
                }
            }
        }
        DeleteAccountService deleteAccountService = (DeleteAccountService) com.ss.android.ugc.b.dr;
        MethodCollector.o(13509);
        return deleteAccountService;
    }
}
