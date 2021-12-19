package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class RecommendUserInDMBean extends BaseResponse implements Serializable {
    @c(a = "log_pb")
    private final LogPbBean logPb;
    @c(a = "users")
    private final List<User> users;

    static {
        Covode.recordClassIndex(61604);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendUserInDMBean copy$default(RecommendUserInDMBean recommendUserInDMBean, List list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = recommendUserInDMBean.users;
        }
        if ((i2 & 2) != 0) {
            logPbBean = recommendUserInDMBean.logPb;
        }
        return recommendUserInDMBean.copy(list, logPbBean);
    }

    public final List<User> component1() {
        return this.users;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final RecommendUserInDMBean copy(List<User> list, LogPbBean logPbBean) {
        l.d(list, "");
        l.d(logPbBean, "");
        return new RecommendUserInDMBean(list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUserInDMBean)) {
            return false;
        }
        RecommendUserInDMBean recommendUserInDMBean = (RecommendUserInDMBean) obj;
        return l.a(this.users, recommendUserInDMBean.users) && l.a(this.logPb, recommendUserInDMBean.logPb);
    }

    public final int hashCode() {
        List<User> list = this.users;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "RecommendUserInDMBean(users=" + this.users + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    public RecommendUserInDMBean(List<User> list, LogPbBean logPbBean) {
        l.d(list, "");
        l.d(logPbBean, "");
        this.users = list;
        this.logPb = logPbBean;
    }
}
