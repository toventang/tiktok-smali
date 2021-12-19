package com.ss.android.ugc.aweme.notification.followrequest.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.b;

public class RejectResponse extends BaseResponse {
    @b
    public int reject_status = 1;

    static {
        Covode.recordClassIndex(72967);
    }
}
