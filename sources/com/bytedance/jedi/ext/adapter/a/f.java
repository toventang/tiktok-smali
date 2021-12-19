package com.bytedance.jedi.ext.adapter.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.ext.adapter.a.a.g;
import com.bytedance.jedi.ext.adapter.a.a.i;
import com.bytedance.jedi.ext.adapter.a.a.j;
import com.bytedance.jedi.ext.adapter.a.a.k;
import com.bytedance.jedi.ext.adapter.a.a.m;
import com.bytedance.jedi.ext.adapter.a.a.o;
import com.bytedance.jedi.ext.adapter.a.a.q;
import com.bytedance.jedi.ext.adapter.a.a.r;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;

public class f extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f39652a;

    /* renamed from: b  reason: collision with root package name */
    final k f39653b;

    /* renamed from: c  reason: collision with root package name */
    final i f39654c;

    /* renamed from: d  reason: collision with root package name */
    final o f39655d;

    /* renamed from: e  reason: collision with root package name */
    final g f39656e;

    /* renamed from: f  reason: collision with root package name */
    final r f39657f = new r((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.jedi.ext.adapter.a.a.f[] f39658g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39659h;

    /* renamed from: i  reason: collision with root package name */
    private final a f39660i;

    static {
        Covode.recordClassIndex(24409);
    }

    public static boolean a(int i2) {
        return 15990784 <= i2 && 16252928 >= i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.c(viewHolder, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a extends RecyclerView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f39661a;

        static {
            Covode.recordClassIndex(24410);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            this.f39661a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.f39661a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            a(i2, i3, (Object) null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            f fVar = this.f39661a;
            fVar.notifyItemRangeInserted(i2 + fVar.f39653b.c(), i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            f fVar = this.f39661a;
            fVar.notifyItemRangeRemoved(i2 + fVar.f39653b.c(), i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                f fVar = this.f39661a;
                fVar.notifyItemMoved(fVar.f39653b.c() + i2 + i5, this.f39661a.f39653b.c() + i3 + i5);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            f fVar = this.f39661a;
            fVar.notifyItemRangeChanged(i2 + fVar.f39653b.c(), i3, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f39657f.f39649a != null && this.f39656e.g()) {
            m.a.a(this.f39656e);
            notifyDataSetChanged();
        }
    }

    private final void b() {
        RecyclerView recyclerView;
        RecyclerView.i layoutManager;
        if (!this.f39659h && (recyclerView = this.f39657f.f39649a) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            l.a((Object) layoutManager, "");
            this.f39659h = true;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.a(new d(this, layoutManager, gridLayoutManager.f3765g));
            }
            this.f39655d.a(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.f39652a.getItemCount() == 0) {
            return this.f39656e.c();
        }
        return this.f39652a.getItemCount() + this.f39653b.c() + this.f39654c.c() + this.f39655d.c();
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, j> {
        final /* synthetic */ View $it;

        static {
            Covode.recordClassIndex(24411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.$it = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(ViewGroup viewGroup) {
            l.c(viewGroup, "");
            return new j(this.$it);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, com.bytedance.jedi.ext.adapter.a.a.l> {
        final /* synthetic */ View $it;

        static {
            Covode.recordClassIndex(24412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(1);
            this.$it = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.jedi.ext.adapter.a.a.l invoke(ViewGroup viewGroup) {
            l.c(viewGroup, "");
            return new com.bytedance.jedi.ext.adapter.a.a.l(this.$it);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (this.f39655d.g()) {
            this.f39655d.b(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void registerAdapterDataObserver(RecyclerView.c cVar) {
        l.c(cVar, "");
        super.registerAdapterDataObserver(cVar);
        this.f39652a.registerAdapterDataObserver(this.f39660i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        l.c(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f39652a.unregisterAdapterDataObserver(this.f39660i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        if (a(getItemViewType(i2))) {
            return super.getItemId(i2);
        }
        return this.f39652a.getItemId(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f39657f.a(recyclerView);
        b();
        this.f39652a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        l.c(viewHolder, "");
        if (a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f39652a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.c(viewHolder, "");
        if (a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f39652a.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.c(viewHolder, "");
        if (a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f39652a.onViewRecycled(viewHolder);
        }
    }

    public static final class d extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f39662e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView.i f39663f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.c f39664g;

        static {
            Covode.recordClassIndex(24413);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (f.a(this.f39662e.getItemViewType(i2))) {
                return ((GridLayoutManager) this.f39663f).f3760b;
            }
            GridLayoutManager.c cVar = this.f39664g;
            if (cVar != null) {
                return cVar.a(i2 - this.f39662e.f39653b.c());
            }
            return 1;
        }

        d(f fVar, RecyclerView.i iVar, GridLayoutManager.c cVar) {
            this.f39662e = fVar;
            this.f39663f = iVar;
            this.f39664g = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.c(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f39657f.b(recyclerView);
        if (this.f39659h) {
            o oVar = this.f39655d;
            l.c(recyclerView, "");
            q qVar = oVar.f39638j;
            l.c(recyclerView, "");
            qVar.f39641a.b(recyclerView);
            qVar.c(recyclerView);
        }
        this.f39659h = false;
        this.f39652a.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: androidx.recyclerview.widget.RecyclerView$a<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(RecyclerView.a<?> aVar) {
        l.c(aVar, "");
        this.f39652a = aVar;
        k kVar = new k();
        this.f39653b = kVar;
        i iVar = new i();
        this.f39654c = iVar;
        o oVar = new o();
        this.f39655d = oVar;
        g gVar = new g(kVar, iVar);
        this.f39656e = gVar;
        this.f39658g = new com.bytedance.jedi.ext.adapter.a.a.f[]{kVar, iVar, oVar, gVar};
        setHasStableIds(aVar.mHasStableIds);
        this.f39660i = new a(this);
    }

    public final void b(int i2) {
        if (this.f39655d.f39636h != i2) {
            boolean g2 = this.f39655d.g();
            o oVar = this.f39655d;
            oVar.f39636h = i2;
            q qVar = oVar.f39638j;
            if (i2 == 241 || i2 == 242) {
                RecyclerView recyclerView = qVar.f39641a.f39649a;
                if (recyclerView != null) {
                    qVar.c(recyclerView);
                }
            } else {
                RecyclerView recyclerView2 = qVar.f39641a.f39649a;
                if (recyclerView2 != null) {
                    qVar.b(recyclerView2);
                }
            }
            boolean g3 = this.f39655d.g();
            this.f39655d.b(241);
            if (this.f39657f.f39649a == null) {
                return;
            }
            if (g2) {
                if (!g3) {
                    notifyItemRemoved(this.f39652a.getItemCount() + this.f39653b.c() + this.f39654c.c());
                }
            } else if (g3 && !g2) {
                notifyItemInserted(this.f39652a.getItemCount() + this.f39653b.c() + this.f39654c.c());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder b2;
        View view;
        l.c(viewHolder, "");
        com.bytedance.jedi.ext.adapter.a.a.f[] fVarArr = this.f39658g;
        int length = fVarArr.length;
        int i2 = 0;
        while (true) {
            StaggeredGridLayoutManager.b bVar = null;
            if (i2 < length) {
                com.bytedance.jedi.ext.adapter.a.a.f fVar = fVarArr[i2];
                if (fVar.e() == viewHolder.getItemViewType()) {
                    super.onViewAttachedToWindow(viewHolder);
                    if (!fVar.a() && (b2 = fVar.b()) != null && (view = b2.itemView) != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                            bVar = layoutParams;
                        }
                        StaggeredGridLayoutManager.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.f3934b = true;
                            fVar.a(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i2++;
            } else {
                this.f39652a.onViewAttachedToWindow(viewHolder);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (this.f39652a.getItemCount() == 0 && this.f39656e.g()) {
            g gVar = this.f39656e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return gVar.f39625j.e();
                    }
                } else if ((gVar.f39623h == 241 || (gVar.f39622g & 1) != 1 || !gVar.f39624i.g() || (gVar.f39622g & 2) != 2) && gVar.f39623h != 241 && (gVar.f39622g & 1) == 1 && (!gVar.f39624i.g() || (gVar.f39622g & 2) != 2)) {
                    return gVar.f39625j.e();
                }
            } else if (gVar.f39624i.g() && (gVar.f39622g & 2) == 2) {
                return gVar.f39624i.e();
            } else {
                if ((gVar.f39623h == 241 || (gVar.f39622g & 1) != 1) && gVar.f39625j.g() && (gVar.f39622g & 4) == 4) {
                    return gVar.f39625j.e();
                }
            }
            return gVar.f39619d;
        } else if (i2 == 0 && this.f39653b.g()) {
            return this.f39653b.f39630c;
        } else {
            int itemCount = this.f39652a.getItemCount() + this.f39653b.c();
            if (i2 == itemCount && this.f39654c.g()) {
                return this.f39654c.f39629c;
            }
            if (i2 != itemCount + this.f39654c.c() || !this.f39655d.g()) {
                return this.f39652a.getItemViewType(i2 - this.f39653b.c());
            }
            return this.f39655d.f39632d;
        }
    }

    public final void a(int... iArr) {
        l.c(iArr, "");
        int i2 = this.f39656e.f39622g;
        int i3 = 1;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i4 = iArr[0];
        int b2 = h.a.i.b(iArr);
        if (b2 > 0) {
            while (true) {
                i4 |= iArr[i3];
                if (i3 == b2) {
                    break;
                }
                i3++;
            }
        }
        if (i2 != i4) {
            this.f39656e.f39622g = i4;
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.c(viewHolder, "");
        l.c(list, "");
        if (!(this.f39652a.getItemCount() == 0 || this.f39655d.c() == 0 || i2 != getItemCount() - 2)) {
            o oVar = this.f39655d;
            if (oVar.f39636h == 242 || oVar.f39636h == 244) {
                oVar.c(241);
            } else if (oVar.f39636h == 243) {
                oVar.f39638j.f39642b = true;
            }
        }
        if (!a(viewHolder.getItemViewType())) {
            this.f39652a.onBindViewHolder(viewHolder, i2 - this.f39653b.c(), list);
        }
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        boolean z;
        com.bytedance.jedi.ext.adapter.a.a.f fVar2;
        RecyclerView.ViewHolder viewHolder;
        boolean z2;
        MethodCollector.i(5888);
        l.c(viewGroup, "");
        fVar.b();
        com.bytedance.jedi.ext.adapter.a.a.f[] fVarArr = fVar.f39658g;
        int length = fVarArr.length;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= length) {
                fVar2 = null;
                break;
            }
            fVar2 = fVarArr[i3];
            if (fVar2.e() == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i3++;
        }
        if (fVar2 == null || (viewHolder = fVar2.a(viewGroup)) == null) {
            viewHolder = fVar.f39652a.onCreateViewHolder(viewGroup, i2);
            l.a((Object) viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(5888);
        return viewHolder;
    }

    /* access modifiers changed from: package-private */
    public final void a(m mVar, View view, View view2, int i2) {
        if (view != null) {
            mVar.d();
            notifyItemRemoved(i2);
        }
        if (view2 != null) {
            notifyItemInserted(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(m mVar, h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar, h.f.a.b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar2, int i2) {
        if (bVar != null) {
            mVar.d();
            notifyItemRemoved(i2);
        }
        if (bVar2 != null) {
            notifyItemInserted(i2);
        }
    }
}
