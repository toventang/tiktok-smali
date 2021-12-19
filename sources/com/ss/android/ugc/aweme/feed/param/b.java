package com.ss.android.ugc.aweme.feed.param;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class b implements Serializable {
    private static final long serialVersionUID = -613452965802915546L;
    private String accountType;
    private String activityId;
    private String adReportReason;
    private String adReportReasonType;
    private String advId;
    private String aid;
    private AnchorCustomData anchorCustomData;
    private String authorName;
    private List<String> blueDotList;
    private String carrierType;
    private String categoryName;
    private int cellDetailType;
    private String cellId;
    private String challengeId;
    private String challengeProfileFrom;
    private int channelId;
    private String cid;
    private String cidFromSearch;
    private int commentDeleted;
    private boolean commentForceOpenReply;
    private String commentLabelText;
    private int commentLabelType = -1;
    private int commentUserFollowStatus;
    private String contentSource;
    private int count;
    private String creationId;
    private int cursor;
    private String dataType;
    private int detailAdType;
    private String detailTitleText;
    private String duetId;
    private boolean enableDetailActivityVideoCoverTransition = false;
    private String enterFromRequestId;
    private String enterMethodValue = "click";
    private String enterPlayMethod;
    private String enterPlaylistGroupId;
    private String entranceInfo;
    private String eventType;
    private boolean exposeSharerMsg;
    public HashMap<String, String> extra = new HashMap<>();
    private String feedGroupIdForMixVideo;
    private String feedsAwemeId;
    private String from;
    private boolean fromAdsActivity;
    private String fromGroupId;
    private int fromRecommendCard;
    private Boolean fromSearchLiveCard;
    private boolean hasLatestFollowingUser;
    private int hasMore;
    private String hashTagName;
    private String hotEnterMethod;
    private String hotSearch;
    private String ids;
    private String inboxExtra;
    private int index;
    private boolean isAdSpot;
    private boolean isChain;
    private boolean isFromDuetChain;
    private boolean isFromHotSearchRanking;
    private int isFromPlaylist = 0;
    private boolean isFromPostList;
    private boolean isFromSearchTopic;
    private String isFromTrendingCard;
    private int isFromVideo;
    private boolean isHideMusicText;
    private boolean isHotSearch;
    private boolean isMyProfile;
    private int isNewLowQualityUser;
    private boolean isPlaylistCleanMode;
    private boolean isRecommend;
    private boolean isStoryPage;
    private boolean isSupportFeedTransition;
    private Boolean isTrending;
    private boolean isfollowSkyLight;
    private String itemIdList;
    private String lastGroupId;
    private int level1CommentDeleted;
    private int likeCount;
    private String likeEnterMethod;
    private String likeListIds;
    private String liveEnterMethodValue;
    public HashMap<String, String> logExtra = new HashMap<>();
    private String mChatRoomPlayingRealAid;
    private String mImprId;
    private boolean mIsFromChatRoomPlaying;
    private String mListItemId;
    private String mListResultType;
    private Object mObject;
    private String mSearchId;
    private String mSearchResultId;
    private String mSearchThirdItemId;
    private String mSearchType;
    private String mSpecialTopicRegion;
    private int mStoryType;
    private boolean mVideoFromDcd;
    private long maxCursor;
    private String microAppId;
    private String mixFromOrder;
    private String musicId;
    private String mvId;
    private boolean needAutoLikeComment;
    private boolean needShowDonation;
    public boolean needShowReplyPanel;
    private String newSourceId;
    private String newSourceType;
    private String newsId;
    private String outAwemeId;
    private String pagePoiId;
    private int pageSize;
    private int pageType = 0;
    private String parentTagId;
    private String playListId;
    private long playlistOffset;
    private String playlistPreviousPage;
    private String playlistSearchId;
    private String previousPage;
    private String previousPagePosition = "other_places";
    private String processId;
    private String productId;
    private String promotionId;
    private String pushParams;
    private String queryAwemeMode;
    private String questionId;
    private int rateType;
    private String reactSessionId;
    private String referCommodityId;
    private String referSeedId;
    private String referSeedName;
    private String relatedId;
    private String searchKeyword;
    private String secUid;
    private String selectedUid;
    private String shareCheckSum;
    private String shareParamLinkId;
    private String shareParamSecUserId;
    private String shareParamUserId;
    private String shareParamUtmSource;
    private String shareTimeStamp;
    private String shareUserId;
    private boolean shouldQueryMyStoryFromCache = false;
    private int showAnswerQuestionButton;
    private boolean showCommentAfterOpen;
    private boolean showInterestChoose;
    private boolean showPoll;
    private boolean showShareAfterOpen;
    private String spuId;
    private String stickerId;
    private String tabName;
    private String tabText;
    private String tagLine;
    private int taskType;
    private String topCommentId;
    private String tracker;
    private String translatorId;
    private String trendingEventId;
    private String trendingName;
    private String tutorialId;
    private int type;
    private String uid;
    private List<String> uidList;
    private String upvoteId;
    private List<String> userList;
    private String vid;
    private long videoCurrentPosition;
    private int videoType;
    private String vsEnterFrom;
    private String vsEntranceType;
    private String vsGroupId;
    private String vsResultId;
    private String vsSessionId;

    static {
        Covode.recordClassIndex(59616);
    }

    public boolean isSearchTopic() {
        return true;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public String getAdReportReason() {
        return this.adReportReason;
    }

    public String getAdReportReasonType() {
        return this.adReportReasonType;
    }

    public String getAdvId() {
        return this.advId;
    }

    public String getAid() {
        return this.aid;
    }

    public AnchorCustomData getAnchorCustomData() {
        return this.anchorCustomData;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public List<String> getBlueDotList() {
        return this.blueDotList;
    }

    public String getCarrierType() {
        return this.carrierType;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getCellDetailType() {
        return this.cellDetailType;
    }

    public String getCellId() {
        return this.cellId;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public String getChallengeProfileFrom() {
        return this.challengeProfileFrom;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public String getChatRoomPlayingRealAid() {
        return this.mChatRoomPlayingRealAid;
    }

    public String getCid() {
        return this.cid;
    }

    public String getCidFromSearch() {
        return this.cidFromSearch;
    }

    public int getCommentDeleted() {
        return this.commentDeleted;
    }

    public String getCommentLabelText() {
        return this.commentLabelText;
    }

    public int getCommentLabelType() {
        return this.commentLabelType;
    }

    public int getCommentUserFollowStatus() {
        return this.commentUserFollowStatus;
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public int getCount() {
        return this.count;
    }

    public String getCreationId() {
        return this.creationId;
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getDataType() {
        return this.dataType;
    }

    public int getDetailAdType() {
        return this.detailAdType;
    }

    public String getDetailTitleText() {
        return this.detailTitleText;
    }

    public String getDuetId() {
        return this.duetId;
    }

    public String getEnterFromRequestId() {
        return this.enterFromRequestId;
    }

    public String getEnterMethodValue() {
        return this.enterMethodValue;
    }

    public String getEnterPlayMethod() {
        return this.enterPlayMethod;
    }

    public String getEnterPlaylistGroupId() {
        return this.enterPlaylistGroupId;
    }

    public String getEntranceInfo() {
        return this.entranceInfo;
    }

    public String getEventType() {
        return this.eventType;
    }

    public HashMap<String, String> getExtra() {
        return this.extra;
    }

    public String getFeedGroupIdForMixVideo() {
        return this.feedGroupIdForMixVideo;
    }

    public String getFeedsAwemeId() {
        return this.feedsAwemeId;
    }

    public String getFrom() {
        return this.from;
    }

    public String getFromGroupId() {
        return this.fromGroupId;
    }

    public int getFromRecommendCard() {
        return this.fromRecommendCard;
    }

    public Boolean getFromSearchLiveCard() {
        return this.fromSearchLiveCard;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public String getHotEnterMethod() {
        return this.hotEnterMethod;
    }

    public String getHotSearch() {
        return this.hotSearch;
    }

    public String getIds() {
        return this.ids;
    }

    public String getInboxExtra() {
        return this.inboxExtra;
    }

    public int getIndex() {
        return this.index;
    }

    public int getIsFromPlaylist() {
        return this.isFromPlaylist;
    }

    public String getIsFromTrendingCard() {
        return this.isFromTrendingCard;
    }

    public int getIsFromVideo() {
        return this.isFromVideo;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public String getLastGroupId() {
        return this.lastGroupId;
    }

    public int getLevel1CommentDeleted() {
        return this.level1CommentDeleted;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public String getLikeEnterMethod() {
        return this.likeEnterMethod;
    }

    public String getLikeListIds() {
        return this.likeListIds;
    }

    public String getListItemId() {
        return this.mListItemId;
    }

    public String getListResultType() {
        return this.mListResultType;
    }

    public String getLiveEnterMethodValue() {
        return this.liveEnterMethodValue;
    }

    public HashMap<String, String> getLogExtra() {
        return this.logExtra;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMixFromOrder() {
        return this.mixFromOrder;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public boolean getNeedAutoLikeComment() {
        return this.needAutoLikeComment;
    }

    public boolean getNeedShowDonation() {
        return this.needShowDonation;
    }

    public boolean getNeedShowReplyPanel() {
        return this.needShowReplyPanel;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public String getNewsId() {
        return this.newsId;
    }

    public Object getObject() {
        return this.mObject;
    }

    public String getOutAwemeId() {
        return this.outAwemeId;
    }

    public String getPagePoiId() {
        return this.pagePoiId;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPageType() {
        return this.pageType;
    }

    public String getParentTagId() {
        return this.parentTagId;
    }

    public String getPlayListId() {
        return this.playListId;
    }

    public long getPlaylistOffset() {
        return this.playlistOffset;
    }

    public String getPlaylistPreviousPage() {
        return this.playlistPreviousPage;
    }

    public String getPlaylistSearchId() {
        return this.playlistSearchId;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getPreviousPagePosition() {
        return this.previousPagePosition;
    }

    public String getProcessId() {
        return this.processId;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getPushParams() {
        return this.pushParams;
    }

    public String getQueryAwemeMode() {
        return this.queryAwemeMode;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public int getRateType() {
        return this.rateType;
    }

    public String getReactSessionId() {
        return this.reactSessionId;
    }

    public String getReferCommodityId() {
        return this.referCommodityId;
    }

    public String getReferSeedId() {
        return this.referSeedId;
    }

    public String getReferSeedName() {
        return this.referSeedName;
    }

    public String getRelatedId() {
        return this.relatedId;
    }

    public String getSearchId() {
        return this.mSearchId;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public String getSearchResultId() {
        return this.mSearchResultId;
    }

    public String getSearchThirdItemId() {
        return this.mSearchThirdItemId;
    }

    public String getSearchType() {
        return this.mSearchType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getSelectedUid() {
        return this.selectedUid;
    }

    public String getShareCheckSum() {
        return this.shareCheckSum;
    }

    public String getShareParamLinkId() {
        return this.shareParamLinkId;
    }

    public String getShareParamSecUserId() {
        return this.shareParamSecUserId;
    }

    public String getShareParamUserId() {
        return this.shareParamUserId;
    }

    public String getShareParamUtmSource() {
        return this.shareParamUtmSource;
    }

    public String getShareTimeStamp() {
        return this.shareTimeStamp;
    }

    public String getShareUserId() {
        return this.shareUserId;
    }

    public int getShowAnswerQuestionButton() {
        return this.showAnswerQuestionButton;
    }

    public String getSpecialTopicRegion() {
        return this.mSpecialTopicRegion;
    }

    public String getSpuId() {
        return this.spuId;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStoryType() {
        return this.mStoryType;
    }

    public String getTabName() {
        return this.tabName;
    }

    public String getTabText() {
        return this.tabText;
    }

    public String getTagLine() {
        return this.tagLine;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public String getTopCommentId() {
        return this.topCommentId;
    }

    public String getTracker() {
        return this.tracker;
    }

    public String getTranslatorId() {
        return this.translatorId;
    }

    public Boolean getTrending() {
        return this.isTrending;
    }

    public String getTrendingEventId() {
        return this.trendingEventId;
    }

    public String getTrendingName() {
        return this.trendingName;
    }

    public String getTutorialId() {
        return this.tutorialId;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public List<String> getUidList() {
        return this.uidList;
    }

    public String getUpvoteId() {
        return this.upvoteId;
    }

    public List<String> getUserList() {
        return this.userList;
    }

    public String getVid() {
        return this.vid;
    }

    public long getVideoCurrentPosition() {
        return this.videoCurrentPosition;
    }

    public int getVideoType() {
        return this.videoType;
    }

    public String getVsEnterFrom() {
        return this.vsEnterFrom;
    }

    public String getVsEntranceType() {
        return this.vsEntranceType;
    }

    public String getVsGroupId() {
        return this.vsGroupId;
    }

    public String getVsResultId() {
        return this.vsResultId;
    }

    public String getVsSessionId() {
        return this.vsSessionId;
    }

    public String getmImprId() {
        return this.mImprId;
    }

    public boolean isAdSpot() {
        return this.isAdSpot;
    }

    public boolean isChain() {
        return this.isChain;
    }

    public boolean isCommentForceOpenReply() {
        return this.commentForceOpenReply;
    }

    public boolean isEnableDetailActivityVideoCoverTransition() {
        return this.enableDetailActivityVideoCoverTransition;
    }

    public boolean isExposeSharerMsg() {
        return this.exposeSharerMsg;
    }

    public boolean isFromAdsActivity() {
        return this.fromAdsActivity;
    }

    public boolean isFromChatRoomPlaying() {
        return this.mIsFromChatRoomPlaying;
    }

    public boolean isFromDuetChain() {
        return this.isFromDuetChain;
    }

    public boolean isFromHotSearchRanking() {
        return this.isFromHotSearchRanking;
    }

    public boolean isFromPostList() {
        return this.isFromPostList;
    }

    public boolean isHasLatestFollowingUser() {
        return this.hasLatestFollowingUser;
    }

    public boolean isHideMusicText() {
        return this.isHideMusicText;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isPlaylistCleanMode() {
        return this.isPlaylistCleanMode;
    }

    public boolean isRecommend() {
        return this.isRecommend;
    }

    public boolean isShouldQueryMyStoryFromCache() {
        return this.shouldQueryMyStoryFromCache;
    }

    public boolean isShowCommentAfterOpen() {
        return this.showCommentAfterOpen;
    }

    public boolean isShowInterestChoose() {
        return this.showInterestChoose;
    }

    public boolean isShowPoll() {
        return this.showPoll;
    }

    public boolean isShowShareAfterOpen() {
        return this.showShareAfterOpen;
    }

    public boolean isStoryPage() {
        return this.isStoryPage;
    }

    public boolean isSupportFeedTransition() {
        return this.isSupportFeedTransition;
    }

    public boolean isVideoFromDcd() {
        return this.mVideoFromDcd;
    }

    public boolean hasTask() {
        if (this.taskType != 0) {
            return true;
        }
        return false;
    }

    public boolean isNewLowQualityUser() {
        if (this.isNewLowQualityUser == 1) {
            return true;
        }
        return false;
    }

    public Boolean isfollowSkyLight() {
        return Boolean.valueOf(this.isfollowSkyLight);
    }

    public boolean isAdHasReportReason() {
        if (!TextUtils.isEmpty(this.adReportReason)) {
            return true;
        }
        return false;
    }

    public boolean isHotSpot() {
        if (!TextUtils.isEmpty(this.hotSearch) || this.isFromHotSearchRanking) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "FeedParam{from='" + this.from + '\'' + ", eventType='" + this.eventType + '\'' + ", extra=" + this.logExtra + ", pageType=" + this.pageType + ", aid='" + this.aid + '\'' + ", ids='" + this.ids + '\'' + ", pushParams='" + this.pushParams + '\'' + ", cid='" + this.cid + '\'' + ", spuId='" + this.spuId + '\'' + ", rateType=" + this.rateType + ", pageSize=" + this.pageSize + ", enterFromRequestId='" + this.enterFromRequestId + '\'' + ", previousPage='" + this.previousPage + '\'' + ", isMyProfile=" + this.isMyProfile + ", isFromPostList=" + this.isFromPostList + ", shareUserId='" + this.shareUserId + '\'' + ", challengeProfileFrom='" + this.challengeProfileFrom + '\'' + ", likeEnterMethod='" + this.likeEnterMethod + '\'' + ", contentSource='" + this.contentSource + '\'' + ", previousPagePosition='" + this.previousPagePosition + '\'' + ", searchKeyword='" + this.searchKeyword + '\'' + ", topCommentId='" + this.topCommentId + '\'' + ", processId='" + this.processId + '\'' + ", isTrending=" + this.isTrending + ", userList=" + this.userList + ", uid='" + this.uid + '\'' + ", secUid='" + this.secUid + '\'' + ", musicId='" + this.musicId + '\'' + ", challengeId='" + this.challengeId + '\'' + ", questionId='" + this.questionId + '\'' + ", showAnswerQuestionButton='" + this.showAnswerQuestionButton + '\'' + ", mvId='" + this.mvId + '\'' + ", channelId=" + this.channelId + ", enterMethodValue='" + this.enterMethodValue + '\'' + ", categoryName='" + this.categoryName + '\'' + ", videoType=" + this.videoType + ", queryAwemeMode='" + this.queryAwemeMode + '\'' + ", accountType='" + this.accountType + '\'' + ", tabName='" + this.tabName + '\'' + ", promotionId='" + this.promotionId + '\'' + ", productId='" + this.productId + '\'' + ", carrierType='" + this.carrierType + '\'' + ", referSeedId='" + this.referSeedId + '\'' + ", referSeedName='" + this.referSeedName + '\'' + ", dataType='" + this.dataType + '\'' + ", entranceInfo='" + this.entranceInfo + '\'' + ", stickerId='" + this.stickerId + '\'' + ", relatedId='" + this.relatedId + '\'' + ", fromAdsActivity=" + this.fromAdsActivity + ", feedsAwemeId='" + this.feedsAwemeId + '\'' + ", type=" + this.type + ", isRecommend=" + this.isRecommend + ", cellId='" + this.cellId + '\'' + ", index=" + this.index + ", hotEnterMethod='" + this.hotEnterMethod + '\'' + ", taskType=" + this.taskType + ", showCommentAfterOpen=" + this.showCommentAfterOpen + ", showShareAfterOpen=" + this.showShareAfterOpen + ", tutorialId='" + this.tutorialId + '\'' + ", creationId='" + this.creationId + '\'' + ", microAppId='" + this.microAppId + '\'' + ", hashTagName='" + this.hashTagName + '\'' + ", cursor=" + this.cursor + ", count=" + this.count + ", showVote=" + this.showPoll + ", hotSearch='" + this.hotSearch + '\'' + ", itemIdList='" + this.itemIdList + '\'' + ", isHotSearch=" + this.isHotSearch + ", isAdSpot=" + this.isAdSpot + ", outAwemeId='" + this.outAwemeId + '\'' + ", activityId='" + this.activityId + '\'' + ", newSourceType='" + this.newSourceType + '\'' + ", newSourceId='" + this.newSourceId + '\'' + ", reactSessionId='" + this.reactSessionId + '\'' + ", commentDeleted=" + this.commentDeleted + ", level1CommentDeleted=" + this.level1CommentDeleted + ", commentForceOpenReply=" + this.commentForceOpenReply + ", fromGroupId='" + this.fromGroupId + '\'' + ", referCommodityId='" + this.referCommodityId + '\'' + ", mixFromOrder='" + this.mixFromOrder + '\'' + ", mVideoFromDcd=" + this.mVideoFromDcd + ", mSearchResultId='" + this.mSearchResultId + '\'' + ", mListResultType='" + this.mListResultType + '\'' + ", mListItemId='" + this.mListItemId + '\'' + ", mSearchThirdItemId='" + this.mSearchThirdItemId + '\'' + ", mImprId='" + this.mImprId + '\'' + ", uidList=" + this.uidList + ", blueDotList=" + this.blueDotList + ", selectedUid='" + this.selectedUid + '\'' + ", isfollowSkyLight=" + this.isfollowSkyLight + ", hasLatestFollowingUser=" + this.hasLatestFollowingUser + ", fromRecommendCard=" + this.fromRecommendCard + ", authorName='" + this.authorName + '\'' + ", mIsFromChatRoomPlaying=" + this.mIsFromChatRoomPlaying + ", mChatRoomPlayingRealAid='" + this.mChatRoomPlayingRealAid + '\'' + ", hasMore=" + this.hasMore + ", mSpecialTopicRegion='" + this.mSpecialTopicRegion + '\'' + ", mObject=" + this.mObject + ", isChain=" + this.isChain + ", isFromDuetChain=" + this.isFromDuetChain + ", tracker='" + this.tracker + '\'' + ", tabText='" + this.tabText + '\'' + ", cellDetailType=" + this.cellDetailType + ", detailTitleText='" + this.detailTitleText + '\'' + ", videoCurrentPosition=" + this.videoCurrentPosition + ", isFromHotSearchRanking=" + this.isFromHotSearchRanking + ", isFromSearchTopic=" + this.isFromSearchTopic + ", shareParamUtmSource=" + this.shareParamUtmSource + ", shareParamLinkId=" + this.shareParamLinkId + ", shareParamUserId=" + this.shareParamUserId + ", shareCheckSum=" + this.shareCheckSum + ", shareTimeStamp=" + this.shareTimeStamp + ", enableDetailActivityVideoCoverTransition=" + this.enableDetailActivityVideoCoverTransition + ", isHideMusicText=" + this.isHideMusicText + ", mStoryType=" + this.mStoryType + ", isSupportFeedTransition=" + this.isSupportFeedTransition + ", isStoryPage=" + this.isStoryPage + ", upvoteId=" + this.upvoteId + '}';
    }

    public b setAccountType(String str) {
        this.accountType = str;
        return this;
    }

    public b setActivityId(String str) {
        this.activityId = str;
        return this;
    }

    public b setAdReportReason(String str) {
        this.adReportReason = str;
        return this;
    }

    public b setAdReportReasonType(String str) {
        this.adReportReasonType = str;
        return this;
    }

    public b setAdSpot(boolean z) {
        this.isAdSpot = z;
        return this;
    }

    public b setAid(String str) {
        this.aid = str;
        return this;
    }

    public b setAnchorCustomData(AnchorCustomData anchorCustomData2) {
        this.anchorCustomData = anchorCustomData2;
        return this;
    }

    public b setAuthorName(String str) {
        this.authorName = str;
        return this;
    }

    public b setBlueDotList(List<String> list) {
        this.blueDotList = list;
        return this;
    }

    public b setCarrierType(String str) {
        this.carrierType = str;
        return this;
    }

    public b setCellDetailType(int i2) {
        this.cellDetailType = i2;
        return this;
    }

    public b setCellId(String str) {
        this.cellId = str;
        return this;
    }

    public b setChain(boolean z) {
        this.isChain = z;
        return this;
    }

    public b setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public b setChallengeProfileFrom(String str) {
        this.challengeProfileFrom = str;
        return this;
    }

    public b setChannelId(int i2) {
        this.channelId = i2;
        return this;
    }

    public b setChatRoomPlayingRealAid(String str) {
        this.mChatRoomPlayingRealAid = str;
        return this;
    }

    public b setCid(String str) {
        this.cid = str;
        return this;
    }

    public b setCidFromSearch(String str) {
        this.cidFromSearch = str;
        return this;
    }

    public b setCommentDeleted(int i2) {
        this.commentDeleted = i2;
        return this;
    }

    public b setCommentForceOpenReply(boolean z) {
        this.commentForceOpenReply = z;
        return this;
    }

    public b setCommentLabelText(String str) {
        this.commentLabelText = str;
        return this;
    }

    public b setCommentLabelType(int i2) {
        this.commentLabelType = i2;
        return this;
    }

    public b setCommentUserFollowStatus(int i2) {
        this.commentUserFollowStatus = i2;
        return this;
    }

    public b setContentSource(String str) {
        this.contentSource = str;
        return this;
    }

    public b setCount(int i2) {
        this.count = i2;
        return this;
    }

    public b setCreationId(String str) {
        this.creationId = str;
        return this;
    }

    public b setCursor(int i2) {
        this.cursor = i2;
        return this;
    }

    public b setDataType(String str) {
        this.dataType = str;
        return this;
    }

    public b setDetailAdType(int i2) {
        this.detailAdType = i2;
        return this;
    }

    public b setDetailTitleText(String str) {
        this.detailTitleText = str;
        return this;
    }

    public b setDuetId(String str) {
        this.duetId = str;
        return this;
    }

    public b setEnableDetailActivityVideoCoverTransition(boolean z) {
        this.enableDetailActivityVideoCoverTransition = z;
        return this;
    }

    public b setEnterFromRequestId(String str) {
        this.enterFromRequestId = str;
        return this;
    }

    public b setEnterPlayMethod(String str) {
        this.enterPlayMethod = str;
        return this;
    }

    public b setEntranceInfo(String str) {
        this.entranceInfo = str;
        return this;
    }

    public b setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public b setExposeSharerMsg(boolean z) {
        this.exposeSharerMsg = z;
        return this;
    }

    public b setExtra(HashMap<String, String> hashMap) {
        this.extra = hashMap;
        return this;
    }

    public b setFeedGroupIdForMixVideo(String str) {
        this.feedGroupIdForMixVideo = str;
        return this;
    }

    public b setFeedsAwemeId(String str) {
        this.feedsAwemeId = str;
        return this;
    }

    public b setFrom(String str) {
        this.from = str;
        return this;
    }

    public b setFromAdsActivity(boolean z) {
        this.fromAdsActivity = z;
        return this;
    }

    public b setFromGroupId(String str) {
        this.fromGroupId = str;
        return this;
    }

    public b setFromHotSearchRanking(boolean z) {
        this.isFromHotSearchRanking = z;
        return this;
    }

    public b setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public b setFromRecommendCard(int i2) {
        this.fromRecommendCard = i2;
        return this;
    }

    public b setFromSearchLiveCard(Boolean bool) {
        this.fromSearchLiveCard = bool;
        return this;
    }

    public b setHasLatestFollowingUser(boolean z) {
        this.hasLatestFollowingUser = z;
        return this;
    }

    public b setHasMore(int i2) {
        this.hasMore = i2;
        return this;
    }

    public b setHashTagName(String str) {
        this.hashTagName = str;
        return this;
    }

    public b setHideMusicText(boolean z) {
        this.isHideMusicText = z;
        return this;
    }

    public b setHotEnterMethod(String str) {
        this.hotEnterMethod = str;
        return this;
    }

    public b setHotSearch(String str) {
        this.hotSearch = str;
        return this;
    }

    public b setIds(String str) {
        this.ids = str;
        return this;
    }

    public b setInboxExtra(String str) {
        this.inboxExtra = str;
        return this;
    }

    public b setIndex(int i2) {
        this.index = i2;
        return this;
    }

    public b setIsFromChatRoomPlaying(boolean z) {
        this.mIsFromChatRoomPlaying = z;
        return this;
    }

    public b setIsFromDuetChain(boolean z) {
        this.isFromDuetChain = z;
        return this;
    }

    public b setIsFromPlaylist(int i2) {
        this.isFromPlaylist = i2;
        return this;
    }

    public b setIsFromSearchTopic(boolean z) {
        this.isFromSearchTopic = z;
        return this;
    }

    public b setIsFromTrendingCard(String str) {
        this.isFromTrendingCard = str;
        return this;
    }

    public b setIsFromVideo(int i2) {
        this.isFromVideo = i2;
        return this;
    }

    public b setIsNewLowQualityUser(int i2) {
        this.isNewLowQualityUser = i2;
        return this;
    }

    public b setItemIdList(String str) {
        this.itemIdList = str;
        return this;
    }

    public b setLastGroupId(String str) {
        this.lastGroupId = str;
        return this;
    }

    public b setLevel1CommentDeleted(int i2) {
        this.level1CommentDeleted = i2;
        return this;
    }

    public b setLikeCount(int i2) {
        this.likeCount = i2;
        return this;
    }

    public b setLikeEnterMethod(String str) {
        this.likeEnterMethod = str;
        return this;
    }

    public b setLikeListIds(String str) {
        this.likeListIds = str;
        return this;
    }

    public b setListItemId(String str) {
        this.mListItemId = str;
        return this;
    }

    public b setListResultType(String str) {
        this.mListResultType = str;
        return this;
    }

    public b setLogExtra(HashMap<String, String> hashMap) {
        this.logExtra = hashMap;
        return this;
    }

    public b setMaxCursor(long j2) {
        this.maxCursor = j2;
        return this;
    }

    public b setMicroAppId(String str) {
        this.microAppId = str;
        return this;
    }

    public b setMixFromOrder(String str) {
        this.mixFromOrder = str;
        return this;
    }

    public b setMusicId(String str) {
        this.musicId = str;
        return this;
    }

    public b setMvId(String str) {
        this.mvId = str;
        return this;
    }

    public b setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public b setNeedAutoLikeComment(boolean z) {
        this.needAutoLikeComment = z;
        return this;
    }

    public b setNeedShowDonation(boolean z) {
        this.needShowDonation = z;
        return this;
    }

    public b setNeedShowReplyPanel(boolean z) {
        this.needShowReplyPanel = z;
        return this;
    }

    public b setNewSourceId(String str) {
        this.newSourceId = str;
        return this;
    }

    public b setNewSourceType(String str) {
        this.newSourceType = str;
        return this;
    }

    public b setNewsId(String str) {
        this.newsId = str;
        return this;
    }

    public b setObject(Object obj) {
        this.mObject = obj;
        return this;
    }

    public b setOutAwemeId(String str) {
        this.outAwemeId = str;
        return this;
    }

    public b setPagePoiId(String str) {
        this.pagePoiId = str;
        return this;
    }

    public b setPageSize(int i2) {
        this.pageSize = i2;
        return this;
    }

    public b setPageType(int i2) {
        this.pageType = i2;
        return this;
    }

    public b setParentTagId(String str) {
        this.parentTagId = str;
        return this;
    }

    public void setPlayListId(String str) {
        this.playListId = str;
    }

    public b setPlaylistCleanMode(boolean z) {
        this.isPlaylistCleanMode = z;
        return this;
    }

    public b setPlaylistEnterGroupId(String str) {
        this.enterPlaylistGroupId = str;
        return this;
    }

    public void setPlaylistOffset(long j2) {
        this.playlistOffset = j2;
    }

    public b setPlaylistPreviousPage(String str) {
        this.playlistPreviousPage = str;
        return this;
    }

    public b setPlaylistSearchId(String str) {
        this.playlistSearchId = str;
        return this;
    }

    public b setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public b setPreviousPagePosition(String str) {
        this.previousPagePosition = str;
        return this;
    }

    public b setProcessId(String str) {
        this.processId = str;
        return this;
    }

    public b setProductId(String str) {
        this.productId = str;
        return this;
    }

    public b setPromotionId(String str) {
        this.promotionId = str;
        return this;
    }

    public b setPushParams(String str) {
        this.pushParams = str;
        return this;
    }

    public b setQueryAwemeMode(String str) {
        this.queryAwemeMode = str;
        return this;
    }

    public b setQuestionId(String str) {
        this.questionId = str;
        return this;
    }

    public b setRateType(int i2) {
        this.rateType = i2;
        return this;
    }

    public b setReactSessionId(String str) {
        this.reactSessionId = str;
        return this;
    }

    public b setRecommend(boolean z) {
        this.isRecommend = z;
        return this;
    }

    public b setReferCommodityId(String str) {
        this.referCommodityId = str;
        return this;
    }

    public b setReferSeedId(String str) {
        this.referSeedId = str;
        return this;
    }

    public b setReferSeedName(String str) {
        this.referSeedName = str;
        return this;
    }

    public b setRelatedId(String str) {
        this.relatedId = str;
        return this;
    }

    public b setSearchId(String str) {
        this.mSearchId = str;
        return this;
    }

    public b setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }

    public b setSearchResultId(String str) {
        this.mSearchResultId = str;
        return this;
    }

    public b setSearchThirdItemId(String str) {
        this.mSearchThirdItemId = str;
        return this;
    }

    public b setSearchType(String str) {
        this.mSearchType = str;
        return this;
    }

    public b setSecUid(String str) {
        this.secUid = str;
        return this;
    }

    public b setSelectedUid(String str) {
        this.selectedUid = str;
        return this;
    }

    public b setShareCheckSum(String str) {
        this.shareCheckSum = str;
        return this;
    }

    public b setShareParamLinkId(String str) {
        this.shareParamLinkId = str;
        return this;
    }

    public b setShareParamSecUserId(String str) {
        this.shareParamSecUserId = str;
        return this;
    }

    public b setShareParamUserId(String str) {
        this.shareParamUserId = str;
        return this;
    }

    public b setShareParamUtmSource(String str) {
        this.shareParamUtmSource = str;
        return this;
    }

    public b setShareTimeStamp(String str) {
        this.shareTimeStamp = str;
        return this;
    }

    public b setShareUserId(String str) {
        this.shareUserId = str;
        return this;
    }

    public b setShouldQueryMyStoryFromCache(boolean z) {
        this.shouldQueryMyStoryFromCache = z;
        return this;
    }

    public b setShowAnswerQuestionButton(int i2) {
        this.showAnswerQuestionButton = i2;
        return this;
    }

    public b setShowCommentAfterOpen(boolean z) {
        this.showCommentAfterOpen = z;
        return this;
    }

    public b setShowInterestChoose(boolean z) {
        this.showInterestChoose = z;
        return this;
    }

    public b setShowPoll(boolean z) {
        this.showPoll = z;
        return this;
    }

    public b setShowShareAfterOpen(boolean z) {
        this.showShareAfterOpen = z;
        return this;
    }

    public b setSpecialTopicRegion(String str) {
        this.mSpecialTopicRegion = str;
        return this;
    }

    public b setSpuId(String str) {
        this.spuId = str;
        return this;
    }

    public b setStickerId(String str) {
        this.stickerId = str;
        return this;
    }

    public b setStoryPage(boolean z) {
        this.isStoryPage = z;
        return this;
    }

    public b setStoryType(int i2) {
        this.mStoryType = i2;
        return this;
    }

    public b setSupportFeedTransition(boolean z) {
        this.isSupportFeedTransition = z;
        return this;
    }

    public b setTabName(String str) {
        this.tabName = str;
        return this;
    }

    public b setTabText(String str) {
        this.tabText = str;
        return this;
    }

    public b setTagLine(String str) {
        this.tagLine = str;
        return this;
    }

    public b setTaskType(int i2) {
        this.taskType = i2;
        return this;
    }

    public b setTopCommentId(String str) {
        this.topCommentId = str;
        return this;
    }

    public b setTracker(String str) {
        this.tracker = str;
        return this;
    }

    public b setTranslatorId(String str) {
        this.translatorId = str;
        return this;
    }

    public b setTrending(Boolean bool) {
        this.isTrending = bool;
        return this;
    }

    public b setTrendingEventId(String str) {
        this.trendingEventId = str;
        return this;
    }

    public b setTrendingName(String str) {
        this.trendingName = str;
        return this;
    }

    public b setTutorialId(String str) {
        this.tutorialId = str;
        return this;
    }

    public b setType(int i2) {
        this.type = i2;
        return this;
    }

    public b setUid(String str) {
        this.uid = str;
        return this;
    }

    public b setUidList(List<String> list) {
        this.uidList = list;
        return this;
    }

    public b setUpvoteId(String str) {
        this.upvoteId = str;
        return this;
    }

    public b setUserList(List<String> list) {
        this.userList = list;
        return this;
    }

    public b setVid(String str) {
        this.vid = str;
        return this;
    }

    public b setVideoCurrentPosition(long j2) {
        this.videoCurrentPosition = j2;
        return this;
    }

    public b setVideoFromDcd(boolean z) {
        this.mVideoFromDcd = z;
        return this;
    }

    public b setVideoType(int i2) {
        this.videoType = i2;
        return this;
    }

    public b setVsEnterFrom(String str) {
        this.vsEnterFrom = str;
        return this;
    }

    public b setVsEntranceType(String str) {
        this.vsEntranceType = str;
        return this;
    }

    public b setVsGroupId(String str) {
        this.vsGroupId = str;
        return this;
    }

    public b setVsResultId(String str) {
        this.vsResultId = str;
        return this;
    }

    public b setVsSessionId(String str) {
        this.vsSessionId = str;
        return this;
    }

    public b setmImprId(String str) {
        this.mImprId = str;
        return this;
    }

    public b setIsfollowSkyLight(Boolean bool) {
        this.isfollowSkyLight = bool.booleanValue();
        return this;
    }

    public b setAdvId(String str) {
        if (str == null) {
            this.advId = "";
        } else {
            this.advId = str;
        }
        return this;
    }

    public b setCategoryName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.categoryName = str;
        }
        return this;
    }

    public b setEnterMethodValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.enterMethodValue = str;
        }
        return this;
    }

    public b setLiveEnterMethodValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.liveEnterMethodValue = str;
        }
        return this;
    }
}
