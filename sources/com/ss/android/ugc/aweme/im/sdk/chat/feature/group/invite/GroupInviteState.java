package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import h.f.b.g;
import h.f.b.l;

public final class GroupInviteState implements af {
    private final a<InviteCardDetailInnerResponse> asyncDetail;
    private final a<AcceptInviteCardResponse> asyncJoin;
    private final boolean close;
    private final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group;

    static {
        Covode.recordClassIndex(64280);
    }

    public GroupInviteState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupInviteState copy$default(GroupInviteState groupInviteState, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar, a aVar2, a aVar3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = groupInviteState.group;
        }
        if ((i2 & 2) != 0) {
            aVar2 = groupInviteState.asyncDetail;
        }
        if ((i2 & 4) != 0) {
            aVar3 = groupInviteState.asyncJoin;
        }
        if ((i2 & 8) != 0) {
            z = groupInviteState.close;
        }
        return groupInviteState.copy(aVar, aVar2, aVar3, z);
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a component1() {
        return this.group;
    }

    public final a<InviteCardDetailInnerResponse> component2() {
        return this.asyncDetail;
    }

    public final a<AcceptInviteCardResponse> component3() {
        return this.asyncJoin;
    }

    public final boolean component4() {
        return this.close;
    }

    public final GroupInviteState copy(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar, a<InviteCardDetailInnerResponse> aVar2, a<AcceptInviteCardResponse> aVar3, boolean z) {
        l.d(aVar2, "");
        l.d(aVar3, "");
        return new GroupInviteState(aVar, aVar2, aVar3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInviteState)) {
            return false;
        }
        GroupInviteState groupInviteState = (GroupInviteState) obj;
        return l.a(this.group, groupInviteState.group) && l.a(this.asyncDetail, groupInviteState.asyncDetail) && l.a(this.asyncJoin, groupInviteState.asyncJoin) && this.close == groupInviteState.close;
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar = this.group;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<InviteCardDetailInnerResponse> aVar2 = this.asyncDetail;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<AcceptInviteCardResponse> aVar3 = this.asyncJoin;
        if (aVar3 != null) {
            i2 = aVar3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.close;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "GroupInviteState(group=" + this.group + ", asyncDetail=" + this.asyncDetail + ", asyncJoin=" + this.asyncJoin + ", close=" + this.close + ")";
    }

    public final a<InviteCardDetailInnerResponse> getAsyncDetail() {
        return this.asyncDetail;
    }

    public final a<AcceptInviteCardResponse> getAsyncJoin() {
        return this.asyncJoin;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a getGroup() {
        return this.group;
    }

    public GroupInviteState(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar, a<InviteCardDetailInnerResponse> aVar2, a<AcceptInviteCardResponse> aVar3, boolean z) {
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.group = aVar;
        this.asyncDetail = aVar2;
        this.asyncJoin = aVar3;
        this.close = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupInviteState(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar, a aVar2, a aVar3, boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : aVar, (i2 & 2) != 0 ? aq.f39400a : aVar2, (i2 & 4) != 0 ? aq.f39400a : aVar3, (i2 & 8) != 0 ? false : z);
    }
}
