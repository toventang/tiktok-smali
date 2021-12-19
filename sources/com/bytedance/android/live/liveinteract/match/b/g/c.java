package com.bytedance.android.live.liveinteract.match.b.g;

import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.model.message.aq;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.a.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c implements OnMessageListener {
    public static final a D = new a((byte) 0);
    public com.bytedance.android.livesdkapi.depend.model.live.a.f A;
    public boolean B;
    public DataChannel C;
    private f.a.b.b E;
    private long F;
    private long G = 3;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10779a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10780b;

    /* renamed from: c  reason: collision with root package name */
    public b f10781c;

    /* renamed from: d  reason: collision with root package name */
    public IMessageManager f10782d;

    /* renamed from: e  reason: collision with root package name */
    public Room f10783e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10784f;

    /* renamed from: g  reason: collision with root package name */
    public long f10785g = -1;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.match.b.b.d f10786h = com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED;

    /* renamed from: i  reason: collision with root package name */
    public List<k> f10787i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public long f10788j;

    /* renamed from: k  reason: collision with root package name */
    public long f10789k = -1;

    /* renamed from: l  reason: collision with root package name */
    public long f10790l = 30;

    /* renamed from: m  reason: collision with root package name */
    public long f10791m = 1;
    public long n = 10;
    public long o;
    public d p = d.DEFAULT;
    public long q;
    public long r;
    public com.bytedance.android.livesdkapi.depend.model.live.a.f s;
    public long t = -1;
    public long u = 10;
    public long v;
    public com.bytedance.android.livesdkapi.depend.model.live.a.f w;
    public com.bytedance.android.livesdkapi.depend.model.live.a.f x;
    public com.bytedance.android.livesdkapi.depend.model.live.a.f y;
    public com.bytedance.android.livesdkapi.depend.model.live.a.f z;

    public interface b {
        static {
            Covode.recordClassIndex(5766);
        }

        void a();

        void a(long j2, com.bytedance.android.live.liveinteract.match.b.b.d dVar);

        void b();
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10795a;

        static {
            Covode.recordClassIndex(5773);
        }

        i(c cVar) {
            this.f10795a = cVar;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5764);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5765);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final long b() {
        long j2 = this.G;
        if (j2 <= 1) {
            return 3;
        }
        return j2;
    }

    private final void c() {
        f.a.b.b bVar;
        f.a.b.b bVar2 = this.E;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.E) == null)) {
            bVar.dispose();
        }
        this.B = false;
        this.E = com.bytedance.android.livesdk.utils.b.b.a(100, TimeUnit.MILLISECONDS).b(10).a(new h(this), new i(this));
    }

    public final void a() {
        this.f10779a = false;
        this.f10784f = false;
        this.f10785g = -1;
        this.f10786h = com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED;
        this.f10787i = new ArrayList();
        this.f10788j = 0;
        this.F = 0;
        this.f10789k = -1;
        this.f10790l = 30;
        this.f10791m = 1;
        this.n = 10;
        this.o = 0;
        this.p = d.DEFAULT;
        this.q = 0;
        this.t = 0;
        this.u = 10;
        this.v = 0;
        this.G = 3;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10793a;

        static {
            Covode.recordClassIndex(5771);
        }

        g(c cVar) {
            this.f10793a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (this.f10793a.f10781c != null) {
                com.bytedance.android.live.liveinteract.match.c.a.a("audience_result", th);
            }
        }
    }

    public static final class e extends m implements h.f.a.b<com.bytedance.android.live.liveinteract.match.b.b.c, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.match.b.b.c cVar) {
            com.bytedance.android.live.liveinteract.match.b.b.c cVar2 = cVar;
            l.d(cVar2, "");
            if (cVar2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.START) < 0 || cVar2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) >= 0) {
                c cVar3 = this.this$0;
                cVar3.a(cVar3.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED);
                this.this$0.a();
            }
            return z.f158842a;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10792a;

        static {
            Covode.recordClassIndex(5770);
        }

        f(c cVar) {
            this.f10792a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (this.f10792a.f10781c != null) {
                com.bytedance.android.livesdkapi.depend.model.live.a.e eVar = (com.bytedance.android.livesdkapi.depend.model.live.a.e) dVar.data;
                String b2 = e.a.f9629c.b(eVar);
                l.b(b2, "");
                com.bytedance.android.live.liveinteract.match.c.a.a("audience_result", b2);
                com.bytedance.android.livesdkapi.depend.model.live.a.h hVar = eVar.f23082k;
                if (hVar != null) {
                    com.bytedance.android.livesdkapi.depend.model.live.a.b bVar = hVar.f23087a;
                    if (bVar != null) {
                        this.f10792a.a(bVar);
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.c cVar = hVar.f23088b;
                    if (cVar != null) {
                        this.f10792a.a(cVar);
                    }
                }
            }
        }
    }

    public c(DataChannel dataChannel) {
        this.C = dataChannel;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.b.g.c$c  reason: collision with other inner class name */
    public static final class C0201c extends m implements h.f.a.b<Long, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0201c(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            long longValue = l2.longValue();
            this.this$0.f10785g = longValue;
            if (this.this$0.f10779a) {
                DataChannel dataChannel = this.this$0.C;
                com.bytedance.android.live.liveinteract.match.b.b.c cVar = null;
                if (!(dataChannel == null || dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.l.class) == null)) {
                    DataChannel dataChannel2 = this.this$0.C;
                    if (dataChannel2 == null || (cVar = (com.bytedance.android.live.liveinteract.match.b.b.c) dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.l.class)) == null) {
                        l.b();
                    }
                    if (cVar.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) >= 0) {
                        this.this$0.a();
                    }
                }
                this.this$0.a(longValue);
            }
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(5768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            if (this.this$0.f10779a && !this.this$0.f10780b && this.this$0.f10781c != null && !this.this$0.f10784f && this.this$0.f10786h == com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS) {
                this.this$0.f10784f = true;
                b bVar = this.this$0.f10781c;
                if (bVar != null) {
                    bVar.a();
                }
                b bVar2 = this.this$0.f10781c;
                if (bVar2 != null) {
                    bVar2.a(this.this$0.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10794a;

        static {
            Covode.recordClassIndex(5772);
        }

        h(c cVar) {
            this.f10794a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue();
            if (this.f10794a.f10781c != null) {
                com.bytedance.android.live.core.c.a.a(3, "BattleTask", "Critical point second = ".concat(String.valueOf(longValue)));
                if (longValue >= 8 && !this.f10794a.B) {
                    c cVar = this.f10794a;
                    if (cVar.f10781c != null && cVar.f10783e != null && !cVar.B) {
                        cVar.B = true;
                        long c2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c();
                        long b2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b();
                        com.bytedance.android.live.liveinteract.match.c.a.a("audience_result");
                        LinkBattleApi linkBattleApi = (LinkBattleApi) com.bytedance.android.live.network.e.a().a(LinkBattleApi.class);
                        Room room = cVar.f10783e;
                        if (room == null) {
                            l.b();
                        }
                        long id = room.getId();
                        Room room2 = cVar.f10783e;
                        if (room2 == null) {
                            l.b();
                        }
                        linkBattleApi.getInfo(id, c2, b2, room2.getOwnerUserId()).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new f(cVar), new g(cVar));
                    }
                }
            }
        }
    }

    public final void a(long j2) {
        long j3 = this.f10788j;
        if (this.f10789k + 1 <= j2 && j3 >= j2) {
            a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_NOTICE);
        } else if (this.p == d.DEFAULT && j2 == this.t + 1) {
            c();
            a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS);
        } else if (this.p != d.DEFAULT || j2 <= this.t || j2 > this.f10789k) {
            if (this.p == d.FAILED) {
                long j4 = this.q;
                if (j4 > 0 && j2 < this.f10789k && j2 >= j4 - 3) {
                    a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_FAILED);
                    return;
                }
            }
            if (this.p == d.FAILED) {
                long j5 = this.q;
                if (j5 > 0) {
                    long j6 = this.t;
                    if (j6 > 0 && (j2 < j5 - 3 || j2 < j6 - 3)) {
                        a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED);
                        return;
                    }
                }
            }
            if ((this.p == d.SUCCEED || this.p == d.BOTH_SUCCEED) && j2 < this.f10789k && j2 >= this.t) {
                a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED);
                return;
            }
            if (this.p == d.SUCCEED || this.p == d.BOTH_SUCCEED) {
                long j7 = this.t;
                if (j2 < j7 && j2 == (j7 - this.u) + 1) {
                    c();
                    a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_IN_PROCESS);
                    return;
                }
            }
            if (this.p == d.SUCCEED || this.p == d.BOTH_SUCCEED) {
                long j8 = this.t;
                if (j2 <= j8 && j2 > j8 - this.u) {
                    a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_IN_PROCESS);
                    return;
                }
            }
            if (this.p == d.SUCCEED || this.p == d.BOTH_SUCCEED) {
                long j9 = this.v;
                if (j9 > 0) {
                    long j10 = this.t;
                    if (j10 > 0 && j10 > 0 && this.u > 0 && j2 <= j9 - b()) {
                        a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED);
                        return;
                    }
                }
            }
            a(j2, this.f10786h);
        } else {
            a(j2, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        com.bytedance.android.livesdkapi.depend.model.live.a.b bVar;
        com.bytedance.android.livesdk.model.message.b.m mVar;
        if (iMessage != null && this.f10781c != null && this.f10783e != null && EnableBattleEggSetting.INSTANCE.getValue()) {
            if (iMessage instanceof com.bytedance.android.livesdkapi.h.a) {
                long j2 = ((com.bytedance.android.livesdkapi.h.a) iMessage).O.f23209a / 1000;
                Room room = this.f10783e;
                if (room == null) {
                    l.b();
                }
                if (j2 < room.nowTime) {
                    com.bytedance.android.live.core.c.a.a(4, "MatchTaskPresenterTag", "onMessage, return message is old");
                    return;
                }
            }
            if (iMessage instanceof aq) {
                aq aqVar = (aq) iMessage;
                boolean z2 = this.f10780b;
                l.d(aqVar, "");
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.core.d.a.a(jSONObject, "message_create_time", aqVar.O.f23209a);
                com.bytedance.android.live.core.d.a.a(jSONObject, "message_fetch_time", aqVar.M);
                com.bytedance.android.live.core.d.a.a(jSONObject, "message", e.a.f9628b.b(aqVar));
                if (z2) {
                    com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "battle_task_message", jSONObject, false, 12);
                } else {
                    com.bytedance.android.live.liveinteract.match.c.a.f10803g.a("battle_task_message", jSONObject, 0);
                }
                int i2 = aqVar.f19185a;
                if (i2 == 0) {
                    this.p = d.DEFAULT;
                    com.bytedance.android.livesdk.model.message.b.l lVar = aqVar.f19186f;
                    if (lVar != null && (bVar = lVar.f19280a) != null) {
                        a(bVar);
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        com.bytedance.android.livesdk.model.message.b.k kVar = aqVar.f19188h;
                        if (kVar != null) {
                            int i3 = kVar.f19278a;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 == 2 && this.p != d.FAILED) {
                                        this.p = d.BOTH_SUCCEED;
                                        this.o = this.n;
                                        if (kVar.f19279b > 0) {
                                            this.t = kVar.f19279b;
                                        }
                                        a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED);
                                    }
                                } else if (this.p != d.SUCCEED && this.p != d.BOTH_SUCCEED) {
                                    this.q = this.f10785g;
                                    this.p = d.FAILED;
                                    a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_FAILED);
                                }
                            } else if (this.p != d.FAILED) {
                                this.p = d.SUCCEED;
                                this.o = this.n;
                                if (kVar.f19279b > 0) {
                                    this.t = kVar.f19279b;
                                }
                                a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED);
                            }
                        }
                    } else if (i2 == 3) {
                        if (!(this.p == d.SUCCEED || this.p == d.BOTH_SUCCEED)) {
                            this.p = d.SUCCEED;
                        }
                        com.bytedance.android.livesdk.model.message.b.i iVar = aqVar.f19189i;
                        if (iVar != null) {
                            this.z = iVar.f19270a;
                            long j3 = this.f10785g;
                            if (j3 <= this.t - this.u && this.v == 0) {
                                this.v = j3;
                            }
                            if (this.f10786h != com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED) {
                                a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_FINISHED);
                            }
                        }
                    }
                } else if (this.p == d.DEFAULT && (mVar = aqVar.f19187g) != null) {
                    if (this.o < mVar.f19281a) {
                        this.o = mVar.f19281a;
                    }
                    a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS);
                    b bVar2 = this.f10781c;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                }
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a.b bVar) {
        l.d(bVar, "");
        if (EnableBattleEggSetting.INSTANCE.getValue()) {
            if (bVar.f23056b == null || bVar.f23055a <= 0 || bVar.f23057c == null) {
                this.f10779a = false;
                return;
            }
            this.f10779a = true;
            this.f10788j = bVar.f23055a;
            com.bytedance.android.livesdkapi.depend.model.live.a.m mVar = bVar.f23057c;
            if (mVar == null) {
                l.b();
            }
            this.f10789k = mVar.f23098a;
            List<k> list = bVar.f23056b;
            if (list == null) {
                l.b();
            }
            this.f10787i = list;
            com.bytedance.android.livesdkapi.depend.model.live.a.m mVar2 = bVar.f23057c;
            if (mVar2 == null) {
                l.b();
            }
            this.f10791m = mVar2.f23102e;
            com.bytedance.android.livesdkapi.depend.model.live.a.m mVar3 = bVar.f23057c;
            if (mVar3 == null) {
                l.b();
            }
            this.r = mVar3.f23100c;
            com.bytedance.android.livesdkapi.depend.model.live.a.m mVar4 = bVar.f23057c;
            if (mVar4 == null) {
                l.b();
            }
            this.s = mVar4.f23101d;
            if (this.f10789k <= 0) {
                this.F = 0;
                for (k kVar : this.f10787i) {
                    this.F += kVar.f23091a;
                }
                this.f10789k = this.f10788j - this.F;
            }
            com.bytedance.android.livesdkapi.depend.model.live.a.m mVar5 = bVar.f23057c;
            if (mVar5 == null) {
                l.b();
            }
            this.f10790l = mVar5.f23099b;
            if (this.f10791m == 0) {
                com.bytedance.android.livesdkapi.depend.model.live.a.m mVar6 = bVar.f23057c;
                if (mVar6 == null) {
                    l.b();
                }
                this.w = mVar6.f23103f;
            } else {
                com.bytedance.android.livesdkapi.depend.model.live.a.m mVar7 = bVar.f23057c;
                if (mVar7 == null) {
                    l.b();
                }
                this.n = mVar7.f23104g;
            }
            com.bytedance.android.livesdkapi.depend.model.live.a.l lVar = bVar.f23058d;
            if (lVar != null) {
                this.u = lVar.f23094b;
                this.t = lVar.f23093a;
                this.x = lVar.f23095c;
                this.y = lVar.f23096d;
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a.c cVar) {
        d dVar;
        l.d(cVar, "");
        if (EnableBattleEggSetting.INSTANCE.getValue()) {
            this.f10784f = cVar.f23062c;
            this.A = cVar.f23065f;
            switch (cVar.f23060a) {
                case 0:
                    a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED);
                    return;
                case 1:
                    this.p = d.DEFAULT;
                    if (this.f10786h.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.d.TASK_NOTICE) <= 0) {
                        a(this.f10785g);
                        return;
                    }
                    return;
                case 2:
                    this.p = d.DEFAULT;
                    if (this.f10791m == 1 && cVar.f23061b >= this.o) {
                        this.o = cVar.f23061b;
                    }
                    a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS);
                    b bVar = this.f10781c;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                case 3:
                case 4:
                    if (cVar.f23060a == 3) {
                        dVar = d.SUCCEED;
                    } else {
                        dVar = d.BOTH_SUCCEED;
                    }
                    this.p = dVar;
                    if (this.f10786h.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED) <= 0) {
                        this.o = this.n;
                        a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED);
                    }
                    this.G = cVar.f23064e;
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    if (this.p != d.FAILED) {
                        this.p = d.FAILED;
                        if (this.q <= 0) {
                            this.q = this.f10785g;
                        }
                        a(this.f10785g);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    this.p = d.SUCCEED;
                    long j2 = this.n;
                    if (j2 > 0) {
                        this.o = j2;
                    }
                    a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_IN_PROCESS);
                    this.G = cVar.f23064e;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.p = d.SUCCEED;
                    this.z = cVar.f23063d;
                    this.G = cVar.f23064e;
                    long j3 = this.f10785g;
                    if (j3 <= this.t - this.u && this.v == 0) {
                        this.v = j3;
                    }
                    if (this.f10786h != com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED) {
                        a(this.f10785g, com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_FINISHED);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void a(long j2, com.bytedance.android.live.liveinteract.match.b.b.d dVar) {
        if (this.f10779a) {
            com.bytedance.android.live.liveinteract.match.b.b.d dVar2 = this.f10786h;
            if (dVar2 != dVar) {
                if (dVar2.compareTo((Enum) dVar) < 0 || dVar == com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED) {
                    this.f10786h = dVar;
                    com.bytedance.android.live.core.c.a.a(3, "BattleTask", "compareState==>> timeStamp = " + j2 + " currentSTate = " + this.f10786h);
                    b bVar = this.f10781c;
                    if (bVar != null) {
                        bVar.a(j2, this.f10786h);
                    }
                    DataChannel dataChannel = this.C;
                    if (dataChannel != null) {
                        dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.b.class, this.f10786h);
                    }
                }
            } else if ((dVar2 == com.bytedance.android.live.liveinteract.match.b.b.d.BONUS_IN_PROCESS || this.f10786h == com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS) && this.f10786h != com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED) {
                b bVar2 = this.f10781c;
                if (bVar2 != null) {
                    bVar2.a(j2, this.f10786h);
                }
                DataChannel dataChannel2 = this.C;
                if (dataChannel2 != null) {
                    dataChannel2.b(com.bytedance.android.live.liveinteract.match.b.c.b.class, this.f10786h);
                }
            }
        }
    }
}
