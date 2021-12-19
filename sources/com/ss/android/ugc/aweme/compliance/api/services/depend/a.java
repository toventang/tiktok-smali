package com.ss.android.ugc.aweme.compliance.api.services.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile IComplianceDependService f76703a;

    static {
        Covode.recordClassIndex(47389);
    }

    public static IComplianceDependService a() {
        if (f76703a == null) {
            f76703a = ComplianceDependServiceImpl.d();
        }
        return f76703a;
    }
}
