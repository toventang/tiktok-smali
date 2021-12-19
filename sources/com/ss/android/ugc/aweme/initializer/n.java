package com.ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.model.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;

public final class n implements a {

    /* renamed from: a  reason: collision with root package name */
    private User f104743a;

    static {
        Covode.recordClassIndex(67149);
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String a() {
        return this.f104743a.getUniqueId();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String b() {
        return this.f104743a.getShortId();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String c() {
        return this.f104743a.getUid();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String d() {
        return this.f104743a.getSecUid();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean e() {
        return this.f104743a.isSecret();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final UrlModel f() {
        return this.f104743a.getAvatarThumb();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final UrlModel g() {
        return this.f104743a.getAvatarMedium();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String h() {
        return this.f104743a.getNickname();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final String i() {
        return in.e(this.f104743a);
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean k() {
        return this.f104743a.isPostDefaultDownloadSetting();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final int m() {
        return this.f104743a.getFollowerCount();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final int n() {
        return this.f104743a.getFollowStatus();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final int o() {
        return this.f104743a.getFollowerStatus();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean p() {
        return this.f104743a.isBlock;
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean q() {
        return this.f104743a.isBlocked();
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean j() {
        if (this.f104743a.getDownloadSetting() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.model.a
    public final boolean l() {
        if (this.f104743a.roomId > 0) {
            return true;
        }
        return false;
    }

    public n(User user) {
        this.f104743a = user;
    }
}
