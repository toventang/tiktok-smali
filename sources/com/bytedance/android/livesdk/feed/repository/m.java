package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.livesdk.feed.a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.e;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.g;
import java.util.ArrayList;

final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17636a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17637b;

    static {
        Covode.recordClassIndex(9777);
    }

    m(FeedRepository.a aVar, boolean z) {
        this.f17636a = aVar;
        this.f17637b = z;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        a.EnumC0361a aVar;
        String str;
        FeedRepository.a aVar2 = this.f17636a;
        boolean z = this.f17637b;
        com.bytedance.android.live.network.response.a aVar3 = (com.bytedance.android.live.network.response.a) obj;
        ArrayList<FeedItem> arrayList = new ArrayList(aVar3.f12145b);
        if (aVar2.f17618h != 0 && !arrayList.isEmpty()) {
            FeedItem feedItem = (FeedItem) arrayList.get(0);
            if (feedItem.item != null && feedItem.item.getId() == aVar2.f17618h) {
                feedItem.repeatDisable = true;
            }
        }
        com.bytedance.android.live.base.model.c.a aVar4 = (com.bytedance.android.live.base.model.c.a) aVar3.f12146c;
        if (!h.a(arrayList)) {
            for (FeedItem feedItem2 : arrayList) {
                if (feedItem2 != null) {
                    if (aVar4 != null && (feedItem2.type == 1 || feedItem2.type == 2)) {
                        Room room = (Room) feedItem2.item;
                        if (aVar4.a() != null) {
                            room.setLog_pb(aVar4.a().toString());
                            if (room.getOwner() != null) {
                                room.getOwner().setLogPb(aVar4.a().toString());
                            }
                        }
                        room.setRequestId(feedItem2.resId);
                    }
                    if (feedItem2.type == 1 && (feedItem2.item instanceof Room)) {
                        ((Room) feedItem2.item).isFromRecommendCard = feedItem2.isRecommendCard;
                    }
                    if (aVar4 != null && feedItem2.type == 3) {
                        e eVar = (e) feedItem2.item;
                        if (aVar4.a() != null) {
                            eVar.J = aVar4.a().toString();
                        }
                        eVar.I = feedItem2.resId;
                    }
                }
            }
        }
        aVar2.f17615e.a(aVar2.f17612b, arrayList, aVar4, z);
        if (z) {
            aVar2.f17611a = arrayList.size();
        } else {
            aVar2.f17611a += arrayList.size();
        }
        a aVar5 = aVar2.f17619i;
        if (z) {
            aVar = a.EnumC0361a.REFRESH;
            str = aVar2.f17613c;
        } else {
            aVar = a.EnumC0361a.LOAD_MORE;
            str = aVar2.f17614d;
        }
        aVar5.b(aVar, str);
        return Pair.create(arrayList, aVar3.f12146c);
    }
}
