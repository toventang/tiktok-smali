package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.media.api.a.a;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.l;

public final class n implements a {
    static {
        Covode.recordClassIndex(45428);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final String b() {
        return AVExternalServiceImpl.a().publishService().getShootWay();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final boolean c() {
        return AVExternalServiceImpl.a().publishService().usedBusiSticker();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final boolean e() {
        return AVExternalServiceImpl.a().publishService().isInShoutout();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final User f() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final boolean a() {
        AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
        if (curChallenge == null || !curChallenge.isCommerce) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.a.a
    public final boolean d() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return e2.isChildrenMode();
    }
}
