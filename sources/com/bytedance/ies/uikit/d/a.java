package com.bytedance.ies.uikit.d;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class a {
    private int A = R.layout.vg;

    /* renamed from: a  reason: collision with root package name */
    public Context f35391a;

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f35392b;

    /* renamed from: c  reason: collision with root package name */
    public int f35393c = 49;

    /* renamed from: d  reason: collision with root package name */
    int[] f35394d;

    /* renamed from: e  reason: collision with root package name */
    public View f35395e;

    /* renamed from: f  reason: collision with root package name */
    TextView f35396f;

    /* renamed from: g  reason: collision with root package name */
    AnimatorSet f35397g;

    /* renamed from: h  reason: collision with root package name */
    public long f35398h = 2500;

    /* renamed from: i  reason: collision with root package name */
    public boolean f35399i;

    /* renamed from: j  reason: collision with root package name */
    boolean f35400j;

    /* renamed from: k  reason: collision with root package name */
    public String f35401k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f35402l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f35403m;
    WindowManager n;
    WindowManager.LayoutParams o;
    public float p;
    public float q;
    public AnimatorSet r;
    public AnimatorSet s;
    public boolean t;
    int u;
    private AnimatorSet v;
    private ImageView w;
    private View x;
    private boolean y;
    private int z;

    static {
        Covode.recordClassIndex(21184);
    }

    static void a(WindowManager windowManager, View view) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_ies_uikit_toast_CustomToast_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    public final View b() {
        View view = this.f35395e;
        if (view == null) {
            return this.f35392b;
        }
        return view;
    }

    public final boolean c() {
        View view = this.f35395e;
        if (view == null || !view.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f35391a == null || this.f35399i) {
            return true;
        }
        return false;
    }

    private View f() {
        LayoutInflater from = LayoutInflater.from(this.f35391a);
        if (-1 == this.z) {
            return this.x;
        }
        int i2 = this.A;
        if (i2 <= 0) {
            if (this.y) {
                i2 = R.layout.vd;
            } else {
                i2 = R.layout.vc;
            }
        }
        try {
            View a2 = com.a.a(from, i2, this.f35392b, false);
            this.x = a2;
            this.z = i2;
            return a2;
        } catch (InflateException unused) {
            if (this.x == null) {
                this.x = com.a.a(from, R.layout.vc, this.f35392b, false);
            }
            this.z = R.layout.vc;
            return this.x;
        }
    }

    public final void d() {
        MethodCollector.i(11186);
        if (!this.f35400j) {
            MethodCollector.o(11186);
            return;
        }
        ViewGroup viewGroup = this.f35392b;
        if (!(viewGroup == null || viewGroup.getParent() == null)) {
            a(this.n, this.f35392b);
            this.f35392b.removeView(this.f35395e);
        }
        this.f35400j = false;
        MethodCollector.o(11186);
    }

    public final AnimatorSet a() {
        if (this.v == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.v = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f35392b, "translationY", 0.0f, (float) (-this.u)), ObjectAnimator.ofFloat(this.f35392b, "alpha", 1.0f, 0.0f));
            this.v.setInterpolator(new AccelerateDecelerateInterpolator());
            this.v.setDuration(320L);
        }
        return this.v;
    }

    public a(Context context) {
        MethodCollector.i(11024);
        this.f35391a = context;
        this.f35394d = new int[4];
        if (!e()) {
            this.f35392b = new FrameLayout(this.f35391a);
            this.u = (int) context.getResources().getDimension(R.dimen.tq);
            this.f35392b.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ies.uikit.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(21185);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        a.this.p = motionEvent.getY();
                        a aVar = a.this;
                        aVar.a(aVar.r, 1.0f, 0.98f);
                        return false;
                    } else if (action == 1) {
                        a aVar2 = a.this;
                        aVar2.a(aVar2.s, 0.98f, 1.0f);
                        if (!a.this.f35403m || a.this.q - a.this.p >= 0.0f || Math.abs(a.this.q - a.this.p) <= 20.0f) {
                            return false;
                        }
                        b.a().b(a.this);
                        return false;
                    } else if (action == 2) {
                        a.this.q = motionEvent.getY();
                        return false;
                    } else if (action != 3) {
                        return false;
                    } else {
                        a aVar3 = a.this;
                        aVar3.a(aVar3.s, 0.98f, 1.0f);
                        return false;
                    }
                }
            });
        }
        MethodCollector.o(11024);
    }

    public final void a(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        this.f35397g = animatorSet;
        this.v = animatorSet2;
    }

    public final void a(String str, int i2) {
        this.f35395e = f();
        b(str, i2);
        b.a().a(this);
    }

    static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11341);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11341);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private void b(String str, int i2) {
        if (!e()) {
            this.f35401k = str;
            View view = this.f35395e;
            if (view != null) {
                this.f35396f = (TextView) view.findViewById(R.id.text);
                this.w = (ImageView) this.f35395e.findViewById(R.id.bi7);
            }
            ImageView imageView = this.w;
            if (imageView != null && i2 == -1) {
                imageView.setVisibility(8);
            }
            this.f35395e.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        }
    }

    public final void a(AnimatorSet animatorSet, float f2, float f3) {
        if (this.t) {
            if (animatorSet == null) {
                if (this.f35395e != null) {
                    animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(this.f35392b, "scaleX", f2, f3)).with(ObjectAnimator.ofFloat(this.f35392b, "scaleY", f2, f3));
                    animatorSet.setDuration(80L);
                } else {
                    return;
                }
            }
            animatorSet.start();
        }
    }
}
