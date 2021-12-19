package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class CheckProfileNotice {
    @c(a = "count")
    private final int countOfUser;
    @c(a = "create_time")
    private final long createTime;
    @c(a = "users")
    private final List<User> users;

    static {
        Covode.recordClassIndex(72517);
    }

    public CheckProfileNotice() {
        this(0, null, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckProfileNotice copy$default(CheckProfileNotice checkProfileNotice, int i2, List list, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = checkProfileNotice.countOfUser;
        }
        if ((i3 & 2) != 0) {
            list = checkProfileNotice.users;
        }
        if ((i3 & 4) != 0) {
            j2 = checkProfileNotice.createTime;
        }
        return checkProfileNotice.copy(i2, list, j2);
    }

    public final int component1() {
        return this.countOfUser;
    }

    public final List<User> component2() {
        return this.users;
    }

    public final long component3() {
        return this.createTime;
    }

    public final CheckProfileNotice copy(int i2, List<? extends User> list, long j2) {
        return new CheckProfileNotice(i2, list, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckProfileNotice)) {
            return false;
        }
        CheckProfileNotice checkProfileNotice = (CheckProfileNotice) obj;
        return this.countOfUser == checkProfileNotice.countOfUser && l.a(this.users, checkProfileNotice.users) && this.createTime == checkProfileNotice.createTime;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.countOfUser) * 31;
        List<User> list = this.users;
        return ((com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_CheckProfileNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.createTime);
    }

    public final String toString() {
        return "CheckProfileNotice(countOfUser=" + this.countOfUser + ", users=" + this.users + ", createTime=" + this.createTime + ")";
    }

    public final int getCountOfUser() {
        return this.countOfUser;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<User> getUsers() {
        return this.users;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckProfileNotice(int i2, List<? extends User> list, long j2) {
        this.countOfUser = i2;
        this.users = list;
        this.createTime = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckProfileNotice(int i2, List list, long j2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? 0 : j2);
    }
}
