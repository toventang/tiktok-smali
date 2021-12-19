package com.bytedance.android.live.liveinteract.multilive.a.h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.livesdk.j.cm;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.j.h;
import h.p;
import h.z;
import java.util.Objects;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11567a = y.a(64.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final int f11568b = y.a(170.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final a f11569c = new a((byte) 0);

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd3;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final int b() {
        return R.layout.bcx;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.FLOATING_FIX;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final void k() {
        super.k();
        g();
    }

    public final void f() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC0230b(this));
        }
    }

    public final void g() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new g(this));
        }
    }

    static {
        Covode.recordClassIndex(6263);
    }

    public final double h() {
        int i2;
        double d2;
        FrameLayout frameLayout;
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62)) == null) {
            i2 = 0;
        } else {
            i2 = frameLayout.getHeight();
        }
        if (i2 == 0) {
            d2 = (double) ((y.b() - f11568b) - f11567a);
            Double.isNaN(d2);
        } else {
            d2 = (double) i2;
            Double.isNaN(d2);
        }
        return d2 / 0.7560780122896072d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r2 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double i() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.f11788i
            java.lang.Class<com.bytedance.android.live.liveinteract.api.av> r0 = com.bytedance.android.live.liveinteract.api.av.class
            java.lang.Object r2 = r1.b(r0)
            h.p r2 = (h.p) r2
            r4 = 0
            if (r2 == 0) goto L_0x0029
            java.lang.Object r0 = r2.getFirst()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x003c
            int r1 = r0.intValue()
        L_0x0019:
            java.lang.Object r0 = r2.getSecond()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0025
            int r4 = r0.intValue()
        L_0x0025:
            if (r1 == 0) goto L_0x0029
            if (r4 != 0) goto L_0x002d
        L_0x0029:
            r1 = 480(0x1e0, float:6.73E-43)
            r4 = 864(0x360, float:1.211E-42)
        L_0x002d:
            double r2 = r5.h()
            double r0 = (double) r1
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = (double) r4
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            return r2
        L_0x003c:
            r1 = 0
            if (r2 == 0) goto L_0x0025
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.a.h.b.i():double");
    }

    public final int j() {
        double c2 = (double) h.c(y.c(), y.b());
        if (c2 <= i()) {
            return 0;
        }
        double i2 = i();
        Double.isNaN(c2);
        return (int) ((c2 - i2) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$b  reason: collision with other inner class name */
    public static final class RunnableC0230b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11570a;

        static {
            Covode.recordClassIndex(6265);
        }

        RunnableC0230b(b bVar) {
            this.f11570a = bVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            Integer valueOf;
            View findViewById;
            View findViewById2;
            ViewGroup.LayoutParams layoutParams;
            View findViewById3;
            View findViewById4;
            ViewGroup.LayoutParams layoutParams2;
            View findViewById5;
            View findViewById6;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup viewGroup = this.f11570a.f11783d;
            if (viewGroup != null && (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62)) != null && (valueOf = Integer.valueOf(frameLayout.getHeight())) != null) {
                int intValue = valueOf.intValue();
                ViewGroup viewGroup2 = this.f11570a.f11783d;
                if (!(viewGroup2 == null || (findViewById6 = viewGroup2.findViewById(R.id.anr)) == null || (layoutParams3 = findViewById6.getLayoutParams()) == null)) {
                    double d2 = (double) intValue;
                    Double.isNaN(d2);
                    layoutParams3.width = (int) (d2 * 0.004424778761061947d);
                }
                ViewGroup viewGroup3 = this.f11570a.f11783d;
                if (!(viewGroup3 == null || (findViewById5 = viewGroup3.findViewById(R.id.anr)) == null)) {
                    findViewById5.requestLayout();
                }
                ViewGroup viewGroup4 = this.f11570a.f11783d;
                if (!(viewGroup4 == null || (findViewById4 = viewGroup4.findViewById(R.id.ang)) == null || (layoutParams2 = findViewById4.getLayoutParams()) == null)) {
                    double d3 = (double) intValue;
                    Double.isNaN(d3);
                    layoutParams2.height = (int) (d3 * 0.004424778761061947d);
                }
                ViewGroup viewGroup5 = this.f11570a.f11783d;
                if (!(viewGroup5 == null || (findViewById3 = viewGroup5.findViewById(R.id.ang)) == null)) {
                    findViewById3.requestLayout();
                }
                ViewGroup viewGroup6 = this.f11570a.f11783d;
                if (!(viewGroup6 == null || (findViewById2 = viewGroup6.findViewById(R.id.anh)) == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    double d4 = (double) intValue;
                    Double.isNaN(d4);
                    layoutParams.height = (int) (d4 * 0.004424778761061947d);
                }
                ViewGroup viewGroup7 = this.f11570a.f11783d;
                if (viewGroup7 != null && (findViewById = viewGroup7.findViewById(R.id.anh)) != null) {
                    findViewById.requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11574a;

        static {
            Covode.recordClassIndex(6270);
        }

        g(b bVar) {
            this.f11574a = bVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            FrameLayout frameLayout;
            ViewGroup.LayoutParams layoutParams2;
            View findViewById;
            View findViewById2;
            View findViewById3;
            View findViewById4;
            View findViewById5;
            View findViewById6;
            View findViewById7;
            View findViewById8;
            FrameLayout frameLayout2;
            FrameLayout frameLayout3;
            ViewGroup viewGroup = this.f11574a.f11783d;
            ViewGroup.LayoutParams layoutParams3 = null;
            if (viewGroup == null || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d63)) == null) {
                layoutParams = null;
            } else {
                layoutParams = frameLayout3.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.width = h.g.a.a(this.f11574a.i() * 0.24044241404183697d);
            ViewGroup viewGroup2 = this.f11574a.f11783d;
            if (!(viewGroup2 == null || (frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d63)) == null)) {
                frameLayout2.setLayoutParams(aVar);
            }
            n nVar = n.FLOATING_FIX;
            ViewGroup viewGroup3 = this.f11574a.f11783d;
            if (viewGroup3 != null) {
                frameLayout = (FrameLayout) viewGroup3.findViewById(R.id.d62);
            } else {
                frameLayout = null;
            }
            this.f11574a.f11788i.c(as.class, new o(nVar, frameLayout, this.f11574a.f11784e, false, h.g.a.a(this.f11574a.i()), h.g.a.a(this.f11574a.h()), b.f11567a, this.f11574a.j(), false, 256));
            b bVar = this.f11574a;
            if (l.a(bVar.f11788i.b(cn.class), (Object) true)) {
                return;
            }
            if (bVar.j() == 0) {
                ViewGroup viewGroup4 = bVar.f11783d;
                if (!(viewGroup4 == null || (findViewById8 = viewGroup4.findViewById(R.id.c9r)) == null)) {
                    i.a.a.a.a.b.a(findViewById8);
                }
                ViewGroup viewGroup5 = bVar.f11783d;
                if (viewGroup5 != null && (findViewById7 = viewGroup5.findViewById(R.id.dnb)) != null) {
                    i.a.a.a.a.b.a(findViewById7);
                    return;
                }
                return;
            }
            ViewGroup viewGroup6 = bVar.f11783d;
            if (!(viewGroup6 == null || (findViewById6 = viewGroup6.findViewById(R.id.c9r)) == null)) {
                i.a.a.a.a.b.c(findViewById6);
            }
            ViewGroup viewGroup7 = bVar.f11783d;
            if (viewGroup7 == null || (findViewById5 = viewGroup7.findViewById(R.id.c9r)) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2 = findViewById5.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
            aVar2.width = bVar.j();
            ViewGroup viewGroup8 = bVar.f11783d;
            if (!(viewGroup8 == null || (findViewById4 = viewGroup8.findViewById(R.id.c9r)) == null)) {
                findViewById4.setLayoutParams(aVar2);
            }
            ViewGroup viewGroup9 = bVar.f11783d;
            if (!(viewGroup9 == null || (findViewById3 = viewGroup9.findViewById(R.id.dnb)) == null)) {
                i.a.a.a.a.b.c(findViewById3);
            }
            ViewGroup viewGroup10 = bVar.f11783d;
            if (!(viewGroup10 == null || (findViewById2 = viewGroup10.findViewById(R.id.dnb)) == null)) {
                layoutParams3 = findViewById2.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams3;
            aVar3.width = bVar.j();
            ViewGroup viewGroup11 = bVar.f11783d;
            if (viewGroup11 != null && (findViewById = viewGroup11.findViewById(R.id.dnb)) != null) {
                findViewById.setLayoutParams(aVar3);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11571a;

        static {
            Covode.recordClassIndex(6266);
        }

        c(b bVar) {
            this.f11571a = bVar;
        }

        public final void onClick(View view) {
            this.f11571a.a(1);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11572a;

        static {
            Covode.recordClassIndex(6267);
        }

        d(b bVar) {
            this.f11572a = bVar;
        }

        public final void onClick(View view) {
            this.f11572a.a(2);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11573a;

        static {
            Covode.recordClassIndex(6268);
        }

        e(b bVar) {
            this.f11573a = bVar;
        }

        public final void onClick(View view) {
            this.f11573a.a(3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    static final class f extends m implements h.f.a.b<p<? extends Boolean, ? extends Integer>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p<? extends Boolean, ? extends Integer> pVar) {
            p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            l.d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.this$0.f();
                this.this$0.g();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b, com.bytedance.android.live.liveinteract.multilive.a.h.a
    public final void a(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        l.d(viewGroup, "");
        super.a(viewGroup);
        g();
        ViewGroup viewGroup2 = this.f11783d;
        if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.avx)) == null)) {
            frameLayout3.setOnClickListener(new c(this));
        }
        ViewGroup viewGroup3 = this.f11783d;
        if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.avy)) == null)) {
            frameLayout2.setOnClickListener(new d(this));
        }
        ViewGroup viewGroup4 = this.f11783d;
        if (!(viewGroup4 == null || (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.avz)) == null)) {
            frameLayout.setOnClickListener(new e(this));
        }
        f();
        this.f11788i.a(cm.class, (h.f.a.b) new f(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        g();
        int c2 = c(i2);
        int i3 = 3;
        if (c2 == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d63);
            l.b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.avx);
            l.b(frameLayout2, "");
            a(frameLayout, frameLayout2, view);
            i3 = 1;
        } else if (c2 == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            l.b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.avy);
            l.b(frameLayout4, "");
            a(frameLayout3, frameLayout4, view);
            i3 = 2;
        } else if (c2 != 3) {
            i3 = super.a(view, i2);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            l.b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.avz);
            l.b(frameLayout6, "");
            a(frameLayout5, frameLayout6, view);
        }
        p();
        return i3;
    }

    private static void a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.i(9686);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, o());
            i.a.a.a.a.b.a(viewGroup2);
        }
        MethodCollector.o(9686);
    }
}
