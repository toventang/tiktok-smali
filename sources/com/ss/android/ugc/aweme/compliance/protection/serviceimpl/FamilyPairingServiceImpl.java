package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.o;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ck.j;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.common.a;
import com.ss.android.ugc.aweme.compliance.protection.common.a.c;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.a;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.b;
import com.zhiliaoapp.musically.R;

public final class FamilyPairingServiceImpl implements IFamilyPairingService {
    static {
        Covode.recordClassIndex(48365);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final IFamilyPairingService.a a() {
        return FamilyPiaringManager.a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final j b() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final j c() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final IInterceptor d() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean e() {
        c cVar;
        Integer num;
        com.ss.android.ugc.aweme.compliance.protection.common.a.b bVar = FamilyPiaringManager.f77978a;
        if (bVar == null || (cVar = bVar.f77947b) == null || (num = cVar.f77952c) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static IFamilyPairingService f() {
        MethodCollector.i(9363);
        Object a2 = com.ss.android.ugc.b.a(IFamilyPairingService.class, false);
        if (a2 != null) {
            IFamilyPairingService iFamilyPairingService = (IFamilyPairingService) a2;
            MethodCollector.o(9363);
            return iFamilyPairingService;
        }
        if (com.ss.android.ugc.b.aR == null) {
            synchronized (IFamilyPairingService.class) {
                try {
                    if (com.ss.android.ugc.b.aR == null) {
                        com.ss.android.ugc.b.aR = new FamilyPairingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9363);
                    throw th;
                }
            }
        }
        FamilyPairingServiceImpl familyPairingServiceImpl = (FamilyPairingServiceImpl) com.ss.android.ugc.b.aR;
        MethodCollector.o(9363);
        return familyPairingServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean a(String str) {
        return FamilyPiaringManager.a(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!com.ss.android.ugc.aweme.compliance.protection.common.a.f()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(activity.getString(R.string.bpc)).a();
            return;
        }
        o oVar = new o(activity);
        oVar.show();
        com.ss.android.ugc.aweme.compliance.protection.common.a.a(new a.b(oVar, activity));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void b(Activity activity) {
        if (!com.ss.android.ugc.aweme.compliance.protection.common.a.f()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(activity.getString(R.string.bpc)).a();
            return;
        }
        o oVar = new o(activity);
        oVar.show();
        com.ss.android.ugc.aweme.compliance.protection.common.a.a(new a.c(oVar, activity));
    }
}
