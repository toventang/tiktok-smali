package com.ss.android.ugc.aweme.user.c;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.commerce.f;
import com.ss.android.ugc.aweme.music.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dw;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f142352a = d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "aweme_user", 0);

    static {
        Covode.recordClassIndex(93107);
    }

    public final User a() {
        User user = new User();
        user.setUid(this.f142352a.getString("uid", ""));
        user.setShortId(this.f142352a.getString("aweme_id", ""));
        user.setNickname(this.f142352a.getString("nickname", ""));
        user.setSignature(this.f142352a.getString("signature", ""));
        user.setFollowStatus(this.f142352a.getInt("allow_status", 0));
        user.setAwemeCount(this.f142352a.getInt("aweme_count", 0));
        user.setFollowingCount(this.f142352a.getInt("following_count", 0));
        user.setFollowerCount(this.f142352a.getInt("follower_count", 0));
        user.setTotalFavorited((long) this.f142352a.getInt("total_favorite", 0));
        user.setFavoritingCount(this.f142352a.getInt("favoriting_count", 0));
        user.setAllowStatus(this.f142352a.getInt("allow_status", 1));
        user.setRegisterStatus(this.f142352a.getInt("register_status", 0));
        user.setHideSearch(this.f142352a.getBoolean("hide_search", false));
        user.setLoginPlatform(this.f142352a.getInt("login_platform", 0));
        user.setLiveAgreement(this.f142352a.getInt("live_agreement", 0));
        user.setCustomVerify(this.f142352a.getString("custom_verify", ""));
        user.setUniqueId(this.f142352a.getString("unique_id", ""));
        user.setBindPhone(this.f142352a.getString("bind_phone", ""));
        user.setPhoneBinded(this.f142352a.getBoolean("is_phone_bound", false));
        user.setIsCreater(this.f142352a.getBoolean("is_creater", false));
        user.setHasEmail(this.f142352a.getBoolean("has_email", false));
        user.setCreateTime(Long.valueOf(this.f142352a.getLong("create_time", 0)));
        user.setNeedRecommend(this.f142352a.getBoolean("show_recommend", false));
        user.setShowImageBubble(this.f142352a.getBoolean("show_image_bubble", false));
        user.setRegisterTime(this.f142352a.getLong("register_time", 0));
        user.setHasFacebookToken(false);
        user.setHasTwitterToken(false);
        user.setFbExpireTime(0);
        user.setTwExpireTime(0);
        user.setYoutubeExpireTime(0);
        user.setHasYoutubeToken(false);
        user.setShieldFollowNotice(0);
        user.setShieldDiggNotice(0);
        user.setShieldCommentNotice(0);
        user.setInsId(this.f142352a.getString("ins_id", ""));
        user.setTwitterId(this.f142352a.getString("twitter_id", ""));
        user.setTwitterName(this.f142352a.getString("twitter_name", ""));
        user.setYoutubeChannelId(this.f142352a.getString("youtube_channel_id", ""));
        user.setYoutubeChannelTitle(this.f142352a.getString("youtube_channel_title", ""));
        user.setAuthorityStatus(this.f142352a.getLong("authority_status", 0));
        user.setWithCommerceEntry(this.f142352a.getBoolean("with_commerce_enty", false));
        user.setWithNewGoods(this.f142352a.getBoolean("with_new_goods", false));
        user.setHasOrders(this.f142352a.getBoolean("user_has_orders", false));
        user.setVerificationType(this.f142352a.getInt("verification_type", 0));
        user.setCommerceUserLevel(this.f142352a.getInt("commerce_user_level", 0));
        user.setEnterpriseVerifyReason(this.f142352a.getString("enterprise_verify", ""));
        user.setSecret(this.f142352a.getBoolean("secret", false));
        user.setHandleModified(0);
        user.setCommerceUserLevel(this.f142352a.getInt("commerce_user_level", 0));
        user.setDisciplineMember(this.f142352a.getBoolean("is_discipline_member", false));
        user.setShowImageBubble(this.f142352a.getBoolean("show_image_bubble", false));
        user.setCommentSetting(this.f142352a.getInt("comment_setting", 0));
        user.setRegisterTime(this.f142352a.getLong("register_time", 0));
        user.setRegion(this.f142352a.getString("region", ""));
        try {
            user.setAvatarThumb((UrlModel) dw.a(this.f142352a.getString("avatar_thumb", ""), UrlModel.class));
            user.setAvatarMedium((UrlModel) dw.a(this.f142352a.getString("avatar_medium", ""), UrlModel.class));
            user.setAvatarLarger((UrlModel) dw.a(this.f142352a.getString("avatar_larger", ""), UrlModel.class));
            user.setShareInfo((ShareInfo) dw.a(this.f142352a.getString("share_info", ""), ShareInfo.class));
            user.setOriginalMusician((o) dw.a(this.f142352a.getString("original_musician", ""), o.class));
            user.setCommerceInfo((f) dw.a(this.f142352a.getString("commerce_info", ""), f.class));
        } catch (Throwable unused) {
            SharedPreferences.Editor edit = this.f142352a.edit();
            edit.putString("share_info", "");
            edit.putString("avatar_larger", "");
            edit.putString("avatar_thumb", "");
            edit.putString("avatar_medium", "");
            com.bytedance.common.utility.e.a.a(edit);
        }
        return user;
    }
}
