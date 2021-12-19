package com.ss.android.ugc.aweme.discover.adapter;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.a.ai;
import com.ss.android.ugc.aweme.discover.a.aj;
import com.ss.android.ugc.aweme.discover.a.al;
import com.ss.android.ugc.aweme.discover.d.a.a;
import com.ss.android.ugc.aweme.discover.d.a.b;
import com.ss.android.ugc.aweme.discover.d.a.d;
import com.ss.android.ugc.aweme.discover.d.a.e;
import com.ss.android.ugc.aweme.discover.d.a.f;
import com.ss.android.ugc.aweme.discover.d.a.g;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.TrendingData;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.utils.ec;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ak<SuggestType> extends com.ss.android.ugc.aweme.discover.c.c<Object> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f80371i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.d.a.c f80372a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.d.a.a f80373b;

    /* renamed from: c  reason: collision with root package name */
    public final d f80374c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.d.a.b f80375d;

    /* renamed from: e  reason: collision with root package name */
    public final e f80376e;

    /* renamed from: f  reason: collision with root package name */
    public final g f80377f;

    /* renamed from: g  reason: collision with root package name */
    public final f f80378g;

    /* renamed from: h  reason: collision with root package name */
    public final Fragment f80379h;

    /* renamed from: k  reason: collision with root package name */
    private final h f80380k = ec.a(new c(this));

    static {
        Covode.recordClassIndex(50025);
    }

    public final ak<SuggestType>.b a() {
        return (b) this.f80380k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50026);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public a.b f80381a = a.b.TYPE_NULL;

        /* renamed from: b  reason: collision with root package name */
        public d.a f80382b = d.a.f80936a;

        /* renamed from: c  reason: collision with root package name */
        public b.a f80383c = b.a.f80933a;

        /* renamed from: d  reason: collision with root package name */
        public boolean f80384d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f80385e;

        /* renamed from: f  reason: collision with root package name */
        public List<TypeWords> f80386f;

        /* renamed from: g  reason: collision with root package name */
        public TrendingData f80387g;

        /* renamed from: i  reason: collision with root package name */
        private final h f80389i = ec.a(C1873b.f80392a);

        /* renamed from: j  reason: collision with root package name */
        private final h f80390j = ec.a(c.f80393a);

        static {
            Covode.recordClassIndex(50027);
        }

        public final ArrayList<SearchHistory> a() {
            return (ArrayList) this.f80390j.getValue();
        }

        /* access modifiers changed from: package-private */
        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f80391a;

            static {
                Covode.recordClassIndex(50028);
            }

            a(b bVar) {
                this.f80391a = bVar;
            }

            public final void run() {
                ak.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ak$b$b  reason: collision with other inner class name */
        static final class C1873b extends m implements h.f.a.a<ArrayList<SearchHistory>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1873b f80392a = new C1873b();

            static {
                Covode.recordClassIndex(50029);
            }

            C1873b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ArrayList<SearchHistory> invoke() {
                return new ArrayList();
            }
        }

        static final class c extends m implements h.f.a.a<ArrayList<SearchHistory>> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80393a = new c();

            static {
                Covode.recordClassIndex(50030);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ArrayList<SearchHistory> invoke() {
                return new ArrayList();
            }
        }

        private final boolean d() {
            if (!this.f80384d || ai.f80149a == 0 || ai.f80149a == 1) {
                return true;
            }
            if (ai.f80149a == 2 || ai.f80149a == 3) {
                return false;
            }
            return true;
        }

        private final boolean c() {
            if (ai.f80149a == 0) {
                if (a().size() > 3) {
                    return true;
                }
                return false;
            } else if (ai.f80149a == 3) {
                if (a().size() > 4) {
                    return true;
                }
                return false;
            } else if ((ai.f80149a == 2 || ai.f80149a == 1) && a().size() > 5) {
                return true;
            } else {
                return false;
            }
        }

        private final List<SearchHistory> e() {
            ArrayList arrayList = new ArrayList(a());
            if (ai.f80149a == 0) {
                return new ArrayList(arrayList.subList(0, 3));
            }
            if (ai.f80149a == 3) {
                return new ArrayList(arrayList.subList(0, 4));
            }
            if (ai.f80149a == 2 || ai.f80149a == 1) {
                return new ArrayList(arrayList.subList(0, 5));
            }
            return new ArrayList();
        }

        public final void b() {
            ArrayList arrayList = new ArrayList();
            boolean d2 = d();
            if (!a().isEmpty() && this.f80381a != a.b.TYPE_NULL && d2) {
                arrayList.add(this.f80381a);
            }
            boolean c2 = c();
            if (!this.f80385e && this.f80384d && c2) {
                arrayList.add(e());
            } else if (!a().isEmpty()) {
                arrayList.add(a());
            }
            if (!this.f80385e && this.f80384d && c2) {
                arrayList.add(this.f80382b);
            }
            if (this.f80385e && this.f80384d && c2 && !d2) {
                arrayList.add(this.f80383c);
            }
            ak.this.f80903j.clear();
            ak.this.f80903j.addAll(arrayList);
            List<TypeWords> list = this.f80386f;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        ak.this.f80903j.add(t);
                    }
                }
            }
            TrendingData trendingData = this.f80387g;
            if (trendingData != null) {
                ak.this.f80903j.add(trendingData);
            }
            androidx.fragment.app.e activity = ak.this.f80379h.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new a(this));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
            boolean z;
            if (al.f80155a || aj.f80151a || com.ss.android.ugc.aweme.discover.a.a.a.f80125a) {
                z = true;
            } else {
                z = false;
            }
            this.f80384d = z;
        }
    }

    static final class c extends m implements h.f.a.a<ak<SuggestType>.b> {
        final /* synthetic */ ak this$0;

        static {
            Covode.recordClassIndex(50031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ak akVar) {
            super(0);
            this.this$0 = akVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ak<SuggestType>.b invoke() {
            return new b();
        }
    }

    public final void b() {
        ak<SuggestType>.b a2 = a();
        a2.f80385e = false;
        a2.b();
    }

    public final void a(List<TypeWords> list) {
        ak<SuggestType>.b a2 = a();
        a2.f80386f = list;
        a2.b();
    }

    public ak(Fragment fragment) {
        l.d(fragment, "");
        this.f80379h = fragment;
        com.ss.android.ugc.aweme.discover.d.a.c cVar = new com.ss.android.ugc.aweme.discover.d.a.c();
        this.f80372a = cVar;
        com.ss.android.ugc.aweme.discover.d.a.a aVar = new com.ss.android.ugc.aweme.discover.d.a.a();
        this.f80373b = aVar;
        d dVar = new d();
        this.f80374c = dVar;
        com.ss.android.ugc.aweme.discover.d.a.b bVar = new com.ss.android.ugc.aweme.discover.d.a.b();
        this.f80375d = bVar;
        e eVar = new e();
        this.f80376e = eVar;
        g gVar = new g();
        this.f80377f = gVar;
        f fVar = new f();
        this.f80378g = fVar;
        a(cVar);
        a(aVar);
        a(dVar);
        a(eVar);
        a(bVar);
        a(gVar);
        a(fVar);
    }

    public final void a(List<? extends SearchHistory> list, boolean z) {
        a.b bVar;
        a.b bVar2;
        ArrayList arrayList = new ArrayList();
        if (z) {
            bVar = a.b.TYPE_NONE;
        } else {
            bVar = a().f80381a;
        }
        l.d(arrayList, "");
        l.d(bVar, "");
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            bVar2 = a.b.TYPE_NONE;
        } else {
            if (list == null) {
                l.b();
            }
            arrayList.addAll(list);
            if (list.size() <= 0) {
                bVar2 = a.b.TYPE_NONE;
            } else {
                bVar2 = a.b.TYPE_CLEAR_ALL;
            }
        }
        ak<SuggestType>.b a2 = a();
        l.d(arrayList, "");
        a2.a().clear();
        a2.a().addAll(arrayList);
        com.ss.android.ugc.aweme.discover.adapter.viewholder.f.f80661a = !arrayList.isEmpty();
        a2.b();
        ak<SuggestType>.b a3 = a();
        l.d(bVar2, "");
        a3.f80381a = bVar2;
        a3.b();
    }
}
