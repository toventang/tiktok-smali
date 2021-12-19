package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.b.a;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.aa;
import com.ss.android.ugc.aweme.commercialize.model.ae;
import com.ss.android.ugc.aweme.commercialize.model.ag;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.commercialize.model.am;
import com.ss.android.ugc.aweme.commercialize.model.i;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.model.k;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize.model.m;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.model.w;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.dx;
import com.ss.android.ugc.aweme.utils.ip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class AwemeRawAd extends a implements Serializable {
    @c(a = "action_extra")
    public String actionExtra;
    @c(a = "show_special_avatar_style")
    private int adAvatarLinkTagStyle = 0;
    @c(a = "dislike")
    private com.ss.android.ugc.aweme.commercialize.model.c adDislikeModel;
    @c(a = "hint_data")
    private i adHintData;
    @c(a = "ad_id")
    Long adId;
    @c(a = "interaction_data")
    AdInteractionData adInteractionData;
    @c(a = "live")
    private AdLive adLive;
    @c(a = "ad_more_textual")
    private String adMoreTextual;
    @c(a = "play_node_track_url")
    List<k> adNodeTrackUrlList;
    @c(a = "ad_questionnaire")
    l adQuestionnaire;
    @c(a = "ad_source_type")
    private int adSourceType;
    @c(a = "ad_tag_position")
    private int adTagPosition;
    @c(a = "top_icon_list")
    UrlModel adTopIcon;
    @c(a = "ad_type")
    int adType;
    @c(a = "advertiser_id")
    private String advId;
    @c(a = "aggregation_sdk")
    AggregationSdk aggregationSdk;
    @c(a = "allow_dsp_autojump")
    private boolean allowDspAutoJump;
    @c(a = "anchor_click_type")
    private int anchorClickType;
    @c(a = "animation_type")
    private int animationType;
    @c(a = "app_category")
    String appCategory;
    @c(a = "app_data")
    private String appData;
    @c(a = "app_install")
    String appInstall = "";
    @c(a = "app_like")
    String appLike;
    @c(a = "app_name")
    String appName = "";
    @c(a = "author_url")
    private String authorUrl;
    @c(a = "avatar_icon")
    UrlModel avatarIcon;
    @c(a = "background_color")
    private String backgroundColor;
    @c(a = "live_icon_url")
    private UrlModel bottomIcon;
    @c(a = "button_icon_url")
    String buttonIcon;
    @c(a = "button_icon_animation_repeat_times")
    private int buttonIconAnimationRepeatTimes = 0;
    @c(a = "button_style")
    int buttonStyle;
    @c(a = "button_text")
    String buttonText;
    @c(a = "call_to_action_bar")
    private CallToActionBarInfo callToActionBarInfo;
    @c(a = "card_infos")
    Map<String, CardStruct> cardInfos;
    @c(a = "card_interaction_seconds")
    private int cardInteractionSeconds;
    @c(a = "card_interaction_type")
    private int cardInteractionType;
    @com.google.gson.a.a(a = false, b = false)
    boolean cardOnceClick;
    @c(a = "web_channel_name")
    private String channelName;
    @c(a = "charge_type")
    private int charge_type;
    @c(a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @c(a = "comment_area")
    private s commentArea;
    @c(a = "comment_area_switch")
    private boolean commentAreaSwitch;
    @b(a = dx.class)
    @c(a = "comment_extra")
    private String commentExtra;
    @c(a = "component_type")
    private int componentType;
    @c(a = "consult_url")
    String consultUrl;
    @c(a = "context_track_url_list")
    private UrlModel contextTrack;
    private transient boolean contextTrackSent;
    @c(a = "description")
    String description;
    @c(a = "disable_show_ad_link")
    boolean disableAdLink;
    @c(a = "disable_ad_show_filter")
    boolean disableAdShowFilter;
    @c(a = "disable_auto_track_click")
    boolean disableAutoTrackClick;
    @c(a = "disable_download_dialog")
    int disableDownloadDialog = 1;
    @c(a = "disable_follow_to_click")
    private int disableFollowToClick;
    @c(a = "disable_like_type")
    private boolean disableLikeType;
    @c(a = "disable_show_link_label")
    public boolean disableShowLinkLabel = false;
    @c(a = "disable_authorpage_button")
    private boolean disableUserprofileAdLabel;
    @c(a = "disclaimer")
    com.ss.android.ugc.aweme.commercialize.model.a disclaimer;
    @c(a = "dislike_info")
    private com.ss.android.ugc.aweme.commercialize.model.b dislikeInfo;
    @c(a = "display_type")
    Long displayType;
    @c(a = "link_data")
    private w douPlusLinkData;
    @c(a = "download_url")
    String downloadUrl;
    @c(a = "dynamic_video")
    private DynamicVideo dynamicVideo;
    @c(a = "e_ad_info")
    private String eAdInfo;
    @c(a = "effective_play_time")
    Float effectivePlayTime;
    @c(a = "effective_play_track_url_list")
    UrlModel effectivePlayTrackUrlList;
    @c(a = "enable_title_click")
    int enableDescClick;
    @c(a = "enable_filter_same_video")
    private boolean enableFilterSameVideo = true;
    @c(a = "enable_video_resume")
    private boolean enableVideoResume;
    @c(a = "enable_web_google_login")
    private boolean enableWebGoogleLogin;
    @c(a = "enable_web_report")
    private boolean enableWebReport;
    @c(a = "enter_from_merge")
    private String enterFromMerge;
    @c(a = "expire_seconds")
    Long expireSeconds;
    @c(a = "extra_effective_play_action")
    private int extraEffectivePlayAction;
    @c(a = "fake_author")
    private aa fakeAuthor;
    @c(a = "feature_label")
    String featureLabel;
    @c(a = "featured_label")
    private List<AwemeTextLabelModel> featuredLabel;
    @c(a = "form_height")
    private int formHeight;
    @c(a = "form_url")
    private String formUrl;
    @c(a = "form_width")
    private int formWidth;
    @c(a = "frontend_data")
    Object frontendData;
    @c(a = "get_ad_status")
    private int getAdStatus;
    @c(a = "get_ad_time")
    private int getAdTime;
    @c(a = "hide_if_exists")
    int hideIfExists;
    @c(a = "hide_web_button")
    boolean hideWebButton;
    @c(a = "high_light_color")
    public String highLightColor;
    @c(a = "high_light_position")
    public List<Position> highLightPosition;
    @c(a = "homepage_bottom_textual")
    private String homepageBottomTextual;
    @c(a = "icon_image_list")
    private List<UrlModel> iconImageList;
    @c(a = "image_list")
    List<UrlModel> imageList;
    @c(a = "image_url")
    private UrlModel imageUrl;
    @c(a = "indicator_data")
    private IndicatorData indicatorData;
    @c(a = "instance_phone_id")
    private long instancePhoneId;
    @c(a = "interaction_seconds")
    int interactionSeconds;
    @c(a = "interesting_play")
    private AwemePlayFunModel interestingPlay;
    @c(a = "is_ack_action")
    private int isAckAction = 0;
    @c(a = "display_why_this_ad_button")
    boolean isDisplayWhyThisAd = false;
    @c(a = "is_dsp")
    private boolean isDsp;
    @c(a = "is_open_url_support_pull_up")
    private boolean isOpenUrlSupportPullUp;
    @c(a = "is_preview")
    boolean isPreview;
    @c(a = "js_actlog_url")
    private String jsActLogUrl;
    @c(a = "label")
    private AwemeTextLabelModel label;
    @c(a = "landing_page_info")
    private String landingPageInfo;
    @c(a = "learn_more_bg_color")
    private String learnMoreBgColor;
    @c(a = "left_slide_click_time")
    private int leftSlideClickDuration;
    @c(a = "left_slide_click_type")
    private int leftSlideClickType;
    @c(a = "light_web_url")
    private String lightWebUrl;
    @c(a = "link_label")
    private AwemeLinkLabel linkLabel;
    @c(a = "live_ad_type")
    private int liveAdType;
    @c(a = "live_room")
    public int liveRoom;
    @c(a = "lynx_button_position")
    private int lynxButtonPosition;
    @c(a = "template_url")
    private String lynxButtonUrl;
    @c(a = "lynx_entry_data")
    j lynxEntryData;
    @b(a = dx.class)
    @c(a = "lynx_raw_data")
    private String lynxRawData;
    @c(a = "download_mode")
    int mDownloadMode;
    @c(a = "auto_open")
    int mLinkMode;
    @c(a = "support_multiple")
    int mSupportMultiple;
    @c(a = "mask_form_style")
    int maskFormStyle;
    @c(a = "mp_url")
    private String microAppUrl;
    @c(a = "music")
    private Music music;
    @c(a = "native_author")
    private NativeAuthorInfo nativeAuthor;
    @c(a = "native_card_info")
    private ae nativeCardInfo;
    @c(a = "native_card_type")
    int nativeCardType;
    @c(a = "native_site_ad_info")
    private String nativeSiteAdInfo;
    @c(a = "native_site_config")
    private ag nativeSiteConfig;
    @c(a = "native_site_custom_data")
    private String nativeSiteCustomData;
    @c(a = "non_native_click")
    int nonNativeClick;
    @c(a = "notification_config")
    private int notificationConfig;
    @c(a = "vast")
    ai omVast;
    @c(a = "open_system_browser")
    private boolean openSystemBrowser;
    @c(a = "open_url")
    String openUrl;
    @c(a = "origin_price")
    String originPrice;
    @c(a = "outflow_button_style")
    int outFlowButtonStyle;
    @c(a = "package")
    String packageName;
    private String pageFrom = "";
    @c(a = "phone_key")
    private String phoneKey;
    @c(a = "phone_number")
    private String phoneNumber;
    @c(a = "piv_opt")
    int pivOpt = 0;
    @c(a = "playover_track_url_list")
    UrlModel playOverTrackUrlList;
    @c(a = "play_track_url_list")
    UrlModel playTrackUrlList;
    @c(a = "playback_seconds_track_url")
    private List<am> playbackSecondsTrackList = new ArrayList();
    @c(a = "pop_ups")
    private boolean popUps;
    @c(a = "position")
    private int position;
    @c(a = "preload_data")
    private com.ss.android.ugc.aweme.commercialize.feed.c.a preloadData;
    @c(a = "preload_extra_web")
    private int preloadExtraWeb;
    @c(a = "preload_web")
    private int preloadWeb;
    @c(a = "preload_web_new")
    private int preloadWebNew;
    @c(a = "price")
    String price;
    @c(a = "profile_with_webview")
    private int profileWithWebview;
    @c(a = "promotion_label")
    String promotionLabel;
    @c(a = "quick_app_url")
    String quickAppUrl;
    @c(a = "recommend_extra")
    private String recommendExtra;
    @c(a = "recommend_title")
    private String recommendTitle;
    @c(a = "red_mp_url")
    private String redMpUrl;
    @c(a = "red_open_url")
    private String redOpenUrl;
    @c(a = "red_url")
    private String redUrl;
    @c(a = "report_ad_type")
    private int reportAdType;
    @c(a = "report_enable")
    boolean reportEnable;
    @com.google.gson.a.a(a = false, b = false)
    private transient boolean reshowAd;
    @c(a = "schema_name")
    String schemaName;
    @c(a = "search")
    private AwemeSearchAdModel searchAdInfo;
    @c(a = "shop_ad_data")
    private String shopAdData;
    @c(a = "show_ad_after_interaction")
    boolean showAdAfterInteraction;
    @c(a = "show_button_color_seconds")
    int showButtonColorSeconds;
    @c(a = "show_button_seconds")
    private int showButtonSeconds;
    @c(a = "show_label_rows")
    private int showLabelRows;
    @c(a = "show_label_seconds")
    private int showLabelSeconds;
    @c(a = "show_lynx_card")
    private int showLynxCard;
    @c(a = "show_mask_recycle")
    public boolean showMaskRecycle;
    @c(a = "show_mask_times")
    private int showMaskTimes;
    @c(a = "show_outflow_mask_times")
    private int showOutflowMaskTimes;
    @c(a = "show_type")
    int showType;
    @c(a = "similar_animation")
    private int similarAnimation = 0;
    @c(a = "skip_time")
    int skipTime;
    @c(a = "slide_action")
    private int slideAction;
    @c(a = "source")
    String source;
    @c(a = "splash_info")
    private AwemeSplashInfo splashInfo;
    @c(a = "sticker_data")
    m stickerData;
    @c(a = "system_origin")
    int systemOrigin;
    @c(a = "tips_type")
    int tipsType;
    @c(a = "title")
    String title;
    @c(a = "top_title")
    String topTitle;
    @c(a = "track_url_list")
    UrlModel trackUrlList;
    @c(a = StringSet.type)
    String type;
    @c(a = "use_default_color")
    boolean useDefaultColor;
    @c(a = "use_ordinary_web")
    Boolean useOrdinaryWeb;
    @c(a = "video")
    private List<Video> videoList;
    @c(a = "video_transpose")
    Long videoTranspose;
    @c(a = "web_title")
    String webTitle;
    @c(a = "web_type")
    int webType;
    @c(a = "web_url")
    String webUrl;
    @c(a = "webview_pannel_style")
    private int webviewPannelStyle;
    @c(a = "webview_progress_bar")
    private int webviewProgressBar;
    @c(a = "webview_type")
    private int webviewType;
    @c(a = "white_high_light_color")
    public String whiteHighLightColor;

    static {
        Covode.recordClassIndex(59326);
    }

    private void vastFromXml() {
    }

    public int getAdAvatarLinkTagStyle() {
        return this.adAvatarLinkTagStyle;
    }

    public com.ss.android.ugc.aweme.commercialize.model.c getAdDislikeModel() {
        return this.adDislikeModel;
    }

    public i getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public AdInteractionData getAdInteractionData() {
        return this.adInteractionData;
    }

    public AdLive getAdLive() {
        return this.adLive;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<k> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public l getAdQuestionnaire() {
        return this.adQuestionnaire;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdvId() {
        return this.advId;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnchorClickType() {
        return this.anchorClickType;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppData() {
        return this.appData;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getButtonIcon() {
        return this.buttonIcon;
    }

    public int getButtonIconAnimationRepeatTimes() {
        return this.buttonIconAnimationRepeatTimes;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public CallToActionBarInfo getCallToActionBarInfo() {
        return this.callToActionBarInfo;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public int getCardInteractionType() {
        return this.cardInteractionType;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getChargeType() {
        return this.charge_type;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public s getCommentArea() {
        return this.commentArea;
    }

    public String getCommentExtra() {
        return this.commentExtra;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public com.ss.android.ugc.aweme.commercialize.model.a getDisclaimer() {
        return this.disclaimer;
    }

    public com.ss.android.ugc.aweme.commercialize.model.b getDislikeInfo() {
        return this.dislikeInfo;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public w getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DynamicVideo getDynamicVideo() {
        return this.dynamicVideo;
    }

    public String getEAdInfo() {
        return this.eAdInfo;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public aa getFakeAuthor() {
        return this.fakeAuthor;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public List<AwemeTextLabelModel> getFeaturedLabel() {
        return this.featuredLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public int getGetAdStatus() {
        return this.getAdStatus;
    }

    public int getGetAdTime() {
        return this.getAdTime;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public IndicatorData getIndicatorData() {
        return this.indicatorData;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLandingPageInfo() {
        return this.landingPageInfo;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public int getLiveAdType() {
        return this.liveAdType;
    }

    public String getLiveEnterFromMerge() {
        return this.enterFromMerge;
    }

    public String getLynxButtonUrl() {
        return this.lynxButtonUrl;
    }

    public j getLynxEntryData() {
        return this.lynxEntryData;
    }

    public String getLynxRawData() {
        return this.lynxRawData;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public NativeAuthorInfo getNativeAuthorInfo() {
        return this.nativeAuthor;
    }

    public ae getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public ag getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public int getNonNativeClick() {
        return this.nonNativeClick;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public ai getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getPivOption() {
        return this.pivOpt;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<am> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public int getPosition() {
        return this.position;
    }

    public com.ss.android.ugc.aweme.commercialize.feed.c.a getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public int getPreloadWebNew() {
        return this.preloadWebNew;
    }

    public String getPrice() {
        return this.price;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRecommendExtra() {
        return this.recommendExtra;
    }

    public String getRedMpUrl() {
        return this.redMpUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public AwemeSearchAdModel getSearchAdInfo() {
        return this.searchAdInfo;
    }

    public String getShopAdData() {
        return this.shopAdData;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowLabelRows() {
        return this.showLabelRows;
    }

    public int getShowLabelSeconds() {
        return this.showLabelSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public int getSimilarAnimation() {
        return this.similarAnimation;
    }

    public int getSkipTime() {
        return this.skipTime;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public m getStickerData() {
        return this.stickerData;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getUseOrdinaryWeb_() {
        return this.useOrdinaryWeb;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewPannelStyle() {
        return this.webviewPannelStyle;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableLikeType() {
        return this.disableLikeType;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableVideoResume() {
        return this.enableVideoResume;
    }

    public boolean isEnableWebGoogleLogin() {
        return this.enableWebGoogleLogin;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isHideWebButton() {
        return this.hideWebButton;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isOpenUrlSupportPullUp() {
        return this.isOpenUrlSupportPullUp;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isReshowAd() {
        return this.reshowAd;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isShowDisplayWhyThisAd() {
        return this.isDisplayWhyThisAd;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public boolean canShowLynxBtn2CardAnim() {
        if (this.showLynxCard == 1) {
            return true;
        }
        return false;
    }

    public boolean getEnableDescClick() {
        if (this.enableDescClick != 0) {
            return true;
        }
        return false;
    }

    public boolean isAckAction() {
        if (this.isAckAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isAppAd() {
        return isTypeOf("app");
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHardAd() {
        if (this.adSourceType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadExtraWeb() {
        if (this.preloadExtraWeb == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isImageValid() {
        List<UrlModel> list = this.imageList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isShowWebViewBottomLynxButton() {
        if ((this.lynxButtonPosition & 1) == 1) {
            return true;
        }
        return false;
    }

    public String[] getAppCategory() {
        if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        }
        return this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return Float.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("3")) {
            return null;
        }
        return this.cardInfos.get("3");
    }

    public Float getEffectivePlayTime() {
        Float f2 = this.effectivePlayTime;
        if (f2 == null || f2.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        }
        return this.effectivePlayTime;
    }

    public CardStruct getFollowCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("7")) {
            return null;
        }
        return this.cardInfos.get("7");
    }

    public JSONObject getFrontendData() {
        try {
            return new JSONObject(new f().b(this.frontendData));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public CardStruct getLiveCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("live_card")) {
            return null;
        }
        return this.cardInfos.get("live_card");
    }

    public UrlModel getRedImageUrl() {
        if (ip.a(this.iconImageList)) {
            return null;
        }
        return this.iconImageList.get(0);
    }

    public boolean isClickTrackUrlListValid() {
        UrlModel urlModel = this.clickTrackUrlList;
        if (urlModel == null || urlModel.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isRightStyle() {
        AwemeTextLabelModel awemeTextLabelModel;
        if (getAdTagPosition() != 2 || (awemeTextLabelModel = this.label) == null || TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            return false;
        }
        return true;
    }

    public void setAdHintData(i iVar) {
        this.adHintData = iVar;
    }

    public void setAdId(Long l2) {
        this.adId = l2;
    }

    public void setAdLive(AdLive adLive2) {
        this.adLive = adLive2;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i2) {
        this.adTagPosition = i2;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i2) {
        this.animationType = i2;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonStyle(int i2) {
        this.buttonStyle = i2;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCallToActionBarInfo(CallToActionBarInfo callToActionBarInfo2) {
        this.callToActionBarInfo = callToActionBarInfo2;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(s sVar) {
        this.commentArea = sVar;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i2) {
        this.disableDownloadDialog = i2;
    }

    public void setDisableFollowToClick(int i2) {
        this.disableFollowToClick = i2;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l2) {
        this.displayType = l2;
    }

    public void setDownloadMode(int i2) {
        this.mDownloadMode = i2;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setDynamicVideo(DynamicVideo dynamicVideo2) {
        this.dynamicVideo = dynamicVideo2;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setExpireSeconds(Long l2) {
        this.expireSeconds = l2;
    }

    public void setFakeAuthor(aa aaVar) {
        this.fakeAuthor = aaVar;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFormHeight(int i2) {
        this.formHeight = i2;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i2) {
        this.formWidth = i2;
    }

    public void setGetAdStatus(int i2) {
        this.getAdStatus = i2;
    }

    public void setGetAdTime(int i2) {
        this.getAdTime = i2;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setIndicatorData(IndicatorData indicatorData2) {
        this.indicatorData = indicatorData2;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i2) {
        this.mLinkMode = i2;
    }

    public void setMaskFormStyle(int i2) {
        this.maskFormStyle = i2;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setOmVast(ai aiVar) {
        this.omVast = aiVar;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(com.ss.android.ugc.aweme.commercialize.feed.c.a aVar) {
        this.preloadData = aVar;
    }

    public void setPreloadWeb(int i2) {
        this.preloadWeb = i2;
    }

    public void setPreloadWebNew(int i2) {
        this.preloadWebNew = i2;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProfileWithWebview(int i2) {
        this.profileWithWebview = i2;
    }

    public void setRecommendExtra(String str) {
        this.recommendExtra = str;
    }

    public void setRedMpUrl(String str) {
        this.redMpUrl = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i2) {
        this.reportAdType = i2;
    }

    public void setReshowAd(boolean z) {
        this.reshowAd = z;
    }

    public void setSearchAdInfo(AwemeSearchAdModel awemeSearchAdModel) {
        this.searchAdInfo = awemeSearchAdModel;
    }

    public void setShopAdData(String str) {
        this.shopAdData = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonSeconds(int i2) {
        this.showButtonSeconds = i2;
    }

    public void setShowMaskTimes(int i2) {
        this.showMaskTimes = i2;
    }

    public void setShowOutflowMaskTimes(int i2) {
        this.showOutflowMaskTimes = i2;
    }

    public void setSimilarAnimation(int i2) {
        this.similarAnimation = i2;
    }

    public void setSkipTime(int i2) {
        this.skipTime = i2;
    }

    public void setSlideAction(int i2) {
        this.slideAction = i2;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i2) {
        this.mSupportMultiple = i2;
    }

    public void setSystemOrigin(int i2) {
        this.systemOrigin = i2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoTranspose(Long l2) {
        this.videoTranspose = l2;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i2) {
        this.webType = i2;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i2) {
        this.webviewProgressBar = i2;
    }

    public void setWebviewType(int i2) {
        this.webviewType = i2;
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }

    public void setLiveCardInfo(CardStruct cardStruct) {
        if (cardStruct == null) {
            Map<String, CardStruct> map = this.cardInfos;
            if (map != null && map.containsKey("live_card")) {
                this.cardInfos.remove("live_card");
                return;
            }
            return;
        }
        if (this.cardInfos == null) {
            this.cardInfos = new HashMap();
        }
        this.cardInfos.put("live_card", cardStruct);
    }
}
