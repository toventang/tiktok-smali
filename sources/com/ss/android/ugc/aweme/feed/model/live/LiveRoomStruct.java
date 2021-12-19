package com.ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class LiveRoomStruct extends a implements d, Serializable {
    @c(a = "additional_stream_url")
    public StreamUrlStruct additional_stream_url;
    public long autoCover;
    public Challenge challenge;
    @c(a = "challenge_info")
    public String challengeInfo;
    @c(a = "client_version")
    public String clientVersion;
    @c(a = "coins")
    public int coins;
    @c(a = "commerce_info")
    public CommerceStruct commerceStruct;
    @c(a = "content_label")
    public LiveImageModel contentLabel;
    @c(a = "content_tag")
    public String contentTag;
    @c(a = "create_time")
    public long create_time;
    @c(a = "digg_count")
    public int digg_count;
    @c(a = "disable_preload_stream")
    public boolean disablePrePullStream;
    @c(a = "distance")
    public String distance;
    public String errorMsg;
    @c(a = "fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;
    @c(a = "finish_time")
    public long finish_time;
    public int fromInnerPush;
    @c(a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @c(a = "room_id", b = {"id"})
    public long id;
    @c(a = "in_sandbox")
    public boolean inSandbox;
    @c(a = "live_type_official")
    public boolean isOfficialType;
    @c(a = "live_type_screenshot")
    public boolean isScreenshot;
    @c(a = "live_type_third_party")
    public boolean isThirdParty;
    @b(a = RawStringJsonAdapter.class)
    @c(a = "link_mic")
    public String linkMic;
    @c(a = "linkmic_layout")
    public long linkMicLayout;
    @c(a = "live_event_info")
    public LiveEventInfo liveEventInfo;
    @c(a = "live_reason")
    public String liveReason;
    @c(a = "live_total_time")
    public long liveTotalTime;
    @c(a = "live_type_audio")
    public boolean liveTypeAudio;
    public String mRequestId;
    public long mUserFrom;
    @c(a = "mask_layer")
    public MaskLayer maskLayer;
    public String message;
    @c(a = "new_fans_count")
    public int newFansCount;
    @c(a = "operation_label")
    public LiveImageModel operationLabel;
    @c(a = "owner")
    public User owner;
    @c(a = "owner_user_id")
    public long ownerUserId;
    @c(a = "os_type")
    public int platform;
    public String prompts;
    @c(a = "activity")
    public RoomBuilding roomActivity;
    @c(a = "room_cover", b = {"cover"})
    public UrlModel roomCover;
    @c(a = "room_layout")
    public int roomLayout;
    public int roomType = 3;
    @c(a = "room_type_tag")
    public String roomTypeTag;
    @c(a = "share_info")
    public ShareStruct share_info;
    @c(a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @c(a = "stream_id")
    public long stream_id;
    @c(a = "stream_url")
    public StreamUrlStruct stream_url;
    @c(a = "title")
    public String title;
    @c(a = "total_user")
    public int total_user;
    @c(a = "total_user_count")
    public int total_user_count;
    @c(a = "tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    public long userId;
    @c(a = "user_count")
    public int user_count;
    @c(a = "video_feed_tag")
    public String videoFeedTag;
    @c(a = "warning_tag")
    public WarningTag warningTag;
    @c(a = "with_linkmic")
    public boolean withLinkmic;

    static {
        Covode.recordClassIndex(59499);
    }

    public String getChallengeInfo() {
        return this.challengeInfo;
    }

    public LiveImageModel getContentLabel() {
        return this.contentLabel;
    }

    public String getContentTag() {
        return this.contentTag;
    }

    public LiveImageModel getOperationLabel() {
        return this.operationLabel;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.mRequestId;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new LiveStreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public long getAnchorId() {
        User user = this.owner;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return 0;
        }
        return Long.parseLong(this.owner.getUid());
    }

    public Challenge getChallenge() {
        try {
            Challenge challenge2 = this.challenge;
            if (challenge2 != null) {
                return challenge2;
            }
            Challenge awemeChallenge = ((LiveChallenge) com.ss.android.ugc.aweme.live.b.a().a(this.challengeInfo, LiveChallenge.class)).toAwemeChallenge();
            this.challenge = awemeChallenge;
            return awemeChallenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getMultiStreamData() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || streamUrlStruct.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getPullData().getStreamData();
    }

    public String toString() {
        return "LiveRoomStruct{mUserFrom=" + this.mUserFrom + ", mRequestId='" + this.mRequestId + '\'' + ", status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", userId=" + this.userId + ", roomType=" + this.roomType + ", id=" + this.id + ", status=" + this.status + ", owner=" + this.owner + ", title='" + this.title + '\'' + ", user_count=" + this.user_count + ", create_time=" + this.create_time + ", finish_time=" + this.finish_time + ", stream_id=" + this.stream_id + ", additional_stream_url=" + this.additional_stream_url + ", share_info=" + this.share_info + ", digg_count=" + this.digg_count + ", coins=" + this.coins + ", inSandbox=" + this.inSandbox + ", total_user_count=" + this.total_user_count + ", roomActivity=" + this.roomActivity + ", roomCover=" + this.roomCover + ", roomTypeTag='" + this.roomTypeTag + '\'' + ", newFansCount=" + this.newFansCount + ", liveTypeAudio=" + this.liveTypeAudio + ", isThirdParty=" + this.isThirdParty + ", isScreenshot=" + this.isScreenshot + ", isOfficialType=" + this.isOfficialType + ", liveTotalTime=" + this.liveTotalTime + ", ownerUserId=" + this.ownerUserId + ", videoFeedTag='" + this.videoFeedTag + '\'' + ", withLinkmic=" + this.withLinkmic + ", distance='" + this.distance + '\'' + ", stream_url=" + this.stream_url + ", clientVersion='" + this.clientVersion + '\'' + ", platform=" + this.platform + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    public void setChallengeInfo(String str) {
        this.challengeInfo = str;
    }

    public void setContentLabel(LiveImageModel liveImageModel) {
        this.contentLabel = liveImageModel;
    }

    public void setContentTag(String str) {
        this.contentTag = str;
    }

    public void setOperationLabel(LiveImageModel liveImageModel) {
        this.operationLabel = liveImageModel;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setUserFrom(long j2) {
        this.mUserFrom = j2;
    }

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || liveRoomStruct.id <= 0 || liveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }
}
