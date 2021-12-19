package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class CombineLiveNotice {
    @c(a = "room_info")
    private final o roomInfo;
    @c(a = StringSet.type)
    private final int type;
    @c(a = "owner")
    private final User user;

    static {
        Covode.recordClassIndex(72518);
    }

    public CombineLiveNotice() {
        this(null, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_CombineLiveNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CombineLiveNotice copy$default(CombineLiveNotice combineLiveNotice, User user2, int i2, o oVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            user2 = combineLiveNotice.user;
        }
        if ((i3 & 2) != 0) {
            i2 = combineLiveNotice.type;
        }
        if ((i3 & 4) != 0) {
            oVar = combineLiveNotice.roomInfo;
        }
        return combineLiveNotice.copy(user2, i2, oVar);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.type;
    }

    public final o component3() {
        return this.roomInfo;
    }

    public final CombineLiveNotice copy(User user2, int i2, o oVar) {
        return new CombineLiveNotice(user2, i2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombineLiveNotice)) {
            return false;
        }
        CombineLiveNotice combineLiveNotice = (CombineLiveNotice) obj;
        return l.a(this.user, combineLiveNotice.user) && this.type == combineLiveNotice.type && l.a(this.roomInfo, combineLiveNotice.roomInfo);
    }

    public final int hashCode() {
        User user2 = this.user;
        int i2 = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_CombineLiveNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        o oVar = this.roomInfo;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CombineLiveNotice(user=" + this.user + ", type=" + this.type + ", roomInfo=" + this.roomInfo + ")";
    }

    public final o getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public CombineLiveNotice(User user2, int i2, o oVar) {
        this.user = user2;
        this.type = i2;
        this.roomInfo = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombineLiveNotice(User user2, int i2, o oVar, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : user2, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : oVar);
    }
}
