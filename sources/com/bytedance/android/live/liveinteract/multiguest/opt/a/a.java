package com.bytedance.android.live.liveinteract.multiguest.opt.a;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.livesdk.b.a.e;
import com.bytedance.covode.number.Covode;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@f(a = "MULTI_GUEST_DATA_HOLDER")
public final class a extends com.bytedance.android.live.liveinteract.api.a.a {

    /* renamed from: a  reason: collision with root package name */
    public e f11291a = new e();

    /* renamed from: b  reason: collision with root package name */
    public boolean f11292b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11293c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11294d = true;

    /* renamed from: e  reason: collision with root package name */
    public int f11295e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11296f;

    /* renamed from: g  reason: collision with root package name */
    public int f11297g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11298h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.model.c.a f11299i;

    /* renamed from: j  reason: collision with root package name */
    public int f11300j = 1;

    /* renamed from: k  reason: collision with root package name */
    public Set<Long> f11301k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public int f11302l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11303m;
    public List<com.bytedance.android.livesdk.chatroom.model.b.c> n;
    public int o;
    public n p = n.NORMAL;
    public n q = n.NORMAL;
    public String r;
    public boolean s;
    public int t = -1;
    public String u;
    private String v;
    private long w;
    private final h x = i.a((h.f.a.a) d.f11406a);
    private final h y = i.a((h.f.a.a) C0220a.f11304a);
    private final h z = i.a((h.f.a.a) c.f11352a);

    static {
        Covode.recordClassIndex(6076);
    }

    public final HashMap<String, Boolean> a() {
        return (HashMap) this.x.getValue();
    }

    public final HashMap<String, Boolean> b() {
        return (HashMap) this.y.getValue();
    }

    public final HashMap<Long, String> c() {
        return (HashMap) this.z.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a$a  reason: collision with other inner class name */
    static final class C0220a extends m implements h.f.a.a<HashMap<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0220a f11304a = new C0220a();

        static {
            Covode.recordClassIndex(6077);
        }

        C0220a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    static final class c extends m implements h.f.a.a<HashMap<Long, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11352a = new c();

        static {
            Covode.recordClassIndex(6079);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<Long, String> invoke() {
            return new HashMap();
        }
    }

    static final class d extends m implements h.f.a.a<HashMap<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11406a = new d();

        static {
            Covode.recordClassIndex(6080);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    public final void d() {
        this.f11293c = true;
        this.f11294d = true;
        this.f11296f = false;
        a().clear();
        b().clear();
        this.o = 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void a(long j2) {
        this.w = j2;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void b(String str) {
        this.u = str;
    }

    @Override // com.bytedance.android.live.liveinteract.api.a.a
    public final void a(String str) {
        this.v = str;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11305a;

        static {
            Covode.recordClassIndex(6078);
        }

        b(a aVar) {
            this.f11305a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = this.f11305a;
            n nVar = aVar.q;
            l.d(nVar, "");
            aVar.p = nVar;
        }
    }

    public final void a(boolean z2) {
        com.bytedance.android.live.liveinteract.platform.common.g.i.f11972b = z2;
        this.f11298h = z2;
    }

    public final void a(n nVar) {
        l.d(nVar, "");
        this.q = nVar;
        t.b((Object) 1).e(2, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this));
    }
}
