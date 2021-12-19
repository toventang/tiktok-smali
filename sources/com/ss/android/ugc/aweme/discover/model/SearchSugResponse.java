package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.j.p;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.e;
import java.util.List;

public class SearchSugResponse extends BaseResponse implements g {
    public transient String keyword;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "words_query_record")
    public RecommendWordMob recommendWordMob;
    @c(a = "rid")
    public String requestId = "";
    a requestInfo = null;
    @c(a = "request_order")
    public Long requestOrder = 0L;
    public transient String requestSource;
    public transient p.a requestTaskWrapper;
    @c(a = "sug_list")
    public List<e> sugList;

    static {
        Covode.recordClassIndex(50969);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public a getRequestInfo() {
        return this.requestInfo;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public void setRequestInfo(a aVar) {
        this.requestInfo = aVar;
    }
}
