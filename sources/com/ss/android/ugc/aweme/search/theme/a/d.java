package com.ss.android.ugc.aweme.search.theme.a;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.theme.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Objects;

public final class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    GradientDrawable f121674a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f121675b;

    /* renamed from: c  reason: collision with root package name */
    public int f121676c;

    /* renamed from: d  reason: collision with root package name */
    public int f121677d;

    /* renamed from: e  reason: collision with root package name */
    int f121678e = -1;

    /* renamed from: f  reason: collision with root package name */
    int f121679f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f121680g = b();

    /* renamed from: h  reason: collision with root package name */
    public int f121681h = b();

    /* renamed from: i  reason: collision with root package name */
    public int f121682i;

    /* renamed from: j  reason: collision with root package name */
    public int f121683j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.fragment.app.e f121684k;

    /* renamed from: l  reason: collision with root package name */
    private final h f121685l = i.a((h.f.a.a) a.f121687a);

    /* renamed from: m  reason: collision with root package name */
    private final h f121686m = i.a((h.f.a.a) new f(this));
    private final h n = i.a((h.f.a.a) C3148d.f121689a);
    private final h o = i.a((h.f.a.a) e.f121690a);
    private final h p = i.a((h.f.a.a) new b(this));
    private final h q = i.a((h.f.a.a) new g(this));
    private Drawable r;
    private final c s = new c(this);
    private final RecyclerView t;

    static {
        Covode.recordClassIndex(79257);
    }

    private final int f() {
        return ((Number) this.n.getValue()).intValue();
    }

    private final int g() {
        return ((Number) this.o.getValue()).intValue();
    }

    private final SearchIntermediateViewModel h() {
        return (SearchIntermediateViewModel) this.p.getValue();
    }

    private final com.ss.android.ugc.aweme.search.theme.a i() {
        return (com.ss.android.ugc.aweme.search.theme.a) this.q.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ArgbEvaluator a() {
        return (ArgbEvaluator) this.f121685l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return ((Number) this.f121686m.getValue()).intValue();
    }

    static final class a extends m implements h.f.a.a<ArgbEvaluator> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121687a = new a();

        static {
            Covode.recordClassIndex(79258);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArgbEvaluator invoke() {
            return new ArgbEvaluator();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a.d$d  reason: collision with other inner class name */
    static final class C3148d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3148d f121689a = new C3148d();

        static {
            Covode.recordClassIndex(79261);
        }

        C3148d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.ss.android.ugc.aweme.base.utils.i.a(com.bytedance.ies.ugc.appcontext.d.a()));
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f121690a = new e();

        static {
            Covode.recordClassIndex(79262);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.ss.android.ugc.aweme.base.utils.i.b(com.bytedance.ies.ugc.appcontext.d.a()));
        }
    }

    static final class f extends m implements h.f.a.a<Integer> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(79263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.b.c(this.this$0.f121684k, R.color.c9));
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.search.theme.a> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(79264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.theme.a invoke() {
            return new com.ss.android.ugc.aweme.search.theme.a(this.this$0.f121684k, this.this$0);
        }
    }

    static final class b extends m implements h.f.a.a<SearchIntermediateViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(79259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            ac a2 = ae.a(this.this$0.f121684k, (ad.b) null).a(SearchIntermediateViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    public final int c() {
        Integer value = h().getSearchTabIndex().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    public final boolean d() {
        Integer value = h().getIntermediateState().getValue();
        if (value != null && value.intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (this.f121675b) {
            this.f121675b = false;
            this.f121676c = 0;
            this.t.b(this.s);
            i().e();
        }
    }

    private final boolean j() {
        if (this.r == null) {
            this.r = androidx.core.content.b.a(this.f121684k, (int) R.drawable.bbr);
        }
        if (this.f121674a == null) {
            Drawable drawable = this.r;
            if (drawable instanceof LayerDrawable) {
                Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
                if (drawable2 != null && (drawable2 instanceof GradientDrawable)) {
                    this.f121674a = (GradientDrawable) drawable2;
                }
            }
        }
        if (this.r == null || this.f121674a == null) {
            return false;
        }
        return true;
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121688a;

        static {
            Covode.recordClassIndex(79260);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(d dVar) {
            this.f121688a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            float f2;
            int i4;
            l.d(recyclerView, "");
            if (this.f121688a.c() == j.f121154b && this.f121688a.d()) {
                int i5 = this.f121688a.f121676c;
                this.f121688a.f121676c = recyclerView.computeVerticalScrollOffset();
                this.f121688a.f121677d += i3;
                this.f121688a.c();
                this.f121688a.d();
                int i6 = this.f121688a.f121682i;
                int i7 = this.f121688a.f121683j;
                int i8 = this.f121688a.f121676c;
                if (i6 > i8 || i7 < i8) {
                    int i9 = i5 + 1;
                    int i10 = this.f121688a.f121676c;
                    int i11 = this.f121688a.f121683j;
                    if ((i9 > i11 || i10 <= i11) && (this.f121688a.f121676c + 1 > (i4 = this.f121688a.f121682i) || i5 <= i4)) {
                        return;
                    }
                }
                d dVar = this.f121688a;
                int i12 = dVar.f121680g;
                int i13 = this.f121688a.f121681h;
                if (dVar.f121676c > dVar.f121683j) {
                    f2 = 1.0f;
                } else if (dVar.f121676c < dVar.f121682i) {
                    f2 = 0.0f;
                } else {
                    f2 = (((float) (dVar.f121676c - dVar.f121682i)) * 1.0f) / ((float) (dVar.f121683j - dVar.f121682i));
                }
                float f3 = (1.0f - f2) * 0.6f;
                Object evaluate = dVar.a().evaluate(f2, Integer.valueOf(i12), Integer.valueOf(dVar.b()));
                Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) evaluate).intValue();
                Object evaluate2 = dVar.a().evaluate(f2, Integer.valueOf(i13), Integer.valueOf(dVar.b()));
                Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                int intValue2 = ((Integer) evaluate2).intValue();
                dVar.f121678e = intValue;
                dVar.f121679f = intValue2;
                GradientDrawable gradientDrawable = dVar.f121674a;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(new int[]{intValue, intValue2, dVar.b()});
                    gradientDrawable.setGradientCenter(f3, f3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void b(boolean z) {
        d(true);
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void c(boolean z) {
        d(false);
    }

    private final void d(boolean z) {
        if (z) {
            GradientDrawable gradientDrawable = this.f121674a;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{this.f121678e, this.f121679f, b()});
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable2 = this.f121674a;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColors(new int[]{b(), b(), b()});
        }
    }

    private final boolean b(c cVar) {
        String str;
        String str2 = cVar.f121671a;
        if (str2 == null || str2.length() == 0 || (str = cVar.f121672b) == null || str.length() == 0 || cVar.f121673c <= 0) {
            return false;
        }
        try {
            String str3 = cVar.f121671a;
            if (str3 != null) {
                this.f121680g = Color.parseColor(p.b((CharSequence) str3).toString());
                String str4 = cVar.f121672b;
                if (str4 != null) {
                    this.f121681h = Color.parseColor(p.b((CharSequence) str4).toString());
                    this.f121682i = (cVar.f121673c - 1) * f();
                    this.f121683j = cVar.f121673c * f();
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void a(float f2) {
        Object evaluate = a().evaluate(f2, Integer.valueOf(this.f121678e), Integer.valueOf(b()));
        Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) evaluate).intValue();
        Object evaluate2 = a().evaluate(f2, Integer.valueOf(this.f121679f), Integer.valueOf(b()));
        Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) evaluate2).intValue();
        GradientDrawable gradientDrawable = this.f121674a;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{intValue, intValue2, b()});
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        if (b(cVar) && j()) {
            this.f121675b = true;
            this.f121676c = 0;
            this.f121677d = 0;
            this.f121678e = this.f121680g;
            this.f121679f = this.f121681h;
            if (c() != j.f121154b || !d()) {
                a(b(), b());
            } else {
                a(this.f121680g, this.f121681h);
            }
            a.a(this.r);
            this.t.b(this.s);
            this.t.a(this.s);
            i().d();
        }
    }

    public d(androidx.fragment.app.e eVar, RecyclerView recyclerView) {
        l.d(eVar, "");
        l.d(recyclerView, "");
        this.f121684k = eVar;
        this.t = recyclerView;
    }

    private final void a(int i2, int i3) {
        float f2;
        int computeVerticalScrollOffset = this.t.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset <= f()) {
            f2 = (((float) (f() - computeVerticalScrollOffset)) * 0.6f) / ((float) f());
        } else {
            f2 = 0.0f;
        }
        GradientDrawable gradientDrawable = this.f121674a;
        if (gradientDrawable != null) {
            gradientDrawable.setSize(g(), f());
            gradientDrawable.setColors(new int[]{i2, i3, b()});
            gradientDrawable.setGradientCenter(f2, f2);
        }
        f();
    }
}
