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

public final class ComboProgressAnimationForWishListView extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f21191d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f21192a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f21193b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21194c;

    /* renamed from: e  reason: collision with root package name */
    private AnimatorSet f21195e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f21196f;

    static {
        Covode.recordClassIndex(12512);
    }

    public ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f21196f == null) {
            this.f21196f = new HashMap();
        }
        View view = (View) this.f21196f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f21196f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12513);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void e() {
        AnimatorSet animatorSet = this.f21195e;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f21195e;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f21195e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f21195e = null;
    }

    public final void d() {
        AnimatorSet animatorSet = this.f21193b;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f21193b;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f21193b;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f21193b = null;
    }

    public final void b() {
        e();
        float a2 = ap.a(getContext(), 38.0f) * 0.01f;
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.a9_);
        if (constraintLayout != null) {
            constraintLayout.setTranslationY(-a2);
        }
    }

    public final void c() {
        AnimatorSet animatorSet;
        e();
        this.f21195e = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(R.id.a9_), "translationY", ap.a(getContext(), 32.0f));
        AnimatorSet animatorSet2 = this.f21195e;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f21195e) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet3 = this.f21195e;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(1800L);
        }
        AnimatorSet animatorSet4 = this.f21195e;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void a() {
        AnimatorSet animatorSet;
        float f2;
        d();
        this.f21193b = new AnimatorSet();
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
        AnimatorSet animatorSet2 = this.f21193b;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        AnimatorSet animatorSet3 = this.f21193b;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new c(this));
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f21193b) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet4 = this.f21193b;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(1800L);
        }
        AnimatorSet animatorSet5 = this.f21193b;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public static final class b extends com.bytedance.android.livesdk.service.animation.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboProgressAnimationForWishListView f21197a;

        static {
            Covode.recordClassIndex(12514);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(ComboProgressAnimationForWishListView comboProgressAnimationForWishListView) {
            this.f21197a = comboProgressAnimationForWishListView;
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.a
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f21197a.a();
            this.f21197a.c();
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.a
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f21197a.a(R.id.a9i);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComboProgressAnimationForWishListView f21198a;

        static {
            Covode.recordClassIndex(12515);
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
        c(ComboProgressAnimationForWishListView comboProgressAnimationForWishListView) {
            this.f21198a = comboProgressAnimationForWishListView;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f21198a.f21194c = false;
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9534);
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
                    MethodCollector.o(9534);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9693);
        LayoutInflater.from(context).inflate(R.layout.b5b, this);
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
                MethodCollector.o(9693);
                return;
            }
            MethodCollector.o(9693);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.android.live.core.c.a.a(6, "ComboProgressAnimationView", "load font asset exception: " + e2.getMessage());
            MethodCollector.o(9693);
        }
    }
}
