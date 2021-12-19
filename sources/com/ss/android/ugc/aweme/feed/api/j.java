package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class j implements Serializable {
    @c(a = "aweme_list")
    private final List<Aweme> awemeList;
    @c(a = "status_code")
    private final int code;
    @c(a = "has_more")
    private final boolean hasMore;
    @c(a = "status_msg")
    private final String msg;
    @c(a = "next_cursor")
    private final int nextCursor;

    static {
        Covode.recordClassIndex(57899);
    }

    public j() {
        this(0, null, null, 0, false, 31, null);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public j(int i2, String str, List<Aweme> list, int i3, boolean z) {
        l.d(str, "");
        l.d(list, "");
        this.code = i2;
        this.msg = str;
        this.awemeList = list;
        this.nextCursor = i3;
        this.hasMore = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, String str, List list, int i3, boolean z, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? new ArrayList() : list, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? true : z);
    }
}
