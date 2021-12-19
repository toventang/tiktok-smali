package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import com.bytedance.android.livesdk.feed.h.a;
import com.bytedance.android.livesdk.feed.i.m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.k;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final m.b f17547a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItem f17548b;

    static {
        Covode.recordClassIndex(9715);
    }

    o(m.b bVar, FeedItem feedItem) {
        this.f17547a = bVar;
        this.f17548b = feedItem;
    }

    public final void onClick(View view) {
        m.b bVar = this.f17547a;
        FeedItem feedItem = this.f17548b;
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = m.b.d();
        }
        if (!j.f107226e) {
            ao.a(m.this.f17536c, (int) R.string.go2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedItem feedItem2 : m.this.f17535b) {
            if (feedItem2.item instanceof Room) {
                Room room = (Room) feedItem2.item;
                room.setRequestId(feedItem2.requestId());
                room.setLog_pb(feedItem2.logPb());
                arrayList.add(room);
            }
        }
        int max = Math.max(arrayList.indexOf(feedItem.item), 0);
        k.f23204a.f23205b = new a(arrayList);
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.L = "follow_live";
        enterRoomConfig.f23298b.f23311c = "";
        enterRoomConfig.f23298b.f23319k = 2;
        enterRoomConfig.f23298b.f23309a = ((Room) arrayList.get(max)).getRequestId();
        enterRoomConfig.f23298b.f23315g = ((Room) arrayList.get(max)).getLog_pb();
        enterRoomConfig.f23299c.J = "live_merge";
        enterRoomConfig.f23299c.U = true;
        enterRoomConfig.f23299c.V = max;
        enterRoomConfig.f23299c.X = "live";
        enterRoomConfig.f23299c.D = String.valueOf(((Room) arrayList.get(max)).getOwnerUserId());
        enterRoomConfig.f23299c.R = ((Room) arrayList.get(max)).getId();
        enterRoomConfig.f23299c.S = ((Room) arrayList.get(max)).getStreamType();
        ((com.bytedance.android.livesdkapi.host.j) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.j.class)).b(m.this.f17536c, enterRoomConfig);
    }
}
