package com.ss.android.ugc.aweme.friends.invite.v2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import f.a.t;
import h.f.b.l;
import l.b.f;

public final class InvitationApi implements RealInvitationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final InvitationApi f96912a = new InvitationApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ RealInvitationApi f96913b;

    @Override // com.ss.android.ugc.aweme.friends.invite.v2.RealInvitationApi
    @f(a = "/tiktok/social/invitation/config/get/v1")
    public final t<a> getInvitationConfig(@l.b.t(a = "source") String str) {
        l.d(str, "");
        return this.f96913b.getInvitationConfig(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.invite.v2.RealInvitationApi
    @f(a = "/tiktok/social/invitation/get/v1")
    public final t<b> getInvitationInfo(@l.b.t(a = "invitation_code") String str, @l.b.t(a = "inviter_uid") String str2, @l.b.t(a = "inviter_sec_uid") String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return this.f96913b.getInvitationInfo(str, str2, str3);
    }

    static {
        Covode.recordClassIndex(61501);
    }

    private InvitationApi() {
        Object a2 = RetrofitFactory.a().b(Api.f66569d).d().a(RealInvitationApi.class);
        l.b(a2, "");
        this.f96913b = (RealInvitationApi) a2;
    }
}
