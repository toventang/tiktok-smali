package com.ss.android.ugc.aweme.challenge.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.MixCardStruct;
import com.ss.android.ugc.aweme.challenge.model.RoomStructV2;
import com.ss.android.ugc.aweme.challenge.ui.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69990a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43152);
    }

    public static List<Aweme> a(ChallengeAwemeList challengeAwemeList) {
        Aweme aweme;
        l.d(challengeAwemeList, "");
        List<MixCardStruct> list = challengeAwemeList.mixList;
        if (list == null || list.isEmpty()) {
            return challengeAwemeList.items;
        }
        List<MixCardStruct> list2 = challengeAwemeList.mixList;
        l.b(list2, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            if (y.f70227a.enableLiveChallenge()) {
                if (!(t2.getType() == 1 || t2.getType() == 2)) {
                }
            } else if (t2.getType() != 1) {
            }
            arrayList.add(t);
        }
        ArrayList<MixCardStruct> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (MixCardStruct mixCardStruct : arrayList2) {
            if (mixCardStruct.isLive()) {
                aweme = new Aweme();
                aweme.setAwemeType(101);
                RoomStructV2 roomInfo = mixCardStruct.getRoomInfo();
                Long l2 = null;
                aweme.setNewLiveRoomDataStr(roomInfo != null ? roomInfo.getRawdata() : null);
                StringBuilder sb = new StringBuilder();
                LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                if (newLiveRoomData != null) {
                    l2 = Long.valueOf(newLiveRoomData.id);
                }
                aweme.setAid(sb.append(l2).toString());
                aweme.setRequestId(challengeAwemeList.getRequestId());
            } else {
                aweme = mixCardStruct.getAweme();
                if (aweme == null) {
                    l.b();
                }
            }
            arrayList3.add(aweme);
        }
        return n.g((Collection) arrayList3);
    }
}
