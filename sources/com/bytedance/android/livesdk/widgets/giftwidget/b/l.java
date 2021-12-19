package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f22789a;

    static {
        Covode.recordClassIndex(13431);
    }

    l(b bVar) {
        this.f22789a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f22789a;
        GiftManager.inst().syncGiftList(bVar.f22775i, ((Room) bVar.f22767a.b(df.class)).getId(), 5, u.a().b().c() == ((Room) bVar.f22767a.b(df.class)).getOwnerUserId());
        return z.f158842a;
    }
}
