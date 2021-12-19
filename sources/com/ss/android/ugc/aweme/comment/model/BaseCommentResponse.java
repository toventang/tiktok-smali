package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

public class BaseCommentResponse extends BaseResponse {
    @c(a = "log_pb")
    public LogPbBean logPd;

    static {
        Covode.recordClassIndex(44289);
    }
}
