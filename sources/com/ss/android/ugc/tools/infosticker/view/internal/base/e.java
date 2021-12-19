package com.ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import f.a.d.f;
import f.a.l.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e<CATEGORY, DATA> implements com.ss.android.ugc.tools.infosticker.view.a.e<CATEGORY, DATA> {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.tools.infosticker.view.a.a<CATEGORY, DATA> f149586a;

    /* renamed from: b  reason: collision with root package name */
    private int f149587b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final List<p<CATEGORY, List<DATA>>> f149588c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final TabLayout f149589d;

    /* renamed from: e  reason: collision with root package name */
    private final g<CATEGORY> f149590e;

    /* renamed from: f  reason: collision with root package name */
    private f.a.b.a f149591f;

    static {
        Covode.recordClassIndex(98503);
    }

    /* access modifiers changed from: protected */
    public abstract View a(Context context, CATEGORY category);

    /* access modifiers changed from: protected */
    public void a(View view, CATEGORY category, int i2, int i3) {
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.e
    public final t<CATEGORY> a() {
        t<CATEGORY> c2 = this.f149590e.c();
        l.b(c2, "");
        return c2;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f149594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f149595b;

        static {
            Covode.recordClassIndex(98506);
        }

        c(e eVar, List list) {
            this.f149594a = eVar;
            this.f149595b = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            Object obj;
            e eVar = this.f149594a;
            p pVar = (p) n.h(this.f149595b);
            if (pVar != null) {
                obj = pVar.getFirst();
            } else {
                obj = null;
            }
            eVar.a(obj, false);
        }
    }

    static final class b<T> implements f<List<? extends p<? extends CATEGORY, ? extends List<? extends DATA>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f149593a;

        static {
            Covode.recordClassIndex(98505);
        }

        b(e eVar) {
            this.f149593a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<? extends p<? extends CATEGORY, ? extends List<? extends DATA>>> list = (List) obj;
            e eVar = this.f149593a;
            l.b(list, "");
            eVar.a((List) list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f149596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f149597b;

        static {
            Covode.recordClassIndex(98507);
        }

        d(e eVar, Object obj) {
            this.f149596a = eVar;
            this.f149597b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149596a.a(this.f149597b);
        }
    }

    static final class a<T> implements f<p<? extends DATA, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f149592a;

        static {
            Covode.recordClassIndex(98504);
        }

        a(e eVar) {
            this.f149592a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.base.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            this.f149592a.a(pVar.component1(), ((Number) pVar.component2()).intValue());
        }
    }

    public final void a(CATEGORY category) {
        this.f149590e.onNext(category);
        a((Object) category, true);
    }

    public e(TabLayout tabLayout) {
        l.d(tabLayout, "");
        this.f149589d = tabLayout;
        f.a.l.c cVar = new f.a.l.c();
        l.b(cVar, "");
        this.f149590e = cVar;
        tabLayout.setVisibility(8);
        tabLayout.setTabMargin(0);
    }

    private void b(List<? extends CATEGORY> list) {
        l.d(list, "");
        this.f149589d.b();
        int i2 = 0;
        for (T t : list) {
            Context context = this.f149589d.getContext();
            l.b(context, "");
            View a2 = a(context, t);
            TabLayout.f a3 = this.f149589d.a().a(a2);
            l.b(a3, "");
            this.f149589d.a(a3);
            a2.setOnClickListener(new d(this, t));
            View c2 = this.f149589d.c(i2);
            l.b(c2, "");
            a(c2, t, i2, list.size());
            i2++;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.e
    public final void a(com.ss.android.ugc.tools.infosticker.view.a.a<CATEGORY, DATA> aVar) {
        l.d(aVar, "");
        f.a.b.a aVar2 = this.f149591f;
        if (aVar2 != null) {
            aVar2.dispose();
        }
        f.a.b.a aVar3 = new f.a.b.a();
        this.f149591f = aVar3;
        aVar3.a(aVar.i().a(new a(this), com.ss.android.ugc.tools.utils.p.f150012a));
        f.a.b.a aVar4 = this.f149591f;
        if (aVar4 != null) {
            aVar4.a(aVar.a().a(new b(this), com.ss.android.ugc.tools.utils.p.f150012a));
        }
        this.f149586a = aVar;
    }

    public void a(List<? extends p<? extends CATEGORY, ? extends List<? extends DATA>>> list) {
        int i2;
        l.d(list, "");
        this.f149588c.clear();
        this.f149588c.addAll(list);
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        b(arrayList);
        this.f149589d.post(new c(this, list));
        TabLayout tabLayout = this.f149589d;
        if (list.isEmpty()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        tabLayout.setVisibility(i2);
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i2) {
        TabLayout.f a2;
        if (this.f149589d.getSelectedTabPosition() != i2 && (a2 = this.f149589d.a(i2)) != null) {
            a2.a();
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2) {
        if (this.f149589d.getCurSelectedTab() != null) {
            TabLayout.f curSelectedTab = this.f149589d.getCurSelectedTab();
            l.b(curSelectedTab, "");
            View view2 = curSelectedTab.f130751f;
            if (view2 != null) {
                view2.setSelected(false);
            }
        }
        this.f149589d.d();
    }

    public final void a(DATA data, int i2) {
        int size = this.f149588c.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            p<CATEGORY, List<DATA>> pVar = this.f149588c.get(i4);
            CATEGORY component1 = pVar.component1();
            List<DATA> component2 = pVar.component2();
            i3 += component2.size();
            if (i3 >= i2 && component2.contains(data)) {
                a((Object) component1, false);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.ss.android.ugc.tools.infosticker.view.a.a<CATEGORY, DATA> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(CATEGORY category, boolean z) {
        View view;
        p pVar;
        List list;
        Object h2;
        com.ss.android.ugc.tools.infosticker.view.a.a<CATEGORY, DATA> aVar;
        int i2 = -1;
        if (category != null) {
            int i3 = 0;
            Iterator<p<CATEGORY, List<DATA>>> it = this.f149588c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (l.a((Object) it.next().getFirst(), (Object) category)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!(!z || i2 < 0 || (pVar = (p) n.b((List) this.f149588c, i2)) == null || (list = (List) pVar.getSecond()) == null || (h2 = n.h(list)) == null || (aVar = this.f149586a) == 0)) {
            aVar.a(h2, i2);
        }
        int i4 = this.f149587b;
        View view2 = null;
        if (i4 != i2 && i4 >= 0) {
            this.f149589d.a(i4);
            TabLayout.f a2 = this.f149589d.a(this.f149587b);
            if (a2 != null) {
                view = a2.f130751f;
            } else {
                view = null;
            }
            a(view, this.f149587b);
        }
        if (i2 >= 0 && this.f149587b != i2) {
            TabLayout.f a3 = this.f149589d.a(i2);
            if (a3 != null) {
                view2 = a3.f130751f;
            }
            b(view2, i2);
            this.f149589d.c(a3);
        }
        this.f149587b = i2;
    }
}
