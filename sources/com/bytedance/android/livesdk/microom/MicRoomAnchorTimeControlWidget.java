package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.n.v;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.aq;
import com.bytedance.android.livesdk.model.message.bd;
import com.bytedance.android.livesdk.model.message.be;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.d.f;
import f.a.t;
import java.util.concurrent.TimeUnit;

public final class MicRoomAnchorTimeControlWidget extends LiveRecyclableWidget implements au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private IMessageManager f18892a;

    /* renamed from: b  reason: collision with root package name */
    private Room f18893b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f18894c;

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.b f18895d;

    static {
        Covode.recordClassIndex(11244);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        f.a.b.b bVar = this.f18894c;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f18895d;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        IMessageManager iMessageManager = this.f18892a;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public final void a() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.c(v.class, true);
        }
        Room room = this.f18893b;
        if (room != null) {
            ((d) com.bytedance.android.live.t.a.a(d.class)).setRankEnabled(room.getId(), false);
        }
    }

    public final void b() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.c(v.class, false);
        }
        Room room = this.f18893b;
        if (room != null) {
            ((d) com.bytedance.android.live.t.a.a(d.class)).setRankEnabled(room.getId(), true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAnchorTimeControlWidget f18896a;

        static {
            Covode.recordClassIndex(11245);
        }

        a(MicRoomAnchorTimeControlWidget micRoomAnchorTimeControlWidget) {
            this.f18896a = micRoomAnchorTimeControlWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18896a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAnchorTimeControlWidget f18897a;

        static {
            Covode.recordClassIndex(11246);
        }

        b(MicRoomAnchorTimeControlWidget micRoomAnchorTimeControlWidget) {
            this.f18897a = micRoomAnchorTimeControlWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18897a.a();
        }
    }

    private final void a(long j2) {
        f.a.b.b bVar = this.f18894c;
        if (bVar != null) {
            bVar.dispose();
        }
        long a2 = j2 - (com.bytedance.android.livesdk.utils.a.a.a() / 1000);
        if (a2 <= 10) {
            a();
        } else {
            this.f18894c = t.b(a2 - 10, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this));
        }
    }

    private final void b(long j2) {
        f.a.b.b bVar = this.f18895d;
        if (bVar != null) {
            bVar.dispose();
        }
        long a2 = j2 - (com.bytedance.android.livesdk.utils.a.a.a() / 1000);
        if (a2 <= 0) {
            b();
        } else {
            this.f18895d = t.b(a2, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new a(this));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        aq aqVar;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) == null) {
            iMessageManager = null;
        } else {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this);
        }
        this.f18892a = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.b(df.class);
        }
        this.f18893b = room;
        if (room != null && (aqVar = room.officialChannelInfo) != null) {
            a(aqVar.f18980c);
            b(aqVar.f18981d);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        if (iMessage != null) {
            num = Integer.valueOf(iMessage.getIntType());
        } else {
            num = null;
        }
        int intType = com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType();
        if (num != null && num.intValue() == intType) {
            if (!(iMessage instanceof bd)) {
                iMessage = null;
            }
            bd bdVar = (bd) iMessage;
            if (bdVar != null) {
                a(bdVar.f19306a);
                b(bdVar.f19307f);
                return;
            }
            return;
        }
        int intType2 = com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType();
        if (num != null && num.intValue() == intType2) {
            if (!(iMessage instanceof be)) {
                iMessage = null;
            }
            be beVar = (be) iMessage;
            if (beVar != null) {
                b(beVar.f19308a);
            }
        }
    }
}
