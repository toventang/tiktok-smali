package com.bytedance.android.livesdk.qa;

import androidx.h.d;
import androidx.h.e;
import androidx.h.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ae extends androidx.h.e<Long, af> implements d.b {

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f20324b;

    /* renamed from: c  reason: collision with root package name */
    public t<com.bytedance.android.live.core.e.b> f20325c;

    /* renamed from: d  reason: collision with root package name */
    public t<com.bytedance.android.live.core.e.b> f20326d;

    /* renamed from: e  reason: collision with root package name */
    public t<Boolean> f20327e;

    /* renamed from: f  reason: collision with root package name */
    public t<Boolean> f20328f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f20329g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20330h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20331i;

    /* renamed from: j  reason: collision with root package name */
    public long f20332j = 2;

    /* renamed from: k  reason: collision with root package name */
    public long f20333k = 2;

    /* renamed from: l  reason: collision with root package name */
    public List<af> f20334l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public List<af> f20335m = new ArrayList();
    public List<af> n = new ArrayList();
    public af o;
    public boolean p;
    public boolean q;
    public boolean r;
    private final f.a.l.c<Object> s;
    private Room t;
    private boolean u;

    static {
        Covode.recordClassIndex(12005);
    }

    @Override // androidx.h.e
    public final void b(e.f<Long> fVar, e.a<af> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f20348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.C0046e f20349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.c f20350c;

        static {
            Covode.recordClassIndex(12013);
        }

        e(ae aeVar, e.C0046e eVar, e.c cVar) {
            this.f20348a = aeVar;
            this.f20349b = eVar;
            this.f20350c = cVar;
        }

        public final void run() {
            this.f20348a.a(this.f20349b, this.f20350c);
        }
    }

    @Override // androidx.h.d.b
    public final void a() {
        this.f20324b.a();
        this.f20334l.clear();
    }

    public final void a(Room room) {
        l.d(room, "");
        this.t = room;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f20341a;

        static {
            Covode.recordClassIndex(12010);
        }

        b(ae aeVar) {
            this.f20341a = aeVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f20341a.f20325c.postValue(com.bytedance.android.live.core.e.b.f9011d);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.h.e
    public final /* synthetic */ Long b(af afVar) {
        af afVar2 = afVar;
        l.d(afVar2, "");
        return Long.valueOf(afVar2.f20351a.f19335d);
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f20345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.C0046e f20346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.c f20347c;

        static {
            Covode.recordClassIndex(12012);
        }

        d(ae aeVar, e.C0046e eVar, e.c cVar) {
            this.f20345a = aeVar;
            this.f20346b = eVar;
            this.f20347c = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ae aeVar = this.f20345a;
            l.b(th, "");
            aeVar.a(th, this.f20346b, this.f20347c);
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f20339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f20340b;

        static {
            Covode.recordClassIndex(12009);
        }

        a(ae aeVar, e.a aVar) {
            this.f20339a = aeVar;
            this.f20340b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar.statusCode == 0 && dVar.data != null) {
                ArrayList arrayList = new ArrayList();
                if (this.f20339a.q) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) ((ai) dVar.data).f20356a.f20354a)) {
                        arrayList.addAll(((ai) dVar.data).f20356a.f20354a);
                        this.f20339a.f20335m.addAll(((ai) dVar.data).f20356a.f20354a);
                        this.f20339a.f20332j++;
                    }
                    this.f20339a.q = ((ai) dVar.data).f20356a.f20355b;
                } else if (this.f20339a.r) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) ((ai) dVar.data).f20357b.f20354a)) {
                        if (!this.f20339a.p) {
                            arrayList.add(new af(new bj("", 4, new User())));
                            this.f20339a.p = true;
                        }
                        arrayList.addAll(((ai) dVar.data).f20357b.f20354a);
                        this.f20339a.n.addAll(((ai) dVar.data).f20357b.f20354a);
                        this.f20339a.f20333k++;
                    }
                    this.f20339a.r = ((ai) dVar.data).f20357b.f20355b;
                }
                this.f20339a.f20334l.addAll(arrayList);
                this.f20339a.f20325c.postValue(com.bytedance.android.live.core.e.b.f9011d);
                this.f20340b.a(arrayList);
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ae f20342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.c f20343b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.C0046e f20344c;

        static {
            Covode.recordClassIndex(12011);
        }

        c(ae aeVar, e.c cVar, e.C0046e eVar) {
            this.f20342a = aeVar;
            this.f20343b = cVar;
            this.f20344c = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            ah ahVar;
            ArrayList<af> arrayList;
            ai aiVar;
            ah ahVar2;
            ArrayList<af> arrayList2;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar.statusCode != 0 || dVar.data == null) {
                this.f20342a.a(new Exception(), this.f20344c, this.f20343b);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            if (((ai) dVar.data).f20358c.f20351a.f19336e != null) {
                this.f20342a.o = ((ai) dVar.data).f20358c;
            }
            if (this.f20342a.f20330h || this.f20342a.f20331i) {
                arrayList3.add(new af(new bj("", 3, new User())));
            }
            if (!(com.bytedance.common.utility.collection.b.a((Collection) ((ai) dVar.data).f20356a.f20354a) || (aiVar = (ai) dVar.data) == null || (ahVar2 = aiVar.f20356a) == null || (arrayList2 = ahVar2.f20354a) == null)) {
                arrayList3.addAll(arrayList2);
                this.f20342a.f20335m.clear();
                this.f20342a.f20335m.addAll(arrayList2);
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) ((ai) dVar.data).f20357b.f20354a)) {
                arrayList3.add(new af(new bj("", 4, new User())));
                this.f20342a.p = true;
                this.f20342a.f20333k++;
                ai aiVar2 = (ai) dVar.data;
                if (!(aiVar2 == null || (ahVar = aiVar2.f20357b) == null || (arrayList = ahVar.f20354a) == null)) {
                    arrayList3.addAll(arrayList);
                    this.f20342a.n.clear();
                    this.f20342a.n.addAll(arrayList);
                }
            }
            this.f20342a.r = ((ai) dVar.data).f20357b.f20355b;
            this.f20342a.q = ((ai) dVar.data).f20356a.f20355b;
            t<Boolean> tVar = this.f20342a.f20328f;
            if (this.f20342a.r || this.f20342a.q) {
                z = true;
            } else {
                z = false;
            }
            tVar.postValue(Boolean.valueOf(z));
            if (((this.f20342a.f20330h || this.f20342a.f20331i) && arrayList3.size() == 1) || (!this.f20342a.f20330h && arrayList3.size() == 0)) {
                this.f20342a.f20334l.clear();
                this.f20342a.f20327e.postValue(true);
                this.f20343b.a(new ArrayList());
            } else {
                this.f20342a.f20327e.postValue(false);
                this.f20342a.f20334l.clear();
                this.f20342a.f20334l.addAll(arrayList3);
                this.f20343b.a(arrayList3, arrayList3.size());
            }
            this.f20342a.f20326d.postValue(com.bytedance.android.live.core.e.b.f9011d);
            this.f20342a.f20325c.postValue(com.bytedance.android.live.core.e.b.f9011d);
        }
    }

    public final i<af> a(i.d dVar, boolean z) {
        l.d(dVar, "");
        this.u = z;
        i.b bVar = new i.b(this, dVar);
        bVar.f3158b = androidx.a.a.a.a.f785c;
        bVar.f3157a = androidx.a.a.a.a.f784b;
        i<af> a2 = bVar.a();
        l.b(a2, "");
        return a2;
    }

    @Override // androidx.h.e
    public final void a(e.C0046e<Long> eVar, e.c<af> cVar) {
        l.d(eVar, "");
        l.d(cVar, "");
        if (this.u) {
            if (com.bytedance.common.utility.collection.b.a((Collection) this.f20334l)) {
                this.f20327e.postValue(true);
            } else {
                this.f20327e.postValue(false);
            }
            cVar.a(this.f20334l);
            this.u = false;
            return;
        }
        this.f20326d.postValue(com.bytedance.android.live.core.e.b.f9010c);
        this.f20325c.postValue(com.bytedance.android.live.core.e.b.f9010c);
        this.f20328f.postValue(true);
        this.f20329g = null;
        QAApi qAApi = (QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class);
        Room room = this.t;
        if (room == null) {
            l.a("room");
        }
        qAApi.queryQuestion(room.getId(), 1, 1, 2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this, cVar, eVar), new d(this, eVar, cVar));
    }

    @Override // androidx.h.e
    public final void a(e.f<Long> fVar, e.a<af> aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        if (this.q || this.r) {
            this.f20325c.postValue(com.bytedance.android.live.core.e.b.f9010c);
            QAApi qAApi = (QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class);
            Room room = this.t;
            if (room == null) {
                l.a("room");
            }
            qAApi.queryQuestion(room.getId(), this.f20332j, this.f20333k, 2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a(this, aVar), new b(this));
        }
    }

    public final void a(Throwable th, e.C0046e<Long> eVar, e.c<af> cVar) {
        l.d(th, "");
        l.d(eVar, "");
        l.d(cVar, "");
        this.f20329g = new e(this, eVar, cVar);
        this.f20326d.postValue(com.bytedance.android.live.core.e.b.a(th));
        this.f20325c.postValue(com.bytedance.android.live.core.e.b.a(th));
    }

    public ae(LiveData<Boolean> liveData, LiveData<com.bytedance.android.live.core.e.b> liveData2, LiveData<Boolean> liveData3, LiveData<com.bytedance.android.live.core.e.b> liveData4, f.a.l.c<Object> cVar) {
        l.d(liveData, "");
        l.d(liveData2, "");
        l.d(liveData3, "");
        l.d(liveData4, "");
        l.d(cVar, "");
        f.a.b.a aVar = new f.a.b.a();
        this.f20324b = aVar;
        t<com.bytedance.android.live.core.e.b> tVar = (t) liveData4;
        this.f20325c = tVar;
        t<com.bytedance.android.live.core.e.b> tVar2 = (t) liveData2;
        this.f20326d = tVar2;
        t<Boolean> tVar3 = (t) liveData3;
        this.f20327e = tVar3;
        t<Boolean> tVar4 = (t) liveData;
        this.f20328f = tVar4;
        this.f20328f = tVar4;
        this.f20326d = tVar2;
        this.f20327e = tVar3;
        this.f20325c = tVar;
        this.s = cVar;
        f.a.b.b a2 = cVar.a(new f(this) {
            /* class com.bytedance.android.livesdk.qa.ae.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ae f20336a;

            static {
                Covode.recordClassIndex(12006);
            }

            {
                this.f20336a = r1;
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
                Runnable runnable = this.f20336a.f20329g;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, AnonymousClass2.f20337a);
        if (a2 != null) {
            aVar.a(a2);
        }
        a((d.b) new d.b(this) {
            /* class com.bytedance.android.livesdk.qa.ae.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ae f20338a;

            static {
                Covode.recordClassIndex(12008);
            }

            {
                this.f20338a = r1;
            }

            @Override // androidx.h.d.b
            public final void a() {
                this.f20338a.a();
            }
        });
    }
}
