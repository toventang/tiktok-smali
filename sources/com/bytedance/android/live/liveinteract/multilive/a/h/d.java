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

public final class d extends a {
    static {
        Covode.recordClassIndex(6275);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd5;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final int b() {
        return R.layout.bcx;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.GRID_FIX;
    }

    public final void f() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup != null) {
            viewGroup.post(new f(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11581a;

        static {
            Covode.recordClassIndex(6281);
        }

        f(d dVar) {
            this.f11581a = dVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            n nVar = n.GRID_FIX;
            ViewGroup viewGroup = this.f11581a.f11783d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d62);
            } else {
                frameLayout = null;
            }
            this.f11581a.f11788i.c(as.class, new o(nVar, frameLayout, this.f11581a.f11784e, false, 0, 0, 0, 0, false, 504));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11578a;

        static {
            Covode.recordClassIndex(6276);
        }

        a(d dVar) {
            this.f11578a = dVar;
        }

        public final void onClick(View view) {
            this.f11578a.a(1);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11579a;

        static {
            Covode.recordClassIndex(6277);
        }

        b(d dVar) {
            this.f11579a = dVar;
        }

        public final void onClick(View view) {
            this.f11579a.a(2);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11580a;

        static {
            Covode.recordClassIndex(6278);
        }

        c(d dVar) {
            this.f11580a = dVar;
        }

        public final void onClick(View view) {
            this.f11580a.a(3);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$d  reason: collision with other inner class name */
    static final class C0232d extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(6279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0232d(d dVar) {
            super(1);
            this.this$0 = dVar;
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
    public d(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    static final class e extends m implements h.f.a.b<p<? extends Boolean, ? extends Integer>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(6280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(1);
            this.this$0 = dVar;
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
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        l.d(viewGroup, "");
        super.a(viewGroup);
        f();
        ViewGroup viewGroup2 = this.f11783d;
        if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.avx)) == null)) {
            frameLayout3.setOnClickListener(new a(this));
        }
        ViewGroup viewGroup3 = this.f11783d;
        if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.avy)) == null)) {
            frameLayout2.setOnClickListener(new b(this));
        }
        ViewGroup viewGroup4 = this.f11783d;
        if (!(viewGroup4 == null || (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.avz)) == null)) {
            frameLayout.setOnClickListener(new c(this));
        }
        this.f11788i.a(com.bytedance.android.live.liveinteract.api.b.l.class, (h.f.a.b) new C0232d(this)).a(cm.class, (h.f.a.b) new e(this));
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
    public final int a(View view, int i2) {
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        f();
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
        MethodCollector.i(6636);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, o());
            i.a.a.a.a.b.a(viewGroup2);
        }
        MethodCollector.o(6636);
    }
}
