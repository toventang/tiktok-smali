package com.ss.android.ugc.aweme.dsp.common.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import h.a.z;
import h.f.b.l;
import java.util.List;

public abstract class BaseDspFeedResponse extends BaseResponse {
    @c(a = "count")
    private int count;
    @c(a = "cursor")
    private long cursor;
    @c(a = "dsp_list")
    private List<DspStruct> dspList = z.INSTANCE;
    @c(a = "has_more")
    private int hasMore;

    static {
        Covode.recordClassIndex(51933);
    }

    public final int getCount() {
        return this.count;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<DspStruct> getDspList() {
        return this.dspList;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final void setCount(int i2) {
        this.count = i2;
    }

    public final void setCursor(long j2) {
        this.cursor = j2;
    }

    public final void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public final void setDspList(List<DspStruct> list) {
        l.d(list, "");
        this.dspList = list;
    }
}
