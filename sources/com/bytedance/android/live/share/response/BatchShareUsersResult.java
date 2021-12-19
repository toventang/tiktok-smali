package com.bytedance.android.live.share.response;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class BatchShareUsersResult {
    @c(a = "recently_shared_users")
    private final List<User> recentlySharedUsers;
    @c(a = "rank_users")
    private final List<User> topRankUsers;

    static {
        Covode.recordClassIndex(7033);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.live.share.response.BatchShareUsersResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchShareUsersResult copy$default(BatchShareUsersResult batchShareUsersResult, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = batchShareUsersResult.topRankUsers;
        }
        if ((i2 & 2) != 0) {
            list2 = batchShareUsersResult.recentlySharedUsers;
        }
        return batchShareUsersResult.copy(list, list2);
    }

    public final List<User> component1() {
        return this.topRankUsers;
    }

    public final List<User> component2() {
        return this.recentlySharedUsers;
    }

    public final BatchShareUsersResult copy(List<? extends User> list, List<? extends User> list2) {
        return new BatchShareUsersResult(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchShareUsersResult)) {
            return false;
        }
        BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) obj;
        return l.a(this.topRankUsers, batchShareUsersResult.topRankUsers) && l.a(this.recentlySharedUsers, batchShareUsersResult.recentlySharedUsers);
    }

    public final int hashCode() {
        List<User> list = this.topRankUsers;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<User> list2 = this.recentlySharedUsers;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BatchShareUsersResult(topRankUsers=" + this.topRankUsers + ", recentlySharedUsers=" + this.recentlySharedUsers + ")";
    }

    public final List<User> getRecentlySharedUsers() {
        return this.recentlySharedUsers;
    }

    public final List<User> getTopRankUsers() {
        return this.topRankUsers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.user.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.user.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public BatchShareUsersResult(List<? extends User> list, List<? extends User> list2) {
        this.topRankUsers = list;
        this.recentlySharedUsers = list2;
    }
}
