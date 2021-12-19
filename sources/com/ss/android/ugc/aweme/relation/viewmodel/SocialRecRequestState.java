package com.ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class SocialRecRequestState implements af {
    private final FriendList<? extends User> friends;
    private final boolean isNeedActualPopUp;
    private final int isNewVersionSynced;
    private final boolean isOverStayTime;
    private final boolean isSkipByCancel;
    private final boolean isSkipByEmptyData;
    private final boolean isSkipByException;
    private final boolean isSync;
    private final boolean needNewVersionRecShow;
    private final int newVersionSyncClick;

    static {
        Covode.recordClassIndex(78449);
    }

    public SocialRecRequestState() {
        this(false, false, false, false, false, false, null, 0, 0, false, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_relation_viewmodel_SocialRecRequestState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialRecRequestState copy$default(SocialRecRequestState socialRecRequestState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i2, int i3, boolean z7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = socialRecRequestState.isSkipByException;
        }
        if ((i4 & 2) != 0) {
            z2 = socialRecRequestState.isSkipByEmptyData;
        }
        if ((i4 & 4) != 0) {
            z3 = socialRecRequestState.isSkipByCancel;
        }
        if ((i4 & 8) != 0) {
            z4 = socialRecRequestState.isSync;
        }
        if ((i4 & 16) != 0) {
            z5 = socialRecRequestState.isOverStayTime;
        }
        if ((i4 & 32) != 0) {
            z6 = socialRecRequestState.isNeedActualPopUp;
        }
        if ((i4 & 64) != 0) {
            friendList = socialRecRequestState.friends;
        }
        if ((i4 & 128) != 0) {
            i2 = socialRecRequestState.newVersionSyncClick;
        }
        if ((i4 & 256) != 0) {
            i3 = socialRecRequestState.isNewVersionSynced;
        }
        if ((i4 & 512) != 0) {
            z7 = socialRecRequestState.needNewVersionRecShow;
        }
        return socialRecRequestState.copy(z, z2, z3, z4, z5, z6, friendList, i2, i3, z7);
    }

    public final boolean component1() {
        return this.isSkipByException;
    }

    public final boolean component10() {
        return this.needNewVersionRecShow;
    }

    public final boolean component2() {
        return this.isSkipByEmptyData;
    }

    public final boolean component3() {
        return this.isSkipByCancel;
    }

    public final boolean component4() {
        return this.isSync;
    }

    public final boolean component5() {
        return this.isOverStayTime;
    }

    public final boolean component6() {
        return this.isNeedActualPopUp;
    }

    public final FriendList<? extends User> component7() {
        return this.friends;
    }

    public final int component8() {
        return this.newVersionSyncClick;
    }

    public final int component9() {
        return this.isNewVersionSynced;
    }

    public final SocialRecRequestState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i2, int i3, boolean z7) {
        return new SocialRecRequestState(z, z2, z3, z4, z5, z6, friendList, i2, i3, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRecRequestState)) {
            return false;
        }
        SocialRecRequestState socialRecRequestState = (SocialRecRequestState) obj;
        return this.isSkipByException == socialRecRequestState.isSkipByException && this.isSkipByEmptyData == socialRecRequestState.isSkipByEmptyData && this.isSkipByCancel == socialRecRequestState.isSkipByCancel && this.isSync == socialRecRequestState.isSync && this.isOverStayTime == socialRecRequestState.isOverStayTime && this.isNeedActualPopUp == socialRecRequestState.isNeedActualPopUp && l.a(this.friends, socialRecRequestState.friends) && this.newVersionSyncClick == socialRecRequestState.newVersionSyncClick && this.isNewVersionSynced == socialRecRequestState.isNewVersionSynced && this.needNewVersionRecShow == socialRecRequestState.needNewVersionRecShow;
    }

    public final int hashCode() {
        boolean z = this.isSkipByException;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.isSkipByEmptyData;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isSkipByCancel;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.isSync;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.isOverStayTime;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z6 = this.isNeedActualPopUp;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        FriendList<? extends User> friendList = this.friends;
        int hashCode = (((((i26 + (friendList != null ? friendList.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_relation_viewmodel_SocialRecRequestState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.newVersionSyncClick)) * 31) + com_ss_android_ugc_aweme_relation_viewmodel_SocialRecRequestState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.isNewVersionSynced)) * 31;
        if (!this.needNewVersionRecShow) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SocialRecRequestState(isSkipByException=" + this.isSkipByException + ", isSkipByEmptyData=" + this.isSkipByEmptyData + ", isSkipByCancel=" + this.isSkipByCancel + ", isSync=" + this.isSync + ", isOverStayTime=" + this.isOverStayTime + ", isNeedActualPopUp=" + this.isNeedActualPopUp + ", friends=" + this.friends + ", newVersionSyncClick=" + this.newVersionSyncClick + ", isNewVersionSynced=" + this.isNewVersionSynced + ", needNewVersionRecShow=" + this.needNewVersionRecShow + ")";
    }

    public final FriendList<? extends User> getFriends() {
        return this.friends;
    }

    public final boolean getNeedNewVersionRecShow() {
        return this.needNewVersionRecShow;
    }

    public final int getNewVersionSyncClick() {
        return this.newVersionSyncClick;
    }

    public final boolean isNeedActualPopUp() {
        return this.isNeedActualPopUp;
    }

    public final int isNewVersionSynced() {
        return this.isNewVersionSynced;
    }

    public final boolean isOverStayTime() {
        return this.isOverStayTime;
    }

    public final boolean isSkipByCancel() {
        return this.isSkipByCancel;
    }

    public final boolean isSkipByEmptyData() {
        return this.isSkipByEmptyData;
    }

    public final boolean isSkipByException() {
        return this.isSkipByException;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i2, int i3, boolean z7) {
        this.isSkipByException = z;
        this.isSkipByEmptyData = z2;
        this.isSkipByCancel = z3;
        this.isSync = z4;
        this.isOverStayTime = z5;
        this.isNeedActualPopUp = z6;
        this.friends = friendList;
        this.newVersionSyncClick = i2;
        this.isNewVersionSynced = i3;
        this.needNewVersionRecShow = z7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i2, int i3, boolean z7, int i4, g gVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? false : z3, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? false : z6, (i4 & 64) != 0 ? null : friendList, (i4 & 128) != 0 ? -1 : i2, (i4 & 256) == 0 ? i3 : -1, (i4 & 512) == 0 ? z7 : false);
    }
}
