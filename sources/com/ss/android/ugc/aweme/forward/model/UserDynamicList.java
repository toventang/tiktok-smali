package com.ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.ip;
import java.util.List;

public class UserDynamicList extends BaseResponse implements d {
    @c(a = "dongtai_list")
    private List<a> dynamicList;
    @c(a = "has_more")
    private int hasMore;
    @c(a = "max_cursor")
    private long maxCursor;
    @c(a = "min_cursor")
    private long minCursor;
    String requestId;

    static {
        Covode.recordClassIndex(61324);
    }

    public List<a> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<a> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
        if (!ip.a(this.dynamicList)) {
            for (a aVar : this.dynamicList) {
                if (aVar != null) {
                    aVar.setRequestId(str);
                }
            }
        }
    }
}
