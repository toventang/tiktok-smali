package com.ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class RecommendUserListState implements ICommonListState<User> {
    private final boolean isMySelf;
    private final a recommendMobParams;
    private final int recommendUserType;
    private final String reportId;
    private final String secUserId;
    private final ListState<User, o> substate;
    private final String userId;

    static {
        Covode.recordClassIndex(78163);
    }

    public RecommendUserListState() {
        this(null, null, false, 0, null, null, null, 127, null);
    }

    public static int com_ss_android_ugc_aweme_recommend_viewmodel_RecommendUserListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendUserListState copy$default(RecommendUserListState recommendUserListState, String str, String str2, boolean z, int i2, String str3, a aVar, ListState listState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recommendUserListState.userId;
        }
        if ((i3 & 2) != 0) {
            str2 = recommendUserListState.secUserId;
        }
        if ((i3 & 4) != 0) {
            z = recommendUserListState.isMySelf;
        }
        if ((i3 & 8) != 0) {
            i2 = recommendUserListState.recommendUserType;
        }
        if ((i3 & 16) != 0) {
            str3 = recommendUserListState.reportId;
        }
        if ((i3 & 32) != 0) {
            aVar = recommendUserListState.recommendMobParams;
        }
        if ((i3 & 64) != 0) {
            listState = recommendUserListState.getSubstate();
        }
        return recommendUserListState.copy(str, str2, z, i2, str3, aVar, listState);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isMySelf;
    }

    public final int component4() {
        return this.recommendUserType;
    }

    public final String component5() {
        return this.reportId;
    }

    public final a component6() {
        return this.recommendMobParams;
    }

    public final ListState<User, o> component7() {
        return getSubstate();
    }

    public final RecommendUserListState copy(String str, String str2, boolean z, int i2, String str3, a aVar, ListState<User, o> listState) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(aVar, "");
        l.d(listState, "");
        return new RecommendUserListState(str, str2, z, i2, str3, aVar, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUserListState)) {
            return false;
        }
        RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
        return l.a(this.userId, recommendUserListState.userId) && l.a(this.secUserId, recommendUserListState.secUserId) && this.isMySelf == recommendUserListState.isMySelf && this.recommendUserType == recommendUserListState.recommendUserType && l.a(this.reportId, recommendUserListState.reportId) && l.a(this.recommendMobParams, recommendUserListState.recommendMobParams) && l.a(getSubstate(), recommendUserListState.getSubstate());
    }

    public final int hashCode() {
        String str = this.userId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isMySelf;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_recommend_viewmodel_RecommendUserListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode2 + i3) * 31) + com_ss_android_ugc_aweme_recommend_viewmodel_RecommendUserListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.recommendUserType)) * 31;
        String str3 = this.reportId;
        int hashCode3 = (com_ss_android_ugc_aweme_recommend_viewmodel_RecommendUserListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        a aVar = this.recommendMobParams;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ListState<User, o> substate2 = getSubstate();
        if (substate2 != null) {
            i2 = substate2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "RecommendUserListState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", isMySelf=" + this.isMySelf + ", recommendUserType=" + this.recommendUserType + ", reportId=" + this.reportId + ", recommendMobParams=" + this.recommendMobParams + ", substate=" + getSubstate() + ")";
    }

    public final a getRecommendMobParams() {
        return this.recommendMobParams;
    }

    public final int getRecommendUserType() {
        return this.recommendUserType;
    }

    public final String getReportId() {
        return this.reportId;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<User, o> getSubstate() {
        return this.substate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMySelf() {
        return this.isMySelf;
    }

    public final NestedState<ListState<User, o>> newSubstate(ListState<User, o> listState) {
        l.d(listState, "");
        return copy$default(this, null, null, false, 0, null, null, listState, 63, null);
    }

    public RecommendUserListState(String str, String str2, boolean z, int i2, String str3, a aVar, ListState<User, o> listState) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(aVar, "");
        l.d(listState, "");
        this.userId = str;
        this.secUserId = str2;
        this.isMySelf = z;
        this.recommendUserType = i2;
        this.reportId = str3;
        this.recommendMobParams = aVar;
        this.substate = listState;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RecommendUserListState(java.lang.String r18, java.lang.String r19, boolean r20, int r21, java.lang.String r22, com.ss.android.ugc.aweme.recommend.viewmodel.a r23, com.bytedance.jedi.arch.ext.list.ListState r24, int r25, h.f.b.g r26) {
        /*
            r17 = this;
            r2 = r24
            r15 = r23
            r10 = r18
            r11 = r19
            r13 = r21
            r12 = r20
            r0 = r25 & 1
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x0013
            r10 = r14
        L_0x0013:
            r0 = r25 & 2
            if (r0 == 0) goto L_0x0018
            r11 = r14
        L_0x0018:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x001d
            r12 = 1
        L_0x001d:
            r0 = r25 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0023
            r13 = 0
        L_0x0023:
            r0 = r25 & 16
            if (r0 == 0) goto L_0x0050
        L_0x0027:
            r0 = r25 & 32
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.recommend.viewmodel.a r15 = new com.ss.android.ugc.aweme.recommend.viewmodel.a
            r15.<init>()
        L_0x0030:
            r0 = r25 & 64
            if (r0 == 0) goto L_0x0048
            com.bytedance.jedi.arch.ext.list.o r3 = new com.bytedance.jedi.arch.ext.list.o
            r0 = 3
            r3.<init>(r1, r0, r1)
            com.bytedance.jedi.arch.ext.list.ListState r2 = new com.bytedance.jedi.arch.ext.list.ListState
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = 30
            r9 = 0
            r8 = 30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x0048:
            r9 = r17
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0050:
            r14 = r22
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, com.ss.android.ugc.aweme.recommend.viewmodel.a, com.bytedance.jedi.arch.ext.list.ListState, int, h.f.b.g):void");
    }
}
