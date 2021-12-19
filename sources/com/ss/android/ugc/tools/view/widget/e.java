package com.ss.android.ugc.tools.view.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.tools.view.c.c;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class e extends PopupWindow {

    /* renamed from: f  reason: collision with root package name */
    private static int f150425f;

    /* renamed from: a  reason: collision with root package name */
    public Context f150426a;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f150427b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f150428c;

    /* renamed from: d  reason: collision with root package name */
    public int f150429d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f150430e;

    /* renamed from: g  reason: collision with root package name */
    private int f150431g;

    /* renamed from: h  reason: collision with root package name */
    private View f150432h;

    static {
        Covode.recordClassIndex(98919);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    private boolean b() {
        Context context = this.f150426a;
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        return true;
    }

    private void c() {
        int b2;
        try {
            if (this.f150426a != null && !isShowing()) {
                this.f150427b.setAlpha(0.0f);
                View decorView = ((Activity) this.f150426a).getWindow().getDecorView();
                if (a()) {
                    b2 = f150425f;
                } else {
                    b2 = (int) n.b(this.f150426a, 35.0f);
                }
                showAtLocation(decorView, 48, 0, b2 + n.e(this.f150426a));
                a(true);
                int i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                if (this.f150431g == 0) {
                    i2 = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.ss.android.ugc.tools.view.widget.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(98920);
                    }

                    public final void run() {
                        e.this.a(false);
                        new Handler().postDelayed(new Runnable() {
                            /* class com.ss.android.ugc.tools.view.widget.e.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(98921);
                            }

                            public final void run() {
                                e.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i2);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean a() {
        if (this.f150429d == 1) {
            return true;
        }
        return false;
    }

    public static e a(Context context) {
        return new e(context);
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public final void a(int i2) {
        f150425f = ((int) n.b(this.f150426a, 52.0f)) + i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            /* class com.ss.android.ugc.tools.view.widget.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(98922);
            }

            public final void run() {
                int i2;
                float f2;
                final int height = e.this.f150427b.getHeight();
                if (z) {
                    i2 = 250;
                } else {
                    i2 = 150;
                }
                RelativeLayout relativeLayout = e.this.f150427b;
                float[] fArr = new float[2];
                boolean z = z;
                float f3 = 0.0f;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                fArr[0] = f2;
                if (z) {
                    f3 = 1.0f;
                }
                fArr[1] = f3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", fArr);
                ofFloat.setDuration((long) i2);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.tools.view.widget.e.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(98923);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i2;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (z) {
                            int i3 = height;
                            i2 = (int) (-(((float) i3) - (((float) i3) * animatedFraction)));
                        } else {
                            i2 = -((int) (((float) height) * animatedFraction));
                        }
                        e.this.f150427b.setTranslationY((float) i2);
                    }
                });
                ofFloat.setInterpolator(new c());
                ofFloat.start();
            }
        }, 5);
    }

    private e(Context context) {
        super(context);
        MethodCollector.i(7267);
        this.f150426a = context;
        this.f150432h = ((LayoutInflater) a(context, "layout_inflater")).inflate(R.layout.b4x, (ViewGroup) null);
        if (b()) {
            setContentView(this.f150432h);
            setWidth(n.a(this.f150426a));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(b.c(this.f150426a, R.color.c9)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.a1w);
            update();
        }
        View view = this.f150432h;
        if (view != null) {
            this.f150427b = (RelativeLayout) view.findViewById(R.id.dp0);
            this.f150428c = (ImageView) view.findViewById(R.id.by0);
            this.f150430e = (TextView) view.findViewById(R.id.exf);
        }
        MethodCollector.o(7267);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7274);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7274);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void a(String str, int i2) {
        int i3;
        if (g.a().E().a(str)) {
            this.f150430e.setText(str);
            this.f150431g = i2;
            int b2 = (int) n.b(this.f150426a, 16.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f150427b.getLayoutParams();
            if (!a()) {
                layoutParams.setMargins(b2, f150425f - ((int) n.b(this.f150426a, 35.0f)), b2, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (b()) {
                c();
                return;
            }
            this.f150427b.setAlpha(1.0f);
            Toast toast = new Toast(this.f150426a);
            toast.setDuration(0);
            if (a()) {
                i3 = f150425f;
            } else {
                i3 = 0;
            }
            toast.setGravity(55, 0, i3);
            toast.setView(this.f150432h);
            a(toast);
        }
    }
}
