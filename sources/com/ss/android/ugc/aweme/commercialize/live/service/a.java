package com.ss.android.ugc.aweme.commercialize.live.service;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74700a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46067);
    }

    public static final boolean a(Aweme aweme) {
        return CommercializeLiveServiceImpl.a().b(aweme);
    }

    public static final String c(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        Long l2 = null;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                l2 = Long.valueOf(newLiveRoomData.id);
            }
            return String.valueOf(l2);
        }
        User author = aweme.getAuthor();
        l.b(author, "");
        if (author.isLive()) {
            return String.valueOf(aweme.getAuthor().roomId);
        }
        return null;
    }

    public static final String b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        Long l2 = null;
        if (aweme == null) {
            return null;
        }
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (!(roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                l2 = Long.valueOf(newLiveRoomData.getAnchorId());
            }
            return String.valueOf(l2);
        }
        User author = aweme.getAuthor();
        l.b(author, "");
        if (!author.isLive()) {
            return null;
        }
        User author2 = aweme.getAuthor();
        l.b(author2, "");
        return author2.getUid().toString();
    }

    public static final com.ss.android.ugc.aweme.commercialize.live.a.a a(AwemeRawAd awemeRawAd, String str) {
        l.d(awemeRawAd, "");
        l.d(str, "");
        return CommercializeLiveServiceImpl.a().a(awemeRawAd, str);
    }

    public static void a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i2) {
        l.d(enterRoomConfig, "");
        if (aweme != null) {
            CommercializeLiveServiceImpl.a().a(aweme, enterRoomConfig, i2);
        }
    }
}
