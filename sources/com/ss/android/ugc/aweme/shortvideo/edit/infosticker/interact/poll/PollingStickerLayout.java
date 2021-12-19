package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PointF;
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
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class PollingStickerLayout extends FrameLayout implements View.OnClickListener, d {

    /* renamed from: a  reason: collision with root package name */
    FrameLayout f127479a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f127480b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<z> f127481c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    h.f.a.b<? super PollingStickerView, z> f127482d;

    /* renamed from: e  reason: collision with root package name */
    h.f.a.b<? super PollingStickerView, z> f127483e;

    /* renamed from: f  reason: collision with root package name */
    a f127484f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    a f127485g = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    volatile int f127486h;

    /* renamed from: i  reason: collision with root package name */
    int f127487i;

    /* renamed from: j  reason: collision with root package name */
    boolean f127488j = true;

    /* renamed from: k  reason: collision with root package name */
    boolean f127489k;

    /* renamed from: l  reason: collision with root package name */
    boolean f127490l;

    /* renamed from: m  reason: collision with root package name */
    PointF f127491m = new PointF(0.0f, 0.0f);
    public PollingStickerView n;
    int o = e.f127523b;
    public boolean p;
    public Animator q;
    private int r = 3;
    private HashMap s;

    public final /* synthetic */ class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f127495a;

        static {
            Covode.recordClassIndex(83591);
        }

        public e(h.f.a.a aVar) {
            this.f127495a = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            l.b(this.f127495a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(83586);
    }

    private View d() {
        if (this.s == null) {
            this.s = new HashMap();
        }
        View view = (View) this.s.get(Integer.valueOf((int) R.id.f1n));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.f1n);
        this.s.put(Integer.valueOf((int) R.id.f1n), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z> */
    public final h.f.a.b<PollingStickerView, z> getBeforeChangeListener() {
        return this.f127483e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, h.z> */
    public final h.f.a.b<PollingStickerView, z> getOnCompleteListener() {
        return this.f127482d;
    }

    public final void a() {
        this.o = e.f127523b;
        c();
    }

    private final void b() {
        InputMethodManager inputMethodManager = (InputMethodManager) a(getContext(), "input_method");
        Context context = getContext();
        l.b(context, "");
        Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a2 != null && inputMethodManager != null) {
            Window window = a2.getWindow();
            l.b(window, "");
            View decorView = window.getDecorView();
            l.b(decorView, "");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    private void c() {
        this.f127489k = false;
        PollingStickerView pollingStickerView = this.n;
        if (pollingStickerView != null) {
            pollingStickerView.setTouchEnable(true);
        }
        if (!this.f127490l) {
            PollingStickerView pollingStickerView2 = this.n;
            if (pollingStickerView2 != null) {
                this.q = a(pollingStickerView2, new a(this));
                b();
            }
            this.f127490l = true;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ PollingStickerLayout this$0;

        static {
            Covode.recordClassIndex(83589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PollingStickerLayout pollingStickerLayout) {
            super(0);
            this.this$0 = pollingStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            boolean z;
            float f2;
            h.f.a.b<? super PollingStickerView, z> bVar;
            int abs;
            PollingStickerLayout pollingStickerLayout = this.this$0;
            if (pollingStickerLayout.n != null) {
                Rect rect = new Rect();
                FrameLayout frameLayout = pollingStickerLayout.f127480b;
                if (frameLayout == null) {
                    l.a("root");
                }
                frameLayout.getWindowVisibleDisplayFrame(rect);
                if (pollingStickerLayout.f127487i != 0 && pollingStickerLayout.getHeight() > pollingStickerLayout.f127487i && ((pollingStickerLayout.getHeight() <= rect.height() || (abs = Math.abs(pollingStickerLayout.getHeight() - rect.height())) <= n.a() + 2 || abs <= n.c(pollingStickerLayout.getContext())) && (bVar = pollingStickerLayout.f127483e) != null)) {
                    bVar.invoke(pollingStickerLayout.n);
                }
                if (pollingStickerLayout.getHeight() - rect.height() > e.f127522a) {
                    pollingStickerLayout.f127486h = pollingStickerLayout.getHeight() - rect.height();
                    PollingStickerView pollingStickerView = pollingStickerLayout.n;
                    if (pollingStickerView != null) {
                        pollingStickerLayout.f127484f.f127508d = (float) ((pollingStickerLayout.getWidth() - pollingStickerView.getWidth()) / 2);
                        pollingStickerLayout.f127484f.f127509e = (float) (((pollingStickerLayout.getHeight() - pollingStickerLayout.f127486h) - pollingStickerView.getHeight()) / 2);
                    }
                    int i2 = pollingStickerLayout.o;
                    if (i2 == e.f127525d) {
                        pollingStickerLayout.o = e.f127523b;
                        pollingStickerLayout.f127490l = false;
                        if (!pollingStickerLayout.f127489k) {
                            PollingStickerView pollingStickerView2 = pollingStickerLayout.n;
                            if (pollingStickerView2 != null) {
                                pollingStickerView2.setVisibility(0);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pollingStickerView2, "scaleX", pollingStickerLayout.f127485g.f127505a, pollingStickerLayout.f127484f.f127505a);
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pollingStickerView2, "scaleY", pollingStickerLayout.f127485g.f127506b, pollingStickerLayout.f127484f.f127506b);
                                float[] fArr = new float[2];
                                fArr[0] = pollingStickerLayout.f127485g.f127507c;
                                if (pollingStickerLayout.f127485g.f127507c > 180.0f) {
                                    f2 = 360.0f;
                                } else {
                                    f2 = pollingStickerLayout.f127484f.f127507c;
                                }
                                fArr[1] = f2;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pollingStickerView2, "rotation", fArr);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pollingStickerView2, "x", pollingStickerLayout.f127485g.f127508d, pollingStickerLayout.f127484f.f127508d);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pollingStickerView2, "y", pollingStickerLayout.f127485g.f127509e, pollingStickerLayout.f127484f.f127509e);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.setDuration(300L);
                                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                                animatorSet.addListener(new b(pollingStickerLayout));
                                animatorSet.start();
                            }
                            pollingStickerLayout.f127489k = true;
                        }
                    } else if (i2 == e.f127524c) {
                        pollingStickerLayout.o = e.f127523b;
                        pollingStickerLayout.f127490l = false;
                        if (!pollingStickerLayout.f127489k) {
                            PollingStickerView pollingStickerView3 = pollingStickerLayout.n;
                            if (pollingStickerView3 != null) {
                                pollingStickerLayout.f127485g.f127508d = (float) ((pollingStickerLayout.getWidth() - pollingStickerView3.getWidth()) / 2);
                                PollEditText pollEditText = (PollEditText) pollingStickerView3.b(R.id.ay_);
                                l.b(pollEditText, "");
                                if (String.valueOf(pollEditText.getText()).length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    pollingStickerLayout.f127485g.f127509e = (((pollingStickerLayout.f127491m.x - ((float) pollingStickerView3.getHeight())) / 2.0f) + pollingStickerLayout.f127491m.y) - (((float) pollingStickerView3.getHeight()) - com.bytedance.common.utility.n.b(pollingStickerLayout.getContext(), 96.0f));
                                } else {
                                    pollingStickerLayout.f127485g.f127509e = ((pollingStickerLayout.f127491m.x - ((float) pollingStickerView3.getHeight())) / 2.0f) + pollingStickerLayout.f127491m.y;
                                }
                                pollingStickerView3.setX(pollingStickerLayout.f127484f.f127508d);
                                pollingStickerView3.setY(pollingStickerLayout.f127484f.f127509e);
                                pollingStickerView3.setVisibility(0);
                                pollingStickerLayout.requestLayout();
                                PollingStickerView pollingStickerView4 = pollingStickerLayout.n;
                                if (pollingStickerView4 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(pollingStickerView4, "scaleX", 0.0f, 1.0f);
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(pollingStickerView4, "scaleY", 0.0f, 1.0f);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.setDuration(300L);
                                    animatorSet2.play(ofFloat6).with(ofFloat7);
                                    animatorSet2.addListener(new d(pollingStickerLayout));
                                    animatorSet2.start();
                                }
                            }
                            pollingStickerLayout.f127489k = true;
                        }
                    }
                    pollingStickerLayout.f127487i = rect.height();
                }
            }
            return z.f158842a;
        }
    }

    public final void setBeforeChangeListener(h.f.a.b<? super PollingStickerView, z> bVar) {
        this.f127483e = bVar;
    }

    public final void setMaxLine(int i2) {
        this.r = i2;
    }

    public final void setOnCompleteListener(h.f.a.b<? super PollingStickerView, z> bVar) {
        this.f127482d = bVar;
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PollingStickerLayout f127492a;

        static {
            Covode.recordClassIndex(83587);
        }

        a(PollingStickerLayout pollingStickerLayout) {
            this.f127492a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(7171);
            super.onAnimationEnd(animator);
            this.f127492a.q = null;
            PollingStickerView pollingStickerView = this.f127492a.n;
            if (pollingStickerView != null) {
                pollingStickerView.a();
            }
            PollingStickerLayout pollingStickerLayout = this.f127492a;
            PollingStickerView pollingStickerView2 = pollingStickerLayout.n;
            if (pollingStickerView2 != null) {
                FrameLayout frameLayout = pollingStickerLayout.f127479a;
                if (frameLayout == null) {
                    l.a("container");
                }
                frameLayout.removeView(pollingStickerView2);
                pollingStickerView2.setEditEnable(false);
                PollingStickerView pollingStickerView3 = pollingStickerLayout.n;
                if (pollingStickerView3 != null) {
                    pollingStickerView3.setScaleX(1.0f);
                    pollingStickerView3.setScaleY(1.0f);
                    pollingStickerView3.setRotation(0.0f);
                    pollingStickerView3.setTranslationX(0.0f);
                    pollingStickerView3.setTranslationY(0.0f);
                    pollingStickerLayout.f127488j = false;
                    pollingStickerLayout.f127487i = 0;
                    pollingStickerLayout.f127485g = new a((byte) 0);
                }
                h.f.a.b<? super PollingStickerView, z> bVar = pollingStickerLayout.f127482d;
                if (bVar != null) {
                    bVar.invoke(pollingStickerLayout.n);
                }
                pollingStickerLayout.n = null;
            }
            this.f127492a.setVisibility(4);
            MethodCollector.o(7171);
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PollingStickerLayout f127493a;

        static {
            Covode.recordClassIndex(83588);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(PollingStickerLayout pollingStickerLayout) {
            this.f127493a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            PollingStickerView pollingStickerView = this.f127493a.n;
            if (pollingStickerView != null) {
                pollingStickerView.b();
            }
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PollingStickerLayout f127494a;

        static {
            Covode.recordClassIndex(83590);
        }

        d(PollingStickerLayout pollingStickerLayout) {
            this.f127494a = pollingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            PollingStickerView pollingStickerView = this.f127494a.n;
            if (pollingStickerView != null) {
                pollingStickerView.b();
            }
        }
    }

    private static void a(a aVar) {
        float f2 = aVar.f127507c % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        aVar.f127507c = f2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (l.a(view, this) || l.a(view, d())) {
            b();
        }
    }

    public final void a(float f2, float f3) {
        this.f127491m.x = f2;
        this.f127491m.y = f3;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6220);
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
                    MethodCollector.o(6220);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(6328);
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bk));
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.aj8, this, false);
        if (a2 != null) {
            FrameLayout frameLayout = (FrameLayout) a2;
            this.f127479a = frameLayout;
            if (frameLayout == null) {
                l.a("container");
            }
            addView(frameLayout);
            ((TuxTextView) d()).setOnClickListener(this);
            setOnClickListener(this);
            setVisibility(4);
            MethodCollector.o(6328);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(6328);
        throw nullPointerException;
    }

    private final Animator a(View view, Animator.AnimatorListener animatorListener) {
        float f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f127484f.f127505a, this.f127485g.f127505a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f127484f.f127506b, this.f127485g.f127506b);
        float[] fArr = new float[2];
        if (this.f127485g.f127507c > 180.0f) {
            f2 = 360.0f;
        } else {
            f2 = this.f127484f.f127507c;
        }
        fArr[0] = f2;
        fArr[1] = this.f127485g.f127507c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", this.f127484f.f127508d, this.f127485g.f127508d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", this.f127484f.f127509e, this.f127485g.f127509e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.addListener(animatorListener);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
        return animatorSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (h.z.f158842a == null) goto L_0x005c;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView r9, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a r10) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerLayout.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollingStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a):void");
    }
}
