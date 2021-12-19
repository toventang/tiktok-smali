package com.ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    @c(a = "inviter_list")
    private final List<User> inviterList;
    @c(a = "total_inviter_count")
    private final Integer totalInviterCount;

    static {
        Covode.recordClassIndex(77922);
    }

    public d() {
        this(null, null, 3, null);
    }

    public final List<User> getInviterList() {
        return this.inviterList;
    }

    public final Integer getTotalInviterCount() {
        return this.totalInviterCount;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends User> list, Integer num) {
        this.inviterList = list;
        this.totalInviterCount = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : num);
    }
}
