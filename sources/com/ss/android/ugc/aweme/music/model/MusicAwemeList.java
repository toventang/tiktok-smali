package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class MusicAwemeList extends BaseResponse implements d {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "aweme_list")
    public List<Aweme> items;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "rid")
    String requestId;

    static {
        Covode.recordClassIndex(71665);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
