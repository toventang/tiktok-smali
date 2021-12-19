package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public abstract class b<T> extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f127585a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f127586b;

    /* renamed from: c  reason: collision with root package name */
    d<T> f127587c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a f127588d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a f127589e;

    /* renamed from: f  reason: collision with root package name */
    Animator f127590f;

    /* renamed from: g  reason: collision with root package name */
    PointF f127591g;

    /* renamed from: h  reason: collision with root package name */
    boolean f127592h;

    /* renamed from: i  reason: collision with root package name */
    boolean f127593i;

    /* renamed from: j  reason: collision with root package name */
    int f127594j;

    /* renamed from: k  reason: collision with root package name */
    int f127595k;

    /* renamed from: l  reason: collision with root package name */
    private final String f127596l;

    /* renamed from: m  reason: collision with root package name */
    private f<T> f127597m;

    static {
        Covode.recordClassIndex(83647);
    }

    public abstract Animator a();

    public abstract void a(ViewGroup viewGroup);

    public abstract void a(String str);

    public abstract d<T> b();

    public abstract void setSearchListMarginBottom(int i2);

    public abstract void setSearchListViewVisibility(int i2);

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a getClickSrcAnimatorInfo() {
        return this.f127588d;
    }

    public final PointF getDeltaPointF() {
        return this.f127591g;
    }

    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a getEditDstAnimatorInfo() {
        return this.f127589e;
    }

    public final int getMEditState() {
        return this.f127594j;
    }

    public final f<T> getMEditingListener() {
        return this.f127597m;
    }

    public final d<T> getMInputView() {
        return this.f127587c;
    }

    public final boolean getMIsDismissing() {
        return this.f127593i;
    }

    public final boolean getMIsEditing() {
        return this.f127592h;
    }

    public final int getMKeyboardHeight() {
        return this.f127595k;
    }

    public final Animator getModifyAnimator() {
        return this.f127590f;
    }

    public Typeface getCustomTypeface() {
        return com.ss.android.ugc.aweme.editSticker.text.a.b.a().c(this.f127596l);
    }

    public final TuxTextView getMCompleteView() {
        TuxTextView tuxTextView = this.f127585a;
        if (tuxTextView == null) {
            l.a("mCompleteView");
        }
        return tuxTextView;
    }

    public final FrameLayout getMInputTextContainer() {
        FrameLayout frameLayout = this.f127586b;
        if (frameLayout == null) {
            l.a("mInputTextContainer");
        }
        return frameLayout;
    }

    public void c() {
        Editable editable;
        SocialTouchableEditText mEditTextView;
        d<T> dVar = this.f127587c;
        if (dVar == null || (mEditTextView = dVar.getMEditTextView()) == null) {
            editable = null;
        } else {
            editable = mEditTextView.getText();
        }
        a(String.valueOf(editable));
    }

    public final void d() {
        Object obj;
        this.f127594j = c.f127604a;
        if (!this.f127593i) {
            this.f127593i = true;
            d<T> dVar = this.f127587c;
            if (dVar != null) {
                String content = dVar.getContent();
                if (content == null || content.length() == 0) {
                    a((d) dVar);
                    this.f127592h = false;
                    this.f127593i = false;
                    obj = z.f158842a;
                } else {
                    Animator animator = this.f127590f;
                    if (animator != null) {
                        animator.cancel();
                    }
                    obj = a(dVar, new a(dVar, this));
                }
                if (obj != null) {
                    return;
                }
            }
            this.f127592h = false;
            this.f127593i = false;
        }
    }

    public final void e() {
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

    public final void setMEditState(int i2) {
        this.f127594j = i2;
    }

    public final void setMEditingListener(f<T> fVar) {
        this.f127597m = fVar;
    }

    public final void setMInputView(d<T> dVar) {
        this.f127587c = dVar;
    }

    public final void setMIsDismissing(boolean z) {
        this.f127593i = z;
    }

    public final void setMIsEditing(boolean z) {
        this.f127592h = z;
    }

    public final void setMKeyboardHeight(int i2) {
        this.f127595k = i2;
    }

    public final void setModifyAnimator(Animator animator) {
        this.f127590f = animator;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b$b  reason: collision with other inner class name */
    public static final class C3318b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127600a;

        static {
            Covode.recordClassIndex(83649);
        }

        C3318b(b bVar) {
            this.f127600a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127600a.setSearchListViewVisibility(0);
            this.f127600a.c();
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127601a;

        static {
            Covode.recordClassIndex(83650);
        }

        c(b bVar) {
            this.f127601a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127601a.setSearchListViewVisibility(0);
            this.f127601a.c();
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127602a;

        static {
            Covode.recordClassIndex(83651);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f127602a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f127602a.e();
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127603a;

        static {
            Covode.recordClassIndex(83652);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(b bVar) {
            this.f127603a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f127603a.e();
        }
    }

    public final void setClickSrcAnimatorInfo(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a aVar) {
        l.d(aVar, "");
        this.f127588d = aVar;
    }

    public final void setDeltaPointF(PointF pointF) {
        l.d(pointF, "");
        this.f127591g = pointF;
    }

    public final void setEditDstAnimatorInfo(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a aVar) {
        l.d(aVar, "");
        this.f127589e = aVar;
    }

    public final void setMCompleteView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f127585a = tuxTextView;
    }

    public final void setMInputTextContainer(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        this.f127586b = frameLayout;
    }

    private static void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a aVar) {
        float f2 = aVar.f127507c % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        aVar.f127507c = f2;
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f127599b;

        static {
            Covode.recordClassIndex(83648);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127599b.a((d) this.f127598a);
            this.f127599b.setMIsEditing(false);
            this.f127599b.setMIsDismissing(false);
        }

        a(d dVar, b bVar) {
            this.f127598a = dVar;
            this.f127599b = bVar;
        }
    }

    public final void a(d<T> dVar) {
        l.d(dVar, "");
        setSearchListViewVisibility(8);
        FrameLayout frameLayout = this.f127586b;
        if (frameLayout == null) {
            l.a("mInputTextContainer");
        }
        frameLayout.removeView(dVar);
        SocialTouchableEditText mEditTextView = dVar.getMEditTextView();
        mEditTextView.setMode(true);
        com.ss.android.ugc.aweme.editSticker.f.d.a((EditText) mEditTextView, false);
        d<T> dVar2 = this.f127587c;
        if (dVar2 != null) {
            dVar2.setScaleX(1.0f);
            dVar2.setScaleY(1.0f);
            dVar2.setRotation(0.0f);
            dVar2.setTranslationX(0.0f);
            dVar2.setTranslationY(0.0f);
            this.f127588d = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0);
        }
        f<T> fVar = this.f127597m;
        if (fVar != null) {
            fVar.a(dVar, false);
        }
        this.f127587c = null;
        setVisibility(4);
        e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.d(context, "");
    }

    public final void a(float f2, float f3) {
        this.f127591g.x = f2;
        this.f127591g.y = f3;
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

    private Animator a(d<T> dVar, Animator.AnimatorListener animatorListener) {
        float f2;
        l.d(dVar, "");
        Animator a2 = a();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar, "scaleX", this.f127589e.f127505a, this.f127588d.f127505a);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar, "scaleY", this.f127589e.f127506b, this.f127588d.f127506b);
        float[] fArr = new float[2];
        if (this.f127588d.f127507c > 180.0f) {
            f2 = 360.0f;
        } else {
            f2 = this.f127589e.f127507c;
        }
        fArr[0] = f2;
        fArr[1] = this.f127588d.f127507c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dVar, "rotation", fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dVar, "x", this.f127589e.f127508d, this.f127588d.f127508d);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dVar, "y", this.f127589e.f127509e, this.f127588d.f127509e);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        if (a2 != null) {
            a2.setDuration(50);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).after(a2);
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        }
        animatorSet.addListener(animatorListener);
        animatorSet.start();
        return animatorSet;
    }

    public final void a(d<T> dVar, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a aVar) {
        int i2;
        l.d(aVar, "");
        setVisibility(0);
        setSearchListViewVisibility(4);
        if (dVar != null) {
            this.f127594j = c.f127606c;
            this.f127588d = aVar;
            a(aVar);
            ViewParent parent = dVar.getParent();
            if (parent != null) {
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(dVar);
            }
            this.f127587c = dVar;
            dVar.setVisibility(4);
            FrameLayout frameLayout = this.f127586b;
            if (frameLayout == null) {
                l.a("mInputTextContainer");
            }
            frameLayout.addView(dVar, new FrameLayout.LayoutParams(-2, -2, 1));
            SocialTouchableEditText mEditTextView = dVar.getMEditTextView();
            mEditTextView.setMode(false);
            com.ss.android.ugc.aweme.editSticker.f.d.a((EditText) mEditTextView, true);
            com.ss.android.ugc.aweme.editSticker.f.d.a(mEditTextView);
            Editable text = mEditTextView.getText();
            if (text != null) {
                i2 = text.length();
            } else {
                i2 = 0;
            }
            mEditTextView.setSelection(i2);
            Object a2 = a(mEditTextView.getContext(), "input_method");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) a2).toggleSoftInput(0, 2);
            return;
        }
        this.f127594j = c.f127605b;
        d<T> b2 = b();
        b2.setVisibility(4);
        FrameLayout frameLayout2 = this.f127586b;
        if (frameLayout2 == null) {
            l.a("mInputTextContainer");
        }
        frameLayout2.addView(b2, new FrameLayout.LayoutParams(-2, -2, 1));
        this.f127587c = b2;
        SocialTouchableEditText mEditTextView2 = b2.getMEditTextView();
        if (mEditTextView2 != null) {
            mEditTextView2.setMode(false);
            com.ss.android.ugc.aweme.editSticker.f.d.a(mEditTextView2);
            Object a3 = a(mEditTextView2.getContext(), "input_method");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) a3).toggleSoftInput(0, 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f127596l = "Neon";
        this.f127588d = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0);
        this.f127589e = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a((byte) 0);
        this.f127591g = new PointF(0.0f, 0.0f);
        this.f127594j = c.f127604a;
        setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.bk));
        LayoutInflater.from(getContext()).inflate(R.layout.ahs, this);
        View findViewById = findViewById(R.id.f1m);
        l.b(findViewById, "");
        this.f127585a = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.b6i);
        l.b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f127586b = frameLayout;
        if (frameLayout == null) {
            l.a("mInputTextContainer");
        }
        a(frameLayout);
        setOnClickListener(new d(this));
        TuxTextView tuxTextView = this.f127585a;
        if (tuxTextView == null) {
            l.a("mCompleteView");
        }
        tuxTextView.setOnClickListener(new e(this));
        setVisibility(4);
    }
}
