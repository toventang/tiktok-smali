package com.ss.android.ugc.aweme.story.feed.ui.progress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class StoryListProgressBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137701a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Context f137702b;

    /* renamed from: c  reason: collision with root package name */
    private int f137703c;

    /* renamed from: d  reason: collision with root package name */
    private float f137704d;

    /* renamed from: e  reason: collision with root package name */
    private float f137705e;

    /* renamed from: f  reason: collision with root package name */
    private a f137706f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f137707g;

    /* renamed from: h  reason: collision with root package name */
    private int f137708h;

    /* renamed from: i  reason: collision with root package name */
    private int f137709i;

    /* renamed from: j  reason: collision with root package name */
    private h.f.a.b<? super Boolean, z> f137710j;

    static {
        Covode.recordClassIndex(90115);
    }

    public StoryListProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90116);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCurrentPosition() {
        return this.f137703c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final h.f.a.b<Boolean, z> getOnProgressBarSelected() {
        return this.f137710j;
    }

    private boolean a() {
        if (getOrientation() == 0) {
            return true;
        }
        return false;
    }

    private void b() {
        this.f137703c = 0;
        this.f137708h = 0;
        this.f137709i = 0;
        this.f137705e = this.f137704d;
        d(0);
        removeAllViews();
    }

    public final void setOnProgressBarSelected(h.f.a.b<? super Boolean, z> bVar) {
        this.f137710j = bVar;
    }

    public final void setProgressBarConfig(a aVar) {
        this.f137706f = aVar;
    }

    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137733c;

        static {
            Covode.recordClassIndex(90125);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            int i2 = this.f137733c - 1;
            int i3 = this.f137732b;
            if (i2 >= i3) {
                while (true) {
                    View childAt = this.f137731a.getChildAt(i2);
                    if (childAt != null) {
                        this.f137731a.removeView(childAt);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            int i2 = this.f137733c - 1;
            int i3 = this.f137732b;
            if (i2 >= i3) {
                while (true) {
                    View childAt = this.f137731a.getChildAt(i2);
                    if (childAt != null) {
                        this.f137731a.removeView(childAt);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }

        j(StoryListProgressBar storyListProgressBar, int i2, int i3) {
            this.f137731a = storyListProgressBar;
            this.f137732b = i2;
            this.f137733c = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137712b;

        static {
            Covode.recordClassIndex(90117);
        }

        b(StoryListProgressBar storyListProgressBar, int i2) {
            this.f137711a = storyListProgressBar;
            this.f137712b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137712b;
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = this.f137711a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137715c;

        static {
            Covode.recordClassIndex(90118);
        }

        c(StoryListProgressBar storyListProgressBar, int i2, int i3) {
            this.f137713a = storyListProgressBar;
            this.f137714b = i2;
            this.f137715c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137715c;
            for (int i3 = this.f137714b; i3 < i2; i3++) {
                View childAt = this.f137713a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137717b;

        static {
            Covode.recordClassIndex(90119);
        }

        d(StoryListProgressBar storyListProgressBar, int i2) {
            this.f137716a = storyListProgressBar;
            this.f137717b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137717b;
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = this.f137716a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137718a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137719b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137720c;

        static {
            Covode.recordClassIndex(90120);
        }

        e(StoryListProgressBar storyListProgressBar, int i2, int i3) {
            this.f137718a = storyListProgressBar;
            this.f137719b = i2;
            this.f137720c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137720c;
            for (int i3 = this.f137719b; i3 < i2; i3++) {
                View childAt = this.f137718a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137721a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137722b;

        static {
            Covode.recordClassIndex(90121);
        }

        f(StoryListProgressBar storyListProgressBar, int i2) {
            this.f137721a = storyListProgressBar;
            this.f137722b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137722b;
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = this.f137721a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137725c;

        static {
            Covode.recordClassIndex(90122);
        }

        g(StoryListProgressBar storyListProgressBar, int i2, int i3) {
            this.f137723a = storyListProgressBar;
            this.f137724b = i2;
            this.f137725c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137725c;
            for (int i3 = this.f137724b; i3 < i2; i3++) {
                View childAt = this.f137723a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137727b;

        static {
            Covode.recordClassIndex(90123);
        }

        h(StoryListProgressBar storyListProgressBar, int i2) {
            this.f137726a = storyListProgressBar;
            this.f137727b = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137727b;
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = this.f137726a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryListProgressBar f137728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f137729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f137730c;

        static {
            Covode.recordClassIndex(90124);
        }

        i(StoryListProgressBar storyListProgressBar, int i2, int i3) {
            this.f137728a = storyListProgressBar;
            this.f137729b = i2;
            this.f137730c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i2 = this.f137730c;
            for (int i3 = this.f137729b; i3 < i2; i3++) {
                View childAt = this.f137728a.getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    private void d(int i2) {
        float f2;
        float f3;
        int childCount = getChildCount();
        if (i2 > this.f137703c) {
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof StoryProgressBar) {
                    if (i3 < i2) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    ((StoryProgressBar) childAt).a(f3, false);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            if (childAt2 instanceof StoryProgressBar) {
                if (i4 >= i2) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ((StoryProgressBar) childAt2).a(f2, false);
            }
        }
    }

    public final void a(int i2) {
        int childCount = getChildCount();
        if (childCount != i2) {
            if (childCount <= 0 || this.f137707g) {
                b();
                e(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    addView(a(i3, i2));
                }
            } else if (childCount < i2) {
                b(i2);
            } else {
                c(i2);
            }
        }
    }

    private final void e(int i2) {
        if (i2 > 0) {
            this.f137705e = this.f137704d;
            if (a()) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth > 0) {
                    this.f137709i = getMeasuredHeight();
                    float f2 = this.f137705e;
                    int i3 = (int) ((((float) measuredWidth) - (((float) (i2 - 1)) * f2)) / ((float) i2));
                    this.f137708h = i3;
                    if (((float) i3) < f2) {
                        int i4 = (measuredWidth / ((i2 * 2) - 1)) + 1;
                        this.f137708h = i4;
                        this.f137705e = (float) i4;
                        return;
                    }
                    return;
                }
                return;
            }
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight > 0) {
                this.f137708h = getMeasuredWidth();
                float f3 = this.f137705e;
                int i5 = (int) ((((float) measuredHeight) - (((float) (i2 - 1)) * f3)) / ((float) i2));
                this.f137709i = i5;
                if (((float) i5) < f3) {
                    int i6 = (measuredHeight / ((i2 * 2) - 1)) + 1;
                    this.f137709i = i6;
                    this.f137705e = (float) i6;
                }
            }
        }
    }

    private final void b(int i2) {
        View childAt;
        ValueAnimator ofFloat;
        ValueAnimator ofFloat2;
        int childCount = getChildCount();
        if (i2 > childCount && (childAt = getChildAt(childCount - 1)) != null) {
            for (int i3 = childCount; i3 < i2; i3++) {
                addView(a(i3, i2));
            }
            e(i2);
            if (a()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = (int) this.f137705e;
                int i4 = Build.VERSION.SDK_INT;
                layoutParams2.setMarginEnd((int) this.f137705e);
                childAt.setLayoutParams(layoutParams2);
                float measuredWidth = (float) childAt.getMeasuredWidth();
                float f2 = (float) this.f137708h;
                ofFloat = ObjectAnimator.ofFloat(measuredWidth, f2);
                l.b(ofFloat, "");
                ofFloat.addUpdateListener(new b(this, childCount));
                ofFloat2 = ObjectAnimator.ofFloat(0.0f, f2);
                l.b(ofFloat2, "");
                ofFloat2.addUpdateListener(new c(this, childCount, i2));
            } else {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = (int) this.f137705e;
                childAt.setLayoutParams(layoutParams4);
                float measuredHeight = (float) childAt.getMeasuredHeight();
                float f3 = (float) this.f137709i;
                ofFloat = ObjectAnimator.ofFloat(measuredHeight, f3);
                l.b(ofFloat, "");
                ofFloat.addUpdateListener(new d(this, childCount));
                ofFloat2 = ObjectAnimator.ofFloat(0.0f, f3);
                l.b(ofFloat2, "");
                ofFloat2.addUpdateListener(new e(this, childCount, i2));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    private final void c(int i2) {
        View childAt;
        ValueAnimator ofFloat;
        ValueAnimator ofFloat2;
        int childCount = getChildCount();
        if (i2 < childCount && (childAt = getChildAt(i2 - 1)) != null) {
            e(i2);
            if (a()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = 0;
                int i3 = Build.VERSION.SDK_INT;
                layoutParams2.setMarginEnd(0);
                childAt.setLayoutParams(layoutParams2);
                float measuredWidth = (float) childAt.getMeasuredWidth();
                ofFloat = ObjectAnimator.ofFloat(measuredWidth, (float) this.f137708h);
                l.b(ofFloat, "");
                ofFloat.addUpdateListener(new f(this, i2));
                ofFloat2 = ObjectAnimator.ofFloat(measuredWidth, 0.0f);
                l.b(ofFloat2, "");
                ofFloat2.addUpdateListener(new g(this, i2, childCount));
            } else {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = 0;
                childAt.setLayoutParams(layoutParams4);
                float measuredHeight = (float) childAt.getMeasuredHeight();
                float f2 = (float) this.f137709i;
                ofFloat = ObjectAnimator.ofFloat(measuredHeight, f2);
                l.b(ofFloat, "");
                ofFloat.addUpdateListener(new h(this, i2));
                ofFloat2 = ObjectAnimator.ofFloat(f2, 0.0f);
                l.b(ofFloat2, "");
                ofFloat2.addUpdateListener(new i(this, i2, childCount));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).with(ofFloat);
            animatorSet.addListener(new j(this, i2, childCount));
            animatorSet.start();
        }
    }

    private final StoryProgressBar a(int i2, int i3) {
        LinearLayout.LayoutParams layoutParams;
        Context context = this.f137702b;
        l.b(context, "");
        StoryProgressBar storyProgressBar = new StoryProgressBar(context, (byte) 0);
        if (a()) {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.width = this.f137708h;
            if (i2 < i3 - 1) {
                layoutParams.rightMargin = (int) this.f137705e;
                int i4 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd((int) this.f137705e);
            }
        } else {
            storyProgressBar.setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.height = this.f137709i;
            layoutParams.width = this.f137708h;
            if (i2 < i3 - 1) {
                layoutParams.bottomMargin = (int) this.f137705e;
            }
        }
        storyProgressBar.setLayoutParams(layoutParams);
        a aVar = this.f137706f;
        if (aVar != null) {
            storyProgressBar.setProgressBarConfig(aVar);
        }
        return storyProgressBar;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(3186);
        super.onMeasure(i2, i3);
        if (this.f137707g) {
            int childCount = getChildCount();
            e(childCount);
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.height = this.f137709i;
                        layoutParams2.width = this.f137708h;
                        if (i4 < childCount - 1) {
                            if (a()) {
                                layoutParams2.rightMargin = (int) this.f137705e;
                                int i5 = Build.VERSION.SDK_INT;
                                layoutParams2.setMarginEnd((int) this.f137705e);
                            } else {
                                layoutParams2.bottomMargin = (int) this.f137705e;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        MethodCollector.o(3186);
                        throw nullPointerException;
                    }
                }
            }
            this.f137707g = false;
        }
        MethodCollector.o(3186);
    }

    private /* synthetic */ StoryListProgressBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryListProgressBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3572);
        this.f137702b = getContext();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics());
        this.f137704d = applyDimension;
        this.f137705e = applyDimension;
        this.f137707g = true;
        MethodCollector.o(3572);
    }

    public final void a(int i2, float f2, long j2) {
        if (this.f137703c != i2) {
            d(i2);
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof StoryProgressBar) {
                    ((StoryProgressBar) childAt).a(1.0f, false);
                }
            }
            int childCount = getChildCount();
            for (int i4 = i2 + 1; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2 instanceof StoryProgressBar) {
                    ((StoryProgressBar) childAt2).a(0.0f, false);
                }
            }
            int childCount2 = getChildCount();
            if (i2 >= 0 && childCount2 > i2) {
                View childAt3 = getChildAt(i2);
                if (childAt3 instanceof StoryProgressBar) {
                    StoryProgressBar storyProgressBar = (StoryProgressBar) childAt3;
                    storyProgressBar.setAnimationInterval(j2);
                    storyProgressBar.a(f2, true);
                }
            }
        }
        this.f137703c = i2;
    }
}
