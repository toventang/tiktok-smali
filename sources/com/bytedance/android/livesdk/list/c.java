package com.bytedance.android.livesdk.list;

import android.util.Pair;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;
import java.util.List;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MultiPlusFeedRoomListProvider f18634a;

    static {
        Covode.recordClassIndex(10438);
    }

    c(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f18634a = multiPlusFeedRoomListProvider;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f18634a;
        Pair pair = (Pair) obj;
        multiPlusFeedRoomListProvider.f18614d = false;
        if (pair != null) {
            multiPlusFeedRoomListProvider.f18616f = (a) pair.second;
            List<FeedItem> list = (List) pair.first;
            if (list != null && !list.isEmpty()) {
                for (FeedItem feedItem : list) {
                    if (feedItem.item == null) {
                        try {
                            feedItem.item = feedItem.getRoom();
                            if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
                                Room room = (Room) feedItem.item;
                                room.setLog_pb(feedItem.logPb);
                                room.getOwner().setLogPb(feedItem.logPb);
                                room.setRequestId(feedItem.resId);
                                room.isFromRecommendCard = feedItem.isRecommendCard;
                                feedItem.item = room;
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (feedItem.item instanceof Room) {
                        Room room2 = (Room) feedItem.item;
                        if (multiPlusFeedRoomListProvider.f18620j.longValue() == room2.getOwner().getLiveRoomId()) {
                            com.bytedance.android.live.core.c.a.a(3, "MultiPlusFeedRoomListProvider", "Remove duplicate room " + multiPlusFeedRoomListProvider.f18620j);
                        } else if (!multiPlusFeedRoomListProvider.n.contains(Long.valueOf(room2.getId()))) {
                            EnterRoomConfig a2 = com.bytedance.android.livesdkapi.g.a.a(room2, false);
                            if (m.a(a2.f23297a.f23340d) && m.a(a2.f23297a.f23338b)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("roomid", Long.valueOf(a2.f23299c.R));
                                com.bytedance.android.live.core.d.c.a("ttlive_webcast_feed_empty_stream", 0, hashMap);
                            }
                            multiPlusFeedRoomListProvider.n.add(Long.valueOf(room2.getId()));
                            if (multiPlusFeedRoomListProvider.f18617g) {
                                a2.f23299c.O = multiPlusFeedRoomListProvider.f18617g;
                                a2.f23299c.P = multiPlusFeedRoomListProvider.f18618h;
                                a2.f23299c.Q = multiPlusFeedRoomListProvider.f18619i;
                                a2.f23299c.A = multiPlusFeedRoomListProvider.f18623m;
                                a2.f23299c.W = "full_screen";
                            }
                            multiPlusFeedRoomListProvider.f18621k.add(room2);
                            multiPlusFeedRoomListProvider.f18622l.add(a2);
                        }
                    }
                }
                multiPlusFeedRoomListProvider.a(list);
            }
            multiPlusFeedRoomListProvider.f();
        }
    }
}
