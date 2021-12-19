package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;
import java.util.List;

public final class ContinuousLoadingAwemeList implements IAwemeList<ContinuousLoadingAwemeList> {
    @c(a = "items")
    public List<Aweme> awemeList;
    @c(a = "cursor")
    public int cursor;
    @c(a = "extra")
    public Extra extra;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(50888);
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final List<Aweme> getIAwemeList() {
        return this.awemeList;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getICursor() {
        return this.cursor;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getIHasMore() {
        return this.hasMore;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final int getIStatusCode() {
        return this.statusCode;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setICursor(int i2) {
        this.cursor = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIHasMore(int i2) {
        this.hasMore = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIStatusCode(int i2) {
        this.statusCode = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public final void setIAwemeList(List<Aweme> list) {
        l.d(list, "");
        this.awemeList = list;
    }

    public final void updateData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        l.d(continuousLoadingAwemeList, "");
        this.hasMore &= continuousLoadingAwemeList.hasMore;
        this.cursor = continuousLoadingAwemeList.cursor;
        this.statusCode = continuousLoadingAwemeList.statusCode;
        this.extra = continuousLoadingAwemeList.extra;
        this.logPb = continuousLoadingAwemeList.logPb;
    }
}
