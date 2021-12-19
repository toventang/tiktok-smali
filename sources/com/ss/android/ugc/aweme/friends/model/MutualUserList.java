package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class MutualUserList extends BaseResponse {
    @c(a = "next_cursor")
    public final int cursor;
    @c(a = "has_more")
    public final boolean hasMore;
    @c(a = "log_pb")
    public final LogPbBean logPb;
    @c(a = "total")
    public final int total;
    @c(a = "user_list")
    public final List<User> userList;

    static {
        Covode.recordClassIndex(61593);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public MutualUserList(int i2, int i3, boolean z, List<? extends User> list, LogPbBean logPbBean) {
        l.d(logPbBean, "");
        this.cursor = i2;
        this.total = i3;
        this.hasMore = z;
        this.userList = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutualUserList(int i2, int i3, boolean z, List list, LogPbBean logPbBean, int i4, g gVar) {
        this(i2, (i4 & 2) != 0 ? 0 : i3, z, list, logPbBean);
    }
}
