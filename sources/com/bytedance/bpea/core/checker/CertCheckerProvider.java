package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.e;
import com.bytedance.covode.number.Covode;

public final class CertCheckerProvider {
    private static final e CHECKER = new e();
    public static final CertCheckerProvider INSTANCE = new CertCheckerProvider();

    private CertCheckerProvider() {
    }

    public final e getCHECKER() {
        return CHECKER;
    }

    static {
        Covode.recordClassIndex(15689);
    }
}
