package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class ChallengeDetail extends BaseResponse {
    @c(a = "ch_info")
    public Challenge challenge;
    @c(a = "dynamic_list")
    public List<ChallengeMixFeed> dynamicList;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "preview_status")
    public int previewStatus;
    @c(a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @c(a = "slide_list")
    public List<Aweme> slideList;
    @c(a = "slide_title")
    public String slideTitle;

    static {
        Covode.recordClassIndex(43156);
    }

    public ChallengeDetail setDynamicList(List<ChallengeMixFeed> list) {
        this.dynamicList = list;
        return this;
    }

    public ChallengeDetail setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
        return this;
    }
}
