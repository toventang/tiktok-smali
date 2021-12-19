package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;
import java.util.ArrayList;
import java.util.Objects;

public final class AdHalfWebPageContainer extends l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f75830e = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f75831h = AdHalfWebPageContainer.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public boolean f75832a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f75833b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f75834c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f75835d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f75836f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f75837g;

    public AdHalfWebPageContainer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final View getDecorView() {
        return (View) this.f75837g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46765);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75838a;

        static {
            Covode.recordClassIndex(46766);
        }

        b(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75838a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75838a.f75832a = true;
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75841a;

        static {
            Covode.recordClassIndex(46769);
        }

        e(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75841a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75841a.f75832a = true;
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75842a;

        static {
            Covode.recordClassIndex(46770);
        }

        f(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75842a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75842a.f75832a = false;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75844a;

        static {
            Covode.recordClassIndex(46772);
        }

        h(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75844a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75844a.f75832a = true;
        }
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75846a;

        static {
            Covode.recordClassIndex(46774);
        }

        j(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75846a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75846a.f75832a = true;
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75848a;

        static {
            Covode.recordClassIndex(46776);
        }

        l(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75848a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75848a.f75832a = true;
        }
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75849a;

        static {
            Covode.recordClassIndex(46777);
        }

        m(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75849a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75849a.f75832a = false;
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75850a;

        static {
            Covode.recordClassIndex(46778);
        }

        n(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75850a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75850a.f75832a = true;
        }
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75851a;

        static {
            Covode.recordClassIndex(46779);
        }

        o(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75851a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75851a.f75832a = false;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f75840b;

        static {
            Covode.recordClassIndex(46767);
        }

        c(AdHalfWebPageContainer adHalfWebPageContainer, Runnable runnable) {
            this.f75839a = adHalfWebPageContainer;
            this.f75840b = runnable;
        }

        public final void run() {
            this.f75839a.f75832a = false;
            Runnable runnable = this.f75840b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75845a;

        static {
            Covode.recordClassIndex(46773);
        }

        i(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75845a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75845a.f75832a = false;
            this.f75845a.d();
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75847a;

        static {
            Covode.recordClassIndex(46775);
        }

        k(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75847a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f75847a.f75832a = false;
            this.f75847a.d();
        }
    }

    public final void c() {
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
    }

    public final void d() {
        setAlpha(0.0f);
        setVisibility(8);
        c();
    }

    public final void e() {
        setAlpha(1.0f);
        g();
    }

    public final boolean getCanCollapse() {
        if (!this.f75834c || this.f75835d) {
            return false;
        }
        return true;
    }

    public final boolean getCanExpand() {
        if (!this.f75834c || this.f75835d) {
            return true;
        }
        return false;
    }

    static final class d extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(46768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            Window window;
            Context context = this.$context;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return window.getDecorView();
        }
    }

    static {
        Covode.recordClassIndex(46764);
    }

    private void g() {
        if (this.f75836f && Build.VERSION.SDK_INT >= 21) {
            setZ(0.0f);
        }
        setVisibility(0);
    }

    private final int getScreenHeight() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getHeight();
        }
        return com.ss.android.ugc.aweme.base.utils.i.a(getContext());
    }

    private final int getScreenWidth() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getWidth();
        }
        return com.ss.android.ugc.aweme.base.utils.i.b(getContext());
    }

    public final boolean a() {
        if (getVisibility() == 0 && getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (!this.f75836f || Build.VERSION.SDK_INT < 21) {
            setVisibility(4);
            return;
        }
        setZ(-1.0f);
        setVisibility(0);
    }

    public final void f() {
        setTranslationX((((float) (getScreenWidth() - getWidth())) / 2.0f) - ((float) getLeft()));
    }

    private final float getToTransX() {
        int i2;
        if (gb.a(getContext())) {
            int width = getWidth();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = width + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            int width2 = getWidth();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = -(width2 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
        }
        return (float) i2;
    }

    public final void setCollapsed(boolean z) {
        this.f75835d = z;
    }

    public final void setExpanded(boolean z) {
        this.f75834c = z;
    }

    public final void setUseZOrder(boolean z) {
        this.f75836f = z;
    }

    public static final class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageContainer f75843a;

        static {
            Covode.recordClassIndex(46771);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f75843a = adHalfWebPageContainer;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f75843a.f75832a = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f75843a.f75832a = true;
        }
    }

    public final void setInCleanMode(boolean z) {
        int i2;
        this.f75833b = z;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void a(Runnable runnable) {
        this.f75835d = true;
        animate().translationY((float) (getScreenHeight() - getTop())).withStartAction(new b(this)).withEndAction(new c(this, runnable)).setDuration(400).start();
    }

    public final void b(boolean z) {
        if (z) {
            animate().alpha(0.0f).translationY((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d)).withStartAction(new h(this)).setDuration(290).withEndAction(new i(this)).start();
        } else {
            animate().alpha(0.0f).translationX(getToTransX()).withStartAction(new j(this)).setDuration(200).withEndAction(new k(this)).start();
        }
    }

    public final void a(boolean z) {
        if (!this.f75833b) {
            g();
        }
        if (z) {
            setTranslationX(0.0f);
            setTranslationY((float) com.ss.android.ugc.aweme.base.utils.n.a(15.0d));
            animate().alpha(1.0f).translationY(0.0f).withStartAction(new l(this)).setInterpolator(new LinearInterpolator()).setDuration(290).withEndAction(new m(this)).start();
            return;
        }
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
        animate().alpha(1.0f).translationX(0.0f).withStartAction(new n(this)).setDuration(200).withEndAction(new o(this)).start();
    }

    public final void b(int i2, int i3) {
        a(i2, i3, 0);
    }

    public final void a(int i2, int i3) {
        this.f75834c = true;
        this.f75835d = false;
        a(i2, i3, 100);
        float screenWidth = (((((float) (getScreenWidth() - i2)) / 2.0f) - ((float) getLeft())) + ((float) i2)) - ((float) getWidth());
        animate().translationX(screenWidth).translationY((((((float) (getScreenHeight() - i3)) / 2.0f) - ((float) getTop())) + ((float) i3)) - ((float) getHeight())).withStartAction(new e(this)).withEndAction(new f(this)).setDuration(100).start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdHalfWebPageContainer(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        setAlpha(0.0f);
        setRadius(com.ss.android.ugc.aweme.base.utils.n.a(4.0d));
        this.f75837g = h.i.a((h.f.a.a) new d(context));
    }

    private void a(int i2, int i3, long j2) {
        ViewWrapper viewWrapper = new ViewWrapper(this);
        if (j2 == 0) {
            if (i2 > 0 && viewWrapper.getWidth() != i2) {
                viewWrapper.setWidth(i2);
            }
            if (i3 > 0 && viewWrapper.getHeight() != i3) {
                viewWrapper.setHeight(i3);
            }
        } else if (j2 > 0) {
            ArrayList arrayList = new ArrayList();
            if (i2 > 0 && viewWrapper.getWidth() != i2) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", viewWrapper.getWidth(), i2);
                h.f.b.l.b(ofInt, "");
                arrayList.add(ofInt);
            }
            if (i3 > 0 && viewWrapper.getHeight() != i3) {
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", viewWrapper.getHeight(), i3);
                h.f.b.l.b(ofInt2, "");
                arrayList.add(ofInt2);
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(j2);
                animatorSet.addListener(new g(this));
                animatorSet.start();
            }
        }
    }
}
