package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;

final class s {
    static {
        Covode.recordClassIndex(69528);
    }

    private static ImageModel a(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.width = urlModel.getWidth();
        imageModel.height = urlModel.getHeight();
        imageModel.setUri(urlModel.getUri());
        imageModel.setUrls(urlModel.getUrlList());
        return imageModel;
    }

    static User a(com.ss.android.ugc.aweme.profile.model.User user) {
        String uid;
        if (user == null) {
            return null;
        }
        User user2 = new User();
        user2.setNickName(user.getNickname());
        user2.setAvatarThumb(a(user.getAvatarThumb()));
        user2.setAvatarMedium(a(user.getAvatarMedium()));
        user2.setAvatarLarge(a(user.getAvatarLarger()));
        user2.setIdStr(user.getUid());
        String str = "0";
        if (user.getUid() == null) {
            uid = str;
        } else {
            uid = user.getUid();
        }
        user2.setId(Long.parseLong(uid));
        if (user.getSecUid() != null) {
            str = user.getSecUid();
        }
        user2.setSecUid(str);
        user2.setFollowStatus(user.getFollowStatus());
        User.sSubPermission = user.isEnableSubscription();
        return user2;
    }
}
