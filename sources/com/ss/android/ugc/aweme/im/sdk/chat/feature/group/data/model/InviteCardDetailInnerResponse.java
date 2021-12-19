package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a;
import h.f.b.g;
import h.f.b.l;

public final class InviteCardDetailInnerResponse extends BaseResponse {
    @c(a = "group")
    private final a group;
    @c(a = "error")
    private final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c inviteError;
    @c(a = "invitee_group_status")
    private final Integer inviteeGroupStatus;
    @c(a = "inviter_id")
    private final Long inviterId;
    @c(a = "inviter_name")
    private final String inviterName;

    static {
        Covode.recordClassIndex(64278);
    }

    public InviteCardDetailInnerResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InviteCardDetailInnerResponse copy$default(InviteCardDetailInnerResponse inviteCardDetailInnerResponse, a aVar, Long l2, String str, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = inviteCardDetailInnerResponse.group;
        }
        if ((i2 & 2) != 0) {
            l2 = inviteCardDetailInnerResponse.inviterId;
        }
        if ((i2 & 4) != 0) {
            str = inviteCardDetailInnerResponse.inviterName;
        }
        if ((i2 & 8) != 0) {
            cVar = inviteCardDetailInnerResponse.inviteError;
        }
        if ((i2 & 16) != 0) {
            num = inviteCardDetailInnerResponse.inviteeGroupStatus;
        }
        return inviteCardDetailInnerResponse.copy(aVar, l2, str, cVar, num);
    }

    public final a component1() {
        return this.group;
    }

    public final Long component2() {
        return this.inviterId;
    }

    public final String component3() {
        return this.inviterName;
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c component4() {
        return this.inviteError;
    }

    public final Integer component5() {
        return this.inviteeGroupStatus;
    }

    public final InviteCardDetailInnerResponse copy(a aVar, Long l2, String str, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num) {
        return new InviteCardDetailInnerResponse(aVar, l2, str, cVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteCardDetailInnerResponse)) {
            return false;
        }
        InviteCardDetailInnerResponse inviteCardDetailInnerResponse = (InviteCardDetailInnerResponse) obj;
        return l.a(this.group, inviteCardDetailInnerResponse.group) && l.a(this.inviterId, inviteCardDetailInnerResponse.inviterId) && l.a(this.inviterName, inviteCardDetailInnerResponse.inviterName) && l.a(this.inviteError, inviteCardDetailInnerResponse.inviteError) && l.a(this.inviteeGroupStatus, inviteCardDetailInnerResponse.inviteeGroupStatus);
    }

    public final int hashCode() {
        a aVar = this.group;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Long l2 = this.inviterId;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.inviterName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar = this.inviteError;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Integer num = this.inviteeGroupStatus;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode4 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteCardDetailInnerResponse(group=" + this.group + ", inviterId=" + this.inviterId + ", inviterName=" + this.inviterName + ", inviteError=" + this.inviteError + ", inviteeGroupStatus=" + this.inviteeGroupStatus + ")";
    }

    public final a getGroup() {
        return this.group;
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public final Long getInviterId() {
        return this.inviterId;
    }

    public final String getInviterName() {
        return this.inviterName;
    }

    public InviteCardDetailInnerResponse(a aVar, Long l2, String str, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num) {
        this.group = aVar;
        this.inviterId = l2;
        this.inviterName = str;
        this.inviteError = cVar;
        this.inviteeGroupStatus = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteCardDetailInnerResponse(a aVar, Long l2, String str, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : aVar, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : cVar, (i2 & 16) == 0 ? num : null);
    }
}
