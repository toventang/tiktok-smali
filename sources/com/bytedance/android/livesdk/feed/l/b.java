package com.bytedance.android.livesdk.feed.l;

import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f17590a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(9738);
    }

    public static void a(a aVar) {
        List<FeedItem> list;
        l.d(aVar, "");
        if (!(h.a(aVar.f17588a) || aVar.f17589b == null || (list = aVar.f17588a) == null)) {
            for (T t : list) {
                a aVar2 = aVar.f17589b;
                o oVar = null;
                if (!(aVar2 == null || aVar2.a() == null)) {
                    a aVar3 = aVar.f17589b;
                    if (aVar3 != null) {
                        oVar = aVar3.a();
                    }
                    t.logPb = String.valueOf(oVar);
                }
            }
        }
    }

    public static void a(FeedItem feedItem) {
        if (feedItem == null) {
            return;
        }
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            ag agVar = feedItem.item;
            Objects.requireNonNull(agVar, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            Room room = (Room) agVar;
            room.setLog_pb(feedItem.logPb);
            if (room.getOwner() != null) {
                User owner = room.getOwner();
                l.b(owner, "");
                owner.setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
        }
    }

    public static void a(List<? extends FeedItem> list) {
        l.d(list, "");
        if (!h.a(list)) {
            for (FeedItem feedItem : list) {
                if (feedItem.item == null) {
                    try {
                        feedItem.item = feedItem.getRoom();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
