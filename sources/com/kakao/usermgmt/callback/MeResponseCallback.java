package com.kakao.usermgmt.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;

public abstract class MeResponseCallback extends ApiResponseCallback<UserProfile> {
    static {
        Covode.recordClassIndex(34431);
    }

    public void onSuccessForUiThread(UserProfile userProfile) {
        userProfile.saveUserToCache();
        super.onSuccessForUiThread((Object) userProfile);
    }
}
