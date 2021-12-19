package com.bytedance.android.live.liveinteract.multilive.a.h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.livesdk.j.cm;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.Objects;

public final class c extends a {
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11575a;

    static {
        Covode.recordClassIndex(6271);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd2;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.FLOATING;
    }

    public final void f() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC0231c(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.c$c  reason: collision with other inner class name */
    public static final class RunnableC0231c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11577a;

        static {
            Covode.recordClassIndex(6274);
        }

        RunnableC0231c(c cVar) {
            this.f11577a = cVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            DataChannel dataChannel = this.f11577a.f11788i;
            n nVar = n.FLOATING;
            ViewGroup viewGroup = this.f11577a.f11783d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62);
            } else {
                frameLayout = null;
            }
            dataChannel.c(as.class, new o(nVar, frameLayout, this.f11577a.f11784e, false, 0, 0, 0, 0, false, 496));
        }
    }

    public final int g() {
        Integer num;
        int intValue;
        FrameLayout frameLayout;
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(frameLayout.getHeight());
        }
        int d2 = y.a(com.bytedance.android.monitor.l.a.a(this.f11783d.getContext())).heightPixels - y.d();
        if (num == null || (intValue = num.intValue()) == 0) {
            return d2;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r2 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double h() {
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
            if (r0 == 0) goto L_0x003f
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
            int r0 = r5.g()
            int r0 = r0 * r1
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r0
            double r0 = (double) r4
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            return r2
        L_0x003f:
            r1 = 0
            if (r2 == 0) goto L_0x0025
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.a.h.c.h():double");
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11576a;

        static {
            Covode.recordClassIndex(6272);
        }

        a(c cVar) {
            this.f11576a = cVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            FrameLayout frameLayout;
            FrameLayout frameLayout2;
            FrameLayout frameLayout3;
            FrameLayout frameLayout4;
            FrameLayout frameLayout5;
            FrameLayout frameLayout6;
            View findViewById;
            View findViewById2;
            ViewGroup viewGroup = this.f11576a.f11783d;
            ViewGroup.LayoutParams layoutParams4 = null;
            if (viewGroup == null || (findViewById2 = viewGroup.findViewById(R.id.xh)) == null) {
                layoutParams = null;
            } else {
                layoutParams = findViewById2.getLayoutParams();
            }
            if (!(layoutParams instanceof ConstraintLayout.a)) {
                layoutParams = null;
            }
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            if (aVar != null) {
                double g2 = (double) this.f11576a.g();
                Double.isNaN(g2);
                aVar.height = h.g.a.a(g2 * 0.10098522167487685d);
                ViewGroup viewGroup2 = this.f11576a.f11783d;
                if (!(viewGroup2 == null || (findViewById = viewGroup2.findViewById(R.id.xh)) == null)) {
                    findViewById.setLayoutParams(aVar);
                }
                c cVar = this.f11576a;
                double g3 = (double) cVar.g();
                Double.isNaN(g3);
                int a2 = h.g.a.a(g3 * 0.1921182266009852d);
                ViewGroup viewGroup3 = cVar.f11783d;
                if (viewGroup3 == null || (frameLayout6 = (FrameLayout) viewGroup3.findViewById(R.id.d65)) == null) {
                    layoutParams2 = null;
                } else {
                    layoutParams2 = frameLayout6.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                aVar2.width = h.g.a.a(cVar.h() * 0.2660164043449346d);
                aVar2.height = a2;
                double g4 = (double) cVar.g();
                Double.isNaN(g4);
                aVar2.bottomMargin = (int) (g4 * 0.007389162561576354d);
                aVar2.rightMargin = (int) (cVar.h() * 0.017734426956328972d);
                ViewGroup viewGroup4 = cVar.f11783d;
                if (!(viewGroup4 == null || (frameLayout5 = (FrameLayout) viewGroup4.findViewById(R.id.d65)) == null)) {
                    frameLayout5.setLayoutParams(aVar2);
                }
                ViewGroup viewGroup5 = cVar.f11783d;
                if (viewGroup5 == null || (frameLayout4 = (FrameLayout) viewGroup5.findViewById(R.id.d64)) == null) {
                    layoutParams3 = null;
                } else {
                    layoutParams3 = frameLayout4.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) layoutParams3;
                aVar3.height = a2;
                double g5 = (double) cVar.g();
                Double.isNaN(g5);
                aVar3.bottomMargin = (int) (g5 * 0.007389162561576354d);
                ViewGroup viewGroup6 = cVar.f11783d;
                if (!(viewGroup6 == null || (frameLayout3 = (FrameLayout) viewGroup6.findViewById(R.id.d64)) == null)) {
                    frameLayout3.setLayoutParams(aVar3);
                }
                ViewGroup viewGroup7 = cVar.f11783d;
                if (!(viewGroup7 == null || (frameLayout2 = (FrameLayout) viewGroup7.findViewById(R.id.d63)) == null)) {
                    layoutParams4 = frameLayout2.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar4 = (ConstraintLayout.a) layoutParams4;
                aVar4.height = a2;
                ViewGroup viewGroup8 = cVar.f11783d;
                if (viewGroup8 != null && (frameLayout = (FrameLayout) viewGroup8.findViewById(R.id.d63)) != null) {
                    frameLayout.setLayoutParams(aVar4);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
        e.f10014a.a(this);
    }

    static final class b extends m implements h.f.a.b<p<? extends Boolean, ? extends Integer>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p<? extends Boolean, ? extends Integer> pVar) {
            p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            l.d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.this$0.f();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b, com.bytedance.android.live.liveinteract.multilive.a.h.a
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        super.a(viewGroup);
        f();
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            viewGroup2.post(new a(this));
        }
        this.f11788i.a(cm.class, (h.f.a.b) new b(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(View view) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        l.d(view, "");
        super.a(view);
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            int i2 = 0;
            for (T t : c(viewGroup2)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t2 = t;
                if (i3 == 1) {
                    ViewGroup viewGroup3 = this.f11783d;
                    if (viewGroup3 != null) {
                        frameLayout = (FrameLayout) viewGroup3.findViewById(R.id.d63);
                        a((View) t2, frameLayout);
                        i2 = i3;
                    }
                } else if (i3 == 2) {
                    ViewGroup viewGroup4 = this.f11783d;
                    if (viewGroup4 != null) {
                        frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.d64);
                        a((View) t2, frameLayout);
                        i2 = i3;
                    }
                } else if (i3 == 3 && (viewGroup = this.f11783d) != null) {
                    frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d65);
                    a((View) t2, frameLayout);
                    i2 = i3;
                }
                frameLayout = null;
                a((View) t2, frameLayout);
                i2 = i3;
            }
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11575a;
        if (aVar == null) {
            l.a("mMultiGuestDataHolder");
        }
        if (aVar.f11302l == 0) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11575a;
            if (aVar2 == null) {
                l.a("mMultiGuestDataHolder");
            }
            aVar2.a(n.NORMAL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        l.d(view, "");
        f();
        return super.a(view, i2);
    }
}
