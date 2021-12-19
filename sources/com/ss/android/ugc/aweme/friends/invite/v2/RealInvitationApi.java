package com.ss.android.ugc.aweme.friends.invite.v2;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface RealInvitationApi {
    static {
        Covode.recordClassIndex(61543);
    }

    @f(a = "/tiktok/social/invitation/config/get/v1")
    t<a> getInvitationConfig(@l.b.t(a = "source") String str);

    @f(a = "/tiktok/social/invitation/get/v1")
    t<b> getInvitationInfo(@l.b.t(a = "invitation_code") String str, @l.b.t(a = "inviter_uid") String str2, @l.b.t(a = "inviter_sec_uid") String str3);
}
