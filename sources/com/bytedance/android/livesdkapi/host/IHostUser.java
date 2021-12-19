package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdkapi.l.c;
import com.bytedance.android.livesdkapi.model.e;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IHostUser extends a {
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    static {
        Covode.recordClassIndex(13792);
    }

    List<e> getAllFriends();

    b getCurUser();

    long getCurUserId();

    int getCurUserMode();

    boolean interceptOperation(String str);

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMinorMode();

    void login(androidx.fragment.app.e eVar, com.bytedance.android.livesdkapi.host.c.a aVar, String str, String str2, int i2, String str3, String str4, String str5);

    void markAsOutOfDate(boolean z);

    void onFollowStatusChanged(int i2, long j2);

    void registerCurrentUserUpdateListener(com.bytedance.android.livesdkapi.depend.f.b bVar);

    void registerFollowStatusListener(com.bytedance.android.livesdkapi.depend.f.a aVar);

    void requestLivePermission(c cVar);

    void setRoomAttrsAdminFlag(int i2);

    void unFollowWithConfirm(Activity activity, int i2, long j2, com.bytedance.android.livesdkapi.host.c.b bVar);

    void unRegisterCurrentUserUpdateListener(com.bytedance.android.livesdkapi.depend.f.b bVar);

    void unRegisterFollowStatusListener(com.bytedance.android.livesdkapi.depend.f.a aVar);

    void updateUser(b bVar);
}
