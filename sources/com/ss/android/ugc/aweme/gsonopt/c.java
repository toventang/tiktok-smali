package com.ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.commerce.h;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.music.o;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.HonorStruct;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.ss.android.ugc.aweme.profile.model.LiveAnchorInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.UrgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAwemeCover;
import com.ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.ss.android.ugc.aweme.profile.model.UserHonor;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.ss.android.ugc.aweme.profile.model.VideoCover;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;

public final class c extends a {
    static {
        Covode.recordClassIndex(63121);
    }

    public c(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.gsonopt.a
    public final b a(String str) {
        switch (str.hashCode()) {
            case -2141396406:
                if (str.equals("item_list")) {
                    return new b("recommendAwemeItems", this.f99081a.a((a) new l()), false);
                }
                return null;
            case -2140023879:
                if (str.equals("vcd_schema_url")) {
                    return new b("vcdSchemaUrl", this.f99081a.a(String.class), false);
                }
                return null;
            case -2120173952:
                if (str.equals("r_fans_group_info")) {
                    return new b("rFansGroupInfo", this.f99081a.a(RocketFansGroupInfo.class), false);
                }
                return null;
            case -2107390546:
                if (str.equals("follower_count")) {
                    return new b("followerCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -2095871955:
                if (str.equals("friend_type_str")) {
                    return new b("friendTypeStr", this.f99081a.a(String.class), false);
                }
                return null;
            case -2084946265:
                if (str.equals("school_visible")) {
                    return new b("schoolInfoShowRange", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -2084080173:
                if (str.equals("constellation")) {
                    return new b("constellation", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -2000946467:
                if (str.equals("search_highlight")) {
                    return new b("mHighlightInfoList", this.f99081a.a((a) new k()), false);
                }
                return null;
            case -1990709956:
                if (str.equals("social_data")) {
                    return new b("socialData", this.f99081a.a(SocialDataStruct.class), false);
                }
                return null;
            case -1990548928:
                if (str.equals("social_info")) {
                    return new b("socialInfo", this.f99081a.a(String.class), false);
                }
                return null;
            case -1958725841:
                if (str.equals("hide_shoot_button")) {
                    return new b("hideShootButton", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1953654686:
                if (str.equals("age_gate_info")) {
                    return new b("ageGateInfo", this.f99081a.a(AgeGateInfo.class), false);
                }
                return null;
            case -1953331583:
                if (str.equals("age_gate_time")) {
                    return new b("ageGateTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case -1948583756:
                if (str.equals("verify_info")) {
                    return new b("verifyInfo", this.f99081a.a(String.class), false);
                }
                return null;
            case -1935004580:
                if (str.equals("shield_digg_notice")) {
                    return new b("shieldDiggNotice", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1885024190:
                if (str.equals("avatar_update_reminder")) {
                    return new b("avatarUpdateReminder", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1881328305:
                if (str.equals("recommend_score")) {
                    return new b("recommendScore", this.f99081a.a(Double.class), true);
                }
                return null;
            case -1809107271:
                if (str.equals("star_billboard_rank")) {
                    return new b("starBillboardRank", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1801198654:
                if (str.equals("mutual_relation_avatars")) {
                    return new b("mutualRelationAvatars", this.f99081a.a((a) new d()), false);
                }
                return null;
            case -1789714431:
                if (str.equals("pronouns_info")) {
                    return new b("mPronounsInfo", this.f99081a.a(UserPronounsInfo.class), false);
                }
                return null;
            case -1788288754:
                if (str.equals("share_info")) {
                    return new b("shareInfo", this.f99081a.a(ShareInfo.class), false);
                }
                return null;
            case -1739027736:
                if (str.equals("advance_feature_item_order")) {
                    return new b("userAdvancedFeaturesOrder", this.f99081a.a((a) new e()), false);
                }
                return null;
            case -1729386817:
                if (str.equals("effect_detail")) {
                    return new b("effectArtistDetail", this.f99081a.a(EffectArtistDetail.class), false);
                }
                return null;
            case -1724546052:
                if (str.equals("description")) {
                    return new b("adAuthorDesc", this.f99081a.a(String.class), false);
                }
                return null;
            case -1700983166:
                if (str.equals("is_phone_binded")) {
                    return new b("isPhoneBinded", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1687280775:
                if (str.equals("youtube_refresh_token")) {
                    return new b("youTubeRefreshToken", this.f99081a.a(String.class), false);
                }
                return null;
            case -1674581204:
                if (str.equals("biz_account_info")) {
                    return new b("bizAccountInfo", this.f99081a.a(d.class), false);
                }
                return null;
            case -1621888634:
                if (str.equals("general_permission")) {
                    return new b("mGeneralPermission", this.f99081a.a(GeneralPermission.class), false);
                }
                return null;
            case -1618184771:
                if (str.equals("video_icon")) {
                    return new b("avatarVideoUri", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case -1613589672:
                if (str.equals("language")) {
                    return new b("language", this.f99081a.a(String.class), false);
                }
                return null;
            case -1604804401:
                if (str.equals("anchor_schedule_guide_txt")) {
                    return new b("anchorScheduleGuideTxt", this.f99081a.a(String.class), false);
                }
                return null;
            case -1596658159:
                if (str.equals("duet_setting")) {
                    return new b("duetSetting", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1571613217:
                if (str.equals("cancel_type")) {
                    return new b("cancelType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1554168724:
                if (str.equals("enterprise_verify_reason")) {
                    return new b("enterpriseVerifyReason", this.f99081a.a(String.class), false);
                }
                return null;
            case -1544567816:
                if (str.equals("anchor_info")) {
                    return new b("liveAnchorInfo", this.f99081a.a(LiveAnchorInfo.class), false);
                }
                return null;
            case -1540093218:
                if (str.equals("verification_type")) {
                    return new b("verificationType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1515073182:
                if (str.equals("watch_status")) {
                    return new b("watchStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1515021930:
                if (str.equals("pro_account_tcm_red_dot")) {
                    return new b("proAccountTcmRedDot", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1509539404:
                if (str.equals("ad_cover_title")) {
                    return new b("adCoverTitle", this.f99081a.a(AdCoverTitle.class), false);
                }
                return null;
            case -1487939668:
                if (str.equals("xmas_unlock_count")) {
                    return new b("xmasUnlockCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1481385228:
                if (str.equals("hide_following_follower_list")) {
                    return new b("hideFollowingFollowerList", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1455607391:
                if (str.equals("display_qna_on_profile")) {
                    return new b("displayQnaOnProfile", this.f99081a.a(Integer.class), false);
                }
                return null;
            case -1425754930:
                if (str.equals("live_commerce")) {
                    return new b("liveCommerce", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1425607570:
                if (str.equals("notify_minor_private_policy")) {
                    return new b("notifyPrivatePolicy", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1401557392:
                if (str.equals("iso_country_code")) {
                    return new b("isoCountryCode", this.f99081a.a(String.class), false);
                }
                return null;
            case -1390325818:
                if (str.equals("register_from")) {
                    return new b("registerFrom", this.f99081a.a(String.class), false);
                }
                return null;
            case -1389917463:
                if (str.equals("register_time")) {
                    return new b("registerTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case -1385872638:
                if (str.equals("with_shop_entry")) {
                    return new b("withShopEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1360830533:
                if (str.equals("followers_detail")) {
                    return new b("followerDetailList", this.f99081a.a((a) new i()), false);
                }
                return null;
            case -1315374323:
                if (str.equals("total_favorited")) {
                    return new b("totalFavorited", this.f99081a.a(Long.class), true);
                }
                return null;
            case -1310057834:
                if (str.equals("post_default_download_setting")) {
                    return new b("postDefaultDownloadSetting", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1299743763:
                if (str.equals("enable_direct_message")) {
                    return new b("enableDirectMessage", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1294599087:
                if (str.equals("white_cover_url")) {
                    return new b("whiteCoverUrl", this.f99081a.a((a) new d()), false);
                }
                return null;
            case -1291329255:
                if (str.equals("events")) {
                    return new b("mLiveEventStructList", this.f99081a.a((a) new g()), false);
                }
                return null;
            case -1264538886:
                if (str.equals("verification_badge_type")) {
                    return new b("verificationBadgeType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1225133476:
                if (str.equals("is_private_account")) {
                    return new b("isPrivateAccount", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1211434241:
                if (str.equals("playlist_status")) {
                    return new b("mixListStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1183798516:
                if (str.equals("ins_id")) {
                    return new b("insId", this.f99081a.a(String.class), false);
                }
                return null;
            case -1178642247:
                if (str.equals("comment_filter_status")) {
                    return new b("commentFilterStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1136538083:
                if (str.equals("force_private_account")) {
                    return new b("forcePrivateAccount", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1118564934:
                if (str.equals("collect_count")) {
                    return new b("collectCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1118396397:
                if (str.equals("shoutouts_status")) {
                    return new b("shoutoutsStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -1113131005:
                if (str.equals("message_chat_entry")) {
                    return new b("showMessageButton", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1102635940:
                if (str.equals("profile_pv")) {
                    return new b("profilePv", this.f99081a.a(Long.class), true);
                }
                return null;
            case -1087070801:
                if (str.equals("type_label")) {
                    return new b("typeLabels", this.f99081a.a(long[].class), false);
                }
                return null;
            case -1073723392:
                if (str.equals("life_story_block")) {
                    return new b("storyBlockInfo", this.f99081a.a(StoryBlockInfo.class), false);
                }
                return null;
            case -1067878258:
                if (str.equals("room_data")) {
                    return new b("roomData", this.f99081a.a(String.class), false);
                }
                return null;
            case -1065227554:
                if (str.equals("douplus_old_user")) {
                    return new b("isOldDouplusUser", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1055767415:
                if (str.equals("can_set_geofencing")) {
                    return new b("canSetGeoFencing", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -1054604988:
                if (str.equals("enterprise_user_info")) {
                    return new b("enterpriseUserInfo", a(new StringJsonAdapterFactory(), h.class), false);
                }
                return null;
            case -1028675226:
                if (str.equals("bio_permission")) {
                    return new b("bioPermission", this.f99081a.a(UserBioPermission.class), false);
                }
                return null;
            case -987485392:
                if (str.equals("province")) {
                    return new b("province", this.f99081a.a(String.class), false);
                }
                return null;
            case -980688722:
                if (str.equals("search_user_desc")) {
                    return new b("searchUserDesc", this.f99081a.a(String.class), false);
                }
                return null;
            case -980394840:
                if (str.equals("search_user_name")) {
                    return new b("searchUserName", this.f99081a.a(String.class), false);
                }
                return null;
            case -970201715:
                if (str.equals("tab_settings")) {
                    return new b("tabSetting", this.f99081a.a(TabSetting.class), false);
                }
                return null;
            case -955713949:
                if (str.equals("third_name")) {
                    return new b("thirdName", this.f99081a.a(String.class), false);
                }
                return null;
            case -935743551:
                if (str.equals("with_item_commerce_entry")) {
                    return new b("withItemCommerceEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -934795532:
                if (str.equals("region")) {
                    return new b("region", this.f99081a.a(String.class), false);
                }
                return null;
            case -906277200:
                if (str.equals("secret")) {
                    return new b("secret", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -898399019:
                if (str.equals("urge_detail")) {
                    return new b("urgeDetail", this.f99081a.a(UrgeStruct.class), false);
                }
                return null;
            case -880202922:
                if (str.equals("avatar_decoration")) {
                    return new b("avatarDecoration", this.f99081a.a(AvatarDecoration.class), false);
                }
                return null;
            case -877946734:
                if (str.equals("should_write_impr")) {
                    return new b("shouldWriteImpr", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -874569851:
                if (str.equals("has_facebook_token")) {
                    return new b("hasFacebookToken", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -859563817:
                if (str.equals("twitter_name")) {
                    return new b("twitterName", this.f99081a.a(String.class), false);
                }
                return null;
            case -813930103:
                if (str.equals("rec_type")) {
                    return new b("recType", this.f99081a.a(String.class), false);
                }
                return null;
            case -812763377:
                if (str.equals("prevent_download")) {
                    return new b("preventDownload", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -801606716:
                if (str.equals("homepage_bottom_toast")) {
                    return new b("homepageBottomToast", this.f99081a.a((a) new f()), false);
                }
                return null;
            case -800221974:
                if (str.equals("age_gate_action")) {
                    return new b("ageGateAction", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -751091740:
                if (str.equals("content_language_already_popup")) {
                    return new b("isContentLanguageDialogShown", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -745704582:
                if (str.equals("profile_tab_type")) {
                    return new b("tabType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -720364372:
                if (str.equals("need_points")) {
                    return new b("needPoints", this.f99081a.a((a) new n()), false);
                }
                return null;
            case -712365810:
                if (str.equals("mutual_relation_num")) {
                    return new b("mutualRelationNumber", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -712360670:
                if (str.equals("mutual_relation_tag")) {
                    return new b("mutualRelationTag", this.f99081a.a(String.class), false);
                }
                return null;
            case -690358626:
                if (str.equals("youtube_last_refresh_time")) {
                    return new b("youTubeLastRefreshTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case -688758211:
                if (str.equals("avatar_larger")) {
                    return new b("avatarLarger", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case -656849637:
                if (str.equals("avatar_medium")) {
                    return new b("avatarMedium", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case -652446311:
                if (str.equals("download_setting")) {
                    return new b("downloadSetting", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -624934883:
                if (str.equals("video_gift_status")) {
                    return new b("videoGiftStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -601407516:
                if (str.equals("block_status")) {
                    return new b("blockStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -571048290:
                if (str.equals("with_douplus_entry")) {
                    return new b("withDouplusEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -568807568:
                if (str.equals("avatar_thumb")) {
                    return new b("avatarThumb", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case -538310583:
                if (str.equals("unique_id")) {
                    return new b("uniqueId", this.f99081a.a(String.class), false);
                }
                return null;
            case -526326590:
                if (str.equals("stitch_setting")) {
                    return new b("stitchSetting", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -515940741:
                if (str.equals("notify_private_account")) {
                    return new b("notifyPrivateAccount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -508975030:
                if (str.equals("show_effect_list")) {
                    return new b("showEffectList", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -502553757:
                if (str.equals("honor_info")) {
                    return new b("honorStruct", this.f99081a.a(HonorStruct.class), false);
                }
                return null;
            case -493574096:
                if (str.equals("create_time")) {
                    return new b("createTime", this.f99081a.a(Long.class), false);
                }
                return null;
            case -485378688:
                if (str.equals("pay_grade")) {
                    return new b("userHonor", this.f99081a.a(UserHonor.class), false);
                }
                return null;
            case -481549195:
                if (str.equals("registerStatus")) {
                    return new b("registerStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -479476846:
                if (str.equals("commerce_info")) {
                    return new b("commerceInfo", this.f99081a.a(com.ss.android.ugc.aweme.commerce.f.class), false);
                }
                return null;
            case -442503373:
                if (str.equals("follower_status")) {
                    return new b("followerStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -417519034:
                if (str.equals("name_field")) {
                    return new b("nameField", this.f99081a.a(String.class), false);
                }
                return null;
            case -409569971:
                if (str.equals("sprint_support_user_info")) {
                    return new b("sprintSupportUserInfo", this.f99081a.a(HotSearchSprintStruct.class), false);
                }
                return null;
            case -342504514:
                if (str.equals("short_id")) {
                    return new b("shortId", this.f99081a.a(String.class), false);
                }
                return null;
            case -290756696:
                if (str.equals("education")) {
                    return new b("education", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -290620080:
                if (str.equals("hot_list")) {
                    return new b("mHotListStruct", this.f99081a.a(HotListStruct.class), false);
                }
                return null;
            case -271209848:
                if (str.equals("show_artist_playlist")) {
                    return new b("showArtistPlaylist", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -255577734:
                if (str.equals("video_unread_info")) {
                    return new b("unReadVideoInfo", this.f99081a.a(UnReadVideoInfo.class), false);
                }
                return null;
            case -249774923:
                if (str.equals("user_period")) {
                    return new b("userPeriod", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -241577870:
                if (str.equals("complete_profile_guide_strategy")) {
                    return new b("completeProfileGuideStrategy", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -218847220:
                if (str.equals("mixListNum")) {
                    return new b("mixListNum", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -200000462:
                if (str.equals("profile_completion")) {
                    return new b("profileCompletion", this.f99081a.a(Float.class), true);
                }
                return null;
            case -180337243:
                if (str.equals("bio_email")) {
                    return new b("bioEmail", this.f99081a.a(String.class), false);
                }
                return null;
            case -170313865:
                if (str.equals("bio_phone")) {
                    return new b("bioPhone", this.f99081a.a(String.class), false);
                }
                return null;
            case -107434568:
                if (str.equals("bio_url")) {
                    return new b("bioUrl", this.f99081a.a(String.class), false);
                }
                return null;
            case -89527382:
                if (str.equals("with_star_atlas_entry")) {
                    return new b("withStarAtlasEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -79766337:
                if (str.equals("original_musician")) {
                    return new b("originalMusician", this.f99081a.a(o.class), false);
                }
                return null;
            case -75701030:
                if (str.equals("mAtType")) {
                    return new b("mAtType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -74098991:
                if (str.equals("youtube_expire_time")) {
                    return new b("youtubeExpireTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case -72622451:
                if (str.equals("user_canceled")) {
                    return new b("userCancelled", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -72255446:
                if (str.equals("contacts_sync_status")) {
                    return new b("contactsSyncStatus", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case -68630535:
                if (str.equals("room_type_tag")) {
                    return new b("roomTypeTag", this.f99081a.a(String.class), false);
                }
                return null;
            case -65183979:
                if (str.equals("forward_count")) {
                    return new b("repostCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case -58995097:
                if (str.equals("twitter_id")) {
                    return new b("twitterId", this.f99081a.a(String.class), false);
                }
                return null;
            case -18487744:
                if (str.equals("avatar_pendant_larger")) {
                    return new b("avatarPendantLarger", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case 112909:
                if (str.equals("rid")) {
                    return new b("requestId", this.f99081a.a(String.class), false);
                }
                return null;
            case 115792:
                if (str.equals("uid")) {
                    return new b("uid", this.f99081a.a(String.class), false);
                }
                return null;
            case 3053931:
                if (str.equals("city")) {
                    return new b("cityName", this.f99081a.a(String.class), false);
                }
                return null;
            case 11461418:
                if (str.equals("show_user_ban_dialog")) {
                    return new b("showUserBanDialog", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 13420830:
                if (str.equals("avatar_pendant_medium")) {
                    return new b("avatarPendantMedium", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case 13790513:
                if (str.equals("normal_top_comment_permission")) {
                    return new b("normalTopCommentPermission", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 17069893:
                if (str.equals("hide_search")) {
                    return new b("hideSearch", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 34400533:
                if (str.equals("with_commerce_enterprise_tab_entry")) {
                    return new b("withCommerceEnterpriseTabEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 40914635:
                if (str.equals("analytics_status")) {
                    return new b("hasAnalyticsMetrics", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 50511102:
                if (str.equals("category")) {
                    return new b("category", this.f99081a.a(String.class), false);
                }
                return null;
            case 57304503:
                if (str.equals("has_email")) {
                    return new b("hasEmail", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 70438958:
                if (str.equals("friend_count")) {
                    return new b("friendCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 70690926:
                if (str.equals("nickname")) {
                    return new b("nickname", this.f99081a.a(String.class), false);
                }
                return null;
            case 96619420:
                if (str.equals("email")) {
                    return new b("email", this.f99081a.a(String.class), false);
                }
                return null;
            case 106772540:
                if (str.equals("unique_id_modify_time")) {
                    return new b("unique_id_modify_time", this.f99081a.a(Long.class), true);
                }
                return null;
            case 108801336:
                if (str.equals("is_block")) {
                    return new b("isBlock", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 109542336:
                if (str.equals("is_email_verified")) {
                    return new b("isEmailVerified", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 112524457:
                if (str.equals("favoriting_count")) {
                    return new b("favoritingCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 211298865:
                if (str.equals("tw_expire_time")) {
                    return new b("twExpireTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case 240621757:
                if (str.equals("user_rate_remind_info")) {
                    return new b("userRateRemindInfo", this.f99081a.a(UserRateRemindInfo.class), false);
                }
                return null;
            case 286660723:
                if (str.equals("youtube_channel_id")) {
                    return new b("youtubeChannelId", this.f99081a.a(String.class), false);
                }
                return null;
            case 288961422:
                if (str.equals("district")) {
                    return new b("district", this.f99081a.a(String.class), false);
                }
                return null;
            case 299444286:
                if (str.equals("commerce_user_info")) {
                    return new b("commerceUserInfo", this.f99081a.a(CommerceUserInfo.class), false);
                }
                return null;
            case 339324311:
                if (str.equals("user_mode")) {
                    return new b("userMode", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 339460308:
                if (str.equals("user_rate")) {
                    return new b("userRate", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 346692344:
                if (str.equals("predicted_age_group")) {
                    return new b("predictedAgeGroup", this.f99081a.a(String.class), false);
                }
                return null;
            case 347638748:
                if (str.equals("is_ad_fake")) {
                    return new b("isAdFake", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 387319941:
                if (str.equals("quick_shop_info")) {
                    return new b("quickShopInfo", this.f99081a.a(QuickShopInfo.class), false);
                }
                return null;
            case 411489521:
                if (str.equals("room_id_str")) {
                    return new b("roomIdStr", this.f99081a.a(String.class), false);
                }
                return null;
            case 454391455:
                if (str.equals("relation_ship")) {
                    return new b("relationShip", this.f99081a.a(String.class), false);
                }
                return null;
            case 458536417:
                if (str.equals("following_count")) {
                    return new b("followingCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 532303174:
                if (str.equals("isNewRecommend")) {
                    return new b("isNewRecommend", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 546431750:
                if (str.equals("is_pro_account")) {
                    return new b("isProAccount", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 555936345:
                if (str.equals("enable_subscription")) {
                    return new b("enableSubscription", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 561192717:
                if (str.equals("avatar_pendant_thumb")) {
                    return new b("avatarPendantThumb", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case 565680874:
                if (str.equals("fb_expire_time")) {
                    return new b("fbExpireTime", this.f99081a.a(Long.class), true);
                }
                return null;
            case 583435343:
                if (str.equals("is_translator")) {
                    return new b("isTranslator", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 585629423:
                if (str.equals("ad_virtual")) {
                    return new b("isAdVirtual", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 594541646:
                if (str.equals("shield_comment_notice")) {
                    return new b("shieldCommentNotice", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 615770241:
                if (str.equals("age_gate_post_action")) {
                    return new b("ageGatePostAction", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 619619035:
                if (str.equals("private_aweme_count")) {
                    return new b("privateAwemeCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 642718792:
                if (str.equals("ad_order_id")) {
                    return new b("adOrderId", this.f99081a.a(String.class), false);
                }
                return null;
            case 644483340:
                if (str.equals("show_tip_entry")) {
                    return new b("showTipEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 695355892:
                if (str.equals("commerce_user_level")) {
                    return new b("commerceUserLevel", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 763686755:
                if (str.equals("can_modify_school_info")) {
                    return new b("canModifySchoolInfo", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 820775883:
                if (str.equals("ad_cover_url")) {
                    return new b("adCoverUrl", this.f99081a.a((a) new d()), false);
                }
                return null;
            case 826948934:
                if (str.equals("account_region")) {
                    return new b("accountRegion", this.f99081a.a(String.class), false);
                }
                return null;
            case 879732277:
                if (str.equals("need_addr_card")) {
                    return new b("needAddrCard", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 932059910:
                if (str.equals("platform_sync_info")) {
                    return new b("platformInfos", this.f99081a.a(PlatformInfo[].class), false);
                }
                return null;
            case 943699016:
                if (str.equals("has_twitter_token")) {
                    return new b("hasTwitterToken", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 957831062:
                if (str.equals("country")) {
                    return new b("country", this.f99081a.a(String.class), false);
                }
                return null;
            case 960777111:
                if (str.equals("aweme_count")) {
                    return new b("awemeCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 960777791:
                if (str.equals("aweme_cover")) {
                    return new b("awemeCover", this.f99081a.a(UserAwemeCover.class), false);
                }
                return null;
            case 985976065:
                if (str.equals("qa_status")) {
                    return new b("qnaStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 990239621:
                if (str.equals("accept_private_policy")) {
                    return new b("acceptPrivatePolicy", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1000427603:
                if (str.equals("need_recommend")) {
                    return new b("needRecommend", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1012728987:
                if (str.equals("allowStatus")) {
                    return new b("allowStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1028143168:
                if (str.equals("follow_status")) {
                    return new b("followStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1052233881:
                if (str.equals("privacy_setting")) {
                    return new b("privacySetting", this.f99081a.a(PrivacySetting.class), false);
                }
                return null;
            case 1058644030:
                if (str.equals("bio_secure_url")) {
                    return new b("bioSecureUrl", this.f99081a.a(String.class), false);
                }
                return null;
            case 1069376125:
                if (str.equals("birthday")) {
                    return new b("birthday", this.f99081a.a(String.class), false);
                }
                return null;
            case 1073584312:
                if (str.equals("signature")) {
                    return new b("signature", this.f99081a.a(String.class), false);
                }
                return null;
            case 1080577994:
                if (str.equals("badge_info")) {
                    return new b("mProfileBadgeStruct", this.f99081a.a(ProfileBadgeStruct.class), false);
                }
                return null;
            case 1091441164:
                if (str.equals("account_type")) {
                    return new b("accountType", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1104050943:
                if (str.equals("signature_language")) {
                    return new b("signatureLanguage", this.f99081a.a(String.class), false);
                }
                return null;
            case 1120251417:
                if (str.equals("matched_friend")) {
                    return new b("matchedFriendStruct", this.f99081a.a(MatchedFriendStruct.class), false);
                }
                return null;
            case 1120576213:
                if (str.equals("relative_users")) {
                    return new b("relativeUserInfos", this.f99081a.a((a) new j()), false);
                }
                return null;
            case 1120628639:
                if (str.equals("show_favorite_list")) {
                    return new b("showFavoriteList", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1133720929:
                if (str.equals("display_wvalantine_activity_entry")) {
                    return new b("displayWvalantineActivityEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1194553073:
                if (str.equals("relation_label")) {
                    return new b("relationLabel", this.f99081a.a(String.class), false);
                }
                return null;
            case 1211562848:
                if (str.equals("is_effect_artist")) {
                    return new b("isEffectArtist", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1221969527:
                if (str.equals("live_agreement")) {
                    return new b("liveAgreement", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1230430956:
                if (str.equals("bind_phone")) {
                    return new b("bindPhone", this.f99081a.a(String.class), false);
                }
                return null;
            case 1241278727:
                if (str.equals("custom_verify")) {
                    return new b("customVerify", this.f99081a.a(String.class), false);
                }
                return null;
            case 1252885563:
                if (str.equals("with_commerce_newbie_task")) {
                    return new b("withCommerceNewbieTask", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1255008083:
                if (str.equals("room_cover")) {
                    return new b("roomCover", this.f99081a.a(UrlModel.class), false);
                }
                return null;
            case 1256845560:
                if (str.equals("has_youtube_token")) {
                    return new b("hasYoutubeToken", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1264119945:
                if (str.equals("login_platform")) {
                    return new b("loginPlatform", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1270527476:
                if (str.equals("room_title")) {
                    return new b("roomTitle", this.f99081a.a(String.class), false);
                }
                return null;
            case 1277731658:
                if (str.equals("contact_name")) {
                    return new b("contactName", this.f99081a.a(String.class), false);
                }
                return null;
            case 1283776167:
                if (str.equals("with_commerce_entry")) {
                    return new b("withCommerceEntry", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1288514147:
                if (str.equals("music_compliance_account")) {
                    return new b("musicComplianceAccount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1358635291:
                if (str.equals("external_recommend_reason")) {
                    return new b("externalRecommendReasonStruct", this.f99081a.a(ExternalRecommendReasonStruct.class), false);
                }
                return null;
            case 1370702579:
                if (str.equals("video_cover")) {
                    return new b("videoCover", this.f99081a.a(VideoCover.class), false);
                }
                return null;
            case 1374088806:
                if (str.equals("brand_info")) {
                    return new b("brandInfo", this.f99081a.a(BlueVBrandInfo.class), false);
                }
                return null;
            case 1374856302:
                if (str.equals("authority_status")) {
                    return new b("authorityStatus", this.f99081a.a(Long.class), true);
                }
                return null;
            case 1379892991:
                if (str.equals("room_id")) {
                    return new b("roomId", this.f99081a.a(Long.class), true);
                }
                return null;
            case 1418717793:
                if (str.equals("cha_list")) {
                    return new b("challengeList", this.f99081a.a((a) new m()), false);
                }
                return null;
            case 1456751824:
                if (str.equals("shield_follow_notice")) {
                    return new b("shieldFollowNotice", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1478872023:
                if (str.equals("is_blocked")) {
                    return new b("isBlocked", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1495639316:
                if (str.equals("live_push_notification_status")) {
                    return new b("livePushNotificationStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1525037056:
                if (str.equals("youtube_channel_title")) {
                    return new b("youtubeChannelTitle", this.f99081a.a(String.class), false);
                }
                return null;
            case 1528032884:
                if (str.equals("is_discipline_member")) {
                    return new b("isDisciplineMember", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1536327183:
                if (str.equals("proaccount_update_notification_status")) {
                    return new b("proAccountUpdateNotificationStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1579076896:
                if (str.equals("commerce_permissions")) {
                    return new b("commercePermission", this.f99081a.a(CommercePermissionStruct.class), false);
                }
                return null;
            case 1596210040:
                if (str.equals("follow_from")) {
                    return new b("followFrom", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1638814131:
                if (str.equals("bold_fields")) {
                    return new b("boldFields", this.f99081a.a((a) new h()), false);
                }
                return null;
            case 1656674238:
                if (str.equals("with_new_goods")) {
                    return new b("withNewGoods", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1663729878:
                if (str.equals("latest_order_time")) {
                    return new b("latestOrderTime", this.f99081a.a(Long.class), false);
                }
                return null;
            case 1683831550:
                if (str.equals("yt_raw_token")) {
                    return new b("youtubeRawRefreshToken", this.f99081a.a(String.class), false);
                }
                return null;
            case 1684784764:
                if (str.equals("story_status")) {
                    return new b("storyStatus", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1713761778:
                if (str.equals("show_image_bubble")) {
                    return new b("showImageBubble", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1717271820:
                if (str.equals("bio_location")) {
                    return new b("bioLocation", this.f99081a.a(String.class), false);
                }
                return null;
            case 1726606679:
                if (str.equals("nickname_update_reminder")) {
                    return new b("nicknameUpdateReminder", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1730382932:
                if (str.equals("navi_id")) {
                    return new b("naviId", this.f99081a.a(String.class), false);
                }
                return null;
            case 1781166887:
                if (str.equals("recommend_reason")) {
                    return new b("recommendReason", this.f99081a.a(String.class), false);
                }
                return null;
            case 1798034544:
                if (str.equals("comment_setting")) {
                    return new b("commentSetting", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1840522208:
                if (str.equals("has_insights")) {
                    return new b("isCreater", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1918208455:
                if (str.equals("mutual_relation")) {
                    return new b("mMutualStruct", this.f99081a.a(MutualStruct.class), false);
                }
                return null;
            case 1923062090:
                if (str.equals("supporting_ngo")) {
                    return new b("mProfileNgoStruct", this.f99081a.a(ProfileNgoStruct.class), false);
                }
                return null;
            case 1935054394:
                if (str.equals("follow_from_msg")) {
                    return new b("followFromMsg", this.f99081a.a(String.class), false);
                }
                return null;
            case 1969626978:
                if (str.equals("sec_uid")) {
                    return new b("secUid", this.f99081a.a(String.class), false);
                }
                return null;
            case 1978716326:
                if (str.equals("is_activity_user")) {
                    return new b("isActivityUser", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 1980077287:
                if (str.equals("cover_url")) {
                    return new b("coverUrls", this.f99081a.a((a) new d()), false);
                }
                return null;
            case 1988146694:
                if (str.equals("mplatform_followers_count")) {
                    return new b("fansCount", this.f99081a.a(Integer.class), true);
                }
                return null;
            case 1993449450:
                if (str.equals("remark_name")) {
                    return new b("remarkName", this.f99081a.a(String.class), false);
                }
                return null;
            case 2005598237:
                if (str.equals("shop_micro_app")) {
                    return new b("shopMicroApp", this.f99081a.a(String.class), false);
                }
                return null;
            case 2067434538:
                if (str.equals("has_orders")) {
                    return new b("hasOrders", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 2082233415:
                if (str.equals("is_star")) {
                    return new b("isStar", this.f99081a.a(Boolean.class), true);
                }
                return null;
            case 2121290772:
                if (str.equals("recommend_reason_relation")) {
                    return new b("recommendReasonRelation", this.f99081a.a(String.class), false);
                }
                return null;
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.gsonopt.a
    public final Object a() {
        return new User();
    }
}
