package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class InteractionTagInfoKt {
    static {
        Covode.recordClassIndex(59407);
    }

    public static final MutualUser toMutualUser(InteractionTagUserInfo interactionTagUserInfo) {
        String str = "";
        l.d(interactionTagUserInfo, str);
        String uid = interactionTagUserInfo.getUid();
        if (uid == null) {
            uid = str;
        }
        String nickname = interactionTagUserInfo.getNickname();
        if (nickname != null) {
            str = nickname;
        }
        return new MutualUser(uid, str, interactionTagUserInfo.getAvatarThumb());
    }

    public static final User toUser(InteractionTagUserInfo interactionTagUserInfo) {
        l.d(interactionTagUserInfo, "");
        User user = new User();
        user.setUid(interactionTagUserInfo.getUid());
        user.setUniqueId(interactionTagUserInfo.getUniqueId());
        user.setNickname(interactionTagUserInfo.getNickname());
        user.setAvatarThumb(interactionTagUserInfo.getAvatarThumb());
        user.setFollowStatus(interactionTagUserInfo.getFollowStatus());
        user.setFollowerStatus(interactionTagUserInfo.getFollowerStatus());
        boolean z = true;
        if (interactionTagUserInfo.isPrivateAccount() != 1) {
            z = false;
        }
        user.setPrivateAccount(z);
        user.setCustomVerify(interactionTagUserInfo.getCustomVerify());
        user.setEnterpriseVerifyReason(interactionTagUserInfo.getEnterpriseVerifyReason());
        return user;
    }
}
