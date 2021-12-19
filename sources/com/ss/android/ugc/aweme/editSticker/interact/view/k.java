package com.ss.android.ugc.aweme.editSticker.interact.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.editSticker.interact.e;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class k extends FrameLayout implements e {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f88229b;

    /* renamed from: c  reason: collision with root package name */
    private View f88230c;

    /* renamed from: d  reason: collision with root package name */
    private View f88231d;

    /* renamed from: e  reason: collision with root package name */
    private View f88232e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f88233f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f88234g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f88235h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f88236i;

    /* renamed from: j  reason: collision with root package name */
    private Vibrator f88237j;

    /* renamed from: k  reason: collision with root package name */
    private int f88238k;

    static {
        Covode.recordClassIndex(55457);
    }

    public final View getContentView() {
        return this;
    }

    private void e() {
        this.f88233f = false;
        this.f88234g = false;
        this.f88236i = false;
        this.f88235h = false;
    }

    private void f() {
        if (this.f88232e.getVisibility() == 0) {
            a(this.f88232e, false, true);
        }
    }

    private void g() {
        if (this.f88236i) {
            this.f88236i = false;
            a(this.f88230c, false, true);
        }
    }

    private void h() {
        Vibrator vibrator = this.f88237j;
        if (vibrator != null) {
            try {
                vibrator.vibrate(10);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    public final void b() {
        f();
        d();
        this.f88233f = false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    public final void a() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = dh.c(getContext());
        setLayoutParams(layoutParams);
    }

    public final Rect getDeleteRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    private void c() {
        if (!this.f88235h) {
            this.f88231d.setVisibility(0);
            this.f88235h = true;
            a(this.f88231d, true, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
            rotateAnimation.setDuration(300);
            rotateAnimation.setFillAfter(true);
            this.f88229b.startAnimation(rotateAnimation);
        }
    }

    private void d() {
        if (this.f88235h) {
            this.f88235h = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300);
            this.f88229b.startAnimation(rotateAnimation);
            a(this.f88231d, false, false);
        }
    }

    public k(Context context) {
        this(context, (byte) 0);
    }

    private k(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(3354);
        View inflate = LayoutInflater.from(context).inflate(R.layout.zd, (ViewGroup) null);
        this.f88229b = (ImageView) inflate.findViewById(R.id.eom);
        this.f88230c = inflate.findViewById(R.id.ak0);
        this.f88232e = inflate.findViewById(R.id.d1y);
        this.f88231d = inflate.findViewById(R.id.t3);
        addView(inflate);
        this.f88231d.setVisibility(8);
        this.f88232e.setVisibility(8);
        this.f88237j = (Vibrator) a(context, "vibrator");
        MethodCollector.o(3354);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3721);
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
                    MethodCollector.o(3721);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private void a(final View view, boolean z, final boolean z2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f7 = 0.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        fArr3[0] = f6;
        if (z) {
            f7 = 1.0f;
        }
        fArr3[1] = f7;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.editSticker.interact.view.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(55458);
            }

            public final void onAnimationEnd(Animator animator) {
                if (z2) {
                    view.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r10.f88238k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r10.f88238k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r11, int r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.interact.view.k.a(int, int, boolean, boolean):int");
    }
}
