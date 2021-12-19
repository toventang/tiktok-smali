package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.a.d;
import com.bytedance.android.livesdk.model.ag;
import com.bytedance.android.livesdk.model.ai;
import com.bytedance.android.livesdk.model.al;
import com.bytedance.android.livesdk.model.aq;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.model.ay;
import com.bytedance.android.livesdk.model.t;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class Room implements ag {
    @c(a = "anchor_share_text")
    String anchorShareText;
    @c(a = "anchor_tab_type")
    long anchorTabType;
    @c(a = "answering_question_content")
    String answeringQuestion;
    public String authenticationValue = "";
    @c(a = "ba_link_info")
    BALinkStruct baLinkStruct;
    @c(a = "background")
    public ImageModel background;
    @c(a = "client_version")
    String clientVersion;
    @c(a = "commerce_info")
    CommerceStruct commerceStruct;
    @c(a = "cover")
    ImageModel cover;
    @c(a = "create_time")
    long createTime;
    @c(a = "deco_list")
    List<av> decorationList;
    @c(a = "dynamic_cover")
    ImageModel dynamicCover;
    @c(a = "dynamic_cover_low")
    ImageModel dynamicCoverLow;
    @c(a = "feed_room_label")
    ImageModel feedRoomLabel;
    @c(a = "feed_room_labels")
    List<FeedRoomLabel> feedRoomLabelList;
    @c(a = "filter_msg_rules")
    public List<g> filterRule;
    @c(a = "finish_time")
    long finishTime;
    @c(a = "finish_url_v2")
    public String finishUrlLynx;
    @c(a = "finish_url")
    public String finish_url;
    @c(a = "game_category")
    public t gameCategoryInfo;
    @c(a = "gift_msg_style")
    public int giftMessageStyle;
    @c(a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @c(a = "hashtag")
    public Hashtag hashtag;
    @c(a = "have_wishlist")
    public boolean haveWishList;
    @c(a = "id")
    long id;
    @c(a = "id_str")
    String idStr;
    public boolean isDouPlusPromotion;
    public boolean isFromRecommendCard;
    private transient boolean isOfficialChannel;
    @c(a = "live_type_screenshot")
    public boolean isScreenshot;
    @c(a = "live_type_third_party")
    public boolean isThirdParty;
    @c(a = "common_label_list")
    String labels;
    @c(a = "layout")
    public long layout;
    @c(a = "like_count")
    public long likeCount;
    @c(a = "like_info")
    public ai likeInfo;
    @c(a = "link_mic")
    p linkMicInfoGson;
    private transient int linkmicLayout;
    @c(a = "live_event_info")
    public al liveEventInfo;
    @c(a = "live_room_mode")
    public int liveRoomMode;
    @c(a = "live_type_audio")
    boolean liveTypeAudio;
    private String logPb;
    @c(a = "boost_status")
    public h mBoostCardRoomStatus;
    @c(a = "comment_name_mode")
    public int mNameMode;
    private String mRequestId;
    @c(a = "room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    private long mUserFrom;
    @c(a = "mask_layer")
    public MaskLayer maskLayer;
    @c(a = "message")
    public String message;
    @c(a = "mosaic_status")
    int mosaicStatus;
    @c(a = "social_interaction")
    public d multiLiveUserSettings;
    public long nowTime;
    @c(a = "official_channel")
    public aq officialChannelInfo;
    @c(a = "orientation")
    int orientation;
    @c(a = "owner")
    User owner;
    @c(a = "owner_user_id")
    long ownerUserId;
    @c(a = "os_type")
    int platform;
    @c(a = "prompts")
    public String prompts;
    @c(a = "interaction_question_version")
    public int questionVersion;
    @c(a = "room_layout")
    public int roomLayout;
    private String roomOrientation;
    @c(a = "share_url")
    String shareUrl;
    @c(a = "short_touch_items")
    public List<ShortTouchItem> shortTouchItems;
    @c(a = "source_type")
    String sourceType;
    @c(a = "stats")
    RoomStats stats;
    @c(a = "status")
    int status;
    @c(a = "sticker_list")
    List<av> stickerList;
    @c(a = "stream_cover")
    ImageModel streamCover;
    @c(a = "stream_id")
    long streamId;
    @c(a = "stream_url")
    StreamUrl streamUrl;
    @c(a = "title")
    String title;
    @c(a = "top_fans")
    List<ay> topFanTickets;
    @c(a = "use_filter")
    public boolean unusedEffect;
    @c(a = "user_count")
    int userCount;
    @c(a = "user_share_text")
    String userShareText;
    @c(a = "warning_tag")
    public WarningTag warningTag;
    @c(a = "with_linkmic")
    boolean withLinkMic;

    static {
        Covode.recordClassIndex(13656);
    }

    public List<Object> getDislikeReason() {
        return null;
    }

    public String getVideoUrl() {
        return "";
    }

    public String subtitle() {
        return "";
    }

    public b author() {
        return this.owner;
    }

    public ImageModel cover() {
        return this.cover;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public long getAnchorTabType() {
        return this.anchorTabType;
    }

    public String getAnsweringQuestion() {
        return this.answeringQuestion;
    }

    public BALinkStruct getBALinkStruct() {
        return this.baLinkStruct;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public CommerceStruct getCommerceStruct() {
        return this.commerceStruct;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public List<av> getDecorationList() {
        return this.decorationList;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public List<FeedRoomLabel> getFeedRoomLabelList() {
        return this.feedRoomLabelList;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public Hashtag getHashtag() {
        return this.hashtag;
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLikeCount() {
        return this.likeCount;
    }

    public p getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public int getNameMode() {
        return this.mNameMode;
    }

    public aq getOfficialChannelInfo() {
        return this.officialChannelInfo;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public int getRoomLayout() {
        return this.roomLayout;
    }

    public String getRoomOrientation() {
        return this.roomOrientation;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public List<av> getStickerList() {
        return this.stickerList;
    }

    public ImageModel getStreamCover() {
        return this.streamCover;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<ay> getTopFanTickets() {
        return this.topFanTickets;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isOfficialChannel() {
        return this.isOfficialChannel;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String title() {
        return this.title;
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public String getMixId() {
        return String.valueOf(this.id);
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public String buildPullUrl() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return buildPullUrl(streamUrl2.r);
    }

    public String getSdkParams() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return getSdkParams(streamUrl2.r);
    }

    public s.a getStreamSrConfig() {
        s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.n;
    }

    public s getStreamUrlExtra() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.f23045l;
    }

    public s getStreamUrlExtraSafely() {
        s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new s();
        }
        return streamUrlExtra;
    }

    public boolean isKoiRoom() {
        if (this.layout == 3) {
            return true;
        }
        return false;
    }

    public boolean isOfficial() {
        if (this.layout == 1) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.layout == 2) {
            return true;
        }
        return false;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.o == null || this.streamUrl.o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.o.getDefaultQuality().sdkKey;
    }

    public void init() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 != null) {
            streamUrl2.b();
            if (this.streamUrl.o != null) {
                this.streamUrl.c();
            }
        }
    }

    public boolean isMultiPullDataValid() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (!(streamUrl2 == null || streamUrl2.o == null)) {
            streamUrl2.c();
            if (!streamUrl2.qualityList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPullUrlValid() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return false;
        }
        streamUrl2.b();
        if (!streamUrl2.qualityMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public String getMultiStreamData() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.o == null || this.streamUrl.o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.o.getPullData().getStreamData();
    }

    public i getStreamType() {
        if (this.layout == 1) {
            return i.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return i.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return i.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return i.AUDIO;
        }
        return i.VIDEO;
    }

    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("roomid:").append(this.idStr).append(" ; \n");
        sb.append("RoomAuthStatus info: ");
        sb.append(this.mRoomAuthStatus.toString());
        return sb.toString();
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setAnchorTabType(long j2) {
        this.anchorTabType = j2;
    }

    public void setAnsweringQuestion(String str) {
        this.answeringQuestion = str;
    }

    public void setBALinkStruct(BALinkStruct bALinkStruct) {
        this.baLinkStruct = bALinkStruct;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setCommerceStruct(CommerceStruct commerceStruct2) {
        this.commerceStruct = commerceStruct2;
    }

    @c(a = "cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDecorationList(List<av> list) {
        this.decorationList = list;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j2) {
        this.finishTime = j2;
    }

    public void setHashtag(Hashtag hashtag2) {
        this.hashtag = hashtag2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLikeCount(int i2) {
        this.likeCount = (long) i2;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i2) {
        this.mosaicStatus = i2;
    }

    public void setOfficialChannel(boolean z) {
        this.isOfficialChannel = z;
    }

    public void setOrientation(int i2) {
        this.orientation = i2;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j2) {
        this.ownerUserId = j2;
    }

    public void setPlatform(int i2) {
        this.platform = i2;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setRoomOrientation(String str) {
        this.roomOrientation = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setStickerList(List<av> list) {
        this.stickerList = list;
    }

    public void setStreamCover(ImageModel imageModel) {
        this.streamCover = imageModel;
    }

    public void setStreamId(long j2) {
        this.streamId = j2;
    }

    @c(a = "stream_url")
    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<ay> list) {
        this.topFanTickets = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i2) {
        this.userCount = i2;
    }

    public void setUserFrom(long j2) {
        this.mUserFrom = j2;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }

    public static boolean isValid(Room room) {
        if (room == null || room.getId() <= 0 || room.getOwner() == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || (str2 = streamUrl2.qualityMap.get(str)) == null) {
            return null;
        }
        com.bytedance.android.livesdk.model.utils.b bVar = new com.bytedance.android.livesdk.model.utils.b(str2);
        bVar.a("anchor_device_platform", this.platform);
        bVar.a("anchor_version", this.clientVersion);
        bVar.a("room_id", this.id);
        bVar.a("anchor_id", this.ownerUserId);
        return bVar.a();
    }
}
