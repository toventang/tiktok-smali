package com.bytedance.android.livesdk.r;

import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.chatroom.c.h;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    u f20574a;

    /* renamed from: b  reason: collision with root package name */
    DataChannel f20575b;

    /* renamed from: c  reason: collision with root package name */
    final f.a.b.a f20576c;

    /* renamed from: d  reason: collision with root package name */
    a f20577d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20578e = true;

    public interface a {
        static {
            Covode.recordClassIndex(12150);
        }

        void a(u uVar);

        void setImageDrawable(int i2);
    }

    static {
        Covode.recordClassIndex(12149);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        u uVar = this.f20574a;
        if (uVar != null) {
            this.f20578e = j.a(uVar.f19761d);
        }
    }

    public k(a aVar, DataChannel dataChannel) {
        f.a.b.a aVar2 = new f.a.b.a();
        this.f20576c = aVar2;
        this.f20577d = aVar;
        this.f20575b = dataChannel;
        if (dataChannel != null && dataChannel.b(df.class) != null) {
            if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
                this.f20577d.setImageDrawable(2131234325);
            } else {
                l.FAST_GIFT.hide(this.f20575b);
            }
            long id = ((Room) this.f20575b.b(df.class)).getId();
            u fastGift = GiftManager.inst().getFastGift(id);
            if (fastGift != null) {
                this.f20574a = fastGift;
                l.FAST_GIFT.show(this.f20575b);
                a aVar3 = this.f20577d;
                if (aVar3 != null) {
                    aVar3.a(this.f20574a);
                }
            }
            a();
            aVar2.a(com.bytedance.android.livesdk.an.a.a().a(h.class).d(new l(this, id)));
        }
    }
}
