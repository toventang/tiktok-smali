package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IESSettingsProxy {
    private static final Boolean DEFAULT_BOOLEAN = false;
    private static final Float DEFAULT_FLOAT = Float.valueOf(0.74347335f);
    private static final Integer DEFAULT_INTEGER = 2690237;
    private static final Long DEFAULT_LONG = 992354881878L;

    public String getAdTrackerConfig() {
        return SettingsManager.a().a("ad_tracker_config", "");
    }

    public Boolean getAiMusicBackupStrategy() {
        return Boolean.valueOf(SettingsManager.a().a("ai_music_backup_strategy", false));
    }

    public Integer getAntiAddictionDayTime() {
        return Integer.valueOf(SettingsManager.a().a("anti_addiction_day_time", 0));
    }

    public Integer getAntiAddictionNightTime() {
        return Integer.valueOf(SettingsManager.a().a("anti_addiction_night_time", 0));
    }

    public Integer getAntiAddictionToastTime() {
        return Integer.valueOf(SettingsManager.a().a("anti_addiction_toast_time", 0));
    }

    public Integer getBackgroundPausePlayerSetting() {
        return Integer.valueOf(SettingsManager.a().a("background_pause_player_setting", 0));
    }

    public Integer getCloseLoginAgreement() {
        return Integer.valueOf(SettingsManager.a().a("close_login_agreement", 0));
    }

    public Integer getCloseSyncToHeloEntry() {
        return Integer.valueOf(SettingsManager.a().a("close_sync_to_helo_entry", 1));
    }

    public Boolean getDisableOnlineSmallEmoji() {
        return Boolean.valueOf(SettingsManager.a().a("disable_online_small_emoji", false));
    }

    public Boolean getDisableQiVideoShare() {
        return Boolean.valueOf(SettingsManager.a().a("disable_qi_video_share", true));
    }

    public Boolean getDisableVastBitrate() {
        return Boolean.valueOf(SettingsManager.a().a("disable_vast_bitrate", false));
    }

    public Boolean getDisallowVastHasAuthor() {
        return Boolean.valueOf(SettingsManager.a().a("disallow_vast_has_author", false));
    }

    public String getDoulabUseInformationUrl() {
        return SettingsManager.a().a("doulab_use_information_url", "");
    }

    public Integer getDouplusBulletEntry() {
        return Integer.valueOf(SettingsManager.a().a("douplus_bullet_entry", 0));
    }

    public Integer getDouplusEntryFeed() {
        return Integer.valueOf(SettingsManager.a().a("douplus_entry_feed", 0));
    }

    public Integer getEditEffectAutoDownloadSize() {
        return Integer.valueOf(SettingsManager.a().a("edit_effect_auto_download_size", 5));
    }

    public Boolean getEnableAdRouter() {
        return Boolean.valueOf(SettingsManager.a().a("enable_ad_router", false));
    }

    public Boolean getEnableAnchorCache() {
        return Boolean.valueOf(SettingsManager.a().a("enable_anchor_cache", false));
    }

    public Boolean getEnableAutoLiveState() {
        return Boolean.valueOf(SettingsManager.a().a("enable_auto_live_state", false));
    }

    public Boolean getEnableAvStorageMonitor() {
        return Boolean.valueOf(SettingsManager.a().a("enable_av_storage_monitor", true));
    }

    public Boolean getEnableCommentCreateSticker() {
        return Boolean.valueOf(SettingsManager.a().a("enable_comment_create_sticker", false));
    }

    public Boolean getEnableCommentOffensiveFilterSwitch() {
        return Boolean.valueOf(SettingsManager.a().a("enable_comment_offensive_filter_switch", false));
    }

    public Boolean getEnableDisplayFavoriteMiniapp() {
        return Boolean.valueOf(SettingsManager.a().a("enable_display_favorite_miniapp", true));
    }

    public Boolean getEnableDisplayFavoriteMinigame() {
        return Boolean.valueOf(SettingsManager.a().a("enable_display_favorite_minigame", true));
    }

    public Integer getEnableEmailVerification() {
        return Integer.valueOf(SettingsManager.a().a("enable_email_verification", 1));
    }

    public Boolean getEnableEnterLiveRoomStreamOpt() {
        return Boolean.valueOf(SettingsManager.a().a("enable_enter_live_room_stream_opt", true));
    }

    public Boolean getEnableEnterLiveRoomStreamOptFromFollowSky() {
        return Boolean.valueOf(SettingsManager.a().a("enable_enter_live_room_stream_opt_from_follow_sky", false));
    }

    public Boolean getEnableGroupMemberByFollowers() {
        return Boolean.valueOf(SettingsManager.a().a("enable_group_member_by_followers", false));
    }

    public Boolean getEnableHighRiskRebindAlert() {
        return Boolean.valueOf(SettingsManager.a().a("enable_high_risk_rebind_alert", true));
    }

    public Boolean getEnableLiveDrawerDialog() {
        return Boolean.valueOf(SettingsManager.a().a("enable_live_drawer_dialog", true));
    }

    public Boolean getEnableLiveSplash() {
        return Boolean.valueOf(SettingsManager.a().a("enable_live_splash", true));
    }

    public Boolean getEnableNewUserInfoSync() {
        return Boolean.valueOf(SettingsManager.a().a("enable_new_user_info_sync", false));
    }

    public Boolean getEnablePushAllianceSdk() {
        return Boolean.valueOf(SettingsManager.a().a("enable_push_alliance_sdk", false));
    }

    public Boolean getEnableSplashLaunchFix() {
        return Boolean.valueOf(SettingsManager.a().a("enable_splash_launch_fix", true));
    }

    public Boolean getEnableTImChatEveryone() {
        return Boolean.valueOf(SettingsManager.a().a("enable_t_im_chat_everyone", false));
    }

    public Integer getEnableYoutubeAppAuth() {
        return Integer.valueOf(SettingsManager.a().a("enable_youtube_app_auth", 0));
    }

    public Integer getEnabledImAsupporterFuncs() {
        return Integer.valueOf(SettingsManager.a().a("enabled_im_asupporter_funcs", 3));
    }

    public Integer getEnabledImAsupporterMsgTypes() {
        return Integer.valueOf(SettingsManager.a().a("enabled_im_asupporter_msg_types", 5));
    }

    public Integer getF2NoticeType() {
        return Integer.valueOf(SettingsManager.a().a("f2_notice_type", 0));
    }

    public Boolean getFeedHandleGenericMotion() {
        return Boolean.valueOf(SettingsManager.a().a("feed_handle_generic_motion", true));
    }

    public Boolean getFeedbackRecordEnable() {
        return Boolean.valueOf(SettingsManager.a().a("feedback_record_enable", true));
    }

    public Integer getFirstInstallTime() {
        return Integer.valueOf(SettingsManager.a().a("first_install_time", -1));
    }

    public Boolean getFollowingFollowerPermissionSwitch() {
        return Boolean.valueOf(SettingsManager.a().a("following_follower_permission_switch", false));
    }

    public Boolean getForbidVoiceChangeOnEditPage() {
        return Boolean.valueOf(SettingsManager.a().a("forbid_voice_change_on_edit_page", true));
    }

    public Boolean getGroupNewMemberCanPullOldMsg() {
        return Boolean.valueOf(SettingsManager.a().a("group_new_member_can_pull_old_msg", false));
    }

    public String getHeartbeatDefaultUrl() {
        return SettingsManager.a().a("heartbeat_default_url", "");
    }

    public Integer getHotspotGuideTime() {
        return Integer.valueOf(SettingsManager.a().a("hotspot_guide_time", 3));
    }

    public Integer getInappUpdateSwitchStrategy() {
        return Integer.valueOf(SettingsManager.a().a("inapp_update_switch_strategy", 0));
    }

    public Integer getIsAdapterVideoPlaySize() {
        return Integer.valueOf(SettingsManager.a().a("is_adapter_video_play_size", 0));
    }

    public Integer getIsAdapterVideoPlaySizeAd() {
        return Integer.valueOf(SettingsManager.a().a("is_adapter_video_play_size_ad", 0));
    }

    public Boolean getIsHotUser() {
        return Boolean.valueOf(SettingsManager.a().a("is_hot_user", false));
    }

    public Boolean getIsNearbyOldUser() {
        return Boolean.valueOf(SettingsManager.a().a("is_nearby_old_user", false));
    }

    public Boolean getKeepCookies() {
        return Boolean.valueOf(SettingsManager.a().a("keep_cookies", false));
    }

    public Integer getKevaSwitch() {
        return Integer.valueOf(SettingsManager.a().a("keva_switch", 1));
    }

    public Integer getLiveSquareGuideShowCount() {
        return Integer.valueOf(SettingsManager.a().a("live_square_guide_show_count", 0));
    }

    public Boolean getMainTabFollowUseLazyViewpager() {
        return Boolean.valueOf(SettingsManager.a().a("main_tab_follow_use_lazy_viewpager", false));
    }

    public Integer getMaxMessageCountForRecommend() {
        return Integer.valueOf(SettingsManager.a().a("max_message_count_for_recommend", 5));
    }

    public Boolean getMiniappPreloadEmptyProcessEnbale() {
        return Boolean.valueOf(SettingsManager.a().a("miniapp_preload_empty_process_enbale", false));
    }

    public Boolean getMiniappWonderlandEnable() {
        return Boolean.valueOf(SettingsManager.a().a("miniapp_wonderland_enable", false));
    }

    public Integer getMixPermission() {
        return Integer.valueOf(SettingsManager.a().a("mix_permission", 0));
    }

    public Boolean getMtForbidInsertPlaceholderWord() {
        return Boolean.valueOf(SettingsManager.a().a("mt_forbid_insert_placeholder_word", false));
    }

    public Integer getMtLocalAnalysisHprof() {
        return Integer.valueOf(SettingsManager.a().a("mt_local_analysis_hprof", 0));
    }

    public Integer getMtSearchHistoryFoldCount() {
        return Integer.valueOf(SettingsManager.a().a("mt_search_history_fold_count", 3));
    }

    public Integer getPosterSrType() {
        return Integer.valueOf(SettingsManager.a().a("poster_sr_type", 0));
    }

    public Integer getPushdelayinitSwitch() {
        return Integer.valueOf(SettingsManager.a().a("pushdelayinit_switch", 0));
    }

    public Boolean getRealTimeReportEnable() {
        return Boolean.valueOf(SettingsManager.a().a("real_time_report_enable", true));
    }

    public Integer getSearchHistoryCollapseNum() {
        return Integer.valueOf(SettingsManager.a().a("search_history_collapse_num", 4));
    }

    public Integer getSecIdSwitch() {
        return Integer.valueOf(SettingsManager.a().a("sec_id_switch", 1));
    }

    public String getShopLinkAnchorDisclaimer() {
        return SettingsManager.a().a("shop_link_anchor_disclaimer", "");
    }

    public Integer getShowDeviceManagerEntry() {
        return Integer.valueOf(SettingsManager.a().a("show_device_manager_entry", 0));
    }

    public Boolean getShowDoulabEntrance() {
        return Boolean.valueOf(SettingsManager.a().a("show_doulab_entrance", true));
    }

    public Integer getShowFromDuoshanLabel() {
        return Integer.valueOf(SettingsManager.a().a("show_from_duoshan_label", 0));
    }

    public Boolean getShowQqdownloaderPrivacyDialog() {
        return Boolean.valueOf(SettingsManager.a().a("show_qqdownloader_privacy_dialog", false));
    }

    public Boolean getSmartisanDataSharingSwitch() {
        return Boolean.valueOf(SettingsManager.a().a("smartisan_data_sharing_switch", true));
    }

    public Boolean getStickerUpdateApp() {
        return Boolean.valueOf(SettingsManager.a().a("sticker_update_app", false));
    }

    public Boolean getSupportFilterErrorFile() {
        return Boolean.valueOf(SettingsManager.a().a("support_filter_error_file", false));
    }

    public Integer getTcmCtrySettings() {
        return Integer.valueOf(SettingsManager.a().a("tcm_ctry_settings", 0));
    }

    public String getTcmNameCtry() {
        return SettingsManager.a().a("tcm_name_ctry", "TCM");
    }

    public String getUgSecLinkUrl() {
        return SettingsManager.a().a("ug_sec_link_url", "");
    }

    public Integer getUgShareWebviewSecLevel() {
        return Integer.valueOf(SettingsManager.a().a("ug_share_webview_sec_level", 0));
    }

    public Boolean getUseBridgeEngineV2() {
        return Boolean.valueOf(SettingsManager.a().a("use_bridge_engine_v2", true));
    }

    public Integer getVideoPlayProgressCount() {
        return Integer.valueOf(SettingsManager.a().a("video_play_progress_count", 0));
    }

    public String getWikipediaAnchorUrlPlaceholder() {
        return SettingsManager.a().a("wikipedia_anchor_url_placeholder", "https://%1$s.m.wikipedia.org/wiki/%2$s");
    }

    public Boolean getWithDouplusEntry() {
        return Boolean.valueOf(SettingsManager.a().a("with_douplus_entry", false));
    }

    public AdFeSettings getAdFeSettings() {
        AdFeSettings adFeSettings = (AdFeSettings) SettingsManager.a().getSettingsValueProvider().a("ad_fe_settings", AdFeSettings.class);
        if (adFeSettings != null) {
            return adFeSettings;
        }
        throw new a();
    }

    public AdLandingPageConfig getAdLandingPageConfig() {
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) SettingsManager.a().getSettingsValueProvider().a("ad_landing_page_config", AdLandingPageConfig.class);
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        throw new a();
    }

    public UserAntiAddiction getAddictionSettings() {
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) SettingsManager.a().getSettingsValueProvider().a("addiction_settings", UserAntiAddiction.class);
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        throw new a();
    }

    public AgeGateSettings getAgeGateSettings() {
        AgeGateSettings ageGateSettings = (AgeGateSettings) SettingsManager.a().getSettingsValueProvider().a("age_gate_settings", AgeGateSettings.class);
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        throw new a();
    }

    public List<String> getApiAlogWhiteList() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("api_alog_white_list");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public AppStoreMessage getAppStoreScore() {
        AppStoreMessage appStoreMessage = (AppStoreMessage) SettingsManager.a().getSettingsValueProvider().a("app_store_score", AppStoreMessage.class);
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        throw new a();
    }

    public Long getAutoLiveStateIntervalMills() {
        return Long.valueOf(SettingsManager.a().a("auto_live_state_interval_mills", 60000L));
    }

    public UgAwemeActivitySetting getAwemeActivitySetting() {
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) SettingsManager.a().getSettingsValueProvider().a("aweme_activity_setting", UgAwemeActivitySetting.class);
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        throw new a();
    }

    public AwemeFeEliteItem getAwemeFeElite() {
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) SettingsManager.a().getSettingsValueProvider().a("aweme_fe_elite", AwemeFeEliteItem.class);
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        throw new a();
    }

    public List<String> getAwemeHighRiskAreaCode() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("aweme_high_risk_area_code");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public BioSettings getBioSettings() {
        BioSettings bioSettings = (BioSettings) SettingsManager.a().getSettingsValueProvider().a("bio_settings", BioSettings.class);
        if (bioSettings != null) {
            return bioSettings;
        }
        throw new a();
    }

    public List<String> getCacheCleanDefaultWhiteList() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("cache_clean_default_white_list");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public CommentListAdMigration getCommentListAdMigration() {
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) SettingsManager.a().getSettingsValueProvider().a("comment_list_ad_migration", CommentListAdMigration.class);
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        throw new a();
    }

    public CommerceEggConfig getCommerceEggConfig() {
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) SettingsManager.a().getSettingsValueProvider().a("commerce_egg_config", CommerceEggConfig.class);
        if (commerceEggConfig != null) {
            return commerceEggConfig;
        }
        throw new a();
    }

    public ContactUploadUiLimits getContactUploadUiLimits() {
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) SettingsManager.a().getSettingsValueProvider().a("contact_upload_ui_limits", ContactUploadUiLimits.class);
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        throw new a();
    }

    public EPlatformSettings getEPlatformSettings() {
        EPlatformSettings ePlatformSettings = (EPlatformSettings) SettingsManager.a().getSettingsValueProvider().a("e_platform_settings", EPlatformSettings.class);
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        throw new a();
    }

    public EmailLoginSettings getEmailLoginSettings() {
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) SettingsManager.a().getSettingsValueProvider().a("email_login_settings", EmailLoginSettings.class);
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        throw new a();
    }

    public FeConfigCollection getFeConfigCollection() {
        FeConfigCollection feConfigCollection = (FeConfigCollection) SettingsManager.a().getSettingsValueProvider().a("fe_config_collection", FeConfigCollection.class);
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        throw new a();
    }

    public FeedbackConf getFeedbackConf() {
        FeedbackConf feedbackConf = (FeedbackConf) SettingsManager.a().getSettingsValueProvider().a("feedback_conf", FeedbackConf.class);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        throw new a();
    }

    public List<String> getFilterColors() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("filter_colors");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public FlexibleUpdateStrategy getFlexibleUpdateStrategy() {
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) SettingsManager.a().getSettingsValueProvider().a("flexible_update_strategy", FlexibleUpdateStrategy.class);
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        throw new a();
    }

    public FlipChatSettings getFlipchatSettings() {
        FlipChatSettings flipChatSettings = (FlipChatSettings) SettingsManager.a().getSettingsValueProvider().a("flipchat_settings", FlipChatSettings.class);
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        throw new a();
    }

    public HotSearchWitch getHotsearchSwitchs() {
        HotSearchWitch hotSearchWitch = (HotSearchWitch) SettingsManager.a().getSettingsValueProvider().a("hotsearch_switchs", HotSearchWitch.class);
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        throw new a();
    }

    public HybridMonitorConfig getHybridMonitorConfig() {
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) SettingsManager.a().getSettingsValueProvider().a("hybrid_monitor_config", HybridMonitorConfig.class);
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        throw new a();
    }

    public List<String> getImImageDomains() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("im_image_domains");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public IMUseOkHttpClientConfig getImUseOkhttpclient() {
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) SettingsManager.a().getSettingsValueProvider().a("im_use_okhttpclient", IMUseOkHttpClientConfig.class);
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        throw new a();
    }

    public List<String> getKevaBlacklist() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("keva_blacklist");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public List<String> getLabFeatureIds() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("lab_feature_ids");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public Integer getLightEnhanceThreshold() {
        return Integer.valueOf(SettingsManager.a().a("light_enhance_threshold", 50));
    }

    public LikePraiseDialogInfo getLikePraiseDialogInfo() {
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) SettingsManager.a().getSettingsValueProvider().a("like_praise_dialog_info", LikePraiseDialogInfo.class);
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        throw new a();
    }

    public LiveCnySetting getLiveCnySettings() {
        LiveCnySetting liveCnySetting = (LiveCnySetting) SettingsManager.a().getSettingsValueProvider().a("live_cny_settings", LiveCnySetting.class);
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        throw new a();
    }

    public LiveInnerPushConfig getLiveInnerPushConfig() {
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) SettingsManager.a().getSettingsValueProvider().a("live_inner_push_config", LiveInnerPushConfig.class);
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        throw new a();
    }

    public Integer getMinFollowNumForLandingFollowTab() {
        return Integer.valueOf(SettingsManager.a().a("min_follow_num_for_landing_follow_tab", 100));
    }

    public MtcertSettings getMtcertSettings() {
        MtcertSettings mtcertSettings = (MtcertSettings) SettingsManager.a().getSettingsValueProvider().a("mtcert_settings", MtcertSettings.class);
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        throw new a();
    }

    public List<String> getPreloadMicroAppList() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("preload_micro_app_list");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public ProAccountEnableDetailInfo getProAccountEnableDetailInfo() {
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) SettingsManager.a().getSettingsValueProvider().a("pro_account_enable_detail_info", ProAccountEnableDetailInfo.class);
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        throw new a();
    }

    public pushGuideInfo getPushGuideInfo() {
        pushGuideInfo pushguideinfo = (pushGuideInfo) SettingsManager.a().getSettingsValueProvider().a("push_guide_info", pushGuideInfo.class);
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        throw new a();
    }

    public QuickShopLoadingPage getQuickShopLoadingPage() {
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) SettingsManager.a().getSettingsValueProvider().a("quick_shop_loading_page", QuickShopLoadingPage.class);
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        throw new a();
    }

    public Integer getReadVideoLastGap() {
        return Integer.valueOf(SettingsManager.a().a("read_video_last_gap", 200));
    }

    public Long getReusePhoneCheckInterval() {
        return Long.valueOf(SettingsManager.a().a("reuse_phone_check_interval", 0L));
    }

    public Integer getSearchMiddleRecommendWordsCount() {
        return Integer.valueOf(SettingsManager.a().a("search_middle_recommend_words_count", 12));
    }

    public SearchPullFeedbackStruct getSearchPullFeedback() {
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) SettingsManager.a().getSettingsValueProvider().a("search_pull_feedback", SearchPullFeedbackStruct.class);
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        throw new a();
    }

    public ShoppingConfig getShopping() {
        ShoppingConfig shoppingConfig = (ShoppingConfig) SettingsManager.a().getSettingsValueProvider().a("shopping", ShoppingConfig.class);
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        throw new a();
    }

    public Long getShowStorageDotSize() {
        return Long.valueOf(SettingsManager.a().a("show_storage_dot_size", 1073741824L));
    }

    public Long getShowStorageTipSize() {
        return Long.valueOf(SettingsManager.a().a("show_storage_tip_size", 314572800L));
    }

    public SpringApiLimitConfig getSpringApiLimitConfig() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) SettingsManager.a().getSettingsValueProvider().a("spring_api_limit_config", SpringApiLimitConfig.class);
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        throw new a();
    }

    public SuperEntranceConfig getSuperEntranceConfig() {
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) SettingsManager.a().getSettingsValueProvider().a("super_entrance_config", SuperEntranceConfig.class);
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        throw new a();
    }

    public UlikeParams getUlikeParams() {
        UlikeParams ulikeParams = (UlikeParams) SettingsManager.a().getSettingsValueProvider().a("ulike_params", UlikeParams.class);
        if (ulikeParams != null) {
            return ulikeParams;
        }
        throw new a();
    }

    public List<String> getUploadVideoSizeCategory() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("upload_video_size_category");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public VCDV1ConfigStruct getVcdV1ConfigInfo() {
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) SettingsManager.a().getSettingsValueProvider().a("vcd_v1_config_info", VCDV1ConfigStruct.class);
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        throw new a();
    }

    public List<String> getVideoSizeCategory() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("video_size_category");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public VisionSearchStruct getVisionSearch() {
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) SettingsManager.a().getSettingsValueProvider().a("vision_search", VisionSearchStruct.class);
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        throw new a();
    }

    public List<String> getWebviewCachePoolSwitch() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("webview_cache_pool_switch");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    public List<String> getWebviewCacheUrls() {
        String[] a2 = SettingsManager.a().getSettingsValueProvider().a("webview_cache_urls");
        if (a2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2);
        return arrayList;
    }

    static {
        Covode.recordClassIndex(63049);
    }

    public Boolean getAntiAddictionToastEnable24hourTime() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("anti_addiction_toast_enable_24hour_time", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("anti_addiction_toast_enable_24hour_time")) {
            return valueOf;
        }
        throw new a();
    }

    public List<OriginChannelTab> getChannelTabs() {
        OriginChannelTab[] originChannelTabArr = (OriginChannelTab[]) SettingsManager.a().getSettingsValueProvider().a("channel_tabs", OriginChannelTab[].class);
        if (originChannelTabArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, originChannelTabArr);
        return arrayList;
    }

    public Boolean getCleanShareFiles() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("clean_share_files", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("clean_share_files")) {
            return valueOf;
        }
        throw new a();
    }

    public String getCommentFilterTipsSupported() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("comment_filter_tips_supported", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("comment_filter_tips_supported")) {
            return c2;
        }
        throw new a();
    }

    public List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        ContentLanguageGuideSetting[] contentLanguageGuideSettingArr = (ContentLanguageGuideSetting[]) SettingsManager.a().getSettingsValueProvider().a("content_language_guide_codes", ContentLanguageGuideSetting[].class);
        if (contentLanguageGuideSettingArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, contentLanguageGuideSettingArr);
        return arrayList;
    }

    public Integer getDataSaverSetting() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("data_saver_setting", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("data_saver_setting")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayAbSdkRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_ab_sdk_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_ab_sdk_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayAppAlertRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_app_alert_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_app_alert_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayFetchSamecityActiveRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_fetch_samecity_active_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_fetch_samecity_active_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayFetchShareSettingRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_fetch_share_setting_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_fetch_share_setting_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayFetchUserRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_fetch_user_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_fetch_user_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelaySecReport() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_sec_report", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_sec_report")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayTokenBeatRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_token_beat_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_token_beat_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDelayWsRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_delay_ws_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_delay_ws_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableDvmLinearAllocOpt() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_dvm_linear_alloc_opt", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_dvm_linear_alloc_opt")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableImMessageFullFeedSlide() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_im_message_full_feed_slide", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_im_message_full_feed_slide")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDisableOmSdk() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("disable_om_sdk", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("disable_om_sdk")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getDiscardRefreshTopDsp() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("discard_refresh_top_dsp", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("discard_refresh_top_dsp")) {
            return valueOf;
        }
        throw new a();
    }

    public List<DouplusTextStruct> getDouplusEntryTitle() {
        DouplusTextStruct[] douplusTextStructArr = (DouplusTextStruct[]) SettingsManager.a().getSettingsValueProvider().a("douplus_entry_title", DouplusTextStruct[].class);
        if (douplusTextStructArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, douplusTextStructArr);
        return arrayList;
    }

    public Integer getEnable4kImport() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("enable_4k_import", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("enable_4k_import")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableCommerceOrder() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_commerce_order", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_commerce_order")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableDelayRequest() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_delay_request", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_delay_request")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableDownloadTtData() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_download_tt_data", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_download_tt_data")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableHdH264HwDecoder() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_hd_h264_hw_decoder", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_hd_h264_hw_decoder")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableLocalMusicEntrance() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_local_music_entrance", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_local_music_entrance")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableOnPageSelectPauseCheck() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_on_page_select_pause_check", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_on_page_select_pause_check")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getEnableReuseEditorForFastimport() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("enable_reuse_editor_for_fastimport", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("enable_reuse_editor_for_fastimport")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getFollowTabLiveType() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("follow_tab_live_type", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("follow_tab_live_type")) {
            return valueOf;
        }
        throw new a();
    }

    public String getFreeFlowCardUrlSticker() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("free_flow_card_url_sticker", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("free_flow_card_url_sticker")) {
            return c2;
        }
        throw new a();
    }

    public Integer getHdHwDecoderMinSideSize() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("hd_hw_decoder_min_side_size", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("hd_hw_decoder_min_side_size")) {
            return valueOf;
        }
        throw new a();
    }

    public AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) SettingsManager.a().getSettingsValueProvider().a("im_associative_emoticon_all", AssociativeEmoticonAll.class);
        if (associativeEmoticonAll != null) {
            return associativeEmoticonAll;
        }
        return new AssociativeEmoticonAll(0, "");
    }

    public Integer getImContactsMultiSelectLimit() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("im_contacts_multi_select_limit", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("im_contacts_multi_select_limit")) {
            return valueOf;
        }
        throw new a();
    }

    public String getImUrlTemplate() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("im_url_template", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("im_url_template")) {
            return c2;
        }
        throw new a();
    }

    public String getImpressionPageSchema() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("impression_page_schema", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("impression_page_schema")) {
            return c2;
        }
        throw new a();
    }

    public Integer getIsEnableSplashFirstShowRetrieval() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("is_enable_splash_first_show_retrieval", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("is_enable_splash_first_show_retrieval")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getLocalVideoCacheMaxAge() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("local_video_cache_max_age", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("local_video_cache_max_age")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getLocalVideoCacheMaxLength() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("local_video_cache_max_length", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("local_video_cache_max_length")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getMiniappPreloadEnbale() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("miniapp_preload_enbale", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("miniapp_preload_enbale")) {
            return valueOf;
        }
        throw new a();
    }

    public String getMovieDetail() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("movie_detail", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("movie_detail")) {
            return c2;
        }
        throw new a();
    }

    public Integer getMusicianShowType() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("musician_show_type", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("musician_show_type")) {
            return valueOf;
        }
        throw new a();
    }

    public List<Integer> getOneBindNetSetting() {
        Integer[] numArr = (Integer[]) SettingsManager.a().getSettingsValueProvider().a("one_bind_net_setting", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getOpenImLink() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("open_im_link", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("open_im_link")) {
            return valueOf;
        }
        throw new a();
    }

    public String getOrginalMusicianUrl() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        String c2 = settingsValueProvider.c("orginal_musician_url", "_");
        if (!"_".equals(c2) || settingsValueProvider.c("orginal_musician_url")) {
            return c2;
        }
        throw new a();
    }

    public Boolean getOriginalMusicianEntry() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("original_musician_entry", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("original_musician_entry")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getProfilePageSkipRemove() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("profile_page_skip_remove", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("profile_page_skip_remove")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getShieldMusicSdk() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("shield_music_sdk", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("shield_music_sdk")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getShowMusicFeedbackEntrance() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("show_music_feedback_entrance", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("show_music_feedback_entrance")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getShowRocketShareIfInstall() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("show_rocket_share_if_install", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("show_rocket_share_if_install")) {
            return valueOf;
        }
        throw new a();
    }

    public List<WhatsAppCodeItem> getShowWhatsappByCallingCode() {
        WhatsAppCodeItem[] whatsAppCodeItemArr = (WhatsAppCodeItem[]) SettingsManager.a().getSettingsValueProvider().a("show_whatsapp_by_calling_code", WhatsAppCodeItem[].class);
        if (whatsAppCodeItemArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, whatsAppCodeItemArr);
        return arrayList;
    }

    public Boolean getSilentShareConfigurable() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("silent_share_configurable", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("silent_share_configurable")) {
            return valueOf;
        }
        throw new a();
    }

    public List<ShareChannelSettings> getSilentShareList() {
        ShareChannelSettings[] shareChannelSettingsArr = (ShareChannelSettings[]) SettingsManager.a().getSettingsValueProvider().a("silent_share_list", ShareChannelSettings[].class);
        if (shareChannelSettingsArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, shareChannelSettingsArr);
        return arrayList;
    }

    public Integer getStatisticsBackupPct() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("statistics_backup_pct", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("statistics_backup_pct")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getStoryImagePlayTime() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("story_image_play_time", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("story_image_play_time")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getThirdPartyDataRefresh() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("third_party_data_refresh", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("third_party_data_refresh")) {
            return valueOf;
        }
        throw new a();
    }

    public List<Integer> getThirdpartyLoginBindSkip() {
        Integer[] numArr = (Integer[]) SettingsManager.a().getSettingsValueProvider().a("thirdparty_login_bind_skip", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getUploadContactsNoticeInterval() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("upload_contacts_notice_interval", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("upload_contacts_notice_interval")) {
            return valueOf;
        }
        throw new a();
    }

    public Integer getUploadContactsNoticeTimes() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("upload_contacts_notice_times", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("upload_contacts_notice_times")) {
            return valueOf;
        }
        throw new a();
    }

    public Boolean getUseRightSwipeBack() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Boolean bool = DEFAULT_BOOLEAN;
        Boolean valueOf = Boolean.valueOf(settingsValueProvider.b("use_right_swipe_back", bool.booleanValue()));
        if (!bool.equals(valueOf) || settingsValueProvider.c("use_right_swipe_back")) {
            return valueOf;
        }
        throw new a();
    }

    public List<Float> getVideoBitrateCategory() {
        Float[] fArr = (Float[]) SettingsManager.a().getSettingsValueProvider().a("video_bitrate_category", Float[].class);
        if (fArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        return arrayList;
    }

    public List<Integer> getVideoQualityCategory() {
        Integer[] numArr = (Integer[]) SettingsManager.a().getSettingsValueProvider().a("video_quality_category", Integer[].class);
        if (numArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public Integer getWsUseNewSdk() {
        i settingsValueProvider = SettingsManager.a().getSettingsValueProvider();
        Integer num = DEFAULT_INTEGER;
        Integer valueOf = Integer.valueOf(settingsValueProvider.b("ws_use_new_sdk", num.intValue()));
        if (!num.equals(valueOf) || settingsValueProvider.c("ws_use_new_sdk")) {
            return valueOf;
        }
        throw new a();
    }
}
