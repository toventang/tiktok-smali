package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.k;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.shortvideo.aj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class o extends n {

    /* renamed from: h  reason: collision with root package name */
    public static final a f94903h = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private static final int f94904k = ((int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 8.0f));

    /* renamed from: l  reason: collision with root package name */
    private static final aj f94905l = new aj(0.25f, 0.1f, 0.25f);

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f94906a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f94907b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f94908c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94909d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.ui.masklayer2.a f94910e;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.ui.masklayer2.f f94911i;

    /* renamed from: j  reason: collision with root package name */
    private AnimatorSet f94912j;

    public static final class a {
        static {
            Covode.recordClassIndex(60195);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60194);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void b(View view) {
        l.d(view, "");
        a(view);
    }

    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94916a;

        static {
            Covode.recordClassIndex(60199);
        }

        e(o oVar) {
            this.f94916a = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f94916a.f94907b;
            if (viewGroup != null) {
                viewGroup.setScrollX(intValue);
            }
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94914a;

        static {
            Covode.recordClassIndex(60197);
        }

        c(o oVar) {
            this.f94914a = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ViewGroup viewGroup2 = this.f94914a.f94907b;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(floatValue);
            }
            if (floatValue > 0.0f && (viewGroup = this.f94914a.f94907b) != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94917a;

        static {
            Covode.recordClassIndex(60200);
        }

        f(o oVar) {
            this.f94917a = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f94917a.f94907b;
            if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                layoutParams.height = intValue;
            }
            ViewGroup viewGroup2 = this.f94917a.f94907b;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94913a;

        static {
            Covode.recordClassIndex(60196);
        }

        b(o oVar) {
            this.f94913a = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f94913a.f94909d) {
                ViewGroup viewGroup = this.f94913a.f94908c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
            } else {
                ViewGroup viewGroup2 = this.f94913a.f94906a;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
            }
            if (floatValue > 0.0f) {
                return;
            }
            if (this.f94913a.f94909d) {
                ViewGroup viewGroup3 = this.f94913a.f94908c;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            }
            ViewGroup viewGroup4 = this.f94913a.f94906a;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(4);
            }
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94915a;

        static {
            Covode.recordClassIndex(60198);
        }

        d(o oVar) {
            this.f94915a = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (this.f94915a.f94909d) {
                ViewGroup viewGroup3 = this.f94915a.f94908c;
                if (viewGroup3 != null) {
                    viewGroup3.setScrollX(intValue);
                }
                ViewGroup viewGroup4 = this.f94915a.f94908c;
                if (viewGroup4 != null && viewGroup4.getScrollX() == intValue && (viewGroup2 = this.f94915a.f94908c) != null) {
                    viewGroup2.setVisibility(8);
                    return;
                }
                return;
            }
            ViewGroup viewGroup5 = this.f94915a.f94906a;
            if (viewGroup5 != null) {
                viewGroup5.setScrollX(intValue);
            }
            ViewGroup viewGroup6 = this.f94915a.f94906a;
            if (viewGroup6 != null && viewGroup6.getScrollX() == intValue && (viewGroup = this.f94915a.f94906a) != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.i(8432);
        l.d(view, "");
        ViewGroup viewGroup = this.f94907b;
        Dialog dialog = null;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar = this.f94911i;
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f fVar2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f(fVar != null ? fVar.getContext() : null);
            k kVar = new k(new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.e(0, 0), this.f94910e.a(this.f94911i));
            l.d(kVar, "");
            f fVar3 = kVar.f94935b;
            if (fVar3 != null) {
                fVar2.f94960g = (e) fVar3;
                ViewGroup viewGroup2 = this.f94907b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(fVar2);
                }
                int i2 = 0;
                for (com.ss.android.ugc.aweme.feed.ui.masklayer2.e eVar : this.f94910e.c(this.f94911i)) {
                    com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar4 = this.f94911i;
                    com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b bVar = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b(fVar4 != null ? fVar4.getContext() : null);
                    if (i2 == 0) {
                        bVar.a(eVar.f94930a, eVar.f94931b, true);
                    } else {
                        bVar.a(eVar.f94930a, eVar.f94931b, false);
                    }
                    ViewGroup viewGroup3 = this.f94907b;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(bVar);
                    }
                    i2++;
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.BackPrimaryAction");
                MethodCollector.o(8432);
                throw nullPointerException;
            }
        }
        ViewGroup viewGroup4 = this.f94907b;
        if (viewGroup4 != null) {
            viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(viewGroup4.getWidth(), Integer.MIN_VALUE), 0);
        }
        AnimatorSet animatorSet = this.f94912j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        l.b(ofFloat2, "");
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new c(this));
        int i3 = f94904k;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i3);
        l.b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(-i3, 0);
        l.b(ofInt2, "");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup5 = this.f94906a;
        if (viewGroup5 == null) {
            l.b();
        }
        iArr[0] = viewGroup5.getMeasuredHeight();
        ViewGroup viewGroup6 = this.f94907b;
        if (viewGroup6 == null) {
            l.b();
        }
        iArr[1] = viewGroup6.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        l.b(ofInt3, "");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new f(this));
        int a2 = i.a(com.bytedance.ies.ugc.appcontext.d.a());
        ViewGroup viewGroup7 = this.f94907b;
        if (viewGroup7 == null || (layoutParams = viewGroup7.getLayoutParams()) == null) {
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            MethodCollector.o(8432);
            throw nullPointerException2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i4 = marginLayoutParams.topMargin;
        ViewGroup viewGroup8 = this.f94907b;
        if (viewGroup8 == null) {
            l.b();
        }
        g gVar = new g(this, marginLayoutParams, (a2 - viewGroup8.getMeasuredHeight()) / 2, i4);
        gVar.setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f94912j = animatorSet2;
        animatorSet2.setInterpolator(f94905l);
        if (this.f94909d) {
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ViewGroup viewGroup9 = this.f94907b;
            if (viewGroup9 != null) {
                viewGroup9.startAnimation(gVar);
            }
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f94910e.f94866c);
        Aweme aweme = this.f94910e.f94865b;
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", aweme != null ? aweme.getAid() : null);
        Aweme aweme2 = this.f94910e.f94865b;
        r.a("click_block_videos", a4.a("author_id", aweme2 != null ? aweme2.getAuthorUid() : null).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f94910e.f94865b))).a("enter_method", "long_press").f66730a);
        com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar5 = this.f94911i;
        if (fVar5 instanceof s) {
            dialog = fVar5;
        }
        Dialog dialog2 = dialog;
        if (dialog2 != null) {
            ((ConstraintLayout) dialog2.findViewById(R.id.d1n)).setPadding(0, 0, 0, 0);
            MethodCollector.o(8432);
            return;
        }
        MethodCollector.o(8432);
    }

    public static final class g extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f94918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f94919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f94920c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f94921d;

        static {
            Covode.recordClassIndex(60201);
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f2, Transformation transformation) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f94919b;
            int i2 = this.f94920c;
            int i3 = this.f94921d;
            marginLayoutParams.topMargin = ((int) (((float) (i2 - i3)) * f2)) + i3;
            ViewGroup viewGroup = this.f94918a.f94907b;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(this.f94919b);
            }
        }

        g(o oVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
            this.f94918a = oVar;
            this.f94919b = marginLayoutParams;
            this.f94920c = i2;
            this.f94921d = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(com.ss.android.ugc.aweme.feed.ui.masklayer2.a aVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar) {
        super(aVar, fVar);
        ViewGroup viewGroup;
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94910e = aVar;
        this.f94911i = fVar;
        ViewGroup viewGroup2 = null;
        if (fVar != null) {
            viewGroup = fVar.a();
        } else {
            viewGroup = null;
        }
        this.f94906a = viewGroup;
        this.f94907b = fVar != null ? fVar.b() : viewGroup2;
    }
}
