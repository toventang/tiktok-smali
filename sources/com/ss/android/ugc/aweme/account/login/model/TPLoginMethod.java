package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;

public final class TPLoginMethod extends BaseLoginMethod {
    private boolean loginFromFeedPage;
    private final String platform;
    private TPUserInfo userInfo;

    static {
        Covode.recordClassIndex(39142);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo) {
        this(str, str2, tPUserInfo, false, null, null, null, null, 248, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z) {
        this(str, str2, tPUserInfo, z, null, null, null, null, 240, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo) {
        this(str, str2, tPUserInfo, z, commonUserInfo, null, null, null, 224, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l2) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l2, null, null, 192, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l2, Long l3) {
        this(str, str2, tPUserInfo, z, commonUserInfo, l2, l3, null, 128, null);
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        l.d(tPUserInfo, "");
        this.userInfo = tPUserInfo;
    }

    @Override // com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
    public final void updateUserInfo(User user) {
        l.d(user, "");
        super.updateUserInfo(user);
        if (!(!l.a((Object) user.getUid(), (Object) getUid()))) {
            this.userInfo = TPUserInfo.a.a(user);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool) {
        super(str, LoginMethodName.THIRD_PARTY, commonUserInfo, null, l2, l3, bool, null, null, 392, null);
        l.d(str, "");
        l.d(str2, "");
        l.d(tPUserInfo, "");
        l.d(commonUserInfo, "");
        this.platform = str2;
        this.userInfo = tPUserInfo;
        this.loginFromFeedPage = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, Long l2, Long l3, Boolean bool, int i2, g gVar) {
        this(str, str2, tPUserInfo, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? CommonUserInfo.a.a() : commonUserInfo, (i2 & 32) != 0 ? -1L : l2, (i2 & 64) != 0 ? -1L : l3, (i2 & 128) != 0 ? false : bool);
    }
}
