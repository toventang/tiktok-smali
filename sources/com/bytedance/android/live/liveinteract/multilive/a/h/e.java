package com.bytedance.android.live.liveinteract.multilive.a.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.live.liveinteract.api.c.d;
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
import java.util.ArrayList;
import java.util.Objects;

public final class e extends a {
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11582a;

    static {
        Covode.recordClassIndex(6282);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd4;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.GRID;
    }

    public final void f() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new c(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f11583a;

        static {
            Covode.recordClassIndex(6285);
        }

        c(e eVar) {
            this.f11583a = eVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            boolean z;
            View findViewById;
            DataChannel dataChannel = this.f11583a.f11788i;
            n nVar = n.GRID;
            ViewGroup viewGroup = this.f11583a.f11783d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62);
            } else {
                frameLayout = null;
            }
            boolean z2 = this.f11583a.f11784e;
            ViewGroup viewGroup2 = this.f11583a.f11783d;
            if (viewGroup2 == null || (findViewById = viewGroup2.findViewById(R.id.eoa)) == null || findViewById.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            dataChannel.c(as.class, new o(nVar, frameLayout, z2, false, 0, 0, 0, 0, z, 240));
        }
    }

    static final class a extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(6283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.b(num.intValue());
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    static final class b extends m implements h.f.a.b<p<? extends Boolean, ? extends Integer>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(6284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p<? extends Boolean, ? extends Integer> pVar) {
            p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            l.d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.this$0.b(((Number) pVar2.getSecond()).intValue());
                this.this$0.f();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b, com.bytedance.android.live.liveinteract.multilive.a.h.a
    public final void a(ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        l.d(viewGroup, "");
        super.a(viewGroup);
        ViewGroup viewGroup2 = this.f11783d;
        if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.eoa)) == null)) {
            findViewById2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.f11783d;
        if (!(viewGroup3 == null || (findViewById = viewGroup3.findViewById(R.id.xh)) == null)) {
            findViewById.setVisibility(8);
        }
        f();
        this.f11788i.a(com.bytedance.android.live.liveinteract.api.b.l.class, (h.f.a.b) new a(this)).a(cm.class, (h.f.a.b) new b(this));
    }

    public final void b(int i2) {
        View findViewById;
        View findViewById2;
        ViewGroup.LayoutParams layoutParams;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        if (i2 > 0 && !l.a(this.f11788i.b(cn.class), (Object) true)) {
            int c2 = h.c(y.c(), y.b());
            if (i2 < c2) {
                int i3 = (c2 - i2) / 2;
                ViewGroup viewGroup = this.f11783d;
                if (!(viewGroup == null || (findViewById8 = viewGroup.findViewById(R.id.c9r)) == null)) {
                    i.a.a.a.a.b.c(findViewById8);
                }
                ViewGroup viewGroup2 = this.f11783d;
                ViewGroup.LayoutParams layoutParams2 = null;
                if (viewGroup2 == null || (findViewById7 = viewGroup2.findViewById(R.id.c9r)) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = findViewById7.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                aVar.width = i3;
                ViewGroup viewGroup3 = this.f11783d;
                if (!(viewGroup3 == null || (findViewById6 = viewGroup3.findViewById(R.id.c9r)) == null)) {
                    findViewById6.setLayoutParams(aVar);
                }
                ViewGroup viewGroup4 = this.f11783d;
                if (!(viewGroup4 == null || (findViewById5 = viewGroup4.findViewById(R.id.dnb)) == null)) {
                    i.a.a.a.a.b.c(findViewById5);
                }
                ViewGroup viewGroup5 = this.f11783d;
                if (!(viewGroup5 == null || (findViewById4 = viewGroup5.findViewById(R.id.dnb)) == null)) {
                    layoutParams2 = findViewById4.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                aVar2.width = i3;
                ViewGroup viewGroup6 = this.f11783d;
                if (viewGroup6 != null && (findViewById3 = viewGroup6.findViewById(R.id.dnb)) != null) {
                    findViewById3.setLayoutParams(aVar2);
                    return;
                }
                return;
            }
            ViewGroup viewGroup7 = this.f11783d;
            if (!(viewGroup7 == null || (findViewById2 = viewGroup7.findViewById(R.id.c9r)) == null)) {
                i.a.a.a.a.b.a(findViewById2);
            }
            ViewGroup viewGroup8 = this.f11783d;
            if (viewGroup8 != null && (findViewById = viewGroup8.findViewById(R.id.dnb)) != null) {
                i.a.a.a.a.b.a(findViewById);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(View view) {
        MethodCollector.i(8554);
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            MethodCollector.o(8554);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (l.a(parent, viewGroup.findViewById(R.id.d63))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d63)).removeView(view);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d64))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d64)).removeView(view);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d65))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d65)).removeView(view);
            }
        }
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            ArrayList<View> c2 = c(viewGroup2);
            int size = c2.size();
            if (size == 0) {
                FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout, "");
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout2, "");
                frameLayout2.setVisibility(8);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                l.b(frameLayout3, "");
                frameLayout3.setVisibility(8);
                View findViewById = viewGroup2.findViewById(R.id.eoa);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = viewGroup2.findViewById(R.id.xh);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                View findViewById5 = viewGroup2.findViewById(R.id.d18);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(8);
                }
            } else if (size == 1) {
                FrameLayout frameLayout4 = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout4, "");
                frameLayout4.setVisibility(8);
                FrameLayout frameLayout5 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                l.b(frameLayout5, "");
                frameLayout5.setVisibility(8);
                FrameLayout frameLayout6 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout6, "");
                frameLayout6.setVisibility(0);
                View view2 = c2.get(0);
                l.b(view2, "");
                a(view2, (FrameLayout) viewGroup2.findViewById(R.id.d64));
                View findViewById6 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById6 != null) {
                    findViewById6.setVisibility(8);
                }
                View findViewById7 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                View findViewById8 = viewGroup2.findViewById(R.id.d18);
                if (findViewById8 != null) {
                    findViewById8.setVisibility(0);
                }
            } else if (size == 2) {
                FrameLayout frameLayout7 = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout7, "");
                frameLayout7.setVisibility(8);
                FrameLayout frameLayout8 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout8, "");
                frameLayout8.setVisibility(0);
                FrameLayout frameLayout9 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                if (frameLayout9 != null) {
                    frameLayout9.setVisibility(0);
                }
                View view3 = c2.get(0);
                l.b(view3, "");
                a(view3, (FrameLayout) viewGroup2.findViewById(R.id.d64));
                View view4 = c2.get(1);
                l.b(view4, "");
                a(view4, (FrameLayout) viewGroup2.findViewById(R.id.d65));
                View findViewById9 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById9 != null) {
                    findViewById9.setVisibility(8);
                }
                View findViewById10 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById10 != null) {
                    findViewById10.setVisibility(0);
                }
                View findViewById11 = viewGroup2.findViewById(R.id.d18);
                if (findViewById11 != null) {
                    findViewById11.setVisibility(0);
                }
            }
            f();
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11582a;
        if (aVar == null) {
            l.a("mMultiGuestDataHolder");
        }
        if (aVar.f11302l == 0) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11582a;
            if (aVar2 == null) {
                l.a("mMultiGuestDataHolder");
            }
            aVar2.a(n.NORMAL);
        }
        MethodCollector.o(8554);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View childAt;
        View childAt2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        MethodCollector.i(8517);
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            MethodCollector.o(8517);
            return -1;
        }
        View findViewById = viewGroup.findViewById(R.id.eoa);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = viewGroup.findViewById(R.id.xh);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        f();
        FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.d63);
        if (frameLayout6 == null || frameLayout6.getChildCount() != 0 || (frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout5.getChildCount() != 0) {
            FrameLayout frameLayout7 = (FrameLayout) viewGroup.findViewById(R.id.d63);
            if (frameLayout7 == null || frameLayout7.getChildCount() != 0 || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout3.getChildCount() <= 0 || (frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.d65)) == null || frameLayout4.getChildCount() != 0) {
                FrameLayout frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d63);
                if (frameLayout8 == null || frameLayout8.getChildCount() != 0 || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout.getChildCount() <= 0 || (frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d65)) == null || frameLayout2.getChildCount() <= 0) {
                    int a2 = super.a(view, i2);
                    MethodCollector.o(8517);
                    return a2;
                }
                FrameLayout frameLayout9 = (FrameLayout) viewGroup.findViewById(R.id.d64);
                if (!(frameLayout9 == null || (childAt2 = frameLayout9.getChildAt(0)) == null)) {
                    a(childAt2, (FrameLayout) viewGroup.findViewById(R.id.d63));
                }
                FrameLayout frameLayout10 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (!(frameLayout10 == null || (childAt = frameLayout10.getChildAt(0)) == null)) {
                    a(childAt, (FrameLayout) viewGroup.findViewById(R.id.d64));
                }
                FrameLayout frameLayout11 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (frameLayout11 != null) {
                    frameLayout11.setVisibility(0);
                }
                FrameLayout frameLayout12 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (frameLayout12 != null) {
                    frameLayout12.addView(view, o());
                }
                View findViewById3 = viewGroup.findViewById(R.id.d1a);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(0);
                }
                MethodCollector.o(8517);
                return 3;
            }
            FrameLayout frameLayout13 = (FrameLayout) viewGroup.findViewById(R.id.d63);
            l.b(frameLayout13, "");
            frameLayout13.setVisibility(8);
            FrameLayout frameLayout14 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            l.b(frameLayout14, "");
            frameLayout14.setVisibility(0);
            FrameLayout frameLayout15 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            if (frameLayout15 != null) {
                frameLayout15.setVisibility(0);
            }
            FrameLayout frameLayout16 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            if (frameLayout16 != null) {
                frameLayout16.addView(view, o());
            }
            View findViewById4 = viewGroup.findViewById(R.id.d1b);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
            MethodCollector.o(8517);
            return 2;
        }
        FrameLayout frameLayout17 = (FrameLayout) viewGroup.findViewById(R.id.d63);
        l.b(frameLayout17, "");
        frameLayout17.setVisibility(8);
        FrameLayout frameLayout18 = (FrameLayout) viewGroup.findViewById(R.id.d65);
        l.b(frameLayout18, "");
        frameLayout18.setVisibility(8);
        FrameLayout frameLayout19 = (FrameLayout) viewGroup.findViewById(R.id.d64);
        l.b(frameLayout19, "");
        frameLayout19.setVisibility(0);
        ((FrameLayout) viewGroup.findViewById(R.id.d64)).addView(view, o());
        View findViewById5 = viewGroup.findViewById(R.id.d18);
        if (findViewById5 != null) {
            findViewById5.setVisibility(0);
        }
        MethodCollector.o(8517);
        return 1;
    }
}
