package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.ae;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.d;
import com.bytedance.android.livesdk.model.g;
import com.bytedance.android.livesdk.model.z;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(3632);
    }

    boolean childrenManagerForbidWalletFunctions();

    d getAnchorInfo();

    z getAnchorLevel();

    g getAuthenticationInfo();

    String getAutoGraph();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getCreateTime();

    String getDisplayId();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    long getId();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    User.b getOwnRoom();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    int getStatus();

    List<User> getTopFans();

    int getTopVipNo();

    ba getUserAttr();

    List<ImageModel> getUserBadges();

    ae getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isFollowing();

    boolean isVerified();

    void setFollowStatus(int i2);

    void setUserAttr(ba baVar);

    public enum a {
        Login,
        Logout,
        Update;

        static {
            Covode.recordClassIndex(3633);
        }
    }
}
