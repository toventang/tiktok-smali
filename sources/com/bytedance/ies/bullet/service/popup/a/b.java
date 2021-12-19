package com.bytedance.ies.bullet.service.popup.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.a;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import com.bytedance.ies.bullet.service.popup.round.RoundFrameLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b extends FrameLayout implements g, i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f32812d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f32813a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f32814b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super String, z> f32815c;

    /* renamed from: e  reason: collision with root package name */
    private BottomSheetBehavior.a f32816e;

    /* renamed from: f  reason: collision with root package name */
    private a f32817f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32818g;

    /* renamed from: h  reason: collision with root package name */
    private View f32819h;

    /* renamed from: i  reason: collision with root package name */
    private View f32820i;

    /* renamed from: j  reason: collision with root package name */
    private final BottomSheetBehavior.a f32821j;

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f32825a = new e();

        static {
            Covode.recordClassIndex(19617);
        }

        e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(19612);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19613);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Context context, View view, a aVar, h.f.a.a<z> aVar2, h.f.a.b<? super String, z> bVar, h.f.a.b<? super Boolean, z> bVar2) {
            l.c(context, "");
            l.c(view, "");
            l.c(aVar, "");
            l.c(aVar2, "");
            l.c(bVar, "");
            l.c(bVar2, "");
            b bVar3 = new b(context, (byte) 0);
            bVar3.a(aVar);
            bVar3.a(context, view, aVar2, bVar);
            bVar3.f32814b = bVar2;
            bVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return bVar3;
        }
    }

    public final BottomSheetBehavior.a getOnBottomSheetCallback() {
        return this.f32816e;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32826a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f32827b;

        static {
            Covode.recordClassIndex(19618);
        }

        f(b bVar, h.f.a.a aVar) {
            this.f32826a = bVar;
            this.f32827b = aVar;
        }

        public final void run() {
            this.f32827b.invoke();
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32826a.f32813a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.c(4);
            }
        }
    }

    public final boolean a() {
        a.b bVar = this.f32817f.f32807h;
        if (bVar == null || !bVar.a()) {
            return false;
        }
        return true;
    }

    public final void b() {
        h.f.a.b<? super Boolean, z> bVar = this.f32814b;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(this.f32818g));
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void c() {
        this.f32818g = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(4);
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void e() {
        this.f32818g = false;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(5);
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void d() {
        this.f32818g = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f32877e != 5) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f32813a;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.c(5);
                return;
            }
            return;
        }
        h.f.a.b<? super Boolean, z> bVar = this.f32814b;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(this.f32818g));
        }
    }

    public final void setOnBottomSheetCallback(BottomSheetBehavior.a aVar) {
        this.f32816e = aVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$b  reason: collision with other inner class name */
    public static final class C0714b extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32822a;

        static {
            Covode.recordClassIndex(19614);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0714b(b bVar) {
            this.f32822a = bVar;
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.a
        public final void onEvent(String str) {
            h.f.a.b<? super String, z> bVar = this.f32822a.f32815c;
            if (bVar != null) {
                bVar.invoke(str);
            }
            BottomSheetBehavior.a onBottomSheetCallback = this.f32822a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.onEvent(str);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.c(view, "");
            BottomSheetBehavior.a onBottomSheetCallback = this.f32822a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.a(view, f2);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            l.c(view, "");
            BottomSheetBehavior.a onBottomSheetCallback = this.f32822a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.a(view, i2);
            }
            if (i2 == 5) {
                this.f32822a.b();
            }
        }
    }

    public static final class d extends androidx.core.h.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f32824b;

        static {
            Covode.recordClassIndex(19616);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f32824b = bVar;
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            l.c(view, "");
            l.c(dVar, "");
            super.a(view, dVar);
            if (this.f32824b.a()) {
                dVar.a(1048576);
                dVar.e(true);
                return;
            }
            dVar.e(false);
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            l.c(view, "");
            l.c(bundle, "");
            if (i2 != 1048576 || !this.f32824b.a()) {
                return super.a(view, i2, bundle);
            }
            this.f32824b.b();
            return true;
        }
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        this.f32817f = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32823a;

        static {
            Covode.recordClassIndex(19615);
        }

        c(b bVar) {
            this.f32823a = bVar;
        }

        public final void onClick(View view) {
            if (this.f32823a.a()) {
                this.f32823a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32828a;

        static {
            Covode.recordClassIndex(19619);
        }

        g(b bVar) {
            this.f32828a = bVar;
        }

        public final void onClick(View view) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
            if (this.f32828a.a() && (bottomSheetBehavior = this.f32828a.f32813a) != null) {
                bottomSheetBehavior.c(5);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(7621);
        this.f32817f = new a(0, 0, 0, 0, 0, 0, null, 0, false, false, false, 4095);
        this.f32818g = true;
        this.f32821j = new C0714b(this);
        MethodCollector.o(7621);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.g
    public final void a(boolean z, int i2, Integer num) {
        CoordinatorLayout coordinatorLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.f32819h;
        RoundFrameLayout roundFrameLayout = null;
        if (view != null) {
            coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.af4);
            if (coordinatorLayout != null) {
                roundFrameLayout = (RoundFrameLayout) coordinatorLayout.findViewById(R.id.ab1);
            }
        } else {
            coordinatorLayout = null;
        }
        View view2 = this.f32820i;
        if (z) {
            if (num != null && this.f32817f.f32800a == 0 && !this.f32817f.f32809j) {
                int min = Math.min(this.f32817f.f32805f, num.intValue());
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.b(min);
                }
                if (!(coordinatorLayout == null || (layoutParams3 = coordinatorLayout.getLayoutParams()) == null)) {
                    layoutParams3.height = min;
                }
                if (!(roundFrameLayout == null || (layoutParams2 = roundFrameLayout.getLayoutParams()) == null)) {
                    layoutParams2.height = min;
                }
                if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null)) {
                    layoutParams.height = min;
                }
            }
            View view3 = this.f32819h;
            if (view3 != null) {
                view3.setPadding(0, 0, 0, i2);
                return;
            }
            return;
        }
        if (!(coordinatorLayout == null || roundFrameLayout == null || view2 == null)) {
            a(coordinatorLayout, roundFrameLayout, view2);
        }
        View view4 = this.f32819h;
        if (view4 != null) {
            view4.setPadding(0, 0, 0, 0);
        }
    }

    private final void a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2 = this.f32817f.f32800a;
        if (i2 == 0) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(this.f32817f.f32805f);
            }
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f32817f.f32805f;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = this.f32817f.f32805f;
            }
            if (this.f32817f.f32809j) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                }
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -1;
                }
            } else {
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = this.f32817f.f32805f;
                }
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = this.f32817f.f32805f;
                }
            }
            if (this.f32817f.f32804e > 0) {
                ViewGroup.LayoutParams layoutParams7 = coordinatorLayout.getLayoutParams();
                if (layoutParams7 != null) {
                    layoutParams7.width = this.f32817f.f32804e;
                }
                ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.width = this.f32817f.f32804e;
                }
                ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.width = this.f32817f.f32804e;
                }
            }
        } else if (i2 == 1) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f32813a;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.b(this.f32817f.f32805f);
            }
            ViewGroup.LayoutParams layoutParams10 = coordinatorLayout.getLayoutParams();
            if (layoutParams10 != null) {
                layoutParams10.height = -1;
            }
            ViewGroup.LayoutParams layoutParams11 = view.getLayoutParams();
            if (layoutParams11 != null) {
                layoutParams11.height = -1;
            }
            ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
            if (layoutParams12 != null) {
                layoutParams12.height = -2;
            }
        } else if (i2 == 2) {
            throw new Exception("auto height is an incubating feature");
        } else if (i2 == 3) {
            throw new Exception("auto height is an incubating feature");
        }
    }

    public final void a(Context context, View view, h.f.a.a<z> aVar, h.f.a.b<? super String, z> bVar) {
        MethodCollector.i(7572);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        View inflate = LayoutInflater.from(applicationContext).inflate(R.layout.m8, this);
        this.f32819h = inflate;
        this.f32820i = view;
        this.f32815c = bVar;
        View findViewById = inflate.findViewById(R.id.af4);
        l.a((Object) findViewById, "");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) coordinatorLayout.findViewById(R.id.ab1);
        roundFrameLayout.setRadius(this.f32817f.f32806g);
        BottomSheetBehavior<FrameLayout> a2 = BottomSheetBehavior.a(roundFrameLayout);
        this.f32813a = a2;
        if (a2 != null) {
            a2.f32882j = this.f32821j;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f32813a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f32876d = true;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f32813a;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f32885m = this.f32817f.f32803d;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior3 = this.f32813a;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.c(5);
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior4 = this.f32813a;
        if (bottomSheetBehavior4 != null) {
            bottomSheetBehavior4.o = this.f32817f.f32809j;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior5 = this.f32813a;
        if (bottomSheetBehavior5 != null) {
            bottomSheetBehavior5.p = this.f32817f.f32810k;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior6 = this.f32813a;
        if (bottomSheetBehavior6 != null) {
            bottomSheetBehavior6.q = this.f32817f.f32811l;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior7 = this.f32813a;
        if (bottomSheetBehavior7 != null) {
            bottomSheetBehavior7.n = this.f32817f.f32808i;
        }
        roundFrameLayout.addView(view);
        coordinatorLayout.findViewById(R.id.epv).setOnClickListener(new c(this));
        l.a((Object) roundFrameLayout, "");
        a(coordinatorLayout, roundFrameLayout, view);
        v.a(roundFrameLayout, new d(this));
        roundFrameLayout.setOnTouchListener(e.f32825a);
        post(new f(this, aVar));
        setOnClickListener(new g(this));
        MethodCollector.o(7572);
    }
}
