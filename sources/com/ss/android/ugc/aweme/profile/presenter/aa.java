package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.u;

public abstract class aa extends c<b<UserResponse>, s> {
    static {
        Covode.recordClassIndex(75297);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void a_(Exception exc) {
    }

    public final void a(User user) {
        if (this.f76397i != null && ((s) this.f76397i).b()) {
            user.getFollowingCount();
            if (ae.a(user)) {
                user.getFansCount();
            } else {
                user.getFollowerCount();
            }
            user.getTotalFavorited();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                user.getRemarkName();
                user.getStarBillboardRank();
                user.getBrandInfo();
            } else {
                user.getNickname();
                user.getStarBillboardRank();
                user.getBrandInfo();
            }
            user.getFollowStatus();
            user.getSignature();
            user.isLive();
            StoryUnreadUtils.hasUnreadStory(user);
            u.a(user);
            user.getAwemeCount();
            user.getRepostCount();
            user.getFavoritingCount();
            if (user.getOriginalMusician() != null) {
                user.getOriginalMusician().getMusicCount();
            }
            if (user.getEffectArtistDetail() != null) {
                user.getEffectArtistDetail().getTotal();
            }
            user.getEnterpriseVerifyReason();
            if (user.isAdVirtual()) {
                user.getNickname();
            } else if (TextUtils.isEmpty(user.getUniqueId())) {
                user.getShortId();
            } else {
                user.getUniqueId();
            }
            if (in.g(user)) {
                user.getFollowerStatus();
            } else {
                user.getFollowStatus();
                user.getFollowerStatus();
            }
            user.getCustomVerify();
            user.getProfileNgoStruct();
            user.getProfileBadge();
            user.getLivePushNotificationStatus();
        }
    }
}
