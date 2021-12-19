package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.tcm.api.a.a;
import h.f.b.l;

public final class z implements a {
    static {
        Covode.recordClassIndex(45444);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.a.a
    public final User b() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.a.a
    public final boolean a() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return e2.isChildrenMode();
    }
}
