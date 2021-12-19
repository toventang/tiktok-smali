package com.ss.ugc.aweme.proto;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.c.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.playerkit.model.v;
import java.util.List;
import k.i;

public final class UserStructV2 extends Message<UserStructV2, Builder> {
    public static final ProtoAdapter<UserStructV2> ADAPTER = new ProtoAdapter_UserStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 89)
    public Boolean accept_private_policy;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 65)
    public String account_region;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AdCoverTitleV2#ADAPTER", tag = 168)
    public AdCoverTitleV2 ad_cover_title;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 167)
    public List<UrlStructV2> ad_cover_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 169)
    public String ad_order_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 84)
    public Integer apple_account;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 45)
    public Long authority_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 175)
    public UrlStructV2 avatar_168x168;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 176)
    public UrlStructV2 avatar_300x300;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AvatarDecorationStructV2#ADAPTER", tag = 135)
    public AvatarDecorationStructV2 avatar_decoration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 165)
    public Long avatar_decoration_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 avatar_larger;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 143)
    public UrlStructV2 avatar_pendant_larger;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 145)
    public UrlStructV2 avatar_pendant_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 144)
    public UrlStructV2 avatar_pendant_thumb;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 207)
    public Boolean avatar_update_reminder;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 102)
    public String avatar_uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer aweme_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ProfileBadgeStructV2#ADAPTER", tag = 214)
    public ProfileBadgeStructV2 badge_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 27)
    public String bind_phone;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 198)
    public String bio_email;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 204)
    public String bio_secure_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 197)
    public String bio_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public String birthday;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 196)
    public Integer birthday_hide_level;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2#ADAPTER", tag = 182)
    public BlueVBrandInfoStructV2 brand_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 141)
    public Boolean can_modify_school_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 189)
    public List<ChallengeStructV2> cha_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 121)
    public String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 205)
    public Integer collect_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 173)
    public Integer comment_filter_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 105)
    public Integer comment_setting;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceInfoStructV2#ADAPTER", tag = 68)
    public CommerceInfoStructV2 commerce_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommercePermissionStructV2#ADAPTER", tag = 151)
    public CommercePermissionStructV2 commerce_permissions;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceUserStructV2#ADAPTER", tag = 185)
    public CommerceUserStructV2 commerce_user_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 67)
    public Integer commerce_user_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 119)
    public String country;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 122)
    public List<UrlStructV2> cover_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 101)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 161)
    public Integer creator_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String custom_verify;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 160)
    public String cv_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 183)
    public Boolean display_wvalantine_activity_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 126)
    public String district;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 114)
    public Long download_prompt_ts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 113)
    public Integer download_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 106)
    public Integer duet_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 140)
    public Integer education;
    @WireField(adapter = "com.ss.ugc.aweme.proto.EffectArtistStructV2#ADAPTER", tag = 150)
    public EffectArtistStructV2 effect_detail;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 202)
    public String email;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 58)
    public String enterprise_verify_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 16)
    public Integer favoriting_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 39)
    public Integer fb_expire_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Integer follow_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer follower_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 103)
    public Integer follower_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.FollowersDetailV2#ADAPTER", label = WireField.Label.REPEATED, tag = 62)
    public List<FollowersDetailV2> followers_detail;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SELECT_SCENE)
    public Integer following_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 178)
    public Boolean force_private_account;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer gender;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PermissionStructV2#ADAPTER", tag = 195)
    public PermissionStructV2 general_permission;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 77)
    public List<String> geofencing;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 81)
    public String google_account;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 94)
    public Boolean has_email;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 37)
    public Boolean has_facebook_token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 130)
    public Boolean has_insights;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 74)
    public Boolean has_orders;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 38)
    public Boolean has_twitter_token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 41)
    public Boolean has_youtube_token;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 153)
    public Integer hide_following_follower_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = v.U)
    public Boolean hide_search;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LiveHonorStructV2#ADAPTER", tag = 172)
    public LiveHonorStructV2 honor_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 80)
    public String ins_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 208)
    public Boolean is_activity_user;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 59)
    public Boolean is_ad_fake;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public Boolean is_block;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 177)
    public Boolean is_blocked;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 72)
    public Boolean is_discipline_member;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 149)
    public Boolean is_effect_artist;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 203)
    public Boolean is_email_verified;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 111)
    public Boolean is_flowcard_member;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 211)
    public Boolean is_life_style;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = BuildConfig.VERSION_CODE)
    public Boolean is_minor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 162)
    public Boolean is_mirror;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 87)
    public Boolean is_phone_binded;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 200)
    public Boolean is_pro_account;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 158)
    public Boolean is_star;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 124)
    public String iso_country_code;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RecommendItemStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 146)
    public List<RecommendItemStructV2> item_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 127)
    public String language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 199)
    public Long latest_order_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LifeStoryBlockStructV2#ADAPTER", tag = 152)
    public LifeStoryBlockStructV2 life_story_block;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 69)
    public Integer live_agreement;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 97)
    public Integer live_agreement_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 116)
    public Boolean live_commerce;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = com.appsflyer.BuildConfig.VERSION_CODE)
    public Integer live_verify;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 88)
    public Integer login_platform;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MatchedFriendStructV2#ADAPTER", tag = 217)
    public MatchedFriendStructV2 matched_friend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 61)
    public Integer mplatform_followers_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 29)
    public Integer need_recommend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 206)
    public Boolean nickname_update_reminder;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 174)
    public Integer notify_private_account;
    @WireField(adapter = "com.ss.ugc.aweme.proto.OriginalMusicianStructV2#ADAPTER", tag = 56)
    public OriginalMusicianStructV2 original_musician;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 70)
    public List<PlatformSyncStatusStructV2> platform_sync_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 163)
    public Integer pr_exempt;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 75)
    public Boolean prevent_download;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 134)
    public Integer profile_tab_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 120)
    public String province;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 213)
    public Integer qa_status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.QuickShopStructV2#ADAPTER", tag = 187)
    public QuickShopStructV2 quick_shop_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RFansGroupInfoV2#ADAPTER", tag = 170)
    public RFansGroupInfoV2 r_fans_group_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 115)
    public Integer react_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 36)
    public String recommend_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 123)
    public String recommend_reason_relation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 192)
    public Double recommend_score;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 107)
    public Long reflow_page_gid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 108)
    public Long reflow_page_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 64)
    public String region;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 98)
    public Long register_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelativeUserStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 186)
    public List<RelativeUserStructV2> relative_users;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 131)
    public String remark_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 112)
    public UrlStructV2 room_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 209)
    public String room_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 43)
    public Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 128)
    public String room_type_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 142)
    public Integer school_visible;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 191)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 73)
    public Integer secret;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 53)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 133)
    public String share_qrcode_uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 49)
    public Integer shield_comment_notice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 48)
    public Integer shield_digg_notice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 47)
    public Integer shield_follow_notice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 184)
    public String shop_micro_app;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 76)
    public Boolean show_image_bubble;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String signature;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 181)
    public String signature_language;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 215)
    public String social_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28)
    public Integer special_lock;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HotsearchSprintStructV2#ADAPTER", tag = LiveFeedRefreshTimeSetting.DEFAULT)
    public HotsearchSprintStructV2 sprint_support_user_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 139)
    public Integer star_billboard_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 99)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 212)
    public Integer stitch_setting;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 216)
    public Integer story_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer total_favorited;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 40)
    public Integer tw_expire_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 91)
    public String twitter_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 92)
    public String twitter_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 164)
    public List<Long> type_label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String unique_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 78)
    public Integer unique_id_modify_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 93)
    public Boolean user_canceled;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 147)
    public Integer user_mode;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 148)
    public Integer user_period;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 109)
    public Integer user_rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 55)
    public Integer verification_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 46)
    public String verify_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 79)
    public UrlStructV2 video_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 132)
    public String video_icon_virtual_URI;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoUnreadStructV2#ADAPTER", tag = 210)
    public VideoUnreadStructV2 video_unread_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 136)
    public Boolean watch_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 171)
    public Boolean with_commerce_enterprise_tab_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 54)
    public Boolean with_commerce_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 137)
    public Boolean with_commerce_newbie_task;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 86)
    public Boolean with_fusion_shop_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 138)
    public Boolean with_item_commerce_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 110)
    public Boolean with_new_goods;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 71)
    public Boolean with_shop_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 179)
    public Boolean with_star_atlas_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 82)
    public String youtube_channel_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 83)
    public String youtube_channel_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 42)
    public Integer youtube_expire_time;

    public UserStructV2() {
    }

    public UserStructV2(String str, String str2, String str3, Integer num, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, String str5, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, String str6, String str7, String str8, Integer num8, Integer num9, String str9, Boolean bool3, Boolean bool4, Integer num10, Integer num11, Boolean bool5, Integer num12, Long l2, Integer num13, Long l3, String str10, Integer num14, Integer num15, Integer num16, ShareStructV2 shareStructV2, Boolean bool6, Integer num17, OriginalMusicianStructV2 originalMusicianStructV2, String str11, Boolean bool7, Integer num18, List<FollowersDetailV2> list, String str12, String str13, Integer num19, CommerceInfoStructV2 commerceInfoStructV2, Integer num20, List<PlatformSyncStatusStructV2> list2, Boolean bool8, Boolean bool9, Integer num21, Boolean bool10, Boolean bool11, Boolean bool12, List<String> list3, Integer num22, UrlStructV2 urlStructV24, String str14, String str15, String str16, String str17, Integer num23, Boolean bool13, Boolean bool14, Integer num24, Boolean bool15, String str18, String str19, Boolean bool16, Boolean bool17, Integer num25, Long l4, Integer num26, Long l5, String str20, Integer num27, Integer num28, Integer num29, Long l6, Long l7, Integer num30, Boolean bool18, Boolean bool19, UrlStructV2 urlStructV25, Integer num31, Long l8, Integer num32, Boolean bool20, String str21, String str22, String str23, List<UrlStructV2> list4, String str24, String str25, String str26, String str27, String str28, Boolean bool21, String str29, String str30, String str31, Integer num33, AvatarDecorationStructV2 avatarDecorationStructV2, Boolean bool22, Boolean bool23, Boolean bool24, Integer num34, Integer num35, Boolean bool25, Integer num36, UrlStructV2 urlStructV26, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, List<RecommendItemStructV2> list5, Integer num37, Integer num38, Boolean bool26, EffectArtistStructV2 effectArtistStructV2, CommercePermissionStructV2 commercePermissionStructV2, LifeStoryBlockStructV2 lifeStoryBlockStructV2, Integer num39, Boolean bool27, String str32, Integer num40, Boolean bool28, Integer num41, List<Long> list6, Long l9, List<UrlStructV2> list7, AdCoverTitleV2 adCoverTitleV2, String str33, RFansGroupInfoV2 rFansGroupInfoV2, Boolean bool29, LiveHonorStructV2 liveHonorStructV2, Integer num42, Integer num43, UrlStructV2 urlStructV29, UrlStructV2 urlStructV210, Boolean bool30, Boolean bool31, Boolean bool32, HotsearchSprintStructV2 hotsearchSprintStructV2, String str34, BlueVBrandInfoStructV2 blueVBrandInfoStructV2, Boolean bool33, String str35, CommerceUserStructV2 commerceUserStructV2, List<RelativeUserStructV2> list8, QuickShopStructV2 quickShopStructV2, List<ChallengeStructV2> list9, Boolean bool34, String str36, Double d2, PermissionStructV2 permissionStructV2, Integer num44, String str37, String str38, Long l10, Boolean bool35, String str39, Boolean bool36, String str40, Integer num45, Boolean bool37, Boolean bool38, Boolean bool39, String str41, VideoUnreadStructV2 videoUnreadStructV2, Boolean bool40, Integer num46, Integer num47, ProfileBadgeStructV2 profileBadgeStructV2, String str42, Integer num48, MatchedFriendStructV2 matchedFriendStructV2) {
        this(str, str2, str3, num, str4, urlStructV2, urlStructV22, urlStructV23, str5, num2, num3, num4, num5, num6, num7, bool, bool2, str6, str7, str8, num8, num9, str9, bool3, bool4, num10, num11, bool5, num12, l2, num13, l3, str10, num14, num15, num16, shareStructV2, bool6, num17, originalMusicianStructV2, str11, bool7, num18, list, str12, str13, num19, commerceInfoStructV2, num20, list2, bool8, bool9, num21, bool10, bool11, bool12, list3, num22, urlStructV24, str14, str15, str16, str17, num23, bool13, bool14, num24, bool15, str18, str19, bool16, bool17, num25, l4, num26, l5, str20, num27, num28, num29, l6, l7, num30, bool18, bool19, urlStructV25, num31, l8, num32, bool20, str21, str22, str23, list4, str24, str25, str26, str27, str28, bool21, str29, str30, str31, num33, avatarDecorationStructV2, bool22, bool23, bool24, num34, num35, bool25, num36, urlStructV26, urlStructV27, urlStructV28, list5, num37, num38, bool26, effectArtistStructV2, commercePermissionStructV2, lifeStoryBlockStructV2, num39, bool27, str32, num40, bool28, num41, list6, l9, list7, adCoverTitleV2, str33, rFansGroupInfoV2, bool29, liveHonorStructV2, num42, num43, urlStructV29, urlStructV210, bool30, bool31, bool32, hotsearchSprintStructV2, str34, blueVBrandInfoStructV2, bool33, str35, commerceUserStructV2, list8, quickShopStructV2, list9, bool34, str36, d2, permissionStructV2, num44, str37, str38, l10, bool35, str39, bool36, str40, num45, bool37, bool38, bool39, str41, videoUnreadStructV2, bool40, num46, num47, profileBadgeStructV2, str42, num48, matchedFriendStructV2, i.EMPTY);
    }

    public UserStructV2(String str, String str2, String str3, Integer num, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, String str5, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, String str6, String str7, String str8, Integer num8, Integer num9, String str9, Boolean bool3, Boolean bool4, Integer num10, Integer num11, Boolean bool5, Integer num12, Long l2, Integer num13, Long l3, String str10, Integer num14, Integer num15, Integer num16, ShareStructV2 shareStructV2, Boolean bool6, Integer num17, OriginalMusicianStructV2 originalMusicianStructV2, String str11, Boolean bool7, Integer num18, List<FollowersDetailV2> list, String str12, String str13, Integer num19, CommerceInfoStructV2 commerceInfoStructV2, Integer num20, List<PlatformSyncStatusStructV2> list2, Boolean bool8, Boolean bool9, Integer num21, Boolean bool10, Boolean bool11, Boolean bool12, List<String> list3, Integer num22, UrlStructV2 urlStructV24, String str14, String str15, String str16, String str17, Integer num23, Boolean bool13, Boolean bool14, Integer num24, Boolean bool15, String str18, String str19, Boolean bool16, Boolean bool17, Integer num25, Long l4, Integer num26, Long l5, String str20, Integer num27, Integer num28, Integer num29, Long l6, Long l7, Integer num30, Boolean bool18, Boolean bool19, UrlStructV2 urlStructV25, Integer num31, Long l8, Integer num32, Boolean bool20, String str21, String str22, String str23, List<UrlStructV2> list4, String str24, String str25, String str26, String str27, String str28, Boolean bool21, String str29, String str30, String str31, Integer num33, AvatarDecorationStructV2 avatarDecorationStructV2, Boolean bool22, Boolean bool23, Boolean bool24, Integer num34, Integer num35, Boolean bool25, Integer num36, UrlStructV2 urlStructV26, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, List<RecommendItemStructV2> list5, Integer num37, Integer num38, Boolean bool26, EffectArtistStructV2 effectArtistStructV2, CommercePermissionStructV2 commercePermissionStructV2, LifeStoryBlockStructV2 lifeStoryBlockStructV2, Integer num39, Boolean bool27, String str32, Integer num40, Boolean bool28, Integer num41, List<Long> list6, Long l9, List<UrlStructV2> list7, AdCoverTitleV2 adCoverTitleV2, String str33, RFansGroupInfoV2 rFansGroupInfoV2, Boolean bool29, LiveHonorStructV2 liveHonorStructV2, Integer num42, Integer num43, UrlStructV2 urlStructV29, UrlStructV2 urlStructV210, Boolean bool30, Boolean bool31, Boolean bool32, HotsearchSprintStructV2 hotsearchSprintStructV2, String str34, BlueVBrandInfoStructV2 blueVBrandInfoStructV2, Boolean bool33, String str35, CommerceUserStructV2 commerceUserStructV2, List<RelativeUserStructV2> list8, QuickShopStructV2 quickShopStructV2, List<ChallengeStructV2> list9, Boolean bool34, String str36, Double d2, PermissionStructV2 permissionStructV2, Integer num44, String str37, String str38, Long l10, Boolean bool35, String str39, Boolean bool36, String str40, Integer num45, Boolean bool37, Boolean bool38, Boolean bool39, String str41, VideoUnreadStructV2 videoUnreadStructV2, Boolean bool40, Integer num46, Integer num47, ProfileBadgeStructV2 profileBadgeStructV2, String str42, Integer num48, MatchedFriendStructV2 matchedFriendStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.uid = str;
        this.short_id = str2;
        this.nickname = str3;
        this.gender = num;
        this.signature = str4;
        this.avatar_larger = urlStructV2;
        this.avatar_thumb = urlStructV22;
        this.avatar_medium = urlStructV23;
        this.birthday = str5;
        this.follow_status = num2;
        this.aweme_count = num3;
        this.following_count = num4;
        this.follower_count = num5;
        this.favoriting_count = num6;
        this.total_favorited = num7;
        this.is_block = bool;
        this.hide_search = bool2;
        this.custom_verify = str6;
        this.unique_id = str7;
        this.bind_phone = str8;
        this.special_lock = num8;
        this.need_recommend = num9;
        this.recommend_reason = str9;
        this.has_facebook_token = bool3;
        this.has_twitter_token = bool4;
        this.fb_expire_time = num10;
        this.tw_expire_time = num11;
        this.has_youtube_token = bool5;
        this.youtube_expire_time = num12;
        this.room_id = l2;
        this.live_verify = num13;
        this.authority_status = l3;
        this.verify_info = str10;
        this.shield_follow_notice = num14;
        this.shield_digg_notice = num15;
        this.shield_comment_notice = num16;
        this.share_info = shareStructV2;
        this.with_commerce_entry = bool6;
        this.verification_type = num17;
        this.original_musician = originalMusicianStructV2;
        this.enterprise_verify_reason = str11;
        this.is_ad_fake = bool7;
        this.mplatform_followers_count = num18;
        this.followers_detail = Internal.immutableCopyOf("followers_detail", list);
        this.region = str12;
        this.account_region = str13;
        this.commerce_user_level = num19;
        this.commerce_info = commerceInfoStructV2;
        this.live_agreement = num20;
        this.platform_sync_info = Internal.immutableCopyOf("platform_sync_info", list2);
        this.with_shop_entry = bool8;
        this.is_discipline_member = bool9;
        this.secret = num21;
        this.has_orders = bool10;
        this.prevent_download = bool11;
        this.show_image_bubble = bool12;
        this.geofencing = Internal.immutableCopyOf("geofencing", list3);
        this.unique_id_modify_time = num22;
        this.video_icon = urlStructV24;
        this.ins_id = str14;
        this.google_account = str15;
        this.youtube_channel_id = str16;
        this.youtube_channel_title = str17;
        this.apple_account = num23;
        this.with_fusion_shop_entry = bool13;
        this.is_phone_binded = bool14;
        this.login_platform = num24;
        this.accept_private_policy = bool15;
        this.twitter_id = str18;
        this.twitter_name = str19;
        this.user_canceled = bool16;
        this.has_email = bool17;
        this.live_agreement_time = num25;
        this.register_time = l4;
        this.status = num26;
        this.create_time = l5;
        this.avatar_uri = str20;
        this.follower_status = num27;
        this.comment_setting = num28;
        this.duet_setting = num29;
        this.reflow_page_gid = l6;
        this.reflow_page_uid = l7;
        this.user_rate = num30;
        this.with_new_goods = bool18;
        this.is_flowcard_member = bool19;
        this.room_cover = urlStructV25;
        this.download_setting = num31;
        this.download_prompt_ts = l8;
        this.react_setting = num32;
        this.live_commerce = bool20;
        this.country = str21;
        this.province = str22;
        this.city = str23;
        this.cover_url = Internal.immutableCopyOf("cover_url", list4);
        this.recommend_reason_relation = str24;
        this.iso_country_code = str25;
        this.district = str26;
        this.language = str27;
        this.room_type_tag = str28;
        this.has_insights = bool21;
        this.remark_name = str29;
        this.video_icon_virtual_URI = str30;
        this.share_qrcode_uri = str31;
        this.profile_tab_type = num33;
        this.avatar_decoration = avatarDecorationStructV2;
        this.watch_status = bool22;
        this.with_commerce_newbie_task = bool23;
        this.with_item_commerce_entry = bool24;
        this.star_billboard_rank = num34;
        this.education = num35;
        this.can_modify_school_info = bool25;
        this.school_visible = num36;
        this.avatar_pendant_larger = urlStructV26;
        this.avatar_pendant_thumb = urlStructV27;
        this.avatar_pendant_medium = urlStructV28;
        this.item_list = Internal.immutableCopyOf("item_list", list5);
        this.user_mode = num37;
        this.user_period = num38;
        this.is_effect_artist = bool26;
        this.effect_detail = effectArtistStructV2;
        this.commerce_permissions = commercePermissionStructV2;
        this.life_story_block = lifeStoryBlockStructV2;
        this.hide_following_follower_list = num39;
        this.is_star = bool27;
        this.cv_level = str32;
        this.creator_level = num40;
        this.is_mirror = bool28;
        this.pr_exempt = num41;
        this.type_label = Internal.immutableCopyOf("type_label", list6);
        this.avatar_decoration_id = l9;
        this.ad_cover_url = Internal.immutableCopyOf("ad_cover_url", list7);
        this.ad_cover_title = adCoverTitleV2;
        this.ad_order_id = str33;
        this.r_fans_group_info = rFansGroupInfoV2;
        this.with_commerce_enterprise_tab_entry = bool29;
        this.honor_info = liveHonorStructV2;
        this.comment_filter_status = num42;
        this.notify_private_account = num43;
        this.avatar_168x168 = urlStructV29;
        this.avatar_300x300 = urlStructV210;
        this.is_blocked = bool30;
        this.force_private_account = bool31;
        this.with_star_atlas_entry = bool32;
        this.sprint_support_user_info = hotsearchSprintStructV2;
        this.signature_language = str34;
        this.brand_info = blueVBrandInfoStructV2;
        this.display_wvalantine_activity_entry = bool33;
        this.shop_micro_app = str35;
        this.commerce_user_info = commerceUserStructV2;
        this.relative_users = Internal.immutableCopyOf("relative_users", list8);
        this.quick_shop_info = quickShopStructV2;
        this.cha_list = Internal.immutableCopyOf("cha_list", list9);
        this.is_minor = bool34;
        this.sec_uid = str36;
        this.recommend_score = d2;
        this.general_permission = permissionStructV2;
        this.birthday_hide_level = num44;
        this.bio_url = str37;
        this.bio_email = str38;
        this.latest_order_time = l10;
        this.is_pro_account = bool35;
        this.email = str39;
        this.is_email_verified = bool36;
        this.bio_secure_url = str40;
        this.collect_count = num45;
        this.nickname_update_reminder = bool37;
        this.avatar_update_reminder = bool38;
        this.is_activity_user = bool39;
        this.room_data = str41;
        this.video_unread_info = videoUnreadStructV2;
        this.is_life_style = bool40;
        this.stitch_setting = num46;
        this.qa_status = num47;
        this.badge_info = profileBadgeStructV2;
        this.social_info = str42;
        this.story_status = num48;
        this.matched_friend = matchedFriendStructV2;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r0v270 ??)
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:107)
        */
    public final int hashCode() {
        /*
        // Method dump skipped, instructions count: 2437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.aweme.proto.UserStructV2.hashCode():int");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=").append(this.uid);
        }
        if (this.short_id != null) {
            sb.append(", short_id=").append(this.short_id);
        }
        if (this.nickname != null) {
            sb.append(", nickname=").append(this.nickname);
        }
        if (this.gender != null) {
            sb.append(", gender=").append(this.gender);
        }
        if (this.signature != null) {
            sb.append(", signature=").append(this.signature);
        }
        if (this.avatar_larger != null) {
            sb.append(", avatar_larger=").append(this.avatar_larger);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=").append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=").append(this.avatar_medium);
        }
        if (this.birthday != null) {
            sb.append(", birthday=").append(this.birthday);
        }
        if (this.follow_status != null) {
            sb.append(", follow_status=").append(this.follow_status);
        }
        if (this.aweme_count != null) {
            sb.append(", aweme_count=").append(this.aweme_count);
        }
        if (this.following_count != null) {
            sb.append(", following_count=").append(this.following_count);
        }
        if (this.follower_count != null) {
            sb.append(", follower_count=").append(this.follower_count);
        }
        if (this.favoriting_count != null) {
            sb.append(", favoriting_count=").append(this.favoriting_count);
        }
        if (this.total_favorited != null) {
            sb.append(", total_favorited=").append(this.total_favorited);
        }
        if (this.is_block != null) {
            sb.append(", is_block=").append(this.is_block);
        }
        if (this.hide_search != null) {
            sb.append(", hide_search=").append(this.hide_search);
        }
        if (this.custom_verify != null) {
            sb.append(", custom_verify=").append(this.custom_verify);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=").append(this.unique_id);
        }
        if (this.bind_phone != null) {
            sb.append(", bind_phone=").append(this.bind_phone);
        }
        if (this.special_lock != null) {
            sb.append(", special_lock=").append(this.special_lock);
        }
        if (this.need_recommend != null) {
            sb.append(", need_recommend=").append(this.need_recommend);
        }
        if (this.recommend_reason != null) {
            sb.append(", recommend_reason=").append(this.recommend_reason);
        }
        if (this.has_facebook_token != null) {
            sb.append(", has_facebook_token=").append(this.has_facebook_token);
        }
        if (this.has_twitter_token != null) {
            sb.append(", has_twitter_token=").append(this.has_twitter_token);
        }
        if (this.fb_expire_time != null) {
            sb.append(", fb_expire_time=").append(this.fb_expire_time);
        }
        if (this.tw_expire_time != null) {
            sb.append(", tw_expire_time=").append(this.tw_expire_time);
        }
        if (this.has_youtube_token != null) {
            sb.append(", has_youtube_token=").append(this.has_youtube_token);
        }
        if (this.youtube_expire_time != null) {
            sb.append(", youtube_expire_time=").append(this.youtube_expire_time);
        }
        if (this.room_id != null) {
            sb.append(", room_id=").append(this.room_id);
        }
        if (this.live_verify != null) {
            sb.append(", live_verify=").append(this.live_verify);
        }
        if (this.authority_status != null) {
            sb.append(", authority_status=").append(this.authority_status);
        }
        if (this.verify_info != null) {
            sb.append(", verify_info=").append(this.verify_info);
        }
        if (this.shield_follow_notice != null) {
            sb.append(", shield_follow_notice=").append(this.shield_follow_notice);
        }
        if (this.shield_digg_notice != null) {
            sb.append(", shield_digg_notice=").append(this.shield_digg_notice);
        }
        if (this.shield_comment_notice != null) {
            sb.append(", shield_comment_notice=").append(this.shield_comment_notice);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (this.with_commerce_entry != null) {
            sb.append(", with_commerce_entry=").append(this.with_commerce_entry);
        }
        if (this.verification_type != null) {
            sb.append(", verification_type=").append(this.verification_type);
        }
        if (this.original_musician != null) {
            sb.append(", original_musician=").append(this.original_musician);
        }
        if (this.enterprise_verify_reason != null) {
            sb.append(", enterprise_verify_reason=").append(this.enterprise_verify_reason);
        }
        if (this.is_ad_fake != null) {
            sb.append(", is_ad_fake=").append(this.is_ad_fake);
        }
        if (this.mplatform_followers_count != null) {
            sb.append(", mplatform_followers_count=").append(this.mplatform_followers_count);
        }
        if (!this.followers_detail.isEmpty()) {
            sb.append(", followers_detail=").append(this.followers_detail);
        }
        if (this.region != null) {
            sb.append(", region=").append(this.region);
        }
        if (this.account_region != null) {
            sb.append(", account_region=").append(this.account_region);
        }
        if (this.commerce_user_level != null) {
            sb.append(", commerce_user_level=").append(this.commerce_user_level);
        }
        if (this.commerce_info != null) {
            sb.append(", commerce_info=").append(this.commerce_info);
        }
        if (this.live_agreement != null) {
            sb.append(", live_agreement=").append(this.live_agreement);
        }
        if (!this.platform_sync_info.isEmpty()) {
            sb.append(", platform_sync_info=").append(this.platform_sync_info);
        }
        if (this.with_shop_entry != null) {
            sb.append(", with_shop_entry=").append(this.with_shop_entry);
        }
        if (this.is_discipline_member != null) {
            sb.append(", is_discipline_member=").append(this.is_discipline_member);
        }
        if (this.secret != null) {
            sb.append(", secret=").append(this.secret);
        }
        if (this.has_orders != null) {
            sb.append(", has_orders=").append(this.has_orders);
        }
        if (this.prevent_download != null) {
            sb.append(", prevent_download=").append(this.prevent_download);
        }
        if (this.show_image_bubble != null) {
            sb.append(", show_image_bubble=").append(this.show_image_bubble);
        }
        if (!this.geofencing.isEmpty()) {
            sb.append(", geofencing=").append(this.geofencing);
        }
        if (this.unique_id_modify_time != null) {
            sb.append(", unique_id_modify_time=").append(this.unique_id_modify_time);
        }
        if (this.video_icon != null) {
            sb.append(", video_icon=").append(this.video_icon);
        }
        if (this.ins_id != null) {
            sb.append(", ins_id=").append(this.ins_id);
        }
        if (this.google_account != null) {
            sb.append(", google_account=").append(this.google_account);
        }
        if (this.youtube_channel_id != null) {
            sb.append(", youtube_channel_id=").append(this.youtube_channel_id);
        }
        if (this.youtube_channel_title != null) {
            sb.append(", youtube_channel_title=").append(this.youtube_channel_title);
        }
        if (this.apple_account != null) {
            sb.append(", apple_account=").append(this.apple_account);
        }
        if (this.with_fusion_shop_entry != null) {
            sb.append(", with_fusion_shop_entry=").append(this.with_fusion_shop_entry);
        }
        if (this.is_phone_binded != null) {
            sb.append(", is_phone_binded=").append(this.is_phone_binded);
        }
        if (this.login_platform != null) {
            sb.append(", login_platform=").append(this.login_platform);
        }
        if (this.accept_private_policy != null) {
            sb.append(", accept_private_policy=").append(this.accept_private_policy);
        }
        if (this.twitter_id != null) {
            sb.append(", twitter_id=").append(this.twitter_id);
        }
        if (this.twitter_name != null) {
            sb.append(", twitter_name=").append(this.twitter_name);
        }
        if (this.user_canceled != null) {
            sb.append(", user_canceled=").append(this.user_canceled);
        }
        if (this.has_email != null) {
            sb.append(", has_email=").append(this.has_email);
        }
        if (this.live_agreement_time != null) {
            sb.append(", live_agreement_time=").append(this.live_agreement_time);
        }
        if (this.register_time != null) {
            sb.append(", register_time=").append(this.register_time);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.create_time != null) {
            sb.append(", create_time=").append(this.create_time);
        }
        if (this.avatar_uri != null) {
            sb.append(", avatar_uri=").append(this.avatar_uri);
        }
        if (this.follower_status != null) {
            sb.append(", follower_status=").append(this.follower_status);
        }
        if (this.comment_setting != null) {
            sb.append(", comment_setting=").append(this.comment_setting);
        }
        if (this.duet_setting != null) {
            sb.append(", duet_setting=").append(this.duet_setting);
        }
        if (this.reflow_page_gid != null) {
            sb.append(", reflow_page_gid=").append(this.reflow_page_gid);
        }
        if (this.reflow_page_uid != null) {
            sb.append(", reflow_page_uid=").append(this.reflow_page_uid);
        }
        if (this.user_rate != null) {
            sb.append(", user_rate=").append(this.user_rate);
        }
        if (this.with_new_goods != null) {
            sb.append(", with_new_goods=").append(this.with_new_goods);
        }
        if (this.is_flowcard_member != null) {
            sb.append(", is_flowcard_member=").append(this.is_flowcard_member);
        }
        if (this.room_cover != null) {
            sb.append(", room_cover=").append(this.room_cover);
        }
        if (this.download_setting != null) {
            sb.append(", download_setting=").append(this.download_setting);
        }
        if (this.download_prompt_ts != null) {
            sb.append(", download_prompt_ts=").append(this.download_prompt_ts);
        }
        if (this.react_setting != null) {
            sb.append(", react_setting=").append(this.react_setting);
        }
        if (this.live_commerce != null) {
            sb.append(", live_commerce=").append(this.live_commerce);
        }
        if (this.country != null) {
            sb.append(", country=").append(this.country);
        }
        if (this.province != null) {
            sb.append(", province=").append(this.province);
        }
        if (this.city != null) {
            sb.append(", city=").append(this.city);
        }
        if (!this.cover_url.isEmpty()) {
            sb.append(", cover_url=").append(this.cover_url);
        }
        if (this.recommend_reason_relation != null) {
            sb.append(", recommend_reason_relation=").append(this.recommend_reason_relation);
        }
        if (this.iso_country_code != null) {
            sb.append(", iso_country_code=").append(this.iso_country_code);
        }
        if (this.district != null) {
            sb.append(", district=").append(this.district);
        }
        if (this.language != null) {
            sb.append(", language=").append(this.language);
        }
        if (this.room_type_tag != null) {
            sb.append(", room_type_tag=").append(this.room_type_tag);
        }
        if (this.has_insights != null) {
            sb.append(", has_insights=").append(this.has_insights);
        }
        if (this.remark_name != null) {
            sb.append(", remark_name=").append(this.remark_name);
        }
        if (this.video_icon_virtual_URI != null) {
            sb.append(", video_icon_virtual_URI=").append(this.video_icon_virtual_URI);
        }
        if (this.share_qrcode_uri != null) {
            sb.append(", share_qrcode_uri=").append(this.share_qrcode_uri);
        }
        if (this.profile_tab_type != null) {
            sb.append(", profile_tab_type=").append(this.profile_tab_type);
        }
        if (this.avatar_decoration != null) {
            sb.append(", avatar_decoration=").append(this.avatar_decoration);
        }
        if (this.watch_status != null) {
            sb.append(", watch_status=").append(this.watch_status);
        }
        if (this.with_commerce_newbie_task != null) {
            sb.append(", with_commerce_newbie_task=").append(this.with_commerce_newbie_task);
        }
        if (this.with_item_commerce_entry != null) {
            sb.append(", with_item_commerce_entry=").append(this.with_item_commerce_entry);
        }
        if (this.star_billboard_rank != null) {
            sb.append(", star_billboard_rank=").append(this.star_billboard_rank);
        }
        if (this.education != null) {
            sb.append(", education=").append(this.education);
        }
        if (this.can_modify_school_info != null) {
            sb.append(", can_modify_school_info=").append(this.can_modify_school_info);
        }
        if (this.school_visible != null) {
            sb.append(", school_visible=").append(this.school_visible);
        }
        if (this.avatar_pendant_larger != null) {
            sb.append(", avatar_pendant_larger=").append(this.avatar_pendant_larger);
        }
        if (this.avatar_pendant_thumb != null) {
            sb.append(", avatar_pendant_thumb=").append(this.avatar_pendant_thumb);
        }
        if (this.avatar_pendant_medium != null) {
            sb.append(", avatar_pendant_medium=").append(this.avatar_pendant_medium);
        }
        if (!this.item_list.isEmpty()) {
            sb.append(", item_list=").append(this.item_list);
        }
        if (this.user_mode != null) {
            sb.append(", user_mode=").append(this.user_mode);
        }
        if (this.user_period != null) {
            sb.append(", user_period=").append(this.user_period);
        }
        if (this.is_effect_artist != null) {
            sb.append(", is_effect_artist=").append(this.is_effect_artist);
        }
        if (this.effect_detail != null) {
            sb.append(", effect_detail=").append(this.effect_detail);
        }
        if (this.commerce_permissions != null) {
            sb.append(", commerce_permissions=").append(this.commerce_permissions);
        }
        if (this.life_story_block != null) {
            sb.append(", life_story_block=").append(this.life_story_block);
        }
        if (this.hide_following_follower_list != null) {
            sb.append(", hide_following_follower_list=").append(this.hide_following_follower_list);
        }
        if (this.is_star != null) {
            sb.append(", is_star=").append(this.is_star);
        }
        if (this.cv_level != null) {
            sb.append(", cv_level=").append(this.cv_level);
        }
        if (this.creator_level != null) {
            sb.append(", creator_level=").append(this.creator_level);
        }
        if (this.is_mirror != null) {
            sb.append(", is_mirror=").append(this.is_mirror);
        }
        if (this.pr_exempt != null) {
            sb.append(", pr_exempt=").append(this.pr_exempt);
        }
        if (!this.type_label.isEmpty()) {
            sb.append(", type_label=").append(this.type_label);
        }
        if (this.avatar_decoration_id != null) {
            sb.append(", avatar_decoration_id=").append(this.avatar_decoration_id);
        }
        if (!this.ad_cover_url.isEmpty()) {
            sb.append(", ad_cover_url=").append(this.ad_cover_url);
        }
        if (this.ad_cover_title != null) {
            sb.append(", ad_cover_title=").append(this.ad_cover_title);
        }
        if (this.ad_order_id != null) {
            sb.append(", ad_order_id=").append(this.ad_order_id);
        }
        if (this.r_fans_group_info != null) {
            sb.append(", r_fans_group_info=").append(this.r_fans_group_info);
        }
        if (this.with_commerce_enterprise_tab_entry != null) {
            sb.append(", with_commerce_enterprise_tab_entry=").append(this.with_commerce_enterprise_tab_entry);
        }
        if (this.honor_info != null) {
            sb.append(", honor_info=").append(this.honor_info);
        }
        if (this.comment_filter_status != null) {
            sb.append(", comment_filter_status=").append(this.comment_filter_status);
        }
        if (this.notify_private_account != null) {
            sb.append(", notify_private_account=").append(this.notify_private_account);
        }
        if (this.avatar_168x168 != null) {
            sb.append(", avatar_168x168=").append(this.avatar_168x168);
        }
        if (this.avatar_300x300 != null) {
            sb.append(", avatar_300x300=").append(this.avatar_300x300);
        }
        if (this.is_blocked != null) {
            sb.append(", is_blocked=").append(this.is_blocked);
        }
        if (this.force_private_account != null) {
            sb.append(", force_private_account=").append(this.force_private_account);
        }
        if (this.with_star_atlas_entry != null) {
            sb.append(", with_star_atlas_entry=").append(this.with_star_atlas_entry);
        }
        if (this.sprint_support_user_info != null) {
            sb.append(", sprint_support_user_info=").append(this.sprint_support_user_info);
        }
        if (this.signature_language != null) {
            sb.append(", signature_language=").append(this.signature_language);
        }
        if (this.brand_info != null) {
            sb.append(", brand_info=").append(this.brand_info);
        }
        if (this.display_wvalantine_activity_entry != null) {
            sb.append(", display_wvalantine_activity_entry=").append(this.display_wvalantine_activity_entry);
        }
        if (this.shop_micro_app != null) {
            sb.append(", shop_micro_app=").append(this.shop_micro_app);
        }
        if (this.commerce_user_info != null) {
            sb.append(", commerce_user_info=").append(this.commerce_user_info);
        }
        if (!this.relative_users.isEmpty()) {
            sb.append(", relative_users=").append(this.relative_users);
        }
        if (this.quick_shop_info != null) {
            sb.append(", quick_shop_info=").append(this.quick_shop_info);
        }
        if (!this.cha_list.isEmpty()) {
            sb.append(", cha_list=").append(this.cha_list);
        }
        if (this.is_minor != null) {
            sb.append(", is_minor=").append(this.is_minor);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.recommend_score != null) {
            sb.append(", recommend_score=").append(this.recommend_score);
        }
        if (this.general_permission != null) {
            sb.append(", general_permission=").append(this.general_permission);
        }
        if (this.birthday_hide_level != null) {
            sb.append(", birthday_hide_level=").append(this.birthday_hide_level);
        }
        if (this.bio_url != null) {
            sb.append(", bio_url=").append(this.bio_url);
        }
        if (this.bio_email != null) {
            sb.append(", bio_email=").append(this.bio_email);
        }
        if (this.latest_order_time != null) {
            sb.append(", latest_order_time=").append(this.latest_order_time);
        }
        if (this.is_pro_account != null) {
            sb.append(", is_pro_account=").append(this.is_pro_account);
        }
        if (this.email != null) {
            sb.append(", email=").append(this.email);
        }
        if (this.is_email_verified != null) {
            sb.append(", is_email_verified=").append(this.is_email_verified);
        }
        if (this.bio_secure_url != null) {
            sb.append(", bio_secure_url=").append(this.bio_secure_url);
        }
        if (this.collect_count != null) {
            sb.append(", collect_count=").append(this.collect_count);
        }
        if (this.nickname_update_reminder != null) {
            sb.append(", nickname_update_reminder=").append(this.nickname_update_reminder);
        }
        if (this.avatar_update_reminder != null) {
            sb.append(", avatar_update_reminder=").append(this.avatar_update_reminder);
        }
        if (this.is_activity_user != null) {
            sb.append(", is_activity_user=").append(this.is_activity_user);
        }
        if (this.room_data != null) {
            sb.append(", room_data=").append(this.room_data);
        }
        if (this.video_unread_info != null) {
            sb.append(", video_unread_info=").append(this.video_unread_info);
        }
        if (this.is_life_style != null) {
            sb.append(", is_life_style=").append(this.is_life_style);
        }
        if (this.stitch_setting != null) {
            sb.append(", stitch_setting=").append(this.stitch_setting);
        }
        if (this.qa_status != null) {
            sb.append(", qa_status=").append(this.qa_status);
        }
        if (this.badge_info != null) {
            sb.append(", badge_info=").append(this.badge_info);
        }
        if (this.social_info != null) {
            sb.append(", social_info=").append(this.social_info);
        }
        if (this.story_status != null) {
            sb.append(", story_status=").append(this.story_status);
        }
        if (this.matched_friend != null) {
            sb.append(", matched_friend=").append(this.matched_friend);
        }
        return sb.replace(0, 2, "UserStructV2{").append('}').toString();
    }

    static final class ProtoAdapter_UserStructV2 extends ProtoAdapter<UserStructV2> {
        static {
            Covode.recordClassIndex(102259);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UserStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.short_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.nickname(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.gender(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.signature(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.avatar_larger(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.avatar_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.avatar_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.birthday(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 50:
                        case 51:
                        case 52:
                        case 57:
                        case AudiencePingIntervalSetting.DEFAULT:
                        case 63:
                        case 66:
                        case 85:
                        case 90:
                        case 95:
                        case 96:
                        case a.f41622a:
                        case 104:
                        case 117:
                        case 118:
                        case 125:
                        case 129:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 159:
                        case 166:
                        case 188:
                        case 193:
                        case 194:
                        case 201:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.follow_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.aweme_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.following_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.follower_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.favoriting_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.total_favorited(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.is_block(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case v.U:
                            builder.hide_search(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 25:
                            builder.custom_verify(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            builder.unique_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 27:
                            builder.bind_phone(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 28:
                            builder.special_lock(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 29:
                            builder.need_recommend(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 36:
                            builder.recommend_reason(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 37:
                            builder.has_facebook_token(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 38:
                            builder.has_twitter_token(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 39:
                            builder.fb_expire_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 40:
                            builder.tw_expire_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 41:
                            builder.has_youtube_token(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 42:
                            builder.youtube_expire_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 43:
                            builder.room_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case com.appsflyer.BuildConfig.VERSION_CODE:
                            builder.live_verify(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 45:
                            builder.authority_status(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 46:
                            builder.verify_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 47:
                            builder.shield_follow_notice(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 48:
                            builder.shield_digg_notice(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 49:
                            builder.shield_comment_notice(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 53:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 54:
                            builder.with_commerce_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 55:
                            builder.verification_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 56:
                            builder.original_musician(OriginalMusicianStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 58:
                            builder.enterprise_verify_reason(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 59:
                            builder.is_ad_fake(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 61:
                            builder.mplatform_followers_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 62:
                            builder.followers_detail.add(FollowersDetailV2.ADAPTER.decode(protoReader));
                            break;
                        case 64:
                            builder.region(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 65:
                            builder.account_region(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 67:
                            builder.commerce_user_level(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 68:
                            builder.commerce_info(CommerceInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 69:
                            builder.live_agreement(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 70:
                            builder.platform_sync_info.add(PlatformSyncStatusStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 71:
                            builder.with_shop_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 72:
                            builder.is_discipline_member(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 73:
                            builder.secret(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 74:
                            builder.has_orders(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 75:
                            builder.prevent_download(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 76:
                            builder.show_image_bubble(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 77:
                            builder.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 78:
                            builder.unique_id_modify_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 79:
                            builder.video_icon(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 80:
                            builder.ins_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 81:
                            builder.google_account(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 82:
                            builder.youtube_channel_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 83:
                            builder.youtube_channel_title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 84:
                            builder.apple_account(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 86:
                            builder.with_fusion_shop_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 87:
                            builder.is_phone_binded(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 88:
                            builder.login_platform(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 89:
                            builder.accept_private_policy(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 91:
                            builder.twitter_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 92:
                            builder.twitter_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 93:
                            builder.user_canceled(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 94:
                            builder.has_email(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 97:
                            builder.live_agreement_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 98:
                            builder.register_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 99:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 101:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 102:
                            builder.avatar_uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 103:
                            builder.follower_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 105:
                            builder.comment_setting(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 106:
                            builder.duet_setting(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 107:
                            builder.reflow_page_gid(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 108:
                            builder.reflow_page_uid(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 109:
                            builder.user_rate(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 110:
                            builder.with_new_goods(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 111:
                            builder.is_flowcard_member(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 112:
                            builder.room_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 113:
                            builder.download_setting(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 114:
                            builder.download_prompt_ts(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 115:
                            builder.react_setting(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 116:
                            builder.live_commerce(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 119:
                            builder.country(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 120:
                            builder.province(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 121:
                            builder.city(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 122:
                            builder.cover_url.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 123:
                            builder.recommend_reason_relation(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 124:
                            builder.iso_country_code(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 126:
                            builder.district(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 127:
                            builder.language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 128:
                            builder.room_type_tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 130:
                            builder.has_insights(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 131:
                            builder.remark_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 132:
                            builder.video_icon_virtual_URI(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 133:
                            builder.share_qrcode_uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 134:
                            builder.profile_tab_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 135:
                            builder.avatar_decoration(AvatarDecorationStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 136:
                            builder.watch_status(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 137:
                            builder.with_commerce_newbie_task(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 138:
                            builder.with_item_commerce_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 139:
                            builder.star_billboard_rank(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 140:
                            builder.education(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 141:
                            builder.can_modify_school_info(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 142:
                            builder.school_visible(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 143:
                            builder.avatar_pendant_larger(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 144:
                            builder.avatar_pendant_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 145:
                            builder.avatar_pendant_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 146:
                            builder.item_list.add(RecommendItemStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 147:
                            builder.user_mode(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 148:
                            builder.user_period(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 149:
                            builder.is_effect_artist(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 150:
                            builder.effect_detail(EffectArtistStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 151:
                            builder.commerce_permissions(CommercePermissionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 152:
                            builder.life_story_block(LifeStoryBlockStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 153:
                            builder.hide_following_follower_list(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 158:
                            builder.is_star(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 160:
                            builder.cv_level(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 161:
                            builder.creator_level(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 162:
                            builder.is_mirror(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 163:
                            builder.pr_exempt(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 164:
                            builder.type_label.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 165:
                            builder.avatar_decoration_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 167:
                            builder.ad_cover_url.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 168:
                            builder.ad_cover_title(AdCoverTitleV2.ADAPTER.decode(protoReader));
                            break;
                        case 169:
                            builder.ad_order_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 170:
                            builder.r_fans_group_info(RFansGroupInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 171:
                            builder.with_commerce_enterprise_tab_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 172:
                            builder.honor_info(LiveHonorStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 173:
                            builder.comment_filter_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 174:
                            builder.notify_private_account(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 175:
                            builder.avatar_168x168(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 176:
                            builder.avatar_300x300(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 177:
                            builder.is_blocked(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 178:
                            builder.force_private_account(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 179:
                            builder.with_star_atlas_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case LiveFeedRefreshTimeSetting.DEFAULT:
                            builder.sprint_support_user_info(HotsearchSprintStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 181:
                            builder.signature_language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 182:
                            builder.brand_info(BlueVBrandInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 183:
                            builder.display_wvalantine_activity_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 184:
                            builder.shop_micro_app(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 185:
                            builder.commerce_user_info(CommerceUserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 186:
                            builder.relative_users.add(RelativeUserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 187:
                            builder.quick_shop_info(QuickShopStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 189:
                            builder.cha_list.add(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BuildConfig.VERSION_CODE:
                            builder.is_minor(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 191:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 192:
                            builder.recommend_score(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 195:
                            builder.general_permission(PermissionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 196:
                            builder.birthday_hide_level(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 197:
                            builder.bio_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 198:
                            builder.bio_email(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 199:
                            builder.latest_order_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 200:
                            builder.is_pro_account(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 202:
                            builder.email(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 203:
                            builder.is_email_verified(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 204:
                            builder.bio_secure_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 205:
                            builder.collect_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 206:
                            builder.nickname_update_reminder(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 207:
                            builder.avatar_update_reminder(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 208:
                            builder.is_activity_user(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 209:
                            builder.room_data(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 210:
                            builder.video_unread_info(VideoUnreadStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 211:
                            builder.is_life_style(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 212:
                            builder.stitch_setting(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 213:
                            builder.qa_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 214:
                            builder.badge_info(ProfileBadgeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 215:
                            builder.social_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 216:
                            builder.story_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 217:
                            builder.matched_friend(MatchedFriendStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public ProtoAdapter_UserStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UserStructV2.class);
        }

        public final int encodedSize(UserStructV2 userStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, userStructV2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, userStructV2.short_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, userStructV2.nickname) + ProtoAdapter.INT32.encodedSizeWithTag(4, userStructV2.gender) + ProtoAdapter.STRING.encodedSizeWithTag(5, userStructV2.signature) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, userStructV2.avatar_larger) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, userStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, userStructV2.avatar_medium) + ProtoAdapter.STRING.encodedSizeWithTag(9, userStructV2.birthday) + ProtoAdapter.INT32.encodedSizeWithTag(12, userStructV2.follow_status) + ProtoAdapter.INT32.encodedSizeWithTag(13, userStructV2.aweme_count) + ProtoAdapter.INT32.encodedSizeWithTag(14, userStructV2.following_count) + ProtoAdapter.INT32.encodedSizeWithTag(15, userStructV2.follower_count) + ProtoAdapter.INT32.encodedSizeWithTag(16, userStructV2.favoriting_count) + ProtoAdapter.INT32.encodedSizeWithTag(17, userStructV2.total_favorited) + ProtoAdapter.BOOL.encodedSizeWithTag(18, userStructV2.is_block) + ProtoAdapter.BOOL.encodedSizeWithTag(20, userStructV2.hide_search) + ProtoAdapter.STRING.encodedSizeWithTag(25, userStructV2.custom_verify) + ProtoAdapter.STRING.encodedSizeWithTag(26, userStructV2.unique_id) + ProtoAdapter.STRING.encodedSizeWithTag(27, userStructV2.bind_phone) + ProtoAdapter.INT32.encodedSizeWithTag(28, userStructV2.special_lock) + ProtoAdapter.INT32.encodedSizeWithTag(29, userStructV2.need_recommend) + ProtoAdapter.STRING.encodedSizeWithTag(36, userStructV2.recommend_reason) + ProtoAdapter.BOOL.encodedSizeWithTag(37, userStructV2.has_facebook_token) + ProtoAdapter.BOOL.encodedSizeWithTag(38, userStructV2.has_twitter_token) + ProtoAdapter.INT32.encodedSizeWithTag(39, userStructV2.fb_expire_time) + ProtoAdapter.INT32.encodedSizeWithTag(40, userStructV2.tw_expire_time) + ProtoAdapter.BOOL.encodedSizeWithTag(41, userStructV2.has_youtube_token) + ProtoAdapter.INT32.encodedSizeWithTag(42, userStructV2.youtube_expire_time) + ProtoAdapter.INT64.encodedSizeWithTag(43, userStructV2.room_id) + ProtoAdapter.INT32.encodedSizeWithTag(44, userStructV2.live_verify) + ProtoAdapter.INT64.encodedSizeWithTag(45, userStructV2.authority_status) + ProtoAdapter.STRING.encodedSizeWithTag(46, userStructV2.verify_info) + ProtoAdapter.INT32.encodedSizeWithTag(47, userStructV2.shield_follow_notice) + ProtoAdapter.INT32.encodedSizeWithTag(48, userStructV2.shield_digg_notice) + ProtoAdapter.INT32.encodedSizeWithTag(49, userStructV2.shield_comment_notice) + ShareStructV2.ADAPTER.encodedSizeWithTag(53, userStructV2.share_info) + ProtoAdapter.BOOL.encodedSizeWithTag(54, userStructV2.with_commerce_entry) + ProtoAdapter.INT32.encodedSizeWithTag(55, userStructV2.verification_type) + OriginalMusicianStructV2.ADAPTER.encodedSizeWithTag(56, userStructV2.original_musician) + ProtoAdapter.STRING.encodedSizeWithTag(58, userStructV2.enterprise_verify_reason) + ProtoAdapter.BOOL.encodedSizeWithTag(59, userStructV2.is_ad_fake) + ProtoAdapter.INT32.encodedSizeWithTag(61, userStructV2.mplatform_followers_count) + FollowersDetailV2.ADAPTER.asRepeated().encodedSizeWithTag(62, userStructV2.followers_detail) + ProtoAdapter.STRING.encodedSizeWithTag(64, userStructV2.region) + ProtoAdapter.STRING.encodedSizeWithTag(65, userStructV2.account_region) + ProtoAdapter.INT32.encodedSizeWithTag(67, userStructV2.commerce_user_level) + CommerceInfoStructV2.ADAPTER.encodedSizeWithTag(68, userStructV2.commerce_info) + ProtoAdapter.INT32.encodedSizeWithTag(69, userStructV2.live_agreement) + PlatformSyncStatusStructV2.ADAPTER.asRepeated().encodedSizeWithTag(70, userStructV2.platform_sync_info) + ProtoAdapter.BOOL.encodedSizeWithTag(71, userStructV2.with_shop_entry) + ProtoAdapter.BOOL.encodedSizeWithTag(72, userStructV2.is_discipline_member) + ProtoAdapter.INT32.encodedSizeWithTag(73, userStructV2.secret) + ProtoAdapter.BOOL.encodedSizeWithTag(74, userStructV2.has_orders) + ProtoAdapter.BOOL.encodedSizeWithTag(75, userStructV2.prevent_download) + ProtoAdapter.BOOL.encodedSizeWithTag(76, userStructV2.show_image_bubble) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(77, userStructV2.geofencing) + ProtoAdapter.INT32.encodedSizeWithTag(78, userStructV2.unique_id_modify_time) + UrlStructV2.ADAPTER.encodedSizeWithTag(79, userStructV2.video_icon) + ProtoAdapter.STRING.encodedSizeWithTag(80, userStructV2.ins_id) + ProtoAdapter.STRING.encodedSizeWithTag(81, userStructV2.google_account) + ProtoAdapter.STRING.encodedSizeWithTag(82, userStructV2.youtube_channel_id) + ProtoAdapter.STRING.encodedSizeWithTag(83, userStructV2.youtube_channel_title) + ProtoAdapter.INT32.encodedSizeWithTag(84, userStructV2.apple_account) + ProtoAdapter.BOOL.encodedSizeWithTag(86, userStructV2.with_fusion_shop_entry) + ProtoAdapter.BOOL.encodedSizeWithTag(87, userStructV2.is_phone_binded) + ProtoAdapter.INT32.encodedSizeWithTag(88, userStructV2.login_platform) + ProtoAdapter.BOOL.encodedSizeWithTag(89, userStructV2.accept_private_policy) + ProtoAdapter.STRING.encodedSizeWithTag(91, userStructV2.twitter_id) + ProtoAdapter.STRING.encodedSizeWithTag(92, userStructV2.twitter_name) + ProtoAdapter.BOOL.encodedSizeWithTag(93, userStructV2.user_canceled) + ProtoAdapter.BOOL.encodedSizeWithTag(94, userStructV2.has_email) + ProtoAdapter.INT32.encodedSizeWithTag(97, userStructV2.live_agreement_time) + ProtoAdapter.INT64.encodedSizeWithTag(98, userStructV2.register_time) + ProtoAdapter.INT32.encodedSizeWithTag(99, userStructV2.status) + ProtoAdapter.INT64.encodedSizeWithTag(101, userStructV2.create_time) + ProtoAdapter.STRING.encodedSizeWithTag(102, userStructV2.avatar_uri) + ProtoAdapter.INT32.encodedSizeWithTag(103, userStructV2.follower_status) + ProtoAdapter.INT32.encodedSizeWithTag(105, userStructV2.comment_setting) + ProtoAdapter.INT32.encodedSizeWithTag(106, userStructV2.duet_setting) + ProtoAdapter.INT64.encodedSizeWithTag(107, userStructV2.reflow_page_gid) + ProtoAdapter.INT64.encodedSizeWithTag(108, userStructV2.reflow_page_uid) + ProtoAdapter.INT32.encodedSizeWithTag(109, userStructV2.user_rate) + ProtoAdapter.BOOL.encodedSizeWithTag(110, userStructV2.with_new_goods) + ProtoAdapter.BOOL.encodedSizeWithTag(111, userStructV2.is_flowcard_member) + UrlStructV2.ADAPTER.encodedSizeWithTag(112, userStructV2.room_cover) + ProtoAdapter.INT32.encodedSizeWithTag(113, userStructV2.download_setting) + ProtoAdapter.INT64.encodedSizeWithTag(114, userStructV2.download_prompt_ts) + ProtoAdapter.INT32.encodedSizeWithTag(115, userStructV2.react_setting) + ProtoAdapter.BOOL.encodedSizeWithTag(116, userStructV2.live_commerce) + ProtoAdapter.STRING.encodedSizeWithTag(119, userStructV2.country) + ProtoAdapter.STRING.encodedSizeWithTag(120, userStructV2.province) + ProtoAdapter.STRING.encodedSizeWithTag(121, userStructV2.city) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(122, userStructV2.cover_url) + ProtoAdapter.STRING.encodedSizeWithTag(123, userStructV2.recommend_reason_relation) + ProtoAdapter.STRING.encodedSizeWithTag(124, userStructV2.iso_country_code) + ProtoAdapter.STRING.encodedSizeWithTag(126, userStructV2.district) + ProtoAdapter.STRING.encodedSizeWithTag(127, userStructV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(128, userStructV2.room_type_tag) + ProtoAdapter.BOOL.encodedSizeWithTag(130, userStructV2.has_insights) + ProtoAdapter.STRING.encodedSizeWithTag(131, userStructV2.remark_name) + ProtoAdapter.STRING.encodedSizeWithTag(132, userStructV2.video_icon_virtual_URI) + ProtoAdapter.STRING.encodedSizeWithTag(133, userStructV2.share_qrcode_uri) + ProtoAdapter.INT32.encodedSizeWithTag(134, userStructV2.profile_tab_type) + AvatarDecorationStructV2.ADAPTER.encodedSizeWithTag(135, userStructV2.avatar_decoration) + ProtoAdapter.BOOL.encodedSizeWithTag(136, userStructV2.watch_status) + ProtoAdapter.BOOL.encodedSizeWithTag(137, userStructV2.with_commerce_newbie_task) + ProtoAdapter.BOOL.encodedSizeWithTag(138, userStructV2.with_item_commerce_entry) + ProtoAdapter.INT32.encodedSizeWithTag(139, userStructV2.star_billboard_rank) + ProtoAdapter.INT32.encodedSizeWithTag(140, userStructV2.education) + ProtoAdapter.BOOL.encodedSizeWithTag(141, userStructV2.can_modify_school_info) + ProtoAdapter.INT32.encodedSizeWithTag(142, userStructV2.school_visible) + UrlStructV2.ADAPTER.encodedSizeWithTag(143, userStructV2.avatar_pendant_larger) + UrlStructV2.ADAPTER.encodedSizeWithTag(144, userStructV2.avatar_pendant_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(145, userStructV2.avatar_pendant_medium) + RecommendItemStructV2.ADAPTER.asRepeated().encodedSizeWithTag(146, userStructV2.item_list) + ProtoAdapter.INT32.encodedSizeWithTag(147, userStructV2.user_mode) + ProtoAdapter.INT32.encodedSizeWithTag(148, userStructV2.user_period) + ProtoAdapter.BOOL.encodedSizeWithTag(149, userStructV2.is_effect_artist) + EffectArtistStructV2.ADAPTER.encodedSizeWithTag(150, userStructV2.effect_detail) + CommercePermissionStructV2.ADAPTER.encodedSizeWithTag(151, userStructV2.commerce_permissions) + LifeStoryBlockStructV2.ADAPTER.encodedSizeWithTag(152, userStructV2.life_story_block) + ProtoAdapter.INT32.encodedSizeWithTag(153, userStructV2.hide_following_follower_list) + ProtoAdapter.BOOL.encodedSizeWithTag(158, userStructV2.is_star) + ProtoAdapter.STRING.encodedSizeWithTag(160, userStructV2.cv_level) + ProtoAdapter.INT32.encodedSizeWithTag(161, userStructV2.creator_level) + ProtoAdapter.BOOL.encodedSizeWithTag(162, userStructV2.is_mirror) + ProtoAdapter.INT32.encodedSizeWithTag(163, userStructV2.pr_exempt) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(164, userStructV2.type_label) + ProtoAdapter.INT64.encodedSizeWithTag(165, userStructV2.avatar_decoration_id) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(167, userStructV2.ad_cover_url) + AdCoverTitleV2.ADAPTER.encodedSizeWithTag(168, userStructV2.ad_cover_title) + ProtoAdapter.STRING.encodedSizeWithTag(169, userStructV2.ad_order_id) + RFansGroupInfoV2.ADAPTER.encodedSizeWithTag(170, userStructV2.r_fans_group_info) + ProtoAdapter.BOOL.encodedSizeWithTag(171, userStructV2.with_commerce_enterprise_tab_entry) + LiveHonorStructV2.ADAPTER.encodedSizeWithTag(172, userStructV2.honor_info) + ProtoAdapter.INT32.encodedSizeWithTag(173, userStructV2.comment_filter_status) + ProtoAdapter.INT32.encodedSizeWithTag(174, userStructV2.notify_private_account) + UrlStructV2.ADAPTER.encodedSizeWithTag(175, userStructV2.avatar_168x168) + UrlStructV2.ADAPTER.encodedSizeWithTag(176, userStructV2.avatar_300x300) + ProtoAdapter.BOOL.encodedSizeWithTag(177, userStructV2.is_blocked) + ProtoAdapter.BOOL.encodedSizeWithTag(178, userStructV2.force_private_account) + ProtoAdapter.BOOL.encodedSizeWithTag(179, userStructV2.with_star_atlas_entry) + HotsearchSprintStructV2.ADAPTER.encodedSizeWithTag(LiveFeedRefreshTimeSetting.DEFAULT, userStructV2.sprint_support_user_info) + ProtoAdapter.STRING.encodedSizeWithTag(181, userStructV2.signature_language) + BlueVBrandInfoStructV2.ADAPTER.encodedSizeWithTag(182, userStructV2.brand_info) + ProtoAdapter.BOOL.encodedSizeWithTag(183, userStructV2.display_wvalantine_activity_entry) + ProtoAdapter.STRING.encodedSizeWithTag(184, userStructV2.shop_micro_app) + CommerceUserStructV2.ADAPTER.encodedSizeWithTag(185, userStructV2.commerce_user_info) + RelativeUserStructV2.ADAPTER.asRepeated().encodedSizeWithTag(186, userStructV2.relative_users) + QuickShopStructV2.ADAPTER.encodedSizeWithTag(187, userStructV2.quick_shop_info) + ChallengeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(189, userStructV2.cha_list) + ProtoAdapter.BOOL.encodedSizeWithTag(BuildConfig.VERSION_CODE, userStructV2.is_minor) + ProtoAdapter.STRING.encodedSizeWithTag(191, userStructV2.sec_uid) + ProtoAdapter.DOUBLE.encodedSizeWithTag(192, userStructV2.recommend_score) + PermissionStructV2.ADAPTER.encodedSizeWithTag(195, userStructV2.general_permission) + ProtoAdapter.INT32.encodedSizeWithTag(196, userStructV2.birthday_hide_level) + ProtoAdapter.STRING.encodedSizeWithTag(197, userStructV2.bio_url) + ProtoAdapter.STRING.encodedSizeWithTag(198, userStructV2.bio_email) + ProtoAdapter.INT64.encodedSizeWithTag(199, userStructV2.latest_order_time) + ProtoAdapter.BOOL.encodedSizeWithTag(200, userStructV2.is_pro_account) + ProtoAdapter.STRING.encodedSizeWithTag(202, userStructV2.email) + ProtoAdapter.BOOL.encodedSizeWithTag(203, userStructV2.is_email_verified) + ProtoAdapter.STRING.encodedSizeWithTag(204, userStructV2.bio_secure_url) + ProtoAdapter.INT32.encodedSizeWithTag(205, userStructV2.collect_count) + ProtoAdapter.BOOL.encodedSizeWithTag(206, userStructV2.nickname_update_reminder) + ProtoAdapter.BOOL.encodedSizeWithTag(207, userStructV2.avatar_update_reminder) + ProtoAdapter.BOOL.encodedSizeWithTag(208, userStructV2.is_activity_user) + ProtoAdapter.STRING.encodedSizeWithTag(209, userStructV2.room_data) + VideoUnreadStructV2.ADAPTER.encodedSizeWithTag(210, userStructV2.video_unread_info) + ProtoAdapter.BOOL.encodedSizeWithTag(211, userStructV2.is_life_style) + ProtoAdapter.INT32.encodedSizeWithTag(212, userStructV2.stitch_setting) + ProtoAdapter.INT32.encodedSizeWithTag(213, userStructV2.qa_status) + ProfileBadgeStructV2.ADAPTER.encodedSizeWithTag(214, userStructV2.badge_info) + ProtoAdapter.STRING.encodedSizeWithTag(215, userStructV2.social_info) + ProtoAdapter.INT32.encodedSizeWithTag(216, userStructV2.story_status) + MatchedFriendStructV2.ADAPTER.encodedSizeWithTag(217, userStructV2.matched_friend) + userStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UserStructV2 userStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userStructV2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userStructV2.short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, userStructV2.nickname);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, userStructV2.gender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, userStructV2.signature);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, userStructV2.avatar_larger);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, userStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, userStructV2.avatar_medium);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, userStructV2.birthday);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, userStructV2.follow_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, userStructV2.aweme_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, userStructV2.following_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, userStructV2.follower_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, userStructV2.favoriting_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, userStructV2.total_favorited);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, userStructV2.is_block);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, userStructV2.hide_search);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, userStructV2.custom_verify);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, userStructV2.unique_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, userStructV2.bind_phone);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, userStructV2.special_lock);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, userStructV2.need_recommend);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 36, userStructV2.recommend_reason);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, userStructV2.has_facebook_token);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, userStructV2.has_twitter_token);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 39, userStructV2.fb_expire_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 40, userStructV2.tw_expire_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 41, userStructV2.has_youtube_token);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 42, userStructV2.youtube_expire_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 43, userStructV2.room_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 44, userStructV2.live_verify);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 45, userStructV2.authority_status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 46, userStructV2.verify_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 47, userStructV2.shield_follow_notice);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 48, userStructV2.shield_digg_notice);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 49, userStructV2.shield_comment_notice);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 53, userStructV2.share_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 54, userStructV2.with_commerce_entry);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 55, userStructV2.verification_type);
            OriginalMusicianStructV2.ADAPTER.encodeWithTag(protoWriter, 56, userStructV2.original_musician);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 58, userStructV2.enterprise_verify_reason);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 59, userStructV2.is_ad_fake);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 61, userStructV2.mplatform_followers_count);
            FollowersDetailV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 62, userStructV2.followers_detail);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 64, userStructV2.region);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 65, userStructV2.account_region);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 67, userStructV2.commerce_user_level);
            CommerceInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 68, userStructV2.commerce_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 69, userStructV2.live_agreement);
            PlatformSyncStatusStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 70, userStructV2.platform_sync_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 71, userStructV2.with_shop_entry);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 72, userStructV2.is_discipline_member);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 73, userStructV2.secret);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 74, userStructV2.has_orders);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 75, userStructV2.prevent_download);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 76, userStructV2.show_image_bubble);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 77, userStructV2.geofencing);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 78, userStructV2.unique_id_modify_time);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 79, userStructV2.video_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 80, userStructV2.ins_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 81, userStructV2.google_account);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 82, userStructV2.youtube_channel_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 83, userStructV2.youtube_channel_title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 84, userStructV2.apple_account);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 86, userStructV2.with_fusion_shop_entry);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 87, userStructV2.is_phone_binded);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 88, userStructV2.login_platform);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 89, userStructV2.accept_private_policy);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 91, userStructV2.twitter_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 92, userStructV2.twitter_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 93, userStructV2.user_canceled);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 94, userStructV2.has_email);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 97, userStructV2.live_agreement_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 98, userStructV2.register_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 99, userStructV2.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 101, userStructV2.create_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 102, userStructV2.avatar_uri);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 103, userStructV2.follower_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 105, userStructV2.comment_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 106, userStructV2.duet_setting);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 107, userStructV2.reflow_page_gid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 108, userStructV2.reflow_page_uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 109, userStructV2.user_rate);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 110, userStructV2.with_new_goods);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 111, userStructV2.is_flowcard_member);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 112, userStructV2.room_cover);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 113, userStructV2.download_setting);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 114, userStructV2.download_prompt_ts);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 115, userStructV2.react_setting);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 116, userStructV2.live_commerce);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 119, userStructV2.country);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 120, userStructV2.province);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 121, userStructV2.city);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 122, userStructV2.cover_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 123, userStructV2.recommend_reason_relation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 124, userStructV2.iso_country_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 126, userStructV2.district);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 127, userStructV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 128, userStructV2.room_type_tag);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 130, userStructV2.has_insights);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 131, userStructV2.remark_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 132, userStructV2.video_icon_virtual_URI);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 133, userStructV2.share_qrcode_uri);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 134, userStructV2.profile_tab_type);
            AvatarDecorationStructV2.ADAPTER.encodeWithTag(protoWriter, 135, userStructV2.avatar_decoration);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 136, userStructV2.watch_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 137, userStructV2.with_commerce_newbie_task);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 138, userStructV2.with_item_commerce_entry);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 139, userStructV2.star_billboard_rank);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 140, userStructV2.education);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 141, userStructV2.can_modify_school_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 142, userStructV2.school_visible);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 143, userStructV2.avatar_pendant_larger);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 144, userStructV2.avatar_pendant_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 145, userStructV2.avatar_pendant_medium);
            RecommendItemStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 146, userStructV2.item_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 147, userStructV2.user_mode);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 148, userStructV2.user_period);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 149, userStructV2.is_effect_artist);
            EffectArtistStructV2.ADAPTER.encodeWithTag(protoWriter, 150, userStructV2.effect_detail);
            CommercePermissionStructV2.ADAPTER.encodeWithTag(protoWriter, 151, userStructV2.commerce_permissions);
            LifeStoryBlockStructV2.ADAPTER.encodeWithTag(protoWriter, 152, userStructV2.life_story_block);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 153, userStructV2.hide_following_follower_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 158, userStructV2.is_star);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 160, userStructV2.cv_level);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 161, userStructV2.creator_level);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 162, userStructV2.is_mirror);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 163, userStructV2.pr_exempt);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 164, userStructV2.type_label);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 165, userStructV2.avatar_decoration_id);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 167, userStructV2.ad_cover_url);
            AdCoverTitleV2.ADAPTER.encodeWithTag(protoWriter, 168, userStructV2.ad_cover_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 169, userStructV2.ad_order_id);
            RFansGroupInfoV2.ADAPTER.encodeWithTag(protoWriter, 170, userStructV2.r_fans_group_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 171, userStructV2.with_commerce_enterprise_tab_entry);
            LiveHonorStructV2.ADAPTER.encodeWithTag(protoWriter, 172, userStructV2.honor_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 173, userStructV2.comment_filter_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 174, userStructV2.notify_private_account);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 175, userStructV2.avatar_168x168);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 176, userStructV2.avatar_300x300);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 177, userStructV2.is_blocked);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 178, userStructV2.force_private_account);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 179, userStructV2.with_star_atlas_entry);
            HotsearchSprintStructV2.ADAPTER.encodeWithTag(protoWriter, LiveFeedRefreshTimeSetting.DEFAULT, userStructV2.sprint_support_user_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 181, userStructV2.signature_language);
            BlueVBrandInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 182, userStructV2.brand_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 183, userStructV2.display_wvalantine_activity_entry);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 184, userStructV2.shop_micro_app);
            CommerceUserStructV2.ADAPTER.encodeWithTag(protoWriter, 185, userStructV2.commerce_user_info);
            RelativeUserStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 186, userStructV2.relative_users);
            QuickShopStructV2.ADAPTER.encodeWithTag(protoWriter, 187, userStructV2.quick_shop_info);
            ChallengeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 189, userStructV2.cha_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, BuildConfig.VERSION_CODE, userStructV2.is_minor);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 191, userStructV2.sec_uid);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 192, userStructV2.recommend_score);
            PermissionStructV2.ADAPTER.encodeWithTag(protoWriter, 195, userStructV2.general_permission);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 196, userStructV2.birthday_hide_level);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 197, userStructV2.bio_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 198, userStructV2.bio_email);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 199, userStructV2.latest_order_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 200, userStructV2.is_pro_account);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 202, userStructV2.email);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 203, userStructV2.is_email_verified);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 204, userStructV2.bio_secure_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 205, userStructV2.collect_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 206, userStructV2.nickname_update_reminder);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 207, userStructV2.avatar_update_reminder);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 208, userStructV2.is_activity_user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 209, userStructV2.room_data);
            VideoUnreadStructV2.ADAPTER.encodeWithTag(protoWriter, 210, userStructV2.video_unread_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 211, userStructV2.is_life_style);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 212, userStructV2.stitch_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 213, userStructV2.qa_status);
            ProfileBadgeStructV2.ADAPTER.encodeWithTag(protoWriter, 214, userStructV2.badge_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 215, userStructV2.social_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 216, userStructV2.story_status);
            MatchedFriendStructV2.ADAPTER.encodeWithTag(protoWriter, 217, userStructV2.matched_friend);
            protoWriter.writeBytes(userStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102257);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.UserStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UserStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.short_id = this.short_id;
        builder.nickname = this.nickname;
        builder.gender = this.gender;
        builder.signature = this.signature;
        builder.avatar_larger = this.avatar_larger;
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.birthday = this.birthday;
        builder.follow_status = this.follow_status;
        builder.aweme_count = this.aweme_count;
        builder.following_count = this.following_count;
        builder.follower_count = this.follower_count;
        builder.favoriting_count = this.favoriting_count;
        builder.total_favorited = this.total_favorited;
        builder.is_block = this.is_block;
        builder.hide_search = this.hide_search;
        builder.custom_verify = this.custom_verify;
        builder.unique_id = this.unique_id;
        builder.bind_phone = this.bind_phone;
        builder.special_lock = this.special_lock;
        builder.need_recommend = this.need_recommend;
        builder.recommend_reason = this.recommend_reason;
        builder.has_facebook_token = this.has_facebook_token;
        builder.has_twitter_token = this.has_twitter_token;
        builder.fb_expire_time = this.fb_expire_time;
        builder.tw_expire_time = this.tw_expire_time;
        builder.has_youtube_token = this.has_youtube_token;
        builder.youtube_expire_time = this.youtube_expire_time;
        builder.room_id = this.room_id;
        builder.live_verify = this.live_verify;
        builder.authority_status = this.authority_status;
        builder.verify_info = this.verify_info;
        builder.shield_follow_notice = this.shield_follow_notice;
        builder.shield_digg_notice = this.shield_digg_notice;
        builder.shield_comment_notice = this.shield_comment_notice;
        builder.share_info = this.share_info;
        builder.with_commerce_entry = this.with_commerce_entry;
        builder.verification_type = this.verification_type;
        builder.original_musician = this.original_musician;
        builder.enterprise_verify_reason = this.enterprise_verify_reason;
        builder.is_ad_fake = this.is_ad_fake;
        builder.mplatform_followers_count = this.mplatform_followers_count;
        builder.followers_detail = Internal.copyOf("followers_detail", this.followers_detail);
        builder.region = this.region;
        builder.account_region = this.account_region;
        builder.commerce_user_level = this.commerce_user_level;
        builder.commerce_info = this.commerce_info;
        builder.live_agreement = this.live_agreement;
        builder.platform_sync_info = Internal.copyOf("platform_sync_info", this.platform_sync_info);
        builder.with_shop_entry = this.with_shop_entry;
        builder.is_discipline_member = this.is_discipline_member;
        builder.secret = this.secret;
        builder.has_orders = this.has_orders;
        builder.prevent_download = this.prevent_download;
        builder.show_image_bubble = this.show_image_bubble;
        builder.geofencing = Internal.copyOf("geofencing", this.geofencing);
        builder.unique_id_modify_time = this.unique_id_modify_time;
        builder.video_icon = this.video_icon;
        builder.ins_id = this.ins_id;
        builder.google_account = this.google_account;
        builder.youtube_channel_id = this.youtube_channel_id;
        builder.youtube_channel_title = this.youtube_channel_title;
        builder.apple_account = this.apple_account;
        builder.with_fusion_shop_entry = this.with_fusion_shop_entry;
        builder.is_phone_binded = this.is_phone_binded;
        builder.login_platform = this.login_platform;
        builder.accept_private_policy = this.accept_private_policy;
        builder.twitter_id = this.twitter_id;
        builder.twitter_name = this.twitter_name;
        builder.user_canceled = this.user_canceled;
        builder.has_email = this.has_email;
        builder.live_agreement_time = this.live_agreement_time;
        builder.register_time = this.register_time;
        builder.status = this.status;
        builder.create_time = this.create_time;
        builder.avatar_uri = this.avatar_uri;
        builder.follower_status = this.follower_status;
        builder.comment_setting = this.comment_setting;
        builder.duet_setting = this.duet_setting;
        builder.reflow_page_gid = this.reflow_page_gid;
        builder.reflow_page_uid = this.reflow_page_uid;
        builder.user_rate = this.user_rate;
        builder.with_new_goods = this.with_new_goods;
        builder.is_flowcard_member = this.is_flowcard_member;
        builder.room_cover = this.room_cover;
        builder.download_setting = this.download_setting;
        builder.download_prompt_ts = this.download_prompt_ts;
        builder.react_setting = this.react_setting;
        builder.live_commerce = this.live_commerce;
        builder.country = this.country;
        builder.province = this.province;
        builder.city = this.city;
        builder.cover_url = Internal.copyOf("cover_url", this.cover_url);
        builder.recommend_reason_relation = this.recommend_reason_relation;
        builder.iso_country_code = this.iso_country_code;
        builder.district = this.district;
        builder.language = this.language;
        builder.room_type_tag = this.room_type_tag;
        builder.has_insights = this.has_insights;
        builder.remark_name = this.remark_name;
        builder.video_icon_virtual_URI = this.video_icon_virtual_URI;
        builder.share_qrcode_uri = this.share_qrcode_uri;
        builder.profile_tab_type = this.profile_tab_type;
        builder.avatar_decoration = this.avatar_decoration;
        builder.watch_status = this.watch_status;
        builder.with_commerce_newbie_task = this.with_commerce_newbie_task;
        builder.with_item_commerce_entry = this.with_item_commerce_entry;
        builder.star_billboard_rank = this.star_billboard_rank;
        builder.education = this.education;
        builder.can_modify_school_info = this.can_modify_school_info;
        builder.school_visible = this.school_visible;
        builder.avatar_pendant_larger = this.avatar_pendant_larger;
        builder.avatar_pendant_thumb = this.avatar_pendant_thumb;
        builder.avatar_pendant_medium = this.avatar_pendant_medium;
        builder.item_list = Internal.copyOf("item_list", this.item_list);
        builder.user_mode = this.user_mode;
        builder.user_period = this.user_period;
        builder.is_effect_artist = this.is_effect_artist;
        builder.effect_detail = this.effect_detail;
        builder.commerce_permissions = this.commerce_permissions;
        builder.life_story_block = this.life_story_block;
        builder.hide_following_follower_list = this.hide_following_follower_list;
        builder.is_star = this.is_star;
        builder.cv_level = this.cv_level;
        builder.creator_level = this.creator_level;
        builder.is_mirror = this.is_mirror;
        builder.pr_exempt = this.pr_exempt;
        builder.type_label = Internal.copyOf("type_label", this.type_label);
        builder.avatar_decoration_id = this.avatar_decoration_id;
        builder.ad_cover_url = Internal.copyOf("ad_cover_url", this.ad_cover_url);
        builder.ad_cover_title = this.ad_cover_title;
        builder.ad_order_id = this.ad_order_id;
        builder.r_fans_group_info = this.r_fans_group_info;
        builder.with_commerce_enterprise_tab_entry = this.with_commerce_enterprise_tab_entry;
        builder.honor_info = this.honor_info;
        builder.comment_filter_status = this.comment_filter_status;
        builder.notify_private_account = this.notify_private_account;
        builder.avatar_168x168 = this.avatar_168x168;
        builder.avatar_300x300 = this.avatar_300x300;
        builder.is_blocked = this.is_blocked;
        builder.force_private_account = this.force_private_account;
        builder.with_star_atlas_entry = this.with_star_atlas_entry;
        builder.sprint_support_user_info = this.sprint_support_user_info;
        builder.signature_language = this.signature_language;
        builder.brand_info = this.brand_info;
        builder.display_wvalantine_activity_entry = this.display_wvalantine_activity_entry;
        builder.shop_micro_app = this.shop_micro_app;
        builder.commerce_user_info = this.commerce_user_info;
        builder.relative_users = Internal.copyOf("relative_users", this.relative_users);
        builder.quick_shop_info = this.quick_shop_info;
        builder.cha_list = Internal.copyOf("cha_list", this.cha_list);
        builder.is_minor = this.is_minor;
        builder.sec_uid = this.sec_uid;
        builder.recommend_score = this.recommend_score;
        builder.general_permission = this.general_permission;
        builder.birthday_hide_level = this.birthday_hide_level;
        builder.bio_url = this.bio_url;
        builder.bio_email = this.bio_email;
        builder.latest_order_time = this.latest_order_time;
        builder.is_pro_account = this.is_pro_account;
        builder.email = this.email;
        builder.is_email_verified = this.is_email_verified;
        builder.bio_secure_url = this.bio_secure_url;
        builder.collect_count = this.collect_count;
        builder.nickname_update_reminder = this.nickname_update_reminder;
        builder.avatar_update_reminder = this.avatar_update_reminder;
        builder.is_activity_user = this.is_activity_user;
        builder.room_data = this.room_data;
        builder.video_unread_info = this.video_unread_info;
        builder.is_life_style = this.is_life_style;
        builder.stitch_setting = this.stitch_setting;
        builder.qa_status = this.qa_status;
        builder.badge_info = this.badge_info;
        builder.social_info = this.social_info;
        builder.story_status = this.story_status;
        builder.matched_friend = this.matched_friend;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<UserStructV2, Builder> {
        public Boolean accept_private_policy;
        public String account_region;
        public AdCoverTitleV2 ad_cover_title;
        public List<UrlStructV2> ad_cover_url = Internal.newMutableList();
        public String ad_order_id;
        public Integer apple_account;
        public Long authority_status;
        public UrlStructV2 avatar_168x168;
        public UrlStructV2 avatar_300x300;
        public AvatarDecorationStructV2 avatar_decoration;
        public Long avatar_decoration_id;
        public UrlStructV2 avatar_larger;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_pendant_larger;
        public UrlStructV2 avatar_pendant_medium;
        public UrlStructV2 avatar_pendant_thumb;
        public UrlStructV2 avatar_thumb;
        public Boolean avatar_update_reminder;
        public String avatar_uri;
        public Integer aweme_count;
        public ProfileBadgeStructV2 badge_info;
        public String bind_phone;
        public String bio_email;
        public String bio_secure_url;
        public String bio_url;
        public String birthday;
        public Integer birthday_hide_level;
        public BlueVBrandInfoStructV2 brand_info;
        public Boolean can_modify_school_info;
        public List<ChallengeStructV2> cha_list = Internal.newMutableList();
        public String city;
        public Integer collect_count;
        public Integer comment_filter_status;
        public Integer comment_setting;
        public CommerceInfoStructV2 commerce_info;
        public CommercePermissionStructV2 commerce_permissions;
        public CommerceUserStructV2 commerce_user_info;
        public Integer commerce_user_level;
        public String country;
        public List<UrlStructV2> cover_url = Internal.newMutableList();
        public Long create_time;
        public Integer creator_level;
        public String custom_verify;
        public String cv_level;
        public Boolean display_wvalantine_activity_entry;
        public String district;
        public Long download_prompt_ts;
        public Integer download_setting;
        public Integer duet_setting;
        public Integer education;
        public EffectArtistStructV2 effect_detail;
        public String email;
        public String enterprise_verify_reason;
        public Integer favoriting_count;
        public Integer fb_expire_time;
        public Integer follow_status;
        public Integer follower_count;
        public Integer follower_status;
        public List<FollowersDetailV2> followers_detail = Internal.newMutableList();
        public Integer following_count;
        public Boolean force_private_account;
        public Integer gender;
        public PermissionStructV2 general_permission;
        public List<String> geofencing = Internal.newMutableList();
        public String google_account;
        public Boolean has_email;
        public Boolean has_facebook_token;
        public Boolean has_insights;
        public Boolean has_orders;
        public Boolean has_twitter_token;
        public Boolean has_youtube_token;
        public Integer hide_following_follower_list;
        public Boolean hide_search;
        public LiveHonorStructV2 honor_info;
        public String ins_id;
        public Boolean is_activity_user;
        public Boolean is_ad_fake;
        public Boolean is_block;
        public Boolean is_blocked;
        public Boolean is_discipline_member;
        public Boolean is_effect_artist;
        public Boolean is_email_verified;
        public Boolean is_flowcard_member;
        public Boolean is_life_style;
        public Boolean is_minor;
        public Boolean is_mirror;
        public Boolean is_phone_binded;
        public Boolean is_pro_account;
        public Boolean is_star;
        public String iso_country_code;
        public List<RecommendItemStructV2> item_list = Internal.newMutableList();
        public String language;
        public Long latest_order_time;
        public LifeStoryBlockStructV2 life_story_block;
        public Integer live_agreement;
        public Integer live_agreement_time;
        public Boolean live_commerce;
        public Integer live_verify;
        public Integer login_platform;
        public MatchedFriendStructV2 matched_friend;
        public Integer mplatform_followers_count;
        public Integer need_recommend;
        public String nickname;
        public Boolean nickname_update_reminder;
        public Integer notify_private_account;
        public OriginalMusicianStructV2 original_musician;
        public List<PlatformSyncStatusStructV2> platform_sync_info = Internal.newMutableList();
        public Integer pr_exempt;
        public Boolean prevent_download;
        public Integer profile_tab_type;
        public String province;
        public Integer qa_status;
        public QuickShopStructV2 quick_shop_info;
        public RFansGroupInfoV2 r_fans_group_info;
        public Integer react_setting;
        public String recommend_reason;
        public String recommend_reason_relation;
        public Double recommend_score;
        public Long reflow_page_gid;
        public Long reflow_page_uid;
        public String region;
        public Long register_time;
        public List<RelativeUserStructV2> relative_users = Internal.newMutableList();
        public String remark_name;
        public UrlStructV2 room_cover;
        public String room_data;
        public Long room_id;
        public String room_type_tag;
        public Integer school_visible;
        public String sec_uid;
        public Integer secret;
        public ShareStructV2 share_info;
        public String share_qrcode_uri;
        public Integer shield_comment_notice;
        public Integer shield_digg_notice;
        public Integer shield_follow_notice;
        public String shop_micro_app;
        public String short_id;
        public Boolean show_image_bubble;
        public String signature;
        public String signature_language;
        public String social_info;
        public Integer special_lock;
        public HotsearchSprintStructV2 sprint_support_user_info;
        public Integer star_billboard_rank;
        public Integer status;
        public Integer stitch_setting;
        public Integer story_status;
        public Integer total_favorited;
        public Integer tw_expire_time;
        public String twitter_id;
        public String twitter_name;
        public List<Long> type_label = Internal.newMutableList();
        public String uid;
        public String unique_id;
        public Integer unique_id_modify_time;
        public Boolean user_canceled;
        public Integer user_mode;
        public Integer user_period;
        public Integer user_rate;
        public Integer verification_type;
        public String verify_info;
        public UrlStructV2 video_icon;
        public String video_icon_virtual_URI;
        public VideoUnreadStructV2 video_unread_info;
        public Boolean watch_status;
        public Boolean with_commerce_enterprise_tab_entry;
        public Boolean with_commerce_entry;
        public Boolean with_commerce_newbie_task;
        public Boolean with_fusion_shop_entry;
        public Boolean with_item_commerce_entry;
        public Boolean with_new_goods;
        public Boolean with_shop_entry;
        public Boolean with_star_atlas_entry;
        public String youtube_channel_id;
        public String youtube_channel_title;
        public Integer youtube_expire_time;

        static {
            Covode.recordClassIndex(102258);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UserStructV2 build() {
            return new UserStructV2(this.uid, this.short_id, this.nickname, this.gender, this.signature, this.avatar_larger, this.avatar_thumb, this.avatar_medium, this.birthday, this.follow_status, this.aweme_count, this.following_count, this.follower_count, this.favoriting_count, this.total_favorited, this.is_block, this.hide_search, this.custom_verify, this.unique_id, this.bind_phone, this.special_lock, this.need_recommend, this.recommend_reason, this.has_facebook_token, this.has_twitter_token, this.fb_expire_time, this.tw_expire_time, this.has_youtube_token, this.youtube_expire_time, this.room_id, this.live_verify, this.authority_status, this.verify_info, this.shield_follow_notice, this.shield_digg_notice, this.shield_comment_notice, this.share_info, this.with_commerce_entry, this.verification_type, this.original_musician, this.enterprise_verify_reason, this.is_ad_fake, this.mplatform_followers_count, this.followers_detail, this.region, this.account_region, this.commerce_user_level, this.commerce_info, this.live_agreement, this.platform_sync_info, this.with_shop_entry, this.is_discipline_member, this.secret, this.has_orders, this.prevent_download, this.show_image_bubble, this.geofencing, this.unique_id_modify_time, this.video_icon, this.ins_id, this.google_account, this.youtube_channel_id, this.youtube_channel_title, this.apple_account, this.with_fusion_shop_entry, this.is_phone_binded, this.login_platform, this.accept_private_policy, this.twitter_id, this.twitter_name, this.user_canceled, this.has_email, this.live_agreement_time, this.register_time, this.status, this.create_time, this.avatar_uri, this.follower_status, this.comment_setting, this.duet_setting, this.reflow_page_gid, this.reflow_page_uid, this.user_rate, this.with_new_goods, this.is_flowcard_member, this.room_cover, this.download_setting, this.download_prompt_ts, this.react_setting, this.live_commerce, this.country, this.province, this.city, this.cover_url, this.recommend_reason_relation, this.iso_country_code, this.district, this.language, this.room_type_tag, this.has_insights, this.remark_name, this.video_icon_virtual_URI, this.share_qrcode_uri, this.profile_tab_type, this.avatar_decoration, this.watch_status, this.with_commerce_newbie_task, this.with_item_commerce_entry, this.star_billboard_rank, this.education, this.can_modify_school_info, this.school_visible, this.avatar_pendant_larger, this.avatar_pendant_thumb, this.avatar_pendant_medium, this.item_list, this.user_mode, this.user_period, this.is_effect_artist, this.effect_detail, this.commerce_permissions, this.life_story_block, this.hide_following_follower_list, this.is_star, this.cv_level, this.creator_level, this.is_mirror, this.pr_exempt, this.type_label, this.avatar_decoration_id, this.ad_cover_url, this.ad_cover_title, this.ad_order_id, this.r_fans_group_info, this.with_commerce_enterprise_tab_entry, this.honor_info, this.comment_filter_status, this.notify_private_account, this.avatar_168x168, this.avatar_300x300, this.is_blocked, this.force_private_account, this.with_star_atlas_entry, this.sprint_support_user_info, this.signature_language, this.brand_info, this.display_wvalantine_activity_entry, this.shop_micro_app, this.commerce_user_info, this.relative_users, this.quick_shop_info, this.cha_list, this.is_minor, this.sec_uid, this.recommend_score, this.general_permission, this.birthday_hide_level, this.bio_url, this.bio_email, this.latest_order_time, this.is_pro_account, this.email, this.is_email_verified, this.bio_secure_url, this.collect_count, this.nickname_update_reminder, this.avatar_update_reminder, this.is_activity_user, this.room_data, this.video_unread_info, this.is_life_style, this.stitch_setting, this.qa_status, this.badge_info, this.social_info, this.story_status, this.matched_friend, super.buildUnknownFields());
        }

        public final Builder accept_private_policy(Boolean bool) {
            this.accept_private_policy = bool;
            return this;
        }

        public final Builder account_region(String str) {
            this.account_region = str;
            return this;
        }

        public final Builder ad_cover_title(AdCoverTitleV2 adCoverTitleV2) {
            this.ad_cover_title = adCoverTitleV2;
            return this;
        }

        public final Builder ad_order_id(String str) {
            this.ad_order_id = str;
            return this;
        }

        public final Builder apple_account(Integer num) {
            this.apple_account = num;
            return this;
        }

        public final Builder authority_status(Long l2) {
            this.authority_status = l2;
            return this;
        }

        public final Builder avatar_168x168(UrlStructV2 urlStructV2) {
            this.avatar_168x168 = urlStructV2;
            return this;
        }

        public final Builder avatar_300x300(UrlStructV2 urlStructV2) {
            this.avatar_300x300 = urlStructV2;
            return this;
        }

        public final Builder avatar_decoration(AvatarDecorationStructV2 avatarDecorationStructV2) {
            this.avatar_decoration = avatarDecorationStructV2;
            return this;
        }

        public final Builder avatar_decoration_id(Long l2) {
            this.avatar_decoration_id = l2;
            return this;
        }

        public final Builder avatar_larger(UrlStructV2 urlStructV2) {
            this.avatar_larger = urlStructV2;
            return this;
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_pendant_larger(UrlStructV2 urlStructV2) {
            this.avatar_pendant_larger = urlStructV2;
            return this;
        }

        public final Builder avatar_pendant_medium(UrlStructV2 urlStructV2) {
            this.avatar_pendant_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_pendant_thumb(UrlStructV2 urlStructV2) {
            this.avatar_pendant_thumb = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder avatar_update_reminder(Boolean bool) {
            this.avatar_update_reminder = bool;
            return this;
        }

        public final Builder avatar_uri(String str) {
            this.avatar_uri = str;
            return this;
        }

        public final Builder aweme_count(Integer num) {
            this.aweme_count = num;
            return this;
        }

        public final Builder badge_info(ProfileBadgeStructV2 profileBadgeStructV2) {
            this.badge_info = profileBadgeStructV2;
            return this;
        }

        public final Builder bind_phone(String str) {
            this.bind_phone = str;
            return this;
        }

        public final Builder bio_email(String str) {
            this.bio_email = str;
            return this;
        }

        public final Builder bio_secure_url(String str) {
            this.bio_secure_url = str;
            return this;
        }

        public final Builder bio_url(String str) {
            this.bio_url = str;
            return this;
        }

        public final Builder birthday(String str) {
            this.birthday = str;
            return this;
        }

        public final Builder birthday_hide_level(Integer num) {
            this.birthday_hide_level = num;
            return this;
        }

        public final Builder brand_info(BlueVBrandInfoStructV2 blueVBrandInfoStructV2) {
            this.brand_info = blueVBrandInfoStructV2;
            return this;
        }

        public final Builder can_modify_school_info(Boolean bool) {
            this.can_modify_school_info = bool;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder collect_count(Integer num) {
            this.collect_count = num;
            return this;
        }

        public final Builder comment_filter_status(Integer num) {
            this.comment_filter_status = num;
            return this;
        }

        public final Builder comment_setting(Integer num) {
            this.comment_setting = num;
            return this;
        }

        public final Builder commerce_info(CommerceInfoStructV2 commerceInfoStructV2) {
            this.commerce_info = commerceInfoStructV2;
            return this;
        }

        public final Builder commerce_permissions(CommercePermissionStructV2 commercePermissionStructV2) {
            this.commerce_permissions = commercePermissionStructV2;
            return this;
        }

        public final Builder commerce_user_info(CommerceUserStructV2 commerceUserStructV2) {
            this.commerce_user_info = commerceUserStructV2;
            return this;
        }

        public final Builder commerce_user_level(Integer num) {
            this.commerce_user_level = num;
            return this;
        }

        public final Builder country(String str) {
            this.country = str;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder creator_level(Integer num) {
            this.creator_level = num;
            return this;
        }

        public final Builder custom_verify(String str) {
            this.custom_verify = str;
            return this;
        }

        public final Builder cv_level(String str) {
            this.cv_level = str;
            return this;
        }

        public final Builder display_wvalantine_activity_entry(Boolean bool) {
            this.display_wvalantine_activity_entry = bool;
            return this;
        }

        public final Builder district(String str) {
            this.district = str;
            return this;
        }

        public final Builder download_prompt_ts(Long l2) {
            this.download_prompt_ts = l2;
            return this;
        }

        public final Builder download_setting(Integer num) {
            this.download_setting = num;
            return this;
        }

        public final Builder duet_setting(Integer num) {
            this.duet_setting = num;
            return this;
        }

        public final Builder education(Integer num) {
            this.education = num;
            return this;
        }

        public final Builder effect_detail(EffectArtistStructV2 effectArtistStructV2) {
            this.effect_detail = effectArtistStructV2;
            return this;
        }

        public final Builder email(String str) {
            this.email = str;
            return this;
        }

        public final Builder enterprise_verify_reason(String str) {
            this.enterprise_verify_reason = str;
            return this;
        }

        public final Builder favoriting_count(Integer num) {
            this.favoriting_count = num;
            return this;
        }

        public final Builder fb_expire_time(Integer num) {
            this.fb_expire_time = num;
            return this;
        }

        public final Builder follow_status(Integer num) {
            this.follow_status = num;
            return this;
        }

        public final Builder follower_count(Integer num) {
            this.follower_count = num;
            return this;
        }

        public final Builder follower_status(Integer num) {
            this.follower_status = num;
            return this;
        }

        public final Builder following_count(Integer num) {
            this.following_count = num;
            return this;
        }

        public final Builder force_private_account(Boolean bool) {
            this.force_private_account = bool;
            return this;
        }

        public final Builder gender(Integer num) {
            this.gender = num;
            return this;
        }

        public final Builder general_permission(PermissionStructV2 permissionStructV2) {
            this.general_permission = permissionStructV2;
            return this;
        }

        public final Builder google_account(String str) {
            this.google_account = str;
            return this;
        }

        public final Builder has_email(Boolean bool) {
            this.has_email = bool;
            return this;
        }

        public final Builder has_facebook_token(Boolean bool) {
            this.has_facebook_token = bool;
            return this;
        }

        public final Builder has_insights(Boolean bool) {
            this.has_insights = bool;
            return this;
        }

        public final Builder has_orders(Boolean bool) {
            this.has_orders = bool;
            return this;
        }

        public final Builder has_twitter_token(Boolean bool) {
            this.has_twitter_token = bool;
            return this;
        }

        public final Builder has_youtube_token(Boolean bool) {
            this.has_youtube_token = bool;
            return this;
        }

        public final Builder hide_following_follower_list(Integer num) {
            this.hide_following_follower_list = num;
            return this;
        }

        public final Builder hide_search(Boolean bool) {
            this.hide_search = bool;
            return this;
        }

        public final Builder honor_info(LiveHonorStructV2 liveHonorStructV2) {
            this.honor_info = liveHonorStructV2;
            return this;
        }

        public final Builder ins_id(String str) {
            this.ins_id = str;
            return this;
        }

        public final Builder is_activity_user(Boolean bool) {
            this.is_activity_user = bool;
            return this;
        }

        public final Builder is_ad_fake(Boolean bool) {
            this.is_ad_fake = bool;
            return this;
        }

        public final Builder is_block(Boolean bool) {
            this.is_block = bool;
            return this;
        }

        public final Builder is_blocked(Boolean bool) {
            this.is_blocked = bool;
            return this;
        }

        public final Builder is_discipline_member(Boolean bool) {
            this.is_discipline_member = bool;
            return this;
        }

        public final Builder is_effect_artist(Boolean bool) {
            this.is_effect_artist = bool;
            return this;
        }

        public final Builder is_email_verified(Boolean bool) {
            this.is_email_verified = bool;
            return this;
        }

        public final Builder is_flowcard_member(Boolean bool) {
            this.is_flowcard_member = bool;
            return this;
        }

        public final Builder is_life_style(Boolean bool) {
            this.is_life_style = bool;
            return this;
        }

        public final Builder is_minor(Boolean bool) {
            this.is_minor = bool;
            return this;
        }

        public final Builder is_mirror(Boolean bool) {
            this.is_mirror = bool;
            return this;
        }

        public final Builder is_phone_binded(Boolean bool) {
            this.is_phone_binded = bool;
            return this;
        }

        public final Builder is_pro_account(Boolean bool) {
            this.is_pro_account = bool;
            return this;
        }

        public final Builder is_star(Boolean bool) {
            this.is_star = bool;
            return this;
        }

        public final Builder iso_country_code(String str) {
            this.iso_country_code = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }

        public final Builder latest_order_time(Long l2) {
            this.latest_order_time = l2;
            return this;
        }

        public final Builder life_story_block(LifeStoryBlockStructV2 lifeStoryBlockStructV2) {
            this.life_story_block = lifeStoryBlockStructV2;
            return this;
        }

        public final Builder live_agreement(Integer num) {
            this.live_agreement = num;
            return this;
        }

        public final Builder live_agreement_time(Integer num) {
            this.live_agreement_time = num;
            return this;
        }

        public final Builder live_commerce(Boolean bool) {
            this.live_commerce = bool;
            return this;
        }

        public final Builder live_verify(Integer num) {
            this.live_verify = num;
            return this;
        }

        public final Builder login_platform(Integer num) {
            this.login_platform = num;
            return this;
        }

        public final Builder matched_friend(MatchedFriendStructV2 matchedFriendStructV2) {
            this.matched_friend = matchedFriendStructV2;
            return this;
        }

        public final Builder mplatform_followers_count(Integer num) {
            this.mplatform_followers_count = num;
            return this;
        }

        public final Builder need_recommend(Integer num) {
            this.need_recommend = num;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder nickname_update_reminder(Boolean bool) {
            this.nickname_update_reminder = bool;
            return this;
        }

        public final Builder notify_private_account(Integer num) {
            this.notify_private_account = num;
            return this;
        }

        public final Builder original_musician(OriginalMusicianStructV2 originalMusicianStructV2) {
            this.original_musician = originalMusicianStructV2;
            return this;
        }

        public final Builder pr_exempt(Integer num) {
            this.pr_exempt = num;
            return this;
        }

        public final Builder prevent_download(Boolean bool) {
            this.prevent_download = bool;
            return this;
        }

        public final Builder profile_tab_type(Integer num) {
            this.profile_tab_type = num;
            return this;
        }

        public final Builder province(String str) {
            this.province = str;
            return this;
        }

        public final Builder qa_status(Integer num) {
            this.qa_status = num;
            return this;
        }

        public final Builder quick_shop_info(QuickShopStructV2 quickShopStructV2) {
            this.quick_shop_info = quickShopStructV2;
            return this;
        }

        public final Builder r_fans_group_info(RFansGroupInfoV2 rFansGroupInfoV2) {
            this.r_fans_group_info = rFansGroupInfoV2;
            return this;
        }

        public final Builder react_setting(Integer num) {
            this.react_setting = num;
            return this;
        }

        public final Builder recommend_reason(String str) {
            this.recommend_reason = str;
            return this;
        }

        public final Builder recommend_reason_relation(String str) {
            this.recommend_reason_relation = str;
            return this;
        }

        public final Builder recommend_score(Double d2) {
            this.recommend_score = d2;
            return this;
        }

        public final Builder reflow_page_gid(Long l2) {
            this.reflow_page_gid = l2;
            return this;
        }

        public final Builder reflow_page_uid(Long l2) {
            this.reflow_page_uid = l2;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder register_time(Long l2) {
            this.register_time = l2;
            return this;
        }

        public final Builder remark_name(String str) {
            this.remark_name = str;
            return this;
        }

        public final Builder room_cover(UrlStructV2 urlStructV2) {
            this.room_cover = urlStructV2;
            return this;
        }

        public final Builder room_data(String str) {
            this.room_data = str;
            return this;
        }

        public final Builder room_id(Long l2) {
            this.room_id = l2;
            return this;
        }

        public final Builder room_type_tag(String str) {
            this.room_type_tag = str;
            return this;
        }

        public final Builder school_visible(Integer num) {
            this.school_visible = num;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder secret(Integer num) {
            this.secret = num;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder share_qrcode_uri(String str) {
            this.share_qrcode_uri = str;
            return this;
        }

        public final Builder shield_comment_notice(Integer num) {
            this.shield_comment_notice = num;
            return this;
        }

        public final Builder shield_digg_notice(Integer num) {
            this.shield_digg_notice = num;
            return this;
        }

        public final Builder shield_follow_notice(Integer num) {
            this.shield_follow_notice = num;
            return this;
        }

        public final Builder shop_micro_app(String str) {
            this.shop_micro_app = str;
            return this;
        }

        public final Builder short_id(String str) {
            this.short_id = str;
            return this;
        }

        public final Builder show_image_bubble(Boolean bool) {
            this.show_image_bubble = bool;
            return this;
        }

        public final Builder signature(String str) {
            this.signature = str;
            return this;
        }

        public final Builder signature_language(String str) {
            this.signature_language = str;
            return this;
        }

        public final Builder social_info(String str) {
            this.social_info = str;
            return this;
        }

        public final Builder special_lock(Integer num) {
            this.special_lock = num;
            return this;
        }

        public final Builder sprint_support_user_info(HotsearchSprintStructV2 hotsearchSprintStructV2) {
            this.sprint_support_user_info = hotsearchSprintStructV2;
            return this;
        }

        public final Builder star_billboard_rank(Integer num) {
            this.star_billboard_rank = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder stitch_setting(Integer num) {
            this.stitch_setting = num;
            return this;
        }

        public final Builder story_status(Integer num) {
            this.story_status = num;
            return this;
        }

        public final Builder total_favorited(Integer num) {
            this.total_favorited = num;
            return this;
        }

        public final Builder tw_expire_time(Integer num) {
            this.tw_expire_time = num;
            return this;
        }

        public final Builder twitter_id(String str) {
            this.twitter_id = str;
            return this;
        }

        public final Builder twitter_name(String str) {
            this.twitter_name = str;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }

        public final Builder unique_id(String str) {
            this.unique_id = str;
            return this;
        }

        public final Builder unique_id_modify_time(Integer num) {
            this.unique_id_modify_time = num;
            return this;
        }

        public final Builder user_canceled(Boolean bool) {
            this.user_canceled = bool;
            return this;
        }

        public final Builder user_mode(Integer num) {
            this.user_mode = num;
            return this;
        }

        public final Builder user_period(Integer num) {
            this.user_period = num;
            return this;
        }

        public final Builder user_rate(Integer num) {
            this.user_rate = num;
            return this;
        }

        public final Builder verification_type(Integer num) {
            this.verification_type = num;
            return this;
        }

        public final Builder verify_info(String str) {
            this.verify_info = str;
            return this;
        }

        public final Builder video_icon(UrlStructV2 urlStructV2) {
            this.video_icon = urlStructV2;
            return this;
        }

        public final Builder video_icon_virtual_URI(String str) {
            this.video_icon_virtual_URI = str;
            return this;
        }

        public final Builder video_unread_info(VideoUnreadStructV2 videoUnreadStructV2) {
            this.video_unread_info = videoUnreadStructV2;
            return this;
        }

        public final Builder watch_status(Boolean bool) {
            this.watch_status = bool;
            return this;
        }

        public final Builder with_commerce_enterprise_tab_entry(Boolean bool) {
            this.with_commerce_enterprise_tab_entry = bool;
            return this;
        }

        public final Builder with_commerce_entry(Boolean bool) {
            this.with_commerce_entry = bool;
            return this;
        }

        public final Builder with_commerce_newbie_task(Boolean bool) {
            this.with_commerce_newbie_task = bool;
            return this;
        }

        public final Builder with_fusion_shop_entry(Boolean bool) {
            this.with_fusion_shop_entry = bool;
            return this;
        }

        public final Builder with_item_commerce_entry(Boolean bool) {
            this.with_item_commerce_entry = bool;
            return this;
        }

        public final Builder with_new_goods(Boolean bool) {
            this.with_new_goods = bool;
            return this;
        }

        public final Builder with_shop_entry(Boolean bool) {
            this.with_shop_entry = bool;
            return this;
        }

        public final Builder with_star_atlas_entry(Boolean bool) {
            this.with_star_atlas_entry = bool;
            return this;
        }

        public final Builder youtube_channel_id(String str) {
            this.youtube_channel_id = str;
            return this;
        }

        public final Builder youtube_channel_title(String str) {
            this.youtube_channel_title = str;
            return this;
        }

        public final Builder youtube_expire_time(Integer num) {
            this.youtube_expire_time = num;
            return this;
        }

        public final Builder ad_cover_url(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.ad_cover_url = list;
            return this;
        }

        public final Builder cha_list(List<ChallengeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.cha_list = list;
            return this;
        }

        public final Builder cover_url(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.cover_url = list;
            return this;
        }

        public final Builder followers_detail(List<FollowersDetailV2> list) {
            Internal.checkElementsNotNull(list);
            this.followers_detail = list;
            return this;
        }

        public final Builder geofencing(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.geofencing = list;
            return this;
        }

        public final Builder item_list(List<RecommendItemStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.item_list = list;
            return this;
        }

        public final Builder platform_sync_info(List<PlatformSyncStatusStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.platform_sync_info = list;
            return this;
        }

        public final Builder relative_users(List<RelativeUserStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.relative_users = list;
            return this;
        }

        public final Builder type_label(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.type_label = list;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserStructV2)) {
            return false;
        }
        UserStructV2 userStructV2 = (UserStructV2) obj;
        if (!unknownFields().equals(userStructV2.unknownFields()) || !Internal.equals(this.uid, userStructV2.uid) || !Internal.equals(this.short_id, userStructV2.short_id) || !Internal.equals(this.nickname, userStructV2.nickname) || !Internal.equals(this.gender, userStructV2.gender) || !Internal.equals(this.signature, userStructV2.signature) || !Internal.equals(this.avatar_larger, userStructV2.avatar_larger) || !Internal.equals(this.avatar_thumb, userStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, userStructV2.avatar_medium) || !Internal.equals(this.birthday, userStructV2.birthday) || !Internal.equals(this.follow_status, userStructV2.follow_status) || !Internal.equals(this.aweme_count, userStructV2.aweme_count) || !Internal.equals(this.following_count, userStructV2.following_count) || !Internal.equals(this.follower_count, userStructV2.follower_count) || !Internal.equals(this.favoriting_count, userStructV2.favoriting_count) || !Internal.equals(this.total_favorited, userStructV2.total_favorited) || !Internal.equals(this.is_block, userStructV2.is_block) || !Internal.equals(this.hide_search, userStructV2.hide_search) || !Internal.equals(this.custom_verify, userStructV2.custom_verify) || !Internal.equals(this.unique_id, userStructV2.unique_id) || !Internal.equals(this.bind_phone, userStructV2.bind_phone) || !Internal.equals(this.special_lock, userStructV2.special_lock) || !Internal.equals(this.need_recommend, userStructV2.need_recommend) || !Internal.equals(this.recommend_reason, userStructV2.recommend_reason) || !Internal.equals(this.has_facebook_token, userStructV2.has_facebook_token) || !Internal.equals(this.has_twitter_token, userStructV2.has_twitter_token) || !Internal.equals(this.fb_expire_time, userStructV2.fb_expire_time) || !Internal.equals(this.tw_expire_time, userStructV2.tw_expire_time) || !Internal.equals(this.has_youtube_token, userStructV2.has_youtube_token) || !Internal.equals(this.youtube_expire_time, userStructV2.youtube_expire_time) || !Internal.equals(this.room_id, userStructV2.room_id) || !Internal.equals(this.live_verify, userStructV2.live_verify) || !Internal.equals(this.authority_status, userStructV2.authority_status) || !Internal.equals(this.verify_info, userStructV2.verify_info) || !Internal.equals(this.shield_follow_notice, userStructV2.shield_follow_notice) || !Internal.equals(this.shield_digg_notice, userStructV2.shield_digg_notice) || !Internal.equals(this.shield_comment_notice, userStructV2.shield_comment_notice) || !Internal.equals(this.share_info, userStructV2.share_info) || !Internal.equals(this.with_commerce_entry, userStructV2.with_commerce_entry) || !Internal.equals(this.verification_type, userStructV2.verification_type) || !Internal.equals(this.original_musician, userStructV2.original_musician) || !Internal.equals(this.enterprise_verify_reason, userStructV2.enterprise_verify_reason) || !Internal.equals(this.is_ad_fake, userStructV2.is_ad_fake) || !Internal.equals(this.mplatform_followers_count, userStructV2.mplatform_followers_count) || !this.followers_detail.equals(userStructV2.followers_detail) || !Internal.equals(this.region, userStructV2.region) || !Internal.equals(this.account_region, userStructV2.account_region) || !Internal.equals(this.commerce_user_level, userStructV2.commerce_user_level) || !Internal.equals(this.commerce_info, userStructV2.commerce_info) || !Internal.equals(this.live_agreement, userStructV2.live_agreement) || !this.platform_sync_info.equals(userStructV2.platform_sync_info) || !Internal.equals(this.with_shop_entry, userStructV2.with_shop_entry) || !Internal.equals(this.is_discipline_member, userStructV2.is_discipline_member) || !Internal.equals(this.secret, userStructV2.secret) || !Internal.equals(this.has_orders, userStructV2.has_orders) || !Internal.equals(this.prevent_download, userStructV2.prevent_download) || !Internal.equals(this.show_image_bubble, userStructV2.show_image_bubble) || !this.geofencing.equals(userStructV2.geofencing) || !Internal.equals(this.unique_id_modify_time, userStructV2.unique_id_modify_time) || !Internal.equals(this.video_icon, userStructV2.video_icon) || !Internal.equals(this.ins_id, userStructV2.ins_id) || !Internal.equals(this.google_account, userStructV2.google_account) || !Internal.equals(this.youtube_channel_id, userStructV2.youtube_channel_id) || !Internal.equals(this.youtube_channel_title, userStructV2.youtube_channel_title) || !Internal.equals(this.apple_account, userStructV2.apple_account) || !Internal.equals(this.with_fusion_shop_entry, userStructV2.with_fusion_shop_entry) || !Internal.equals(this.is_phone_binded, userStructV2.is_phone_binded) || !Internal.equals(this.login_platform, userStructV2.login_platform) || !Internal.equals(this.accept_private_policy, userStructV2.accept_private_policy) || !Internal.equals(this.twitter_id, userStructV2.twitter_id) || !Internal.equals(this.twitter_name, userStructV2.twitter_name) || !Internal.equals(this.user_canceled, userStructV2.user_canceled) || !Internal.equals(this.has_email, userStructV2.has_email) || !Internal.equals(this.live_agreement_time, userStructV2.live_agreement_time) || !Internal.equals(this.register_time, userStructV2.register_time) || !Internal.equals(this.status, userStructV2.status) || !Internal.equals(this.create_time, userStructV2.create_time) || !Internal.equals(this.avatar_uri, userStructV2.avatar_uri) || !Internal.equals(this.follower_status, userStructV2.follower_status) || !Internal.equals(this.comment_setting, userStructV2.comment_setting) || !Internal.equals(this.duet_setting, userStructV2.duet_setting) || !Internal.equals(this.reflow_page_gid, userStructV2.reflow_page_gid) || !Internal.equals(this.reflow_page_uid, userStructV2.reflow_page_uid) || !Internal.equals(this.user_rate, userStructV2.user_rate) || !Internal.equals(this.with_new_goods, userStructV2.with_new_goods) || !Internal.equals(this.is_flowcard_member, userStructV2.is_flowcard_member) || !Internal.equals(this.room_cover, userStructV2.room_cover) || !Internal.equals(this.download_setting, userStructV2.download_setting) || !Internal.equals(this.download_prompt_ts, userStructV2.download_prompt_ts) || !Internal.equals(this.react_setting, userStructV2.react_setting) || !Internal.equals(this.live_commerce, userStructV2.live_commerce) || !Internal.equals(this.country, userStructV2.country) || !Internal.equals(this.province, userStructV2.province) || !Internal.equals(this.city, userStructV2.city) || !this.cover_url.equals(userStructV2.cover_url) || !Internal.equals(this.recommend_reason_relation, userStructV2.recommend_reason_relation) || !Internal.equals(this.iso_country_code, userStructV2.iso_country_code) || !Internal.equals(this.district, userStructV2.district) || !Internal.equals(this.language, userStructV2.language) || !Internal.equals(this.room_type_tag, userStructV2.room_type_tag) || !Internal.equals(this.has_insights, userStructV2.has_insights) || !Internal.equals(this.remark_name, userStructV2.remark_name) || !Internal.equals(this.video_icon_virtual_URI, userStructV2.video_icon_virtual_URI) || !Internal.equals(this.share_qrcode_uri, userStructV2.share_qrcode_uri) || !Internal.equals(this.profile_tab_type, userStructV2.profile_tab_type) || !Internal.equals(this.avatar_decoration, userStructV2.avatar_decoration) || !Internal.equals(this.watch_status, userStructV2.watch_status) || !Internal.equals(this.with_commerce_newbie_task, userStructV2.with_commerce_newbie_task) || !Internal.equals(this.with_item_commerce_entry, userStructV2.with_item_commerce_entry) || !Internal.equals(this.star_billboard_rank, userStructV2.star_billboard_rank) || !Internal.equals(this.education, userStructV2.education) || !Internal.equals(this.can_modify_school_info, userStructV2.can_modify_school_info) || !Internal.equals(this.school_visible, userStructV2.school_visible) || !Internal.equals(this.avatar_pendant_larger, userStructV2.avatar_pendant_larger) || !Internal.equals(this.avatar_pendant_thumb, userStructV2.avatar_pendant_thumb) || !Internal.equals(this.avatar_pendant_medium, userStructV2.avatar_pendant_medium) || !this.item_list.equals(userStructV2.item_list) || !Internal.equals(this.user_mode, userStructV2.user_mode) || !Internal.equals(this.user_period, userStructV2.user_period) || !Internal.equals(this.is_effect_artist, userStructV2.is_effect_artist) || !Internal.equals(this.effect_detail, userStructV2.effect_detail) || !Internal.equals(this.commerce_permissions, userStructV2.commerce_permissions) || !Internal.equals(this.life_story_block, userStructV2.life_story_block) || !Internal.equals(this.hide_following_follower_list, userStructV2.hide_following_follower_list) || !Internal.equals(this.is_star, userStructV2.is_star) || !Internal.equals(this.cv_level, userStructV2.cv_level) || !Internal.equals(this.creator_level, userStructV2.creator_level) || !Internal.equals(this.is_mirror, userStructV2.is_mirror) || !Internal.equals(this.pr_exempt, userStructV2.pr_exempt) || !this.type_label.equals(userStructV2.type_label) || !Internal.equals(this.avatar_decoration_id, userStructV2.avatar_decoration_id) || !this.ad_cover_url.equals(userStructV2.ad_cover_url) || !Internal.equals(this.ad_cover_title, userStructV2.ad_cover_title) || !Internal.equals(this.ad_order_id, userStructV2.ad_order_id) || !Internal.equals(this.r_fans_group_info, userStructV2.r_fans_group_info) || !Internal.equals(this.with_commerce_enterprise_tab_entry, userStructV2.with_commerce_enterprise_tab_entry) || !Internal.equals(this.honor_info, userStructV2.honor_info) || !Internal.equals(this.comment_filter_status, userStructV2.comment_filter_status) || !Internal.equals(this.notify_private_account, userStructV2.notify_private_account) || !Internal.equals(this.avatar_168x168, userStructV2.avatar_168x168) || !Internal.equals(this.avatar_300x300, userStructV2.avatar_300x300) || !Internal.equals(this.is_blocked, userStructV2.is_blocked) || !Internal.equals(this.force_private_account, userStructV2.force_private_account) || !Internal.equals(this.with_star_atlas_entry, userStructV2.with_star_atlas_entry) || !Internal.equals(this.sprint_support_user_info, userStructV2.sprint_support_user_info) || !Internal.equals(this.signature_language, userStructV2.signature_language) || !Internal.equals(this.brand_info, userStructV2.brand_info) || !Internal.equals(this.display_wvalantine_activity_entry, userStructV2.display_wvalantine_activity_entry) || !Internal.equals(this.shop_micro_app, userStructV2.shop_micro_app) || !Internal.equals(this.commerce_user_info, userStructV2.commerce_user_info) || !this.relative_users.equals(userStructV2.relative_users) || !Internal.equals(this.quick_shop_info, userStructV2.quick_shop_info) || !this.cha_list.equals(userStructV2.cha_list) || !Internal.equals(this.is_minor, userStructV2.is_minor) || !Internal.equals(this.sec_uid, userStructV2.sec_uid) || !Internal.equals(this.recommend_score, userStructV2.recommend_score) || !Internal.equals(this.general_permission, userStructV2.general_permission) || !Internal.equals(this.birthday_hide_level, userStructV2.birthday_hide_level) || !Internal.equals(this.bio_url, userStructV2.bio_url) || !Internal.equals(this.bio_email, userStructV2.bio_email) || !Internal.equals(this.latest_order_time, userStructV2.latest_order_time) || !Internal.equals(this.is_pro_account, userStructV2.is_pro_account) || !Internal.equals(this.email, userStructV2.email) || !Internal.equals(this.is_email_verified, userStructV2.is_email_verified) || !Internal.equals(this.bio_secure_url, userStructV2.bio_secure_url) || !Internal.equals(this.collect_count, userStructV2.collect_count) || !Internal.equals(this.nickname_update_reminder, userStructV2.nickname_update_reminder) || !Internal.equals(this.avatar_update_reminder, userStructV2.avatar_update_reminder) || !Internal.equals(this.is_activity_user, userStructV2.is_activity_user) || !Internal.equals(this.room_data, userStructV2.room_data) || !Internal.equals(this.video_unread_info, userStructV2.video_unread_info) || !Internal.equals(this.is_life_style, userStructV2.is_life_style) || !Internal.equals(this.stitch_setting, userStructV2.stitch_setting) || !Internal.equals(this.qa_status, userStructV2.qa_status) || !Internal.equals(this.badge_info, userStructV2.badge_info) || !Internal.equals(this.social_info, userStructV2.social_info) || !Internal.equals(this.story_status, userStructV2.story_status) || !Internal.equals(this.matched_friend, userStructV2.matched_friend)) {
            return false;
        }
        return true;
    }
}
