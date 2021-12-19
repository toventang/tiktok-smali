package com.ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.commerce.f;
import com.ss.android.ugc.aweme.commerce.h;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.music.o;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import com.ss.android.ugc.aweme.utils.ip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable, Cloneable {
    public static final int UNLIVE = 0;
    @c(a = "accept_private_policy")
    public boolean acceptPrivatePolicy;
    @c(a = "account_region")
    public String accountRegion;
    @c(a = "account_type")
    public int accountType;
    @c(a = "description")
    public String adAuthorDesc;
    @c(a = "ad_cover_title")
    public AdCoverTitle adCoverTitle;
    @c(a = "ad_cover_url")
    public List<UrlModel> adCoverUrl;
    @c(a = "ad_order_id")
    public String adOrderId;
    @c(a = "age_gate_action")
    public int ageGateAction;
    @c(a = "age_gate_info")
    public AgeGateInfo ageGateInfo;
    @c(a = "age_gate_post_action")
    public int ageGatePostAction;
    @c(a = "age_gate_time")
    public long ageGateTime;
    @c(a = "allowStatus")
    public int allowStatus;
    @c(a = "anchor_schedule_guide_txt")
    public String anchorScheduleGuideTxt;
    @c(a = "authority_status")
    public long authorityStatus;
    @c(a = "avatar_decoration")
    public AvatarDecoration avatarDecoration;
    @c(a = "avatar_larger")
    public UrlModel avatarLarger;
    @c(a = "avatar_medium")
    public UrlModel avatarMedium;
    @c(a = "avatar_pendant_larger")
    public UrlModel avatarPendantLarger;
    @c(a = "avatar_pendant_medium")
    public UrlModel avatarPendantMedium;
    @c(a = "avatar_pendant_thumb")
    public UrlModel avatarPendantThumb;
    @c(a = "avatar_thumb")
    public UrlModel avatarThumb;
    @c(a = "avatar_update_reminder")
    public boolean avatarUpdateReminder;
    @c(a = "video_icon")
    public UrlModel avatarVideoUri;
    @c(a = "aweme_count")
    public int awemeCount;
    @c(a = "aweme_cover")
    public UserAwemeCover awemeCover;
    @c(a = "bind_phone")
    public String bindPhone;
    @c(a = "bio_email")
    public String bioEmail;
    @c(a = "bio_location")
    public String bioLocation;
    @c(a = "bio_permission")
    public UserBioPermission bioPermission;
    @c(a = "bio_phone")
    public String bioPhone;
    @c(a = "bio_secure_url")
    public String bioSecureUrl;
    @c(a = "bio_url")
    public String bioUrl;
    @c(a = "birthday")
    public String birthday;
    @c(a = "biz_account_info")
    public d bizAccountInfo;
    @c(a = "block_status")
    public int blockStatus;
    @c(a = "bold_fields")
    public List<String> boldFields;
    @c(a = "brand_info")
    public BlueVBrandInfo brandInfo;
    @c(a = "can_modify_school_info")
    public boolean canModifySchoolInfo;
    @c(a = "can_set_geofencing")
    public boolean canSetGeoFencing;
    @c(a = "cancel_type")
    public int cancelType;
    @c(a = "category")
    public String category;
    @c(a = "cha_list")
    public List<Challenge> challengeList;
    @c(a = "city")
    public String cityName;
    @c(a = "collect_count")
    public int collectCount;
    @c(a = "comment_filter_status")
    public int commentFilterStatus;
    @c(a = "comment_setting")
    public int commentSetting;
    @c(a = "commerce_info")
    public f commerceInfo;
    @c(a = "commerce_permissions")
    public CommercePermissionStruct commercePermission;
    @c(a = "commerce_user_info")
    public CommerceUserInfo commerceUserInfo;
    @c(a = "commerce_user_level")
    public int commerceUserLevel;
    @c(a = "complete_profile_guide_strategy")
    public int completeProfileGuideStrategy;
    @c(a = "constellation")
    public int constellation;
    @c(a = "contact_name")
    public String contactName;
    @c(a = "contacts_sync_status")
    public boolean contactsSyncStatus;
    @c(a = "country")
    public String country;
    @c(a = "cover_url")
    public List<UrlModel> coverUrls;
    @c(a = "create_time")
    public Long createTime;
    @c(a = "custom_verify")
    public String customVerify;
    @c(a = "display_qna_on_profile")
    public Integer displayQnaOnProfile;
    @c(a = "display_wvalantine_activity_entry")
    public boolean displayWvalantineActivityEntry;
    @c(a = "district")
    public String district;
    @c(a = "download_setting")
    public int downloadSetting;
    @c(a = "duet_setting")
    public int duetSetting;
    @c(a = "education")
    public int education;
    @c(a = "effect_detail")
    public EffectArtistDetail effectArtistDetail;
    @c(a = "email")
    public String email;
    @c(a = "enable_direct_message")
    public boolean enableDirectMessage;
    @c(a = "enable_subscription")
    public boolean enableSubscription;
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "enterprise_user_info")
    public h enterpriseUserInfo;
    @c(a = "enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @c(a = "external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;
    @c(a = "mplatform_followers_count")
    public int fansCount;
    @c(a = "favoriting_count")
    public int favoritingCount;
    @c(a = "fb_expire_time")
    public long fbExpireTime;
    @c(a = "follow_from")
    public int followFrom;
    @c(a = "follow_from_msg")
    public String followFromMsg;
    @c(a = "follow_status")
    public int followStatus;
    @c(a = "follower_count")
    public int followerCount;
    @c(a = "followers_detail")
    public List<FollowerDetail> followerDetailList;
    @c(a = "follower_status")
    public int followerStatus;
    @c(a = "following_count")
    public int followingCount;
    @c(a = "force_private_account")
    public boolean forcePrivateAccount;
    @c(a = "friend_count")
    public int friendCount;
    @c(a = "friend_type_str")
    public String friendTypeStr;
    @c(a = "analytics_status")
    public boolean hasAnalyticsMetrics;
    @c(a = "has_email")
    public boolean hasEmail;
    @c(a = "has_facebook_token")
    public boolean hasFacebookToken;
    @c(a = "has_orders")
    public boolean hasOrders;
    @c(a = "has_twitter_token")
    public boolean hasTwitterToken;
    @c(a = "has_youtube_token")
    public boolean hasYoutubeToken;
    @c(a = "hide_following_follower_list")
    public int hideFollowingFollowerList;
    @c(a = "hide_search")
    public boolean hideSearch;
    @c(a = "hide_shoot_button")
    public boolean hideShootButton;
    @c(a = "homepage_bottom_toast")
    public List<HomePageBottomToast> homepageBottomToast;
    @c(a = "honor_info")
    public HonorStruct honorStruct;
    @c(a = "ins_id")
    public String insId;
    @c(a = "is_activity_user")
    public boolean isActivityUser;
    @c(a = "is_ad_fake")
    public boolean isAdFake;
    @c(a = "ad_virtual")
    public boolean isAdVirtual;
    @c(a = "is_block")
    public boolean isBlock;
    @c(a = "is_blocked")
    public boolean isBlocked;
    @c(a = "content_language_already_popup")
    public boolean isContentLanguageDialogShown;
    @c(a = "has_insights")
    public boolean isCreater;
    @c(a = "is_discipline_member")
    public boolean isDisciplineMember;
    @c(a = "is_effect_artist")
    public boolean isEffectArtist;
    @c(a = "is_email_verified")
    public boolean isEmailVerified;
    public boolean isNewRecommend;
    @c(a = "douplus_old_user")
    public boolean isOldDouplusUser;
    @c(a = "is_phone_binded")
    public boolean isPhoneBinded;
    @c(a = "is_private_account")
    public boolean isPrivateAccount;
    @c(a = "is_pro_account")
    public boolean isProAccount;
    @c(a = "is_star")
    public boolean isStar;
    @c(a = "is_translator")
    public boolean isTranslator;
    @c(a = "iso_country_code")
    public String isoCountryCode;
    @c(a = "language")
    public String language;
    @c(a = "latest_order_time")
    public Long latestOrderTime;
    @c(a = "live_agreement")
    public int liveAgreement;
    @c(a = "anchor_info")
    public LiveAnchorInfo liveAnchorInfo;
    @c(a = "live_commerce")
    public boolean liveCommerce;
    @c(a = "live_push_notification_status")
    public int livePushNotificationStatus = 2;
    @c(a = "login_platform")
    public int loginPlatform;
    public int mAtType;
    @c(a = "general_permission")
    public GeneralPermission mGeneralPermission;
    @c(a = "search_highlight")
    public List<com.ss.android.ugc.aweme.search.d> mHighlightInfoList;
    @c(a = "hot_list")
    public HotListStruct mHotListStruct;
    @c(a = "events")
    public List<LiveEventStruct> mLiveEventStructList;
    @c(a = "mutual_relation")
    public MutualStruct mMutualStruct;
    @c(a = "badge_info")
    public ProfileBadgeStruct mProfileBadgeStruct;
    @c(a = "supporting_ngo")
    public ProfileNgoStruct mProfileNgoStruct;
    @c(a = "pronouns_info")
    public UserPronounsInfo mPronounsInfo;
    @c(a = "matched_friend")
    public MatchedFriendStruct matchedFriendStruct;
    public int mixListNum;
    @c(a = "playlist_status")
    public int mixListStatus;
    @c(a = "music_compliance_account")
    public int musicComplianceAccount;
    @c(a = "mutual_relation_avatars")
    public List<UrlModel> mutualRelationAvatars;
    @c(a = "mutual_relation_num")
    public int mutualRelationNumber;
    @c(a = "mutual_relation_tag")
    public String mutualRelationTag;
    @c(a = "name_field")
    public String nameField;
    @c(a = "navi_id")
    public String naviId;
    @c(a = "need_addr_card")
    public boolean needAddrCard;
    @c(a = "need_points")
    public List<NeedPointStruct> needPoints;
    @c(a = "need_recommend")
    public boolean needRecommend;
    @c(a = "nickname")
    public String nickname;
    @c(a = "nickname_update_reminder")
    public boolean nicknameUpdateReminder;
    @c(a = "normal_top_comment_permission")
    public int normalTopCommentPermission;
    @c(a = "notify_private_account")
    public int notifyPrivateAccount;
    @c(a = "notify_minor_private_policy")
    public boolean notifyPrivatePolicy;
    @c(a = "original_musician")
    public o originalMusician;
    @c(a = "platform_sync_info")
    public PlatformInfo[] platformInfos;
    @c(a = "post_default_download_setting")
    public boolean postDefaultDownloadSetting;
    @c(a = "predicted_age_group")
    public String predictedAgeGroup = "";
    @c(a = "prevent_download")
    public boolean preventDownload;
    @c(a = "privacy_setting")
    public PrivacySetting privacySetting;
    @c(a = "private_aweme_count")
    public int privateAwemeCount;
    @c(a = "pro_account_tcm_red_dot")
    public boolean proAccountTcmRedDot;
    @c(a = "proaccount_update_notification_status")
    public int proAccountUpdateNotificationStatus;
    @c(a = "profile_completion")
    public float profileCompletion;
    @c(a = "profile_pv")
    public long profilePv;
    @c(a = "province")
    public String province;
    @c(a = "qa_status")
    public int qnaStatus;
    @c(a = "quick_shop_info")
    public QuickShopInfo quickShopInfo;
    @c(a = "r_fans_group_info")
    public RocketFansGroupInfo rFansGroupInfo;
    @c(a = "rec_type")
    public String recType;
    @c(a = "item_list")
    public List<RecommendAwemeItem> recommendAwemeItems;
    @c(a = "recommend_reason")
    public String recommendReason;
    @c(a = "recommend_reason_relation")
    public String recommendReasonRelation;
    @c(a = "recommend_score")
    public double recommendScore;
    @c(a = "region")
    public String region;
    @c(a = "register_from")
    public String registerFrom;
    @c(a = "registerStatus")
    public int registerStatus;
    @c(a = "register_time")
    public long registerTime;
    @c(a = "relation_label")
    public String relationLabel;
    @c(a = "relation_ship")
    public String relationShip;
    @c(a = "relative_users")
    public List<RelativeUserInfo> relativeUserInfos;
    @c(a = "remark_name")
    public String remarkName;
    @c(a = "forward_count")
    public int repostCount;
    @c(a = "rid")
    public String requestId;
    @c(a = "room_cover")
    public UrlModel roomCover;
    @c(a = "room_data")
    public String roomData;
    @c(a = "room_id")
    public long roomId;
    @c(a = "room_id_str")
    public String roomIdStr;
    @c(a = "room_title")
    public String roomTitle;
    @c(a = "room_type_tag")
    public String roomTypeTag;
    @c(a = "school_visible")
    public int schoolInfoShowRange;
    @c(a = "search_user_desc")
    public String searchUserDesc;
    @c(a = "search_user_name")
    public String searchUserName;
    @c(a = "sec_uid")
    public String secUid;
    @c(a = "secret")
    public boolean secret;
    @c(a = "share_info")
    public ShareInfo shareInfo;
    @c(a = "shield_comment_notice")
    public int shieldCommentNotice;
    @c(a = "shield_digg_notice")
    public int shieldDiggNotice;
    @c(a = "shield_follow_notice")
    public int shieldFollowNotice;
    @c(a = "shop_micro_app")
    public String shopMicroApp;
    @c(a = "short_id")
    public String shortId;
    @c(a = "should_write_impr")
    public boolean shouldWriteImpr;
    @c(a = "shoutouts_status")
    public int shoutoutsStatus;
    @c(a = "show_artist_playlist")
    public int showArtistPlaylist;
    @c(a = "show_effect_list")
    public boolean showEffectList;
    @c(a = "show_favorite_list")
    public boolean showFavoriteList;
    @c(a = "show_image_bubble")
    public boolean showImageBubble;
    @c(a = "message_chat_entry")
    public boolean showMessageButton = true;
    @c(a = "show_tip_entry")
    public boolean showTipEntry;
    @c(a = "show_user_ban_dialog")
    public boolean showUserBanDialog;
    @c(a = "signature")
    public String signature;
    @c(a = "signature_language")
    public String signatureLanguage;
    @c(a = "social_data")
    public SocialDataStruct socialData;
    @c(a = "social_info")
    public String socialInfo;
    @c(a = "sprint_support_user_info")
    public HotSearchSprintStruct sprintSupportUserInfo;
    @c(a = "star_billboard_rank")
    public int starBillboardRank;
    @c(a = "stitch_setting")
    public int stitchSetting;
    @c(a = "life_story_block")
    public StoryBlockInfo storyBlockInfo;
    @c(a = "story_status")
    public int storyStatus;
    @c(a = "tab_settings")
    public TabSetting tabSetting;
    @c(a = "profile_tab_type")
    public int tabType;
    @c(a = "third_name")
    public String thirdName;
    @c(a = "total_favorited")
    public long totalFavorited;
    @c(a = "tw_expire_time")
    public long twExpireTime;
    @c(a = "twitter_id")
    public String twitterId;
    @c(a = "twitter_name")
    public String twitterName;
    @c(a = "type_label")
    public long[] typeLabels;
    @c(a = "uid")
    public String uid;
    @c(a = "video_unread_info")
    public UnReadVideoInfo unReadVideoInfo;
    @c(a = "unique_id")
    public String uniqueId;
    @c(a = "unique_id_modify_time")
    public long unique_id_modify_time;
    @c(a = "urge_detail")
    public UrgeStruct urgeDetail;
    @c(a = "advance_feature_item_order")
    public List<Integer> userAdvancedFeaturesOrder;
    @c(a = "user_canceled")
    public boolean userCancelled;
    public transient String userDisplayName = "";
    @c(a = "pay_grade")
    public UserHonor userHonor;
    @c(a = "user_mode")
    public int userMode = -1;
    @c(a = "user_period")
    public int userPeriod;
    @c(a = "user_rate")
    public int userRate;
    @c(a = "user_rate_remind_info")
    public UserRateRemindInfo userRateRemindInfo;
    @c(a = "vcd_schema_url")
    public String vcdSchemaUrl;
    @c(a = "verification_badge_type")
    public int verificationBadgeType;
    @c(a = "verification_type")
    public int verificationType;
    @c(a = "verify_info")
    public String verifyInfo;
    @c(a = "video_cover")
    public VideoCover videoCover;
    @c(a = "video_gift_status")
    public int videoGiftStatus;
    @c(a = "watch_status")
    public int watchStatus;
    @c(a = "white_cover_url")
    public List<UrlModel> whiteCoverUrl;
    @c(a = "with_commerce_enterprise_tab_entry")
    public boolean withCommerceEnterpriseTabEntry;
    @c(a = "with_commerce_entry")
    public boolean withCommerceEntry;
    @c(a = "with_commerce_newbie_task")
    public boolean withCommerceNewbieTask;
    @c(a = "with_douplus_entry")
    public boolean withDouplusEntry;
    @c(a = "with_item_commerce_entry")
    public boolean withItemCommerceEntry;
    @c(a = "with_new_goods")
    public boolean withNewGoods;
    @c(a = "with_shop_entry")
    public boolean withShopEntry;
    @c(a = "with_star_atlas_entry")
    public boolean withStarAtlasEntry;
    @c(a = "xmas_unlock_count")
    public int xmasUnlockCount;
    @c(a = "youtube_last_refresh_time")
    public long youTubeLastRefreshTime;
    @c(a = "youtube_refresh_token")
    public String youTubeRefreshToken;
    @c(a = "youtube_channel_id")
    public String youtubeChannelId;
    @c(a = "youtube_channel_title")
    public String youtubeChannelTitle;
    @c(a = "youtube_expire_time")
    public long youtubeExpireTime;
    @c(a = "yt_raw_token")
    public String youtubeRawRefreshToken;

    public interface AccountType {
        static {
            Covode.recordClassIndex(75271);
        }
    }

    public interface LivePushNotificationStatus {
        static {
            Covode.recordClassIndex(75273);
        }
    }

    public interface ProfileGuideExperiment {
        static {
            Covode.recordClassIndex(75274);
        }
    }

    public interface ProfileTabType {
        static {
            Covode.recordClassIndex(75275);
        }
    }

    public interface ShowArtistListType {
        static {
            Covode.recordClassIndex(75276);
        }
    }

    public interface ShowPrivateTabType {
        static {
            Covode.recordClassIndex(75277);
        }
    }

    public interface VerificationType {
        static {
            Covode.recordClassIndex(75278);
        }
    }

    public interface VerifyStatus {
        static {
            Covode.recordClassIndex(75279);
        }
    }

    static {
        Covode.recordClassIndex(75270);
    }

    public boolean avatarUpdateReminder() {
        return this.avatarUpdateReminder;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public int getAccountType() {
        return this.accountType;
    }

    public String getAdAuthorDesc() {
        return this.adAuthorDesc;
    }

    public AdCoverTitle getAdCoverTitle() {
        return this.adCoverTitle;
    }

    public List<UrlModel> getAdCoverUrl() {
        return this.adCoverUrl;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public int getAgeGateAction() {
        return this.ageGateAction;
    }

    public AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public long getAgeGateTime() {
        return this.ageGateTime;
    }

    public int getAllowStatus() {
        return this.allowStatus;
    }

    public String getAnchorScheduleGuideTxt() {
        return this.anchorScheduleGuideTxt;
    }

    public int getAtType() {
        return this.mAtType;
    }

    public long getAuthorityStatus() {
        return this.authorityStatus;
    }

    public AvatarDecoration getAvatarDecoration() {
        return this.avatarDecoration;
    }

    public UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public UrlModel getAvatarPendantLarger() {
        return this.avatarPendantLarger;
    }

    public UrlModel getAvatarPendantMedium() {
        return this.avatarPendantMedium;
    }

    public UrlModel getAvatarPendantThumb() {
        return this.avatarPendantThumb;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public int getAwemeCount() {
        return this.awemeCount;
    }

    public UserAwemeCover getAwemeCover() {
        return this.awemeCover;
    }

    public String getBindPhone() {
        return this.bindPhone;
    }

    public String getBioEmail() {
        return this.bioEmail;
    }

    public String getBioLocation() {
        return this.bioLocation;
    }

    public UserBioPermission getBioPermission() {
        return this.bioPermission;
    }

    public String getBioPhone() {
        return this.bioPhone;
    }

    public String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public String getBioUrl() {
        return this.bioUrl;
    }

    public d getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public List<String> getBoldFields() {
        return this.boldFields;
    }

    public BlueVBrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public int getCancelType() {
        return this.cancelType;
    }

    public String getCategory() {
        return this.category;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getCollectCount() {
        return this.collectCount;
    }

    public int getCommentFilterStatus() {
        return this.commentFilterStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public f getCommerceInfo() {
        return this.commerceInfo;
    }

    public CommercePermissionStruct getCommercePermission() {
        return this.commercePermission;
    }

    public CommerceUserInfo getCommerceUserInfo() {
        return this.commerceUserInfo;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public int getCompleteProfileGuideStrategy() {
        return this.completeProfileGuideStrategy;
    }

    public int getConstellation() {
        return this.constellation;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getCountry() {
        return this.country;
    }

    public List<UrlModel> getCoverUrls() {
        return this.coverUrls;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public Integer getDisplayQnaOnProfile() {
        return this.displayQnaOnProfile;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getDownloadSetting() {
        return this.downloadSetting;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public int getEducation() {
        return this.education;
    }

    public EffectArtistDetail getEffectArtistDetail() {
        return this.effectArtistDetail;
    }

    public String getEmail() {
        return this.email;
    }

    public h getEnterpriseUserInfo() {
        return this.enterpriseUserInfo;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public int getFavoritingCount() {
        return this.favoritingCount;
    }

    public long getFbExpireTime() {
        return this.fbExpireTime;
    }

    public int getFollowFrom() {
        return this.followFrom;
    }

    public String getFollowFromMsg() {
        return this.followFromMsg;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public int getFollowerCount() {
        return this.followerCount;
    }

    public List<FollowerDetail> getFollowerDetailList() {
        return this.followerDetailList;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public int getFriendCount() {
        return this.friendCount;
    }

    public String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public GeneralPermission getGeneralPermission() {
        return this.mGeneralPermission;
    }

    public long getHandleModified() {
        return this.unique_id_modify_time;
    }

    public boolean getHasAnalyticsMetrics() {
        return this.hasAnalyticsMetrics;
    }

    public int getHideFollowingFollowerList() {
        return this.hideFollowingFollowerList;
    }

    public List<com.ss.android.ugc.aweme.search.d> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public List<HomePageBottomToast> getHomepageBottomToast() {
        return this.homepageBottomToast;
    }

    public HonorStruct getHonorStruct() {
        return this.honorStruct;
    }

    public String getInsId() {
        return this.insId;
    }

    public boolean getIsCreater() {
        return this.isCreater;
    }

    public boolean getIsOldDouPlusUser() {
        return this.isOldDouplusUser;
    }

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getLiveAgreement() {
        return this.liveAgreement;
    }

    public LiveAnchorInfo getLiveAnchorInfo() {
        return this.liveAnchorInfo;
    }

    public List<LiveEventStruct> getLiveEventStructList() {
        return this.mLiveEventStructList;
    }

    public int getLivePushNotificationStatus() {
        return this.livePushNotificationStatus;
    }

    public int getLoginPlatform() {
        return this.loginPlatform;
    }

    public MatchedFriendStruct getMatchedFriendStruct() {
        return this.matchedFriendStruct;
    }

    public int getMixListNum() {
        return this.mixListNum;
    }

    public int getMixListStatus() {
        return this.mixListStatus;
    }

    public int getMusicComplianceAccount() {
        return this.musicComplianceAccount;
    }

    public List<UrlModel> getMutualRelationAvatars() {
        return this.mutualRelationAvatars;
    }

    public int getMutualRelationNumber() {
        return this.mutualRelationNumber;
    }

    public String getMutualRelationTag() {
        return this.mutualRelationTag;
    }

    public MutualStruct getMutualStruct() {
        return this.mMutualStruct;
    }

    public String getNameField() {
        return this.nameField;
    }

    public List<NeedPointStruct> getNeedPoints() {
        return this.needPoints;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public o getOriginalMusician() {
        return this.originalMusician;
    }

    public PlatformInfo[] getPlatformInfos() {
        return this.platformInfos;
    }

    public String getPredictedAgeGroup() {
        return this.predictedAgeGroup;
    }

    public PrivacySetting getPrivacySetting() {
        return this.privacySetting;
    }

    public int getPrivateAwemeCount() {
        return this.privateAwemeCount;
    }

    public int getProAccountUpdateNotificationStatus() {
        return this.proAccountUpdateNotificationStatus;
    }

    public ProfileBadgeStruct getProfileBadge() {
        return this.mProfileBadgeStruct;
    }

    public float getProfileCompletion() {
        return this.profileCompletion;
    }

    public ProfileNgoStruct getProfileNgoStruct() {
        return this.mProfileNgoStruct;
    }

    public long getProfilePv() {
        return this.profilePv;
    }

    public UserPronounsInfo getPronounsInfo() {
        return this.mPronounsInfo;
    }

    public String getProvince() {
        return this.province;
    }

    public int getQnaStatus() {
        return this.qnaStatus;
    }

    public QuickShopInfo getQuickShopInfo() {
        return this.quickShopInfo;
    }

    public String getRecType() {
        return this.recType;
    }

    public List<RecommendAwemeItem> getRecommendAwemeItems() {
        return this.recommendAwemeItems;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendReasonRelation() {
        return this.recommendReasonRelation;
    }

    public double getRecommendScore() {
        return this.recommendScore;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegisterFrom() {
        return this.registerFrom;
    }

    public int getRegisterStatus() {
        return this.registerStatus;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getRelationLabel() {
        return this.relationLabel;
    }

    public String getRelationShip() {
        return this.relationShip;
    }

    public List<RelativeUserInfo> getRelativeUserInfos() {
        return this.relativeUserInfos;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public int getRepostCount() {
        return this.repostCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRoomTitle() {
        return this.roomTitle;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public String getRooomData() {
        return this.roomData;
    }

    public int getSchoolInfoShowRange() {
        return this.schoolInfoShowRange;
    }

    public String getSearchUserDesc() {
        return this.searchUserDesc;
    }

    public String getSearchUserName() {
        return this.searchUserName;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShieldCommentNotice() {
        return this.shieldCommentNotice;
    }

    public int getShieldDiggNotice() {
        return this.shieldDiggNotice;
    }

    public int getShieldFollowNotice() {
        return this.shieldFollowNotice;
    }

    public String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public String getShortId() {
        return this.shortId;
    }

    public int getShowArtistPlaylist() {
        return this.showArtistPlaylist;
    }

    public boolean getShowTipEntry() {
        return this.showTipEntry;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignatureLanguage() {
        return this.signatureLanguage;
    }

    public String getSocialInfo() {
        return this.socialInfo;
    }

    public HotSearchSprintStruct getSprintSupportUserInfo() {
        return this.sprintSupportUserInfo;
    }

    public int getStarBillboardRank() {
        return this.starBillboardRank;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public StoryBlockInfo getStoryBlockInfo() {
        return this.storyBlockInfo;
    }

    public int getStoryStatus() {
        return this.storyStatus;
    }

    public TabSetting getTabSetting() {
        return this.tabSetting;
    }

    public int getTabType() {
        return this.tabType;
    }

    public long getTotalFavorited() {
        return this.totalFavorited;
    }

    public long getTwExpireTime() {
        return this.twExpireTime;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public String getTwitterName() {
        return this.twitterName;
    }

    public long[] getTypeLabels() {
        return this.typeLabels;
    }

    public String getUid() {
        return this.uid;
    }

    public UnReadVideoInfo getUnReadVideoInfo() {
        return this.unReadVideoInfo;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public UrgeStruct getUrgeDetail() {
        return this.urgeDetail;
    }

    public List<Integer> getUserAdvancedFeaturesOrder() {
        return this.userAdvancedFeaturesOrder;
    }

    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public int getUserMode() {
        return this.userMode;
    }

    public int getUserPeriod() {
        return this.userPeriod;
    }

    public int getUserRate() {
        return this.userRate;
    }

    public UserRateRemindInfo getUserRateRemindInfo() {
        return this.userRateRemindInfo;
    }

    public int getVerificationBadgeType() {
        return this.verificationBadgeType;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getVerifyInfo() {
        return this.verifyInfo;
    }

    public VideoCover getVideoCover() {
        return this.videoCover;
    }

    public int getVideoGiftStatus() {
        return this.videoGiftStatus;
    }

    public int getWatchwStatus() {
        return this.watchStatus;
    }

    public List<UrlModel> getWhiteCoverUrl() {
        return this.whiteCoverUrl;
    }

    public int getXmasUnlockCount() {
        return this.xmasUnlockCount;
    }

    public long getYouTubeLastRefreshTime() {
        return this.youTubeLastRefreshTime;
    }

    public String getYouTubeRefreshToken() {
        return this.youTubeRefreshToken;
    }

    public String getYoutubeChannelId() {
        return this.youtubeChannelId;
    }

    public String getYoutubeChannelTitle() {
        return this.youtubeChannelTitle;
    }

    public long getYoutubeExpireTime() {
        return this.youtubeExpireTime;
    }

    public String getYoutubeRawRefreshToken() {
        return this.youtubeRawRefreshToken;
    }

    public HotListStruct getmHotListStruct() {
        return this.mHotListStruct;
    }

    public RocketFansGroupInfo getrFansGroupInfo() {
        return this.rFansGroupInfo;
    }

    public boolean isAcceptPrivatePolicy() {
        return this.acceptPrivatePolicy;
    }

    public boolean isActivityUser() {
        return this.isActivityUser;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public boolean isAdVirtual() {
        return this.isAdVirtual;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isCanModifySchoolInfo() {
        return this.canModifySchoolInfo;
    }

    public boolean isCanSetGeoFencing() {
        return this.canSetGeoFencing;
    }

    public boolean isContactsSyncStatus() {
        return this.contactsSyncStatus;
    }

    public boolean isContentLanguageDialogShown() {
        return this.isContentLanguageDialogShown;
    }

    public boolean isDisciplineMember() {
        return this.isDisciplineMember;
    }

    public boolean isDisplayWvalantineActivityEntry() {
        return this.displayWvalantineActivityEntry;
    }

    public boolean isEffectArtist() {
        return this.isEffectArtist;
    }

    public boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public boolean isEnableDirectMessage() {
        return this.enableDirectMessage;
    }

    public boolean isEnableSubscription() {
        return this.enableSubscription;
    }

    public boolean isForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public boolean isHasEmail() {
        return this.hasEmail;
    }

    public boolean isHasFacebookToken() {
        return this.hasFacebookToken;
    }

    public boolean isHasOrders() {
        return this.hasOrders;
    }

    public boolean isHasTwitterToken() {
        return this.hasTwitterToken;
    }

    public boolean isHasYoutubeToken() {
        return this.hasYoutubeToken;
    }

    public boolean isHideSearch() {
        return this.hideSearch;
    }

    public boolean isHideShootButton() {
        return this.hideShootButton;
    }

    public boolean isLiveCommerce() {
        return this.liveCommerce;
    }

    public boolean isNeedAddrCard() {
        return this.needAddrCard;
    }

    public boolean isNeedRecommend() {
        return this.needRecommend;
    }

    public boolean isNewRecommend() {
        return this.isNewRecommend;
    }

    public boolean isPhoneBinded() {
        return this.isPhoneBinded;
    }

    public boolean isPostDefaultDownloadSetting() {
        return this.postDefaultDownloadSetting;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public boolean isProAccount() {
        return this.isProAccount;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public boolean isShould_write_impr() {
        return this.shouldWriteImpr;
    }

    public boolean isShowEffectList() {
        return this.showEffectList;
    }

    public boolean isShowFavoriteList() {
        return this.showFavoriteList;
    }

    public boolean isShowImageBubble() {
        return this.showImageBubble;
    }

    public boolean isShowMessageButton() {
        return this.showMessageButton;
    }

    public boolean isStar() {
        return this.isStar;
    }

    public boolean isTranslator() {
        return this.isTranslator;
    }

    public boolean isUserCancelled() {
        return this.userCancelled;
    }

    public boolean isWithCommerceEnterpriseTabEntry() {
        return this.withCommerceEnterpriseTabEntry;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public boolean isWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public boolean isWithDouplusEntry() {
        return this.withDouplusEntry;
    }

    public boolean isWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public boolean isWithNewGoods() {
        return this.withNewGoods;
    }

    public boolean isWithShopEntry() {
        return this.withShopEntry;
    }

    public boolean isWithStarAtlasEntry() {
        return this.withStarAtlasEntry;
    }

    public boolean nicknameUpdateReminder() {
        return this.nicknameUpdateReminder;
    }

    public boolean hasSignLiveAgreement() {
        if (this.liveAgreement == 1) {
            return true;
        }
        return false;
    }

    public boolean isFacebookExpire() {
        return checkExpire(this.fbExpireTime);
    }

    public boolean isNormalTopCommentPermissionGranted() {
        if (this.normalTopCommentPermission == 1) {
            return true;
        }
        return false;
    }

    public boolean isTwitterExpire() {
        return checkExpire(this.twExpireTime);
    }

    public boolean isYoutubeExpire() {
        return checkExpire(this.youtubeExpireTime);
    }

    @Override // java.lang.Object
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean getAdAuthorization() {
        CommerceUserInfo commerceUserInfo2 = this.commerceUserInfo;
        if (commerceUserInfo2 == null || !commerceUserInfo2.adAuthorization) {
            return false;
        }
        return true;
    }

    public long getCreateTime() {
        Long l2 = this.createTime;
        if (l2 == null) {
            return 0;
        }
        return l2.longValue();
    }

    public long getLatestOrderTime() {
        Long l2 = this.latestOrderTime;
        if (l2 == null) {
            return 0;
        }
        return l2.longValue();
    }

    public int getUnReadVideoCount() {
        UnReadVideoInfo unReadVideoInfo2 = this.unReadVideoInfo;
        if (unReadVideoInfo2 == null) {
            return 0;
        }
        return unReadVideoInfo2.getUnReadCount();
    }

    public boolean hasAdEntry() {
        CommerceUserInfo commerceUserInfo2 = this.commerceUserInfo;
        if (commerceUserInfo2 == null || !commerceUserInfo2.hasAdEntry) {
            return false;
        }
        return true;
    }

    public boolean isLive() {
        if (this.roomId != 0) {
            return true;
        }
        return false;
    }

    public UrlModel getDefaultAdCoverUrl() {
        if (ip.a(this.adCoverUrl)) {
            return null;
        }
        return this.adCoverUrl.get(0);
    }

    public String getLiveUid() {
        return "live" + this.uid;
    }

    public Long getUnReadLastTime() {
        UnReadVideoInfo unReadVideoInfo2 = this.unReadVideoInfo;
        if (unReadVideoInfo2 == null) {
            return 0L;
        }
        return Long.valueOf(unReadVideoInfo2.getLatestUnreadVideoCreatedTime());
    }

    public SocialDataStruct getSocialData() {
        SocialDataStruct socialDataStruct = this.socialData;
        if (socialDataStruct == null || socialDataStruct.getSocialPlatformSettings() == null || this.socialData.getSocialPlatformSettings().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SocialPlatformSetting(1, false, 0, true));
            arrayList.add(new SocialPlatformSetting(2, false, 0, true));
            this.socialData = new SocialDataStruct(arrayList, true);
        }
        return this.socialData;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str = this.uid;
        int i20 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i21 = i2 * 31;
        String str2 = this.shortId;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i22 = (i21 + i3) * 31;
        String str3 = this.nickname;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i23 = (i22 + i4) * 31;
        String str4 = this.remarkName;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i24 = (i23 + i5) * 31;
        String str5 = this.signature;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i25 = (i24 + i6) * 31;
        String str6 = this.birthday;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i26 = (i25 + i7) * 31;
        UrlModel urlModel = this.avatarLarger;
        if (urlModel != null) {
            i8 = urlModel.hashCode();
        } else {
            i8 = 0;
        }
        int i27 = (i26 + i8) * 31;
        UrlModel urlModel2 = this.avatarThumb;
        if (urlModel2 != null) {
            i9 = urlModel2.hashCode();
        } else {
            i9 = 0;
        }
        int i28 = (i27 + i9) * 31;
        UrlModel urlModel3 = this.avatarMedium;
        if (urlModel3 != null) {
            i10 = urlModel3.hashCode();
        } else {
            i10 = 0;
        }
        int i29 = (i28 + i10) * 31;
        UrlModel urlModel4 = this.avatarVideoUri;
        if (urlModel4 != null) {
            i11 = urlModel4.hashCode();
        } else {
            i11 = 0;
        }
        int i30 = (((((((((((((((((((((((((((((i29 + i11) * 31) + this.allowStatus) * 31) + this.followStatus) * 31) + this.followerStatus) * 31) + this.watchStatus) * 31) + this.awemeCount) * 31) + this.followingCount) * 31) + this.followerCount) * 31) + this.collectCount) * 31) + this.friendCount) * 31) + this.favoritingCount) * 31) + this.registerStatus) * 31) + (this.hideSearch ? 1 : 0)) * 31) + this.mAtType) * 31) + this.constellation) * 31;
        String str7 = this.customVerify;
        if (str7 != null) {
            i12 = str7.hashCode();
        } else {
            i12 = 0;
        }
        int i31 = (i30 + i12) * 31;
        String str8 = this.uniqueId;
        if (str8 != null) {
            i13 = str8.hashCode();
        } else {
            i13 = 0;
        }
        int i32 = (i31 + i13) * 31;
        ShareInfo shareInfo2 = this.shareInfo;
        if (shareInfo2 != null) {
            i14 = shareInfo2.hashCode();
        } else {
            i14 = 0;
        }
        int i33 = (i32 + i14) * 31;
        String str9 = this.bindPhone;
        if (str9 != null) {
            i15 = str9.hashCode();
        } else {
            i15 = 0;
        }
        int i34 = (((i33 + i15) * 31) + (this.hasEmail ? 1 : 0)) * 31;
        Long l2 = this.createTime;
        if (l2 != null) {
            i16 = l2.hashCode();
        } else {
            i16 = 0;
        }
        int i35 = (((((((((((((((((i34 + i16) * 31) + (this.needRecommend ? 1 : 0)) * 31) + (this.secret ? 1 : 0)) * 31) + (this.isPrivateAccount ? 1 : 0)) * 31) + (this.preventDownload ? 1 : 0)) * 31) + (this.showImageBubble ? 1 : 0)) * 31) + this.commentSetting) * 31) + this.duetSetting) * 31) + this.downloadSetting) * 31;
        String str10 = this.region;
        if (str10 != null) {
            i17 = str10.hashCode();
        } else {
            i17 = 0;
        }
        int i36 = (i35 + i17) * 31;
        String str11 = this.language;
        if (str11 != null) {
            i18 = str11.hashCode();
        } else {
            i18 = 0;
        }
        int i37 = (i36 + i18) * 31;
        String str12 = this.roomTypeTag;
        if (str12 != null) {
            i19 = str12.hashCode();
        } else {
            i19 = 0;
        }
        int i38 = (i37 + i19) * 31;
        Long l3 = this.latestOrderTime;
        if (l3 != null) {
            i20 = l3.hashCode();
        }
        return ((i38 + i20) * 31) + (this.isTranslator ? 1 : 0);
    }

    public void setAcceptPrivatePolicy(boolean z) {
        this.acceptPrivatePolicy = z;
    }

    public void setAccountRegion(String str) {
        this.accountRegion = str;
    }

    public void setAccountType(int i2) {
        this.accountType = i2;
    }

    public void setActivityUser(boolean z) {
        this.isActivityUser = z;
    }

    public void setAdAuthorDesc(String str) {
        this.adAuthorDesc = str;
    }

    public void setAdCoverTitle(AdCoverTitle adCoverTitle2) {
        this.adCoverTitle = adCoverTitle2;
    }

    public void setAdCoverUrl(List<UrlModel> list) {
        this.adCoverUrl = list;
    }

    public void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdVirtual(boolean z) {
        this.isAdVirtual = z;
    }

    public void setAgeGateAction(int i2) {
        this.ageGateAction = i2;
    }

    public void setAgeGateInfo(AgeGateInfo ageGateInfo2) {
        this.ageGateInfo = ageGateInfo2;
    }

    public void setAgeGatePostAction(int i2) {
        this.ageGatePostAction = i2;
    }

    public void setAgeGateTime(int i2) {
        this.ageGateTime = (long) i2;
    }

    public void setAllowStatus(int i2) {
        this.allowStatus = i2;
    }

    public void setAnchorScheduleGuideTxt(String str) {
        this.anchorScheduleGuideTxt = str;
    }

    public void setAtType(int i2) {
        this.mAtType = i2;
    }

    public void setAuthorityStatus(long j2) {
        this.authorityStatus = j2;
    }

    public void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public void setAvatarPendantLarger(UrlModel urlModel) {
        this.avatarPendantLarger = urlModel;
    }

    public void setAvatarPendantMedium(UrlModel urlModel) {
        this.avatarPendantMedium = urlModel;
    }

    public void setAvatarPendantThumb(UrlModel urlModel) {
        this.avatarPendantThumb = urlModel;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setAvatarUpdateReminder(boolean z) {
        this.avatarUpdateReminder = z;
    }

    public void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public void setAwemeCount(int i2) {
        this.awemeCount = i2;
    }

    public void setAwemeCover(UserAwemeCover userAwemeCover) {
        this.awemeCover = userAwemeCover;
    }

    public void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public void setBioEmail(String str) {
        this.bioEmail = str;
    }

    public void setBioLocation(String str) {
        this.bioLocation = str;
    }

    public void setBioPermission(UserBioPermission userBioPermission) {
        this.bioPermission = userBioPermission;
    }

    public void setBioPhone(String str) {
        this.bioPhone = str;
    }

    public void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public void setBizAccountInfo(d dVar) {
        this.bizAccountInfo = dVar;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlockStatus(int i2) {
        this.blockStatus = i2;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setBoldFields(List<String> list) {
        this.boldFields = list;
    }

    public void setBrandInfo(BlueVBrandInfo blueVBrandInfo) {
        this.brandInfo = blueVBrandInfo;
    }

    public void setBroadcasterRoomId(long j2) {
        this.roomId = j2;
    }

    public void setCanModifySchoolInfo(boolean z) {
        this.canModifySchoolInfo = z;
    }

    public void setCancelType(int i2) {
        this.cancelType = i2;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCollectCount(int i2) {
        this.collectCount = i2;
    }

    public void setCommentFilterStatus(int i2) {
        this.commentFilterStatus = i2;
    }

    public void setCommentSetting(int i2) {
        this.commentSetting = i2;
    }

    public void setCommerceInfo(f fVar) {
        this.commerceInfo = fVar;
    }

    public void setCommerceUserLevel(int i2) {
        this.commerceUserLevel = i2;
    }

    public void setCompleteProfileGuideStrategy(int i2) {
        this.completeProfileGuideStrategy = i2;
    }

    public void setConstellation(int i2) {
        this.constellation = i2;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactsSyncStatus(boolean z) {
        this.contactsSyncStatus = z;
    }

    public void setContentLanguageDialogShown(boolean z) {
        this.isContentLanguageDialogShown = z;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCoverUrls(List<UrlModel> list) {
        this.coverUrls = list;
    }

    public void setCreateTime(Long l2) {
        this.createTime = l2;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setDisciplineMember(boolean z) {
        this.isDisciplineMember = z;
    }

    public void setDisplayQnaOnProfile(Integer num) {
        this.displayQnaOnProfile = num;
    }

    public void setDisplayWvalantineActivityEntry(boolean z) {
        this.displayWvalantineActivityEntry = z;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setDownloadSetting(int i2) {
        this.downloadSetting = i2;
    }

    public void setDuetSetting(int i2) {
        this.duetSetting = i2;
    }

    public void setEducation(int i2) {
        this.education = i2;
    }

    public void setEffectArtist(boolean z) {
        this.isEffectArtist = z;
    }

    public void setEffectArtistDetail(EffectArtistDetail effectArtistDetail2) {
        this.effectArtistDetail = effectArtistDetail2;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailVerified(boolean z) {
        this.isEmailVerified = z;
    }

    public void setEnableDirectMessage(boolean z) {
        this.enableDirectMessage = z;
    }

    public void setEnableSubscription(boolean z) {
        this.enableSubscription = z;
    }

    public void setEnterpriseUserInfo(h hVar) {
        this.enterpriseUserInfo = hVar;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct2;
    }

    public void setFansCount(int i2) {
        this.fansCount = i2;
    }

    public void setFavoritingCount(int i2) {
        this.favoritingCount = i2;
    }

    public void setFbExpireTime(long j2) {
        this.fbExpireTime = j2;
    }

    public void setFollowFrom(int i2) {
        this.followFrom = i2;
    }

    public void setFollowFromMsg(String str) {
        this.followFromMsg = str;
    }

    public void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public void setFollowerCount(int i2) {
        this.followerCount = i2;
    }

    public void setFollowerDetailList(List<FollowerDetail> list) {
        this.followerDetailList = list;
    }

    public void setFollowerStatus(int i2) {
        this.followerStatus = i2;
    }

    public void setFollowingCount(int i2) {
        this.followingCount = i2;
    }

    public void setForcePrivateAccount(boolean z) {
        this.forcePrivateAccount = z;
    }

    public void setFriendCount(int i2) {
        this.friendCount = i2;
    }

    public void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public void setHandleModified(long j2) {
        this.unique_id_modify_time = j2;
    }

    public void setHasEmail(boolean z) {
        this.hasEmail = z;
    }

    public void setHasFacebookToken(boolean z) {
        this.hasFacebookToken = z;
    }

    public void setHasOrders(boolean z) {
        this.hasOrders = z;
    }

    public void setHasTwitterToken(boolean z) {
        this.hasTwitterToken = z;
    }

    public void setHasYoutubeToken(boolean z) {
        this.hasYoutubeToken = z;
    }

    public void setHideFollowingFollowerList(int i2) {
        this.hideFollowingFollowerList = i2;
    }

    public void setHideSearch(boolean z) {
        this.hideSearch = z;
    }

    public void setHideShootButton(boolean z) {
        this.hideShootButton = z;
    }

    public void setHighlightInfoList(List<com.ss.android.ugc.aweme.search.d> list) {
        this.mHighlightInfoList = list;
    }

    public void setHonorStruct(HonorStruct honorStruct2) {
        this.honorStruct = honorStruct2;
    }

    public void setInsId(String str) {
        this.insId = str;
    }

    public void setIsCreater(boolean z) {
        this.isCreater = z;
    }

    public void setIsOldDouplusUser(boolean z) {
        this.isOldDouplusUser = z;
    }

    public void setIsTranslator(boolean z) {
        this.isTranslator = z;
    }

    public void setIsoCountryCode(String str) {
        this.isoCountryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLatestOrderTime(Long l2) {
        this.latestOrderTime = l2;
    }

    public void setLiveAgreement(int i2) {
        this.liveAgreement = i2;
    }

    public void setLiveAnchorInfo(LiveAnchorInfo liveAnchorInfo2) {
        this.liveAnchorInfo = liveAnchorInfo2;
    }

    public void setLiveEventStructList(List<LiveEventStruct> list) {
        this.mLiveEventStructList = list;
    }

    public void setLivePushNotificationStatus(int i2) {
        this.livePushNotificationStatus = i2;
    }

    public void setLoginPlatform(int i2) {
        this.loginPlatform = i2;
    }

    public void setMatchedFriendStruct(MatchedFriendStruct matchedFriendStruct2) {
        this.matchedFriendStruct = matchedFriendStruct2;
    }

    public void setMixListNum(int i2) {
        this.mixListNum = i2;
    }

    public void setMusicComplianceAccount(int i2) {
        this.musicComplianceAccount = i2;
    }

    public void setMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public void setNameField(String str) {
        this.nameField = str;
    }

    public void setNeedAddrCard(boolean z) {
        this.needAddrCard = z;
    }

    public void setNeedPoints(List<NeedPointStruct> list) {
        this.needPoints = list;
    }

    public void setNeedRecommend(boolean z) {
        this.needRecommend = z;
    }

    public void setNewRecommend(boolean z) {
        this.isNewRecommend = z;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNicknameUpdateReminder(boolean z) {
        this.nicknameUpdateReminder = z;
    }

    public void setNormalTopCommentPermission(int i2) {
        this.normalTopCommentPermission = i2;
    }

    public void setNotifyPrivateAccount(int i2) {
        this.notifyPrivateAccount = i2;
    }

    public void setOriginalMusician(o oVar) {
        this.originalMusician = oVar;
    }

    public void setPhoneBinded(boolean z) {
        this.isPhoneBinded = z;
    }

    public void setPlatformInfos(PlatformInfo[] platformInfoArr) {
        this.platformInfos = platformInfoArr;
    }

    public void setPostDefaultDownloadSetting(boolean z) {
        this.postDefaultDownloadSetting = z;
    }

    public void setPredictedAgeGroup(String str) {
        this.predictedAgeGroup = str;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPrivacySetting(PrivacySetting privacySetting2) {
        this.privacySetting = privacySetting2;
    }

    public void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public void setPrivateAwemeCount(int i2) {
        this.privateAwemeCount = i2;
    }

    public void setProAccountUpdateNotificationStatus(int i2) {
        this.proAccountUpdateNotificationStatus = i2;
    }

    public void setProfileBadgeStruct(ProfileBadgeStruct profileBadgeStruct) {
        this.mProfileBadgeStruct = profileBadgeStruct;
    }

    public void setProfileNgoStruct(ProfileNgoStruct profileNgoStruct) {
        this.mProfileNgoStruct = profileNgoStruct;
    }

    public void setPronouns(UserPronounsInfo userPronounsInfo) {
        this.mPronounsInfo = userPronounsInfo;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setQnaStatus(int i2) {
        this.qnaStatus = i2;
    }

    public void setQuickShopInfo(QuickShopInfo quickShopInfo2) {
        this.quickShopInfo = quickShopInfo2;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendAwemeItems(List<RecommendAwemeItem> list) {
        this.recommendAwemeItems = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendReasonRelation(String str) {
        this.recommendReasonRelation = str;
    }

    public void setRecommendScore(double d2) {
        this.recommendScore = d2;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegisterFrom(String str) {
        this.registerFrom = str;
    }

    public void setRegisterStatus(int i2) {
        this.registerStatus = i2;
    }

    public void setRegisterTime(long j2) {
        this.registerTime = j2;
    }

    public void setRelationLabel(String str) {
        this.relationLabel = str;
    }

    public void setRelativeUserInfos(List<RelativeUserInfo> list) {
        this.relativeUserInfos = list;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRepostCount(int i2) {
        this.repostCount = i2;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomData(String str) {
        this.roomData = str;
    }

    public void setSchoolInfoShowRange(int i2) {
        this.schoolInfoShowRange = i2;
    }

    public void setSearchUserDesc(String str) {
        this.searchUserDesc = str;
    }

    public void setSearchUserName(String str) {
        this.searchUserName = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShieldCommentNotice(int i2) {
        this.shieldCommentNotice = i2;
    }

    public void setShieldDiggNotice(int i2) {
        this.shieldDiggNotice = i2;
    }

    public void setShieldFollowNotice(int i2) {
        this.shieldFollowNotice = i2;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setShould_write_impr(boolean z) {
        this.shouldWriteImpr = z;
    }

    public void setShowArtistPlaylist(int i2) {
        this.showArtistPlaylist = i2;
    }

    public void setShowEffectList(boolean z) {
        this.showEffectList = z;
    }

    public void setShowFavoriteList(boolean z) {
        this.showFavoriteList = z;
    }

    public void setShowImageBubble(boolean z) {
        this.showImageBubble = z;
    }

    public void setShowMessageButton(boolean z) {
        this.showMessageButton = z;
    }

    public void setShowTipEntry(boolean z) {
        this.showTipEntry = z;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignatureLanguage(String str) {
        this.signatureLanguage = str;
    }

    public void setSocialData(SocialDataStruct socialDataStruct) {
        this.socialData = socialDataStruct;
    }

    public void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public void setSprintSupportUserInfo(HotSearchSprintStruct hotSearchSprintStruct) {
        this.sprintSupportUserInfo = hotSearchSprintStruct;
    }

    public void setStar(boolean z) {
        this.isStar = z;
    }

    public void setStarBillboardRank(int i2) {
        this.starBillboardRank = i2;
    }

    public void setStitchSetting(int i2) {
        this.stitchSetting = i2;
    }

    public void setStoryBlockInfo(StoryBlockInfo storyBlockInfo2) {
        this.storyBlockInfo = storyBlockInfo2;
    }

    public void setStoryStatus(int i2) {
        this.storyStatus = i2;
    }

    public void setTabSetting(TabSetting tabSetting2) {
        this.tabSetting = tabSetting2;
    }

    public void setTabType(int i2) {
        this.tabType = i2;
    }

    public void setTotalFavorited(long j2) {
        this.totalFavorited = j2;
    }

    public void setTwExpireTime(long j2) {
        this.twExpireTime = j2;
    }

    public void setTwitterId(String str) {
        this.twitterId = str;
    }

    public void setTwitterName(String str) {
        this.twitterName = str;
    }

    public void setTypeLabels(long[] jArr) {
        this.typeLabels = jArr;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUnReadVideoInfo(UnReadVideoInfo unReadVideoInfo2) {
        this.unReadVideoInfo = unReadVideoInfo2;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUrgeDetail(UrgeStruct urgeStruct) {
        this.urgeDetail = urgeStruct;
    }

    public void setUserCancelled(boolean z) {
        this.userCancelled = z;
    }

    public void setUserDisplayName(String str) {
        this.userDisplayName = str;
    }

    public void setUserHonor(UserHonor userHonor2) {
        this.userHonor = userHonor2;
    }

    public void setUserMode(int i2) {
        this.userMode = i2;
    }

    public void setUserPeriod(int i2) {
        this.userPeriod = i2;
    }

    public void setUserRate(int i2) {
        this.userRate = i2;
    }

    public void setUserRateRemindInfo(UserRateRemindInfo userRateRemindInfo2) {
        this.userRateRemindInfo = userRateRemindInfo2;
    }

    public void setVerificationType(int i2) {
        this.verificationType = i2;
    }

    public void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public void setVideoCover(VideoCover videoCover2) {
        this.videoCover = videoCover2;
    }

    public void setVideoGiftStatus(int i2) {
        this.videoGiftStatus = i2;
    }

    public void setWatchStatus(int i2) {
        this.watchStatus = i2;
    }

    public void setWhiteCoverUrl(List<UrlModel> list) {
        this.whiteCoverUrl = list;
    }

    public void setWithCommerceEnterpriseTabEntry(boolean z) {
        this.withCommerceEnterpriseTabEntry = z;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public void setWithDouplusEntry(boolean z) {
        this.withDouplusEntry = z;
    }

    public void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public void setXmasUnlockCount(int i2) {
        this.xmasUnlockCount = i2;
    }

    public void setYouTubeLastRefreshTime(long j2) {
        this.youTubeLastRefreshTime = j2;
    }

    public void setYouTubeRefreshToken(String str) {
        this.youTubeRefreshToken = str;
    }

    public void setYoutubeChannelId(String str) {
        this.youtubeChannelId = str;
    }

    public void setYoutubeChannelTitle(String str) {
        this.youtubeChannelTitle = str;
    }

    public void setYoutubeExpireTime(long j2) {
        this.youtubeExpireTime = j2;
    }

    public void setYoutubeRawRefreshToken(String str) {
        this.youtubeRawRefreshToken = str;
    }

    public void setmHotListStruct(HotListStruct hotListStruct) {
        this.mHotListStruct = hotListStruct;
    }

    public void setrFansGroupInfo(RocketFansGroupInfo rocketFansGroupInfo) {
        this.rFansGroupInfo = rocketFansGroupInfo;
    }

    public void setUnReadVideoCount(int i2) {
        UnReadVideoInfo unReadVideoInfo2 = this.unReadVideoInfo;
        if (unReadVideoInfo2 != null) {
            unReadVideoInfo2.setUnReadCount(i2);
        }
    }

    public void setAdAuthorization(boolean z) {
        if (this.commerceUserInfo == null) {
            this.commerceUserInfo = new CommerceUserInfo();
        }
        this.commerceUserInfo.adAuthorization = z;
    }

    private boolean checkExpire(long j2) {
        if ((System.currentTimeMillis() / 1000) - j2 > 0) {
            return true;
        }
        return false;
    }

    public UrlModel getCoverUrlWithMode(boolean z) {
        if (z) {
            return getCoverUrls().get(0);
        }
        return getWhiteCoverUrl().get(0);
    }

    public PlatformInfo getPlatformInfo(String str) {
        PlatformInfo[] platformInfoArr;
        if (TextUtils.isEmpty(str) || (platformInfoArr = this.platformInfos) == null) {
            return null;
        }
        for (PlatformInfo platformInfo : platformInfoArr) {
            if (str.equals(platformInfo.getPatformName())) {
                return platformInfo;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (this.allowStatus != user.allowStatus || this.followStatus != user.followStatus || this.followerStatus != user.followerStatus || this.watchStatus != user.watchStatus || this.awemeCount != user.awemeCount || this.followingCount != user.followingCount || this.followerCount != user.followerCount || this.collectCount != user.collectCount || this.friendCount != user.friendCount || this.totalFavorited != user.totalFavorited || this.favoritingCount != user.favoritingCount || this.registerStatus != user.registerStatus || this.hideSearch != user.hideSearch || this.mAtType != user.mAtType || this.constellation != user.constellation || this.needRecommend != user.needRecommend || this.secret != user.secret || this.isPrivateAccount != user.isPrivateAccount || this.isBlocked != user.isBlocked || this.isBlock != user.isBlock || this.livePushNotificationStatus != user.livePushNotificationStatus) {
            return false;
        }
        String str = this.uid;
        if (str == null ? user.uid != null : !str.equals(user.uid)) {
            return false;
        }
        String str2 = this.shortId;
        if (str2 == null ? user.shortId != null : !str2.equals(user.shortId)) {
            return false;
        }
        String str3 = this.nickname;
        if (str3 == null ? user.nickname != null : !str3.equals(user.nickname)) {
            return false;
        }
        String str4 = this.remarkName;
        if (str4 == null ? user.remarkName != null : !str4.equals(user.remarkName)) {
            return false;
        }
        String str5 = this.signature;
        if (str5 == null ? user.signature != null : !str5.equals(user.signature)) {
            return false;
        }
        String str6 = this.birthday;
        if (str6 == null ? user.birthday != null : !str6.equals(user.birthday)) {
            return false;
        }
        UrlModel urlModel = this.avatarLarger;
        if (urlModel == null ? user.avatarLarger != null : !urlModel.equals(user.avatarLarger)) {
            return false;
        }
        UrlModel urlModel2 = this.avatarThumb;
        if (urlModel2 == null ? user.avatarThumb != null : !urlModel2.equals(user.avatarThumb)) {
            return false;
        }
        UrlModel urlModel3 = this.avatarMedium;
        if (urlModel3 == null ? user.avatarMedium != null : !urlModel3.equals(user.avatarMedium)) {
            return false;
        }
        UrlModel urlModel4 = this.avatarVideoUri;
        if (urlModel4 == null ? user.avatarVideoUri != null : !urlModel4.equals(user.avatarVideoUri)) {
            return false;
        }
        String str7 = this.thirdName;
        if (str7 == null ? user.thirdName != null : !str7.equals(user.thirdName)) {
            return false;
        }
        String str8 = this.customVerify;
        if (str8 == null ? user.customVerify != null : !str8.equals(user.customVerify)) {
            return false;
        }
        String str9 = this.uniqueId;
        if (str9 == null ? user.uniqueId != null : !str9.equals(user.uniqueId)) {
            return false;
        }
        ShareInfo shareInfo2 = this.shareInfo;
        if (shareInfo2 == null ? user.shareInfo != null : !shareInfo2.equals(user.shareInfo)) {
            return false;
        }
        Long l2 = this.createTime;
        if (l2 == null ? user.createTime != null : !l2.equals(user.createTime)) {
            return false;
        }
        if (this.preventDownload != user.preventDownload || this.showImageBubble != user.showImageBubble || this.acceptPrivatePolicy != user.acceptPrivatePolicy || this.commentSetting != user.commentSetting || this.duetSetting != user.duetSetting || this.stitchSetting != user.stitchSetting || this.hasEmail != user.hasEmail || this.downloadSetting != user.downloadSetting) {
            return false;
        }
        String str10 = this.region;
        if (str10 == null ? user.region != null : !str10.equals(user.region)) {
            return false;
        }
        String str11 = this.language;
        if (str11 == null ? user.language != null : !str11.equals(user.language)) {
            return false;
        }
        String str12 = this.roomTypeTag;
        if (str12 == null ? user.roomTypeTag != null : !str12.equals(user.roomTypeTag)) {
            return false;
        }
        Long l3 = this.latestOrderTime;
        if (l3 == null ? user.latestOrderTime != null : !l3.equals(user.latestOrderTime)) {
            return false;
        }
        if (this.isTranslator != user.isTranslator) {
            return false;
        }
        String str13 = this.bindPhone;
        String str14 = user.bindPhone;
        if (str13 != null) {
            return str13.equals(str14);
        }
        if (str14 == null) {
            return true;
        }
        return false;
    }
}
