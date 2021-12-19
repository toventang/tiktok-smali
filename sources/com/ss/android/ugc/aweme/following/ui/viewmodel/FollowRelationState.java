package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.l;

public final class FollowRelationState implements af {
    private final int connectedRelationCount;
    private final int fanCount;
    private final boolean isFollowingTab;
    private final boolean isSearching;
    private final int mutualCount;
    private final String tabIndex;

    static {
        Covode.recordClassIndex(61254);
    }

    public FollowRelationState() {
        this(false, 0, 0, 0, false, null, 63, null);
    }

    public static int com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ FollowRelationState copy$default(FollowRelationState followRelationState, boolean z, int i2, int i3, int i4, boolean z2, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = followRelationState.isSearching;
        }
        if ((i5 & 2) != 0) {
            i2 = followRelationState.connectedRelationCount;
        }
        if ((i5 & 4) != 0) {
            i3 = followRelationState.fanCount;
        }
        if ((i5 & 8) != 0) {
            i4 = followRelationState.mutualCount;
        }
        if ((i5 & 16) != 0) {
            z2 = followRelationState.isFollowingTab;
        }
        if ((i5 & 32) != 0) {
            str = followRelationState.tabIndex;
        }
        return followRelationState.copy(z, i2, i3, i4, z2, str);
    }

    public final boolean component1() {
        return this.isSearching;
    }

    public final int component2() {
        return this.connectedRelationCount;
    }

    public final int component3() {
        return this.fanCount;
    }

    public final int component4() {
        return this.mutualCount;
    }

    public final boolean component5() {
        return this.isFollowingTab;
    }

    public final String component6() {
        return this.tabIndex;
    }

    public final FollowRelationState copy(boolean z, int i2, int i3, int i4, boolean z2, String str) {
        l.d(str, "");
        return new FollowRelationState(z, i2, i3, i4, z2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRelationState)) {
            return false;
        }
        FollowRelationState followRelationState = (FollowRelationState) obj;
        return this.isSearching == followRelationState.isSearching && this.connectedRelationCount == followRelationState.connectedRelationCount && this.fanCount == followRelationState.fanCount && this.mutualCount == followRelationState.mutualCount && this.isFollowingTab == followRelationState.isFollowingTab && l.a(this.tabIndex, followRelationState.tabIndex);
    }

    public final int hashCode() {
        boolean z = this.isSearching;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((i3 * 31) + com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.connectedRelationCount)) * 31) + com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.fanCount)) * 31) + com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mutualCount)) * 31;
        if (!this.isFollowingTab) {
            i2 = 0;
        }
        int i6 = (com_ss_android_ugc_aweme_following_ui_viewmodel_FollowRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31;
        String str = this.tabIndex;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FollowRelationState(isSearching=" + this.isSearching + ", connectedRelationCount=" + this.connectedRelationCount + ", fanCount=" + this.fanCount + ", mutualCount=" + this.mutualCount + ", isFollowingTab=" + this.isFollowingTab + ", tabIndex=" + this.tabIndex + ")";
    }

    public final int getConnectedRelationCount() {
        return this.connectedRelationCount;
    }

    public final int getFanCount() {
        return this.fanCount;
    }

    public final int getMutualCount() {
        return this.mutualCount;
    }

    public final String getTabIndex() {
        return this.tabIndex;
    }

    public final boolean isFollowingTab() {
        return this.isFollowingTab;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public FollowRelationState(boolean z, int i2, int i3, int i4, boolean z2, String str) {
        l.d(str, "");
        this.isSearching = z;
        this.connectedRelationCount = i2;
        this.fanCount = i3;
        this.mutualCount = i4;
        this.isFollowingTab = z2;
        this.tabIndex = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FollowRelationState(boolean r8, int r9, int r10, int r11, boolean r12, java.lang.String r13, int r14, h.f.b.g r15) {
        /*
            r7 = this;
            r4 = r11
            r3 = r10
            r2 = r9
            r1 = r8
            r0 = r14 & 1
            r5 = 0
            if (r0 == 0) goto L_0x000a
            r1 = 0
        L_0x000a:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x000f
            r2 = 0
        L_0x000f:
            r0 = r14 & 4
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.b.g()
            h.f.b.l.b(r0, r6)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            int r3 = com.ss.android.ugc.aweme.profile.ui.ae.b(r0)
        L_0x0024:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0029
            r4 = 0
        L_0x0029:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0038
        L_0x002d:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0036
        L_0x0031:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            r6 = r13
            goto L_0x0031
        L_0x0038:
            r5 = r12
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState.<init>(boolean, int, int, int, boolean, java.lang.String, int, h.f.b.g):void");
    }
}
