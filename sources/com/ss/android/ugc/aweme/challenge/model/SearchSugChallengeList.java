package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class SearchSugChallengeList extends BaseResponse {
    @c(a = "is_match")
    public boolean isMatch;
    @c(a = "sug_list")
    public List<AVChallenge> items = new ArrayList();
    public String keyword = "";
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "words_query_record")
    public final RecommendWordMob recommendWordMob;

    static {
        Covode.recordClassIndex(43170);
    }

    public final void setItems(List<AVChallenge> list) {
        l.d(list, "");
        this.items = list;
    }

    public final void setKeyword(String str) {
        l.d(str, "");
        this.keyword = str;
    }
}
