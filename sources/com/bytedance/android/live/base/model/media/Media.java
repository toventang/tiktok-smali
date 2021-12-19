package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class Media implements d {
    @c(a = "ad_info")
    private MediaAdInfo adInfo;
    @c(a = "at_users")
    private List<TextExtraStruct> aiteUserItems;
    @c(a = "allow_comment")
    private boolean allowComment;
    @c(a = "allow_dislike")
    private boolean allowDislike;
    @c(a = "allow_share")
    private boolean allowShare;
    private long apiTime;
    @c(a = "author")
    private User author;
    @c(a = "auto_play")
    private int autoPlay;
    @c(a = "cell_height")
    private int cellHeight;
    @c(a = "cell_style")
    private int cellStyle;
    @c(a = "cell_width")
    private int cellWidth;
    @c(a = "comment_delay")
    private int commentDelay;
    @c(a = "comment_prompts")
    private String commentPrompts;
    @c(a = "commerce")
    private a commerce;
    @c(a = "create_time")
    private long createTime;
    private long danmakuShowTime;
    @c(a = "private_info")
    private MediaDebugInfo debugInfo;
    @c(a = "description")
    private String description;
    @c(a = "display_style")
    private int displayStyle;
    @c(a = "enable_send_flame")
    private boolean enableSendFlame;
    @c(a = "feed_tips")
    private String feedTips;
    @c(a = "feed_tips_type")
    private int feedTipsType;
    @c(a = "from_ad")
    private boolean fromAd;
    @c(a = "guide_card_id")
    private int guideCardId;
    @c(a = "has_free_flame")
    private boolean hasFreeFlame;
    @c(a = "has_sync_aweme")
    private boolean hasSyncAweme;
    @c(a = "hashtag")
    private c hashTag;
    @c(a = "hide_nickname")
    private boolean hideNickName;
    @c(a = "id")
    private long id;
    private boolean isDeleted;
    @c(a = "is_rich")
    private int isRich;
    @c(a = "stats")
    private MediaItemStats itemStats;
    private int mDetailType;
    @c(a = "mark")
    private VideoMark mark;
    @c(a = "recommend_reason")
    private MediaRecommendReason mediaRecommendReason;
    @c(a = "media_type")
    private int mediaType;
    @c(a = "song")
    private e music;
    @c(a = "new_cell_style")
    private int newCellStyle;
    private boolean noNeedQuery;
    @c(a = "position")
    private String position;
    @c(a = "share_description")
    private String shareDesc;
    @c(a = "share_enable")
    private boolean shareEnable;
    @c(a = "share_prompts")
    private String sharePrompts;
    @c(a = "share_source_info")
    private ShareSourceInfo shareSourceInfo;
    @c(a = "share_strong_guide")
    private int shareStrongGuide;
    @c(a = "share_text")
    private String shareText;
    @c(a = "share_tips")
    private String shareTips;
    @c(a = "share_title")
    private String shareTitle;
    @c(a = "share_url")
    private String shareUrl;
    @c(a = "status")
    private int status;
    @c(a = "title")
    private String text;
    @c(a = "tips")
    private String tips;
    @c(a = "tips_url")
    private String tipsUrl;
    @c(a = "user_bury")
    private int userBury;
    @c(a = "user_digg")
    private int userDigg;
    @c(a = "video")
    private VideoModel videoModel;
    @c(a = "video_pic_num")
    private int videoPicNum;

    static {
        Covode.recordClassIndex(3607);
    }

    public String getPlayKey() {
        return null;
    }

    public boolean isNativeAd() {
        return false;
    }

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public a getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public c getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public e getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    @Override // com.bytedance.android.live.base.model.media.d
    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        if (isNativeAd()) {
            return "ad";
        }
        if (isFromAd()) {
            return "normal";
        }
        return "";
    }

    public ImageModel getVideoCoverImage() {
        VideoModel videoModel2 = this.videoModel;
        if (videoModel2 == null) {
            return null;
        }
        if (videoModel2.getCoverType() != VideoModel.a.MEDIUM) {
            return this.videoModel.getCoverModel();
        }
        return this.videoModel.getCoverMediumModel();
    }

    public boolean isBitRate() {
        if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        }
        return true;
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j2) {
        this.apiTime = j2;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i2) {
        this.autoPlay = i2;
    }

    public void setCellHeight(int i2) {
        this.cellHeight = i2;
    }

    public void setCellWidth(int i2) {
        this.cellWidth = i2;
    }

    public void setCommentDelay(int i2) {
        this.commentDelay = i2;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(a aVar) {
        this.commerce = aVar;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDanmakuShowTime(long j2) {
        this.danmakuShowTime = j2;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(int i2) {
        this.mDetailType = i2;
    }

    public void setDisplayStyle(int i2) {
        this.displayStyle = i2;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i2) {
        this.feedTipsType = i2;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i2) {
        this.guideCardId = i2;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(c cVar) {
        this.hashTag = cVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIsRich(int i2) {
        this.isRich = i2;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason2) {
        this.mediaRecommendReason = mediaRecommendReason2;
    }

    public void setMediaType(int i2) {
        this.mediaType = i2;
    }

    public void setMusic(e eVar) {
        this.music = eVar;
    }

    public void setNewCellStyle(int i2) {
        this.newCellStyle = i2;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo2) {
        this.shareSourceInfo = shareSourceInfo2;
    }

    public void setShareStrongGuide(int i2) {
        this.shareStrongGuide = i2;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i2) {
        this.userBury = i2;
    }

    public void setUserDigg(int i2) {
        this.userDigg = i2;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
    }

    public void setVideoPicNum(int i2) {
        this.videoPicNum = i2;
    }

    public void setCellStyle(int i2) {
        if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
            i2 = 1;
        }
        this.cellStyle = i2;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (mediaItemStats != null) {
            MediaItemStats mediaItemStats2 = this.itemStats;
            if (mediaItemStats2 == null) {
                this.itemStats = mediaItemStats;
                return;
            }
            mediaItemStats2.setCommentCount(mediaItemStats.getCommentCount());
            this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
            this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
            this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
        }
    }

    public void update(Media media) {
        if (media != null && media.getId() == this.id) {
            this.text = media.text;
            this.createTime = media.createTime;
            this.userDigg = media.userDigg;
            this.userBury = media.userBury;
            this.mediaType = media.mediaType;
            this.status = media.status;
            updateItemStats(media.itemStats);
            User user = media.author;
            if (user != null) {
                this.author = user;
            }
            VideoModel videoModel2 = media.videoModel;
            if (videoModel2 != null) {
                this.videoModel = videoModel2;
            }
            this.shareUrl = media.shareUrl;
            this.shareTitle = media.shareTitle;
            this.shareDesc = media.shareDesc;
            this.shareEnable = media.shareEnable;
            this.allowShare = media.allowShare;
            this.allowComment = media.allowComment;
            this.allowDislike = media.allowDislike;
            this.cellStyle = media.cellStyle;
            this.tips = media.tips;
            this.tipsUrl = media.tipsUrl;
            MediaDebugInfo mediaDebugInfo = media.debugInfo;
            if (mediaDebugInfo != null) {
                this.debugInfo = mediaDebugInfo;
            }
            VideoMark videoMark = media.mark;
            if (videoMark != null) {
                this.mark = videoMark;
            }
            this.shareText = media.shareText;
            this.cellHeight = media.cellHeight;
            this.cellWidth = media.cellWidth;
            this.feedTipsType = media.feedTipsType;
            this.feedTips = media.feedTips;
            this.displayStyle = media.displayStyle;
            this.commentDelay = media.commentDelay;
            this.guideCardId = media.guideCardId;
            this.sharePrompts = media.sharePrompts;
            this.commentPrompts = media.commentPrompts;
            this.shareTips = media.shareTips;
            this.enableSendFlame = media.enableSendFlame;
            this.hideNickName = media.hideNickName;
            this.music = media.music;
            this.videoPicNum = media.videoPicNum;
            this.apiTime = media.getApiTime();
            this.noNeedQuery = media.noNeedQuery;
            a aVar = media.commerce;
            if (aVar != null) {
                this.commerce = aVar;
            }
        }
    }
}
