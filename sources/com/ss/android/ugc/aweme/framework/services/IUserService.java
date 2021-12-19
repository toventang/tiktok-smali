package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IUserService {
    static {
        Covode.recordClassIndex(61363);
    }

    void clearUser();

    boolean getAuthGoods();

    User getCurrentUser();

    String getCurrentUserID();

    boolean isLogin();

    boolean isOldUser();

    boolean isUserEmpty(User user);

    void logout();

    void logout(String str, String str2);

    void refreshUser();

    void setBroadcasterRoomId(long j2);

    void setIsOldUser(boolean z);
}
