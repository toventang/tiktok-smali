package com.bytedance.tux.g;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends PopupWindow implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f45079a;

    /* renamed from: b  reason: collision with root package name */
    public final View f45080b;

    /* renamed from: c  reason: collision with root package name */
    private View f45081c;

    /* renamed from: d  reason: collision with root package name */
    private final c f45082d;

    static {
        Covode.recordClassIndex(27497);
    }

    @Override // com.bytedance.tux.g.a
    public final c a() {
        return this.f45082d;
    }

    public final void c() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f45083a;

        static {
            Covode.recordClassIndex(27498);
        }

        a(e eVar) {
            this.f45083a = eVar;
        }

        public final void run() {
            this.f45083a.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f45084a;

        static {
            Covode.recordClassIndex(27499);
        }

        b(e eVar) {
            this.f45084a = eVar;
        }

        public final void run() {
            this.f45084a.dismiss();
        }
    }

    @Override // com.bytedance.tux.g.a
    public final void dismiss() {
        if (this.f45082d.f45073g) {
            a(false);
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 500);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void b() {
        try {
            this.f45082d.f45067a = Long.valueOf(System.currentTimeMillis() + this.f45082d.f45071e);
            View view = this.f45081c;
            if (view == null) {
                l.a("root");
            }
            int i2 = 0;
            view.measure(0, 0);
            showAtLocation(this.f45080b, 80, 0, 0);
            if (this.f45082d.f45072f) {
                a(true);
            } else {
                View view2 = this.f45081c;
                if (view2 == null) {
                    l.a("root");
                }
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.en7);
                l.a((Object) frameLayout, "");
                frameLayout.setAlpha(1.0f);
                View view3 = this.f45081c;
                if (view3 == null) {
                    l.a("root");
                }
                FrameLayout frameLayout2 = (FrameLayout) view3.findViewById(R.id.en7);
                l.a((Object) frameLayout2, "");
                Context context = this.f45079a;
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i2 = context.getResources().getDimensionPixelSize(identifier);
                }
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                frameLayout2.setTranslationY(((float) i2) + TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            }
            new Handler(Looper.getMainLooper()).postDelayed(new b(this), this.f45082d.f45071e);
        } catch (Exception unused) {
        }
    }

    private final void a(boolean z) {
        float translationY;
        float f2;
        float f3;
        int i2;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator a2 = com.bytedance.tux.a.a.a.a();
        Interpolator b2 = com.bytedance.tux.a.a.a.b();
        View view = this.f45081c;
        if (view == null) {
            l.a("root");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.en7);
        float f4 = 0.0f;
        if (z) {
            f3 = 1.0f;
            l.a((Object) frameLayout, "");
            translationY = -((float) frameLayout.getMeasuredHeight());
            Context context = this.f45079a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
            float f5 = (float) i2;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            f2 = f5 + TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics());
        } else {
            l.a((Object) frameLayout, "");
            f4 = frameLayout.getAlpha();
            translationY = frameLayout.getTranslationY();
            f2 = -((float) frameLayout.getMeasuredHeight());
            f3 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "alpha", f4, f3).setDuration(300L);
        if (!z) {
            a2 = b2;
        }
        duration.setInterpolator(a2);
        l.a((Object) duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout, "translationY", translationY, f2).setDuration(500L);
        duration2.setInterpolator(b2);
        l.a((Object) duration2, "");
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public e(Context context, View view, c cVar) {
        l.c(context, "");
        l.c(view, "");
        l.c(cVar, "");
        MethodCollector.i(9456);
        this.f45079a = context;
        this.f45080b = view;
        this.f45082d = cVar;
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setTouchable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.dy, R.attr.dz, R.attr.gl, R.attr.gm, R.attr.gn}, R.attr.cf, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(2, 0);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        int i2 = obtainStyledAttributes.getInt(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, R.layout.x);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null);
        l.a((Object) inflate, "");
        this.f45081c = inflate;
        if (inflate == null) {
            l.a("root");
        }
        setContentView(inflate);
        View view2 = this.f45081c;
        if (view2 == null) {
            l.a("root");
        }
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.en7);
        l.a((Object) frameLayout, "");
        com.bytedance.tux.c.e eVar = new com.bytedance.tux.c.e();
        eVar.f44775a = Integer.valueOf(color);
        eVar.f44777c = Float.valueOf(dimension);
        frameLayout.setBackground(eVar.a(context));
        View view3 = this.f45081c;
        if (view3 == null) {
            l.a("root");
        }
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.clf);
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(color2);
        tuxTextView.setText(cVar.f45068b);
        View view4 = this.f45081c;
        if (view4 == null) {
            l.a("root");
        }
        TuxIconView tuxIconView = (TuxIconView) view4.findViewById(R.id.bi7);
        Integer num = cVar.f45069c;
        if (num == null) {
            tuxIconView.setVisibility(8);
            View view5 = this.f45081c;
            if (view5 == null) {
                l.a("root");
            }
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.clf);
            l.a((Object) tuxTextView2, "");
            tuxTextView2.setGravity(17);
        } else {
            tuxIconView.setIconRes(num.intValue());
            tuxIconView.setVisibility(0);
        }
        Integer num2 = cVar.f45070d;
        if (num2 != null) {
            tuxIconView.setTintColor(num2.intValue());
            MethodCollector.o(9456);
            return;
        }
        MethodCollector.o(9456);
    }
}
