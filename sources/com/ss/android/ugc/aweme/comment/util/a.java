package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72829a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(44859);
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
