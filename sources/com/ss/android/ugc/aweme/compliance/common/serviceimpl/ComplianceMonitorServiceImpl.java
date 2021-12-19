package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.common.c.a;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.Map;

public final class ComplianceMonitorServiceImpl implements IComplianceMonitorService {
    static {
        Covode.recordClassIndex(47826);
    }

    public static IComplianceMonitorService a() {
        MethodCollector.i(8483);
        Object a2 = b.a(IComplianceMonitorService.class, false);
        if (a2 != null) {
            IComplianceMonitorService iComplianceMonitorService = (IComplianceMonitorService) a2;
            MethodCollector.o(8483);
            return iComplianceMonitorService;
        }
        if (b.aN == null) {
            synchronized (IComplianceMonitorService.class) {
                try {
                    if (b.aN == null) {
                        b.aN = new ComplianceMonitorServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8483);
                    throw th;
                }
            }
        }
        ComplianceMonitorServiceImpl complianceMonitorServiceImpl = (ComplianceMonitorServiceImpl) b.aN;
        MethodCollector.o(8483);
        return complianceMonitorServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void a(String str, boolean z, Map<String, ? extends Object> map) {
        l.d(str, "");
        a.a(str, z, map);
    }
}
