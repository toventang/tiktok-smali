package com.ss.android.ugc.aweme.compliance;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.cs.c;
import com.ss.android.ugc.aweme.login.d;
import com.ss.android.ugc.aweme.main.d.a;
import com.ss.android.ugc.b;
import f.a.t;
import h.f.b.l;

public final class ComplianceDependServiceImpl implements IComplianceDependService {
    static {
        Covode.recordClassIndex(47304);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    public final boolean a() {
        return d.f109022a;
    }

    public static IComplianceDependService d() {
        MethodCollector.i(2452);
        Object a2 = b.a(IComplianceDependService.class, false);
        if (a2 != null) {
            IComplianceDependService iComplianceDependService = (IComplianceDependService) a2;
            MethodCollector.o(2452);
            return iComplianceDependService;
        }
        if (b.az == null) {
            synchronized (IComplianceDependService.class) {
                try {
                    if (b.az == null) {
                        b.az = new ComplianceDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2452);
                    throw th;
                }
            }
        }
        ComplianceDependServiceImpl complianceDependServiceImpl = (ComplianceDependServiceImpl) b.az;
        MethodCollector.o(2452);
        return complianceDependServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    public final boolean b() {
        if (System.currentTimeMillis() - c.a().getLong("last_check_storage_time", 0) <= 604800000) {
            return false;
        }
        if (!c.b() || !c.d()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService
    public final void c() {
        Activity j2 = f.j();
        a aVar = new a();
        if (j2 != null) {
            l.d(j2, "");
            t.a(new a.b(j2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.c(aVar, j2), a.d.f109229a);
        }
    }
}
