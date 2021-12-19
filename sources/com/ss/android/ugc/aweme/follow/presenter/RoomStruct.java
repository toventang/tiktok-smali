package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;

public class RoomStruct extends LiveRoomStruct {
    static {
        Covode.recordClassIndex(60963);
    }

    public static i getStreamType(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct.isScreenshot) {
            return i.SCREEN_RECORD;
        }
        if (liveRoomStruct.isThirdParty) {
            return i.THIRD_PARTY;
        }
        if (liveRoomStruct.liveTypeAudio) {
            return i.AUDIO;
        }
        return i.VIDEO;
    }

    public static i getStreamType(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct.isScreenshot) {
            return i.SCREEN_RECORD;
        }
        if (newLiveRoomStruct.isThirdParty) {
            return i.THIRD_PARTY;
        }
        if (newLiveRoomStruct.liveTypeAudio) {
            return i.AUDIO;
        }
        return i.VIDEO;
    }

    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel avatarThumb;
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.owner = aweme.getAuthor();
        if (roomStruct.owner != null) {
            roomStruct.id = roomStruct.owner.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.id = aweme.getRoom().roomId;
            roomStruct.tvStationRoomStruct = aweme.getRoom().tvStationRoomStruct;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                avatarThumb = aweme.getAuthor().roomCover;
            } else {
                avatarThumb = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = avatarThumb;
        }
        if (aweme.getStreamUrlModel() != null) {
            roomStruct.stream_url = new StreamUrlStruct();
            roomStruct.stream_url.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        }
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        if (aweme.getVideoFeedTag() != null) {
            roomStruct.videoFeedTag = aweme.getVideoFeedTag();
        }
        return roomStruct;
    }
}
