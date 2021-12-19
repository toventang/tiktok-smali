package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.firstrecharge.e;
import com.bytedance.android.livesdk.firstrecharge.f;
import com.bytedance.android.livesdk.firstrecharge.g;
import com.bytedance.android.livesdk.gift.e.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import java.util.List;

public final class ay implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public IMessageManager f22762a;

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f22763b;

    static {
        Covode.recordClassIndex(13415);
    }

    public static final class a extends b {
        static {
            Covode.recordClassIndex(13416);
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void a(List<u> list) {
        }

        a() {
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void b(List<GiftPage> list) {
            super.b(list);
            if (d.u.a(list)) {
                d.u.a();
                com.bytedance.android.livesdk.an.a.a().a(new g());
                d.u.k();
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.service.b());
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
                com.bytedance.android.livesdk.an.a.a().a(new f());
                e.b(a.C0355a.C0356a.f17017a.f17009e);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j2;
        boolean z;
        Room room;
        Room room2;
        d.u.c();
        GiftManager inst = GiftManager.inst();
        a aVar = new a();
        DataChannel dataChannel = this.f22763b;
        long j3 = 0;
        if (dataChannel == null || (room2 = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room2.getId();
        }
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        DataChannel dataChannel2 = this.f22763b;
        if (!(dataChannel2 == null || (room = (Room) dataChannel2.b(df.class)) == null)) {
            j3 = room.getOwnerUserId();
        }
        if (c2 == j3) {
            z = true;
        } else {
            z = false;
        }
        inst.syncGiftList(aVar, j2, 5, z);
    }
}
