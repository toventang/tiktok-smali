package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.x;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.FlexLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class e extends com.bytedance.assem.arch.d.a implements g {

    /* renamed from: j  reason: collision with root package name */
    public final a f117967j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> f117968k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> f117969l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a> f117970m = new ArrayList();
    private final Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d, Boolean> n = new LinkedHashMap();
    private final Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a, Boolean> o = new LinkedHashMap();
    private final Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b, Boolean> p = new LinkedHashMap();
    private TuxNavBar q;
    private final TuxNavBar.a r = new TuxNavBar.a();
    private final com.bytedance.tux.navigation.a.g s = new com.bytedance.tux.navigation.a.g();

    static {
        Covode.recordClassIndex(76466);
    }

    static final class g extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {
        final /* synthetic */ h.f.a.b $updater;

        static {
            Covode.recordClassIndex(76477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h.f.a.b bVar) {
            super(1);
            this.$updater = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            this.$updater.invoke(cVar2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c $area;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
            super(1);
            this.this$0 = eVar;
            this.$area = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            f.a(cVar2, false);
            this.this$0.a(this.$area, false);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ b $it;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b bVar, e eVar) {
            super(1);
            this.$it = bVar;
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.c, z>) new h.f.a.b<com.bytedance.assem.arch.core.c, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.a.e.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(76469);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.c cVar) {
                    com.bytedance.assem.arch.core.c cVar2 = cVar;
                    l.d(cVar2, "");
                    cVar2.a(this.this$0.$it.f117961b);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ b $it;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, e eVar) {
            super(1);
            this.$it = bVar;
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.c, z>) new h.f.a.b<com.bytedance.assem.arch.core.c, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.a.e.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(76471);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.c cVar) {
                    com.bytedance.assem.arch.core.c cVar2 = cVar;
                    l.d(cVar2, "");
                    cVar2.a(this.this$0.$it.f117961b);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ b $it;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, e eVar) {
            super(1);
            this.$it = bVar;
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.c, z>) new h.f.a.b<com.bytedance.assem.arch.core.c, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.a.e.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(76473);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.c cVar) {
                    com.bytedance.assem.arch.core.c cVar2 = cVar;
                    l.d(cVar2, "");
                    cVar2.a(this.this$0.$it.f117961b);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$e  reason: collision with other inner class name */
    public static final class C3007e extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3007e(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.a.e.C3007e.AnonymousClass1 */
                final /* synthetic */ C3007e this$0;

                static {
                    Covode.recordClassIndex(76475);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(this.this$0.this$0.f117967j);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c $area;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
            super(1);
            this.this$0 = eVar;
            this.$area = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            l.d(cVar2, "");
            f.a(cVar2, true);
            this.this$0.a(this.$area, true);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public void b(View view) {
        l.d(view, "");
        if (view instanceof TuxNavBar) {
            this.q = (TuxNavBar) view;
            com.bytedance.assem.arch.extensions.d.a(this, new C3007e(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final void b(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
        l.d(cVar, "");
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.a(cVar, new a(this, cVar));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final boolean c(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
        Boolean bool;
        l.d(cVar, "");
        if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.d) {
            Boolean bool2 = this.n.get(cVar);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        } else if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.a) {
            return true;
        } else {
            if (!(cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.b) || (bool = this.p.get(cVar)) == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final void a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
        l.d(cVar, "");
        List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c> list = this.f117967j.f117958b.get(cVar);
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = e(cVar).iterator();
            while (it.hasNext()) {
                if (list.contains(it.next())) {
                    return;
                }
            }
        }
        List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c> list2 = this.f117967j.f117957a.get(cVar);
        if (list2 != null && !list2.isEmpty()) {
            for (T t : e(cVar)) {
                if (list2.contains(t)) {
                    b((com.ss.android.ugc.aweme.profile.widgets.navbar.b.c) t);
                }
            }
        }
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.a(cVar, new f(this, cVar));
    }

    public final void c(List<b<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b>> list) {
        l.d(list, "");
        this.f117969l.clear();
        this.p.clear();
        for (T t : list) {
            this.f117969l.add(t.f117960a);
            this.p.put(t.f117960a, false);
            TuxNavBar.a aVar = this.r;
            com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(0);
            a2.f45197e = false;
            aVar.b(a2.a((Object) t.f117960a));
        }
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.setNavActions(this.r);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.bytedance.assem.arch.extensions.d.a(this, new c(it.next(), this));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final View d(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
        Object obj;
        l.d(cVar, "");
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        l.c(cVar, "");
        LinearLayout linearLayout = (LinearLayout) tuxNavBar.a(R.id.nav_start);
        l.a((Object) linearLayout, "");
        h<View> a2 = x.a(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) tuxNavBar.a(R.id.nav_end);
        l.a((Object) linearLayout2, "");
        h a3 = k.a((h) a2, (h) x.a(linearLayout2));
        LinearLayout linearLayout3 = (LinearLayout) tuxNavBar.a(R.id.cso);
        l.a((Object) linearLayout3, "");
        Iterator a4 = k.a(a3, (h) x.a(linearLayout3)).a();
        while (true) {
            if (!a4.hasNext()) {
                obj = null;
                break;
            }
            obj = a4.next();
            if (TuxNavBar.a((View) obj, cVar)) {
                break;
            }
        }
        return (View) obj;
    }

    private final List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c> e(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar) {
        if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.d) {
            Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d, Boolean> map = this.n;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(entry2.getKey());
            }
            return arrayList;
        } else if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.a) {
            return h.a.z.INSTANCE;
        } else {
            if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.b) {
                Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b, Boolean> map2 = this.p;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b, Boolean> entry3 : map2.entrySet()) {
                    if (entry3.getValue().booleanValue()) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    arrayList2.add(entry4.getKey());
                }
                return arrayList2;
            }
            throw new IllegalArgumentException("Not StartArea, CenterArea or EndArea");
        }
    }

    public final void a(List<b<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d>> list) {
        l.d(list, "");
        this.n.clear();
        this.f117968k.clear();
        for (T t : list) {
            this.f117968k.add(t.f117960a);
            this.n.put(t.f117960a, false);
            TuxNavBar.a aVar = this.r;
            com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(0);
            a2.f45197e = false;
            aVar.a(a2.a((Object) t.f117960a));
        }
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.setNavActions(this.r);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.bytedance.assem.arch.extensions.d.a(this, new d(it.next(), this));
        }
    }

    public final void b(List<b<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a>> list) {
        l.d(list, "");
        this.f117970m.clear();
        this.o.clear();
        for (T t : list) {
            this.f117970m.add(t.f117960a);
            this.o.put(t.f117960a, false);
            TuxNavBar.a aVar = this.r;
            com.bytedance.tux.navigation.a.g gVar = this.s;
            gVar.a((Object) t.f117960a);
            aVar.a(gVar);
            com.bytedance.assem.arch.extensions.d.a(this, new b(t, this));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final void a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar, h.f.a.b<? super com.bytedance.tux.navigation.a.b, z> bVar) {
        l.d(cVar, "");
        l.d(bVar, "");
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.a(cVar, new g(bVar));
    }

    public final void a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar, boolean z) {
        if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.d) {
            this.n.put(cVar, Boolean.valueOf(z));
        } else if (cVar instanceof com.ss.android.ugc.aweme.profile.widgets.navbar.b.b) {
            this.p.put(cVar, Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final void b(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar, h.f.a.b<? super com.bytedance.tux.navigation.a.g, z> bVar) {
        l.d(cVar, "");
        l.d(bVar, "");
        bVar.invoke(this.s);
        TuxNavBar tuxNavBar = this.q;
        if (tuxNavBar == null) {
            l.a("navBar");
        }
        tuxNavBar.a(this.s);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.g
    public final void b(com.ss.android.ugc.aweme.profile.widgets.navbar.b.c cVar, boolean z) {
        l.d(cVar, "");
        if (z) {
            TuxNavBar tuxNavBar = this.q;
            if (tuxNavBar == null) {
                l.a("navBar");
            }
            l.c(cVar, "");
            LinearLayout linearLayout = (LinearLayout) tuxNavBar.a(R.id.nav_start);
            l.a((Object) linearLayout, "");
            h<View> a2 = x.a(linearLayout);
            LinearLayout linearLayout2 = (LinearLayout) tuxNavBar.a(R.id.nav_end);
            l.a((Object) linearLayout2, "");
            Iterator a3 = k.a((h) a2, (h) x.a(linearLayout2)).a();
            while (a3.hasNext()) {
                View view = (View) a3.next();
                if (TuxNavBar.a(view, cVar)) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    int a4 = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    float applyDimension = TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics());
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    com.bytedance.tux.h.i.a(view, a4, applyDimension, TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics()));
                    LinearLayout linearLayout3 = (LinearLayout) tuxNavBar.a(R.id.nav_start);
                    l.a((Object) linearLayout3, "");
                    LinearLayout linearLayout4 = (LinearLayout) tuxNavBar.a(R.id.nav_end);
                    l.a((Object) linearLayout4, "");
                    FlexLayout flexLayout = (FlexLayout) tuxNavBar.a(R.id.csq);
                    l.a((Object) flexLayout, "");
                    for (ViewGroup viewGroup : n.b(linearLayout3, linearLayout4, flexLayout)) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                }
            }
            TuxTextView tuxTextView = (TuxTextView) tuxNavBar.a(R.id.csn);
            l.a((Object) tuxTextView, "");
            if (TuxNavBar.a(tuxTextView, cVar)) {
                TuxTextView tuxTextView2 = (TuxTextView) tuxNavBar.a(R.id.csn);
                l.a((Object) tuxTextView2, "");
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                com.bytedance.tux.h.i.a(tuxTextView2, h.g.a.a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics())), 0.0f, 0.0f);
                LinearLayout linearLayout5 = (LinearLayout) tuxNavBar.a(R.id.cso);
                l.a((Object) linearLayout5, "");
                linearLayout5.setClipToPadding(false);
                LinearLayout linearLayout6 = (LinearLayout) tuxNavBar.a(R.id.cso);
                l.a((Object) linearLayout6, "");
                linearLayout6.setClipChildren(false);
                FlexLayout flexLayout2 = (FlexLayout) tuxNavBar.a(R.id.csq);
                l.a((Object) flexLayout2, "");
                flexLayout2.setClipToPadding(false);
                FlexLayout flexLayout3 = (FlexLayout) tuxNavBar.a(R.id.csq);
                l.a((Object) flexLayout3, "");
                flexLayout3.setClipChildren(false);
                return;
            }
            return;
        }
        TuxNavBar tuxNavBar2 = this.q;
        if (tuxNavBar2 == null) {
            l.a("navBar");
        }
        l.c(cVar, "");
        LinearLayout linearLayout7 = (LinearLayout) tuxNavBar2.a(R.id.nav_start);
        l.a((Object) linearLayout7, "");
        h<View> a5 = x.a(linearLayout7);
        LinearLayout linearLayout8 = (LinearLayout) tuxNavBar2.a(R.id.nav_end);
        l.a((Object) linearLayout8, "");
        Iterator a6 = k.a((h) a5, (h) x.a(linearLayout8)).a();
        while (a6.hasNext()) {
            View view2 = (View) a6.next();
            if (TuxNavBar.a(view2, cVar)) {
                com.bytedance.tux.h.i.c(view2);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) tuxNavBar2.a(R.id.csn);
        l.a((Object) tuxTextView3, "");
        if (TuxNavBar.a(tuxTextView3, cVar)) {
            TuxTextView tuxTextView4 = (TuxTextView) tuxNavBar2.a(R.id.csn);
            l.a((Object) tuxTextView4, "");
            com.bytedance.tux.h.i.c(tuxTextView4);
        }
    }
}
