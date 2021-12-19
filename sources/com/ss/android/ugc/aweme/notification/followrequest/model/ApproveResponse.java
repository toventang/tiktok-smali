package com.ss.android.ugc.aweme.notification.followrequest.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.b;

public class ApproveResponse extends BaseResponse {
    @b
    public int approve_status = 1;

    static {
        Covode.recordClassIndex(72965);
    }
}
