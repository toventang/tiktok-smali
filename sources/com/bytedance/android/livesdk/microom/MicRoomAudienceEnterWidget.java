package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.model.message.bf;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.z;
import java.util.concurrent.TimeUnit;

public final class MicRoomAudienceEnterWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    final f.a.b.a f18898a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    private IMessageManager f18899b;

    /* renamed from: c  reason: collision with root package name */
    private long f18900c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.b<IMessage, z> f18901d = new a(this);

    final /* synthetic */ class b implements OnMessageListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f18902a;

        static {
            Covode.recordClassIndex(11250);
        }

        b(h.f.a.b bVar) {
            this.f18902a = bVar;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final /* synthetic */ void onMessage(IMessage iMessage) {
            l.b(this.f18902a.invoke(iMessage), "");
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f18905a = new d();

        static {
            Covode.recordClassIndex(11252);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11248);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        if (aVar != null) {
            aVar.jumpRoom(this.f18900c, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUnload() {
        /*
            r4 = this;
            f.a.b.a r0 = r4.f18898a
            r0.a()
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r3 = r4.f18899b
            if (r3 == 0) goto L_0x001e
            com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_USER_MESSAGE
            int r2 = r0.getIntType()
            h.f.a.b<com.ss.ugc.live.sdk.message.data.IMessage, h.z> r1 = r4.f18901d
            if (r1 == 0) goto L_0x0019
            com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b r0 = new com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b
            r0.<init>(r1)
            r1 = r0
        L_0x0019:
            com.ss.ugc.live.sdk.message.interfaces.OnMessageListener r1 = (com.ss.ugc.live.sdk.message.interfaces.OnMessageListener) r1
            r3.removeMessageListener(r2, r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget.onUnload():void");
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAudienceEnterWidget f18903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IMessage f18904b;

        static {
            Covode.recordClassIndex(11251);
        }

        c(MicRoomAudienceEnterWidget micRoomAudienceEnterWidget, IMessage iMessage) {
            this.f18903a = micRoomAudienceEnterWidget;
            this.f18904b = iMessage;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18903a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLoad(java.lang.Object[] r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L_0x003c
            java.lang.Class<com.bytedance.android.livesdk.j.cg> r0 = com.bytedance.android.livesdk.j.cg.class
            java.lang.Object r0 = r1.b(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r0
        L_0x000c:
            r4.f18899b = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L_0x0022
            java.lang.Class<com.bytedance.android.livesdk.j.df> r0 = com.bytedance.android.livesdk.j.df.class
            java.lang.Object r0 = r1.b(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L_0x0022
            long r0 = r0.getId()
            r4.f18900c = r0
        L_0x0022:
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r3 = r4.f18899b
            if (r3 == 0) goto L_0x003b
            com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_USER_MESSAGE
            int r2 = r0.getIntType()
            h.f.a.b<com.ss.ugc.live.sdk.message.data.IMessage, h.z> r1 = r4.f18901d
            if (r1 == 0) goto L_0x0036
            com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b r0 = new com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b
            r0.<init>(r1)
            r1 = r0
        L_0x0036:
            com.ss.ugc.live.sdk.message.interfaces.OnMessageListener r1 = (com.ss.ugc.live.sdk.message.interfaces.OnMessageListener) r1
            r3.addMessageListener(r2, r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget.onLoad(java.lang.Object[]):void");
    }

    static final class a extends h.f.b.m implements h.f.a.b<IMessage, z> {
        final /* synthetic */ MicRoomAudienceEnterWidget this$0;

        static {
            Covode.recordClassIndex(11249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MicRoomAudienceEnterWidget micRoomAudienceEnterWidget) {
            super(1);
            this.this$0 = micRoomAudienceEnterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(IMessage iMessage) {
            IMessage iMessage2 = iMessage;
            MicRoomAudienceEnterWidget micRoomAudienceEnterWidget = this.this$0;
            if ((iMessage2 instanceof bf) && iMessage2 != null) {
                micRoomAudienceEnterWidget.f18898a.a();
                bf bfVar = (bf) iMessage2;
                long a2 = (bfVar.f19310a - (com.bytedance.android.livesdk.utils.a.a.a() / 1000)) + ((long) h.i.c.Default.nextInt(2, (int) bfVar.f19311f));
                if (a2 <= 0) {
                    micRoomAudienceEnterWidget.a();
                } else {
                    micRoomAudienceEnterWidget.f18898a.a(t.b(a2, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(micRoomAudienceEnterWidget, iMessage2), d.f18905a));
                }
            }
            return z.f158842a;
        }
    }
}
