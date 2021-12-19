package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.h;
import h.k.i;
import h.z;
import java.util.Objects;

public final class CommentAtSearchLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f72463a = {new r(CommentAtSearchLayout.class, "_isShowing", "get_isShowing()Z", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final b f72464d = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f72465b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f72466c;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f72467e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h.e f72468f;

    /* renamed from: g  reason: collision with root package name */
    private int f72469g;

    /* renamed from: h  reason: collision with root package name */
    private final h f72470h;

    /* renamed from: i  reason: collision with root package name */
    private h.f.a.b<? super Boolean, z> f72471i;

    static {
        Covode.recordClassIndex(44664);
    }

    public CommentAtSearchLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final boolean get_isShowing() {
        return ((Boolean) this.f72468f.a(this, f72463a[0])).booleanValue();
    }

    private final void set_isShowing(boolean z) {
        this.f72468f.a(f72463a[0], Boolean.valueOf(z));
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        return (ViewGroup.MarginLayoutParams) this.f72470h.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(44666);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final int getAdjustMargin() {
        return this.f72469g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getVisibilityChangeListener() {
        return this.f72471i;
    }

    static final class c extends m implements h.f.a.a<ViewGroup.MarginLayoutParams> {
        final /* synthetic */ CommentAtSearchLayout this$0;

        static {
            Covode.recordClassIndex(44667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommentAtSearchLayout commentAtSearchLayout) {
            super(0);
            this.this$0 = commentAtSearchLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup.MarginLayoutParams invoke() {
            ViewGroup.LayoutParams layoutParams = this.this$0.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return layoutParams;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f72467e.cancel();
    }

    public final void a() {
        if (!get_isShowing()) {
            set_isShowing(true);
            a(getMarginLayoutParams().bottomMargin, 0);
        }
    }

    public final void b() {
        if (get_isShowing()) {
            set_isShowing(false);
            a(getMarginLayoutParams().bottomMargin, (-getHeight()) - this.f72469g);
        }
    }

    public final void setAnimating(boolean z) {
        this.f72465b = z;
    }

    public final void setClosing(boolean z) {
        this.f72466c = z;
    }

    public final void setVisibilityChangeListener(h.f.a.b<? super Boolean, z> bVar) {
        this.f72471i = bVar;
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentAtSearchLayout f72474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f72475b;

        static {
            Covode.recordClassIndex(44668);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f72474a.setClosing(false);
            this.f72474a.setAnimating(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f72474a.setClosing(false);
            this.f72474a.setAnimating(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f72475b) {
                this.f72474a.setClosing(true);
            }
            this.f72474a.setAnimating(true);
        }

        d(CommentAtSearchLayout commentAtSearchLayout, boolean z) {
            this.f72474a = commentAtSearchLayout;
            this.f72475b = z;
        }
    }

    public final void setInitValue(int i2) {
        getMarginLayoutParams().bottomMargin = (-i2) - this.f72469g;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentAtSearchLayout f72476a;

        static {
            Covode.recordClassIndex(44669);
        }

        e(CommentAtSearchLayout commentAtSearchLayout) {
            this.f72476a = commentAtSearchLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f72476a.getMarginLayoutParams();
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
            this.f72476a.requestLayout();
        }
    }

    public final void setAdjustMargin(int i2) {
        this.f72469g = i2;
        getMarginLayoutParams().bottomMargin = (-getLayoutParams().height) - i2;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + i2);
        requestLayout();
    }

    private final void a(int i2, int i3) {
        boolean z;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f72467e.cancel();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f72467e = valueAnimator;
        valueAnimator.setIntValues(i2, i3);
        this.f72467e.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        this.f72467e.setDuration(350L);
        this.f72467e.addListener(new d(this, z));
        this.f72467e.addUpdateListener(new e(this));
        this.f72467e.start();
    }

    public static final class a extends h.h.c<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f72472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentAtSearchLayout f72473b;

        static {
            Covode.recordClassIndex(44665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, CommentAtSearchLayout commentAtSearchLayout) {
            super(obj2);
            this.f72472a = obj;
            this.f72473b = commentAtSearchLayout;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, Boolean bool, Boolean bool2) {
            l.d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            h.f.a.b<Boolean, z> visibilityChangeListener = this.f72473b.getVisibilityChangeListener();
            if (visibilityChangeListener != null) {
                visibilityChangeListener.invoke(Boolean.valueOf(booleanValue));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtSearchLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(914);
        this.f72467e = new ValueAnimator();
        this.f72468f = new a(false, false, this);
        this.f72470h = h.i.a((h.f.a.a) new c(this));
        MethodCollector.o(914);
    }
}
