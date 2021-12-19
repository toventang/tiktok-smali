package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.ss.android.ugc.aweme.app.api.c;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.a.z;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Callable;

public final class TrendingTopicList extends BaseResponse implements c, g, LazyParseTask<TrendingTopicList> {
    @com.google.gson.a.c(a = "cursor")
    public final int cursor;
    @com.google.gson.a.c(a = "device_type")
    public final int deviceType;
    @com.google.gson.a.c(a = "has_more")
    public final int hasMore;
    @com.google.gson.a.c(a = "category_list")
    public List<TrendingTopic> items;
    public transient String jsonRawData;
    private transient Callable<TrendingTopicList> lazyParseCallable;
    private a<?> requestInfo;

    static {
        Covode.recordClassIndex(50981);
    }

    public TrendingTopicList() {
        this(0, null, 0, 0, null, 31, null);
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final i getRequestLog() {
        return h.a(this);
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public final Callable<TrendingTopicList> getLazyParseCallable() {
        return this.lazyParseCallable;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final a<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final boolean doesHaveMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.app.api.c
    public final void setJsonData(String str) {
        this.jsonRawData = str;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyParseTask
    public final void setLazyParseCallable(Callable<TrendingTopicList> callable) {
        this.lazyParseCallable = callable;
    }

    public final void setItems(List<TrendingTopic> list) {
        l.d(list, "");
        this.items = list;
    }

    @Override // com.ss.android.ugc.aweme.app.api.g
    public final void setRequestInfo(a<?> aVar) {
        if (aVar != null) {
            this.requestInfo = aVar;
        }
    }

    public TrendingTopicList(int i2, List<TrendingTopic> list, int i3, int i4, a<?> aVar) {
        l.d(list, "");
        this.deviceType = i2;
        this.items = list;
        this.hasMore = i3;
        this.cursor = i4;
        this.requestInfo = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingTopicList(int i2, List list, int i3, int i4, a aVar, int i5, h.f.b.g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? z.INSTANCE : list, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? null : aVar);
    }
}
