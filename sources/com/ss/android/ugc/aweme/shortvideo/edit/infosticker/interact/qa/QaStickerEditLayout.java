package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;

public final class QaStickerEditLayout extends FrameLayout implements g {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f127528a;

    /* renamed from: b  reason: collision with root package name */
    public QaStickerView f127529b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f127530c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<z> f127531d;

    /* renamed from: e  reason: collision with root package name */
    volatile int f127532e;

    /* renamed from: f  reason: collision with root package name */
    int f127533f;

    /* renamed from: g  reason: collision with root package name */
    a f127534g;

    /* renamed from: h  reason: collision with root package name */
    a f127535h;

    /* renamed from: i  reason: collision with root package name */
    a f127536i;

    /* renamed from: j  reason: collision with root package name */
    AnimatorSet f127537j;

    /* renamed from: k  reason: collision with root package name */
    a f127538k;

    /* renamed from: l  reason: collision with root package name */
    b f127539l;

    /* renamed from: m  reason: collision with root package name */
    private h.f.a.b<? super QaStickerView, z> f127540m;
    private TuxTextView n;
    private com.ss.android.ugc.aweme.qasticker.a o;

    public final /* synthetic */ class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f127549a;

        static {
            Covode.recordClassIndex(83616);
        }

        public f(h.f.a.a aVar) {
            this.f127549a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            l.b(this.f127549a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(83610);
    }

    public QaStickerEditLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.qasticker.view.QaStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.qasticker.view.QaStickerView, h.z> */
    public final h.f.a.b<QaStickerView, z> getOnCompleteListener() {
        return this.f127540m;
    }

    public final void a() {
        int i2;
        a aVar = this.f127538k;
        if (aVar == null) {
            l.a("addMethod");
        }
        if (aVar instanceof a.C3314a) {
            a aVar2 = this.f127534g;
            int height = getHeight();
            QaStickerView qaStickerView = this.f127529b;
            if (qaStickerView != null) {
                i2 = qaStickerView.getHeight();
            } else {
                i2 = 0;
            }
            aVar2.f127545e = (float) ((height - i2) / 2);
        }
        this.f127539l = b.c.f127554a;
        a(this.f127529b, this.f127535h, this.f127534g, new b(this));
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ QaStickerEditLayout this$0;

        static {
            Covode.recordClassIndex(83615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(QaStickerEditLayout qaStickerEditLayout) {
            super(0);
            this.this$0 = qaStickerEditLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            QaStickerEditLayout qaStickerEditLayout = this.this$0;
            if (qaStickerEditLayout.f127529b != null && !(!l.a(qaStickerEditLayout.f127539l, b.d.f127555a))) {
                Rect rect = new Rect();
                FrameLayout frameLayout = qaStickerEditLayout.f127530c;
                if (frameLayout == null) {
                    l.a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (qaStickerEditLayout.getHeight() - rect.height() > f.f127573a) {
                    qaStickerEditLayout.f127539l = b.C3315b.f127553a;
                    qaStickerEditLayout.f127532e = qaStickerEditLayout.getHeight() - rect.height();
                    QaStickerView qaStickerView = qaStickerEditLayout.f127529b;
                    if (qaStickerView != null) {
                        qaStickerEditLayout.f127535h = new a(0.0f, 0.0f, (float) ((qaStickerEditLayout.getWidth() - qaStickerView.getWidth()) / 2), (float) (((qaStickerEditLayout.getHeight() - qaStickerEditLayout.f127532e) - qaStickerView.getHeight()) / 2), 7);
                    }
                    a aVar = qaStickerEditLayout.f127538k;
                    if (aVar == null) {
                        l.a("addMethod");
                    }
                    if (aVar instanceof a.b) {
                        qaStickerEditLayout.f127537j = QaStickerEditLayout.a(qaStickerEditLayout.f127529b, qaStickerEditLayout.f127534g, qaStickerEditLayout.f127535h, null);
                        qaStickerEditLayout.f127539l = b.a.f127552a;
                    } else if (aVar instanceof a.C3314a) {
                        QaStickerView qaStickerView2 = qaStickerEditLayout.f127529b;
                        if (qaStickerView2 != null) {
                            qaStickerEditLayout.f127534g.f127544d = (float) ((qaStickerEditLayout.getWidth() - qaStickerView2.getWidth()) / 2);
                            qaStickerEditLayout.f127534g.f127545e = (float) (((qaStickerEditLayout.getHeight() - qaStickerEditLayout.f127532e) - qaStickerView2.getHeight()) / 2);
                        }
                        qaStickerEditLayout.f127537j = QaStickerEditLayout.a(qaStickerEditLayout.f127529b, qaStickerEditLayout.f127534g, qaStickerEditLayout.f127535h, null);
                        qaStickerEditLayout.f127539l = b.a.f127552a;
                    }
                    qaStickerEditLayout.f127533f = rect.height();
                }
            }
            return z.f158842a;
        }
    }

    public final void setOnCompleteListener(h.f.a.b<? super QaStickerView, z> bVar) {
        this.f127540m = bVar;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QaStickerEditLayout f127546a;

        static {
            Covode.recordClassIndex(83612);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(QaStickerEditLayout qaStickerEditLayout) {
            this.f127546a = qaStickerEditLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(6919);
            QaStickerEditLayout qaStickerEditLayout = this.f127546a;
            QaStickerView qaStickerView = qaStickerEditLayout.f127529b;
            if (qaStickerView != null) {
                qaStickerView.b();
            }
            FrameLayout frameLayout = qaStickerEditLayout.f127528a;
            if (frameLayout == null) {
                l.a("rootViw");
            }
            frameLayout.removeView(qaStickerEditLayout.f127529b);
            qaStickerEditLayout.f127539l = b.d.f127555a;
            QaStickerView qaStickerView2 = qaStickerEditLayout.f127529b;
            if (qaStickerView2 != null) {
                qaStickerView2.setTouchAble(false);
                qaStickerView2.setScaleX(1.0f);
                qaStickerView2.setScaleY(1.0f);
                qaStickerView2.setRotation(0.0f);
                qaStickerView2.setTranslationX(0.0f);
                qaStickerView2.setTranslationY(0.0f);
                qaStickerEditLayout.f127533f = 0;
                qaStickerEditLayout.f127534g = new a(0.0f, 0.0f, 0.0f, 0.0f, 31);
                qaStickerEditLayout.f127536i = new a(0.0f, 0.0f, 0.0f, 0.0f, 31);
            }
            h.f.a.b<QaStickerView, z> onCompleteListener = this.f127546a.getOnCompleteListener();
            if (onCompleteListener != null) {
                onCompleteListener.invoke(this.f127546a.f127529b);
            }
            this.f127546a.f127529b = null;
            QaStickerEditLayout qaStickerEditLayout2 = this.f127546a;
            InputMethodManager inputMethodManager = (InputMethodManager) QaStickerEditLayout.a(qaStickerEditLayout2.getContext(), "input_method");
            Context context = qaStickerEditLayout2.getContext();
            l.b(context, "");
            Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
            if (!(a2 == null || inputMethodManager == null)) {
                Window window = a2.getWindow();
                l.b(window, "");
                View decorView = window.getDecorView();
                l.b(decorView, "");
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
            this.f127546a.setVisibility(4);
            MethodCollector.o(6919);
        }
    }

    public final void setMobHelper(com.ss.android.ugc.aweme.qasticker.a aVar) {
        l.d(aVar, "");
        this.o = aVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QaStickerEditLayout f127547a;

        static {
            Covode.recordClassIndex(83613);
        }

        c(QaStickerEditLayout qaStickerEditLayout) {
            this.f127547a = qaStickerEditLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127547a.a();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QaStickerEditLayout f127548a;

        static {
            Covode.recordClassIndex(83614);
        }

        d(QaStickerEditLayout qaStickerEditLayout) {
            this.f127548a = qaStickerEditLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127548a.a();
        }
    }

    private static void a(a aVar) {
        float f2 = aVar.f127543c % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        aVar.f127543c = f2;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7234);
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
                    MethodCollector.o(7234);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (h.z.f158842a == null) goto L_0x0054;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.qasticker.view.QaStickerView r26, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout.a r27) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout.a(com.ss.android.ugc.aweme.qasticker.view.QaStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.QaStickerEditLayout$a):void");
    }

    private /* synthetic */ QaStickerEditLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QaStickerEditLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7273);
        this.f127531d = new e(this);
        this.f127534g = new a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f127535h = new a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f127536i = new a(0.0f, 0.0f, 0.0f, 0.0f, 31);
        this.f127539l = b.d.f127555a;
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bk));
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ah9, this, false);
        if (a2 != null) {
            FrameLayout frameLayout = (FrameLayout) a2;
            this.f127528a = frameLayout;
            if (frameLayout == null) {
                l.a("rootViw");
            }
            addView(frameLayout);
            FrameLayout frameLayout2 = this.f127528a;
            if (frameLayout2 == null) {
                l.a("rootViw");
            }
            View findViewById = frameLayout2.findViewById(R.id.f1k);
            l.b(findViewById, "");
            this.n = (TuxTextView) findViewById;
            setVisibility(4);
            TuxTextView tuxTextView = this.n;
            if (tuxTextView == null) {
                l.a("done");
            }
            tuxTextView.setOnClickListener(new c(this));
            setOnClickListener(new d(this));
            MethodCollector.o(7273);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(7273);
        throw nullPointerException;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public float f127541a;

        /* renamed from: b  reason: collision with root package name */
        public float f127542b;

        /* renamed from: c  reason: collision with root package name */
        public float f127543c;

        /* renamed from: d  reason: collision with root package name */
        public float f127544d;

        /* renamed from: e  reason: collision with root package name */
        public float f127545e;

        static {
            Covode.recordClassIndex(83611);
        }

        public a() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 31);
        }

        private a(float f2, float f3, float f4, float f5) {
            this.f127541a = f2;
            this.f127542b = f3;
            this.f127543c = 0.0f;
            this.f127544d = f4;
            this.f127545e = f5;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(float f2, float f3, float f4, float f5, int i2) {
            this((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5);
        }
    }

    static AnimatorSet a(View view, a aVar, a aVar2, AnimatorListenerAdapter animatorListenerAdapter) {
        float f2;
        if (view == null) {
            return null;
        }
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", aVar.f127541a, aVar2.f127541a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", aVar.f127542b, aVar2.f127542b);
        float[] fArr = new float[2];
        fArr[0] = aVar.f127543c;
        if (aVar2.f127543c > 180.0f) {
            f2 = 360.0f;
        } else {
            f2 = aVar2.f127543c;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", aVar.f127544d, aVar2.f127544d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", aVar.f127545e, aVar2.f127545e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.start();
        return animatorSet;
    }
}
