package com.bytedance.android.livesdk.rank.impl.e;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.f.a;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceAreaListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveOnlineAudienceListSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.ca;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.b.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class b implements a.AbstractC0151a, a.AbstractC0414a, OnMessageListener {

    /* renamed from: g  reason: collision with root package name */
    public static final a f20675g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.rank.impl.widget.a f20676a;

    /* renamed from: b  reason: collision with root package name */
    public int f20677b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.bytedance.android.livesdk.rank.api.model.a> f20678c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20679d;

    /* renamed from: e  reason: collision with root package name */
    boolean f20680e;

    /* renamed from: f  reason: collision with root package name */
    public final DataChannel f20681f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20682h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20683i;

    /* renamed from: j  reason: collision with root package name */
    private a.b f20684j;

    /* renamed from: k  reason: collision with root package name */
    private f.a.b.b f20685k;

    /* renamed from: l  reason: collision with root package name */
    private f.a.b.b f20686l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f20687m;
    private final h.h n;
    private final h.h o;
    private boolean p;
    private Room q;
    private final f.a.b.a r;

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f20693a = new g();

        static {
            Covode.recordClassIndex(12229);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12222);
    }

    private final boolean f() {
        return ((Boolean) this.f20687m.getValue()).booleanValue();
    }

    private final boolean g() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12223);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final int d() {
        return this.f20677b;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final com.bytedance.android.livesdk.rank.impl.widget.a a() {
        com.bytedance.android.livesdk.rank.impl.widget.a aVar = this.f20676a;
        if (aVar == null) {
            return com.bytedance.android.livesdk.rank.impl.widget.a.SELF_NON_ANCHOR_REVENUE;
        }
        return aVar;
    }

    static final class i extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f20694a = new i();

        static {
            Covode.recordClassIndex(12231);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(LiveOnlineAudienceListSetting.INSTANCE.getValue());
        }
    }

    static final class h extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool = (Boolean) this.this$0.f20681f.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(l.a(this.this$0.f20681f.b(cp.class), (Object) true));
        }
    }

    private final boolean h() {
        if (!((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).shouldShowUserCount(this.q)) {
            return false;
        }
        return i();
    }

    private final boolean i() {
        if (f()) {
            return true;
        }
        boolean isMicRoom = ((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoom();
        if (g() || isMicRoom) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final boolean b() {
        boolean z;
        try {
            if (h()) {
                Boolean bool = (Boolean) this.f20681f.b(ee.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (!z && this.f20676a != com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final void c() {
        this.r.a();
        this.f20684j = null;
        IMessageManager iMessageManager = (IMessageManager) this.f20681f.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f20677b = 0;
        this.f20678c.clear();
        f.a.b.b bVar = this.f20685k;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f20686l;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    private final boolean j() {
        if (!this.p) {
            return false;
        }
        try {
            if (this.f20676a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (!i()) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!((Boolean) this.n.getValue()).booleanValue() || (!f() && this.f20676a != com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE)) {
                return false;
            } else {
                return true;
            }
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void e() {
        try {
            if (this.f20684j == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (!this.f20679d) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f20680e || this.f20677b > 0) {
                if (h()) {
                    a.b bVar = this.f20684j;
                    if (bVar != null) {
                        bVar.a(this.f20677b);
                    }
                    if (!this.f20682h && this.f20683i) {
                        this.f20682h = true;
                        com.bytedance.android.livesdk.rank.impl.f.l.a(this.f20681f, "top_right");
                    }
                } else {
                    a.b bVar2 = this.f20684j;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                }
                if (j()) {
                    a.b bVar3 = this.f20684j;
                    if (bVar3 != null) {
                        bVar3.b();
                    }
                    a.b bVar4 = this.f20684j;
                    if (bVar4 != null) {
                        bVar4.a(this.f20678c);
                    }
                } else {
                    a.b bVar5 = this.f20684j;
                    if (bVar5 != null) {
                        bVar5.c();
                    }
                }
                this.f20680e = false;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$b  reason: collision with other inner class name */
    static final class C0418b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20688a;

        static {
            Covode.recordClassIndex(12224);
        }

        C0418b(b bVar) {
            this.f20688a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f20688a.e();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final void b(boolean z) {
        this.f20683i = z;
        if (!z) {
            this.f20682h = false;
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20689a;

        static {
            Covode.recordClassIndex(12225);
        }

        c(b bVar) {
            this.f20689a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.bytedance.android.livesdk.rank.api.a.a) obj).f20582b == 1) {
                b bVar = this.f20689a;
                bVar.f20680e = false;
                bVar.e();
            }
        }
    }

    @Override // com.bytedance.android.live.f.a.AbstractC0151a
    public final void a(boolean z) {
        a.b bVar;
        if (!z && (bVar = this.f20684j) != null) {
            bVar.d();
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20691a;

        static {
            Covode.recordClassIndex(12227);
        }

        e(b bVar) {
            this.f20691a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.bytedance.android.livesdk.rank.impl.widget.a aVar;
            this.f20691a.f20679d = true;
            Boolean bool = (Boolean) this.f20691a.f20681f.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            b bVar = this.f20691a;
            if (!z) {
                aVar = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_NON_REVENUE;
            } else if (LiveAudienceAreaListSetting.INSTANCE.getValue()) {
                aVar = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE;
            } else {
                aVar = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_NON_REVENUE;
            }
            bVar.f20676a = aVar;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f20692a = new f();

        static {
            Covode.recordClassIndex(12228);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<com.bytedance.android.livesdk.rank.impl.api.model.e> arrayList;
            com.bytedance.android.livesdk.rank.impl.api.model.f fVar = (com.bytedance.android.livesdk.rank.impl.api.model.f) ((com.bytedance.android.live.network.response.d) obj).data;
            if (fVar != null && (arrayList = fVar.f20646a) != null && !arrayList.isEmpty()) {
                Iterator<com.bytedance.android.livesdk.rank.impl.api.model.e> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.bytedance.android.livesdk.rank.impl.api.model.e next = it.next();
                    if (next.f20643a == com.bytedance.android.livesdk.rank.impl.api.model.g.ONLINE_AUDIENCE.getValue()) {
                        com.bytedance.android.livesdk.rank.impl.d.b a2 = com.bytedance.android.livesdk.rank.impl.d.b.a();
                        l.b(a2, "");
                        a2.f20665e = next;
                        return;
                    }
                }
            }
        }
    }

    public b(DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        l.d(dataChannel, "");
        this.f20681f = dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f20683i = z;
        this.f20678c = new ArrayList();
        this.f20680e = true;
        this.f20687m = h.i.a((h.f.a.a) new h(this));
        this.n = h.i.a((h.f.a.a) new j(this));
        this.o = h.i.a((h.f.a.a) i.f20694a);
        this.r = new f.a.b.a();
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20690a;

        static {
            Covode.recordClassIndex(12226);
        }

        d(b bVar) {
            this.f20690a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            com.bytedance.android.livesdk.rank.impl.widget.a aVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f20690a.f20679d = true;
            if (dVar != null) {
                try {
                    com.bytedance.android.livesdk.rank.api.model.g gVar = (com.bytedance.android.livesdk.rank.api.model.g) dVar.data;
                    if (!(gVar == null || gVar.f20601a == null)) {
                        com.bytedance.android.livesdk.rank.impl.d.b.a().f20664d = ((com.bytedance.android.livesdk.rank.api.model.g) dVar.data).f20601a;
                        com.bytedance.android.livesdk.rank.impl.d.b a2 = com.bytedance.android.livesdk.rank.impl.d.b.a();
                        com.bytedance.android.livesdk.rank.api.model.h hVar = ((com.bytedance.android.livesdk.rank.api.model.g) dVar.data).f20602b;
                        if (hVar != null) {
                            j2 = hVar.f20608b;
                        } else {
                            j2 = 0;
                        }
                        a2.f20666f = j2;
                        boolean value = LiveAudienceAreaListSetting.INSTANCE.getValue();
                        boolean z = ((com.bytedance.android.livesdk.rank.api.model.g) dVar.data).f20604d;
                        b bVar = this.f20690a;
                        if (value) {
                            if (z) {
                                aVar = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE;
                            } else {
                                aVar = com.bytedance.android.livesdk.rank.impl.widget.a.SELF_REVENUE_ANCHOR_NON;
                            }
                        } else if (z) {
                            aVar = com.bytedance.android.livesdk.rank.impl.widget.a.SELF_NON_ANCHOR_REVENUE;
                        } else {
                            aVar = com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_NON_REVENUE;
                        }
                        bVar.f20676a = aVar;
                        this.f20690a.f20678c.clear();
                        List<com.bytedance.android.livesdk.rank.api.model.h> list = ((com.bytedance.android.livesdk.rank.api.model.g) dVar.data).f20601a;
                        l.b(list, "");
                        List d2 = n.d((Iterable) n.g((Iterable) list), 3);
                        ArrayList<T> arrayList = new ArrayList(n.a((Iterable) d2, 10));
                        for (T t : d2) {
                            l.d(t, "");
                            User user = t.f20607a;
                            l.b(user, "");
                            arrayList.add(new com.bytedance.android.livesdk.rank.api.model.a(user, t.f20608b, t.f20609c));
                        }
                        for (T t2 : arrayList) {
                            this.f20690a.f20678c.add(t2);
                        }
                        com.bytedance.android.livesdk.rank.api.model.g gVar2 = (com.bytedance.android.livesdk.rank.api.model.g) dVar.data;
                        if (gVar2 != null && gVar2.f20606f > 0) {
                            this.f20690a.f20677b = ((com.bytedance.android.livesdk.rank.api.model.g) dVar.data).f20606f;
                            return;
                        }
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: java.util.List<com.bytedance.android.livesdk.rank.api.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (iMessage instanceof ca) {
            try {
                if (((ca) iMessage).f19456f == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (this.f20676a != null) {
                    ca caVar = (ca) iMessage;
                    this.f20681f.a(com.bytedance.android.livesdk.rank.api.e.class, Integer.valueOf((int) caVar.f19455a));
                    this.f20677b = (int) caVar.f19455a;
                    ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).updateGameMessageViewUserCount(this.f20677b);
                    this.f20678c.clear();
                    List<com.bytedance.android.livesdk.model.message.m> list = caVar.f19456f;
                    l.b(list, "");
                    List<com.bytedance.android.livesdk.model.message.m> d2 = n.d((Iterable) n.g((Iterable) list), 3);
                    ArrayList<Object> arrayList = new ArrayList(n.a((Iterable) d2, 10));
                    for (com.bytedance.android.livesdk.model.message.m mVar : d2) {
                        l.d(mVar, "");
                        User user = mVar.f19652a;
                        l.b(user, "");
                        arrayList.add(new com.bytedance.android.livesdk.rank.api.model.a(user, mVar.f19653b, (int) mVar.f19654c));
                    }
                    for (Object obj : arrayList) {
                        this.f20678c.add(obj);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (Exception unused) {
            }
        } else if (iMessage instanceof cb) {
            cb cbVar = (cb) iMessage;
            if (cbVar.f19460a == 34) {
                Room room = this.q;
                if (!(room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null)) {
                    roomAuthStatus2.setEnableViewers(true);
                }
                this.p = true;
            } else if (cbVar.f19460a == 35) {
                Room room2 = this.q;
                if (!(room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null)) {
                    roomAuthStatus.setEnableViewers(false);
                }
                this.p = false;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.a.AbstractC0414a
    public final void a(a.b bVar) {
        boolean z;
        int i2;
        long j2;
        long j3;
        RoomAuthStatus roomAuthStatus;
        l.d(bVar, "");
        this.f20684j = bVar;
        Room room = (Room) this.f20681f.b(df.class);
        this.q = room;
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableViewers()) {
            z = false;
        } else {
            z = true;
        }
        this.p = z;
        IMessageManager iMessageManager = (IMessageManager) this.f20681f.b(cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.USER_SEQ.getIntType(), this);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
        Room room2 = (Room) this.f20681f.b(df.class);
        if (room2 != null) {
            i2 = room2.getUserCount();
        } else {
            i2 = 0;
        }
        this.f20677b = i2;
        this.f20681f.a(com.bytedance.android.livesdk.rank.api.e.class, Integer.valueOf(i2));
        long j4 = 0;
        try {
            Room room3 = (Room) this.f20681f.b(df.class);
            if (room3 != null) {
                j2 = room3.getId();
            } else {
                j2 = 0;
            }
            Room room4 = (Room) this.f20681f.b(df.class);
            if (room4 != null) {
                j3 = room4.getOwnerUserId();
            } else {
                j3 = 0;
            }
            if (j2 == 0 || j3 == 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f20685k = ((RankApi) com.bytedance.android.live.network.e.a().a(RankApi.class)).getOnlineRankList(j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new d(this), new e(this));
            f.a.b.b bVar2 = this.f20686l;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f20686l = t.a(2, TimeUnit.SECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).d(new C0418b(this));
            Room room5 = (Room) this.f20681f.b(df.class);
            if (room5 != null) {
                j4 = room5.getId();
            }
            this.f20685k = ((RankApi) com.bytedance.android.live.network.e.a().a(RankApi.class)).getScoreDisplayConfig(j4, String.valueOf(com.bytedance.android.livesdk.rank.impl.api.model.g.ONLINE_AUDIENCE.getValue())).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(f.f20692a, g.f20693a);
            Room room6 = this.q;
            if (room6 != null) {
                ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).addOnUserCountVisibilityChangeListener(room6.getId(), this);
            }
            this.r.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.rank.api.a.a.class).d(new c(this)));
        } catch (IllegalStateException unused) {
        }
    }
}
