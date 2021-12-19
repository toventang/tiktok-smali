package com.ss.android.ugc.tools.infosticker.view.internal.search;

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
import com.ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.base.h;
import com.ss.android.ugc.tools.infosticker.view.internal.i;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.a.f;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.p;
import h.z;

public class a extends com.ss.android.ugc.tools.infosticker.view.internal.base.b<InfoStickerEffect> implements com.ss.android.ugc.tools.infosticker.view.a.d<InfoStickerEffect> {
    final boolean A;
    final boolean B;
    final String C;
    private final int D;
    private final boolean E;

    /* renamed from: a  reason: collision with root package name */
    private C4044a f149955a;

    /* renamed from: b  reason: collision with root package name */
    private final m f149956b;

    /* renamed from: c  reason: collision with root package name */
    private final i<InfoStickerEffect> f149957c;
    String v;
    public int w;
    com.ss.android.ugc.tools.infosticker.view.internal.main.c x;
    RecyclerView.ViewHolder y;
    TextView z;

    static {
        Covode.recordClassIndex(98713);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.d
    public final String a() {
        return this.v;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final m c() {
        return this.f149956b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int d() {
        return this.D;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void a(com.ss.android.ugc.tools.view.widget.b.a aVar) {
        l.d(aVar, "");
        int i2 = b.f149966a[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                super.a(aVar);
                return;
            }
            y();
            z();
        } else if (NetworkUtils.isNetworkAvailable(this.s)) {
            y();
            z();
        } else {
            super.a(aVar);
        }
    }

    private void y() {
        i<InfoStickerEffect> iVar = this.f149957c;
        if (iVar != null) {
            iVar.i();
        }
    }

    private void z() {
        TextView textView = this.z;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) r.a(this.s, 64.0f)));
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.a<RecyclerView.ViewHolder> w() {
        RecyclerView.a<RecyclerView.ViewHolder> w2 = super.w();
        if (!this.A || this.B) {
            return w2;
        }
        C4044a aVar = new C4044a(this, w2);
        this.f149955a = aVar;
        return aVar;
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
            this.x = cVar;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.a.b, com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final void b() {
        LiveData<String> a2;
        super.b();
        i<InfoStickerEffect> iVar = this.f149957c;
        if (iVar != null && (a2 = iVar.a()) != null) {
            a2.removeObservers(this.f149956b);
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149963a;

        static {
            Covode.recordClassIndex(98717);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f149963a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (this.f149963a.w != i2) {
                this.f149963a.w = i2;
                a aVar = this.f149963a;
                aVar.a(aVar.w);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            a aVar = this.f149963a;
            aVar.a(aVar.w);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f149964a = new e();

        static {
            Covode.recordClassIndex(98718);
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
            return com.ss.android.ugc.tools.view.widget.b.e.a(viewGroup2, AnonymousClass1.f149965a);
        }
    }

    static final class b<T> implements u<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149960b;

        static {
            Covode.recordClassIndex(98715);
        }

        b(a aVar, m mVar) {
            this.f149959a = aVar;
            this.f149960b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar;
            a aVar = this.f149959a;
            aVar.v = str;
            if ((!aVar.A || aVar.B) && aVar.A && aVar.B && (cVar = aVar.x) != null) {
                aVar.a(cVar);
            }
        }
    }

    static final class c<T> implements u<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f149962b;

        static {
            Covode.recordClassIndex(98716);
        }

        c(a aVar, m mVar) {
            this.f149961a = aVar;
            this.f149962b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(String str) {
            com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar;
            a aVar = this.f149961a;
            if ((!aVar.A || aVar.B) && (cVar = aVar.x) != null) {
                aVar.a(cVar);
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int b(int i2) {
        C4044a aVar;
        int b2 = super.b(i2);
        if (!this.A || this.B || (aVar = this.f149955a) == null) {
            return b2;
        }
        return b2 + aVar.a();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final int c(int i2) {
        C4044a aVar;
        if (this.A && !this.B && (aVar = this.f149955a) != null) {
            i2 -= aVar.a();
        }
        return super.c(i2);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.a$a  reason: collision with other inner class name */
    final class C4044a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149958a;

        static {
            Covode.recordClassIndex(98714);
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.f
        public final void a(RecyclerView.ViewHolder viewHolder) {
            l.d(viewHolder, "");
        }

        @Override // com.ss.android.ugc.tools.view.widget.a.f
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            a aVar = this.f149958a;
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4t, viewGroup, false);
            aVar.z = (TextView) a2.findViewById(R.id.cw0);
            TextView textView = aVar.z;
            if (textView != null) {
                textView.setText(aVar.C);
            }
            l.b(a2, "");
            aVar.y = new e(a2);
            RecyclerView.ViewHolder viewHolder = aVar.y;
            if (viewHolder == null) {
                l.b();
            }
            return viewHolder;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4044a(a aVar, RecyclerView.a<RecyclerView.ViewHolder> aVar2) {
            super(aVar2, (byte) 0);
            l.d(aVar2, "");
            this.f149958a = aVar;
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final View a(ViewGroup viewGroup) {
        if (!this.A || !this.B) {
            return super.a(viewGroup);
        }
        View a2 = com.a.a(LayoutInflater.from(this.s), R.layout.b4h, viewGroup, this.E);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b(View view) {
        l.d(view, "");
        com.ss.android.ugc.tools.view.widget.b.b<com.ss.android.ugc.tools.view.widget.b.a> b2 = super.b(view);
        if (b2 instanceof com.ss.android.ugc.tools.view.widget.b.d) {
            ((com.ss.android.ugc.tools.view.widget.b.d) b2).a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, e.f149964a);
        }
        return b2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView a(View view) {
        l.d(view, "");
        RecyclerView a2 = super.a(view);
        if (this.D >= 4) {
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
        i<InfoStickerEffect> iVar = this.f149957c;
        if (iVar != null) {
            iVar.a().observe(mVar, new b(this, mVar));
            iVar.h().observe(mVar, new c(this, mVar));
        }
        p().a(new d(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.ViewHolder viewHolder) {
        TextView textView;
        LiveData<String> h2;
        String str = null;
        if (!(viewHolder instanceof com.ss.android.ugc.tools.infosticker.view.internal.main.c)) {
            viewHolder = null;
        }
        com.ss.android.ugc.tools.infosticker.view.internal.main.c cVar = (com.ss.android.ugc.tools.infosticker.view.internal.main.c) viewHolder;
        if (cVar != null && (textView = cVar.f149682a) != null) {
            i<InfoStickerEffect> iVar = this.f149957c;
            if (!(iVar == null || (h2 = iVar.h()) == null)) {
                str = h2.getValue();
            }
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, q<? super InfoStickerEffect, ? super Integer, ? super com.ss.android.ugc.tools.h.a.c, z> qVar) {
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2;
        l.d(viewGroup, "");
        l.d(qVar, "");
        if (this.D >= 4) {
            Context context = viewGroup.getContext();
            l.b(context, "");
            a2 = h.b(context);
        } else {
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            a2 = h.a(context2);
        }
        return new d(a2.component1(), a2.component2(), qVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.b
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, int i2, InfoStickerEffect infoStickerEffect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        boolean z2;
        l.d(viewHolder, "");
        l.d(infoStickerEffect, "");
        l.d(cVar, "");
        if (!(viewHolder instanceof d)) {
            viewHolder = null;
        }
        com.ss.android.ugc.tools.infosticker.view.internal.base.f fVar = (com.ss.android.ugc.tools.infosticker.view.internal.base.f) viewHolder;
        if (fVar != null) {
            int i3 = this.w;
            l.d(infoStickerEffect, "");
            l.d(cVar, "");
            fVar.a(infoStickerEffect, i2, cVar, num);
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

    public /* synthetic */ a(Context context, m mVar, i iVar, k kVar, ViewGroup viewGroup, int i2, String str, h.f.a.b bVar) {
        this(context, mVar, iVar, kVar, viewGroup, i2, true, false, str, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, m mVar, i<InfoStickerEffect> iVar, k<InfoStickerEffect> kVar, ViewGroup viewGroup, int i2, boolean z2, boolean z3, String str, h.f.a.b<? super b.c, z> bVar) {
        super(context, mVar, iVar, kVar, viewGroup, i2, true, true, true, bVar);
        l.d(context, "");
        l.d(mVar, "");
        l.d(str, "");
        this.f149956b = mVar;
        this.f149957c = iVar;
        this.D = i2;
        this.E = true;
        this.A = true;
        this.B = false;
        this.C = str;
    }
}
