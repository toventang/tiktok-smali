package com.bytedance.android.livesdk.olddialog.b;

import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.firstrecharge.e;
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

public final class a implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0406a f20010a;

    /* renamed from: b  reason: collision with root package name */
    public IMessageManager f20011b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f20012c;

    /* renamed from: d  reason: collision with root package name */
    public String f20013d = "";

    /* renamed from: com.bytedance.android.livesdk.olddialog.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0406a {
        static {
            Covode.recordClassIndex(11821);
        }

        void e();
    }

    static {
        Covode.recordClassIndex(11820);
    }

    public static final class b extends com.bytedance.android.livesdk.gift.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20014a;

        static {
            Covode.recordClassIndex(11822);
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void a(List<u> list) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f20014a = aVar;
        }

        @Override // com.bytedance.android.livesdk.gift.e.b
        public final void b(List<GiftPage> list) {
            super.b(list);
            if (d.u.a(list)) {
                d.u.a();
                AbstractC0406a aVar = this.f20014a.f20010a;
                if (aVar != null) {
                    aVar.e();
                }
                e.b(this.f20014a.f20013d);
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
        b bVar = new b(this);
        DataChannel dataChannel = this.f20012c;
        long j3 = 0;
        if (dataChannel == null || (room2 = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room2.getId();
        }
        f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        DataChannel dataChannel2 = this.f20012c;
        if (!(dataChannel2 == null || (room = (Room) dataChannel2.b(df.class)) == null)) {
            j3 = room.getOwnerUserId();
        }
        if (c2 == j3) {
            z = true;
        } else {
            z = false;
        }
        inst.syncGiftList(bVar, j2, 5, z);
    }
}
