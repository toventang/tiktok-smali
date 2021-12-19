package com.ss.android.ugc.aweme.sticker.view.internal.pager.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.panel.h;
import com.ss.android.ugc.aweme.utils.gg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class f<T> extends RecyclerView.a<a<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T, a<T>> f136366a;

    /* renamed from: h  reason: collision with root package name */
    public List<T> f136367h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public int f136368i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<T> f136369j;

    /* renamed from: k  reason: collision with root package name */
    public final h f136370k;

    static {
        Covode.recordClassIndex(89061);
    }

    public void a(a<T> aVar) {
        l.d(aVar, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f136367h.size() + 2;
    }

    public int a(T t) {
        return this.f136369j.b(t);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136373a = new b();

        static {
            Covode.recordClassIndex(89063);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z;
            if (num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public final void b(List<? extends T> list) {
        l.d(list, "");
        this.f136367h = n.g((Collection) list);
    }

    public static final class a extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f136371e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView.i f136372f;

        static {
            Covode.recordClassIndex(89062);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            f fVar = this.f136371e;
            if (i2 == 0 || i2 == fVar.getItemCount() - 1) {
                return ((GridLayoutManager) this.f136372f).f3760b;
            }
            return 1;
        }

        a(f fVar, RecyclerView.i iVar) {
            this.f136371e = fVar;
            this.f136372f = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z = true;
            if (num.intValue() != this.this$0.getItemCount() - 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public void a(h<T, a<T>> hVar) {
        l.d(hVar, "");
        l.d(hVar, "");
        hVar.a(b.f136373a, new c(this));
        hVar.a(new d(this), new e(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).a(new a(this, layoutManager));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<ViewGroup, a<T>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            h.f.a.b<? super ViewGroup, ? extends View> bVar;
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            f fVar = this.this$0;
            l.d(viewGroup2, "");
            h hVar = fVar.f136370k;
            if (hVar == null || (bVar = hVar.f135211k) == null) {
                return new e(viewGroup2, 5);
            }
            return new a((View) bVar.invoke(viewGroup2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<ViewGroup, a<T>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(ViewGroup viewGroup) {
            h.f.a.b<? super ViewGroup, ? extends View> bVar;
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            f fVar = this.this$0;
            l.d(viewGroup2, "");
            h hVar = fVar.f136370k;
            if (hVar == null || (bVar = hVar.f135212l) == null) {
                return new e(viewGroup2, 10);
            }
            return new a((View) bVar.invoke(viewGroup2));
        }
    }

    public final T a(int i2) {
        if (i2 >= getItemCount()) {
            return null;
        }
        List<T> list = this.f136367h;
        int i3 = 0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int min = Math.min(i2 - 1, this.f136367h.size() - 1);
        List<T> list2 = this.f136367h;
        if (min >= 0) {
            i3 = min;
        }
        return list2.get(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        T t;
        g<T, a<T>> gVar = this.f136366a;
        Iterator<T> it = gVar.f136375b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f136378b.invoke(Integer.valueOf(i2)).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            h.f.a.b<ViewGroup, VH> bVar = t2.f136377a;
            int i3 = t2.f136379c;
            if (gVar.f136374a.get(i3) == null) {
                gVar.f136374a.put(i3, bVar);
            }
            return i3;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    public void a(List<? extends T> list) {
        l.d(list, "");
        b(list);
        notifyDataSetChanged();
    }

    public f(com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<T> bVar, h hVar) {
        l.d(bVar, "");
        this.f136369j = bVar;
        this.f136370k = hVar;
        g<T, a<T>> gVar = new g<>();
        a((h) gVar);
        this.f136366a = gVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(a<T> aVar, int i2) {
        l.d(aVar, "");
        T a2 = a(i2);
        if (a2 != null) {
            p<com.ss.android.ugc.tools.h.a.c, Integer> a3 = this.f136369j.a(a2);
            aVar.a(a2, a3.component1(), a3.component2(), i2, this.f136368i);
        }
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        g<T, a<T>> gVar = fVar.f136366a;
        l.d(viewGroup, "");
        boolean z = true;
        if (gVar.f136374a.indexOfKey(i2) >= 0) {
            h.f.a.b<ViewGroup, VH> bVar = gVar.f136374a.get(i2);
            l.b(bVar, "");
            VH invoke = bVar.invoke(viewGroup);
            fVar.a((a) invoke);
            try {
                if (invoke.itemView.getParent() != null) {
                    try {
                        z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(invoke.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) invoke.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(invoke.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = invoke.getClass().getName();
            return invoke;
        }
        throw new IllegalArgumentException(("no factory for viewType " + i2 + " is registered").toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void onBindViewHolder(a<T> aVar, int i2, List<Object> list) {
        l.d(aVar, "");
        l.d(list, "");
        if (!list.isEmpty()) {
            Object h2 = n.h((List) list);
            p<com.ss.android.ugc.tools.h.a.c, Integer> a2 = this.f136369j.a((T) h2);
            aVar.b(h2, a2.component1(), a2.component2());
            return;
        }
        super.onBindViewHolder(aVar, i2, list);
    }
}
