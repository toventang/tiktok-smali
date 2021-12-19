package com.ss.android.ugc.aweme.kids.profile;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.profile.api.IProfileService;
import com.ss.android.ugc.b;

public final class ProfileServiceImpl implements IProfileService {
    static {
        Covode.recordClassIndex(68226);
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.api.IProfileService
    public final Fragment a() {
        return new c();
    }

    public static IProfileService b() {
        MethodCollector.i(1840);
        Object a2 = b.a(IProfileService.class, false);
        if (a2 != null) {
            IProfileService iProfileService = (IProfileService) a2;
            MethodCollector.o(1840);
            return iProfileService;
        }
        if (b.bW == null) {
            synchronized (IProfileService.class) {
                try {
                    if (b.bW == null) {
                        b.bW = new ProfileServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1840);
                    throw th;
                }
            }
        }
        ProfileServiceImpl profileServiceImpl = (ProfileServiceImpl) b.bW;
        MethodCollector.o(1840);
        return profileServiceImpl;
    }
}
