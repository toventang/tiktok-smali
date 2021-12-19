package com.ss.android.ugc.aweme.qna.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.api.g;
import com.ss.android.ugc.aweme.qna.fragment.w;
import com.ss.android.ugc.aweme.qna.model.d;
import com.ss.android.ugc.aweme.qna.model.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public LiveData<com.ss.android.ugc.aweme.qna.g.b<List<f>>> f119303a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.qna.g.b<w>> f119304b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.qna.api.a> f119305c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f119306d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Set<String> f119307e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public j f119308f = new j();

    /* renamed from: g  reason: collision with root package name */
    public int f119309g;

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f119310h = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f119311i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f119312j = new AtomicBoolean(true);

    /* renamed from: k  reason: collision with root package name */
    private t<com.ss.android.ugc.aweme.qna.g.b<List<f>>> f119313k;

    /* renamed from: l  reason: collision with root package name */
    private final int f119314l = com.ss.android.ugc.aweme.qna.e.a.a();

    /* renamed from: m  reason: collision with root package name */
    private final Object f119315m = new Object();
    private long n;

    static {
        Covode.recordClassIndex(77485);
    }

    public final void a() {
        a(z.INSTANCE, false, null);
    }

    public c() {
        t<com.ss.android.ugc.aweme.qna.g.b<List<f>>> tVar = new t<>();
        this.f119313k = tVar;
        this.f119303a = tVar;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119319a;

        static {
            Covode.recordClassIndex(77487);
        }

        b(c cVar) {
            this.f119319a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f119319a.a();
            this.f119319a.f119304b.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(w.FAILURE));
            this.f119319a.f119311i.set(false);
        }
    }

    private static String a(com.ss.android.ugc.aweme.qna.api.a aVar) {
        String str = "";
        l.d(aVar, str);
        Iterator it = n.a((Iterable) aVar.f119224e, (Comparator) new C3081c()).iterator();
        while (it.hasNext()) {
            str = str + ((Aweme) it.next()).getAid();
        }
        String.valueOf(aVar.f119220a);
        return str;
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f119318c;

        static {
            Covode.recordClassIndex(77486);
        }

        a(c cVar, boolean z, String str) {
            this.f119316a = cVar;
            this.f119317b = z;
            this.f119318c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            w wVar;
            g gVar = (g) obj;
            this.f119316a.f119309g = gVar.f119242d;
            c cVar = this.f119316a;
            List<com.ss.android.ugc.aweme.qna.api.a> list = gVar.f119241c;
            if (list == null) {
                list = z.INSTANCE;
            }
            cVar.a(list, this.f119317b, this.f119318c);
            this.f119316a.f119312j.set(gVar.f119243e);
            t<com.ss.android.ugc.aweme.qna.g.b<w>> tVar = this.f119316a.f119304b;
            List<com.ss.android.ugc.aweme.qna.api.a> list2 = this.f119316a.f119305c;
            l.d(list2, "");
            if (gVar.f119239a != 0) {
                wVar = w.FAILURE;
            } else if (!list2.isEmpty()) {
                wVar = w.SUCCESS;
            } else {
                wVar = w.SUCCESS_EMPTY;
            }
            tVar.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(wVar));
            this.f119316a.f119311i.set(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.d.i
    public final void a(m mVar) {
        String str;
        MethodCollector.i(9328);
        l.d(mVar, "");
        if (!mVar.f119362a || (str = mVar.f119365d) == null) {
            MethodCollector.o(9328);
            return;
        }
        synchronized (this.f119315m) {
            try {
                this.f119306d.put(mVar.f119363b, str);
                this.f119307e.remove(mVar.f119363b);
            } catch (Throwable th) {
                MethodCollector.o(9328);
                throw th;
            }
        }
        a(z.INSTANCE, false, null);
        MethodCollector.o(9328);
    }

    public final void a(String str) {
        w wVar;
        MethodCollector.i(9131);
        l.d(str, "");
        synchronized (this.f119315m) {
            try {
                Long l2 = null;
                for (T t : this.f119305c) {
                    Iterator<T> it = t.f119224e.iterator();
                    while (it.hasNext()) {
                        String aid = it.next().getAid();
                        if (l.a((Object) (aid != null ? aid.toString() : null), (Object) str)) {
                            l2 = Long.valueOf(t.f119220a);
                        }
                    }
                }
                List<com.ss.android.ugc.aweme.qna.api.a> list = this.f119305c;
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    long j2 = t2.f119220a;
                    if (l2 != null) {
                        if (j2 != l2.longValue()) {
                        }
                    }
                    arrayList.add(t2);
                }
                this.f119305c = n.g((Collection) arrayList);
            } catch (Throwable th) {
                MethodCollector.o(9131);
                throw th;
            }
        }
        a();
        if (!this.f119305c.isEmpty()) {
            wVar = w.SUCCESS;
        } else {
            wVar = w.SUCCESS_EMPTY;
        }
        this.f119304b.setValue(new com.ss.android.ugc.aweme.qna.g.b<>(wVar));
        MethodCollector.o(9131);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.c$c  reason: collision with other inner class name */
    public static final class C3081c<T> implements Comparator {
        static {
            Covode.recordClassIndex(77488);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(t.getAid(), t2.getAid());
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.qna.api.a> list, boolean z, String str) {
        MethodCollector.i(9133);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new d("privacyBanner", str));
        }
        synchronized (this.f119315m) {
            try {
                List<com.ss.android.ugc.aweme.qna.api.a> list2 = this.f119305c;
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    boolean contains = this.f119307e.contains(String.valueOf(next.f119220a));
                    if (this.f119306d.keySet().contains(String.valueOf(next.f119220a))) {
                        str2 = this.f119306d.get(String.valueOf(next.f119220a));
                    }
                    arrayList2.add(f.a.a((com.ss.android.ugc.aweme.qna.api.a) next, str2, contains));
                }
                arrayList.addAll(n.g((Collection) arrayList2));
                List<com.ss.android.ugc.aweme.qna.api.a> list3 = this.f119305c;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(a((com.ss.android.ugc.aweme.qna.api.a) it2.next()));
                }
                Set p = n.p(arrayList3);
                for (T t : list) {
                    String a2 = a((com.ss.android.ugc.aweme.qna.api.a) t);
                    if (!p.contains(a2)) {
                        p.add(a2);
                        this.f119305c = n.a((Collection) this.f119305c, (Object) t);
                        arrayList.add(f.a.a((com.ss.android.ugc.aweme.qna.api.a) t, (String) null, false));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(9133);
                throw th;
            }
        }
        long j2 = this.n + 1;
        this.n = j2;
        arrayList.add(new f(0, String.valueOf(j2)));
        if (arrayList.size() > 1) {
            arrayList.add(new f(6, "void"));
        }
        this.f119313k.postValue(new com.ss.android.ugc.aweme.qna.g.b<>(arrayList));
        MethodCollector.o(9133);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        if (!this.f119311i.get()) {
            this.f119311i.set(true);
            this.f119310h.a(QnaApiV2.a.a().getAnswersTabData(p.g(str), this.f119314l, this.f119309g, str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, z, str3), new b(this)));
        }
    }
}
