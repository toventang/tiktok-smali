package com.ss.android.ugc.aweme.promote;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.b;

public class PromoteProgramResponse extends BaseResponse {
    @b
    public Boolean confirmed = false;

    static {
        Covode.recordClassIndex(76724);
    }

    public boolean isConfirmedSuccess() {
        Boolean bool = this.confirmed;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
