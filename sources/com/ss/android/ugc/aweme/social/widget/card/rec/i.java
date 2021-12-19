package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final b f133877e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<RecyclerView> f133878a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.a f133879b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.card.a.i f133880c;

    /* renamed from: d  reason: collision with root package name */
    public final h f133881d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f133882f = h.i.a((h.f.a.a) new C3473i(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f133883g = h.i.a((h.f.a.a) new h(this));

    static {
        Covode.recordClassIndex(87586);
    }

    public final SocialCardVM a() {
        return (SocialCardVM) this.f133882f.getValue();
    }

    public final com.bytedance.ies.powerlist.page.config.b<Integer> b() {
        return (com.bytedance.ies.powerlist.page.config.b) this.f133883g.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(87589);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a implements h.f.b.a.a, Iterable<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f133884a;

        static {
            Covode.recordClassIndex(87587);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.ss.android.ugc.aweme.social.widget.card.rec.i.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public int f133885a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f133886b;

                static {
                    Covode.recordClassIndex(87588);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f133885a < this.f133886b.f133884a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f133886b.f133884a;
                    int i2 = this.f133885a;
                    this.f133885a = i2 + 1;
                    return viewGroup.getChildAt(i2);
                }

                {
                    this.f133886b = r1;
                }
            };
        }

        public a(ViewGroup viewGroup) {
            this.f133884a = viewGroup;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f133892a;

        static {
            Covode.recordClassIndex(87595);
        }

        f(i iVar) {
            this.f133892a = iVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f133893a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecyclerView f133894b;

            static {
                Covode.recordClassIndex(87596);
            }

            a(int i2, RecyclerView recyclerView) {
                this.f133893a = i2;
                this.f133894b = recyclerView;
            }

            public final void run() {
                this.f133894b.a(this.f133893a, 0);
            }
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView;
            View view;
            Integer num = (Integer) obj;
            WeakReference<RecyclerView> weakReference = this.f133892a.f133878a;
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                l.b(num, "");
                RecyclerView.ViewHolder f2 = recyclerView.f(num.intValue());
                if (f2 != null && (view = f2.itemView) != null) {
                    int width = view.getWidth();
                    recyclerView.b(50, 0);
                    recyclerView.postDelayed(new a(width, recyclerView), 600);
                }
            }
        }
    }

    static final class h extends m implements h.f.a.a<com.bytedance.ies.powerlist.page.config.b<Integer>> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(87598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.powerlist.page.config.b<Integer> invoke() {
            return this.this$0.a().u.getValue();
        }
    }

    public final void c() {
        e();
        d();
        f();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$i  reason: collision with other inner class name */
    static final class C3473i extends m implements h.f.a.a<SocialCardVM> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(87599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3473i(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SocialCardVM invoke() {
            ac a2 = new ad(this.this$0.f133879b, new com.ss.android.ugc.aweme.social.widget.card.rec.vm.a(this.this$0.f133880c)).a(SocialCardVM.class);
            l.b(a2, "");
            return a2;
        }
    }

    private final void d() {
        RecyclerView recyclerView;
        RecyclerView.a adapter;
        WeakReference<RecyclerView> weakReference = this.f133878a;
        if (weakReference != null && (recyclerView = weakReference.get()) != null) {
            com.ss.android.ugc.aweme.social.widget.card.a.h hVar = this.f133880c.f133752c;
            com.ss.android.ugc.aweme.social.widget.card.a.a aVar = null;
            if (hVar != null) {
                aVar = hVar.f133746a;
            }
            if (aVar == com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE && (adapter = recyclerView.getAdapter()) != null) {
                adapter.registerAdapterDataObserver(new com.ss.android.ugc.aweme.social.widget.card.c(this.f133878a));
            }
        }
    }

    private final void e() {
        Map<com.ss.android.ugc.aweme.social.widget.card.a.f, com.ss.android.ugc.aweme.social.widget.card.a.a> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.ss.android.ugc.aweme.social.widget.card.a.g gVar = this.f133880c.f133751b;
        if (!(gVar == null || (map = gVar.f133742a) == null)) {
            for (Map.Entry<com.ss.android.ugc.aweme.social.widget.card.a.f, com.ss.android.ugc.aweme.social.widget.card.a.a> entry : map.entrySet()) {
                Class<? extends PermissionCell<? extends com.ss.android.ugc.aweme.social.widget.card.permission.c>> a2 = com.ss.android.ugc.aweme.social.widget.card.e.a(entry.getKey(), entry.getValue());
                linkedHashMap.put(Integer.valueOf(a2.hashCode()), a2);
            }
        }
        com.ss.android.ugc.aweme.social.widget.card.a.h hVar = this.f133880c.f133752c;
        if (hVar != null) {
            Class<? extends RecommendUserCell<com.ss.android.ugc.aweme.social.widget.card.rec.cell.a>> a3 = com.ss.android.ugc.aweme.social.widget.card.e.a(hVar);
            linkedHashMap.put(Integer.valueOf(a3.hashCode()), a3);
        }
        this.f133881d.a(linkedHashMap);
        if (this.f133880c.f133755f) {
            this.f133881d.a(com.ss.android.ugc.aweme.social.widget.card.i.f133800a.a().a(this.f133879b, this.f133880c.f133756g));
        }
    }

    private final void f() {
        com.ss.android.ugc.aweme.social.widget.card.a.a aVar;
        a().f133921m.observe(this.f133879b, new c(this));
        a().r.observe(this.f133879b, new d(this));
        a().t.observe(this.f133879b, new e(this));
        com.ss.android.ugc.aweme.social.widget.card.a.h hVar = this.f133880c.f133752c;
        if (hVar != null) {
            aVar = hVar.f133746a;
        } else {
            aVar = null;
        }
        if (aVar == com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE) {
            a().o.observe(this.f133879b, new f(this));
        }
        a().q.observe(this.f133879b, new g(this));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f133888a;

        static {
            Covode.recordClassIndex(87591);
        }

        d(i iVar) {
            this.f133888a = iVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                Context context = this.f133888a.f133879b.f133712a;
                if (!(context instanceof androidx.fragment.app.e)) {
                    context = null;
                }
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                if (eVar != null) {
                    new com.bytedance.tux.g.b(eVar).e(intValue).b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f133895a;

        static {
            Covode.recordClassIndex(87597);
        }

        g(i iVar) {
            this.f133895a = iVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView;
            p pVar = (p) obj;
            boolean booleanValue = ((Boolean) pVar.component1()).booleanValue();
            int intValue = ((Number) pVar.component2()).intValue();
            WeakReference<RecyclerView> weakReference = this.f133895a.f133878a;
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                l.b(recyclerView, "");
                int childCount = recyclerView.getChildCount();
                if (intValue >= 0 && childCount > intValue) {
                    if (booleanValue) {
                        recyclerView.d(intValue);
                    } else {
                        recyclerView.b(intValue);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f133889a;

        static {
            Covode.recordClassIndex(87592);
        }

        e(i iVar) {
            this.f133889a = iVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Context a2 = this.f133889a.f133879b.a();
            Class<? extends com.ss.android.ugc.aweme.ufr.a> a3 = com.ss.android.ugc.aweme.social.widget.card.e.a(((com.ss.android.ugc.aweme.social.widget.card.permission.c) obj).f133825a);
            User c2 = in.c();
            l.b(c2, "");
            String uid = c2.getUid();
            String str = this.f133889a.f133880c.f133753d.get("enter_from");
            if (str == null) {
                str = "";
            }
            f.a.b.b a4 = com.ss.android.ugc.aweme.ufr.b.a(a2, a3, uid, str, "click", true, false, null).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(AnonymousClass1.f133890a, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.social.widget.card.rec.i.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f133891a;

                static {
                    Covode.recordClassIndex(87594);
                }

                {
                    this.f133891a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    ((Throwable) obj).getMessage();
                    this.f133891a.f133889a.a().a(R.string.mr);
                }
            });
            l.b(a4, "");
            f.a.j.a.a(a4, this.f133889a.a().f133910b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f133887a;

        static {
            Covode.recordClassIndex(87590);
        }

        c(i iVar) {
            this.f133887a = iVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.social.widget.card.a.a aVar;
            RecyclerView recyclerView;
            List<? extends com.bytedance.ies.powerlist.b.a> list = (List) obj;
            if (list != null) {
                i iVar = this.f133887a;
                com.ss.android.ugc.aweme.social.widget.card.a.h hVar = iVar.f133880c.f133752c;
                if (hVar != null) {
                    aVar = hVar.f133746a;
                } else {
                    aVar = null;
                }
                if (aVar == com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t instanceof com.ss.android.ugc.aweme.social.widget.card.rec.cell.a) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<T> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                    for (T t2 : arrayList2) {
                        arrayList3.add(t2.f133855a);
                    }
                    int a2 = RecUserSquareCell.a.a(arrayList3);
                    WeakReference<RecyclerView> weakReference = iVar.f133878a;
                    if (!(weakReference == null || (recyclerView = weakReference.get()) == null)) {
                        for (T t3 : new a(recyclerView)) {
                            if (t3.getLayoutParams().height != a2) {
                                ViewGroup.LayoutParams layoutParams = t3.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = a2;
                                    t3.setLayoutParams(layoutParams);
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            }
                        }
                        recyclerView.c();
                        recyclerView.a(new com.ss.android.ugc.aweme.social.widget.card.b(a2));
                    }
                    PermissionSquareCell.f133819l = a2;
                }
                this.f133887a.f133881d.b(list);
            }
        }
    }

    public i(com.ss.android.ugc.aweme.social.widget.a aVar, com.ss.android.ugc.aweme.social.widget.card.a.i iVar, h hVar) {
        WeakReference<RecyclerView> weakReference;
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(hVar, "");
        this.f133879b = aVar;
        this.f133880c = iVar;
        this.f133881d = hVar;
        hVar.getClass().getSimpleName();
        com.ss.android.ugc.aweme.social.widget.card.a.h hVar2 = iVar.f133752c;
        if (hVar2 != null) {
            weakReference = hVar2.f133749d;
        } else {
            weakReference = null;
        }
        this.f133878a = weakReference;
    }
}
