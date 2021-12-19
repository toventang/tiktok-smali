package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class ComboProgressAnimationView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21199b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f21200a;

    /* renamed from: c  reason: collision with root package name */
    private int f21201c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f21202d;

    /* renamed from: e  reason: collision with root package name */
    private AnimatorSet f21203e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f21204f;

    static {
        Covode.recordClassIndex(12516);
    }

    public ComboProgressAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f21204f == null) {
            this.f21204f = new HashMap();
        }
        View view = (View) this.f21204f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f21204f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12517);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void d() {
        this.f21201c = 0;
        f();
        g();
    }

    private final void f() {
        AnimatorSet animatorSet = this.f21202d;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f21202d;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f21202d;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f21202d = null;
    }

    private final void g() {
        AnimatorSet animatorSet = this.f21203e;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f21203e;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f21203e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f21203e = null;
    }

    private final void e() {
        g();
        float a2 = ap.a(getContext(), 38.0f) * 0.01f;
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a9_);
        if (constraintLayout != null) {
            constraintLayout.setTranslationY(-a2);
        }
    }

    public final void c() {
        AnimatorSet animatorSet;
        g();
        this.f21203e = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(R.id.a9_), "translationY", ap.a(getContext(), 32.0f));
        AnimatorSet animatorSet2 = this.f21203e;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f21203e) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet3 = this.f21203e;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(1800L);
        }
        AnimatorSet animatorSet4 = this.f21203e;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void a() {
        AnimatorSet animatorSet;
        if (this.f21200a) {
            this.f21201c++;
        } else {
            this.f21201c = 1;
            this.f21200a = true;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a9i);
        if (constraintLayout != null) {
            constraintLayout.setScaleY(1.0f);
        }
        LiveTextView liveTextView = (LiveTextView) a(R.id.a9a);
        if (liveTextView != null) {
            liveTextView.setText(String.valueOf(this.f21201c));
        }
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.a9b);
        if (liveTextView2 != null) {
            liveTextView2.setText(String.valueOf(this.f21201c));
        }
        LiveTextView liveTextView3 = (LiveTextView) a(R.id.a9c);
        if (liveTextView3 != null) {
            liveTextView3.setText(String.valueOf(this.f21201c));
        }
        if (this.f21201c == 1) {
            e();
            f();
            this.f21202d = new AnimatorSet();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.a9i);
            if (constraintLayout2 != null) {
                constraintLayout2.setPivotY(ap.a(getContext(), 110.0f));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(R.id.a9i), "scaleY", 0.2f, 1.0f);
            AnimatorSet animatorSet2 = this.f21202d;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofFloat);
            }
            AnimatorSet animatorSet3 = this.f21202d;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(200L);
            }
            if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f21202d) != null) {
                animatorSet.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
            }
            AnimatorSet animatorSet4 = this.f21202d;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new b(this));
            }
            AnimatorSet animatorSet5 = this.f21202d;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        } else {
            e();
            b();
            c();
        }
        try {
            Object a2 = a(getContext(), "vibrator");
            if (a2 != null) {
                ((Vibrator) a2).vibrate(50);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Exception unused) {
        }
    }

    public final void b() {
        AnimatorSet animatorSet;
        float f2;
        f();
        this.f21202d = new AnimatorSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a9i);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.a9i);
            if (constraintLayout2 != null) {
                f2 = (float) constraintLayout2.getHeight();
            } else {
                f2 = 0.0f;
            }
            constraintLayout.setPivotY(f2);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(R.id.a9i), "scaleY", 1.0f, 0.2f);
        AnimatorSet animatorSet2 = this.f21202d;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        AnimatorSet animatorSet3 = this.f21202d;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new c(this));
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f21202d) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet4 = this.f21202d;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(1800L);
        }
        AnimatorSet animatorSet5 = this.f21202d;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public static final class b extends com.bytedance.android.livesdk.service.animation.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboProgressAnimationView f21205a;

        static {
            Covode.recordClassIndex(12518);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ComboProgressAnimationView comboProgressAnimationView) {
            this.f21205a = comboProgressAnimationView;
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.a
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f21205a.b();
            this.f21205a.c();
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.a
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f21205a.a(R.id.a9i);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboProgressAnimationView f21206a;

        static {
            Covode.recordClassIndex(12519);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ComboProgressAnimationView comboProgressAnimationView) {
            this.f21206a = comboProgressAnimationView;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f21206a.f21200a = false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9149);
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
                    MethodCollector.o(9149);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ ComboProgressAnimationView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboProgressAnimationView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9154);
        LayoutInflater.from(context).inflate(R.layout.b5a, this);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "font/ttlive_base_gift_combo_font.ttf");
            LiveTextView liveTextView = (LiveTextView) a(R.id.a9a);
            if (liveTextView != null) {
                liveTextView.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.a9b);
            if (liveTextView2 != null) {
                liveTextView2.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView3 = (LiveTextView) a(R.id.a9c);
            if (liveTextView3 != null) {
                liveTextView3.setTypeface(createFromAsset);
                MethodCollector.o(9154);
                return;
            }
            MethodCollector.o(9154);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.android.live.core.c.a.a(6, "ComboProgressAnimationView", "load font asset exception: " + e2.getMessage());
            MethodCollector.o(9154);
        }
    }
}
