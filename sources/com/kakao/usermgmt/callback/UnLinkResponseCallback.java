package com.kakao.usermgmt.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApiResponseCallback;

public abstract class UnLinkResponseCallback extends ApiResponseCallback<Long> {
    static {
        Covode.recordClassIndex(34433);
    }

    public void onSuccessForUiThread(Long l2) {
        super.onSuccessForUiThread((Object) l2);
    }
}
