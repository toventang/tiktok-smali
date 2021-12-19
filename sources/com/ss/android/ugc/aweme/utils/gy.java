package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class gy {

    /* renamed from: a  reason: collision with root package name */
    public static final gy f143048a = new gy();

    private gy() {
    }

    static {
        Covode.recordClassIndex(93614);
    }

    public static final String a(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return String.valueOf(newLiveRoomData.id);
            }
        } else if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
        }
        return null;
    }

    public static final String b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return String.valueOf(newLiveRoomData.getAnchorId());
            }
        } else if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isLive()) {
                User author2 = aweme.getAuthor();
                l.b(author2, "");
                return author2.getUid().toString();
            }
        }
        return null;
    }
}
