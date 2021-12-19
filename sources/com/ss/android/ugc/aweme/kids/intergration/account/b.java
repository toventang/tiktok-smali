package com.ss.android.ugc.aweme.kids.intergration.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.kids.api.account.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b implements a {
    private final User user;

    static {
        Covode.recordClassIndex(68194);
    }

    public final User getUser() {
        return this.user;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final String getSecUserId() {
        return this.user.getSecUid();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final String getShortId() {
        return this.user.getShortId();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final String getUniqueId() {
        return this.user.getUniqueId();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final UrlModel getUserAvatar() {
        return this.user.getAvatarMedium();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final String getUserId() {
        return this.user.getUid();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final Integer getUserPeriod() {
        return Integer.valueOf(this.user.getUserPeriod());
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final UrlModel getUserThumb() {
        UrlModel avatarThumb = this.user.getAvatarThumb();
        l.b(avatarThumb, "");
        return avatarThumb;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.a.a
    public final Boolean isKidsMode() {
        boolean z = true;
        if (this.user.getAgeGatePostAction() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public b(User user2) {
        l.d(user2, "");
        this.user = user2;
    }
}
