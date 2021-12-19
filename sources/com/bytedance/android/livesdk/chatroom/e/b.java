package com.bytedance.android.livesdk.chatroom.e;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdk.model.message.bi;
import com.bytedance.android.livesdk.model.message.c;
import com.bytedance.android.livesdk.model.message.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class b extends r<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15337a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f15338b;

    public interface a extends bq {
        static {
            Covode.recordClassIndex(8479);
        }

        void a(ag agVar);

        void a(bi biVar);

        void a(c cVar);
    }

    static {
        Covode.recordClassIndex(8478);
    }

    public final void a(a aVar) {
        super.a((bq) aVar);
        if (this.x != null) {
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.D_H5_MESSAGE.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.BANNER_UPDATE.getIntType(), this);
        }
    }

    public final String a(String str) {
        String str2;
        String c2 = e.c();
        String valueOf = String.valueOf(e.h());
        String j2 = e.j();
        String k2 = e.k();
        g gVar = new g(str);
        gVar.a("room_id", this.f15338b.getId());
        gVar.a("mode", "live_room");
        gVar.a("anchor_id", this.f15338b.getOwner().getId());
        gVar.a("is_anchor", String.valueOf(this.f15337a));
        gVar.a("enter_from", "");
        gVar.a("source_v3", c2);
        gVar.a("anchor_id", valueOf);
        gVar.a("log_pb", j2);
        gVar.a("request_id", k2);
        if (this.f15337a) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        gVar.a("event_page", str2);
        gVar.a("event_belong", "live_interact");
        return gVar.a();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.y != null) {
            if (iMessage instanceof ag) {
                ag agVar = (ag) iMessage;
                if (agVar.f19131f == 1) {
                    ((a) this.y).a(agVar);
                    return;
                }
            }
            if (iMessage instanceof bi) {
                bi biVar = (bi) iMessage;
                if (!TextUtils.isEmpty(biVar.f19331f)) {
                    ((a) this.y).a(biVar);
                }
            } else if (iMessage instanceof d) {
                d dVar = (d) iMessage;
                if (dVar.f19503a != null) {
                    ((a) this.y).a(dVar.f19503a);
                }
            }
        }
    }

    public b(Room room, boolean z) {
        this.f15338b = room;
        this.f15337a = z;
    }
}
