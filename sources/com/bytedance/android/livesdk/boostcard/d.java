package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.live.n.r;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.model.message.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.xbridge.n;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.t;
import f.a.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class d implements com.bytedance.ies.xbridge.e.d, OnMessageListener {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14224m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f14225a;

    /* renamed from: b  reason: collision with root package name */
    public long f14226b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.a f14227c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    public long f14228d;

    /* renamed from: e  reason: collision with root package name */
    public long f14229e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14230f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14231g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14232h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14233i;

    /* renamed from: j  reason: collision with root package name */
    public int f14234j;

    /* renamed from: k  reason: collision with root package name */
    public String f14235k = "";

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<Long> f14236l = new ArrayList<>();
    private u n;

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f14239a = new e();

        static {
            Covode.recordClassIndex(7887);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f14241a = new g();

        static {
            Covode.recordClassIndex(7889);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(7882);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7883);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements z<com.bytedance.android.live.network.response.d<c>> {
        static {
            Covode.recordClassIndex(7884);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.bytedance.android.live.network.response.d<c> dVar) {
            h.f.b.l.d(dVar, "");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        List<com.bytedance.android.livesdk.model.message.f> list;
        int i2;
        List<com.bytedance.android.livesdk.model.message.f> list2;
        String str;
        u uVar = this.n;
        if (uVar == null || (list = uVar.f19693a) == null) {
            list = new ArrayList();
        }
        for (com.bytedance.android.livesdk.model.message.f fVar : list) {
            String valueOf = String.valueOf(fVar.f19620c);
            String valueOf2 = String.valueOf(fVar.f19618a);
            String valueOf3 = String.valueOf(fVar.f19619b);
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("receive_boost_card").a();
            Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
            if (map == null || (str = (String) map.get("anchor_id")) == null) {
                str = "0";
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("anchor_id", str).a("task_id", valueOf).a("card_id", valueOf2);
            com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
            h.f.b.l.b(b2, "");
            a3.a("user_id", b2.c()).a("task_source", valueOf3).b();
        }
        com.bytedance.android.livesdk.an.a a4 = com.bytedance.android.livesdk.an.a.a();
        u uVar2 = this.n;
        if (uVar2 == null || (list2 = uVar2.f19693a) == null) {
            i2 = 1;
        } else {
            i2 = list2.size();
        }
        a4.a(new r(i2));
        ((LiveBoostcardApi) com.bytedance.android.live.network.e.a().a(LiveBoostcardApi.class)).boostCardAck(this.f14226b, 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b());
        this.f14231g = false;
    }

    public final void b() {
        String str;
        long a2 = this.f14228d - com.bytedance.android.livesdk.utils.a.a.a();
        if (a2 <= 0) {
            this.f14230f = false;
            b.f14217c = false;
            return;
        }
        this.f14230f = true;
        b.f14217c = true;
        b.f14218d = this.f14228d;
        String str2 = b.f14219e;
        String str3 = b.f14221g;
        String str4 = b.f14220f;
        com.bytedance.android.livesdk.ab.b a3 = b.a.a("boost_card_start_show").a();
        Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        com.bytedance.android.livesdk.ab.b a4 = a3.a("anchor_id", str).a("task_id", str2).a("card_id", str3);
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        a4.a("user_id", b2.c()).a("task_source", str4).b();
        com.bytedance.android.livesdk.rank.api.a.a aVar = new com.bytedance.android.livesdk.rank.api.a.a();
        aVar.f20582b = 1;
        String str5 = this.f14235k;
        h.f.b.l.d(str5, "");
        aVar.f20581a = str5;
        b.a(aVar.f20581a);
        com.bytedance.android.livesdk.an.a.a().a(aVar);
        this.f14227c.a(t.a(1, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new l(this)));
        this.f14227c.a(t.b(a2, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new k(this)));
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14237a;

        static {
            Covode.recordClassIndex(7885);
        }

        public c(d dVar) {
            this.f14237a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f14237a.b();
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14242a;

        static {
            Covode.recordClassIndex(7890);
        }

        public h(d dVar) {
            this.f14242a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f14242a.f14231g = true;
            d dVar = this.f14242a;
            if (dVar.f14232h) {
                dVar.a();
            }
        }
    }

    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14244a;

        static {
            Covode.recordClassIndex(7892);
        }

        public j(d dVar) {
            this.f14244a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d dVar = this.f14244a;
            dVar.f14228d = com.bytedance.android.livesdk.utils.a.a.a() + 60000;
            dVar.b();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof u) {
            this.n = (u) iMessage;
            if (this.f14231g) {
                a();
            } else {
                this.f14232h = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$d  reason: collision with other inner class name */
    public static final class C0308d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14238a;

        static {
            Covode.recordClassIndex(7886);
        }

        public C0308d(d dVar) {
            this.f14238a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            e eVar;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            d dVar2 = this.f14238a;
            if (dVar == null || (eVar = (e) dVar.data) == null) {
                j2 = 0;
            } else {
                j2 = eVar.f14250b;
            }
            dVar2.f14229e = j2;
            b.f14216b = this.f14238a.f14229e;
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.gift.d.c(this.f14238a.f14229e));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14245a;

        static {
            Covode.recordClassIndex(7893);
        }

        k(d dVar) {
            this.f14245a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f14245a.f14230f = false;
            b.f14217c = false;
            b.f14222h = true;
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.rank.api.a.b());
            d dVar = this.f14245a;
            com.bytedance.android.livesdk.rank.api.a.a aVar = new com.bytedance.android.livesdk.rank.api.a.a();
            aVar.f20582b = 3;
            com.bytedance.android.livesdk.an.a.a().a(aVar);
            dVar.f14227c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14246a;

        static {
            Covode.recordClassIndex(7894);
        }

        l(d dVar) {
            this.f14246a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f14246a.f14227c.a(((LiveBoostcardApi) com.bytedance.android.live.network.e.a().a(LiveBoostcardApi.class)).queryUserStatus(this.f14246a.f14226b, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.bytedance.android.livesdk.boostcard.d.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f14247a;

                static {
                    Covode.recordClassIndex(7895);
                }

                {
                    this.f14247a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    long j2;
                    e eVar;
                    com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
                    d dVar2 = this.f14247a.f14246a;
                    if (dVar == null || (eVar = (e) dVar.data) == null) {
                        j2 = 0;
                    } else {
                        j2 = eVar.f14250b;
                    }
                    dVar2.f14229e = j2;
                    b.f14216b = this.f14247a.f14246a.f14229e;
                    d dVar3 = this.f14247a.f14246a;
                    com.bytedance.android.livesdk.rank.api.a.a aVar = new com.bytedance.android.livesdk.rank.api.a.a();
                    aVar.f20582b = 2;
                    aVar.f20583c = dVar3.f14229e;
                    com.bytedance.android.livesdk.an.a.a().a(aVar);
                    if (this.f14247a.f14246a.f14233i) {
                        this.f14247a.f14246a.f14234j++;
                        if (this.f14247a.f14246a.f14234j >= 10) {
                            this.f14247a.f14246a.f14234j = 0;
                            this.f14247a.f14246a.f14236l.add(Long.valueOf(this.f14247a.f14246a.f14229e));
                            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.gift.d.a(this.f14247a.f14246a.f14236l));
                        }
                    }
                }
            }, AnonymousClass2.f14248a));
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14240a;

        static {
            Covode.recordClassIndex(7888);
        }

        f(d dVar) {
            this.f14240a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            e eVar;
            List<a> list;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f14240a.f14236l.clear();
            if (!(dVar == null || (eVar = (e) dVar.data) == null || (list = eVar.f14249a) == null)) {
                for (a aVar : list) {
                    this.f14240a.f14236l.add(Long.valueOf(aVar.f14214b));
                }
            }
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.gift.d.a(this.f14240a.f14236l));
        }
    }

    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f14243a;

        static {
            Covode.recordClassIndex(7891);
        }

        public i(d dVar) {
            this.f14243a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.bytedance.android.livesdk.gift.d.b) obj).f17846a) {
                this.f14243a.f14233i = true;
                d dVar = this.f14243a;
                dVar.f14233i = true;
                dVar.f14227c.a(((LiveBoostcardApi) com.bytedance.android.live.network.e.a().a(LiveBoostcardApi.class)).queryUserStatus(dVar.f14226b, true).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(dVar), g.f14241a));
                return;
            }
            this.f14243a.f14233i = false;
        }
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        int i2;
        String str;
        String str2;
        String e2;
        String str3 = "";
        h.f.b.l.d(cVar, str3);
        if (h.f.b.l.a((Object) "live_boost_use_card", (Object) cVar.f35926a)) {
            n nVar = cVar.f35927b;
            int i3 = 0;
            if (nVar != null) {
                i2 = nVar.i("boost_end_time").d();
            } else {
                i2 = 0;
            }
            this.f14228d = ((long) i2) * 1000;
            n nVar2 = cVar.f35927b;
            if (nVar2 == null || (str = nVar2.i("card_id").e()) == null) {
                str = str3;
            }
            b.d(str);
            n nVar3 = cVar.f35927b;
            if (nVar3 == null || (str2 = nVar3.i("task_id").e()) == null) {
                str2 = str3;
            }
            b.b(str2);
            n nVar4 = cVar.f35927b;
            if (!(nVar4 == null || (e2 = nVar4.i("image_path").e()) == null)) {
                str3 = e2;
            }
            this.f14235k = str3;
            n nVar5 = cVar.f35927b;
            if (nVar5 != null) {
                i3 = nVar5.i("task_source").d();
            }
            b.c(String.valueOf(i3));
            b();
        }
    }
}
