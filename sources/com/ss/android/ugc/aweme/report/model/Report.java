package com.ss.android.ugc.aweme.report.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class Report extends BaseResponse {
    static {
        Covode.recordClassIndex(78522);
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatusMessage(String str) {
        this.message = str;
    }
}
