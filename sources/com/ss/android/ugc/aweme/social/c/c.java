package com.ss.android.ugc.aweme.social.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public final class c extends BaseResponse implements Serializable {
    @com.google.gson.a.c(a = "log_pb")
    private LogPbBean logPb;
    @com.google.gson.a.c(a = "rid")
    private String rid;
    @com.google.gson.a.c(a = "user_list")
    private List<? extends User> userList;

    static {
        Covode.recordClassIndex(87446);
    }

    public c() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.social.c.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c copy$default(c cVar, List list, String str, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = cVar.userList;
        }
        if ((i2 & 2) != 0) {
            str = cVar.rid;
        }
        if ((i2 & 4) != 0) {
            logPbBean = cVar.logPb;
        }
        return cVar.copy(list, str, logPbBean);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> component1() {
        return this.userList;
    }

    public final String component2() {
        return this.rid;
    }

    public final LogPbBean component3() {
        return this.logPb;
    }

    public final c copy(List<? extends User> list, String str, LogPbBean logPbBean) {
        return new c(list, str, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.userList, cVar.userList) && l.a(this.rid, cVar.rid) && l.a(this.logPb, cVar.logPb);
    }

    public final int hashCode() {
        List<? extends User> list = this.userList;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.rid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MAFListResp(userList=" + this.userList + ", rid=" + this.rid + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getRid() {
        return this.rid;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUserList() {
        return this.userList;
    }

    public final List<User> getUserListWithRid() {
        Collection<User> collection = this.userList;
        if (collection == null) {
            return null;
        }
        for (User user : collection) {
            LogPbBean logPbBean = this.logPb;
            user.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
        }
        return (List) collection;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setRid(String str) {
        this.rid = str;
    }

    public final void setUserList(List<? extends User> list) {
        this.userList = list;
    }

    public c(List<? extends User> list, String str, LogPbBean logPbBean) {
        this.userList = list;
        this.rid = str;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(List list, String str, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : logPbBean);
    }
}
