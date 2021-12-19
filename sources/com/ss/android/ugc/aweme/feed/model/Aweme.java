package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.a;
import com.ss.android.ugc.aweme.commerce.model.b;
import com.ss.android.ugc.aweme.commerce.model.e;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.k;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.model.u;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import com.ss.android.ugc.aweme.utils.ip;
import h.f.b.l;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class Aweme implements d, Serializable, Cloneable {
    @c(a = "activity")
    public AwemeActivity activity;
    @c(a = "activity_id")
    public String activityId;
    @c(a = "activity_pendant")
    public b activityPendant;
    @c(a = "ad_aweme_source")
    public int adAwemeSource;
    public boolean adDescHandle = true;
    public int adDescMaxLines = 4;
    @c(a = "ad_link_type")
    public int adLinkType;
    @c(a = "ad_schedule")
    public String adSchedule;
    @c(a = "aweme_id")
    public String aid;
    @c(a = "allow_gift")
    public boolean allowGift = false;
    @c(a = "anchor")
    public Anchor anchor;
    public AnchorCustomData anchorCustomData;
    @c(a = "anchor_info")
    public AnchorInfo anchorInfo;
    public int anchorType = -1;
    public String anchorWikiOfflineText = "";
    @c(a = "anchors")
    public List<AnchorCommonStruct> anchors;
    @c(a = "anchors_extras")
    public String anchorsExtras;
    @c(a = DataType.AUDIO)
    public Audio audio;
    @c(a = "author")
    public User author;
    @c(a = "aweme_acl")
    public AwemeACLShare awemeACLShareInfo;
    @c(a = "aweme_control")
    public AwemeControl awemeControl = new AwemeControl();
    public int awemePosition = -1;
    @c(a = "raw_ad_data")
    public AwemeRawAd awemeRawAd;
    @c(a = "risk_infos")
    public AwemeRiskModel awemeRiskModel;
    @c(a = "aweme_type")
    public int awemeType;
    @c(a = "banner_tip")
    public BannerTip bannerTip;
    @c(a = "boost_tag_info")
    public Boost boost;
    @c(a = "bottom_bar")
    public BottomBarModel bottomBarModel;
    @c(a = "bubble_info")
    public AwemeBubbleInfo bubbleInfo;
    public transient i cacheAvUploadMiscInfoStruct;
    @c(a = "can_play")
    public boolean canPlay = true;
    public int captionLength;
    public int captionReturnCount;
    public String challengeId;
    @c(a = "cha_list")
    public List<Challenge> challengeList;
    @c(a = "cmt_swt")
    public boolean cmtSwt;
    @c(a = "collect_stat")
    public int collectStatus;
    @c(a = "item_comment_settings")
    public int commentSetting;
    @c(a = "commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;
    @c(a = "commerce_sticker_info")
    public u commerceStickerInfo;
    @c(a = "content_desc")
    public String contentDesc;
    @c(a = "content_desc_extra")
    public List<TextExtraStruct> contentDescExtra;
    @c(a = "create_time")
    public long createTime;
    public long date;
    @c(a = "deduplication_type")
    public int deduplicationType;
    @c(a = "desc")
    public String desc;
    public transient int descFullTextHeight = 0;
    @c(a = "desc_language")
    public String descLanguage;
    public transient int descLines;
    public transient int descTruncatedTextHeight = 0;
    @c(a = "descendants")
    public DescendantsModel descendantsModel;
    @c(a = "disable_search_trending_bar")
    public boolean disableSearchTrendingBar;
    @c(a = "distance")
    public String distance;
    @c(a = "distribute_type")
    public int distributeType;
    @c(a = "dou_discount_label")
    public String douDiscountLabel;
    @c(a = "dou_discount_mix_info")
    public HotSearchInfo douDiscountMixInfo;
    @c(a = "without_watermark")
    public boolean downloadWithoutWatermark;
    @c(a = "music_dsp_info")
    public Dsp dsp;
    @c(a = "item_duet")
    public int duetSetting;
    public transient WeakReference<CharSequence> ellipsizeDesc;
    public transient CharSequence ellipsizeTransDesc;
    @c(a = "enable_ad_drop")
    public boolean enableAdDrop;
    @c(a = "enable_pos_adjust")
    public boolean enablePosAdjust;
    public ExposeSharer exposeSharer;
    @c(a = "external_video_type")
    public int externalType;
    @c(a = "extra")
    public String extra;
    public String fakeAid;
    public List<User> familiarRecommendUser;
    public long feedCount;
    @c(a = "feed_relation_label")
    public RelationLabelNew feedRelationLabel;
    @c(a = "floating_card_content")
    public FloatingCardInfo floatingCardInfo;
    @c(a = "follow_up_publish_from_id")
    public String followUpPublishFromId;
    @c(a = "forward_comment_id")
    public String forwardCommentId;
    @c(a = "forward_item")
    public Aweme forwardItem;
    @c(a = "forward_item_id")
    public String forwardItemId;
    public Challenge fromRawChallenge;
    public transient int fullTransTextHeight = 0;
    @c(a = "game_info")
    public GameInfo gameInfo;
    @c(a = "gap_list")
    public List<Integer> gapList;
    public VideoMaskInfo generalMaskInfo = null;
    @c(a = "geofencing_regions")
    public List<String> geofencingRegions;
    @c(a = "green_screen_materials")
    public List<GreenScreenMaterial> greenScreenMaterialList;
    @c(a = "group_id")
    public String groupId;
    public int hasAd = 0;
    @c(a = "has_promote_entry")
    public int hasPromoteEntry;
    @c(a = "has_vs_entry")
    public boolean hasVisionSearchEntry;
    @c(a = "have_dashboard")
    public boolean haveDashboard = false;
    @c(a = "hot_list")
    public HotListStruct hotListStruct;
    @c(a = "hot_info")
    public HotSearchInfo hotSearchInfo;
    @c(a = "hotsearch_info")
    public HotSearchInfoStruct hotSearchInfoStruct;
    public String hotSpot;
    @c(a = "hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    @c(a = "image_infos")
    public List<ImageInfo> imageInfos;
    @c(a = "interact_permission")
    public InteractPermission interactPermission;
    @c(a = "interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;
    @c(a = "interaction_tag_info")
    public InteractionTagInfo interactionTagInfo;
    @c(a = "is_ads")
    public boolean isAd;
    public boolean isCanCache = true;
    @c(a = "is_client_cache")
    public boolean isClientCache;
    @c(a = "is_effect_designer")
    public boolean isEffectDesigner;
    public boolean isFakeResponse;
    @c(a = "is_familiar")
    public boolean isFamiliar;
    @c(a = "is_fantasy")
    public boolean isFantasy;
    public boolean isFirstInSpot;
    public boolean isFromDouPlusGuideAnimate;
    public boolean isFromSplitData;
    public String isFromTrendingCard = "";
    @c(a = "is_hash_tag")
    public int isHashTag;
    public boolean isHighlighted;
    public boolean isLastInSpot;
    @c(a = "is_live_replay")
    public boolean isLiveReplay = false;
    @c(a = "is_pgcshow")
    public boolean isPgcShow;
    public boolean isPreloadScroll;
    @c(a = "is_preview")
    public int isPreview;
    @c(a = "is_prohibited")
    public boolean isProhibited;
    @c(a = "is_relieve")
    public boolean isRelieve;
    public transient boolean isReversionForwardAweme = true;
    public boolean isStoryFakeAweme;
    @c(a = "is_top")
    public int isTop;
    @c(a = "is_vr")
    public boolean isVr;
    @c(a = "label_large")
    public UrlModel labelLarge;
    @c(a = "label_private")
    public UrlModel labelPrivate;
    @c(a = "label_thumb")
    public UrlModel labelThumb;
    @c(a = "label_top")
    public UrlModel labelTop;
    @c(a = "landing_page")
    public String landingPage;
    @c(a = "law_critical_country")
    public boolean lawCriticalCountry;
    @com.google.gson.a.b(a = StringJsonAdapterFactory.class)
    @c(a = "link_ad_data")
    public ac linkAdData;
    @c(a = "link_match")
    public com.ss.android.ugc.aweme.search.c.c linkMatch;
    @c(a = "live_id")
    public long liveId;
    @c(a = "live_reason")
    public String liveReaSon;
    @c(a = "live_type")
    public String liveType;
    @c(a = "live_window_show_time")
    public long liveWindowShowTime;
    public LogPbBean logPb;
    @c(a = "long_video")
    public List<LongVideo> longVideos;
    @c(a = "commerce_info")
    public a mCommerceVideoAuthInfo;
    public int mConcatAndUploadState;
    @c(a = "search_highlight")
    public List<com.ss.android.ugc.aweme.search.d> mHighlightInfoList;
    @c(a = "item_distribute_source")
    public String mItemDistributeSource;
    @c(a = "item_source_category")
    public int mItemSourceCategory = 0;
    @c(a = "label_music_starter_text")
    public String mLabelMusicStarterText;
    @c(a = "label_origin_author_text")
    public String mLabelOriginAuthorText;
    @c(a = "cny_info")
    public LiveAwesomeSplashInfo mLiveAwesomeSplashInfo;
    public HashMap<String, String> mMobParams;
    @c(a = "new_relation_label")
    public List<RelationLabelNew> mNewRelationLabel;
    public int mRank = -1;
    @c(a = "cell_room")
    public RoomFeedCellStruct mRoomFeedCellStruct;
    @c(a = "match_text")
    public String matchText;
    @c(a = "match_type")
    public int matchType;
    @c(a = "micro_app_info")
    public com.ss.android.ugc.aweme.miniapp_api.model.b microAppInfo;
    public MixFlowParam mixFlowParam = null;
    @c(a = "mix_info")
    public MixStruct mixInfo;
    @c(a = "music")
    public Music music;
    @c(a = "label_music_starter")
    public UrlModel musicStarter;
    @c(a = "mutual_relation")
    public MutualStruct mutualRelation;
    @c(a = "nearby_fresh_label")
    public String nearbyHotLabel;
    @c(a = "need_vs_entry")
    public boolean needVisionSearchEntry;
    @c(a = "new_label")
    public int newLabel = 0;
    @com.google.gson.a.b(a = StringJsonAdapterFactory.class)
    @c(a = "rawdata")
    public NewLiveRoomStruct newLiveRoomData;
    @c(a = "new_source_id")
    public String newSourceId;
    @c(a = "new_source_type")
    public String newSourceType;
    @c(a = "nickname_position")
    public List<Position> nicknamePosition;
    @c(a = "label_origin_author")
    public UrlModel originAuthor;
    @c(a = "origin_comment_ids")
    public List<String> originCommentIds;
    public int originalPos;
    public String parentHotSpot;
    @c(a = "part_n")
    public String partN;
    public VideoMaskInfo photosensitiveMaskInfo = null;
    @c(a = "playlist_blocked")
    public boolean playlistBlocked;
    @c(a = "playlist_info")
    public PlayListInfo playlist_info;
    @c(a = "position")
    public List<Position> position;
    @c(a = "pre_forward_id")
    public String preForwardId;
    @c(a = "pred_playtime")
    public int predPlaytime;
    @c(a = "preload")
    public Preload preload;
    @c(a = "prevent_download")
    public boolean preventDownload;
    public transient WeakReference<CharSequence> processedDesc;
    @c(a = "products_count")
    public int productsCount;
    @c(a = "products_info")
    public List<com.ss.android.ugc.aweme.search.ecom.a.a> productsInfo;
    @c(a = "promote_toast")
    public String promoteToast;
    @c(a = "promote_toast_key")
    public String promoteToastKey;
    @c(a = "promotion_other_info")
    public com.ss.android.ugc.aweme.commerce.model.d promotionOtherInfo;
    @c(a = "question_list")
    public List<QuestionInfo> questionInfo;
    @c(a = "rate")
    public int rate = -1;
    public String rateScore;
    @c(a = "react_from")
    public String reactFrom;
    @c(a = "react_origin")
    public String reactOrigin;
    @c(a = "item_react")
    public int reactSetting;
    @c(a = "react_view")
    public String reactView;
    @c(a = "recommend_card_type")
    public int recommendCardType;
    @c(a = "region")
    public String region;
    @c(a = "relation_label")
    public RelationDynamicLabel relationLabel;
    @c(a = "relation_recommend_info")
    public AwemeRelationRecommendModel relationRecommendInfo;
    public VideoMaskInfo reportMaskInfo = null;
    public String repostFromGroupId;
    public String repostFromUserId;
    public String requestId;
    @c(a = "room")
    public RoomStruct room;
    @c(a = "scenario")
    public int scenario;
    public String scheduleId;
    @c(a = "schedule_time")
    public long scheduleTime;
    @c(a = "search_desc")
    public String searchDesc;
    @c(a = "search_extra")
    public SearchExtraStruct searchExtraStruct;
    public String searchFeedType;
    @c(a = "share_info")
    public ShareInfo shareInfo;
    @c(a = "share_url")
    public String shareUrl;
    public List<e> simplePromotions;
    @c(a = "sound_exemption")
    public int soundExemption = 0;
    @c(a = "sp_sticker")
    public SpecialSticker specialSticker;
    @c(a = "star_atlas_order_id")
    public long starAtlasOrderId;
    @c(a = "statistics")
    public AwemeStatistics statistics;
    @c(a = "status")
    public AwemeStatus status;
    @c(a = "sticker_detail")
    public g stickerEntranceInfo;
    @c(a = "stickers")
    public String stickerIDs;
    @c(a = "item_stitch")
    public int stitchSetting;
    @c(a = "story_metadata")
    public Story story;
    @c(a = "stream_url")
    public StreamUrlModel streamUrlModel;
    @c(a = "take_down_desc")
    public String takeDownDesc;
    @c(a = "take_down_reason")
    public int takeDownReason;
    @c(a = "tcm_info")
    public TCMInfo tcmInfo;
    @c(a = "text_extra")
    public List<TextExtraStruct> textExtra;
    @c(a = "label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;
    @c(a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
    @c(a = "title")
    public String title;
    public transient int totalProductAnchors = 0;
    public transient CharSequence transDesc;
    public transient int transDescLines;
    @c(a = "trending_bar")
    public AwemeTrendingBar trendingBar;
    @c(a = "trending_bar_fyp")
    public AwemeTrendingBar trendingBarFYP;
    public String trendingId = "";
    public String trendingName = "";
    public transient int truncatedTransTextHeight = 0;
    @c(a = "uniqid_position")
    public List<Position> uniqidPosition;
    public String uniqueId;
    @c(a = "misc_info")
    public String uploadMiscInfoStructStr;
    @c(a = "upvote_reason")
    public UpvoteReason upvoteReason;
    @c(a = "user_digged")
    public int userDigg;
    @c(a = "user_profile_init_info")
    public UserProfileInitInfo userProfileInitInfo;
    @c(a = "user_story")
    public UserStory userStory;
    @c(a = "video")
    public Video video;
    @c(a = "video_control")
    public VideoControl videoControl;
    @c(a = "video_feed_tag")
    public String videoFeedTag;
    @c(a = "video_labels")
    public List<AwemeLabelModel> videoLabels;
    @c(a = "mask_info")
    public VideoMaskInfo videoMaskInfo;
    @c(a = "mask_infos")
    public List<VideoMaskInfo> videoMaskInfos = new ArrayList();
    @c(a = "video_reply_info")
    public VideoReplyStruct videoReplyStruct;
    @c(a = "with_promotional_music")
    public boolean withPromotionalMusic = false;
    @c(a = "with_survey")
    public boolean withSurvey;

    public interface ConcatAndUploadState {
        static {
            Covode.recordClassIndex(59309);
        }
    }

    static {
        Covode.recordClassIndex(59308);
    }

    public String getActivityId() {
        return this.activityId;
    }

    public b getActivityPendant() {
        return this.activityPendant;
    }

    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public int getAdDescMaxLines() {
        return this.adDescMaxLines;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public String getAid() {
        return this.aid;
    }

    public boolean getAllowGift() {
        return this.allowGift;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public AnchorCustomData getAnchorCustomData() {
        return this.anchorCustomData;
    }

    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public int getAnchorType() {
        return this.anchorType;
    }

    public String getAnchorWikiOfflineText() {
        return this.anchorWikiOfflineText;
    }

    public List<AnchorCommonStruct> getAnchors() {
        return this.anchors;
    }

    public String getAnchorsExtras() {
        return this.anchorsExtras;
    }

    public Audio getAudio() {
        return this.audio;
    }

    public User getAuthor() {
        return this.author;
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public AwemeActivity getAwemeActivity() {
        return this.activity;
    }

    public int getAwemePosition() {
        return this.awemePosition;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public BannerTip getBannerTip() {
        return this.bannerTip;
    }

    public Boost getBoost() {
        return this.boost;
    }

    public BottomBarModel getBottomBarModel() {
        return this.bottomBarModel;
    }

    public AwemeBubbleInfo getBubbleInfo() {
        return this.bubbleInfo;
    }

    public boolean getCanCache() {
        return this.isCanCache;
    }

    public int getCaptionLength() {
        return this.captionLength;
    }

    public int getCaptionReturnCount() {
        return this.captionReturnCount;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public u getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public a getCommerceVideoAuthInfo() {
        return this.mCommerceVideoAuthInfo;
    }

    public String getContentDesc() {
        return this.contentDesc;
    }

    public List<TextExtraStruct> getContentDescExtra() {
        return this.contentDescExtra;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDate() {
        return this.date;
    }

    public int getDeduplicationType() {
        return this.deduplicationType;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getDescFullTextHeight() {
        return this.descFullTextHeight;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public int getDescLines() {
        return this.descLines;
    }

    public int getDescTruncatedTextHeight() {
        return this.descTruncatedTextHeight;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public String getDouDiscountLabel() {
        return this.douDiscountLabel;
    }

    public HotSearchInfo getDouDiscountMixInfo() {
        return this.douDiscountMixInfo;
    }

    public Dsp getDsp() {
        return this.dsp;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public ExposeSharer getExposeSharer() {
        return this.exposeSharer;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFakeAid() {
        return this.fakeAid;
    }

    public List<User> getFamiliarRecommendUser() {
        return this.familiarRecommendUser;
    }

    public long getFeedCount() {
        return this.feedCount;
    }

    public RelationLabelNew getFeedRelationLabel() {
        return this.feedRelationLabel;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getFollowUpPublishFromId() {
        return this.followUpPublishFromId;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public Challenge getFromRawChallenge() {
        return this.fromRawChallenge;
    }

    public int getFullTransTextHeight() {
        return this.fullTransTextHeight;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public List<Integer> getGapList() {
        return this.gapList;
    }

    public List<String> getGeofencingRegions() {
        return this.geofencingRegions;
    }

    public List<GreenScreenMaterial> getGreenScreenMaterials() {
        return this.greenScreenMaterialList;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public int getHasAd() {
        return this.hasAd;
    }

    public int getHasPromoteEntry() {
        return this.hasPromoteEntry;
    }

    public List<com.ss.android.ugc.aweme.search.d> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HotListStruct getHotListStruct() {
        return this.hotListStruct;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public HotSearchInfoStruct getHotSearchInfoStruct() {
        return this.hotSearchInfoStruct;
    }

    public String getHotSpot() {
        return this.hotSpot;
    }

    public List<AwemeHybridLabelModel> getHybridLabels() {
        return this.hybridLabels;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public InteractPermission getInteractPermission() {
        return this.interactPermission;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public InteractionTagInfo getInteractionTagInfo() {
        return this.interactionTagInfo;
    }

    public boolean getIsFromDouPlusGuideAnimate() {
        return this.isFromDouPlusGuideAnimate;
    }

    public boolean getIsPreloadScroll() {
        return this.isPreloadScroll;
    }

    public int getIsTop() {
        return this.isTop;
    }

    public int getItemSourceCategory() {
        return this.mItemSourceCategory;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public String getLabelOriginAuthorText() {
        return this.mLabelOriginAuthorText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public ac getLinkAdData() {
        return this.linkAdData;
    }

    public com.ss.android.ugc.aweme.search.c.c getLinkMatch() {
        return this.linkMatch;
    }

    public LiveAwesomeSplashInfo getLiveAwesomeSplashInfo() {
        return this.mLiveAwesomeSplashInfo;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public String getLiveReaSon() {
        return this.liveReaSon;
    }

    public String getLiveType() {
        return this.liveType;
    }

    public long getLiveWindowShowTime() {
        return this.liveWindowShowTime;
    }

    public LogPbBean getLogPbBean() {
        return this.logPb;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public String getMatchText() {
        return this.matchText;
    }

    public int getMatchType() {
        return this.matchType;
    }

    public com.ss.android.ugc.aweme.miniapp_api.model.b getMicroAppInfo() {
        return this.microAppInfo;
    }

    public MixStruct getMixInfo() {
        return this.mixInfo;
    }

    public HashMap<String, String> getMobParams() {
        return this.mMobParams;
    }

    public Music getMusic() {
        return this.music;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public MutualStruct getMutualRelation() {
        return this.mutualRelation;
    }

    public String getNearbyHotLabel() {
        return this.nearbyHotLabel;
    }

    public int getNewLabel() {
        return this.newLabel;
    }

    public List<RelationLabelNew> getNewRelationLabel() {
        return this.mNewRelationLabel;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public int getOriginalPos() {
        return this.originalPos;
    }

    public String getParentHotSpot() {
        return this.parentHotSpot;
    }

    public String getPartN() {
        return this.partN;
    }

    public boolean getPlaylistBlocked() {
        return this.playlistBlocked;
    }

    public PlayListInfo getPlaylist_info() {
        return this.playlist_info;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public int getPredPlaytime() {
        return this.predPlaytime;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public int getProductsCount() {
        return this.productsCount;
    }

    public List<com.ss.android.ugc.aweme.search.ecom.a.a> getProductsInfo() {
        return this.productsInfo;
    }

    public String getPromoteToast() {
        return this.promoteToast;
    }

    public String getPromoteToastKey() {
        return this.promoteToastKey;
    }

    public com.ss.android.ugc.aweme.commerce.model.d getPromotionOtherInfo() {
        return this.promotionOtherInfo;
    }

    public int getRank() {
        return this.mRank;
    }

    public int getRate() {
        return this.rate;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public String getReactFrom() {
        return this.reactFrom;
    }

    public String getReactOrigin() {
        return this.reactOrigin;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public String getReactView() {
        return this.reactView;
    }

    public int getRecommendCardType() {
        return this.recommendCardType;
    }

    public String getRegion() {
        return this.region;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public AwemeRelationRecommendModel getRelationRecommendInfo() {
        return this.relationRecommendInfo;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public RoomFeedCellStruct getRoomFeedCellStruct() {
        return this.mRoomFeedCellStruct;
    }

    public int getScenario() {
        return this.scenario;
    }

    public String getScheduleId() {
        return this.scheduleId;
    }

    public long getScheduleTime() {
        return this.scheduleTime;
    }

    public String getSearchDesc() {
        return this.searchDesc;
    }

    public SearchExtraStruct getSearchExtraStruct() {
        return this.searchExtraStruct;
    }

    public String getSearchFeedType() {
        return this.searchFeedType;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getSoundExemption() {
        return this.soundExemption;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public g getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public Story getStory() {
        return this.story;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public TCMInfo getTcmInfo() {
        return this.tcmInfo;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotalProductAnchors() {
        return this.totalProductAnchors;
    }

    public CharSequence getTransDesc() {
        return this.transDesc;
    }

    public int getTransDescLines() {
        return this.transDescLines;
    }

    public AwemeTrendingBar getTrendingBar() {
        return this.trendingBar;
    }

    public AwemeTrendingBar getTrendingBarFYP() {
        return this.trendingBarFYP;
    }

    public String getTrendingId() {
        return this.trendingId;
    }

    public String getTrendingName() {
        return this.trendingName;
    }

    public int getTruncatedTransTextHeight() {
        return this.truncatedTransTextHeight;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public UpvoteReason getUpvoteReason() {
        return this.upvoteReason;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public UserProfileInitInfo getUserProfileInitInfo() {
        return this.userProfileInitInfo;
    }

    public UserStory getUserStory() {
        return this.userStory;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public String getVideoFeedTag() {
        return this.videoFeedTag;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public VideoMaskInfo getVideoMaskInfo() {
        return this.videoMaskInfo;
    }

    public VideoReplyStruct getVideoReplyStruct() {
        return this.videoReplyStruct;
    }

    public boolean hasVisionSearchEntry() {
        return this.hasVisionSearchEntry;
    }

    public boolean isAdDescHandle() {
        return this.adDescHandle;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isClientCache() {
        return this.isClientCache;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isDisableSearchTrendingBar() {
        return this.disableSearchTrendingBar;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isEnableAdDrop() {
        return this.enableAdDrop;
    }

    public boolean isEnablePosAdjust() {
        return this.enablePosAdjust;
    }

    public boolean isFakeResponse() {
        return this.isFakeResponse;
    }

    public boolean isFamiliar() {
        return this.isFamiliar;
    }

    public boolean isFantasy() {
        return this.isFantasy;
    }

    public boolean isFirstInSpot() {
        return this.isFirstInSpot;
    }

    public boolean isFromSplitData() {
        return this.isFromSplitData;
    }

    public String isFromTrendingCard() {
        return this.isFromTrendingCard;
    }

    public boolean isHaveDashboard() {
        return this.haveDashboard;
    }

    public boolean isHighlighted() {
        return this.isHighlighted;
    }

    public boolean isLastInSpot() {
        return this.isLastInSpot;
    }

    public boolean isLawCriticalCountry() {
        return this.lawCriticalCountry;
    }

    public boolean isLiveReplay() {
        return this.isLiveReplay;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isReversionForwardAweme() {
        return this.isReversionForwardAweme;
    }

    public boolean isStoryFakeAweme() {
        return this.isStoryFakeAweme;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean isWithSurvey() {
        return this.withSurvey;
    }

    public boolean needVisionSearchEntry() {
        return this.needVisionSearchEntry;
    }

    private boolean canUseUniqueId() {
        return isLive();
    }

    public boolean canShare() {
        return this.status.allowShare;
    }

    public int getFollowStatus() {
        return this.author.getFollowStatus();
    }

    public boolean hasStickerID() {
        if (this.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public boolean hasTrendingBar() {
        if (this.trendingBar != null) {
            return true;
        }
        return false;
    }

    public boolean hasTrendingBarFYP() {
        if (this.trendingBarFYP != null) {
            return true;
        }
        return false;
    }

    public boolean isAwemeFromXiGua() {
        if (this.externalType == 1) {
            return true;
        }
        return false;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isConcating() {
        if (this.mConcatAndUploadState == 1) {
            return true;
        }
        return false;
    }

    public boolean isHashTag() {
        if (this.isHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isLike() {
        if (this.userDigg == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreview() {
        if (this.isPreview == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportGameChallenge() {
        if (this.gameInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isTop() {
        if (this.isTop == 1) {
            return true;
        }
        return false;
    }

    public boolean needPreloadAdLink() {
        if (this.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public String getAuthorUid() {
        User user = this.author;
        if (user != null) {
            return user.getUid();
        }
        return "";
    }

    public AwemeControl getAwemeControl() {
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public String getAwemeRawAdIdStr() {
        AwemeRawAd awemeRawAd2 = this.awemeRawAd;
        if (awemeRawAd2 != null) {
            return awemeRawAd2.getCreativeIdStr();
        }
        return "";
    }

    public int getDownloadStatus() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null) {
            return 0;
        }
        return awemeStatus.getDownloadStatus();
    }

    public CharSequence getEllipsizeTransDesc() {
        if (TextUtils.isEmpty(this.ellipsizeTransDesc)) {
            return getTransDesc();
        }
        return this.ellipsizeTransDesc;
    }

    public int getEnterpriseType() {
        User user = this.author;
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    public String getForwardGroupId() {
        if (isMultiForwardAweme()) {
            return this.preForwardId;
        }
        return "";
    }

    public String getItemDistributeSource() {
        if (!TextUtils.isEmpty(this.mItemDistributeSource)) {
            return this.mItemDistributeSource;
        }
        return "";
    }

    public String getLogPbString() {
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            return "";
        }
        return logPbBean.toJsonString();
    }

    public String getMixId() {
        MixStruct mixStruct = this.mixInfo;
        if (mixStruct != null) {
            return mixStruct.mixId;
        }
        return "";
    }

    public OcrLocation getOcrLocation() {
        return getUploadMiscInfoStruct().getOcrLocation();
    }

    public String getRecallType() {
        com.ss.android.ugc.aweme.commerce.model.d dVar = this.promotionOtherInfo;
        if (dVar == null) {
            return "";
        }
        return dVar.getRecallReason();
    }

    public String getReviewDetailUrl() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null) {
            return "";
        }
        return awemeStatus.getReviewDetailUrl();
    }

    public String getSecAuthorUid() {
        User user = this.author;
        if (user != null) {
            return user.getSecUid();
        }
        return "";
    }

    public TVStationRoomStruct getTvRoomStruct() {
        RoomStruct roomStruct = this.room;
        if (roomStruct != null) {
            return roomStruct.tvStationRoomStruct;
        }
        return null;
    }

    public String getUniqueId() {
        if (TextUtils.isEmpty(this.uniqueId)) {
            return this.aid;
        }
        return this.uniqueId;
    }

    public i getUploadMiscInfoStruct() {
        if (this.cacheAvUploadMiscInfoStruct == null) {
            this.cacheAvUploadMiscInfoStruct = i.createStruct(this.uploadMiscInfoStructStr);
        }
        return this.cacheAvUploadMiscInfoStruct;
    }

    public List<VideoMaskInfo> getVideoMaskInfos() {
        if (this.videoMaskInfos == null) {
            this.videoMaskInfos = new ArrayList();
        }
        return this.videoMaskInfos;
    }

    public boolean hasPromotion() {
        if (getPromotion() != null) {
            return true;
        }
        return false;
    }

    public boolean isAd() {
        if (!this.isAd || this.awemeRawAd == null) {
            return false;
        }
        return true;
    }

    public boolean isAllowMusic() {
        VideoControl videoControl2 = this.videoControl;
        if (videoControl2 != null) {
            return videoControl2.isAllowMusic;
        }
        return true;
    }

    public boolean isAwemeFromDongCheDi() {
        if (this.externalType == 2) {
            return true;
        }
        return false;
    }

    public boolean isDelete() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isDelete()) {
            return false;
        }
        return true;
    }

    public boolean isForwardAweme() {
        if (this.awemeType == 13) {
            return true;
        }
        return false;
    }

    public boolean isGreenScreenSticker() {
        if (getUploadMiscInfoStruct().greenScreen == 1) {
            return true;
        }
        return false;
    }

    public boolean isHotListAweme() {
        HotListStruct hotListStruct2 = this.hotListStruct;
        if (hotListStruct2 == null || hotListStruct2.getType() == 0) {
            return false;
        }
        return true;
    }

    public boolean isImage() {
        if (this.awemeType == 2) {
            return true;
        }
        return false;
    }

    public boolean isInReviewing() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isInReviewing()) {
            return false;
        }
        return true;
    }

    public boolean isLive() {
        if (this.awemeType == 101) {
            return true;
        }
        return false;
    }

    public boolean isLiveNoDeduplicate() {
        if (this.awemeType == 101 && 1 == this.deduplicationType) {
            return true;
        }
        return false;
    }

    public boolean isMixAweme() {
        MixStruct mixStruct = this.mixInfo;
        if (mixStruct == null || TextUtils.isEmpty(mixStruct.mixId)) {
            return false;
        }
        return true;
    }

    public boolean isOrderShareRecommend() {
        com.ss.android.ugc.aweme.commerce.model.d dVar = this.promotionOtherInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.isOrderShareRecommend();
    }

    public boolean isPrivate() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || awemeStatus.getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isProhibited() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isProhibited()) {
            return false;
        }
        return true;
    }

    public boolean isProhibitedAndShouldTell() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isProhibitedAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isPublic() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || awemeStatus.getPrivateStatus() != 0) {
            return false;
        }
        return true;
    }

    public boolean isReviewed() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isReviewed()) {
            return false;
        }
        return true;
    }

    public boolean isScheduleVideo() {
        if (this.scheduleTime > 0) {
            return true;
        }
        return false;
    }

    public boolean isSelfSee() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isSelfSee()) {
            return false;
        }
        return true;
    }

    public boolean isSelfSeeAndShouldTell() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.isSelfSeeAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isUploadFailure() {
        if (this.mConcatAndUploadState == 3) {
            return true;
        }
        return false;
    }

    public boolean isUploading() {
        if (this.mConcatAndUploadState == 2) {
            return true;
        }
        return false;
    }

    public boolean isUserPost() {
        if (this.awemeType == 33 || this.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || !awemeStatus.shouldShowReviewStatus()) {
            return false;
        }
        return true;
    }

    public boolean withFakeUser() {
        User user = this.author;
        if (user == null || user.isAdFake()) {
            return true;
        }
        return false;
    }

    private boolean commerceVideoTypeAllowDuetReact() {
        int i2 = this.awemeType;
        if (i2 == 1 || i2 == 29 || i2 == 30 || i2 == 32 || i2 == 33 || i2 == 201) {
            return true;
        }
        return false;
    }

    public s getAdCommentStruct() {
        if (getAwemeRawAd() != null) {
            return getAwemeRawAd().getCommentArea();
        }
        return null;
    }

    public String getCoverNotice() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || awemeStatus.getReviewResult() == null) {
            return "";
        }
        return this.status.getReviewResult().getCoverNotice();
    }

    public CharSequence getEllipsizeDesc() {
        WeakReference<CharSequence> weakReference = this.ellipsizeDesc;
        if (weakReference == null || TextUtils.isEmpty(weakReference.get())) {
            return getDesc();
        }
        return this.ellipsizeDesc.get();
    }

    public String getFromRequestId() {
        if (getAwemeType() != 13) {
            return getRequestId();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getRequestId();
        }
        return "";
    }

    public String getFromUserId() {
        if (getAwemeType() != 13) {
            return getAuthorUid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAuthorUid();
        }
        return "";
    }

    public VideoMaskInfo getGeneralMaskInfo() {
        if (this.generalMaskInfo == null) {
            this.generalMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 3);
        }
        return this.generalMaskInfo;
    }

    public VideoMaskInfo getPhotosensitiveMaskInfo() {
        if (this.photosensitiveMaskInfo == null) {
            this.photosensitiveMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 4);
        }
        return this.photosensitiveMaskInfo;
    }

    public CharSequence getProcessedDesc() {
        WeakReference<CharSequence> weakReference = this.processedDesc;
        if (weakReference == null || TextUtils.isEmpty(weakReference.get())) {
            return getDesc();
        }
        return this.processedDesc.get();
    }

    public e getPromotion() {
        if (getPromotions().isEmpty()) {
            return null;
        }
        return getPromotions().get(0);
    }

    public List<String> getRawAdClickTrackUrlList() {
        UrlModel clickTrackUrlList;
        if (getAwemeRawAd() == null || (clickTrackUrlList = getAwemeRawAd().getClickTrackUrlList()) == null) {
            return null;
        }
        return clickTrackUrlList.getUrlList();
    }

    public List<String> getRawAdEffectivePlayTrackUrlList() {
        UrlModel effectivePlayTrackUrlList;
        if (getAwemeRawAd() == null || (effectivePlayTrackUrlList = getAwemeRawAd().getEffectivePlayTrackUrlList()) == null) {
            return null;
        }
        return effectivePlayTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayOverTrackUrlList() {
        UrlModel playOverTrackUrlList;
        if (getAwemeRawAd() == null || (playOverTrackUrlList = getAwemeRawAd().getPlayOverTrackUrlList()) == null) {
            return null;
        }
        return playOverTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayTrackUrlList() {
        UrlModel playTrackUrlList;
        if (getAwemeRawAd() == null || (playTrackUrlList = getAwemeRawAd().getPlayTrackUrlList()) == null) {
            return null;
        }
        return playTrackUrlList.getUrlList();
    }

    public List<String> getRawAdShowTrackUrlList() {
        UrlModel trackUrlList;
        if (getAwemeRawAd() == null || (trackUrlList = getAwemeRawAd().getTrackUrlList()) == null) {
            return null;
        }
        return trackUrlList.getUrlList();
    }

    public VideoMaskInfo getReportMaskInfo() {
        if (this.reportMaskInfo == null) {
            this.reportMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 1);
        }
        return this.reportMaskInfo;
    }

    public String getRepostFromGroupId() {
        Aweme aweme;
        if (!TextUtils.isEmpty(this.repostFromGroupId)) {
            return this.repostFromGroupId;
        }
        if (!isForwardAweme() || (aweme = this.forwardItem) == null) {
            return null;
        }
        return aweme.getAid();
    }

    public String getRepostFromUserId() {
        Aweme aweme;
        User user;
        if (!TextUtils.isEmpty(this.repostFromUserId)) {
            return this.repostFromUserId;
        }
        if (!isForwardAweme() || (aweme = this.forwardItem) == null || (user = aweme.author) == null) {
            return null;
        }
        return user.getUid();
    }

    public AwemeStatus getStatus() {
        if (isScheduleVideo() && this.status == null) {
            this.status = new AwemeStatus();
        }
        return this.status;
    }

    public String getVideoDetailNotice() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || awemeStatus.getReviewResult() == null) {
            return "";
        }
        return this.status.getReviewResult().getVideoDetailNotice();
    }

    public String getVideoDetailNoticeBottom() {
        AwemeStatus awemeStatus = this.status;
        if (awemeStatus == null || awemeStatus.getReviewResult() == null) {
            return "";
        }
        return this.status.getReviewResult().getVideoDetailNoticeBottom();
    }

    public int hashCode() {
        String str;
        if (canUseUniqueId()) {
            str = getUniqueId();
        } else {
            str = this.aid;
        }
        return str.hashCode();
    }

    public boolean isAppAd() {
        if (!isAd() || !this.awemeRawAd.isAppAd()) {
            return false;
        }
        return true;
    }

    public boolean isHotSearchAweme() {
        HotSearchInfo hotSearchInfo2 = this.hotSearchInfo;
        if (hotSearchInfo2 == null || TextUtils.isEmpty(hotSearchInfo2.getSentence())) {
            return false;
        }
        return true;
    }

    public boolean isHotVideoAweme() {
        HotSearchInfo hotSearchInfo2 = this.hotSearchInfo;
        if (hotSearchInfo2 == null || hotSearchInfo2.getVideoRank() <= 0 || this.hotSearchInfo.getVideoRankVV() <= 0) {
            return false;
        }
        return true;
    }

    private void buildUniqueId() {
        if (!TextUtils.isEmpty(this.requestId)) {
            this.uniqueId = this.requestId + "|" + this.aid;
        }
    }

    private boolean isMultiForwardAweme() {
        if (ip.a(this.textExtra)) {
            return false;
        }
        for (TextExtraStruct textExtraStruct : this.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean canDuetVideoType() {
        int i2 = this.awemeType;
        if (i2 == 0 || i2 == 51 || i2 == 52 || i2 == 58 || i2 == 54 || i2 == 53 || i2 == 61 || i2 == 55 || i2 == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canReactVideoType() {
        int i2 = this.awemeType;
        if (i2 == 52 || i2 == 0 || i2 == 51 || i2 == 58 || i2 == 54 || i2 == 53 || i2 == 61 || i2 == 55 || i2 == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canStitchVideoType() {
        int i2 = this.awemeType;
        if (i2 == 0 || i2 == 51 || i2 == 52 || i2 == 54 || i2 == 53 || i2 == 61 || i2 == 55 || i2 == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public ItemCommentEggGroup getCommentEggGroup() {
        List<CommerceConfigData> list = this.commerceConfigDataList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
            if (commerceConfigData.type == 4) {
                return commerceConfigData.itemCommentEggGroup;
            }
        }
        return null;
    }

    public ItemLikeEggData getCommerceAdLikeDigg() {
        List<CommerceConfigData> list = this.commerceConfigDataList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
            if (commerceConfigData.type == 1 && commerceConfigData.itemLikeEggData != null) {
                return commerceConfigData.itemLikeEggData;
            }
        }
        return null;
    }

    public UrlModel getDynamicPreferredCover() {
        Video video2 = this.video;
        if (video2 == null) {
            List<ImageInfo> list = this.imageInfos;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return this.imageInfos.get(0).labelThumb;
        } else if (video2.dynamicCover != null) {
            return this.video.dynamicCover;
        } else {
            if (this.video.cover != null) {
                return this.video.cover;
            }
            return null;
        }
    }

    public String getFirstPlayAddr() {
        VideoUrlModel properPlayAddr;
        Video video2 = this.video;
        if (video2 == null || (properPlayAddr = video2.getProperPlayAddr()) == null || ip.a(properPlayAddr.getUrlList())) {
            return null;
        }
        return properPlayAddr.getUrlList().get(0);
    }

    public String getForwardUserId() {
        if (ip.a(this.textExtra)) {
            return "";
        }
        for (TextExtraStruct textExtraStruct : this.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return textExtraStruct.getUserId();
            }
        }
        return "";
    }

    public String getFromGroupId() {
        if (getAwemeType() != 13) {
            return getAid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAid();
        }
        return getForwardItemId();
    }

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            RoomFeedCellStruct roomFeedCellStruct = this.mRoomFeedCellStruct;
            if (roomFeedCellStruct != null && roomFeedCellStruct.getNewLiveRoomData() != null) {
                return this.mRoomFeedCellStruct.getNewLiveRoomData();
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct == null) {
                return null;
            }
            newLiveRoomStruct.init();
            return this.newLiveRoomData.roomStructConstructor();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean isDouDiscountAweme() {
        HotSearchInfo hotSearchInfo2 = this.douDiscountMixInfo;
        if (hotSearchInfo2 == null || hotSearchInfo2.getValue() <= 0 || TextUtils.isEmpty(this.douDiscountMixInfo.getSentence()) || TextUtils.isEmpty(this.douDiscountMixInfo.getId())) {
            return false;
        }
        return true;
    }

    public String getGiphyGifIds() {
        String str;
        StringBuilder sb = new StringBuilder();
        List<GreenScreenMaterial> list = this.greenScreenMaterialList;
        if (list == null) {
            return sb.toString();
        }
        for (GreenScreenMaterial greenScreenMaterial : list) {
            if (greenScreenMaterial.getType() == 3 && !sb.toString().contains(greenScreenMaterial.getResId())) {
                if (sb.length() == 0) {
                    str = "";
                } else {
                    str = ",";
                }
                sb.append(str).append(greenScreenMaterial.getResId());
            }
        }
        return sb.toString();
    }

    public List<e> getPromotions() {
        ArrayList arrayList;
        List<e> list = this.simplePromotions;
        if (list != null) {
            return list;
        }
        AnchorInfo anchorInfo2 = this.anchorInfo;
        if (anchorInfo2 == null || anchorInfo2.getType() == null || this.anchorInfo.getType().intValue() != 3 || TextUtils.isEmpty(this.anchorInfo.getExtra())) {
            this.simplePromotions = new ArrayList();
        } else {
            try {
                e[] eVarArr = (e[]) new f().a(this.anchorInfo.getExtra(), e[].class);
                if (eVarArr == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(Arrays.asList(eVarArr));
                }
                this.simplePromotions = arrayList;
            } catch (Exception unused) {
                this.simplePromotions = new ArrayList();
            }
        }
        return this.simplePromotions;
    }

    public void convertChallengeToHashTag() {
        Challenge challenge;
        String desc2;
        List<Challenge> challengeList2 = getChallengeList();
        if (!(challengeList2 == null || challengeList2.isEmpty() || (challenge = challengeList2.get(0)) == null || TextUtils.isEmpty(challenge.getChallengeName()))) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(challenge.getChallengeName());
            sb.append(" ");
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setHashTagName(challenge.getChallengeName());
            textExtraStruct.setStart(0);
            textExtraStruct.setCid(challenge.getCid());
            textExtraStruct.setEnd(sb.length());
            if (getDesc() == null) {
                desc2 = "";
            } else {
                desc2 = getDesc();
            }
            if (!desc2.contains("#" + challenge.getChallengeName())) {
                sb.append(getDesc());
                setDesc(sb.toString());
                int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                List<TextExtraStruct> textExtra2 = getTextExtra();
                if (textExtra2 != null) {
                    for (TextExtraStruct textExtraStruct2 : getTextExtra()) {
                        textExtraStruct2.setStart(textExtraStruct2.getStart() + end);
                        textExtraStruct2.setEnd(textExtraStruct2.getEnd() + end);
                    }
                } else {
                    textExtra2 = new ArrayList<>();
                    setTextExtra(textExtra2);
                }
                textExtra2.add(textExtraStruct);
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.challengeList);
        String valueOf2 = String.valueOf(this.greenScreenMaterialList);
        String valueOf3 = String.valueOf(this.textExtra);
        String valueOf4 = String.valueOf(this.videoLabels);
        return "Aweme{aid='" + this.aid + '\'' + ", desc='" + this.desc + '\'' + ", createTime=" + this.createTime + ", author=" + this.author + ", music=" + this.music + ", challengeList=" + valueOf + ", greenScreenMaterialList=" + valueOf2 + ", video=" + this.video + ", audio=" + this.audio + ", shareUrl='" + this.shareUrl + '\'' + ", userDigg=" + this.userDigg + ", statistics=" + this.statistics + ", status=" + this.status + ", extra='" + this.extra + '\'' + ", rate=" + this.rate + ", shareInfo=" + this.shareInfo + ", labelLarge=" + this.labelLarge + ", labelThumb=" + this.labelThumb + ", textExtra=" + valueOf3 + ", isTop=" + this.isTop + ", labelTop=" + this.labelTop + ", originalPos=" + this.originalPos + ", isAd=" + this.isAd + ", awemeType=" + this.awemeType + ", awemeRawAd=" + this.awemeRawAd + ", specialSticker=" + this.specialSticker + ", videoLabels=" + valueOf4 + ", cmtSwt=" + this.cmtSwt + ", adSchedule=" + this.adSchedule + ", simplePromotions=" + String.valueOf(this.simplePromotions) + ", region=" + this.region + ", recommendCardType=" + this.recommendCardType + '}';
    }

    @Override // java.lang.Object
    public Aweme clone() {
        AwemeStatistics clone;
        Aweme aweme = new Aweme();
        aweme.aid = this.aid;
        aweme.commerceConfigDataList = this.commerceConfigDataList;
        aweme.starAtlasOrderId = this.starAtlasOrderId;
        aweme.tcmInfo = this.tcmInfo;
        aweme.desc = this.desc;
        aweme.createTime = this.createTime;
        aweme.author = this.author;
        aweme.music = this.music;
        aweme.challengeList = this.challengeList;
        aweme.greenScreenMaterialList = this.greenScreenMaterialList;
        aweme.video = this.video;
        aweme.audio = this.audio;
        aweme.longVideos = this.longVideos;
        aweme.shareUrl = this.shareUrl;
        aweme.userDigg = this.userDigg;
        AwemeStatistics awemeStatistics = this.statistics;
        AwemeStatus awemeStatus = null;
        if (awemeStatistics == null) {
            clone = null;
        } else {
            clone = awemeStatistics.clone();
        }
        aweme.statistics = clone;
        AwemeStatus awemeStatus2 = this.status;
        if (awemeStatus2 != null) {
            awemeStatus = awemeStatus2.clone();
        }
        aweme.status = awemeStatus;
        aweme.reactFrom = this.reactFrom;
        aweme.reactOrigin = this.reactOrigin;
        aweme.reactView = this.reactView;
        aweme.commerceStickerInfo = this.commerceStickerInfo;
        aweme.videoControl = this.videoControl;
        aweme.distributeType = this.distributeType;
        aweme.extra = this.extra;
        aweme.rate = this.rate;
        aweme.shareInfo = this.shareInfo;
        aweme.textVideoLabels = this.textVideoLabels;
        aweme.textTopLabels = this.textTopLabels;
        aweme.videoLabels = this.videoLabels;
        aweme.isHashTag = this.isHashTag;
        aweme.awemeType = this.awemeType;
        aweme.adAwemeSource = this.adAwemeSource;
        aweme.awemeRawAd = this.awemeRawAd;
        aweme.specialSticker = this.specialSticker;
        aweme.relationLabel = this.relationLabel;
        aweme.cmtSwt = this.cmtSwt;
        aweme.streamUrlModel = this.streamUrlModel;
        aweme.title = this.title;
        aweme.isPgcShow = this.isPgcShow;
        aweme.imageInfos = this.imageInfos;
        aweme.awemeRiskModel = this.awemeRiskModel;
        aweme.bottomBarModel = this.bottomBarModel;
        aweme.descendantsModel = this.descendantsModel;
        aweme.collectStatus = this.collectStatus;
        aweme.scenario = this.scenario;
        aweme.lawCriticalCountry = this.lawCriticalCountry;
        aweme.canPlay = this.canPlay;
        aweme.commentSetting = this.commentSetting;
        aweme.reactSetting = this.reactSetting;
        aweme.duetSetting = this.duetSetting;
        aweme.stitchSetting = this.stitchSetting;
        aweme.simplePromotions = this.simplePromotions;
        aweme.activityPendant = this.activityPendant;
        aweme.interactPermission = this.interactPermission;
        aweme.promotionOtherInfo = this.promotionOtherInfo;
        aweme.position = this.position;
        aweme.uniqidPosition = this.uniqidPosition;
        aweme.nicknamePosition = this.nicknamePosition;
        aweme.room = this.room;
        aweme.deduplicationType = this.deduplicationType;
        aweme.stickerIDs = this.stickerIDs;
        aweme.uploadMiscInfoStructStr = this.uploadMiscInfoStructStr;
        aweme.takeDownReason = this.takeDownReason;
        aweme.takeDownDesc = this.takeDownDesc;
        aweme.forwardItem = this.forwardItem;
        aweme.forwardItemId = this.forwardItemId;
        aweme.forwardCommentId = this.forwardCommentId;
        aweme.preForwardId = this.preForwardId;
        aweme.preventDownload = this.preventDownload;
        aweme.region = this.region;
        aweme.microAppInfo = this.microAppInfo;
        aweme.gameInfo = this.gameInfo;
        aweme.isProhibited = this.isProhibited;
        aweme.hotSearchInfo = this.hotSearchInfo;
        aweme.hotListStruct = this.hotListStruct;
        aweme.downloadWithoutWatermark = this.downloadWithoutWatermark;
        aweme.linkAdData = this.linkAdData;
        aweme.adLinkType = this.adLinkType;
        aweme.isCanCache = this.isCanCache;
        aweme.hasAd = this.hasAd;
        aweme.isPreloadScroll = this.isPreloadScroll;
        aweme.isFakeResponse = this.isFakeResponse;
        aweme.repostFromGroupId = this.repostFromGroupId;
        aweme.repostFromUserId = this.repostFromUserId;
        aweme.date = this.date;
        aweme.labelLarge = this.labelLarge;
        aweme.labelPrivate = this.labelPrivate;
        aweme.labelThumb = this.labelThumb;
        aweme.textExtra = this.textExtra;
        aweme.isTop = this.isTop;
        aweme.labelTop = this.labelTop;
        aweme.originAuthor = this.originAuthor;
        aweme.musicStarter = this.musicStarter;
        aweme.mLabelOriginAuthorText = this.mLabelOriginAuthorText;
        aweme.mLabelMusicStarterText = this.mLabelMusicStarterText;
        aweme.originalPos = this.originalPos;
        aweme.distance = this.distance;
        aweme.landingPage = this.landingPage;
        aweme.isAd = this.isAd;
        aweme.isVr = this.isVr;
        aweme.isRelieve = this.isRelieve;
        aweme.adSchedule = this.adSchedule;
        aweme.preload = this.preload;
        aweme.feedCount = this.feedCount;
        aweme.isEffectDesigner = this.isEffectDesigner;
        aweme.withPromotionalMusic = this.withPromotionalMusic;
        aweme.stickerEntranceInfo = this.stickerEntranceInfo;
        aweme.anchors = this.anchors;
        aweme.interactStickerStructs = this.interactStickerStructs;
        aweme.descLanguage = this.descLanguage;
        aweme.floatingCardInfo = this.floatingCardInfo;
        aweme.originCommentIds = this.originCommentIds;
        aweme.requestId = this.requestId;
        aweme.uniqueId = this.uniqueId;
        aweme.awemePosition = this.awemePosition;
        aweme.mConcatAndUploadState = this.mConcatAndUploadState;
        aweme.awemeControl = this.awemeControl;
        aweme.hasVisionSearchEntry = this.hasVisionSearchEntry;
        aweme.anchor = this.anchor;
        aweme.anchorsExtras = this.anchorsExtras;
        aweme.mCommerceVideoAuthInfo = this.mCommerceVideoAuthInfo;
        aweme.isPreview = this.isPreview;
        aweme.isClientCache = this.isClientCache;
        aweme.nearbyHotLabel = this.nearbyHotLabel;
        aweme.videoReplyStruct = this.videoReplyStruct;
        aweme.linkMatch = this.linkMatch;
        aweme.liveWindowShowTime = this.liveWindowShowTime;
        aweme.hybridLabels = this.hybridLabels;
        aweme.mutualRelation = this.mutualRelation;
        aweme.newLiveRoomData = this.newLiveRoomData;
        aweme.relationRecommendInfo = this.relationRecommendInfo;
        aweme.recommendCardType = this.recommendCardType;
        aweme.withSurvey = this.withSurvey;
        aweme.isLiveReplay = this.isLiveReplay;
        aweme.geofencingRegions = this.geofencingRegions;
        aweme.haveDashboard = this.haveDashboard;
        aweme.groupId = this.groupId;
        aweme.hasPromoteEntry = this.hasPromoteEntry;
        aweme.promoteToastKey = this.promoteToastKey;
        aweme.promoteToast = this.promoteToast;
        aweme.videoMaskInfo = this.videoMaskInfo;
        aweme.videoMaskInfos = this.videoMaskInfos;
        aweme.generalMaskInfo = this.generalMaskInfo;
        aweme.reportMaskInfo = this.reportMaskInfo;
        aweme.photosensitiveMaskInfo = this.photosensitiveMaskInfo;
        aweme.anchorWikiOfflineText = this.anchorWikiOfflineText;
        aweme.bubbleInfo = this.bubbleInfo;
        aweme.allowGift = this.allowGift;
        aweme.userStory = UserStoryKt.copyUserStory(this.userStory);
        aweme.story = StoryKt.copyStory(this.story);
        aweme.scheduleId = this.scheduleId;
        aweme.isStoryFakeAweme = this.isStoryFakeAweme;
        aweme.contentDesc = this.contentDesc;
        aweme.contentDescExtra = this.contentDescExtra;
        aweme.productsInfo = this.productsInfo;
        aweme.productsCount = this.productsCount;
        return aweme;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(int i2) {
        this.adAwemeSource = i2;
    }

    public void setAdDescHandle(boolean z) {
        this.adDescHandle = z;
    }

    public void setAdDescMaxLines(int i2) {
        this.adDescMaxLines = i2;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAnchor(Anchor anchor2) {
        this.anchor = anchor2;
    }

    public void setAnchorCustomData(AnchorCustomData anchorCustomData2) {
        this.anchorCustomData = anchorCustomData2;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo2) {
        this.anchorInfo = anchorInfo2;
    }

    public void setAnchorType(int i2) {
        this.anchorType = i2;
    }

    public void setAnchorWikiOfflineText(String str) {
        this.anchorWikiOfflineText = str;
    }

    public void setAnchors(List<AnchorCommonStruct> list) {
        this.anchors = list;
    }

    public void setAnchorsExtras(String str) {
        this.anchorsExtras = str;
    }

    public void setAudio(Audio audio2) {
        this.audio = audio2;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setAwemeControl(AwemeControl awemeControl2) {
        this.awemeControl = awemeControl2;
    }

    public void setAwemePosition(int i2) {
        this.awemePosition = i2;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel2) {
        this.awemeRiskModel = awemeRiskModel2;
    }

    public void setAwemeType(int i2) {
        this.awemeType = i2;
    }

    public void setBannerTip(BannerTip bannerTip2) {
        this.bannerTip = bannerTip2;
    }

    public void setBoost(Boost boost2) {
        this.boost = boost2;
    }

    public void setBottomBarModel(BottomBarModel bottomBarModel2) {
        this.bottomBarModel = bottomBarModel2;
    }

    public void setBubbleInfo(AwemeBubbleInfo awemeBubbleInfo) {
        this.bubbleInfo = awemeBubbleInfo;
    }

    public void setCanCache(boolean z) {
        this.isCanCache = z;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setCaptionLength(int i2) {
        this.captionLength = i2;
    }

    public void setCaptionReturnCount(int i2) {
        this.captionReturnCount = i2;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setClientCache(boolean z) {
        this.isClientCache = z;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollectStatus(int i2) {
        this.collectStatus = i2;
    }

    public void setCommentSetting(int i2) {
        this.commentSetting = i2;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceStickerInfo(u uVar) {
        this.commerceStickerInfo = uVar;
    }

    public void setCommerceVideoAuthInfo(a aVar) {
        this.mCommerceVideoAuthInfo = aVar;
    }

    public void setConcatAndUploadState(int i2) {
        this.mConcatAndUploadState = i2;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDate(long j2) {
        this.date = j2;
    }

    public void setDeduplicationType(int i2) {
        this.deduplicationType = i2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescFullTextHeight(int i2) {
        this.descFullTextHeight = i2;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescLines(int i2) {
        this.descLines = i2;
    }

    public void setDescTruncatedTextHeight(int i2) {
        this.descTruncatedTextHeight = i2;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel2) {
        this.descendantsModel = descendantsModel2;
    }

    public void setDisableSearchTrendingBar(boolean z) {
        this.disableSearchTrendingBar = z;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i2) {
        this.distributeType = i2;
    }

    public void setDouDiscountLabel(String str) {
        this.douDiscountLabel = str;
    }

    public void setDouDiscountMixInfo(HotSearchInfo hotSearchInfo2) {
        this.douDiscountMixInfo = hotSearchInfo2;
    }

    public void setDuetSetting(int i2) {
        this.duetSetting = i2;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setEllipsizeTransDesc(CharSequence charSequence) {
        this.ellipsizeTransDesc = charSequence;
    }

    public void setEnableAdDrop(boolean z) {
        this.enableAdDrop = z;
    }

    public void setEnablePosAdjust(boolean z) {
        this.enablePosAdjust = z;
    }

    public void setExposeSharer(ExposeSharer exposeSharer2) {
        this.exposeSharer = exposeSharer2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFakeAid(String str) {
        this.fakeAid = str;
    }

    public void setFakeResponse(boolean z) {
        this.isFakeResponse = z;
    }

    public void setFamiliar(boolean z) {
        this.isFamiliar = z;
    }

    public void setFamiliarRecommendUser(List<User> list) {
        this.familiarRecommendUser = list;
    }

    public Aweme setFantasy(boolean z) {
        this.isFantasy = z;
        return this;
    }

    public void setFeedCount(long j2) {
        this.feedCount = j2;
    }

    public void setFeedRelationLabel(RelationLabelNew relationLabelNew) {
        this.feedRelationLabel = relationLabelNew;
    }

    public void setFirstInSpot(boolean z) {
        this.isFirstInSpot = z;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo2) {
        this.floatingCardInfo = floatingCardInfo2;
    }

    public void setFollowUpPublishFromId(String str) {
        this.followUpPublishFromId = str;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setFromRawChallenge(Challenge challenge) {
        this.fromRawChallenge = challenge;
    }

    public void setFromSplitData(boolean z) {
        this.isFromSplitData = z;
    }

    public void setFromTrendingCard(String str) {
        this.isFromTrendingCard = str;
    }

    public void setFullTransTextHeight(int i2) {
        this.fullTransTextHeight = i2;
    }

    public void setGameInfo(GameInfo gameInfo2) {
        this.gameInfo = gameInfo2;
    }

    public void setGapList(List<Integer> list) {
        this.gapList = list;
    }

    public void setGeneralMaskInfo(VideoMaskInfo videoMaskInfo2) {
        this.generalMaskInfo = videoMaskInfo2;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setHasAd(int i2) {
        this.hasAd = i2;
    }

    public void setHasPromoteEntry(int i2) {
        this.hasPromoteEntry = i2;
    }

    public void setHasVisionSearchEntry(boolean z) {
        this.hasVisionSearchEntry = z;
    }

    public void setHashTag(int i2) {
        this.isHashTag = i2;
    }

    public void setHaveDashboard(boolean z) {
        this.haveDashboard = z;
    }

    public void setHighlightInfoList(List<com.ss.android.ugc.aweme.search.d> list) {
        this.mHighlightInfoList = list;
    }

    public void setHighlighted(boolean z) {
        this.isHighlighted = z;
    }

    public Aweme setHotListStruct(HotListStruct hotListStruct2) {
        this.hotListStruct = hotListStruct2;
        return this;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo2) {
        this.hotSearchInfo = hotSearchInfo2;
    }

    public Aweme setHotSearchInfoStruct(HotSearchInfoStruct hotSearchInfoStruct2) {
        this.hotSearchInfoStruct = hotSearchInfoStruct2;
        return this;
    }

    public Aweme setHotSpot(String str) {
        this.hotSpot = str;
        return this;
    }

    public void setHybridLabels(List<AwemeHybridLabelModel> list) {
        this.hybridLabels = list;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractPermission(InteractPermission interactPermission2) {
        this.interactPermission = interactPermission2;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setInteractionTagInfo(InteractionTagInfo interactionTagInfo2) {
        this.interactionTagInfo = interactionTagInfo2;
    }

    public void setIsFromDouPlusGuideAnimate(boolean z) {
        this.isFromDouPlusGuideAnimate = z;
    }

    public void setIsPreloadScroll(boolean z) {
        this.isPreloadScroll = z;
    }

    public void setIsTop(int i2) {
        this.isTop = i2;
    }

    public void setItemDistributeSource(String str) {
        this.mItemDistributeSource = str;
    }

    public void setItemSourceCategory(int i2) {
        this.mItemSourceCategory = i2;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelOriginAuthorText(String str) {
        this.mLabelOriginAuthorText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLastInSpot(boolean z) {
        this.isLastInSpot = z;
    }

    public void setLawCriticalCountry(boolean z) {
        this.lawCriticalCountry = z;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(ac acVar) {
        this.linkAdData = acVar;
    }

    public void setLinkMatch(com.ss.android.ugc.aweme.search.c.c cVar) {
        this.linkMatch = cVar;
    }

    public void setLiveAwesomeSplashInfo(LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        this.mLiveAwesomeSplashInfo = liveAwesomeSplashInfo;
    }

    public void setLiveId(long j2) {
        this.liveId = j2;
    }

    public void setLiveReaSon(String str) {
        this.liveReaSon = str;
    }

    public void setLiveReplay(boolean z) {
        this.isLiveReplay = z;
    }

    public void setLiveType(String str) {
        this.liveType = str;
    }

    public void setLiveWindowShowTime(long j2) {
        this.liveWindowShowTime = j2;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setMatchText(String str) {
        this.matchText = str;
    }

    public void setMatchType(int i2) {
        this.matchType = i2;
    }

    public void setMicroAppInfo(com.ss.android.ugc.aweme.miniapp_api.model.b bVar) {
        this.microAppInfo = bVar;
    }

    public void setMixInfo(MixStruct mixStruct) {
        this.mixInfo = mixStruct;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setMutualRelation(MutualStruct mutualStruct) {
        this.mutualRelation = mutualStruct;
    }

    public void setNearbyHotLabel(String str) {
        this.nearbyHotLabel = str;
    }

    public void setNeedVisionSearchEntry(boolean z) {
        this.needVisionSearchEntry = z;
    }

    public void setNewRelationLabel(List<RelationLabelNew> list) {
        this.mNewRelationLabel = list;
    }

    public void setNewSourceId(String str) {
        this.newSourceId = str;
    }

    public void setNewSourceType(String str) {
        this.newSourceType = str;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginalPos(int i2) {
        this.originalPos = i2;
    }

    public void setParentHotSpot(String str) {
        this.parentHotSpot = str;
    }

    public void setPartN(String str) {
        this.partN = str;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPhotosensitiveMaskInfo(VideoMaskInfo videoMaskInfo2) {
        this.photosensitiveMaskInfo = videoMaskInfo2;
    }

    public void setPlaylistBlocked(boolean z) {
        this.playlistBlocked = z;
    }

    public void setPlaylist_info(PlayListInfo playListInfo) {
        this.playlist_info = playListInfo;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPredPlaytime(int i2) {
        this.predPlaytime = i2;
    }

    public void setPreload(Preload preload2) {
        this.preload = preload2;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setProductsCount(int i2) {
        this.productsCount = i2;
    }

    public void setProductsInfo(List<com.ss.android.ugc.aweme.search.ecom.a.a> list) {
        this.productsInfo = list;
    }

    public void setPromoteToast(String str) {
        this.promoteToast = str;
    }

    public void setPromoteToastKey(String str) {
        this.promoteToastKey = str;
    }

    public void setPromotionOtherInfo(com.ss.android.ugc.aweme.commerce.model.d dVar) {
        this.promotionOtherInfo = dVar;
    }

    public void setRank(int i2) {
        this.mRank = i2;
    }

    public void setRate(int i2) {
        this.rate = i2;
    }

    public void setRateScore(String str) {
        this.rateScore = str;
    }

    public void setReactFrom(String str) {
        this.reactFrom = str;
    }

    public void setReactOrigin(String str) {
        this.reactOrigin = str;
    }

    public void setReactSetting(int i2) {
        this.reactSetting = i2;
    }

    public void setReactView(String str) {
        this.reactView = str;
    }

    public void setRecommendCardType(int i2) {
        this.recommendCardType = i2;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelationRecommendInfo(AwemeRelationRecommendModel awemeRelationRecommendModel) {
        this.relationRecommendInfo = awemeRelationRecommendModel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setReportMaskInfo(VideoMaskInfo videoMaskInfo2) {
        this.reportMaskInfo = videoMaskInfo2;
    }

    public void setRepostFromGroupId(String str) {
        this.repostFromGroupId = str;
    }

    public void setRepostFromUserId(String str) {
        this.repostFromUserId = str;
    }

    public void setReversionForwardAweme(boolean z) {
        this.isReversionForwardAweme = z;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setRoomFeedCellStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.mRoomFeedCellStruct = roomFeedCellStruct;
    }

    public void setScenario(int i2) {
        this.scenario = i2;
    }

    public void setScheduleId(String str) {
        this.scheduleId = str;
    }

    public void setSearchExtraStruct(SearchExtraStruct searchExtraStruct2) {
        this.searchExtraStruct = searchExtraStruct2;
    }

    public void setSearchFeedType(String str) {
        this.searchFeedType = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSpecialSticker(SpecialSticker specialSticker2) {
        this.specialSticker = specialSticker2;
    }

    public void setStarAtlasOrderId(long j2) {
        this.starAtlasOrderId = j2;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(g gVar) {
        this.stickerEntranceInfo = gVar;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStitchSetting(int i2) {
        this.stitchSetting = i2;
    }

    public void setStory(Story story2) {
        this.story = story2;
    }

    public void setStoryFakeAweme(boolean z) {
        this.isStoryFakeAweme = z;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel2) {
        this.streamUrlModel = streamUrlModel2;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i2) {
        this.takeDownReason = i2;
    }

    public void setTcmInfo(TCMInfo tCMInfo) {
        this.tcmInfo = tCMInfo;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotalProductAnchors(int i2) {
        this.totalProductAnchors = i2;
    }

    public void setTransDesc(CharSequence charSequence) {
        this.transDesc = charSequence;
    }

    public void setTransDescLines(int i2) {
        this.transDescLines = i2;
    }

    public void setTrendingBar(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBar = awemeTrendingBar;
    }

    public void setTrendingBarFYP(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBarFYP = awemeTrendingBar;
    }

    public void setTrendingId(String str) {
        this.trendingId = str;
    }

    public void setTrendingName(String str) {
        this.trendingName = str;
    }

    public void setTruncatedTransTextHeight(int i2) {
        this.truncatedTransTextHeight = i2;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUpvoteReason(UpvoteReason upvoteReason2) {
        this.upvoteReason = upvoteReason2;
    }

    public void setUserDigg(int i2) {
        this.userDigg = i2;
    }

    public void setUserProfileInitInfo(UserProfileInitInfo userProfileInitInfo2) {
        this.userProfileInitInfo = userProfileInitInfo2;
    }

    public void setUserStory(UserStory userStory2) {
        this.userStory = userStory2;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }

    public void setVideoFeedTag(String str) {
        this.videoFeedTag = str;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setVideoMaskInfo(VideoMaskInfo videoMaskInfo2) {
        this.videoMaskInfo = videoMaskInfo2;
    }

    public void setVideoMaskInfos(List<VideoMaskInfo> list) {
        this.videoMaskInfos = list;
    }

    public void setVideoReplyStruct(VideoReplyStruct videoReplyStruct2) {
        this.videoReplyStruct = videoReplyStruct2;
    }

    public void setWithPromotionalMusic(boolean z) {
        this.withPromotionalMusic = z;
    }

    public void setWithSurvey(boolean z) {
        this.withSurvey = z;
    }

    public static Aweme newDateSection(long j2) {
        Aweme aweme = new Aweme();
        aweme.setAid("");
        aweme.setDate(j2);
        return aweme;
    }

    public void setEllipsizeDesc(CharSequence charSequence) {
        if (charSequence == null) {
            this.ellipsizeDesc = null;
        } else {
            this.ellipsizeDesc = new WeakReference<>(charSequence);
        }
    }

    public void setProcessedDesc(CharSequence charSequence) {
        if (this.ellipsizeDesc == null) {
            this.processedDesc = null;
        } else {
            this.processedDesc = new WeakReference<>(charSequence);
        }
    }

    public void setNewLiveRoomDataStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.newLiveRoomData = (NewLiveRoomStruct) com.ss.android.ugc.aweme.live.b.a().a(str, NewLiveRoomStruct.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        Aweme aweme;
        this.requestId = str;
        buildUniqueId();
        if (isForwardAweme() && (aweme = this.forwardItem) != null) {
            aweme.setRequestId(str);
        }
        User user = this.author;
        if (user != null) {
            user.setRequestId(str);
        }
    }

    public void setVr(boolean z) {
        this.isVr = z;
        Video video2 = this.video;
        if (video2 != null) {
            setVr(video2.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrBytevc1(), z);
        }
    }

    public static boolean containsGreenScreenGiphyAnchor(List<AnchorCommonStruct> list) {
        if (list != null && !list.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (isGreenScreenGiphyAnchor(anchorCommonStruct)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isGreenScreenGiphyAnchor(AnchorCommonStruct anchorCommonStruct) {
        if (!(anchorCommonStruct == null || anchorCommonStruct.getType() != 28 || anchorCommonStruct.getExtra() == null)) {
            try {
                if (new JSONObject(anchorCommonStruct.getExtra()).optInt("green_screen_materials_type") == 3) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public List<String> getRawAdPlayNodeTrackUrlList(int i2) {
        if (getAwemeRawAd() == null) {
            return null;
        }
        List<k> adNodeTrackUrlList = getAwemeRawAd().getAdNodeTrackUrlList();
        if (ip.a(adNodeTrackUrlList)) {
            return null;
        }
        for (k kVar : adNodeTrackUrlList) {
            if (kVar.percent == i2) {
                return kVar.urlList;
            }
        }
        return null;
    }

    public void updateSameAweme(Aweme aweme) {
        if (aweme != null) {
            String str = aweme.aid;
            String str2 = this.aid;
            l.d(str2, "");
            if ((ip.a(str) && ip.a(str2)) || (str != null && l.a((Object) str, (Object) str2))) {
                update(aweme);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aweme)) {
            return false;
        }
        Aweme aweme = (Aweme) obj;
        if (!canUseUniqueId() ? TextUtils.equals(this.aid, aweme.aid) : TextUtils.equals(getUniqueId(), aweme.getUniqueId())) {
            if (this.userDigg != aweme.userDigg || !com.ss.android.ugc.aweme.base.utils.g.a(this.status, aweme.status) || !com.ss.android.ugc.aweme.base.utils.g.a(this.statistics, aweme.statistics) || !com.ss.android.ugc.aweme.base.utils.g.a(this.userStory, aweme.userStory) || !com.ss.android.ugc.aweme.base.utils.g.a(this.productsInfo, aweme.productsInfo) || !com.ss.android.ugc.aweme.base.utils.g.a(Integer.valueOf(this.productsCount), Integer.valueOf(aweme.productsCount))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void update(Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (aweme != null) {
            if (TextUtils.isEmpty(aweme.aid)) {
                str = this.aid;
            } else {
                str = aweme.aid;
            }
            this.aid = str;
            String str6 = aweme.desc;
            if (str6 == null) {
                str6 = this.desc;
            }
            this.desc = str6;
            AnchorInfo anchorInfo2 = aweme.anchorInfo;
            if (anchorInfo2 == null) {
                anchorInfo2 = this.anchorInfo;
            }
            this.anchorInfo = anchorInfo2;
            long j2 = aweme.createTime;
            if (j2 == 0) {
                j2 = this.createTime;
            }
            this.createTime = j2;
            this.anchorsExtras = aweme.getAnchorsExtras();
            int i2 = 0;
            String str7 = null;
            User user = this.author;
            if (user != null) {
                i2 = user.getFollowerCount();
                str7 = this.author.getSocialInfo();
            }
            User user2 = aweme.author;
            if (user2 == null) {
                user2 = this.author;
            }
            this.author = user2;
            if (user2 != null && user2.getFollowerCount() == 0 && i2 > 0) {
                this.author.setFollowerCount(i2);
            }
            User user3 = this.author;
            if (user3 != null && TextUtils.isEmpty(user3.getSocialInfo()) && !TextUtils.isEmpty(str7)) {
                this.author.setSocialInfo(str7);
            }
            List<CommerceConfigData> list = aweme.commerceConfigDataList;
            if (list != null && !list.isEmpty()) {
                this.commerceConfigDataList = aweme.commerceConfigDataList;
            }
            if (TextUtils.isEmpty(aweme.shareUrl)) {
                str2 = this.shareUrl;
            } else {
                str2 = aweme.shareUrl;
            }
            this.shareUrl = str2;
            this.userDigg = aweme.userDigg;
            this.statistics = aweme.statistics;
            AwemeStatus awemeStatus = aweme.status;
            if (awemeStatus == null) {
                awemeStatus = this.status;
            }
            this.status = awemeStatus;
            List<Challenge> list2 = aweme.challengeList;
            if (list2 == null) {
                list2 = this.challengeList;
            }
            this.challengeList = list2;
            List<GreenScreenMaterial> list3 = aweme.greenScreenMaterialList;
            if (list3 == null) {
                list3 = this.greenScreenMaterialList;
            }
            this.greenScreenMaterialList = list3;
            Music music2 = aweme.music;
            if (music2 == null) {
                music2 = this.music;
            }
            this.music = music2;
            Video video2 = aweme.video;
            if (video2 == null) {
                video2 = this.video;
            }
            this.video = video2;
            Audio audio2 = aweme.audio;
            if (audio2 == null) {
                audio2 = this.audio;
            }
            this.audio = audio2;
            if (TextUtils.isEmpty(aweme.extra)) {
                str3 = this.extra;
            } else {
                str3 = aweme.extra;
            }
            this.extra = str3;
            if (TextUtils.isEmpty(aweme.douDiscountLabel)) {
                str4 = this.douDiscountLabel;
            } else {
                str4 = aweme.douDiscountLabel;
            }
            this.douDiscountLabel = str4;
            HotSearchInfo hotSearchInfo2 = aweme.douDiscountMixInfo;
            if (hotSearchInfo2 == null) {
                hotSearchInfo2 = this.douDiscountMixInfo;
            }
            this.douDiscountMixInfo = hotSearchInfo2;
            List<TextExtraStruct> list4 = aweme.textExtra;
            if (list4 == null) {
                list4 = this.textExtra;
            }
            this.textExtra = list4;
            this.rate = aweme.rate;
            this.starAtlasOrderId = aweme.starAtlasOrderId;
            this.tcmInfo = aweme.tcmInfo;
            this.isFantasy = aweme.isFantasy;
            this.labelTop = aweme.labelTop;
            this.labelLarge = aweme.labelLarge;
            this.labelThumb = aweme.labelThumb;
            this.shareInfo = aweme.shareInfo;
            this.originAuthor = aweme.originAuthor;
            this.musicStarter = aweme.musicStarter;
            this.mLabelMusicStarterText = aweme.mLabelMusicStarterText;
            this.mLabelOriginAuthorText = aweme.mLabelOriginAuthorText;
            this.isHashTag = aweme.isHashTag;
            this.videoLabels = aweme.videoLabels;
            this.isAd = aweme.isAd;
            this.awemeType = aweme.awemeType;
            this.collectStatus = aweme.collectStatus;
            this.awemeRawAd = aweme.awemeRawAd;
            this.specialSticker = aweme.specialSticker;
            this.mLiveAwesomeSplashInfo = aweme.mLiveAwesomeSplashInfo;
            this.videoLabels = aweme.videoLabels;
            this.textVideoLabels = aweme.textVideoLabels;
            this.textTopLabels = aweme.textTopLabels;
            this.imageInfos = aweme.imageInfos;
            this.awemeRiskModel = aweme.awemeRiskModel;
            this.bottomBarModel = aweme.bottomBarModel;
            this.cmtSwt = aweme.cmtSwt;
            this.canPlay = aweme.canPlay;
            this.scenario = aweme.scenario;
            this.position = aweme.position;
            this.lawCriticalCountry = aweme.lawCriticalCountry;
            this.room = aweme.room;
            this.adSchedule = aweme.adSchedule;
            this.feedCount = aweme.feedCount;
            this.preventDownload = aweme.preventDownload;
            this.forwardItem = aweme.forwardItem;
            this.forwardItemId = aweme.forwardItemId;
            this.groupId = aweme.groupId;
            this.forwardCommentId = aweme.forwardCommentId;
            this.preForwardId = aweme.preForwardId;
            this.withPromotionalMusic = aweme.withPromotionalMusic;
            this.linkAdData = aweme.linkAdData;
            this.activityPendant = aweme.activityPendant;
            this.interactPermission = aweme.interactPermission;
            com.ss.android.ugc.aweme.miniapp_api.model.b bVar = aweme.microAppInfo;
            if (bVar == null) {
                bVar = this.microAppInfo;
            }
            this.microAppInfo = bVar;
            this.isReversionForwardAweme = aweme.isReversionForwardAweme;
            g gVar = aweme.stickerEntranceInfo;
            if (gVar == null) {
                gVar = this.stickerEntranceInfo;
            }
            this.stickerEntranceInfo = gVar;
            this.anchors = aweme.anchors;
            this.anchorInfo = aweme.anchorInfo;
            if (TextUtils.isEmpty(aweme.stickerIDs)) {
                str5 = this.stickerIDs;
            } else {
                str5 = aweme.stickerIDs;
            }
            this.stickerIDs = str5;
            HotListStruct hotListStruct2 = this.hotListStruct;
            if (hotListStruct2 == null || hotListStruct2.getType() != 9) {
                this.hotListStruct = aweme.hotListStruct;
            }
            List<LongVideo> list5 = aweme.longVideos;
            if (list5 == null) {
                list5 = this.longVideos;
            }
            this.longVideos = list5;
            this.takeDownReason = aweme.takeDownReason;
            this.takeDownDesc = aweme.takeDownDesc;
            this.downloadWithoutWatermark = aweme.downloadWithoutWatermark;
            if (!ip.a(aweme.interactStickerStructs)) {
                this.interactStickerStructs = aweme.interactStickerStructs;
            }
            this.originCommentIds = aweme.originCommentIds;
            this.duetSetting = aweme.duetSetting;
            this.reactSetting = aweme.reactSetting;
            this.stitchSetting = aweme.stitchSetting;
            this.isEffectDesigner = aweme.isEffectDesigner;
            this.commentSetting = aweme.commentSetting;
            VideoControl videoControl2 = aweme.videoControl;
            if (videoControl2 == null) {
                videoControl2 = this.videoControl;
            }
            this.videoControl = videoControl2;
            this.distributeType = aweme.distributeType;
            this.mixInfo = aweme.mixInfo;
            if (aweme.getMobParams() != null) {
                this.mMobParams = aweme.getMobParams();
            }
            if (!TextUtils.isEmpty(aweme.getRateScore())) {
                this.rateScore = aweme.getRateScore();
            }
            if (aweme.getCommerceVideoAuthInfo() != null) {
                this.mCommerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            }
            String str8 = aweme.uploadMiscInfoStructStr;
            this.uploadMiscInfoStructStr = str8;
            this.cacheAvUploadMiscInfoStruct = i.createStruct(str8);
            this.feedRelationLabel = aweme.feedRelationLabel;
            this.videoMaskInfo = aweme.videoMaskInfo;
            this.videoMaskInfos = aweme.videoMaskInfos;
            this.generalMaskInfo = aweme.generalMaskInfo;
            this.reportMaskInfo = aweme.reportMaskInfo;
            this.photosensitiveMaskInfo = aweme.photosensitiveMaskInfo;
            StreamUrlModel streamUrlModel2 = aweme.streamUrlModel;
            if (streamUrlModel2 == null) {
                streamUrlModel2 = this.streamUrlModel;
            }
            this.streamUrlModel = streamUrlModel2;
            String str9 = aweme.title;
            if (str9 == null) {
                str9 = this.title;
            }
            this.title = str9;
            String str10 = aweme.videoFeedTag;
            if (str10 == null) {
                str10 = this.videoFeedTag;
            }
            this.videoFeedTag = str10;
            String str11 = aweme.liveReaSon;
            if (str11 == null) {
                str11 = this.liveReaSon;
            }
            this.liveReaSon = str11;
            RoomFeedCellStruct roomFeedCellStruct = aweme.mRoomFeedCellStruct;
            if (roomFeedCellStruct == null) {
                roomFeedCellStruct = this.mRoomFeedCellStruct;
            }
            this.mRoomFeedCellStruct = roomFeedCellStruct;
            VideoReplyStruct videoReplyStruct2 = aweme.videoReplyStruct;
            if (videoReplyStruct2 == null) {
                videoReplyStruct2 = this.videoReplyStruct;
            }
            this.videoReplyStruct = videoReplyStruct2;
            this.liveWindowShowTime = aweme.liveWindowShowTime;
            com.ss.android.ugc.aweme.search.c.c cVar = aweme.linkMatch;
            if (cVar == null) {
                cVar = this.linkMatch;
            }
            this.linkMatch = cVar;
            NewLiveRoomStruct newLiveRoomStruct = aweme.newLiveRoomData;
            if (newLiveRoomStruct == null) {
                newLiveRoomStruct = this.newLiveRoomData;
            }
            this.newLiveRoomData = newLiveRoomStruct;
            this.hybridLabels = aweme.hybridLabels;
            String str12 = aweme.distance;
            if (str12 == null) {
                str12 = this.distance;
            }
            this.distance = str12;
            this.withSurvey = aweme.withSurvey;
            UserProfileInitInfo userProfileInitInfo2 = aweme.userProfileInitInfo;
            if (userProfileInitInfo2 == null) {
                userProfileInitInfo2 = this.userProfileInitInfo;
            }
            this.userProfileInitInfo = userProfileInitInfo2;
            this.recommendCardType = aweme.recommendCardType;
            this.isLiveReplay = aweme.isLiveReplay;
            this.haveDashboard = aweme.haveDashboard;
            List<String> list6 = aweme.geofencingRegions;
            if (list6 != null && !list6.isEmpty()) {
                this.geofencingRegions = aweme.geofencingRegions;
            }
            this.isFamiliar = aweme.isFamiliar;
            this.mNewRelationLabel = aweme.mNewRelationLabel;
            this.feedRelationLabel = aweme.feedRelationLabel;
            this.bubbleInfo = aweme.bubbleInfo;
            this.exposeSharer = aweme.getExposeSharer();
            this.hasPromoteEntry = aweme.getHasPromoteEntry();
            this.promoteToastKey = aweme.getPromoteToastKey();
            this.promoteToast = aweme.getPromoteToast();
            this.awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            this.anchorWikiOfflineText = aweme.anchorWikiOfflineText;
            this.scheduleTime = aweme.scheduleTime;
            this.playlist_info = aweme.playlist_info;
            this.allowGift = aweme.getAllowGift();
            this.story = aweme.story;
            this.contentDesc = aweme.contentDesc;
            this.contentDescExtra = aweme.contentDescExtra;
            this.followUpPublishFromId = aweme.followUpPublishFromId;
        }
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }

    public void appendMobParam(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.mMobParams == null) {
                this.mMobParams = new HashMap<>();
            }
            this.mMobParams.put(str, str2);
        }
    }
}
