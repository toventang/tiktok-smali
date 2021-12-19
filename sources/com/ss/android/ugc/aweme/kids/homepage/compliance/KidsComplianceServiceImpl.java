package com.ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.common.response.KMReportReason;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService;
import com.ss.android.ugc.b;
import java.util.ArrayList;
import java.util.List;

public final class KidsComplianceServiceImpl implements IKidsComplianceService {
    static {
        Covode.recordClassIndex(68097);
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService
    public final KMReportReason b() {
        return a.b();
    }

    @Override // com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService
    public final List<String> a() {
        List<String> blackSetting;
        KidsComplianceSettings a2 = a.f106573a.a();
        if (a2 == null || (blackSetting = a2.getBlackSetting()) == null) {
            return new ArrayList();
        }
        return blackSetting;
    }

    public static IKidsComplianceService c() {
        MethodCollector.i(10086);
        Object a2 = b.a(IKidsComplianceService.class, false);
        if (a2 != null) {
            IKidsComplianceService iKidsComplianceService = (IKidsComplianceService) a2;
            MethodCollector.o(10086);
            return iKidsComplianceService;
        }
        if (b.bS == null) {
            synchronized (IKidsComplianceService.class) {
                try {
                    if (b.bS == null) {
                        b.bS = new KidsComplianceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10086);
                    throw th;
                }
            }
        }
        KidsComplianceServiceImpl kidsComplianceServiceImpl = (KidsComplianceServiceImpl) b.bS;
        MethodCollector.o(10086);
        return kidsComplianceServiceImpl;
    }
}
