package com.ss.android.ugc.aweme.qna.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.api.j;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.i;
import com.ss.android.ugc.aweme.qna.ui.o;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public t<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> f119326a;

    /* renamed from: b  reason: collision with root package name */
    public LiveData<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> f119327b;

    /* renamed from: c  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<w>> f119328c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<w>> f119329d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<com.ss.android.ugc.aweme.qna.g.b<i>> f119330e;

    /* renamed from: f  reason: collision with root package name */
    public t<com.ss.android.ugc.aweme.qna.g.b<Long>> f119331f;

    /* renamed from: g  reason: collision with root package name */
    public LiveData<com.ss.android.ugc.aweme.qna.g.b<Long>> f119332g;

    /* renamed from: h  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.question.c> f119333h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f119334i;

    /* renamed from: j  reason: collision with root package name */
    public Set<String> f119335j;

    /* renamed from: k  reason: collision with root package name */
    public j f119336k;

    /* renamed from: l  reason: collision with root package name */
    public final int f119337l;

    /* renamed from: m  reason: collision with root package name */
    public int f119338m;
    public final f.a.b.a n;
    public final Object o;
    public AtomicBoolean p;
    public final AtomicBoolean q;
    private final t<com.ss.android.ugc.aweme.qna.g.b<i>> r;
    private long s;

    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f119340a = new b();

        static {
            Covode.recordClassIndex(77497);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(77495);
    }

    public h() {
        int a2;
        t<com.ss.android.ugc.aweme.qna.g.b<List<com.ss.android.ugc.aweme.qna.model.f>>> tVar = new t<>();
        this.f119326a = tVar;
        this.f119327b = tVar;
        t<com.ss.android.ugc.aweme.qna.g.b<i>> tVar2 = new t<>();
        this.r = tVar2;
        this.f119330e = tVar2;
        t<com.ss.android.ugc.aweme.qna.g.b<Long>> tVar3 = new t<>();
        this.f119331f = tVar3;
        this.f119332g = tVar3;
        this.f119333h = new ArrayList();
        this.f119334i = new HashMap();
        this.f119335j = new HashSet();
        this.f119336k = new j();
        if (com.ss.android.ugc.aweme.qna.e.c.a()) {
            a2 = 1;
        } else {
            a2 = com.ss.android.ugc.aweme.qna.e.a.a();
        }
        this.f119337l = a2;
        this.n = new f.a.b.a();
        this.o = new Object();
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(true);
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f119345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f119347c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f119348d;

        static {
            Covode.recordClassIndex(77499);
        }

        public d(h hVar, boolean z, String str, boolean z2) {
            this.f119345a = hVar;
            this.f119346b = z;
            this.f119347c = str;
            this.f119348d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119345a.a(this.f119347c, this.f119346b);
            this.f119345a.f119329d.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(w.FAILURE));
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f119353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f119355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f119356d;

        static {
            Covode.recordClassIndex(77501);
        }

        f(h hVar, boolean z, String str, boolean z2) {
            this.f119353a = hVar;
            this.f119354b = z;
            this.f119355c = str;
            this.f119356d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119353a.a(this.f119355c, this.f119354b);
            this.f119353a.f119328c.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(w.FAILURE));
            this.f119353a.p.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $updatedList;
        int label;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(77502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar, List list, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$updatedList = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.this$0, this.$updatedList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.f119326a.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(this.$updatedList));
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f119339a;

        static {
            Covode.recordClassIndex(77496);
        }

        public a(h hVar) {
            this.f119339a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119339a.f119331f.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(Long.valueOf(((j) obj).f119260d)));
            this.f119339a.f119328c.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(o.a((com.ss.android.ugc.aweme.qna.api.i) null, this.f119339a.f119333h)));
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f119349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f119351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f119352d;

        static {
            Covode.recordClassIndex(77500);
        }

        e(h hVar, boolean z, String str, boolean z2) {
            this.f119349a = hVar;
            this.f119350b = z;
            this.f119351c = str;
            this.f119352d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.qna.api.i iVar = (com.ss.android.ugc.aweme.qna.api.i) obj;
            this.f119349a.q.set(iVar.f119256e);
            this.f119349a.f119338m = iVar.f119255d;
            h hVar = this.f119349a;
            List list = iVar.f119254c;
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            h.a(hVar, list, this.f119351c, this.f119350b, false, 16);
            this.f119349a.f119328c.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(o.a(iVar, this.f119349a.f119333h)));
            this.f119349a.p.set(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.d.i
    public final void a(m mVar) {
        MethodCollector.i(7846);
        l.d(mVar, "");
        if (mVar.f119362a) {
            String str = mVar.f119365d;
            if (str != null) {
                synchronized (this.o) {
                    try {
                        this.f119334i.put(mVar.f119363b, str);
                        this.f119335j.remove(mVar.f119363b);
                    } catch (Throwable th) {
                        MethodCollector.o(7846);
                        throw th;
                    }
                }
                a(this, h.a.z.INSTANCE, null, false, false, 30);
                MethodCollector.o(7846);
                return;
            }
            MethodCollector.o(7846);
            return;
        }
        synchronized (this.o) {
            try {
                this.f119335j.remove(mVar.f119363b);
            } finally {
                MethodCollector.o(7846);
            }
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f119341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f119343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f119344d;

        static {
            Covode.recordClassIndex(77498);
        }

        public c(h hVar, boolean z, String str, boolean z2) {
            this.f119341a = hVar;
            this.f119342b = z;
            this.f119343c = str;
            this.f119344d = z2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.i(8601);
            com.ss.android.ugc.aweme.qna.api.i iVar = (com.ss.android.ugc.aweme.qna.api.i) obj;
            h hVar = this.f119341a;
            List<com.ss.android.ugc.aweme.question.c> list = iVar.f119254c;
            if (list != null) {
                synchronized (hVar.o) {
                    try {
                        List<com.ss.android.ugc.aweme.question.c> list2 = hVar.f119333h;
                        ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getId());
                        }
                        HashSet j2 = n.j((Iterable) arrayList);
                        for (T t : list) {
                            if (!j2.contains(t.getId())) {
                                hVar.f119333h.add(0, t);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(8601);
                        throw th;
                    }
                }
            }
            this.f119341a.a(h.a.z.INSTANCE, this.f119343c, this.f119342b, false);
            this.f119341a.f119329d.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(o.a(iVar, this.f119341a.f119333h)));
            MethodCollector.o(8601);
        }
    }

    public final void a(String str, boolean z) {
        a(this, h.a.z.INSTANCE, str, z, false, 16);
    }

    public final void a(List<com.ss.android.ugc.aweme.question.c> list, String str, boolean z, boolean z2) {
        MethodCollector.i(7795);
        ArrayList<com.ss.android.ugc.aweme.qna.model.f> arrayList = new ArrayList();
        if (z) {
            arrayList.add(new com.ss.android.ugc.aweme.qna.model.d("privacyBanner", str));
        }
        synchronized (this.o) {
            try {
                List<com.ss.android.ugc.aweme.question.c> list2 = this.f119333h;
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    boolean contains = this.f119335j.contains(String.valueOf(next.getId()));
                    if (this.f119334i.keySet().contains(String.valueOf(next.getId()))) {
                        str2 = this.f119334i.get(String.valueOf(next.getId()));
                    }
                    arrayList2.add(f.a.a((com.ss.android.ugc.aweme.question.c) next, str2, contains));
                }
                arrayList.addAll(n.g((Collection) arrayList2));
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList, 10));
                for (com.ss.android.ugc.aweme.qna.model.f fVar : arrayList) {
                    arrayList3.add(fVar.f119497h);
                }
                Set p2 = n.p(arrayList3);
                for (T t : list) {
                    if (!p2.contains(String.valueOf(t.getId()))) {
                        p2.add(String.valueOf(t.getId()));
                        this.f119333h = n.g((Collection) n.a((Collection) this.f119333h, (Object) t));
                        arrayList.add(f.a.a((com.ss.android.ugc.aweme.question.c) t, (String) null, false));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(7795);
                throw th;
            }
        }
        if (z2) {
            this.s++;
        }
        arrayList.add(new com.ss.android.ugc.aweme.qna.model.f(0, String.valueOf(this.s)));
        if (arrayList.size() > 1) {
            arrayList.add(new com.ss.android.ugc.aweme.qna.model.f(6, "void"));
        }
        bz unused = kotlinx.coroutines.i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new g(this, arrayList, null), 3);
        MethodCollector.o(7795);
    }

    public final void a(String str, String str2, String str3, boolean z, boolean z2) {
        l.d(str, "");
        l.d(str2, "");
        if (!this.p.get()) {
            this.p.set(true);
            this.n.a(QnaApiV2.a.a().getQuestionsTabData(p.g(str), this.f119337l, this.f119338m, str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this, z, str3, z2), new f(this, z, str3, z2)));
        }
    }

    public static /* synthetic */ void a(h hVar, List list, String str, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        hVar.a(list, str, z, z2);
    }
}
