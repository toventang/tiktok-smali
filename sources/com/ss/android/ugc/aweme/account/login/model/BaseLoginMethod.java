package com.ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.user.c;
import h.f.b.g;
import h.f.b.l;
import java.util.Date;

public class BaseLoginMethod {
    private Boolean allowOneKeyLogin;
    private CommonUserInfo commonUserInfo;
    private Date expires;
    private Boolean isFromReInstallNet;
    private Boolean isTransToNormal;
    private Long lastActiveTime;
    private LoginMethodName loginMethodName;
    private Long loginTime;
    private String uid;

    static {
        Covode.recordClassIndex(39135);
    }

    public BaseLoginMethod() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final Boolean getAllowOneKeyLogin() {
        return this.allowOneKeyLogin;
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final Long getLoginTime() {
        return this.loginTime;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean isFromReInstallNet() {
        return this.isFromReInstallNet;
    }

    public final Boolean isTransToNormal() {
        return this.isTransToNormal;
    }

    public final boolean isExpired() {
        return new Date().after(getExpires());
    }

    public final void setAllowOneKeyLogin(Boolean bool) {
        this.allowOneKeyLogin = bool;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo2) {
        this.commonUserInfo = commonUserInfo2;
    }

    public final void setFromReInstallNet(Boolean bool) {
        this.isFromReInstallNet = bool;
    }

    public final void setLastActiveTime(Long l2) {
        this.lastActiveTime = l2;
    }

    public final void setLoginTime(Long l2) {
        this.loginTime = l2;
    }

    public final void setTransToNormal(Boolean bool) {
        this.isTransToNormal = bool;
    }

    public final void allowOneKeyLogin(boolean z) {
        this.allowOneKeyLogin = Boolean.valueOf(z);
    }

    public void setExpires(Date date) {
        l.d(date, "");
        this.expires = date;
    }

    public void setLoginMethodName(LoginMethodName loginMethodName2) {
        l.d(loginMethodName2, "");
        this.loginMethodName = loginMethodName2;
    }

    public final void setUid(String str) {
        l.d(str, "");
        this.uid = str;
    }

    public void updateUserInfo(c cVar) {
        String str;
        l.d(cVar, "");
        if (!(!l.a((Object) cVar.f142345a, (Object) this.uid))) {
            String str2 = cVar.f142348d;
            String str3 = cVar.f142349e;
            CommonUserInfo commonUserInfo2 = this.commonUserInfo;
            if (commonUserInfo2 != null) {
                str = commonUserInfo2.getSecUid();
            } else {
                str = null;
            }
            this.commonUserInfo = new CommonUserInfo(str2, str3, str, null, 8, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateUserInfo(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod.updateUserInfo(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, Long l2, Long l3, Boolean bool, Boolean bool2, Boolean bool3) {
        l.d(str, "");
        l.d(loginMethodName2, "");
        l.d(date, "");
        this.uid = str;
        this.loginMethodName = loginMethodName2;
        this.commonUserInfo = commonUserInfo2;
        this.expires = date;
        this.loginTime = l2;
        this.lastActiveTime = l3;
        this.allowOneKeyLogin = bool;
        this.isFromReInstallNet = bool2;
        this.isTransToNormal = bool3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, Long l2, Long l3, Boolean bool, Boolean bool2, Boolean bool3, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? LoginMethodName.DEFAULT : loginMethodName2, (i2 & 4) != 0 ? CommonUserInfo.a.a() : commonUserInfo2, (i2 & 8) != 0 ? new Date(System.currentTimeMillis() + 2592000000L) : date, (i2 & 16) != 0 ? -1L : l2, (i2 & 32) != 0 ? -1L : l3, (i2 & 64) != 0 ? false : bool, (i2 & 128) != 0 ? false : bool2, (i2 & 256) != 0 ? false : bool3);
    }
}
