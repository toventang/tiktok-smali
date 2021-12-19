package com.bytedance.hybrid.spark.d;

import android.animation.Animator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.w;
import h.z;
import java.lang.reflect.Field;

public final class a implements com.bytedance.hybrid.spark.a.f {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.lynx.a.a.b.b f31112a;

    /* renamed from: b  reason: collision with root package name */
    public final View f31113b;

    static {
        Covode.recordClassIndex(18070);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        this.f31112a.getAnimation();
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f31118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31119b;

        static {
            Covode.recordClassIndex(18074);
        }

        d(a aVar, h.f.a.a aVar2) {
            this.f31118a = aVar;
            this.f31119b = aVar2;
        }

        public final void run() {
            View view = this.f31118a.f31113b;
            view.setTranslationY((float) this.f31118a.f31113b.getHeight());
            view.animate().translationY(0.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.d.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f31120a;

                static {
                    Covode.recordClassIndex(18075);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f31120a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    h.f.a.a aVar = this.f31120a.f31119b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    h.f.a.a aVar = this.f31120a.f31119b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f31120a.f31118a.f31113b.setVisibility(0);
                }
            }).start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f31124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31125b;

        static {
            Covode.recordClassIndex(18078);
        }

        f(a aVar, h.f.a.a aVar2) {
            this.f31124a = aVar;
            this.f31125b = aVar2;
        }

        public final void run() {
            View view = this.f31124a.f31113b;
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.d.a.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f31126a;

                static {
                    Covode.recordClassIndex(18079);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f31126a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    h.f.a.a aVar = this.f31126a.f31125b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    h.f.a.a aVar = this.f31126a.f31125b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f31126a.f31124a.f31113b.setVisibility(0);
                }
            }).start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f31121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31122b;

        static {
            Covode.recordClassIndex(18076);
        }

        e(a aVar, h.f.a.a aVar2) {
            this.f31121a = aVar;
            this.f31122b = aVar2;
        }

        public final void run() {
            WindowManager windowManager;
            Display defaultDisplay;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (this.f31121a.f31113b.getContext() instanceof Activity) {
                Context context = this.f31121a.f31113b.getContext();
                if (context != null) {
                    windowManager = ((Activity) context).getWindowManager();
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                Object a2 = a(this.f31121a.f31113b.getContext(), "window");
                if (a2 != null) {
                    windowManager = (WindowManager) a2;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            View view = this.f31121a.f31113b;
            view.setTranslationX(-((float) displayMetrics.widthPixels));
            view.animate().translationX(0.0f).setDuration(300).setListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.hybrid.spark.d.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f31123a;

                static {
                    Covode.recordClassIndex(18077);
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f31123a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    h.f.a.a aVar = this.f31123a.f31122b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    h.f.a.a aVar = this.f31123a.f31122b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    this.f31123a.f31121a.f31113b.setVisibility(0);
                }
            }).start();
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(5012);
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
                        MethodCollector.o(5012);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.d.a$a  reason: collision with other inner class name */
    public static final class C0655a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31114a;

        static {
            Covode.recordClassIndex(18071);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public C0655a(h.f.a.a aVar) {
            this.f31114a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.a.a aVar = this.f31114a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f31114a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31115a;

        static {
            Covode.recordClassIndex(18072);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public b(h.f.a.a aVar) {
            this.f31115a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.a.a aVar = this.f31115a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f31115a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f31116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f31117b;

        static {
            Covode.recordClassIndex(18073);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.a.a aVar = this.f31117b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f31117b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f31116a.f31113b.setVisibility(0);
        }

        public c(a aVar, h.f.a.a aVar2) {
            this.f31116a = aVar;
            this.f31117b = aVar2;
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        String animation = this.f31112a.getAnimation();
        switch (animation.hashCode()) {
            case -1383228885:
                if (animation.equals("bottom")) {
                    this.f31113b.setVisibility(4);
                    this.f31113b.post(new d(this, aVar));
                    return;
                }
                break;
            case 3005871:
                if (animation.equals("auto")) {
                    this.f31113b.setVisibility(4);
                    this.f31113b.post(new f(this, aVar));
                    return;
                }
                break;
            case 3387192:
                if (animation.equals("none")) {
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                break;
            case 108511772:
                if (animation.equals("right")) {
                    this.f31113b.setVisibility(4);
                    this.f31113b.post(new e(this, aVar));
                    return;
                }
                break;
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public a(com.bytedance.lynx.a.a.b.b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31112a = bVar;
        this.f31113b = view;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3549);
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
                    MethodCollector.o(3549);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
