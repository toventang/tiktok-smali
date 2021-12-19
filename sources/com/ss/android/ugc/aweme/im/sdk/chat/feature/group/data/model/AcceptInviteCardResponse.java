package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;

public final class AcceptInviteCardResponse extends BaseResponse {
    @c(a = "error")
    private final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c inviteError;
    @c(a = "invitee_group_status")
    private final Integer inviteeGroupStatus;

    static {
        Covode.recordClassIndex(64277);
    }

    public AcceptInviteCardResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AcceptInviteCardResponse copy$default(AcceptInviteCardResponse acceptInviteCardResponse, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = acceptInviteCardResponse.inviteError;
        }
        if ((i2 & 2) != 0) {
            num = acceptInviteCardResponse.inviteeGroupStatus;
        }
        return acceptInviteCardResponse.copy(cVar, num);
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c component1() {
        return this.inviteError;
    }

    public final Integer component2() {
        return this.inviteeGroupStatus;
    }

    public final AcceptInviteCardResponse copy(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num) {
        return new AcceptInviteCardResponse(cVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptInviteCardResponse)) {
            return false;
        }
        AcceptInviteCardResponse acceptInviteCardResponse = (AcceptInviteCardResponse) obj;
        return l.a(this.inviteError, acceptInviteCardResponse.inviteError) && l.a(this.inviteeGroupStatus, acceptInviteCardResponse.inviteeGroupStatus);
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar = this.inviteError;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Integer num = this.inviteeGroupStatus;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AcceptInviteCardResponse(inviteError=" + this.inviteError + ", inviteeGroupStatus=" + this.inviteeGroupStatus + ")";
    }

    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public AcceptInviteCardResponse(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num) {
        this.inviteError = cVar;
        this.inviteeGroupStatus = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AcceptInviteCardResponse(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : cVar, (i2 & 2) != 0 ? null : num);
    }
}
