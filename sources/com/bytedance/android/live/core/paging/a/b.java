package com.bytedance.android.live.core.paging.a;

import android.database.Observable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.h.i;
import androidx.h.j;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.core.e.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;

public abstract class b<T> extends j<T, RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public PagingViewModel<T> f9133a;

    /* renamed from: b  reason: collision with root package name */
    public b.a f9134b = null;

    /* renamed from: c  reason: collision with root package name */
    public b.a f9135c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9136d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9137e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9138f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9139g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9140h = true;

    /* renamed from: i  reason: collision with root package name */
    public final b<T>.C0136b f9141i;

    /* renamed from: j  reason: collision with root package name */
    private final u<i<T>> f9142j = new c(this);

    /* renamed from: k  reason: collision with root package name */
    private final u<com.bytedance.android.live.core.e.b> f9143k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    private final u<com.bytedance.android.live.core.e.b> f9144l = new u<com.bytedance.android.live.core.e.b>() {
        /* class com.bytedance.android.live.core.paging.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(4680);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.bytedance.android.live.core.e.b bVar) {
            com.bytedance.android.live.core.e.b bVar2 = bVar;
            if (bVar2 != null) {
                b.this.f9135c = bVar2.f9012a;
                b bVar3 = b.this;
                bVar3.a(bVar3.f9134b);
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private final u<Boolean> f9145m = new e(this);
    private final u<Boolean> n = new f(this);
    private final u<Integer> o = new g(this);
    private boolean p = false;
    private boolean q;
    private final b<T>.c r;

    static {
        Covode.recordClassIndex(4679);
    }

    /* access modifiers changed from: protected */
    public abstract int a(T t);

    /* access modifiers changed from: protected */
    public abstract RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a(boolean z) {
        if (this.q == z || this.f9137e) {
            this.q = z;
            return;
        }
        this.q = z;
        notifyDataSetChanged();
    }

    class c extends RecyclerView.c {
        static {
            Covode.recordClassIndex(4683);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            b.this.f9141i.a();
        }

        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            b.this.f9141i.b(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            b.this.f9141i.c(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            b.this.f9141i.a(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            b.this.f9141i.d(i2, i3);
        }
    }

    private boolean b() {
        if (!this.f9137e || !this.f9138f || this.f9136d) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.f9134b == b.a.RUNNING) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.f9134b == b.a.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$b  reason: collision with other inner class name */
    class C0136b extends Observable<RecyclerView.c> {
        static {
            Covode.recordClassIndex(4682);
        }

        public final void a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.c) this.mObservers.get(size)).a();
            }
        }

        C0136b() {
        }

        private int a(int i2) {
            if (b.this.f9136d) {
                return i2 + 1;
            }
            return i2;
        }

        public final void b(int i2, int i3) {
            int a2 = a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.c) this.mObservers.get(size)).b(a2, i3);
            }
        }

        public final void c(int i2, int i3) {
            int a2 = a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.c) this.mObservers.get(size)).c(a2, i3);
            }
        }

        public final void a(int i2, int i3) {
            int a2 = a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.c) this.mObservers.get(size)).a(a2, i3, (Object) null);
            }
        }

        public final void d(int i2, int i3) {
            int a2 = a(i2);
            int a3 = a(i3);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.c) this.mObservers.get(size)).a(a2, a3, 1);
            }
        }
    }

    private boolean c() {
        if (this.f9137e || !this.q || !this.f9140h) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, androidx.h.j
    public final int getItemCount() {
        boolean z = this.f9136d;
        boolean c2 = c();
        boolean b2 = b();
        boolean f2 = f();
        return (z ? 1 : 0) + super.getItemCount() + (c2 ? 1 : 0) + (f2 ? 1 : 0) + (b2 ? 1 : 0);
    }

    private boolean f() {
        b.a aVar;
        if (c() || !this.f9139g || (aVar = this.f9135c) == null) {
            return false;
        }
        if (aVar != b.a.SUCCESS) {
            if (this.f9135c == b.a.FAILED) {
                return e();
            }
            return false;
        } else if (d() || e()) {
            return true;
        } else {
            return false;
        }
    }

    public static abstract class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4681);
        }

        public void a() {
        }

        public void a(boolean z) {
        }

        public a(View view) {
            super(view);
        }
    }

    public static class d extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4684);
        }

        public d(View view) {
            super(view);
        }
    }

    public static class f extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4686);
        }

        public void a() {
        }

        public f(View view) {
            super(view);
        }
    }

    public final int b(int i2) {
        return i2 - (this.f9136d ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    public RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        throw new RuntimeException("create your header view holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void registerAdapterDataObserver(RecyclerView.c cVar) {
        this.f9141i.registerObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        this.f9141i.unregisterObserver(cVar);
    }

    private T c(int i2) {
        if (i2 < 0 || i2 >= super.getItemCount()) {
            return null;
        }
        return (T) super.a(i2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.live.core.e.b bVar) {
        if (bVar != null) {
            a(bVar.f9012a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof com.bytedance.android.livesdk.ui.b) {
            ((com.bytedance.android.livesdk.ui.b) viewHolder).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof com.bytedance.android.livesdk.ui.b) {
            ((com.bytedance.android.livesdk.ui.b) viewHolder).b();
        }
    }

    private static void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.j jVar = (RecyclerView.j) viewHolder.itemView.getLayoutParams();
        if (jVar instanceof StaggeredGridLayoutManager.b) {
            ((StaggeredGridLayoutManager.b) jVar).f3934b = true;
        }
    }

    /* access modifiers changed from: protected */
    public RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        return new d(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5t, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof com.bytedance.android.livesdk.ui.b) {
            ((com.bytedance.android.livesdk.ui.b) viewHolder).e();
        } else if (!(viewHolder instanceof f) && (viewHolder instanceof a)) {
            ((a) viewHolder).a();
        }
    }

    /* access modifiers changed from: protected */
    public RecyclerView.ViewHolder c(ViewGroup viewGroup) {
        return new d(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5s, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        PagingViewModel f9149a;

        /* renamed from: b  reason: collision with root package name */
        private View f9150b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f9151c;

        static {
            Covode.recordClassIndex(4685);
        }

        @Override // com.bytedance.android.live.core.paging.a.b.a
        public final void a() {
        }

        @Override // com.bytedance.android.live.core.paging.a.b.a
        public final void a(boolean z) {
            com.bytedance.android.live.core.e.b value = this.f9149a.f9212c.getValue();
            View findViewById = this.itemView.findViewById(R.id.e_i);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (value == null || !value.b() || !z) {
                layoutParams.height = -2;
                this.f9150b.setVisibility(8);
                TextView textView = this.f9151c;
                textView.setTextColor(textView.getResources().getColor(R.color.wx));
                this.f9151c.setText(R.string.gm2);
            } else {
                layoutParams.height = -1;
                this.f9150b.setVisibility(0);
                TextView textView2 = this.f9151c;
                textView2.setTextColor(textView2.getResources().getColor(R.color.wy));
                this.f9151c.setText(R.string.gm4);
            }
            findViewById.setLayoutParams(layoutParams);
            this.itemView.setOnClickListener(new h(this));
        }

        e(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f9149a = pagingViewModel;
            this.f9150b = view.findViewById(R.id.axn);
            this.f9151c = (TextView) view.findViewById(R.id.axt);
        }
    }

    public b(j.e<T> eVar) {
        super(eVar);
        b<T>.c cVar = new c();
        this.r = cVar;
        this.f9141i = new C0136b();
        super.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.h.j
    public final T a(int i2) {
        int itemCount = super.getItemCount();
        boolean z = this.f9136d;
        int i3 = itemCount + (z ? 1 : 0);
        if (z && i2 == 0) {
            return null;
        }
        if (f() && i2 == i3) {
            return null;
        }
        if (c() && i2 == i3) {
            return null;
        }
        if (!b() || i2 != i3) {
            return c(b(i2));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        int itemCount = getItemCount() - 1;
        if (b() && i2 == 0) {
            return -1091641683;
        }
        if (this.f9136d && i2 == 0) {
            return -559038738;
        }
        if (!f() || i2 != itemCount) {
            if (c() && i2 == itemCount) {
                return -559038737;
            }
            int b2 = b(i2);
            if (b2 >= super.getItemCount()) {
                return -8888;
            }
            return a((Object) c(b2));
        } else if (e()) {
            return -1091576149;
        } else {
            return -1091576148;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(b.a aVar) {
        boolean z = this.p;
        this.f9134b = aVar;
        boolean f2 = f();
        int itemCount = super.getItemCount();
        if (!z) {
            if (f2) {
                notifyItemInserted(itemCount);
            }
        } else if (!f2) {
            notifyItemRemoved(getItemCount());
        } else {
            notifyItemRemoved(itemCount);
            notifyItemInserted(itemCount);
        }
        this.p = f2;
    }

    public final void a(PagingViewModel<T> pagingViewModel) {
        PagingViewModel<T> pagingViewModel2 = this.f9133a;
        if (pagingViewModel2 != null) {
            pagingViewModel2.f9216g.removeObserver(this.f9142j);
            this.f9133a.f9211b.removeObserver(this.f9143k);
            this.f9133a.f9212c.removeObserver(this.f9144l);
            this.f9133a.f9214e.removeObserver(this.f9145m);
            this.f9133a.f9213d.removeObserver(this.n);
            this.f9133a.f9215f.removeObserver(this.o);
        }
        this.f9133a = pagingViewModel;
        if (pagingViewModel != null) {
            pagingViewModel.f9216g.observeForever(this.f9142j);
            pagingViewModel.f9211b.observeForever(this.f9143k);
            pagingViewModel.f9212c.observeForever(this.f9144l);
            pagingViewModel.f9214e.observeForever(this.f9145m);
            pagingViewModel.f9213d.observeForever(this.n);
            pagingViewModel.f9215f.observeForever(this.o);
        }
    }

    public void c(RecyclerView.ViewHolder viewHolder, int i2) {
        a(viewHolder);
    }

    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 == -1091576148) {
            return new f(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5v, viewGroup, false));
        }
        if (i2 == -1091576149) {
            return new e(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5u, viewGroup, false), this.f9133a);
        }
        throw new RuntimeException("unknown footer type");
    }

    public void b(RecyclerView.ViewHolder viewHolder, int i2) {
        a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == -559038738) {
            a(viewHolder);
        } else if (itemViewType == -559038737) {
            c(viewHolder, i2);
        } else if (itemViewType == -1091576148 || itemViewType == -1091576149) {
            a(viewHolder);
            if (viewHolder instanceof f) {
                ((f) viewHolder).a();
            } else if (viewHolder instanceof a) {
                a aVar = (a) viewHolder;
                if (this.f9137e || super.getItemCount() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.a(z);
            }
        } else if (itemViewType == -1091641683) {
            b(viewHolder, i2);
        } else {
            a(viewHolder, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof com.bytedance.android.livesdk.ui.b) {
            T a2 = a(i2);
            if (a2 instanceof com.bytedance.android.live.base.model.c) {
                a2 = (T) a2.f7377a;
            }
            com.bytedance.android.livesdk.ui.b bVar = (com.bytedance.android.livesdk.ui.b) viewHolder;
            bVar.a(a2, i2);
            if (bVar.c()) {
                a(viewHolder);
            }
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        if (i2 == -559038738) {
            viewHolder = bVar.a(viewGroup);
        } else if (i2 == -559038737) {
            viewHolder = bVar.b(viewGroup);
        } else if (i2 == -1091576148 || i2 == -1091576149) {
            viewHolder = bVar.a(viewGroup, i2);
        } else if (i2 == -1091641683) {
            viewHolder = bVar.c(viewGroup);
        } else {
            viewHolder = bVar.b(viewGroup, i2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        return viewHolder;
    }
}
