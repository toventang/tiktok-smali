package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;

public class BaseUserService implements IUserService {
    static {
        Covode.recordClassIndex(79430);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void clearUser() {
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void refreshUser() {
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean getAuthGoods() {
        return b.g().getAuthGoods();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public User getCurrentUser() {
        return b.g().getCurUser();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public String getCurrentUserID() {
        return b.g().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isLogin() {
        return b.g().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void logout() {
        b.b().logout("expired_logout", "sdk_expired_logout");
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isOldUser() {
        return SharePrefCache.inst().getIsOldUser().c().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isUserEmpty(User user) {
        return b.g().isUserEmpty(user);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void setBroadcasterRoomId(long j2) {
        b.g().getCurUser().setBroadcasterRoomId(j2);
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().b(Boolean.valueOf(z));
    }

    public static IUserService createIUserServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(10607);
        Object a2 = com.ss.android.ugc.b.a(IUserService.class, z);
        if (a2 != null) {
            IUserService iUserService = (IUserService) a2;
            MethodCollector.o(10607);
            return iUserService;
        }
        if (com.ss.android.ugc.b.f347do == null) {
            synchronized (IUserService.class) {
                try {
                    if (com.ss.android.ugc.b.f347do == null) {
                        com.ss.android.ugc.b.f347do = new BaseUserService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10607);
                    throw th;
                }
            }
        }
        BaseUserService baseUserService = (BaseUserService) com.ss.android.ugc.b.f347do;
        MethodCollector.o(10607);
        return baseUserService;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void logout(String str, String str2) {
        b.b().logout(str, str2);
    }
}
