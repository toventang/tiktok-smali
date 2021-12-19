package com.kakao.usermgmt.callback;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ApiResponseCallback;
import com.kakao.usermgmt.response.MeV2Response;

public abstract class MeV2ResponseCallback extends ApiResponseCallback<MeV2Response> {
    static {
        Covode.recordClassIndex(34432);
    }

    @Override // com.kakao.auth.ApiResponseCallback
    public final void onNotSignedUp() {
    }
}
