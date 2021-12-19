package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.compliance.api.c.a;
import com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.compliance.common.d.a;
import h.f.b.l;

public final class AlgofreeServiceImpl implements IAlgofreeService {
    static {
        Covode.recordClassIndex(47695);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    public final AlgoFreeInfo a() {
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 != null) {
            return c2.getAlgoFreeInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    public final boolean b() {
        Boolean algoFreeEnabled;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (algoFreeEnabled = c2.getAlgoFreeEnabled()) == null) {
            return false;
        }
        return algoFreeEnabled.booleanValue();
    }

    public static IAlgofreeService d() {
        MethodCollector.i(6140);
        Object a2 = com.ss.android.ugc.b.a(IAlgofreeService.class, false);
        if (a2 != null) {
            IAlgofreeService iAlgofreeService = (IAlgofreeService) a2;
            MethodCollector.o(6140);
            return iAlgofreeService;
        }
        if (com.ss.android.ugc.b.aB == null) {
            synchronized (IAlgofreeService.class) {
                try {
                    if (com.ss.android.ugc.b.aB == null) {
                        com.ss.android.ugc.b.aB = new AlgofreeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6140);
                    throw th;
                }
            }
        }
        AlgofreeServiceImpl algofreeServiceImpl = (AlgofreeServiceImpl) com.ss.android.ugc.b.aB;
        MethodCollector.o(6140);
        return algofreeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    public final void c() {
        ComplianceSetting complianceSetting;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554047, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        }
        b.a(complianceSetting);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService
    public final void a(a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.compliance.common.d.a aVar2 = b.f77287a;
        l.d(aVar, "");
        aVar2.f77319a.getAlgoFreeSettings().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a.C1779a(aVar));
    }
}
