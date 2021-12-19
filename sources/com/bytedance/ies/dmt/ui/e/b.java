package com.bytedance.ies.dmt.ui.e;

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
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.c.c;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class b extends PopupWindow {

    /* renamed from: e  reason: collision with root package name */
    private static int f33464e;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f33465a;

    /* renamed from: b  reason: collision with root package name */
    private Context f33466b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f33467c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f33468d;

    /* renamed from: f  reason: collision with root package name */
    private int f33469f;

    /* renamed from: g  reason: collision with root package name */
    private int f33470g;

    /* renamed from: h  reason: collision with root package name */
    private View f33471h;

    /* renamed from: i  reason: collision with root package name */
    private long f33472i;

    static {
        Covode.recordClassIndex(19965);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    private boolean b() {
        if (this.f33470g == 1) {
            return true;
        }
        return false;
    }

    private boolean a() {
        Context context = this.f33466b;
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        return true;
    }

    private void c() {
        long j2;
        try {
            if (this.f33466b != null && !isShowing()) {
                this.f33465a.setAlpha(0.0f);
                showAtLocation(((Activity) this.f33466b).getWindow().getDecorView(), 48, 0, f33464e + n.e(this.f33466b));
                a(true);
                int i2 = this.f33469f;
                if (i2 == 0) {
                    j2 = 1500;
                } else if (i2 == 1) {
                    j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                } else {
                    j2 = this.f33472i;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.bytedance.ies.dmt.ui.e.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(19966);
                    }

                    public final void run() {
                        b.this.a(false);
                        new Handler().postDelayed(new Runnable() {
                            /* class com.bytedance.ies.dmt.ui.e.b.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(19967);
                            }

                            public final void run() {
                                b.this.dismiss();
                            }
                        }, 1500);
                    }
                }, j2);
            }
        } catch (Exception unused) {
        }
    }

    public static b a(Context context) {
        return new b(context);
    }

    private void a(int i2) {
        f33464e = ((int) n.b(this.f33466b, 52.0f)) + i2;
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    private b(Context context) {
        super(context);
        MethodCollector.i(9156);
        this.f33466b = context;
        this.f33471h = ((LayoutInflater) a(context, "layout_inflater")).inflate(R.layout.aip, (ViewGroup) null);
        if (a()) {
            setContentView(this.f33471h);
            setWidth(n.a(this.f33466b));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this.f33466b, R.color.c9)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.we);
            update();
        }
        View view = this.f33471h;
        if (view != null) {
            this.f33465a = (RelativeLayout) view.findViewById(R.id.dp0);
            this.f33467c = (ImageView) view.findViewById(R.id.by0);
            this.f33468d = (TextView) view.findViewById(R.id.exf);
        }
        MethodCollector.o(9156);
    }

    /* access modifiers changed from: package-private */
    public final void a(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            /* class com.bytedance.ies.dmt.ui.e.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(19968);
            }

            public final void run() {
                int i2;
                float f2;
                final int height = b.this.f33465a.getHeight();
                if (z) {
                    i2 = 250;
                } else {
                    i2 = 150;
                }
                RelativeLayout relativeLayout = b.this.f33465a;
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
                    /* class com.bytedance.ies.dmt.ui.e.b.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(19969);
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
                        b.this.f33465a.setTranslationY((float) i2);
                    }
                });
                ofFloat.setInterpolator(new c());
                ofFloat.start();
            }
        }, 5);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9157);
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
                    MethodCollector.o(9157);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private void a(String str, int i2, int i3) {
        if (c.a().a(str) || i3 != 2) {
            this.f33468d.setText(str);
            this.f33469f = i2;
            int b2 = (int) n.b(this.f33466b, 16.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33465a.getLayoutParams();
            if (!b()) {
                layoutParams.setMargins(b2, 0, b2, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (a()) {
                c();
                return;
            }
            this.f33465a.setAlpha(1.0f);
            Toast toast = new Toast(this.f33466b);
            toast.setDuration(0);
            toast.setGravity(55, 0, f33464e);
            toast.setView(this.f33471h);
            a(toast);
        }
    }

    public final b a(String str, int i2, int i3, int i4, int i5, long j2) {
        this.f33470g = i3;
        this.f33472i = j2;
        a(i4);
        if (b()) {
            this.f33465a.setBackgroundColor(androidx.core.content.b.c(this.f33466b, R.color.c7));
        } else {
            this.f33465a.setBackgroundResource(R.drawable.cbu);
        }
        this.f33467c.setVisibility(8);
        a(str, i2, i5);
        return this;
    }
}
