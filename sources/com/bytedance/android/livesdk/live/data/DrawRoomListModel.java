package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class DrawRoomListModel {
    static {
        Covode.recordClassIndex(10457);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18673a = new a();

        static {
            Covode.recordClassIndex(10458);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.bytedance.android.live.network.response.a aVar = (com.bytedance.android.live.network.response.a) obj;
            l.d(aVar, "");
            ArrayList arrayList = new ArrayList();
            List<T> list = aVar.f12145b;
            if (list != null) {
                arrayList.addAll(list);
            }
            return Pair.create(arrayList, aVar.f12146c);
        }
    }

    private final String getObjectsStr(List<? extends Object> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(list.get(i2).toString());
            if (i2 < list.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public final void handleRoomParams(FeedItem feedItem) {
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            ag agVar = feedItem.item;
            Objects.requireNonNull(agVar, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            Room room = (Room) agVar;
            room.setLog_pb(feedItem.logPb);
            User owner = room.getOwner();
            if (owner != null) {
                owner.setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
            room.isFromRecommendCard = feedItem.isRecommendCard;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DrawRoomListModel f18674a;

        static {
            Covode.recordClassIndex(10459);
        }

        b(DrawRoomListModel drawRoomListModel) {
            this.f18674a = drawRoomListModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (!(pair == null || pair.first == null || ((List) pair.first).isEmpty() || pair.second == null)) {
                Object obj2 = pair.second;
                l.b(obj2, "");
                o a2 = ((com.bytedance.android.live.base.model.c.a) obj2).a();
                if (a2 != null) {
                    Object obj3 = pair.first;
                    l.b(obj3, "");
                    for (T t : (Iterable) obj3) {
                        t.logPb = a2.toString();
                        this.f18674a.handleRoomParams(t);
                    }
                }
            }
        }
    }

    public final t<d<Object>> collectUnreadRequest(long j2, long j3, String str, List<Long> list) {
        l.d(str, "");
        l.d(list, "");
        return ((RoomApi) e.a().a(RoomApi.class)).collectUnreadRequest(j2, j3, str, getObjectsStr(list));
    }

    public final t<Pair<List<FeedItem>, com.bytedance.android.live.base.model.c.a>> getRoomList(long j2, String str, String str2, long j3, long j4, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        t<R> b2 = ((FeedApi) e.a().a(FeedApi.class)).feed(str3, j2, str, str2, 1, j3, j4).d(a.f18673a).b(new b(this));
        l.b(b2, "");
        return b2;
    }
}
