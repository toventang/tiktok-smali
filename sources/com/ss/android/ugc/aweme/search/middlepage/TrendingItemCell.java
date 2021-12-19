package com.ss.android.ugc.aweme.search.middlepage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class TrendingItemCell extends PowerCell<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f121449a;

    /* renamed from: m  reason: collision with root package name */
    private static final b f121450m = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TextView f121451b;

    /* renamed from: j  reason: collision with root package name */
    private TextView f121452j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f121453k;

    /* renamed from: l  reason: collision with root package name */
    private TuxIconView f121454l;

    static final class b {
        static {
            Covode.recordClassIndex(79126);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(79124);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f121449a = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrendingItemCell f121458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f121459b;

        static {
            Covode.recordClassIndex(79130);
        }

        f(TrendingItemCell trendingItemCell, c cVar) {
            this.f121458a = trendingItemCell;
            this.f121459b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            al.e eVar = this.f121459b.f121483b;
            if (eVar != null) {
                eVar.b(this.f121459b.f121482a, this.f121458a.getLayoutPosition(), this.f121459b.f121484c);
            }
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $resId;
        final /* synthetic */ TextView $this_apply$inlined;

        static {
            Covode.recordClassIndex(79125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, TextView textView) {
            super(1);
            this.$resId = i2;
            this.$this_apply$inlined = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$resId;
            aVar2.f44752d = Integer.valueOf(androidx.core.content.b.c(this.$this_apply$inlined.getContext(), R.color.bh));
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121455a = new c();

        static {
            Covode.recordClassIndex(79127);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.drawable.be7;
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f121456a = new d();

        static {
            Covode.recordClassIndex(79128);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.drawable.be8;
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f121457a = new e();

        static {
            Covode.recordClassIndex(79129);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.drawable.be9;
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw9, viewGroup, false);
        l.b(a2, "");
        View findViewById = a2.findViewById(R.id.eqt);
        l.b(findViewById, "");
        this.f121451b = (TextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.eqv);
        l.b(findViewById2, "");
        this.f121452j = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.eqw);
        l.b(findViewById3, "");
        this.f121453k = (TextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.equ);
        l.b(findViewById4, "");
        this.f121454l = (TuxIconView) findViewById4;
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.search.middlepage.c r9) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell.a(com.bytedance.ies.powerlist.b.a):void");
    }
}
