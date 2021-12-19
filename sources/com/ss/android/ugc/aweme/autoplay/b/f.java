package com.ss.android.ugc.aweme.autoplay.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.autoplay.b.d;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gg;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.l.k;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class f extends a implements b.AbstractC1937b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f67287f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f67288e;

    /* renamed from: g  reason: collision with root package name */
    private final h f67289g = i.a((h.f.a.a) c.f67296a);

    /* renamed from: h  reason: collision with root package name */
    private final h f67290h = i.a((h.f.a.a) b.f67295a);

    /* renamed from: j  reason: collision with root package name */
    private int f67291j;

    /* renamed from: k  reason: collision with root package name */
    private int f67292k;

    /* renamed from: l  reason: collision with root package name */
    private List<? extends Aweme> f67293l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.flowfeed.a.a f67294m;
    private final g n;

    static {
        Covode.recordClassIndex(41447);
    }

    private final LinkedHashMap<String, p<Aweme, Integer>> f() {
        return (LinkedHashMap) this.f67289g.getValue();
    }

    private final AtomicInteger g() {
        return (AtomicInteger) this.f67290h.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41448);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.ss.android.ugc.aweme.autoplay.d.g
    public final List<Aweme> a() {
        return this.f67293l;
    }

    static final class b extends m implements h.f.a.a<AtomicInteger> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67295a = new b();

        static {
            Covode.recordClassIndex(41449);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AtomicInteger invoke() {
            return new AtomicInteger(0);
        }
    }

    static final class c extends m implements h.f.a.a<LinkedHashMap<String, p<? extends Aweme, ? extends Integer>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f67296a = new c();

        static {
            Covode.recordClassIndex(41450);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinkedHashMap<String, p<? extends Aweme, ? extends Integer>> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f67293l.size() == 1) {
            return 1;
        }
        return this.f67293l.size();
    }

    static final class d extends m implements h.f.a.b<p<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f67297a = new d();

        static {
            Covode.recordClassIndex(41451);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Aweme invoke(p<? extends Aweme, ? extends Integer> pVar) {
            p<? extends Aweme, ? extends Integer> pVar2 = pVar;
            l.d(pVar2, "");
            return pVar2.getFirst();
        }
    }

    private final void b(List<? extends Aweme> list) {
        Integer num;
        list.size();
        g().get();
        LinkedHashMap<String, p<Aweme, Integer>> f2 = f();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(v.a(t.getAid(), new p(t, Integer.valueOf(g().getAndIncrement()))));
        }
        ag.a(f2, arrayList);
        LinkedHashMap<String, p<Aweme, Integer>> f3 = f();
        if (f3 != null) {
            num = Integer.valueOf(f3.size());
        } else {
            num = null;
        }
        num.intValue();
        g().get();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.g
    public final void a(List<? extends Aweme> list) {
        int i2;
        Integer second;
        Integer second2;
        l.d(list, "");
        this.f67293l = list;
        if (f().isEmpty()) {
            b(list);
        }
        p<Aweme, Integer> pVar = f().get(((Aweme) list.get(0)).getAid());
        int i3 = -1;
        if (pVar == null || (second2 = pVar.getSecond()) == null) {
            i2 = -1;
        } else {
            i2 = second2.intValue();
        }
        this.f67291j = i2;
        p<Aweme, Integer> pVar2 = f().get(((Aweme) list.get(list.size() - 1)).getAid());
        if (!(pVar2 == null || (second = pVar2.getSecond()) == null)) {
            i3 = second.intValue();
        }
        this.f67292k = i3;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(String str) {
        p<Aweme, Integer> pVar;
        Integer second;
        int i2;
        l.d(str, "");
        if (!(this.f67293l.size() <= 1 || (pVar = f().get(str)) == null || (second = pVar.getSecond()) == null)) {
            int intValue = second.intValue();
            int c2 = h.j.h.c(f().size(), 10) - 1;
            int i3 = this.f67291j;
            int i4 = this.f67292k;
            if (i3 > intValue || i4 < intValue) {
                if (intValue < i3) {
                    i2 = c2 + intValue;
                } else {
                    int i5 = intValue - c2;
                    i2 = intValue + 1;
                    intValue = i5;
                }
                Collection<p<Aweme, Integer>> values = f().values();
                l.b(values, "");
                List g2 = k.g(k.e(n.t(values), d.f67297a));
                if (!g2.isEmpty()) {
                    int size = g2.size() - 1;
                    if (intValue >= 0 && size >= intValue && i2 >= 0 && size >= i2 && intValue <= i2) {
                        g2 = g2.subList(intValue, i2);
                    }
                }
                a.a(this, g2, null, null, false, 6);
            }
            int i6 = -1;
            int i7 = 0;
            for (T t : this.f67293l) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    n.a();
                }
                if (l.a((Object) t.getAid(), (Object) str)) {
                    i6 = i7;
                }
                i7 = i8;
            }
            RecyclerView.i layoutManager = this.f67288e.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                linearLayoutManager.a(i6, 0);
                linearLayoutManager.a(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (getItemViewType(i2) == 1 && (viewHolder instanceof d)) {
            ((d) viewHolder).a(((a) this).f67240a, (Aweme) this.f67293l.get(i2), this.f67242c, this, this.f67243d.get(i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.c.b.AbstractC1937b
    public final void a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        l.d(searchLiveList, "");
        l.d(list, "");
        list.size();
        b(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.ss.android.ugc.aweme.flowfeed.a.a aVar, g gVar, RecyclerView recyclerView) {
        super(recyclerView);
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(recyclerView, "");
        this.f67294m = aVar;
        this.n = gVar;
        this.f67288e = recyclerView;
        gVar.f96190g = new com.ss.android.ugc.aweme.autoplay.player.a(recyclerView, gVar);
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2393);
        l.d(viewGroup, "");
        d a3 = d.a.a(viewGroup, fVar.f67294m, fVar.n, fVar);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(2393);
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.b.a
    public final void a(List<? extends Aweme> list, com.ss.android.ugc.aweme.discover.mixfeed.g gVar, Long l2, boolean z) {
        long j2;
        long j3;
        String str;
        long j4;
        long j5;
        String str2;
        l.d(list, "");
        h hVar = null;
        if (z) {
            this.f67242c = null;
            f().clear();
            g().set(0);
        }
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f67243d.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f67243d.add(new com.ss.android.ugc.aweme.search.ecom.live.b(it.next()));
        }
        if (this.f67242c == null) {
            for (T t : list) {
                User author = t.getAuthor();
                if (author != null) {
                    j4 = author.roomId;
                } else {
                    j4 = 0;
                }
                arrayList.add(Long.valueOf(j4));
                User author2 = t.getAuthor();
                if (author2 != null) {
                    j5 = author2.roomId;
                } else {
                    j5 = 0;
                }
                User author3 = t.getAuthor();
                if (author3 == null || (str2 = author3.getUid()) == null) {
                    str2 = "";
                }
                arrayList2.add(new RoomInfo(j5, str2));
            }
            hVar = new h(gVar, this.f67241b, list, arrayList, arrayList2, l2);
        } else {
            Collection<p<Aweme, Integer>> values = f().values();
            l.b(values, "");
            ArrayList arrayList3 = new ArrayList(n.a(values, 10));
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getFirst());
            }
            ArrayList<Aweme> arrayList4 = arrayList3;
            for (Aweme aweme : arrayList4) {
                User author4 = aweme.getAuthor();
                if (author4 != null) {
                    j2 = author4.roomId;
                } else {
                    j2 = 0;
                }
                arrayList.add(Long.valueOf(j2));
                User author5 = aweme.getAuthor();
                if (author5 != null) {
                    j3 = author5.roomId;
                } else {
                    j3 = 0;
                }
                User author6 = aweme.getAuthor();
                if (author6 == null || (str = author6.getUid()) == null) {
                    str = "";
                }
                arrayList2.add(new RoomInfo(j3, str));
            }
            h hVar2 = this.f67242c;
            if (hVar2 != null) {
                hVar = new h(hVar2.f67310a, hVar2.f67311b, arrayList4, arrayList, arrayList2, hVar2.f67315f);
            }
        }
        this.f67242c = hVar;
        notifyDataSetChanged();
    }
}
