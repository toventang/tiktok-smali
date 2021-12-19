package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class SearchApiResult extends BaseResponse implements d, g {
    @c(a = "header")
    public com.ss.android.ugc.aweme.discover.mixfeed.d dynamicHeader;
    @c(a = "mask_layer")
    public com.ss.android.ugc.aweme.discover.mixfeed.d dynamicMask;
    @c(a = "global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;
    @c(a = "guide_search_words")
    public List<GuideSearchWord> guideSearchWordList;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    String requestId = "";
    a requestInfo;
    @c(a = "search_nil_info")
    public SearchNilInfo searchNilInfo;
    @c(a = "search_nil_text")
    public SearchNilText searchNilText;
    @c(a = "suicide_prevent")
    public SearchPreventSuicide suicidePrevent;

    static {
        Covode.recordClassIndex(50921);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public a getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public void setRequestInfo(a aVar) {
        this.requestInfo = aVar;
    }
}
