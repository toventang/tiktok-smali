package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.a.h;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.a.q;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a extends com.ss.android.ugc.tools.infosticker.view.internal.base.b<Effect> implements com.ss.android.ugc.tools.infosticker.view.a.a<EffectCategoryResponse, Effect>, com.ss.android.ugc.tools.infosticker.view.internal.c {
    private final m A;
    private final com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> B;
    private final int C;
    private final boolean D = true;
    private final boolean E;

    /* renamed from: a  reason: collision with root package name */
    public List<p<EffectCategoryResponse, List<Effect>>> f149673a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f149674b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> f149675c;
    private c v;
    private c w;
    private final f.a.l.b<List<p<EffectCategoryResponse, List<Effect>>>> x;
    private boolean y;
    private View z;

    static {
        Covode.recordClassIndex(98554);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final m c() {
        return this.A;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int d() {
        return this.C;
    }

    public final void y() {
        t();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.a
    public final t<List<p<EffectCategoryResponse, List<Effect>>>> a() {
        t<List<p<EffectCategoryResponse, List<Effect>>>> c2 = this.x.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.a<RecyclerView.ViewHolder> w() {
        C4039a aVar = new C4039a(this, super.w());
        this.f149675c = aVar;
        return aVar;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b, com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void b() {
        LiveData<List<p<EffectCategoryResponse, List<Effect>>>> a2;
        super.b();
        com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar = this.B;
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            a2.removeObservers(this.A);
        }
        this.y = false;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.c
    public final void e() {
        if (this.E && !this.y) {
            this.y = true;
            a(this.A);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void t() {
        super.t();
        if (this.f149674b) {
            View findViewById = o().findViewById(R.id.azg);
            l.b(findViewById, "");
            View findViewById2 = findViewById.findViewById(R.id.eb2);
            l.b(findViewById2, "");
            this.v = new c(findViewById, (TextView) findViewById2);
            View findViewById3 = o().findViewById(R.id.azb);
            l.b(findViewById3, "");
            View findViewById4 = findViewById3.findViewById(R.id.eb2);
            l.b(findViewById4, "");
            this.w = new c(findViewById3, (TextView) findViewById4);
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149678a;

        static {
            Covode.recordClassIndex(98557);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f149678a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            int k2;
            View c2;
            l.d(recyclerView, "");
            if (!this.f149678a.f149673a.isEmpty()) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null && (c2 = linearLayoutManager.c((k2 = linearLayoutManager.k()))) != null) {
                    this.f149678a.a(k2, c2);
                }
            }
        }
    }

    static final class b<T> implements u<List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149677a;

        static {
            Covode.recordClassIndex(98556);
        }

        b(a aVar) {
            this.f149677a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.tools.infosticker.view.internal.main.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
            List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list2 = list;
            a aVar = this.f149677a;
            if (list2 == null) {
                list2 = z.INSTANCE;
            }
            aVar.b((List<? extends p<EffectCategoryResponse, ? extends List<? extends Effect>>>) list2);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int b(int i2) {
        int b2 = super.b(i2);
        com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> cVar = this.f149675c;
        if (cVar != null) {
            return cVar.b(b2);
        }
        return b2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int c(int i2) {
        com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> cVar = this.f149675c;
        if (cVar != null) {
            i2 = cVar.a(i2);
        }
        return super.c(i2);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final View a(ViewGroup viewGroup) {
        if (!this.f149674b) {
            return super.a(viewGroup);
        }
        View a2 = com.a.a(LayoutInflater.from(this.s), R.layout.b4h, viewGroup, this.D);
        l.b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.a$a  reason: collision with other inner class name */
    final class C4039a extends com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149676a;

        static {
            Covode.recordClassIndex(98555);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.c
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            a aVar = this.f149676a;
            l.d(viewGroup, "");
            if (aVar.f149674b) {
                View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4q, viewGroup, false);
                TextView textView = (TextView) a2.findViewById(R.id.eb2);
                l.b(a2, "");
                l.b(textView, "");
                return new c(a2, textView);
            }
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a92, viewGroup, false);
            l.b(a3, "");
            return new h(a3);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4039a(a aVar, RecyclerView.a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2);
            l.d(aVar2, "");
            this.f149676a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
        @Override // com.ss.android.ugc.tools.view.widget.a.c
        public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            l.d(viewHolder, "");
            l.d(effectCategoryResponse2, "");
            this.f149676a.a(viewHolder, effectCategoryResponse2);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView a(View view) {
        l.d(view, "");
        RecyclerView a2 = super.a(view);
        if (this.C >= 4) {
            Context context = view.getContext();
            l.b(context, "");
            a2.setFadingEdgeLength((int) r.a(context, 4.0f));
            a2.setVerticalFadingEdgeEnabled(true);
            Context context2 = view.getContext();
            l.b(context2, "");
            int a3 = (int) r.a(context2, 3.0f);
            a2.setPadding(a3, 0, a3, 0);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void a(m mVar) {
        LiveData<List<p<EffectCategoryResponse, List<Effect>>>> a2;
        l.d(mVar, "");
        super.a(mVar);
        com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar = this.B;
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            a2.observe(mVar, new b(this));
        }
        if (this.f149674b) {
            p().a(new c(this));
        }
    }

    public final void b(List<? extends p<EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
        View view;
        View view2;
        View view3;
        View view4;
        this.f149673a.clear();
        List<p<EffectCategoryResponse, List<Effect>>> list2 = this.f149673a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!((Collection) t.getSecond()).isEmpty()) {
                arrayList.add(t);
            }
        }
        list2.addAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (p<EffectCategoryResponse, List<Effect>> pVar : this.f149673a) {
            if (i2 != 0) {
                arrayList2.add(v.a(Integer.valueOf(i2 - 1), pVar.getFirst()));
            }
            i2 += pVar.getSecond().size();
        }
        com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> cVar = this.f149675c;
        if (cVar != null) {
            cVar.a(arrayList2);
        }
        if (this.f149674b) {
            if (this.f149673a.isEmpty()) {
                c cVar2 = this.v;
                if (!(cVar2 == null || (view4 = cVar2.itemView) == null)) {
                    view4.setVisibility(8);
                }
                c cVar3 = this.w;
                if (!(cVar3 == null || (view3 = cVar3.itemView) == null)) {
                    view3.setVisibility(8);
                }
            } else {
                c cVar4 = this.v;
                if (!(cVar4 == null || (view2 = cVar4.itemView) == null)) {
                    view2.setVisibility(0);
                }
                c cVar5 = this.v;
                if (cVar5 == null) {
                    l.b();
                }
                a(cVar5, (EffectCategoryResponse) ((p) n.g((List) this.f149673a)).getFirst());
                c cVar6 = this.w;
                if (!(cVar6 == null || (view = cVar6.itemView) == null)) {
                    view.setVisibility(4);
                }
            }
            this.x.onNext(this.f149673a);
            return;
        }
        this.x.onNext(z.INSTANCE);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, q<? super Effect, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, h.z> qVar) {
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2;
        l.d(viewGroup, "");
        l.d(qVar, "");
        if (this.C >= 4) {
            Context context = viewGroup.getContext();
            l.b(context, "");
            a2 = com.ss.android.ugc.tools.infosticker.view.internal.base.h.b(context);
        } else {
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            a2 = com.ss.android.ugc.tools.infosticker.view.internal.base.h.a(context2);
        }
        return new n(a2.component1(), a2.component2(), qVar);
    }

    public final void a(int i2, View view) {
        Object next;
        EffectCategoryResponse effectCategoryResponse;
        com.ss.android.ugc.tools.view.widget.a.c<EffectCategoryResponse> cVar = this.f149675c;
        if (cVar != null) {
            Map<Integer, DATA> map = cVar.f150341b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, DATA> entry : map.entrySet()) {
                if (entry.getKey().intValue() < i2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                    do {
                        Object next2 = it.next();
                        int intValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        if (intValue < intValue2) {
                            next = next2;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry entry2 = (Map.Entry) next;
            p pVar = entry2 != null ? new p(entry2.getKey(), entry2.getValue()) : null;
            c cVar2 = this.v;
            if (cVar2 == null) {
                l.b();
            }
            if (pVar == null || (effectCategoryResponse = (EffectCategoryResponse) pVar.getSecond()) == null) {
                effectCategoryResponse = (EffectCategoryResponse) ((p) n.g((List) this.f149673a)).getFirst();
            }
            a(cVar2, effectCategoryResponse);
            DATA data = cVar.f150341b.get(Integer.valueOf(i2));
            if (data != null) {
                int top = view.getTop();
                c cVar3 = this.w;
                if (cVar3 == null) {
                    l.b();
                }
                View view2 = cVar3.itemView;
                l.b(view2, "");
                if (top > (-view2.getMeasuredHeight())) {
                    c cVar4 = this.v;
                    if (cVar4 == null) {
                        l.b();
                    }
                    View view3 = cVar4.itemView;
                    l.b(view3, "");
                    view3.setTranslationY((float) view.getTop());
                    c cVar5 = this.w;
                    if (cVar5 == null) {
                        l.b();
                    }
                    View view4 = cVar5.itemView;
                    l.b(view4, "");
                    view4.setVisibility(0);
                    c cVar6 = this.w;
                    if (cVar6 == null) {
                        l.b();
                    }
                    View view5 = cVar6.itemView;
                    l.b(view5, "");
                    view5.setTranslationY((float) view.getTop());
                    c cVar7 = this.w;
                    if (cVar7 == null) {
                        l.b();
                    }
                    a((RecyclerView.ViewHolder) cVar7, (EffectCategoryResponse) data);
                    view.setVisibility(4);
                    this.z = view;
                    return;
                }
            }
            c cVar8 = this.v;
            if (cVar8 == null) {
                l.b();
            }
            View view6 = cVar8.itemView;
            l.b(view6, "");
            view6.setTranslationY(0.0f);
            c cVar9 = this.w;
            if (cVar9 == null) {
                l.b();
            }
            View view7 = cVar9.itemView;
            l.b(view7, "");
            view7.setVisibility(4);
            View view8 = this.z;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            this.z = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(RecyclerView.ViewHolder viewHolder, EffectCategoryResponse effectCategoryResponse) {
        TextView textView;
        l.d(viewHolder, "");
        l.d(effectCategoryResponse, "");
        if (this.f149674b) {
            if (!(viewHolder instanceof c)) {
                viewHolder = null;
            }
            c cVar = (c) viewHolder;
            if (cVar != null && (textView = cVar.f149682a) != null) {
                textView.setText(effectCategoryResponse.getName());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.tools.infosticker.view.a.a
    public final /* synthetic */ void a(Effect effect, int i2) {
        l.d(effect, "");
        int i3 = 0;
        for (p pVar : n.d((Iterable) this.f149673a, i2)) {
            i3 += ((List) pVar.component2()).size();
        }
        List a2 = r().a();
        int size = a2.size();
        while (i3 < size) {
            if (!l.a((Object) ((am) a2.get(i3)).f39387a, (Object) effect)) {
                i3++;
            } else if (i3 >= 0) {
                RecyclerView.i layoutManager = p().getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null) {
                    linearLayoutManager.a(b(i3), 0);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, int i2, Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        l.d(viewHolder, "");
        l.d(effect, "");
        l.d(cVar, "");
        if (!(viewHolder instanceof n)) {
            viewHolder = null;
        }
        f fVar = (f) viewHolder;
        if (fVar != null) {
            fVar.a(effect, i2, cVar, num);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, m mVar, com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar, k<Effect> kVar, ViewGroup viewGroup, int i2, boolean z2, boolean z3, h.f.a.b<? super b.c, h.z> bVar) {
        super(context, mVar, aVar, kVar, viewGroup, i2, true, false, true, bVar);
        l.d(context, "");
        l.d(mVar, "");
        this.A = mVar;
        this.B = aVar;
        this.C = i2;
        this.f149674b = z2;
        this.E = z3;
        this.f149673a = new ArrayList();
        f.a.l.b<List<p<EffectCategoryResponse, List<Effect>>>> bVar2 = new f.a.l.b<>();
        l.b(bVar2, "");
        this.x = bVar2;
    }
}
