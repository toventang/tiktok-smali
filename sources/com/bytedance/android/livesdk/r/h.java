package com.bytedance.android.livesdk.r;

import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f20568a;

    static {
        Covode.recordClassIndex(12145);
    }

    h(g gVar) {
        this.f20568a = gVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        com.bytedance.android.livesdk.chatroom.c.h hVar;
        g gVar = this.f20568a;
        if ((obj instanceof com.bytedance.android.livesdk.chatroom.c.h) && (hVar = (com.bytedance.android.livesdk.chatroom.c.h) obj) != null && gVar.f20564a != null && gVar.f20564a.b(df.class) != null && hVar.f15120b == ((Room) gVar.f20564a.b(df.class)).getId()) {
            gVar.f20565b = GiftManager.inst().findGiftById(hVar.f15119a);
            if (gVar.f20565b == null || hVar.f15119a <= 0) {
                l.DUMMY_FAST_GIFT.hide(gVar.f20564a);
            } else {
                l.DUMMY_FAST_GIFT.show(gVar.f20564a);
            }
            if (gVar.f20567d != null) {
                gVar.f20567d.a(gVar.f20565b);
            }
            GiftManager.inst().clearFastGift(hVar.f15120b);
        }
    }
}
