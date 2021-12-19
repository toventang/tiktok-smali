package com.ss.android.ugc.tools.infosticker.view.internal.provider;

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
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.h;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.a.f;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.p;
import h.z;

public class a extends com.ss.android.ugc.tools.infosticker.view.internal.base.b<ProviderEffect> implements com.ss.android.ugc.tools.infosticker.view.a.c<ProviderEffect> {
    private final boolean A;
    private final boolean B;

    /* renamed from: a  reason: collision with root package name */
    private String f149906a;

    /* renamed from: b  reason: collision with root package name */
    private C4043a f149907b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.tools.infosticker.view.internal.main.c f149908c;
    public int v;
    private final m w;
    private final h<ProviderEffect> x;
    private final int y;
    private final boolean z;

    static {
        Covode.recordClassIndex(98690);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.c
    public final String a() {
        return this.f149906a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final m c() {
        return this.w;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int d() {
        return this.y;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.a<RecyclerView.ViewHolder> w() {
        RecyclerView.a<RecyclerView.ViewHolder> w2 = super.w();
        if (!this.A || this.B) {
            return w2;
        }
        C4043a aVar = new C4043a(this, w2);
        this.f149907b = aVar;
        return aVar;
    }

    public final void y() {
        com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar;
        if (!this.A) {
            return;
        }
        if (!this.B) {
            C4043a aVar = this.f149907b;
            if (aVar != null) {
                aVar.notifyItemChanged(0);
            }
        } else if (this.B && (cVar = this.f149908c) != null) {
            a(cVar);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void t() {
        super.t();
        if (this.A && this.B) {
            View findViewById = o().findViewById(R.id.azg);
            l.b(findViewById, "");
            View findViewById2 = findViewById.findViewById(R.id.eb2);
            l.b(findViewById2, "");
            com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar = new com.ss.android.ugc.tools.infosticker.view.internal.main.c(findViewById, (TextView) findViewById2);
            View view = cVar.itemView;
            l.b(view, "");
            view.setVisibility(0);
            a(cVar);
            this.f149908c = cVar;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b, com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void b() {
        LiveData<String> a2;
        super.b();
        h<ProviderEffect> hVar = this.x;
        if (hVar != null && (a2 = hVar.a()) != null) {
            a2.removeObservers(this.w);
        }
    }

    static final class b<T> implements u<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149911b;

        static {
            Covode.recordClassIndex(98692);
        }

        b(a aVar, m mVar) {
            this.f149910a = aVar;
            this.f149911b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            this.f149910a.b(str);
        }
    }

    static final class c<T> implements u<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149913b;

        static {
            Covode.recordClassIndex(98693);
        }

        c(a aVar, m mVar) {
            this.f149912a = aVar;
            this.f149913b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            this.f149912a.y();
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149914a;

        static {
            Covode.recordClassIndex(98694);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f149914a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (this.f149914a.v != i2) {
                this.f149914a.v = i2;
                a aVar = this.f149914a;
                aVar.a(aVar.v);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            a aVar = this.f149914a;
            aVar.a(aVar.v);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.c
    public final void a(String str) {
        h<ProviderEffect> hVar = this.x;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.a$a  reason: collision with other inner class name */
    public final class C4043a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149909a;

        static {
            Covode.recordClassIndex(98691);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.f
        public final void a(RecyclerView.ViewHolder viewHolder) {
            l.d(viewHolder, "");
            this.f149909a.a(viewHolder);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.f
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4s, viewGroup, false);
            TextView textView = (TextView) a2.findViewById(R.id.eb2);
            l.b(a2, "");
            l.b(textView, "");
            return new com.ss.android.ugc.tools.infosticker.view.internal.main.c(a2, textView);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4043a(a aVar, RecyclerView.a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2, (byte) 0);
            l.d(aVar2, "");
            this.f149909a = aVar;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f149915a = new e();

        static {
            Covode.recordClassIndex(98695);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, AnonymousClass1.f149916a);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int b(int i2) {
        C4043a aVar;
        int b2 = super.b(i2);
        if (!this.A || this.B || (aVar = this.f149907b) == null) {
            return b2;
        }
        return b2 + aVar.a();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int c(int i2) {
        C4043a aVar;
        if (this.A && !this.B && (aVar = this.f149907b) != null) {
            i2 -= aVar.a();
        }
        return super.c(i2);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final View a(ViewGroup viewGroup) {
        if (!this.A || !this.B) {
            return super.a(viewGroup);
        }
        View a2 = com.a.a(LayoutInflater.from(this.s), R.layout.b4h, viewGroup, this.z);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        l.d(view, "");
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b2 = super.b(view);
        if (b2 instanceof com.ss.android.ugc.tools.view.widget.b.d) {
            ((com.ss.android.ugc.tools.view.widget.b.d) b2).a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, e.f149915a);
        }
        return b2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView a(View view) {
        l.d(view, "");
        RecyclerView a2 = super.a(view);
        if (this.y >= 4) {
            Context context = view.getContext();
            l.b(context, "");
            a2.setFadingEdgeLength((int) r.a(context, 8.0f));
            a2.setVerticalFadingEdgeEnabled(true);
            Context context2 = view.getContext();
            l.b(context2, "");
            int a3 = (int) r.a(context2, 3.0f);
            a2.setPadding(a3, 0, a3, 0);
        }
        return a2;
    }

    public final void b(String str) {
        com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar;
        this.f149906a = str;
        if (!this.A) {
            return;
        }
        if (!this.B) {
            C4043a aVar = this.f149907b;
            if (aVar != null) {
                aVar.notifyItemChanged(0);
            }
        } else if (this.B && (cVar = this.f149908c) != null) {
            a(cVar);
        }
    }

    public final void a(int i2) {
        int k2;
        int m2;
        boolean z2;
        RecyclerView.i layoutManager = p().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null && (k2 = linearLayoutManager.k()) <= (m2 = linearLayoutManager.m())) {
            while (true) {
                RecyclerView.ViewHolder f2 = p().f(k2);
                if (!(f2 instanceof d)) {
                    f2 = null;
                }
                com.ss.android.ugc.tools.infosticker.view.internal.base.f fVar = (com.ss.android.ugc.tools.infosticker.view.internal.base.f) f2;
                if (fVar != null) {
                    CircleDraweeView imageView = fVar.f149601g.getImageView();
                    if ((imageView instanceof com.ss.android.ugc.aweme.views.a) && imageView != null) {
                        if (i2 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        imageView.a(z2);
                    }
                }
                if (k2 != m2) {
                    k2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void a(m mVar) {
        l.d(mVar, "");
        super.a(mVar);
        h<ProviderEffect> hVar = this.x;
        if (hVar != null) {
            hVar.a().observe(mVar, new b(this, mVar));
            com.bytedance.k.a.a(hVar.h()).observe(mVar, new c(this, mVar));
        }
        p().a(new d(this));
    }

    /* access modifiers changed from: protected */
    public final void a(RecyclerView.ViewHolder viewHolder) {
        TextView textView;
        LiveData<String> h2;
        l.d(viewHolder, "");
        String str = null;
        if (!(viewHolder instanceof com.ss.android.ugc.tools.infosticker.view.internal.main.c)) {
            viewHolder = null;
        }
        com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar = (com.ss.android.ugc.tools.infosticker.view.internal.main.c) viewHolder;
        if (cVar != null && (textView = cVar.f149682a) != null) {
            h<ProviderEffect> hVar = this.x;
            if (!(hVar == null || (h2 = hVar.h()) == null)) {
                str = h2.getValue();
            }
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, q<? super ProviderEffect, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, z> qVar) {
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2;
        l.d(viewGroup, "");
        l.d(qVar, "");
        if (this.y >= 4) {
            Context context = viewGroup.getContext();
            l.b(context, "");
            a2 = com.ss.android.ugc.tools.infosticker.view.internal.base.h.b(context);
        } else {
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            a2 = com.ss.android.ugc.tools.infosticker.view.internal.base.h.a(context2);
        }
        return new d(a2.component1(), a2.component2(), qVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, int i2, ProviderEffect providerEffect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        boolean z2;
        l.d(viewHolder, "");
        l.d(providerEffect, "");
        l.d(cVar, "");
        if (!(viewHolder instanceof d)) {
            viewHolder = null;
        }
        com.ss.android.ugc.tools.infosticker.view.internal.base.f fVar = (com.ss.android.ugc.tools.infosticker.view.internal.base.f) viewHolder;
        if (fVar != null) {
            int i3 = this.v;
            l.d(providerEffect, "");
            l.d(cVar, "");
            fVar.a(providerEffect, i2, cVar, num);
            CircleDraweeView imageView = fVar.f149601g.getImageView();
            if ((imageView instanceof com.ss.android.ugc.aweme.views.a) && imageView != null) {
                if (i3 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                imageView.a(z2);
            }
        }
    }

    public /* synthetic */ a(Context context, m mVar, h hVar, k kVar, ViewGroup viewGroup, int i2, boolean z2, h.f.a.b bVar) {
        this(context, mVar, hVar, kVar, viewGroup, i2, true, z2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, m mVar, h<ProviderEffect> hVar, k<ProviderEffect> kVar, ViewGroup viewGroup, int i2, boolean z2, boolean z3, h.f.a.b<? super b.c, z> bVar) {
        super(context, mVar, hVar, kVar, viewGroup, i2, true, true, true, bVar);
        l.d(context, "");
        l.d(mVar, "");
        this.w = mVar;
        this.x = hVar;
        this.y = i2;
        this.z = true;
        this.A = true;
        this.B = z3;
    }
}
