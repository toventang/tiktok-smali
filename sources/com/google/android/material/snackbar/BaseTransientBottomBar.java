package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.h.a.c;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.k;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    static final Handler f52578a = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32574);
        }

        public final boolean handleMessage(Message message) {
            Behavior behavior;
            MethodCollector.i(4086);
            int i2 = message.what;
            if (i2 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.f52583e.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f52583e.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.e) {
                        CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                        if (baseTransientBottomBar.f52586h == null) {
                            behavior = new Behavior();
                        } else {
                            behavior = baseTransientBottomBar.f52586h;
                        }
                        if (behavior instanceof Behavior) {
                            behavior.f52605g.f52606a = baseTransientBottomBar.f52587i;
                        }
                        behavior.f52244b = new SwipeDismissBehavior.a() {
                            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass7 */

                            static {
                                Covode.recordClassIndex(32582);
                            }

                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.a
                            public final void a(View view) {
                                view.setVisibility(8);
                                BaseTransientBottomBar.this.a(0);
                            }

                            @Override // com.google.android.material.behavior.SwipeDismissBehavior.a
                            public final void a(int i2) {
                                if (i2 == 0) {
                                    b.a().b(BaseTransientBottomBar.this.f52587i);
                                } else if (i2 == 1 || i2 == 2) {
                                    b.a().a(BaseTransientBottomBar.this.f52587i);
                                }
                            }
                        };
                        eVar.a(behavior);
                        eVar.f2106g = 80;
                    }
                    baseTransientBottomBar.f52581c.addView(baseTransientBottomBar.f52583e);
                }
                baseTransientBottomBar.f52583e.setOnAttachStateChangeListener(new b() {
                    /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(32583);
                    }

                    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.b
                    public final void a() {
                        if (b.a().d(BaseTransientBottomBar.this.f52587i)) {
                            BaseTransientBottomBar.f52578a.post(new Runnable() {
                                /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass8.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(32584);
                                }

                                public final void run() {
                                    BaseTransientBottomBar.this.h();
                                }
                            });
                        }
                    }
                });
                if (!v.v(baseTransientBottomBar.f52583e)) {
                    baseTransientBottomBar.f52583e.setOnLayoutChangeListener(new c() {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(32585);
                        }

                        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.c
                        public final void a() {
                            BaseTransientBottomBar.this.f52583e.setOnLayoutChangeListener(null);
                            if (BaseTransientBottomBar.this.i()) {
                                BaseTransientBottomBar.this.e();
                            } else {
                                BaseTransientBottomBar.this.g();
                            }
                        }
                    });
                } else if (baseTransientBottomBar.i()) {
                    baseTransientBottomBar.e();
                } else {
                    baseTransientBottomBar.g();
                }
                MethodCollector.o(4086);
                return true;
            } else if (i2 != 1) {
                MethodCollector.o(4086);
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i3 = message.arg1;
                if (!baseTransientBottomBar2.i() || baseTransientBottomBar2.f52583e.getVisibility() != 0) {
                    baseTransientBottomBar2.h();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar2.f());
                    valueAnimator.setInterpolator(com.google.android.material.a.a.f52127b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new AnimatorListenerAdapter(i3) {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ int f52594a;

                        static {
                            Covode.recordClassIndex(32577);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            BaseTransientBottomBar.this.h();
                        }

                        public final void onAnimationStart(Animator animator) {
                            BaseTransientBottomBar.this.f52584f.b();
                        }

                        {
                            this.f52594a = r2;
                        }
                    });
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass3 */

                        /* renamed from: b  reason: collision with root package name */
                        private int f52597b;

                        static {
                            Covode.recordClassIndex(32578);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            if (BaseTransientBottomBar.f52579b) {
                                v.d(BaseTransientBottomBar.this.f52583e, intValue - this.f52597b);
                            } else {
                                BaseTransientBottomBar.this.f52583e.setTranslationY((float) intValue);
                            }
                            this.f52597b = intValue;
                        }
                    });
                    valueAnimator.start();
                }
                MethodCollector.o(4086);
                return true;
            }
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f52579b;

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f52580j = {R.attr.acx};

    /* renamed from: c  reason: collision with root package name */
    final ViewGroup f52581c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f52582d;

    /* renamed from: e  reason: collision with root package name */
    public final d f52583e;

    /* renamed from: f  reason: collision with root package name */
    public final a f52584f;

    /* renamed from: g  reason: collision with root package name */
    public int f52585g;

    /* renamed from: h  reason: collision with root package name */
    public Behavior f52586h;

    /* renamed from: i  reason: collision with root package name */
    final b.a f52587i = new b.a() {
        /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass6 */

        static {
            Covode.recordClassIndex(32581);
        }

        @Override // com.google.android.material.snackbar.b.a
        public final void a() {
            Handler handler = BaseTransientBottomBar.f52578a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.a
        public final void a(int i2) {
            Handler handler = BaseTransientBottomBar.f52578a;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private List<Object<B>> f52588k;

    /* renamed from: l  reason: collision with root package name */
    private final AccessibilityManager f52589l;

    /* access modifiers changed from: protected */
    public interface b {
        static {
            Covode.recordClassIndex(32588);
        }

        void a();
    }

    /* access modifiers changed from: protected */
    public interface c {
        static {
            Covode.recordClassIndex(32589);
        }

        void a();
    }

    public int a() {
        return this.f52585g;
    }

    public static class d extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityManager f52607a;

        /* renamed from: b  reason: collision with root package name */
        private final c.a f52608b;

        /* renamed from: c  reason: collision with root package name */
        private c f52609c;

        /* renamed from: d  reason: collision with root package name */
        private b f52610d;

        static {
            Covode.recordClassIndex(32590);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            v.n(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            b bVar = this.f52610d;
            if (bVar != null) {
                bVar.a();
            }
            androidx.core.h.a.c.a(this.f52607a, this.f52608b);
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(b bVar) {
            this.f52610d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(c cVar) {
            this.f52609c = cVar;
        }

        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        protected d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.i(3709);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.sh, R.attr.a52});
            if (obtainStyledAttributes.hasValue(1)) {
                v.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            AccessibilityManager accessibilityManager = (AccessibilityManager) a(context, "accessibility");
            this.f52607a = accessibilityManager;
            AnonymousClass1 r1 = new c.a() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(32591);
                }

                @Override // androidx.core.h.a.c.a
                public final void a(boolean z) {
                    d.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            this.f52608b = r1;
            int i2 = Build.VERSION.SDK_INT;
            accessibilityManager.addTouchExplorationStateChangeListener(new c.b(r1));
            setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
            MethodCollector.o(3709);
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(3739);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(3739);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(3983);
            super.onLayout(z, i2, i3, i4, i5);
            c cVar = this.f52609c;
            if (cVar != null) {
                cVar.a();
            }
            MethodCollector.o(3983);
        }
    }

    public void c() {
        a(3);
    }

    public boolean d() {
        return b.a().c(this.f52587i);
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        int height = this.f52583e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f52583e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f52589l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        Covode.recordClassIndex(32573);
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT <= 19) {
            z = true;
        } else {
            z = false;
        }
        f52579b = z;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        b a2 = b.a();
        b.a aVar = this.f52587i;
        synchronized (a2.f52620a) {
            if (a2.e(aVar)) {
                a2.a(a2.f52622c);
            }
        }
        List<Object<B>> list = this.f52588k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f52588k.get(size);
            }
        }
    }

    public void b() {
        b a2 = b.a();
        int a3 = a();
        b.a aVar = this.f52587i;
        synchronized (a2.f52620a) {
            if (a2.e(aVar)) {
                a2.f52622c.f52626b = a3;
                a2.f52621b.removeCallbacksAndMessages(a2.f52622c);
                a2.a(a2.f52622c);
                return;
            }
            if (a2.f(aVar)) {
                a2.f52623d.f52626b = a3;
            } else {
                a2.f52623d = new b.C1223b(a3, aVar);
            }
            if (a2.f52622c == null || !a2.a(a2.f52622c, 4)) {
                a2.f52622c = null;
                a2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        int f2 = f();
        if (f52579b) {
            v.d(this.f52583e, f2);
        } else {
            this.f52583e.setTranslationY((float) f2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(f2, 0);
        valueAnimator.setInterpolator(com.google.android.material.a.a.f52127b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass10 */

            static {
                Covode.recordClassIndex(32575);
            }

            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.g();
            }

            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f52584f.a();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(f2) {
            /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass11 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f52591a;

            /* renamed from: c  reason: collision with root package name */
            private int f52593c;

            static {
                Covode.recordClassIndex(32576);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f52579b) {
                    v.d(BaseTransientBottomBar.this.f52583e, intValue - this.f52593c);
                } else {
                    BaseTransientBottomBar.this.f52583e.setTranslationY((float) intValue);
                }
                this.f52593c = intValue;
            }

            {
                this.f52591a = r2;
                this.f52593c = r2;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        b a2 = b.a();
        b.a aVar = this.f52587i;
        synchronized (a2.f52620a) {
            if (a2.e(aVar)) {
                a2.f52622c = null;
                if (a2.f52623d != null) {
                    a2.b();
                }
            }
        }
        List<Object<B>> list = this.f52588k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f52588k.get(size);
            }
        }
        ViewParent parent = this.f52583e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f52583e);
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: g  reason: collision with root package name */
        final a f52605g = new a(this);

        static {
            Covode.recordClassIndex(32586);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean a(View view) {
            return view instanceof d;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            a aVar = this.f52605g;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.a().b(aVar.f52606a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.a().a(aVar.f52606a);
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        b.a().a(this.f52587i, i2);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        b.a f52606a;

        static {
            Covode.recordClassIndex(32587);
        }

        public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f52247e = SwipeDismissBehavior.a(0.1f);
            swipeDismissBehavior.f52248f = SwipeDismissBehavior.a(0.6f);
            swipeDismissBehavior.f52245c = 0;
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, a aVar) {
        int i2;
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f52581c = viewGroup;
            this.f52584f = aVar;
            Context context = viewGroup.getContext();
            this.f52582d = context;
            k.a(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f52580j);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                i2 = R.layout.al7;
            } else {
                i2 = R.layout.vm;
            }
            d dVar = (d) com.a.a(from, i2, viewGroup, false);
            this.f52583e = dVar;
            dVar.addView(view);
            int i3 = Build.VERSION.SDK_INT;
            dVar.setAccessibilityLiveRegion(1);
            v.a((View) dVar, 1);
            dVar.setFitsSystemWindows(true);
            v.a(dVar, new r() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(32579);
                }

                @Override // androidx.core.h.r
                public final ad a(View view, ad adVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), adVar.d());
                    return adVar;
                }
            });
            v.a(dVar, new androidx.core.h.a() {
                /* class com.google.android.material.snackbar.BaseTransientBottomBar.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(32580);
                }

                @Override // androidx.core.h.a
                public final void a(View view, androidx.core.h.a.d dVar) {
                    super.a(view, dVar);
                    dVar.a(1048576);
                    dVar.e(true);
                }

                @Override // androidx.core.h.a
                public final boolean a(View view, int i2, Bundle bundle) {
                    if (i2 != 1048576) {
                        return super.a(view, i2, bundle);
                    }
                    BaseTransientBottomBar.this.c();
                    return true;
                }
            });
            this.f52589l = (AccessibilityManager) a(context, "accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }
}
