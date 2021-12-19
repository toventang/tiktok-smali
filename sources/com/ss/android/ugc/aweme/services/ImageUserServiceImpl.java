package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.ImageUserService;
import h.f.b.l;

public final class ImageUserServiceImpl implements ImageUserService {
    static {
        Covode.recordClassIndex(79486);
    }

    @Override // com.ss.android.ugc.aweme.base.ImageUserService
    public final String getCurrentUserId() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        l.b(curUserId, "");
        return curUserId;
    }

    public static ImageUserService createImageUserServicebyMonsterPlugin(boolean z) {
        Object a2 = com.ss.android.ugc.b.a(ImageUserService.class, z);
        if (a2 != null) {
            return (ImageUserService) a2;
        }
        return new ImageUserServiceImpl();
    }
}
