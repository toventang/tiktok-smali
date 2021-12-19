package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;

public final class ab implements IUserDepend {
    static {
        Covode.recordClassIndex(45409);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getAvatarURL() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null) {
            return null;
        }
        return e2.getAvatarUrl();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getNickname() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null) {
            return null;
        }
        return e2.getNickName();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getSecUid() {
        IAccountUserService e2;
        User curUser;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null || (curUser = e2.getCurUser()) == null) {
            return null;
        }
        return curUser.getSecUid();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getUniqueID() {
        IAccountUserService e2;
        User curUser;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null || (curUser = e2.getCurUser()) == null) {
            return null;
        }
        return curUser.getUniqueId();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final String getUserId() {
        IAccountUserService e2;
        User curUser;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null || (curUser = e2.getCurUser()) == null) {
            return null;
        }
        return curUser.getUid();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final boolean hasBoundPhone() {
        IAccountUserService e2;
        User curUser;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null || (curUser = e2.getCurUser()) == null) {
            return false;
        }
        return curUser.isPhoneBinded();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
    public final boolean hasLogin() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null) {
            return false;
        }
        return e2.isLogin();
    }
}
