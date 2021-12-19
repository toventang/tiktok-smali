package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.shortvideo.aj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class e extends n {

    /* renamed from: e  reason: collision with root package name */
    public static final a f94872e = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private static final int f94873k = ((int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 8.0f));

    /* renamed from: l  reason: collision with root package name */
    private static final aj f94874l = new aj(0.25f, 0.1f, 0.25f);

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f94875a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f94876b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f94877c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94878d;

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f94879h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.ui.masklayer2.a f94880i;

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.ui.masklayer2.f f94881j;

    public static final class a {
        static {
            Covode.recordClassIndex(60175);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60174);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void b(View view) {
        l.d(view, "");
        a(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e$e  reason: collision with other inner class name */
    static final class C2283e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94885a;

        static {
            Covode.recordClassIndex(60179);
        }

        C2283e(e eVar) {
            this.f94885a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f94885a.f94876b;
            if (viewGroup != null) {
                viewGroup.setScrollX(intValue);
            }
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94883a;

        static {
            Covode.recordClassIndex(60177);
        }

        c(e eVar) {
            this.f94883a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ViewGroup viewGroup2 = this.f94883a.f94876b;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(floatValue);
            }
            if (floatValue <= 0.0f && (viewGroup = this.f94883a.f94876b) != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94884a;

        static {
            Covode.recordClassIndex(60178);
        }

        d(e eVar) {
            this.f94884a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (this.f94884a.f94878d) {
                ViewGroup viewGroup = this.f94884a.f94877c;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f94884a.f94875a;
            if (viewGroup2 != null) {
                viewGroup2.setScrollX(intValue);
            }
        }
    }

    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94886a;

        static {
            Covode.recordClassIndex(60180);
        }

        f(e eVar) {
            this.f94886a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f94886a.f94876b;
            if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                layoutParams.height = intValue;
            }
            ViewGroup viewGroup2 = this.f94886a.f94876b;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94882a;

        static {
            Covode.recordClassIndex(60176);
        }

        b(e eVar) {
            this.f94882a = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f94882a.f94878d) {
                ViewGroup viewGroup3 = this.f94882a.f94877c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                }
                if (floatValue > 0.0f && (viewGroup2 = this.f94882a.f94877c) != null) {
                    viewGroup2.setVisibility(0);
                    return;
                }
                return;
            }
            ViewGroup viewGroup4 = this.f94882a.f94875a;
            if (viewGroup4 != null) {
                viewGroup4.setAlpha(floatValue);
            }
            if (floatValue > 0.0f && (viewGroup = this.f94882a.f94875a) != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        l.d(view, "");
        AnimatorSet animatorSet = this.f94879h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        l.b(ofFloat2, "");
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new c(this));
        int i3 = f94873k;
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, 0);
        l.b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, -i3);
        l.b(ofInt2, "");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new C2283e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f94876b;
        if (viewGroup == null) {
            l.b();
        }
        iArr[0] = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f94875a;
        if (viewGroup2 == null) {
            l.b();
        }
        iArr[1] = viewGroup2.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        l.b(ofInt3, "");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new f(this));
        ViewGroup viewGroup3 = this.f94876b;
        s sVar = null;
        if (viewGroup3 != null) {
            layoutParams = viewGroup3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i4 = marginLayoutParams.topMargin;
        ViewGroup viewGroup4 = this.f94875a;
        int[] iArr2 = new int[2];
        if (viewGroup4 != null) {
            viewGroup4.getLocationOnScreen(iArr2);
        }
        if (com.ss.android.common.util.f.c()) {
            i2 = iArr2[1] - i.b();
        } else {
            i2 = iArr2[1];
        }
        g gVar = new g(this, marginLayoutParams, i2, i4);
        gVar.setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f94879h = animatorSet2;
        animatorSet2.setInterpolator(f94874l);
        if (this.f94878d) {
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ViewGroup viewGroup5 = this.f94876b;
            if (viewGroup5 != null) {
                viewGroup5.startAnimation(gVar);
            }
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        r.a("block_videos_click_back", new com.ss.android.ugc.aweme.app.f.d().a("click_method", "button").a("enter_from", this.f94880i.f94866c).a("enter_method", "long_press").f66730a);
        com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar = this.f94881j;
        if (fVar instanceof s) {
            sVar = fVar;
        }
        s sVar2 = sVar;
        if (sVar2 != null) {
            ((ConstraintLayout) sVar2.findViewById(R.id.d1n)).setPadding(0, h.g.a.a(n.b(sVar2.getContext(), 8.0f)), 0, 0);
        }
    }

    public static final class g extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f94887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f94888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f94889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f94890d;

        static {
            Covode.recordClassIndex(60181);
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f2, Transformation transformation) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f94888b;
            int i2 = this.f94889c;
            int i3 = this.f94890d;
            marginLayoutParams.topMargin = ((int) (((float) (i2 - i3)) * f2)) + i3;
            ViewGroup viewGroup = this.f94887a.f94876b;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(this.f94888b);
            }
        }

        g(e eVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
            this.f94887a = eVar;
            this.f94888b = marginLayoutParams;
            this.f94889c = i2;
            this.f94890d = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.feed.ui.masklayer2.a aVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94880i = aVar;
        this.f94881j = fVar;
        this.f94875a = fVar.a();
        this.f94876b = fVar.b();
    }
}
