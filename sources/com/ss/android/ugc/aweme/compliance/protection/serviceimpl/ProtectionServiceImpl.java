package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.c.h;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.protection.common.a;
import com.ss.android.ugc.aweme.compliance.protection.common.a.b;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ProtectionServiceImpl implements IProtectionService {
    static {
        Covode.recordClassIndex(48366);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void g() {
        a.f77964d = false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean f() {
        return a.f77964d;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void i() {
        com.ss.android.ugc.aweme.compliance.protection.common.a.e();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean a() {
        return com.ss.android.ugc.aweme.compliance.protection.common.a.b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int b() {
        return com.ss.android.ugc.aweme.compliance.protection.common.a.d();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean c() {
        return com.ss.android.ugc.aweme.compliance.protection.common.a.a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final h j() {
        return new com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final int h() {
        if (a.b()) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void e() {
        com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar = a.f77962b;
        if (aVar != null) {
            aVar.setRestrictModeSelf(false);
        }
        com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar2 = a.f77962b;
        if (aVar2 != null) {
            aVar2.setTimeLockSelfInMin(0);
        }
        a.a(a.f77962b);
        FamilyPiaringManager.f77979b.a((b) null);
    }

    public static IProtectionService k() {
        MethodCollector.i(9371);
        Object a2 = com.ss.android.ugc.b.a(IProtectionService.class, false);
        if (a2 != null) {
            IProtectionService iProtectionService = (IProtectionService) a2;
            MethodCollector.o(9371);
            return iProtectionService;
        }
        if (com.ss.android.ugc.b.aS == null) {
            synchronized (IProtectionService.class) {
                try {
                    if (com.ss.android.ugc.b.aS == null) {
                        com.ss.android.ugc.b.aS = new ProtectionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9371);
                    throw th;
                }
            }
        }
        ProtectionServiceImpl protectionServiceImpl = (ProtectionServiceImpl) com.ss.android.ugc.b.aS;
        MethodCollector.o(9371);
        return protectionServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean d() {
        IFamilyPairingService.a a2 = FamilyPiaringManager.a();
        if (a2 == IFamilyPairingService.a.CHILD || a2 == IFamilyPairingService.a.UNLINK_LOCKED) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                return true;
            }
        }
        return a.e();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void a(com.ss.android.ugc.aweme.compliance.api.services.teenmode.a aVar) {
        com.ss.android.ugc.aweme.compliance.protection.common.a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final boolean a(com.ss.android.ugc.aweme.base.ui.session.b<Boolean> bVar, String str) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.compliance.protection.timelock.a.a(bVar, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    public final void a(Context context, String str, Runnable runnable) {
        int i2;
        if ((FamilyPiaringManager.a() == IFamilyPairingService.a.CHILD || FamilyPiaringManager.a() == IFamilyPairingService.a.UNLINK_LOCKED) && FamilyPiaringManager.b()) {
            if (TextUtils.equals(str, "add_account")) {
                i2 = R.string.br_;
            } else {
                i2 = R.string.brc;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(i2).a();
        } else if (a.b()) {
            com.ss.android.ugc.aweme.compliance.protection.timelock.a.a(new a.C1807a(runnable), str);
        } else {
            runnable.run();
        }
    }
}
