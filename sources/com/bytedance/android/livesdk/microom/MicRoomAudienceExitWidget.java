package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.aq;
import com.bytedance.android.livesdk.model.message.be;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class MicRoomAudienceExitWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f18906a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public aq f18907b;

    /* renamed from: c  reason: collision with root package name */
    public Room f18908c;

    /* renamed from: d  reason: collision with root package name */
    public long f18909d;

    /* renamed from: e  reason: collision with root package name */
    private final int f18910e = 30;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.live.j.a f18911f;

    /* renamed from: g  reason: collision with root package name */
    private long f18912g;

    /* renamed from: h  reason: collision with root package name */
    private final OnMessageListener f18913h = new c(this);

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18915a = new b();

        static {
            Covode.recordClassIndex(11255);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f18918a = new e();

        static {
            Covode.recordClassIndex(11258);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f18920a = new g();

        static {
            Covode.recordClassIndex(11260);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11253);
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
        this.f18906a.a();
    }

    public final void d() {
        long j2 = this.f18909d;
        if (j2 == 0) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.j.b());
            return;
        }
        com.bytedance.android.live.j.a aVar = this.f18911f;
        if (aVar != null) {
            aVar.jumpRoom(j2, true);
        }
    }

    public final void a() {
        aq aqVar = this.f18907b;
        if (aqVar != null) {
            long a2 = aqVar.f18981d - (com.bytedance.android.livesdk.utils.a.a.a() / 1000);
            long nextInt = (long) h.i.c.Default.nextInt(this.f18910e, (int) (((long) this.f18910e) + Math.max(1L, aqVar.f18983f)));
            if (a2 <= nextInt) {
                b();
                return;
            }
            this.f18906a.a(t.b(a2 - nextInt, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), b.f18915a));
        }
    }

    public final void b() {
        Long l2;
        long j2;
        User user;
        long j3;
        aq aqVar;
        Room room = this.f18908c;
        Long l3 = null;
        if (room == null || (aqVar = room.officialChannelInfo) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(aqVar.f18985h);
        }
        Room room2 = this.f18908c;
        if (room2 != null) {
            l3 = Long.valueOf(room2.getId());
        }
        boolean a2 = l.a(l2, l3);
        com.bytedance.android.live.j.a aVar = this.f18911f;
        long j4 = 0;
        if (aVar == null || aVar.isMicAudience() || a2) {
            MicRoomApi micRoomApi = (MicRoomApi) com.bytedance.android.live.network.e.a().a(MicRoomApi.class);
            aq aqVar2 = this.f18907b;
            if (aqVar2 == null || (user = aqVar2.f18978a) == null) {
                j2 = 0;
            } else {
                j2 = user.getId();
            }
            Room room3 = this.f18908c;
            if (room3 != null) {
                j4 = room3.getOwnerUserId();
            }
            this.f18906a.a(micRoomApi.getNextRoomData(j2, j4).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), e.f18918a));
            return;
        }
        Room room4 = this.f18908c;
        if (room4 != null) {
            j3 = room4.getId();
        } else {
            j3 = 0;
        }
        this.f18909d = j3;
        aq aqVar3 = this.f18907b;
        if (aqVar3 != null) {
            j4 = aqVar3.f18981d;
        }
        a((j4 - (com.bytedance.android.livesdk.utils.a.a.a() / 1000)) + c());
    }

    public final long c() {
        int i2;
        Object obj;
        Integer num;
        aq aqVar = this.f18907b;
        if (!(aqVar == null || aqVar.f18984g == null)) {
            aq aqVar2 = this.f18907b;
            if (aqVar2 == null) {
                l.b();
            }
            if (!aqVar2.f18984g.isEmpty()) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (num = (Integer) dataChannel.b(com.bytedance.android.livesdk.rank.api.e.class)) == null) {
                    i2 = 0;
                } else {
                    i2 = num.intValue();
                }
                aq aqVar3 = this.f18907b;
                if (aqVar3 == null) {
                    l.b();
                }
                Iterator it = n.i((Iterable) n.k(aqVar3.f18984g.keySet())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Long l2 = (Long) obj;
                    l.b(l2, "");
                    if (((long) i2) <= l2.longValue()) {
                        break;
                    }
                }
                Long l3 = (Long) obj;
                if (l3 != null) {
                    long longValue = l3.longValue();
                    aq aqVar4 = this.f18907b;
                    if (aqVar4 == null) {
                        l.b();
                    }
                    Long l4 = aqVar4.f18984g.get(Long.valueOf(longValue));
                    if (l4 != null) {
                        return l4.longValue();
                    }
                }
            }
        }
        return 30;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAudienceExitWidget f18914a;

        static {
            Covode.recordClassIndex(11254);
        }

        a(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f18914a = micRoomAudienceExitWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18914a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAudienceExitWidget f18919a;

        static {
            Covode.recordClassIndex(11259);
        }

        f(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f18919a = micRoomAudienceExitWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18919a.d();
        }
    }

    static final class c implements OnMessageListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAudienceExitWidget f18916a;

        static {
            Covode.recordClassIndex(11256);
        }

        c(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f18916a = micRoomAudienceExitWidget;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            aq aqVar;
            if ((iMessage instanceof be) && iMessage != null) {
                Room room = this.f18916a.f18908c;
                if (!(room == null || (aqVar = room.officialChannelInfo) == null)) {
                    aqVar.f18981d = ((be) iMessage).f19308a;
                }
                this.f18916a.f18906a.a();
                this.f18916a.a();
            }
        }
    }

    public final void a(long j2) {
        if (j2 <= 0) {
            d();
            return;
        }
        this.f18906a.a(t.b(j2, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), g.f18920a));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MicRoomAudienceExitWidget f18917a;

        static {
            Covode.recordClassIndex(11257);
        }

        d(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f18917a = micRoomAudienceExitWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            com.bytedance.android.livesdk.microom.a.a aVar;
            com.bytedance.android.livesdk.microom.a.a aVar2;
            com.bytedance.android.livesdk.microom.a.a aVar3;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            MicRoomAudienceExitWidget micRoomAudienceExitWidget = this.f18917a;
            long j3 = 0;
            if (dVar == null || (aVar3 = (com.bytedance.android.livesdk.microom.a.a) dVar.data) == null) {
                j2 = 0;
            } else {
                j2 = aVar3.f18921a;
            }
            micRoomAudienceExitWidget.f18909d = j2;
            if (dVar == null || (aVar = (com.bytedance.android.livesdk.microom.a.a) dVar.data) == null || Long.valueOf(aVar.f18922b) == null || ((aVar2 = (com.bytedance.android.livesdk.microom.a.a) dVar.data) != null && aVar2.f18922b == 0)) {
                aq aqVar = this.f18917a.f18907b;
                if (aqVar != null) {
                    j3 = aqVar.f18981d;
                }
            } else {
                j3 = ((com.bytedance.android.livesdk.microom.a.a) dVar.data).f18922b;
            }
            this.f18917a.a((j3 - (com.bytedance.android.livesdk.utils.a.a.a() / 1000)) + this.f18917a.c());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.dataChannel;
        aq aqVar = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f18908c = room;
        if (room != null) {
            aqVar = room.officialChannelInfo;
        }
        this.f18907b = aqVar;
        this.f18911f = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        this.f18912g = b2.c();
        a();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.b(cg.class)) != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this.f18913h);
        }
    }
}
