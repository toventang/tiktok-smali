package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final class AwemeDetailList extends BaseResponse {
    @c(a = "aweme_details")
    private List<? extends Aweme> awemeList;
    @c(a = "aweme_status")
    private List<AwemeStatusBean> awemeStatus;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "rid")
    private String requestId;

    static {
        Covode.recordClassIndex(64019);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final List<AwemeStatusBean> getAwemeStatus() {
        return this.awemeStatus;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setAwemeStatus(List<AwemeStatusBean> list) {
        this.awemeStatus = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
