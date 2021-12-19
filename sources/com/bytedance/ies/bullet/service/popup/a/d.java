package com.bytedance.ies.bullet.service.popup.a;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.a;
import com.bytedance.ies.bullet.service.popup.round.RoundLinearLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class d extends FrameLayout implements g, i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f32839d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f32840a;

    /* renamed from: b  reason: collision with root package name */
    public c f32841b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32842c;

    /* renamed from: e  reason: collision with root package name */
    private View f32843e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f32844f;

    static {
        Covode.recordClassIndex(19621);
    }

    private View a(int i2) {
        if (this.f32844f == null) {
            this.f32844f = new HashMap();
        }
        View view = (View) this.f32844f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f32844f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19622);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(Context context, View view, c cVar, h.f.a.b<? super Boolean, z> bVar) {
            l.c(context, "");
            l.c(view, "");
            l.c(cVar, "");
            d dVar = new d(context, (byte) 0);
            dVar.a(cVar);
            dVar.a(context, view);
            dVar.f32840a = bVar;
            dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return dVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void c() {
        setVisibility(0);
        ViewPropertyAnimator animate = animate();
        l.a((Object) animate, "");
        ViewPropertyAnimator a2 = a(animate, this.f32841b.f32830a, 0.0f, 0.0f);
        a2.setDuration(200);
        a2.start();
        this.f32842c = true;
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void d() {
        this.f32842c = true;
        ViewPropertyAnimator animate = animate();
        l.a((Object) animate, "");
        ViewPropertyAnimator a2 = a(animate, this.f32841b.f32830a, (float) this.f32841b.f32831b, (float) this.f32841b.f32832c);
        a2.setDuration(200);
        a2.setListener(new b(a2, this));
        a2.start();
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.i
    public final void e() {
        this.f32842c = false;
        ViewPropertyAnimator animate = animate();
        l.a((Object) animate, "");
        ViewPropertyAnimator a2 = a(animate, this.f32841b.f32830a, (float) this.f32841b.f32831b, (float) this.f32841b.f32832c);
        a2.setDuration(200);
        a2.setListener(new c(a2, this));
        a2.start();
    }

    public final void a(c cVar) {
        l.c(cVar, "");
        this.f32841b = cVar;
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32846b;

        static {
            Covode.recordClassIndex(19623);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f32845a.setListener(null);
            h.f.a.b<? super Boolean, z> bVar = this.f32846b.f32840a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f32846b.f32842c));
            }
        }

        b(ViewPropertyAnimator viewPropertyAnimator, d dVar) {
            this.f32845a = viewPropertyAnimator;
            this.f32846b = dVar;
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32848b;

        static {
            Covode.recordClassIndex(19624);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f32847a.setListener(null);
            h.f.a.b<? super Boolean, z> bVar = this.f32848b.f32840a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f32848b.f32842c));
            }
            this.f32848b.setVisibility(4);
        }

        c(ViewPropertyAnimator viewPropertyAnimator, d dVar) {
            this.f32847a = viewPropertyAnimator;
            this.f32848b = dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$d  reason: collision with other inner class name */
    public static final class C0715d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32850b;

        static {
            Covode.recordClassIndex(19625);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f32849a.setListener(null);
            h.f.a.b<? super Boolean, z> bVar = this.f32850b.f32840a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f32850b.f32842c));
            }
        }

        C0715d(ViewPropertyAnimator viewPropertyAnimator, d dVar) {
            this.f32849a = viewPropertyAnimator;
            this.f32850b = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(7527);
        this.f32841b = new c();
        this.f32842c = true;
        MethodCollector.o(7527);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f32851a;

        static {
            Covode.recordClassIndex(19626);
        }

        e(d dVar) {
            this.f32851a = dVar;
        }

        public final void onClick(View view) {
            a.b bVar = this.f32851a.f32841b.f32836g;
            if (bVar != null && bVar.a()) {
                d dVar = this.f32851a;
                ViewPropertyAnimator animate = dVar.animate();
                l.a((Object) animate, "");
                ViewPropertyAnimator a2 = d.a(animate, dVar.f32841b.f32830a, (float) dVar.f32841b.f32831b, (float) dVar.f32841b.f32832c);
                a2.setDuration(200);
                a2.setListener(new C0715d(a2, dVar));
                a2.start();
            }
        }
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }

    public final void a(Context context, View view) {
        int i2;
        MethodCollector.i(7438);
        l.c(context, "");
        l.c(view, "");
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        LayoutInflater.from(applicationContext).inflate(R.layout.m9, this);
        this.f32843e = view;
        ((RoundLinearLayout) a(R.id.adv)).setRadius(this.f32841b.f32835f);
        ((RoundLinearLayout) a(R.id.adv)).addView(view);
        ((RelativeLayout) a(R.id.ad_)).setOnClickListener(new e(this));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i3 = -1;
        if (layoutParams != null) {
            layoutParams.height = this.f32841b.f32834e;
            if (this.f32841b.f32833d > 0) {
                i2 = this.f32841b.f32833d;
            } else {
                i2 = -1;
            }
            layoutParams.width = i2;
        }
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) a(R.id.adv);
        l.a((Object) roundLinearLayout, "");
        ViewGroup.LayoutParams layoutParams2 = roundLinearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f32841b.f32834e;
            if (this.f32841b.f32833d > 0) {
                i3 = this.f32841b.f32833d;
            }
            layoutParams2.width = i3;
        }
        if (this.f32841b.f32830a) {
            setTranslationX((float) this.f32841b.f32832c);
        } else {
            setTranslationY((float) this.f32841b.f32831b);
        }
        ViewPropertyAnimator animate = animate();
        l.a((Object) animate, "");
        ViewPropertyAnimator a2 = a(animate, this.f32841b.f32830a, 0.0f, 0.0f);
        a2.setDuration(200);
        a2.start();
        MethodCollector.o(7438);
    }

    @Override // com.bytedance.ies.bullet.service.popup.a.g
    public final void a(boolean z, int i2, Integer num) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        if (z) {
            if (num != null) {
                int min = Math.min(num.intValue(), this.f32841b.f32834e);
                View view = this.f32843e;
                if (!(view == null || (layoutParams4 = view.getLayoutParams()) == null)) {
                    layoutParams4.height = min;
                }
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) a(R.id.adv);
                if (!(roundLinearLayout == null || (layoutParams3 = roundLinearLayout.getLayoutParams()) == null)) {
                    layoutParams3.height = min;
                }
            }
            setPadding(0, 0, 0, i2);
            return;
        }
        View view2 = this.f32843e;
        if (!(view2 == null || (layoutParams2 = view2.getLayoutParams()) == null)) {
            layoutParams2.height = this.f32841b.f32834e;
        }
        RoundLinearLayout roundLinearLayout2 = (RoundLinearLayout) a(R.id.adv);
        if (!(roundLinearLayout2 == null || (layoutParams = roundLinearLayout2.getLayoutParams()) == null)) {
            layoutParams.height = this.f32841b.f32834e;
        }
        setPadding(0, 0, 0, 0);
    }

    static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, boolean z, float f2, float f3) {
        ViewPropertyAnimator translationY;
        if (z) {
            translationY = viewPropertyAnimator.translationX(f3);
        } else {
            translationY = viewPropertyAnimator.translationY(f2);
        }
        l.a((Object) translationY, "");
        return translationY;
    }
}
