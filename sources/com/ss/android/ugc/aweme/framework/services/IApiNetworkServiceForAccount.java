package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public interface IApiNetworkServiceForAccount {
    static {
        Covode.recordClassIndex(61356);
    }

    void executeGetForCheck(String str);

    User executeGetJSONObject(String str);

    User executePostJSONObjectForUser(String str, List<d> list);

    UserResponse executePostJSONObjectForUserResponse(String str, List<d> list);

    void registerNotice(String str, int i2);

    AvatarUri uploadAvatar(String str, int i2, String str2, List<d> list);
}
