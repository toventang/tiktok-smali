package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.language.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class SharePrefCache {
    private aj<String> adIntroUrl;
    private aj<String> adLandingPageConfig;
    private aj<String> adSouthNorthFirstSupportTeam;
    private aj<Long> adSouthNorthFirstSupportTime;
    private aj<Integer> arStickerFliterTimes;
    private aj<Integer> atFriendsShowType;
    private aj<Boolean> autoSaveVideo;
    private aj<Boolean> autoSendTwitter;
    private List<aj> cacheItems;
    private aj<Boolean> canCreateInsights;
    private aj<Integer> canIm;
    private aj<Integer> canImSendPic;
    private aj<Boolean> canLive;
    private boolean collectAllItems;
    private aj<Integer> completeProfilePolicyInterval;
    private aj<Integer> completeProfilePolicyTimes;
    private aj<Boolean> debugWebBar;
    private aj<Set<String>> defaultAvatarUrl;
    private aj<String> downloadForbiddenToast;
    private aj<Integer> downloadMicroApp;
    private aj<String> downloadSdkConfig;
    private aj<Boolean> downloadStatusWhenPublish;
    private aj<Boolean> enableAntiAliasing;
    private aj<Integer> enableBindItemCallOMSDK;
    private aj<Boolean> enableMessagePb2Json;
    private aj<Boolean> enableProfileActivityLink;
    private aj<Boolean> enableUltraResolution;
    private aj<String> facebookAccessToken;
    private aj<Long> festivalShareDonationTime;
    private aj<Integer> flashStatus;
    private aj<Boolean> followGuideShown;
    private aj<Long> followNoticeCloseTime;
    private aj<Integer> followUserThreshold;
    private aj<Boolean> geckoLocalTestUseOnline;
    private aj<String> googleServerAuthCode;
    private aj<Boolean> hasAlreadyShowBubble;
    private aj<Boolean> hasEnterBindPhone;
    private aj<Boolean> hasLongPressDislike;
    private aj<Boolean> hasShowFilterGuide;
    private aj<Boolean> hasShowHighQualityVideoTips;
    private aj<String> hitRankActivityProfileBackgroud;
    private aj<String> hitRankActivityStarBackground;
    private aj<Integer> hitRankActivityStatus;
    private aj<Integer> hotSearchWordsShowInterval;
    private aj<Boolean> iesOffline;
    aj<Boolean> imCommentForwardEnabled;
    private aj<String> imCurrentLocaleLanguage;
    private aj<String> imUrlTemplate;
    private aj<Boolean> inUltraResBlackList;
    private aj<String> invitedContacts;
    private aj<Boolean> isAwemePrivate;
    private aj<Boolean> isClickMoreRedPoint;
    private aj<Boolean> isContactDialogShown;
    private aj<Boolean> isContactsUploaded;
    private aj<Boolean> isEuropeCountry;
    private aj<Boolean> isFirstLaunch;
    private aj<Boolean> isFirstPublishAweme;
    private aj<Boolean> isFirstPublishComment;
    private aj<Boolean> isFirstPublishSync;
    private aj<Boolean> isFirstReportVideo;
    private aj<Boolean> isHighQualityVideo;
    private aj<Boolean> isHotSearchAwemeBillboardEnable;
    private aj<Boolean> isHotSearchBillboardEnable;
    private aj<Boolean> isHotSearchMusicalBillboardEnable;
    private aj<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    private aj<Integer> isNewInstall;
    private aj<Boolean> isNpthEnable;
    private aj<Boolean> isOb;
    private aj<Boolean> isOldUser;
    private aj<Boolean> isPrivateAvailable;
    private aj<Boolean> isProfileBubbleShown;
    private aj<Boolean> isPublishSyncToHuoshan;
    private aj<Boolean> isShowFavouriteIcon;
    private aj<Boolean> isShowNearBy;
    private aj<Boolean> isShowRankingIndicator;
    private aj<Boolean> isShowUserFeedBackPoint;
    private aj<Boolean> isSyncToHuoshan;
    private aj<Boolean> isUseBackRefresh;
    private aj<Boolean> ischangeFollowTab;
    private aj<String> jsActlogUrl;
    private aj<String> judgementClauseScheme;
    private aj<Long> lastCloseFeedUpdateUserDialog;
    private aj<Long> lastCloseUpdateUserDialog;
    private aj<Long> lastFeedCount;
    private aj<Long> lastFeedTime;
    private aj<Long> lastFilterTime;
    private aj<Long> lastGetRelieveAwemeTime;
    private aj<Long> lastHintToastTime;
    private aj<Long> lastLockedTime;
    private aj<Boolean> lastPublishFailed;
    private aj<Long> lastShowBindHintTime;
    private aj<Long> lastShowProfileBindHintTime;
    private aj<Long> lastUnlockTime;
    private aj<Integer> lastUsableNetworkSpeed;
    private aj<Boolean> liveAgreement;
    private aj<Boolean> liveAnswer;
    private aj<Boolean> liveContactsVerify;
    private aj<Boolean> longVideoPermitted;
    private aj<Set<String>> mGeckoChannels;
    private aj<Set<String>> mGeckoInitialHighPriorityChannels;
    private SharedPreferences mSharedPreferences;
    private aj<Boolean> mUseNewPackageNow;
    private aj<String> miniAppLabTitle;
    private aj<Boolean> mockLiveMoney;
    private aj<Boolean> mockLiveResolution;
    private aj<Boolean> mockLiveSend;
    private aj<String> mpTab;
    private aj<Integer> multiSelectLimit;
    private aj<Integer> openImLink;
    private aj<Integer> privacyAccountFollowCount;
    private aj<String> privacyReminderH5Url;
    private aj<Integer> promoteDialogPopupClickType;
    private aj<String> promoteDialogPopupPopupContent;
    private aj<Integer> promoteDialogPopupPopupInterval;
    private aj<String> promoteDialogPopupPopupLinkText;
    private aj<String> promoteDialogPopupPopupMsg;
    private aj<String> promoteDialogPopupPopupTitle;
    private aj<String> promoteDialogPopupPopupUrl;
    private aj<Integer> promoteDialogPopupTimesLimit;
    private aj<Boolean> promoteDialogShouldShow;
    private aj<String> reactAddShopUrl;
    private List<String> recentList;
    private aj<String> referralEntrance;
    private aj<Boolean> removeFollowerSwitch;
    private aj<String> requestNotificationText;
    private aj<String> requestNotificationTitle;
    private aj<Boolean> rnFallback;
    private aj<String> searchTabIndex;
    private aj<Boolean> shouldShowFavouriteTip;
    private aj<Boolean> shouldShowPrivateAccountTipInProfile;
    private aj<Boolean> showAdIntroFlag;
    private aj<Boolean> showAddBusinessGoodsDot;
    private aj<Integer> showBindHintCount;
    private aj<Integer> showCreatorRewards;
    private aj<Integer> showHashTagBg;
    private aj<Boolean> showInvitedContactsFriends;
    private aj<Integer> showLiveRewards;
    private aj<Boolean> showMiniAppFreshGuideBubble;
    private aj<Boolean> showMiniAppFreshGuideDialog;
    private aj<Boolean> showMiniAppFreshGuideNotify;
    private aj<Boolean> showPlayerInfoUI;
    private aj<Integer> showProfileBindHintCount;
    private aj<Integer> showPromoteLicense;
    private aj<Boolean> showTimeLineTab;
    private aj<Boolean> showVideoBitrateInfo;
    private aj<Boolean> stickerArtEntry;
    private aj<String> stickerArtlistUrl;
    private aj<Integer> storyInfoStickerMaxCount;
    private aj<Boolean> storyPublishFriendsDuoshanBanner;
    private aj<Boolean> storyPublishSaveLocal;
    private aj<Boolean> storyRecordGuideShow;
    private aj<String> storyRegisterPublishSyncHintContent;
    private aj<String> storyRegisterPublishSyncHintH5Str;
    private aj<String> storyRegisterPublishSyncHintH5Url;
    private aj<String> storyRegisterPublishSyncHintTitle;
    private aj<Boolean> storySettingDoudouPhoto;
    private aj<Boolean> storySettingManualOpenDoudou;
    private aj<Integer> storySettingReplyPermission;
    private aj<Boolean> storySettingSyncDuoshan;
    private aj<Integer> storySettingSyncToast;
    private aj<Integer> storySettingViewPermission;
    private aj<Integer> storyTextStickerMaxCount;
    private aj<String> storyUnRegisterPublishSyncHintContent;
    private aj<String> storyUnRegisterPublishSyncHintH5Str;
    private aj<String> storyUnRegisterPublishSyncHintH5Url;
    private aj<String> storyUnRegisterPublishSyncHintTitle;
    private aj<Long> todayVideoPlayTime;
    private aj<Boolean> ttRegion;
    private aj<Boolean> ttRoute;
    private aj<String> twitterAccessToken;
    private aj<String> twitterSecret;
    private aj<Integer> ultraResolutionLevel;
    aj<Integer> upGuideNum;
    private aj<Integer> updateUserFrequency;
    private aj<Integer> updateUserPosition;
    private aj<String> updateUserTipContent;
    private aj<Boolean> useCronet;
    private aj<Boolean> useDefaultHost;
    private aj<Boolean> useHttps;
    private aj<String> userAddLanguages;
    private aj<String> userCurrentRegion;
    private aj<Boolean> userHasPassword;
    private aj<String> userResidence;
    private aj<Integer> verifyExceed;
    private aj<Boolean> videoPreload;
    private aj<Integer> weakNetPreLoadSwitch;

    /* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(40882);
        }
    }

    static {
        Covode.recordClassIndex(40881);
    }

    private static Object com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public boolean isOpenForward() {
        return false;
    }

    public static SharePrefCache inst() {
        return a.f66513a;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SharePrefCache f66513a = new SharePrefCache(null);

        static {
            Covode.recordClassIndex(40883);
        }
    }

    public boolean getImCommentForwardEnabled() {
        return getImCommentForwardEnabledItem().c().booleanValue();
    }

    public String getImUrlTemplate() {
        return getImUrlTemplateItem().c();
    }

    public boolean getIsFirstPublishAweme() {
        return getFirstPublishAwemeItem().c().booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        return getFirstPublishCommentItem().c().booleanValue();
    }

    public int getMultiSelectLimit() {
        return getMultiSelectLimitItem().c().intValue();
    }

    public int getOpenImLink() {
        return getOpenImLinkItem().c().intValue();
    }

    private aj<Integer> getArStickerFliterTimesItem() {
        if (this.arStickerFliterTimes == null) {
            aj<Integer> ajVar = new aj<>("ar_sticker_filter_guide_times", (Integer) 0);
            this.arStickerFliterTimes = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.arStickerFliterTimes;
    }

    private aj<Boolean> getCanLive() {
        if (this.canLive == null) {
            aj<Boolean> ajVar = new aj<>("live_can_live", (Boolean) false);
            this.canLive = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canLive;
    }

    private aj<Boolean> getClickMoreRedPoint() {
        if (this.isClickMoreRedPoint == null) {
            aj<Boolean> ajVar = new aj<>("is_click_more_red_point", (Boolean) false);
            this.isClickMoreRedPoint = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isClickMoreRedPoint;
    }

    private aj<Boolean> getFirstPublishAwemeItem() {
        if (this.isFirstPublishAweme == null) {
            aj<Boolean> ajVar = new aj<>("first_publish_aweme", (Boolean) true);
            this.isFirstPublishAweme = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishAweme;
    }

    private aj<Boolean> getFirstPublishCommentItem() {
        if (this.isFirstPublishComment == null) {
            aj<Boolean> ajVar = new aj<>("first_publish_comment", (Boolean) true);
            this.isFirstPublishComment = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishComment;
    }

    private aj<Boolean> getHasShowFilterGuideItem() {
        if (this.hasShowFilterGuide == null) {
            aj<Boolean> ajVar = new aj<>("live_show_filter_guide", (Boolean) false);
            this.hasShowFilterGuide = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasShowFilterGuide;
    }

    private aj<Integer> getShowCreatorRewards() {
        if (this.showCreatorRewards == null) {
            aj<Integer> ajVar = new aj<>("show_creator_rewards", (Integer) 0);
            this.showCreatorRewards = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showCreatorRewards;
    }

    private aj<Integer> getShowLiveRewards() {
        if (this.showLiveRewards == null) {
            aj<Integer> ajVar = new aj<>("show_live_rewards", (Integer) 0);
            this.showLiveRewards = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showLiveRewards;
    }

    public void clearCache() {
        collectAllItemsIfNeed();
        for (aj ajVar : this.cacheItems) {
            ajVar.a();
        }
    }

    public aj<String> getAdIntroUrlItem() {
        if (this.adIntroUrl == null) {
            aj<String> ajVar = new aj<>("ad_intro_url", "");
            this.adIntroUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.adIntroUrl;
    }

    public aj<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            aj<String> ajVar = new aj<>("ad_landing_page_config", "");
            this.adLandingPageConfig = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.adLandingPageConfig;
    }

    public aj<String> getAdSouthNorthFirstSupportTeam() {
        if (this.adSouthNorthFirstSupportTeam == null) {
            this.adSouthNorthFirstSupportTeam = new aj<>("ad_south_north_support_team", "");
        }
        return this.adSouthNorthFirstSupportTeam;
    }

    public aj<Long> getAdSouthNorthFirstSupportTime() {
        if (this.adSouthNorthFirstSupportTime == null) {
            this.adSouthNorthFirstSupportTime = new aj<>("ad_south_north_support_time", (Long) 0L);
        }
        return this.adSouthNorthFirstSupportTime;
    }

    public aj<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            aj<Integer> ajVar = new aj<>("at_friends_show_type", (Integer) 0);
            this.atFriendsShowType = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.atFriendsShowType;
    }

    public aj<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            aj<Boolean> ajVar = new aj<>("auto_save_video", (Boolean) true);
            this.autoSaveVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.autoSaveVideo;
    }

    public aj<Boolean> getAutoSendTwitter() {
        if (this.autoSendTwitter == null) {
            aj<Boolean> ajVar = new aj<>("auto_send_twitter", (Boolean) false);
            this.autoSendTwitter = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.autoSendTwitter;
    }

    public aj<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            aj<Boolean> ajVar = new aj<>("can_create_insights", (Boolean) false);
            this.canCreateInsights = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canCreateInsights;
    }

    public aj<Integer> getCanIm() {
        if (this.canIm == null) {
            aj<Integer> ajVar = new aj<>("im_can_im", (Integer) 1);
            this.canIm = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canIm;
    }

    public aj<Integer> getCanImSendPic() {
        if (this.canImSendPic == null) {
            aj<Integer> ajVar = new aj<>("im_can_send_pic", (Integer) 0);
            this.canImSendPic = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.canImSendPic;
    }

    public aj<Integer> getCompleteProfilePolicyInterval() {
        if (this.completeProfilePolicyInterval == null) {
            aj<Integer> ajVar = new aj<>("completeprofilepolicy_interval", (Integer) 0);
            this.completeProfilePolicyInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.completeProfilePolicyInterval;
    }

    public aj<Integer> getCompleteProfilePolicyTimes() {
        if (this.completeProfilePolicyTimes == null) {
            aj<Integer> ajVar = new aj<>("completeprofilepolicy_times", (Integer) 0);
            this.completeProfilePolicyTimes = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.completeProfilePolicyTimes;
    }

    public aj<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            aj<String> ajVar = new aj<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.imCurrentLocaleLanguage = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imCurrentLocaleLanguage;
    }

    public aj<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            aj<Boolean> ajVar = new aj<>("debug_web_bar", (Boolean) true);
            this.debugWebBar = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.debugWebBar;
    }

    public aj<Set<String>> getDefaultAvatarUrl() {
        if (this.defaultAvatarUrl == null) {
            aj<Set<String>> ajVar = new aj<>("default_avatarurl", new HashSet());
            this.defaultAvatarUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.defaultAvatarUrl;
    }

    public aj<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            aj<String> ajVar = new aj<>("download_forbidden_toast", "");
            this.downloadForbiddenToast = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadForbiddenToast;
    }

    public aj<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            aj<Integer> ajVar = new aj<>("download_micro_app", (Integer) 1);
            this.downloadMicroApp = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadMicroApp;
    }

    public aj<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            aj<String> ajVar = new aj<>("download_sdk_config", "");
            this.downloadSdkConfig = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.downloadSdkConfig;
    }

    public aj<Boolean> getDownloadStatusWhenPublish() {
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new aj<>("download_status_when_publish", (Boolean) true);
        }
        return this.downloadStatusWhenPublish;
    }

    public aj<Boolean> getEableUltraResolution() {
        if (this.enableUltraResolution == null) {
            aj<Boolean> ajVar = new aj<>("enable_ultra_resolution", (Boolean) false);
            this.enableUltraResolution = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableUltraResolution;
    }

    public aj<Boolean> getEnableAntiAliasing() {
        if (this.enableAntiAliasing == null) {
            aj<Boolean> ajVar = new aj<>("enable_anti_aliasing", (Boolean) false);
            this.enableAntiAliasing = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableAntiAliasing;
    }

    public aj<Integer> getEnableBindItemCallOMSDK() {
        if (this.enableBindItemCallOMSDK == null) {
            aj<Integer> ajVar = new aj<>("enableBindItemCallOMSDK", (Integer) 0);
            this.enableBindItemCallOMSDK = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableBindItemCallOMSDK;
    }

    public aj<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            aj<Boolean> ajVar = new aj<>("enable_profile_link", (Boolean) false);
            this.enableProfileActivityLink = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableProfileActivityLink;
    }

    public aj<String> getFacebookAccessToken() {
        if (this.facebookAccessToken == null) {
            aj<String> ajVar = new aj<>("facebook_access_token", "");
            this.facebookAccessToken = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.facebookAccessToken;
    }

    public aj<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            aj<Long> ajVar = new aj<>("festival_share_donation_time", (Long) 0L);
            this.festivalShareDonationTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.festivalShareDonationTime;
    }

    public aj<Integer> getFlashStatus() {
        if (this.flashStatus == null) {
            aj<Integer> ajVar = new aj<>("flash_status", (Integer) 0);
            this.flashStatus = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.flashStatus;
    }

    public aj<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            aj<Boolean> ajVar = new aj<>("follow_guide_shown", (Boolean) false);
            this.followGuideShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followGuideShown;
    }

    public aj<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            aj<Long> ajVar = new aj<>("follow_notice_close_time", (Long) 0L);
            this.followNoticeCloseTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followNoticeCloseTime;
    }

    public aj<Integer> getFollowUserThreshold() {
        if (this.followUserThreshold == null) {
            aj<Integer> ajVar = new aj<>("show_follow_tab_following_limit", (Integer) 1);
            this.followUserThreshold = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.followUserThreshold;
    }

    public aj<Set<String>> getGeckoChannels() {
        if (this.mGeckoChannels == null) {
            aj<Set<String>> ajVar = new aj<>("gecko_init_channels", new HashSet());
            this.mGeckoChannels = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mGeckoChannels;
    }

    public aj<Set<String>> getGeckoInitialHighPriorityChannels() {
        if (this.mGeckoInitialHighPriorityChannels == null) {
            aj<Set<String>> ajVar = new aj<>("initial_high_priority_channel", new HashSet());
            this.mGeckoInitialHighPriorityChannels = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mGeckoInitialHighPriorityChannels;
    }

    public aj<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            aj<Boolean> ajVar = new aj<>("gecko_local_test_use_online", (Boolean) false);
            this.geckoLocalTestUseOnline = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.geckoLocalTestUseOnline;
    }

    public aj<String> getGoogleServerAuthCode() {
        if (this.googleServerAuthCode == null) {
            aj<String> ajVar = new aj<>("google_server_auth_code", "");
            this.googleServerAuthCode = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.googleServerAuthCode;
    }

    public aj<Boolean> getHasAlreadyShowBubble() {
        if (this.hasAlreadyShowBubble == null) {
            aj<Boolean> ajVar = new aj<>("has_already_show_bubble", (Boolean) false);
            this.hasAlreadyShowBubble = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasAlreadyShowBubble;
    }

    public aj<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            aj<Boolean> ajVar = new aj<>("has_enter_bind_phone", (Boolean) false);
            this.hasEnterBindPhone = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasEnterBindPhone;
    }

    public aj<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            aj<Boolean> ajVar = new aj<>("has_long_pressed_dislike", (Boolean) false);
            this.hasLongPressDislike = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasLongPressDislike;
    }

    public aj<String> getHitRankActivityProfileBackground() {
        if (this.hitRankActivityProfileBackgroud == null) {
            aj<String> ajVar = new aj<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.hitRankActivityProfileBackgroud = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public aj<String> getHitRankActivityStarBackground() {
        if (this.hitRankActivityStarBackground == null) {
            aj<String> ajVar = new aj<>("hit_rank_activity_star_background", "");
            this.hitRankActivityStarBackground = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityStarBackground;
    }

    public aj<Integer> getHitRankActivityStatus() {
        if (this.hitRankActivityStatus == null) {
            aj<Integer> ajVar = new aj<>("hit_rank_activity_status", (Integer) 0);
            this.hitRankActivityStatus = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hitRankActivityStatus;
    }

    public aj<Integer> getHotSearchWordsShowInterval() {
        if (this.hotSearchWordsShowInterval == null) {
            aj<Integer> ajVar = new aj<>("hot_search_words_show_interval", (Integer) 2);
            this.hotSearchWordsShowInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hotSearchWordsShowInterval;
    }

    public aj<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            aj<Boolean> ajVar = new aj<>("iesoffline", (Boolean) true);
            this.iesOffline = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.iesOffline;
    }

    public aj<Boolean> getImCommentForwardEnabledItem() {
        if (this.imCommentForwardEnabled == null) {
            aj<Boolean> ajVar = new aj<>("im_comment_forward_enabled", (Boolean) true);
            this.imCommentForwardEnabled = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imCommentForwardEnabled;
    }

    public aj<String> getImUrlTemplateItem() {
        if (this.imUrlTemplate == null) {
            aj<String> ajVar = new aj<>("im_url_template", "");
            this.imUrlTemplate = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.imUrlTemplate;
    }

    public aj<String> getInvitedContacts() {
        if (this.invitedContacts == null) {
            aj<String> ajVar = new aj<>("invite_friends", "");
            this.invitedContacts = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.invitedContacts;
    }

    public aj<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            aj<Boolean> ajVar = new aj<>("is_aweme_private", (Boolean) false);
            this.isAwemePrivate = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isAwemePrivate;
    }

    public aj<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            aj<Boolean> ajVar = new aj<>("is_change_follow_tab", (Boolean) false);
            this.ischangeFollowTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.ischangeFollowTab;
    }

    public aj<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            aj<Boolean> ajVar = new aj<>("contacts_uploaded", (Boolean) false);
            this.isContactsUploaded = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isContactsUploaded;
    }

    public aj<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            aj<Boolean> ajVar = new aj<>("is_first_lauch", (Boolean) true);
            this.isFirstLaunch = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstLaunch;
    }

    public aj<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            aj<Boolean> ajVar = new aj<>("is_first_report_video", (Boolean) true);
            this.isFirstReportVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstReportVideo;
    }

    public aj<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (this.isHotSearchAwemeBillboardEnable == null) {
            aj<Boolean> ajVar = new aj<>("is_hot_search_aweme_billboard_enable", (Boolean) false);
            this.isHotSearchAwemeBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public aj<Boolean> getIsHotSearchBillboardEnable() {
        if (this.isHotSearchBillboardEnable == null) {
            aj<Boolean> ajVar = new aj<>("is_hot_search_billboard_enable", (Boolean) false);
            this.isHotSearchBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchBillboardEnable;
    }

    public aj<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (this.isHotSearchMusicalBillboardEnable == null) {
            aj<Boolean> ajVar = new aj<>("is_hot_search_music_billboard_enable", (Boolean) false);
            this.isHotSearchMusicalBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public aj<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            aj<Boolean> ajVar = new aj<>("is_hot_search_positive_energy_billboard_enable", (Boolean) false);
            this.isHotSearchPositiveEnergyBillboardEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public aj<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            aj<Integer> ajVar = new aj<>("is_new_install", (Integer) -1);
            this.isNewInstall = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isNewInstall;
    }

    public aj<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            aj<Boolean> ajVar = new aj<>("old_user", (Boolean) false);
            this.isOldUser = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isOldUser;
    }

    public aj<Boolean> getIsPrivateAvailable() {
        if (this.isPrivateAvailable == null) {
            aj<Boolean> ajVar = new aj<>("private_aweme_available", (Boolean) true);
            this.isPrivateAvailable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isPrivateAvailable;
    }

    public aj<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            aj<Boolean> ajVar = new aj<>("profile_bubble_shown", (Boolean) true);
            this.isProfileBubbleShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isProfileBubbleShown;
    }

    public aj<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            aj<Boolean> ajVar = new aj<>("show_favourite_icon", (Boolean) false);
            this.isShowFavouriteIcon = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowFavouriteIcon;
    }

    public aj<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            aj<Boolean> ajVar = new aj<>("is_show_near_by", (Boolean) false);
            this.isShowNearBy = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowNearBy;
    }

    public aj<Boolean> getIsShowRankingIndicator() {
        if (this.isShowRankingIndicator == null) {
            aj<Boolean> ajVar = new aj<>("is_show_ranking_indicator", (Boolean) true);
            this.isShowRankingIndicator = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowRankingIndicator;
    }

    public aj<Boolean> getIsShowUserFeedBackPoint() {
        if (this.isShowUserFeedBackPoint == null) {
            aj<Boolean> ajVar = new aj<>("si_show_user_feed_back_point", (Boolean) false);
            this.isShowUserFeedBackPoint = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isShowUserFeedBackPoint;
    }

    public aj<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            aj<Boolean> ajVar = new aj<>("is_use_back_refresh", (Boolean) true);
            this.isUseBackRefresh = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isUseBackRefresh;
    }

    public aj<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            aj<String> ajVar = new aj<>("js_actlog_url", "");
            this.jsActlogUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.jsActlogUrl;
    }

    public aj<Long> getLastCloseFeedUpdateDialogTime() {
        if (this.lastCloseFeedUpdateUserDialog == null) {
            aj<Long> ajVar = new aj<>("last_close_feed_update_user_dialog", (Long) 0L);
            this.lastCloseFeedUpdateUserDialog = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public aj<Long> getLastCloseUpdateDialogTime() {
        if (this.lastCloseUpdateUserDialog == null) {
            aj<Long> ajVar = new aj<>("last_close_update_user_dialog", (Long) 0L);
            this.lastCloseUpdateUserDialog = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public aj<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            aj<Long> ajVar = new aj<>("last_feed_count", (Long) 0L);
            this.lastFeedCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFeedCount;
    }

    public aj<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            aj<Long> ajVar = new aj<>("last_feed_time", (Long) 0L);
            this.lastFeedTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFeedTime;
    }

    public aj<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            aj<Long> ajVar = new aj<>("last_filter_time", (Long) 0L);
            this.lastFilterTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastFilterTime;
    }

    public aj<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            aj<Long> ajVar = new aj<>("has_relieve_aweme", (Long) 0L);
            this.lastGetRelieveAwemeTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public aj<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            aj<Long> ajVar = new aj<>("last_hint_toast_time", (Long) 0L);
            this.lastHintToastTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastHintToastTime;
    }

    public aj<Long> getLastLockedTime() {
        if (this.lastLockedTime == null) {
            aj<Long> ajVar = new aj<>("last_append_video_time", (Long) 0L);
            this.lastLockedTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastLockedTime;
    }

    public aj<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            aj<Boolean> ajVar = new aj<>("last_publish_failed", (Boolean) false);
            this.lastPublishFailed = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastPublishFailed;
    }

    public aj<Long> getLastShowBindHintTime() {
        if (this.lastShowBindHintTime == null) {
            aj<Long> ajVar = new aj<>("lastShowBindHintTime", (Long) 0L);
            this.lastShowBindHintTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastShowBindHintTime;
    }

    public aj<Long> getLastShowProfileBindHintTime() {
        if (this.lastShowProfileBindHintTime == null) {
            aj<Long> ajVar = new aj<>("lastShowProfileBindHintTime", (Long) 0L);
            this.lastShowProfileBindHintTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastShowProfileBindHintTime;
    }

    public aj<Long> getLastUnlockTime() {
        if (this.lastUnlockTime == null) {
            aj<Long> ajVar = new aj<>("last_unlock_time", (Long) 0L);
            this.lastUnlockTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.lastUnlockTime;
    }

    public aj<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new aj<>("last_usable_network_speed", (Integer) -1);
        }
        return this.lastUsableNetworkSpeed;
    }

    public aj<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            aj<Boolean> ajVar = new aj<>("long_video_permitted", (Boolean) false);
            this.longVideoPermitted = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.longVideoPermitted;
    }

    public aj<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            aj<String> ajVar = new aj<>("lab_title", "");
            this.miniAppLabTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.miniAppLabTitle;
    }

    public aj<String> getMpTab() {
        if (this.mpTab == null) {
            aj<String> ajVar = new aj<>("mp_tab", "");
            this.mpTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mpTab;
    }

    public aj<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            aj<Integer> ajVar = new aj<>("multi_select_limit", (Integer) 10);
            this.multiSelectLimit = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.multiSelectLimit;
    }

    public aj<Integer> getOpenImLinkItem() {
        if (this.openImLink == null) {
            aj<Integer> ajVar = new aj<>("open_im_link", (Integer) 0);
            this.openImLink = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.openImLink;
    }

    public aj<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new aj<>("privacy_account_follow_count", (Integer) 0);
        }
        return this.privacyAccountFollowCount;
    }

    public aj<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            aj<String> ajVar = new aj<>("privacy_reminder", "");
            this.privacyReminderH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.privacyReminderH5Url;
    }

    public aj<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            aj<Integer> ajVar = new aj<>("promote_dialog_popup_click_type", (Integer) 0);
            this.promoteDialogPopupClickType = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupClickType;
    }

    public aj<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            aj<String> ajVar = new aj<>("promote_dialog_popup_content", "");
            this.promoteDialogPopupPopupContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public aj<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            aj<Integer> ajVar = new aj<>("promote_dialog_popup_interval", (Integer) 7);
            this.promoteDialogPopupPopupInterval = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public aj<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            aj<String> ajVar = new aj<>("promote_dialog_popup_linkText", "");
            this.promoteDialogPopupPopupLinkText = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public aj<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            aj<String> ajVar = new aj<>("promote_dialog_popup_msg", "");
            this.promoteDialogPopupPopupMsg = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public aj<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            aj<String> ajVar = new aj<>("promote_dialog_popup_title", "");
            this.promoteDialogPopupPopupTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public aj<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            aj<String> ajVar = new aj<>("promote_dialog_popup_url", "");
            this.promoteDialogPopupPopupUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public aj<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            aj<Integer> ajVar = new aj<>("promote_dialog_popup_times_limit", (Integer) 3);
            this.promoteDialogPopupTimesLimit = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public aj<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            aj<Boolean> ajVar = new aj<>("promote_dialog_show", (Boolean) false);
            this.promoteDialogShouldShow = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.promoteDialogShouldShow;
    }

    public aj<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new aj<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public aj<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new aj<>("remove_follower_switch", (Boolean) false);
        }
        return this.removeFollowerSwitch;
    }

    public aj<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            aj<String> ajVar = new aj<>("request_notification_text", "");
            this.requestNotificationText = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.requestNotificationText;
    }

    public aj<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            aj<String> ajVar = new aj<>("request_notification_title", "");
            this.requestNotificationTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.requestNotificationTitle;
    }

    public aj<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            aj<Boolean> ajVar = new aj<>("rn_fallback", (Boolean) false);
            this.rnFallback = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.rnFallback;
    }

    public aj<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            aj<String> ajVar = new aj<>("search_tab_index", "");
            this.searchTabIndex = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.searchTabIndex;
    }

    public aj<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            aj<Boolean> ajVar = new aj<>("should_show_favourite_tip", (Boolean) true);
            this.shouldShowFavouriteTip = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.shouldShowFavouriteTip;
    }

    public aj<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            aj<Boolean> ajVar = new aj<>("show_private_account_tip_in_profile", (Boolean) false);
            this.shouldShowPrivateAccountTipInProfile = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public aj<Boolean> getShowAdIntroItem() {
        if (this.showAdIntroFlag == null) {
            aj<Boolean> ajVar = new aj<>("is_show_ad_intro", (Boolean) false);
            this.showAdIntroFlag = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showAdIntroFlag;
    }

    public aj<Boolean> getShowAddBusinessGoodsDot() {
        if (this.showAddBusinessGoodsDot == null) {
            aj<Boolean> ajVar = new aj<>("show_add_business_dot", (Boolean) true);
            this.showAddBusinessGoodsDot = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showAddBusinessGoodsDot;
    }

    public aj<Integer> getShowBindHintCount() {
        if (this.showBindHintCount == null) {
            aj<Integer> ajVar = new aj<>("showBindHintCount", (Integer) 0);
            this.showBindHintCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showBindHintCount;
    }

    public aj<Integer> getShowHashTagBg() {
        if (this.showHashTagBg == null) {
            aj<Integer> ajVar = new aj<>("enable_hashtag_background", (Integer) 0);
            this.showHashTagBg = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showHashTagBg;
    }

    public aj<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            aj<Boolean> ajVar = new aj<>("show_player_info_ui", (Boolean) false);
            this.showPlayerInfoUI = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showPlayerInfoUI;
    }

    public aj<Integer> getShowProfileBindHintCount() {
        if (this.showProfileBindHintCount == null) {
            aj<Integer> ajVar = new aj<>("showProfileBindHintCount", (Integer) 0);
            this.showProfileBindHintCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showProfileBindHintCount;
    }

    public aj<Integer> getShowPromoteLicense() {
        if (this.showPromoteLicense == null) {
            aj<Integer> ajVar = new aj<>("show_creator_license_210", (Integer) 0);
            this.showPromoteLicense = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showPromoteLicense;
    }

    public aj<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            aj<Boolean> ajVar = new aj<>("show_timeline_tab", (Boolean) false);
            this.showTimeLineTab = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showTimeLineTab;
    }

    public aj<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            aj<Boolean> ajVar = new aj<>("showVideoBitrateInfo", (Boolean) false);
            this.showVideoBitrateInfo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showVideoBitrateInfo;
    }

    public aj<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            aj<Boolean> ajVar = new aj<>("sticker_artist_entry", (Boolean) false);
            this.stickerArtEntry = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.stickerArtEntry;
    }

    public aj<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            aj<String> ajVar = new aj<>("sticker_artlist_url", "");
            this.stickerArtlistUrl = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.stickerArtlistUrl;
    }

    public aj<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            aj<Integer> ajVar = new aj<>("story_info_sticker_max_count", (Integer) 30);
            this.storyInfoStickerMaxCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyInfoStickerMaxCount;
    }

    public aj<Boolean> getStoryPublishFriendsBanner() {
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new aj<>("story_publish_friend_banner", (Boolean) false);
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public aj<Boolean> getStoryPublishSaveLocal() {
        if (this.storyPublishSaveLocal == null) {
            aj<Boolean> ajVar = new aj<>("story_publish_save_local", (Boolean) true);
            this.storyPublishSaveLocal = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyPublishSaveLocal;
    }

    public aj<Boolean> getStoryRecordGuideShow() {
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new aj<>("story_record_guide_show", (Boolean) false);
        }
        return this.storyRecordGuideShow;
    }

    public aj<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            aj<String> ajVar = new aj<>("story_publish_register_sync_hint_content", "");
            this.storyRegisterPublishSyncHintContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public aj<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            aj<String> ajVar = new aj<>("story_publish_register_sync_hint_h5", "");
            this.storyRegisterPublishSyncHintH5Str = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public aj<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            aj<String> ajVar = new aj<>("story_publish_register_sync_hint_h5_url", "");
            this.storyRegisterPublishSyncHintH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public aj<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            aj<String> ajVar = new aj<>("story_publish_register_sync_hint_title", "");
            this.storyRegisterPublishSyncHintTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public aj<Boolean> getStorySettingDoudouPhoto() {
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new aj<>("story_setting_duodou_photo", (Boolean) true);
        }
        return this.storySettingDoudouPhoto;
    }

    public aj<Boolean> getStorySettingManualOpenDoudou() {
        if (this.storySettingManualOpenDoudou == null) {
            aj<Boolean> ajVar = new aj<>("story_setting_manual_open_doudou", (Boolean) false);
            this.storySettingManualOpenDoudou = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storySettingManualOpenDoudou;
    }

    public aj<Integer> getStorySettingReplyPermission() {
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new aj<>("story_setting_reply_permission", (Integer) 0);
        }
        return this.storySettingReplyPermission;
    }

    public aj<Boolean> getStorySettingSyncDuoshan() {
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new aj<>("story_setting_sync_duoshan", (Boolean) false);
        }
        return this.storySettingSyncDuoshan;
    }

    public aj<Integer> getStorySettingSyncToast() {
        if (this.storySettingSyncToast == null) {
            aj<Integer> ajVar = new aj<>("story_setting_sync_toast", (Integer) 0);
            this.storySettingSyncToast = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storySettingSyncToast;
    }

    public aj<Integer> getStorySettingViewPermission() {
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new aj<>("story_setting_view_permission", (Integer) 0);
        }
        return this.storySettingViewPermission;
    }

    public aj<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            aj<Integer> ajVar = new aj<>("story_text_sticker_max_count", (Integer) 30);
            this.storyTextStickerMaxCount = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyTextStickerMaxCount;
    }

    public aj<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            aj<String> ajVar = new aj<>("story_publish_unregister_sync_hint_content", "");
            this.storyUnRegisterPublishSyncHintContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public aj<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            aj<String> ajVar = new aj<>("story_publish_unregister_sync_hint_h5", "");
            this.storyUnRegisterPublishSyncHintH5Str = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public aj<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            aj<String> ajVar = new aj<>("story_publish_unregister_sync_hint_h5_url", "");
            this.storyUnRegisterPublishSyncHintH5Url = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public aj<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            aj<String> ajVar = new aj<>("story_publish_unregister_sync_hint_title", "");
            this.storyUnRegisterPublishSyncHintTitle = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public aj<Long> getTodayVideoPlayTime() {
        if (this.todayVideoPlayTime == null) {
            aj<Long> ajVar = new aj<>("today_video_play_time", (Long) 0L);
            this.todayVideoPlayTime = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.todayVideoPlayTime;
    }

    public aj<String> getTwitterAccessToken() {
        if (this.twitterAccessToken == null) {
            aj<String> ajVar = new aj<>("twitter_access_token", "");
            this.twitterAccessToken = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.twitterAccessToken;
    }

    public aj<String> getTwitterSecret() {
        if (this.twitterSecret == null) {
            aj<String> ajVar = new aj<>("twitter_secret", "");
            this.twitterSecret = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.twitterSecret;
    }

    public aj<Integer> getUltraResolutionLevel() {
        if (this.ultraResolutionLevel == null) {
            aj<Integer> ajVar = new aj<>("ultra_resolution_level", (Integer) 0);
            this.ultraResolutionLevel = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.ultraResolutionLevel;
    }

    public aj<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            aj<Integer> ajVar = new aj<>("up_guide_num", (Integer) -1);
            this.upGuideNum = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.upGuideNum;
    }

    public aj<Integer> getUpdateUserFrequency() {
        if (this.updateUserFrequency == null) {
            aj<Integer> ajVar = new aj<>("update_user_frequency", (Integer) 0);
            this.updateUserFrequency = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserFrequency;
    }

    public aj<Integer> getUpdateUserPosition() {
        if (this.updateUserPosition == null) {
            aj<Integer> ajVar = new aj<>("update_user_position", (Integer) -1);
            this.updateUserPosition = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserPosition;
    }

    public aj<String> getUpdateUserTipContent() {
        if (this.updateUserTipContent == null) {
            aj<String> ajVar = new aj<>("update_user_tip_content", "");
            this.updateUserTipContent = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.updateUserTipContent;
    }

    public aj<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            aj<Boolean> ajVar = new aj<>("use_cronet", (Boolean) true);
            this.useCronet = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useCronet;
    }

    public aj<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            aj<Boolean> ajVar = new aj<>("use_default_host", (Boolean) true);
            this.useDefaultHost = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useDefaultHost;
    }

    public aj<Boolean> getUseHttps() {
        if (this.useHttps == null) {
            aj<Boolean> ajVar = new aj<>("use_https", (Boolean) true);
            this.useHttps = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.useHttps;
    }

    public aj<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            aj<Boolean> ajVar = new aj<>("use_new_package_now", (Boolean) false);
            this.mUseNewPackageNow = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mUseNewPackageNow;
    }

    public aj<String> getUserAddLanguages() {
        if (this.userAddLanguages == null) {
            aj<String> ajVar = new aj<>("user_add_languages", "");
            this.userAddLanguages = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userAddLanguages;
    }

    public aj<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            aj<String> ajVar = new aj<>("user_current_region", "");
            this.userCurrentRegion = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userCurrentRegion;
    }

    public aj<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            aj<Boolean> ajVar = new aj<>("user_has_password", (Boolean) false);
            this.userHasPassword = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userHasPassword;
    }

    public aj<String> getUserResidence() {
        if (this.userResidence == null) {
            aj<String> ajVar = new aj<>("user_residence", "");
            this.userResidence = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.userResidence;
    }

    public aj<Integer> getVerifyExceed() {
        if (this.verifyExceed == null) {
            aj<Integer> ajVar = new aj<>("verify_exceed", (Integer) 5);
            this.verifyExceed = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.verifyExceed;
    }

    public aj<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            aj<Boolean> ajVar = new aj<>("video_preload", (Boolean) true);
            this.videoPreload = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.videoPreload;
    }

    public aj<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            aj<Integer> ajVar = new aj<>("weak_net_pre_load_switch", (Integer) 1);
            this.weakNetPreLoadSwitch = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.weakNetPreLoadSwitch;
    }

    public aj<Boolean> hasShowHighQualityVideoTips() {
        if (this.hasShowHighQualityVideoTips == null) {
            aj<Boolean> ajVar = new aj<>("has_show_high_quality_video_tips", (Boolean) false);
            this.hasShowHighQualityVideoTips = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.hasShowHighQualityVideoTips;
    }

    public aj<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            aj<Boolean> ajVar = new aj<>("live_enanble_message_pb2json", (Boolean) false);
            this.enableMessagePb2Json = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.enableMessagePb2Json;
    }

    public aj<Boolean> isFirstPublishSync() {
        if (this.isFirstPublishSync == null) {
            aj<Boolean> ajVar = new aj<>("is_first_publish", (Boolean) true);
            this.isFirstPublishSync = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isFirstPublishSync;
    }

    public aj<Boolean> isHighQualityVideo() {
        if (this.isHighQualityVideo == null) {
            aj<Boolean> ajVar = new aj<>("is_high_quality_video", (Boolean) false);
            this.isHighQualityVideo = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isHighQualityVideo;
    }

    public aj<Boolean> isInUltraResBlackList() {
        if (this.inUltraResBlackList == null) {
            aj<Boolean> ajVar = new aj<>("in_ultra_resolution_black_list", (Boolean) false);
            this.inUltraResBlackList = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.inUltraResBlackList;
    }

    public aj<Boolean> isNpthEnable() {
        if (this.isNpthEnable == null) {
            aj<Boolean> ajVar = new aj<>("is_npth_enable", (Boolean) false);
            this.isNpthEnable = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isNpthEnable;
    }

    public aj<Boolean> isOb() {
        if (this.isOb == null) {
            aj<Boolean> ajVar = new aj<>("is_ob", (Boolean) false);
            this.isOb = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isOb;
    }

    public aj<Boolean> isPublishSyncToHuoshan() {
        if (this.isPublishSyncToHuoshan == null) {
            aj<Boolean> ajVar = new aj<>("is_publish_sync_huoshan", (Boolean) true);
            this.isPublishSyncToHuoshan = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isPublishSyncToHuoshan;
    }

    public aj<Boolean> isShowInviteContactsFriends() {
        if (this.showInvitedContactsFriends == null) {
            aj<Boolean> ajVar = new aj<>("invite_friends_settings", (Boolean) false);
            this.showInvitedContactsFriends = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.showInvitedContactsFriends;
    }

    public aj<Boolean> isSyncToHuoshan() {
        if (this.isSyncToHuoshan == null) {
            aj<Boolean> ajVar = new aj<>("is_sync_to_huoshan", (Boolean) false);
            this.isSyncToHuoshan = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isSyncToHuoshan;
    }

    public aj<Boolean> liveAgreement() {
        if (this.liveAgreement == null) {
            aj<Boolean> ajVar = new aj<>("live_agreement", (Boolean) false);
            this.liveAgreement = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveAgreement;
    }

    public aj<Boolean> liveAnswer() {
        if (this.liveAnswer == null) {
            aj<Boolean> ajVar = new aj<>("live_answer", (Boolean) false);
            this.liveAnswer = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveAnswer;
    }

    public aj<Boolean> liveContactsVerify() {
        if (this.liveContactsVerify == null) {
            aj<Boolean> ajVar = new aj<>("live_contacts_verify", (Boolean) false);
            this.liveContactsVerify = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.liveContactsVerify;
    }

    public aj<Boolean> mockLiveMoney() {
        if (this.mockLiveMoney == null) {
            aj<Boolean> ajVar = new aj<>("mock_live_money", (Boolean) false);
            this.mockLiveMoney = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveMoney;
    }

    public aj<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            aj<Boolean> ajVar = new aj<>("mock_live_resolution", (Boolean) false);
            this.mockLiveResolution = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveResolution;
    }

    public aj<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            aj<Boolean> ajVar = new aj<>("mock_live_send", (Boolean) false);
            this.mockLiveSend = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.mockLiveSend;
    }

    private SharePrefCache() {
        this.recentList = Arrays.asList("IN", "NP", "PK", "LK");
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mSharedPreferences = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme-app", 0);
    }

    private void collectAllItemsIfNeed() {
        if (!this.collectAllItems) {
            this.collectAllItems = true;
            Method[] declaredMethods = SharePrefCache.class.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.getReturnType() == aj.class) {
                    try {
                        com_ss_android_ugc_aweme_app_SharePrefCache_java_lang_reflect_Method_invoke(method, this, new Object[0]);
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    public aj<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            aj<Boolean> ajVar = new aj<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.isContactDialogShown = ajVar;
            this.cacheItems.add(ajVar);
        }
        return this.isContactDialogShown;
    }

    public aj<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(f.b())) {
                this.isEuropeCountry = new aj<>("is_europe_country", Boolean.valueOf(f.a(f.b())));
            } else if (!TextUtils.isEmpty(f.a())) {
                this.isEuropeCountry = new aj<>("is_europe_country", Boolean.valueOf(f.a(f.a())));
            } else {
                this.isEuropeCountry = new aj<>("is_europe_country", (Boolean) false);
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    /* synthetic */ SharePrefCache(AnonymousClass1 r1) {
        this();
    }

    public void setCurrentLocaleLanguage(String str) {
        getCurrentLocaleLanguage().b(str);
    }

    public void setImUrlTemplate(String str) {
        getImUrlTemplateItem().b(str);
    }

    public void setInvitedContacts(String str) {
        getInvitedContacts().b(str);
    }

    public void setShowInvitedContactsFriends(Boolean bool) {
        isShowInviteContactsFriends().b(bool);
    }

    public void setImCommentForwardEnabled(boolean z) {
        getImCommentForwardEnabledItem().b(Boolean.valueOf(z));
    }

    public void setIsFirstPublishAweme(boolean z) {
        getFirstPublishAwemeItem().b(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        getFirstPublishCommentItem().b(Boolean.valueOf(z));
    }

    public void setMultiSelectLimit(int i2) {
        getMultiSelectLimitItem().b(Integer.valueOf(i2));
    }

    public void setOpenImLink(int i2) {
        getOpenImLinkItem().b(Integer.valueOf(i2));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        getShowAddBusinessGoodsDot().b(Boolean.valueOf(z));
    }
}
