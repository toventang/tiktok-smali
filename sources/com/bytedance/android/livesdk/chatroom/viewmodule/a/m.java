package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.view.View;
import com.bytedance.android.live.broadcast.api.g;
import com.bytedance.android.live.broadcast.utils.o;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p.e;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.n;
import com.bytedance.android.live.p.s;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.as;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.cj;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.dd;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAnchorIntroSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrisbeeTaskIconShowSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    n f16433a;

    /* renamed from: b  reason: collision with root package name */
    private Room f16434b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l> f16435c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private DataChannel f16436d;

    /* renamed from: e  reason: collision with root package name */
    private i f16437e;

    static {
        Covode.recordClassIndex(9083);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    private final void d() {
        i iVar = this.f16437e;
        if (iVar != null) {
            int i2 = n.f16438a[iVar.ordinal()];
            if (i2 == 1) {
                e();
            } else if (i2 == 2) {
                f();
            } else if (i2 == 3) {
                g();
            }
        }
    }

    public final void c() {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cw;
        h.f.b.l.b(bVar, "");
        Boolean a2 = bVar.a();
        h.f.b.l.b(a2, "");
        if (a2.booleanValue() && LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            DataChannel dataChannel = this.f16436d;
            if (dataChannel == null) {
                h.f.b.l.b();
            }
            Object b2 = dataChannel.b(as.class);
            if (b2 == null) {
                h.f.b.l.b();
            }
            if (((Boolean) b2).booleanValue()) {
                l.MORE.showRedDot(this.f16436d);
                return;
            }
        }
        l.MORE.hideRedDot(this.f16436d);
    }

    private final void f() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        DataChannel dataChannel = this.f16436d;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        List<l> list = this.f16435c;
        list.clear();
        if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            list.add(l.PAUSE_LIVE);
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable() && p.b((Boolean) DataChannelGlobal.f34575d.b(cj.class))) {
            list.add(l.INTRO);
        }
        list.add(l.SETTING);
        list.add(l.COMMENT);
        if (o.a(this.f16436d)) {
            list.add(l.TOPICS);
        }
        if (((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).enableRedEnvelope()) {
            list.add(l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z2 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IWalletService.class);
            if (a2 == null) {
                h.f.b.l.b();
            }
            d walletCenter = ((IWalletService) a2).walletCenter();
            h.f.b.l.b(walletCenter, "");
            if (walletCenter.b() > 0) {
                z2 = true;
            }
            a.EnumC0371a a3 = com.bytedance.android.livesdk.gift.b.a.a(true, z2, z);
            if (a3 != null) {
                int i2 = n.f16440c[a3.ordinal()];
                if (i2 == 1) {
                    list.add(l.DUMMY_BROADCAST_GIFT);
                } else if (i2 == 2) {
                    list.add(l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(l.STICKER_DONATION);
        }
    }

    private final void e() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        DataChannel dataChannel = this.f16436d;
        Boolean bool = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        List<l> list = this.f16435c;
        list.clear();
        list.add(l.REVERSE_CAMERA);
        list.add(l.REVERSE_MIRROR);
        if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            DataChannel dataChannel2 = this.f16436d;
            if (dataChannel2 != null) {
                bool = (Boolean) dataChannel2.b(g.class);
            }
            if (p.a(bool)) {
                list.add(l.PAUSE_LIVE);
            }
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable() && p.b((Boolean) DataChannelGlobal.f34575d.b(cj.class))) {
            list.add(l.INTRO);
        }
        list.add(l.SETTING);
        list.add(l.COMMENT);
        if (o.a(this.f16436d)) {
            list.add(l.TOPICS);
        }
        if (((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).enableRedEnvelope()) {
            list.add(l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z2 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IWalletService.class);
            if (a2 == null) {
                h.f.b.l.b();
            }
            d walletCenter = ((IWalletService) a2).walletCenter();
            h.f.b.l.b(walletCenter, "");
            if (walletCenter.b() > 0) {
                z2 = true;
            }
            a.EnumC0371a a3 = com.bytedance.android.livesdk.gift.b.a.a(true, z2, z);
            if (a3 != null) {
                int i2 = n.f16439b[a3.ordinal()];
                if (i2 == 1) {
                    list.add(l.DUMMY_BROADCAST_GIFT);
                } else if (i2 == 2) {
                    list.add(l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(l.STICKER_DONATION);
        }
    }

    private final void g() {
        boolean z;
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z2;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        Boolean bool;
        DataChannel dataChannel = this.f16436d;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        DataChannel dataChannel2 = this.f16436d;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.b(df.class);
        } else {
            room = null;
        }
        List<l> list = this.f16435c;
        list.clear();
        list.add(l.STREAM_KEY);
        if (z && !s.a(room)) {
            list.add(l.SHARE);
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable() && p.b((Boolean) DataChannelGlobal.f34575d.b(cj.class))) {
            list.add(l.INTRO);
        }
        if (o.a(this.f16436d)) {
            list.add(l.TOPICS);
        }
        list.add(l.SETTING);
        list.add(l.COMMENT);
        if (((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).enableRedEnvelope()) {
            list.add(l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z3 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IWalletService.class);
            if (a2 == null) {
                h.f.b.l.b();
            }
            d walletCenter = ((IWalletService) a2).walletCenter();
            h.f.b.l.b(walletCenter, "");
            if (walletCenter.b() > 0) {
                z3 = true;
            }
            a.EnumC0371a a3 = com.bytedance.android.livesdk.gift.b.a.a(true, z3, z2);
            if (a3 != null) {
                int i2 = n.f16441d[a3.ordinal()];
                if (i2 == 1) {
                    list.add(l.DUMMY_BROADCAST_GIFT);
                } else if (i2 == 2) {
                    list.add(l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(l.STICKER_DONATION);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(9085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(9084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            n nVar = this.this$0.f16433a;
            if (nVar != null) {
                nVar.dismiss();
            }
            return z.f158842a;
        }
    }

    public final void onClick(View view) {
        h.f.b.l.d(view, "");
        DataChannel dataChannel = this.f16436d;
        if (dataChannel != null) {
            dataChannel.c(e.class, true);
        }
        d();
        if (!h.a(this.f16435c)) {
            List<l> list = this.f16435c;
            DataChannel dataChannel2 = this.f16436d;
            if (dataChannel2 == null) {
                h.f.b.l.b();
            }
            this.f16433a = new n(list, dataChannel2);
            DataChannel dataChannel3 = this.f16436d;
            if (dataChannel3 == null) {
                h.f.b.l.b();
            }
            androidx.fragment.app.i iVar = (androidx.fragment.app.i) dataChannel3.b(ao.class);
            if (iVar != null) {
                n nVar = this.f16433a;
                if (nVar == null) {
                    h.f.b.l.b();
                }
                nVar.show(iVar, "ToolbarButtonMoreDialog");
            }
        }
        k.a(y.e());
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        h.f.b.l.b(b2, "");
        b2.c();
        Room room = this.f16434b;
        if (room == null) {
            h.f.b.l.b();
        }
        room.getId();
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("anchor_more_function_click").a(this.f16436d);
        Room room2 = this.f16434b;
        if (room2 == null) {
            h.f.b.l.b();
        }
        i streamType = room2.getStreamType();
        h.f.b.l.b(streamType, "");
        a2.a("live_type", j.a(streamType)).b();
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(dataChannel, "");
        n nVar = this.f16433a;
        if (nVar != null) {
            nVar.dismiss();
        }
        dataChannel.b(this);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        h.f.b.l.d(view, "");
        h.f.b.l.d(dataChannel, "");
        this.f16436d = dataChannel;
        this.f16434b = (Room) dataChannel.b(df.class);
        this.f16437e = (i) dataChannel.b(bx.class);
        dataChannel.a(this, com.bytedance.android.live.broadcast.api.a.class, new a(this)).b(this, dd.class, new b(this));
        d();
        c();
    }
}
