package com.ss.android.ugc.aweme.qna.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.i;
import com.ss.android.ugc.aweme.qna.ui.o;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;

public final class b {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.question.c> f119275a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.question.c> f119276b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f119277c;

    /* renamed from: d  reason: collision with root package name */
    public int f119278d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f119279e = true;

    /* renamed from: f  reason: collision with root package name */
    public Integer f119280f;

    /* renamed from: g  reason: collision with root package name */
    public Object f119281g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f119282h = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> f119283i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public t<com.ss.android.ugc.aweme.qna.g.b<com.ss.android.ugc.aweme.qna.model.a>> f119284j = new t<>();

    /* renamed from: k  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<w>> f119285k = new t<>();

    /* renamed from: l  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<String>> f119286l = new t<>();

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<i>> f119287m;
    public AtomicBoolean n;
    private final int p = com.ss.android.ugc.aweme.qna.e.a.a();
    private final t<com.ss.android.ugc.aweme.qna.g.b<i>> q;
    private AtomicBoolean r;
    private AtomicBoolean s;
    private AtomicBoolean t;
    private int u;
    private int v;

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f119290a = new c();

        static {
            Covode.recordClassIndex(77479);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(77476);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77477);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.question.c> list, int i2) {
        List<com.ss.android.ugc.aweme.question.c> list2 = this.f119275a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Long id = it.next().getId();
            if (id != null) {
                arrayList.add(id);
            }
        }
        Set m2 = n.m(arrayList);
        List<com.ss.android.ugc.aweme.question.c> list3 = this.f119276b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Long id2 = it2.next().getId();
            if (id2 != null) {
                arrayList2.add(id2);
            }
        }
        Set m3 = n.m(arrayList2);
        for (T t2 : list) {
            Long id3 = t2.getId();
            if (id3 != null) {
                long longValue = id3.longValue();
                if (i2 == com.ss.android.ugc.aweme.qna.api.f.RECOMMEND.getValue() && !m3.contains(Long.valueOf(longValue))) {
                    this.f119276b.add(t2);
                } else if (i2 == com.ss.android.ugc.aweme.qna.api.f.INVITATION.getValue() && !m2.contains(Long.valueOf(longValue))) {
                    this.f119275a.add(t2);
                }
            }
        }
    }

    private final int c() {
        if (this.f119279e) {
            return 3;
        }
        return 6;
    }

    public final void a() {
        if (!this.r.getAndSet(true)) {
            this.u++;
            if (!this.f119279e) {
                a((Boolean) true);
            }
            String b2 = dg.a().b(n.a(a(this.f119277c)));
            l.b(b2, "");
            a(b2, n.a(com.ss.android.ugc.aweme.qna.api.f.INVITATION), false);
        }
    }

    public final void b() {
        if (!this.s.getAndSet(true)) {
            String b2 = dg.a().b(n.a(b(this.f119278d)));
            l.b(b2, "");
            a(b2, n.a(com.ss.android.ugc.aweme.qna.api.f.RECOMMEND), null);
        }
    }

    public b() {
        t<com.ss.android.ugc.aweme.qna.g.b<i>> tVar = new t<>();
        this.q = tVar;
        this.f119287m = tVar;
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.n = new AtomicBoolean(true);
    }

    private final List<com.ss.android.ugc.aweme.qna.model.f> d() {
        ArrayList arrayList = new ArrayList();
        List<com.ss.android.ugc.aweme.question.c> list = this.f119275a;
        ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(f.a.a((com.ss.android.ugc.aweme.question.c) it.next(), true));
        }
        List<com.ss.android.ugc.aweme.qna.model.h> g2 = n.g((Collection) arrayList2);
        List<com.ss.android.ugc.aweme.question.c> list2 = this.f119276b;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(f.a.a((com.ss.android.ugc.aweme.question.c) it2.next(), false));
        }
        List g3 = n.g((Collection) arrayList3);
        if (!g2.isEmpty()) {
            arrayList.add(new com.ss.android.ugc.aweme.qna.model.h(1, "invitesTitle", null, null, null, null, null, null, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.f66), null, false, null, 16124));
            for (com.ss.android.ugc.aweme.qna.model.h hVar : g2) {
                hVar.f119516l = false;
                hVar.f119517m = false;
            }
            n.a((Collection) arrayList, (Iterable) g2);
            if (g3.isEmpty()) {
                int i2 = this.u + 1;
                this.u = i2;
                return n.a((Collection) arrayList, (Object) new com.ss.android.ugc.aweme.qna.model.f(0, String.valueOf(i2)));
            } else if (this.t.get()) {
                ((com.ss.android.ugc.aweme.qna.model.h) arrayList.get(arrayList.size() - 1)).f119516l = false;
                ((com.ss.android.ugc.aweme.qna.model.h) arrayList.get(arrayList.size() - 1)).f119517m = true;
            } else {
                ((com.ss.android.ugc.aweme.qna.model.h) arrayList.get(arrayList.size() - 1)).f119516l = this.n.get();
            }
        }
        if (!(!g3.isEmpty())) {
            return arrayList;
        }
        arrayList.add(new com.ss.android.ugc.aweme.qna.model.h(1, "suggestedTitle", null, null, null, null, null, null, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.f67), null, false, null, 16124));
        n.a((Collection) arrayList, (Iterable) g3);
        int i3 = this.v + 1;
        this.v = i3;
        return n.a((Collection) arrayList, (Object) new com.ss.android.ugc.aweme.qna.model.f(0, String.valueOf(i3)));
    }

    public final void a(w wVar) {
        this.f119285k.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(wVar));
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f119295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f119296c;

        static {
            Covode.recordClassIndex(77481);
        }

        e(b bVar, Boolean bool, List list) {
            this.f119294a = bVar;
            this.f119295b = bool;
            this.f119296c = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119294a.a(this.f119295b);
            this.f119294a.a(w.FAILURE);
            this.f119294a.a(this.f119296c);
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f119298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f119299c;

        static {
            Covode.recordClassIndex(77482);
        }

        public f(b bVar, String str, int i2) {
            this.f119297a = bVar;
            this.f119298b = str;
            this.f119299c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119297a.f119284j.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(new com.ss.android.ugc.aweme.qna.model.a(this.f119298b, true, this.f119299c)));
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f119301b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f119302c;

        static {
            Covode.recordClassIndex(77483);
        }

        public g(b bVar, String str, int i2) {
            this.f119300a = bVar;
            this.f119301b = str;
            this.f119302c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119300a.f119284j.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(new com.ss.android.ugc.aweme.qna.model.a(this.f119301b, false, -1)));
            this.f119300a.a(this.f119301b, this.f119302c);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $qnaCellList;
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(77484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, List list, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$qnaCellList = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new h(this.this$0, this.$qnaCellList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.f119283i.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(this.$qnaCellList));
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final com.ss.android.ugc.aweme.qna.api.e a(int i2) {
        return new com.ss.android.ugc.aweme.qna.api.e(i2, c(), com.ss.android.ugc.aweme.qna.api.f.INVITATION.getValue(), com.ss.android.ugc.aweme.qna.api.b.SUGGEST.getValue());
    }

    public final com.ss.android.ugc.aweme.qna.api.e b(int i2) {
        return new com.ss.android.ugc.aweme.qna.api.e(i2, this.p, com.ss.android.ugc.aweme.qna.api.f.RECOMMEND.getValue(), com.ss.android.ugc.aweme.qna.api.b.SUGGEST.getValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$b  reason: collision with other inner class name */
    static final class C3080b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f119289b;

        static {
            Covode.recordClassIndex(77478);
        }

        C3080b(b bVar, String str) {
            this.f119288a = bVar;
            this.f119289b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.i(8923);
            synchronized (this.f119288a.f119281g) {
                try {
                    b bVar = this.f119288a;
                    List<com.ss.android.ugc.aweme.question.c> list = bVar.f119275a;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (!l.a((Object) String.valueOf(t.getId()), (Object) this.f119289b)) {
                            arrayList.add(t);
                        }
                    }
                    bVar.f119275a = n.g((Collection) arrayList);
                } catch (Throwable th) {
                    MethodCollector.o(8923);
                    throw th;
                }
            }
            this.f119288a.a((b) null);
            b bVar2 = this.f119288a;
            bVar2.a(o.a((com.ss.android.ugc.aweme.qna.api.k) null, n.d((Collection) bVar2.f119275a, (Iterable) this.f119288a.f119276b)));
            MethodCollector.o(8923);
        }
    }

    public final void a(Boolean bool) {
        MethodCollector.i(9515);
        synchronized (this.f119281g) {
            try {
                a(h.a.z.INSTANCE, -1);
                b(bool);
            } finally {
                MethodCollector.o(9515);
            }
        }
    }

    public final void b(Boolean bool) {
        if (bool != null) {
            this.t.set(bool.booleanValue());
        }
        ArrayList arrayList = new ArrayList();
        n.a((Collection) arrayList, (Iterable) d());
        if (arrayList.size() > 1) {
            arrayList.add(new com.ss.android.ugc.aweme.qna.model.f(6, "void"));
        }
        bz unused = kotlinx.coroutines.i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new h(this, arrayList, null), 3);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f119291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Boolean f119292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f119293c;

        static {
            Covode.recordClassIndex(77480);
        }

        d(b bVar, Boolean bool, List list) {
            this.f119291a = bVar;
            this.f119292b = bool;
            this.f119293c = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.i(7694);
            com.ss.android.ugc.aweme.qna.api.k kVar = (com.ss.android.ugc.aweme.qna.api.k) obj;
            synchronized (this.f119291a.f119281g) {
                try {
                    List<com.ss.android.ugc.aweme.qna.api.d> list = kVar.f119263c;
                    if (list != null) {
                        for (T t : list) {
                            if (t.f119229a == com.ss.android.ugc.aweme.qna.api.f.RECOMMEND.getValue()) {
                                this.f119291a.f119278d = t.f119231c;
                            }
                            if (t.f119229a == com.ss.android.ugc.aweme.qna.api.f.INVITATION.getValue()) {
                                this.f119291a.f119277c = t.f119231c;
                                this.f119291a.f119279e = false;
                                if (t.f119232d == 0) {
                                    this.f119291a.n.set(false);
                                }
                                Integer num = t.f119233e;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    this.f119291a.f119280f = Integer.valueOf(intValue);
                                }
                            }
                            b bVar = this.f119291a;
                            List<com.ss.android.ugc.aweme.question.c> list2 = t.f119230b;
                            if (list2 == null) {
                                list2 = h.a.z.INSTANCE;
                            }
                            bVar.a(list2, t.f119229a);
                        }
                    }
                    this.f119291a.b(this.f119292b);
                } catch (Throwable th) {
                    MethodCollector.o(7694);
                    throw th;
                }
            }
            b bVar2 = this.f119291a;
            bVar2.a(o.a(kVar, n.d((Collection) bVar2.f119275a, (Iterable) this.f119291a.f119276b)));
            this.f119291a.a(this.f119293c);
            MethodCollector.o(7694);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        Keva repo = Keva.getRepo("qna_suggested_repo", 0);
        l.b(repo, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (repo.getBoolean("first_time_delete_invite".concat(String.valueOf(curUserId)), true)) {
            this.f119286l.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(str));
            repo.storeBoolean("first_time_delete_invite".concat(String.valueOf(curUserId)), false);
            return;
        }
        this.f119282h.a(QnaApiV2.a.a().deleteInviteQuestion(Long.parseLong(str)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C3080b(this, str), c.f119290a));
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.qna.api.f> list) {
        for (T t2 : list) {
            if (t2 == com.ss.android.ugc.aweme.qna.api.f.RECOMMEND) {
                this.s.set(false);
            }
            if (t2 == com.ss.android.ugc.aweme.qna.api.f.INVITATION) {
                this.r.set(false);
            }
        }
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        for (T t2 : this.f119275a) {
            if (l.a((Object) String.valueOf(t2.getId()), (Object) str)) {
                t2.setCollectStatus(Integer.valueOf(i2));
            }
        }
        for (T t3 : this.f119276b) {
            if (l.a((Object) String.valueOf(t3.getId()), (Object) str)) {
                t3.setCollectStatus(Integer.valueOf(i2));
            }
        }
        a((Boolean) null);
    }

    public final void a(String str, List<? extends com.ss.android.ugc.aweme.qna.api.f> list, Boolean bool) {
        this.f119282h.a(QnaApiV2.a.a().getSuggestedTabData(null, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(this, bool, list), new e(this, bool, list)));
    }
}
