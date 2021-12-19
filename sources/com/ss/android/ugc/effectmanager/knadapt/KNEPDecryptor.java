package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.ugc.effectplatform.f;
import com.ss.ugc.effectplatform.util.h;
import h.f.b.l;

public final class KNEPDecryptor implements f {
    public static final KNEPDecryptor INSTANCE = new KNEPDecryptor();

    private KNEPDecryptor() {
    }

    static {
        Covode.recordClassIndex(95543);
    }

    @Override // com.ss.ugc.effectplatform.f
    public final String decrypt(String str) {
        h.f153963a = EPUtils.getPlatformSDKVersion();
        return h.a(h.f153965c, str);
    }

    @Override // com.ss.ugc.effectplatform.f
    public final String decrypt(String str, String str2) {
        l.c(str2, "");
        return h.f153965c.a(str, str2);
    }
}
