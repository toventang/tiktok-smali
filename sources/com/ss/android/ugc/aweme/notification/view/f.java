package com.ss.android.ugc.aweme.notification.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f extends com.ss.android.ugc.aweme.main.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f113959d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f113960b;

    /* renamed from: c  reason: collision with root package name */
    public final Activity f113961c;

    /* renamed from: e  reason: collision with root package name */
    private int[] f113962e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f113963f;

    /* renamed from: g  reason: collision with root package name */
    private Integer[] f113964g;

    /* renamed from: h  reason: collision with root package name */
    private TuxTextView[] f113965h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f113966i;

    /* renamed from: j  reason: collision with root package name */
    private AnimatorSet f113967j;

    static {
        Covode.recordClassIndex(73269);
    }

    private final List<Integer> b() {
        return (List) this.f113963f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final boolean d() {
        for (int i2 : this.f113962e) {
            if (i2 > 0) {
                return true;
            }
        }
        return false;
    }

    static final class k extends m implements h.f.a.a<List<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f113976a = new k();

        static {
            Covode.recordClassIndex(73280);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<Integer> invoke() {
            List c2 = n.c(3, 2, 6, 7, 99, 228);
            com.ss.android.ugc.aweme.inbox.a.a.a(c2);
            return c2;
        }
    }

    private final void c() {
        int a2;
        Iterator<T> it = b().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            int[] iArr = this.f113962e;
            if (intValue == 2) {
                a2 = com.ss.android.ugc.aweme.notice.api.b.a(2, 219);
            } else if (intValue == 6) {
                a2 = com.ss.android.ugc.aweme.notice.api.b.a(6, 14);
            } else if (intValue != 7) {
                a2 = com.ss.android.ugc.aweme.notice.api.b.a(intValue);
            } else {
                a2 = com.ss.android.ugc.aweme.notice.api.b.a(7, 12);
            }
            iArr[i2] = a2;
            int[] iArr2 = this.f113962e;
            if (iArr2[i2] > 0) {
                a(this.f113965h[i2], iArr2[i2]);
            }
            i2++;
        }
    }

    private static void f() {
        r.a("message_pop_notice_show", new com.ss.android.ugc.aweme.app.f.d().a("like_cnt", com.ss.android.ugc.aweme.notice.api.b.a(3)).a("comment_cnt", com.ss.android.ugc.aweme.notice.api.b.a(2)).a("mention_cnt", com.ss.android.ugc.aweme.notice.api.b.a(6)).a("follower_cnt", com.ss.android.ugc.aweme.notice.api.b.a(7)).a("message_cnt", com.ss.android.ugc.aweme.notice.api.b.a(99)).a("upvote_cnt", com.ss.android.ugc.aweme.notice.api.b.a(228)).f66730a);
    }

    public final void a() {
        Activity activity;
        if (this.f113967j != null && (activity = this.f113961c) != null && !activity.isFinishing() && isShowing()) {
            ViewGroup viewGroup = this.f113960b;
            if (viewGroup == null) {
                l.a("mRootView");
            }
            viewGroup.clearAnimation();
            AnimatorSet animatorSet = this.f113967j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            try {
                dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }
    }

    private final void e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l.b(ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
        ofFloat.addUpdateListener(new b(this));
        ofFloat.addListener(new c(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, -10.0f);
        l.b(ofFloat2, "");
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new d(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(-10.0f, 0.0f);
        l.b(ofFloat3, "");
        ofFloat3.setDuration(500L);
        ofFloat3.addUpdateListener(new e(this));
        ofFloat3.setStartDelay(200);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, -10.0f);
        l.b(ofFloat4, "");
        ofFloat4.setDuration(150L);
        ofFloat4.setStartDelay(5700);
        ofFloat4.addUpdateListener(new C2918f(this));
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-10.0f, 0.0f);
        l.b(ofFloat5, "");
        ofFloat5.setDuration(300L);
        ofFloat5.setStartDelay(5850);
        ofFloat5.addUpdateListener(new g(this));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(1.0f, 0.0f);
        l.b(ofFloat6, "");
        ofFloat6.setDuration(300L);
        ofFloat6.setStartDelay(5850);
        ofFloat6.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
        ofFloat6.addUpdateListener(new h(this));
        ofFloat6.addListener(new i(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f113967j = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        AnimatorSet animatorSet2 = this.f113967j;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113969a;

        static {
            Covode.recordClassIndex(73272);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f113969a = fVar;
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            f.a(this.f113969a).setVisibility(0);
        }
    }

    public static final class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113975a;

        static {
            Covode.recordClassIndex(73278);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(f fVar) {
            this.f113975a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            this.f113975a.a();
        }
    }

    public static final /* synthetic */ ViewGroup a(f fVar) {
        ViewGroup viewGroup = fVar.f113960b;
        if (viewGroup == null) {
            l.a("mRootView");
        }
        return viewGroup;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113970a;

        static {
            Covode.recordClassIndex(73273);
        }

        d(f fVar) {
            this.f113970a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113970a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113971a;

        static {
            Covode.recordClassIndex(73274);
        }

        e(f fVar) {
            this.f113971a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113971a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$f  reason: collision with other inner class name */
    public static final class C2918f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113972a;

        static {
            Covode.recordClassIndex(73275);
        }

        C2918f(f fVar) {
            this.f113972a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113972a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113973a;

        static {
            Covode.recordClassIndex(73276);
        }

        g(f fVar) {
            this.f113973a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113973a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113968a;

        static {
            Covode.recordClassIndex(73271);
        }

        b(f fVar) {
            this.f113968a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113968a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setScaleX(((Float) animatedValue).floatValue());
            ViewGroup a3 = f.a(this.f113968a);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            a3.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f113974a;

        static {
            Covode.recordClassIndex(73277);
        }

        h(f fVar) {
            this.f113974a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a2 = f.a(this.f113974a);
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a2.setScaleX(((Float) animatedValue).floatValue());
            ViewGroup a3 = f.a(this.f113974a);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            a3.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    private final void a(int i2) {
        ImageView imageView = this.f113966i;
        if (imageView == null) {
            l.a("mIvArrow");
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i2;
        ImageView imageView2 = this.f113966i;
        if (imageView2 == null) {
            l.a("mIvArrow");
        }
        imageView2.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $iconRes;

        static {
            Covode.recordClassIndex(73279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(int i2) {
            super(1);
            this.$iconRes = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$iconRes;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f44753e = Integer.valueOf((int) R.attr.aa);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.tux.input.TuxTextView[] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void b(View view) {
        Integer[] numArr = this.f113964g;
        int length = numArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int intValue = numArr[i2].intValue();
            this.f113965h[i2] = view.findViewById(intValue);
            if (intValue == R.id.cpg) {
                TuxTextView tuxTextView = this.f113965h[i2];
                if (!(tuxTextView instanceof TuxCompoundIconTextView)) {
                    tuxTextView = null;
                }
                TuxCompoundIconTextView tuxCompoundIconTextView = (TuxCompoundIconTextView) tuxTextView;
                if (tuxCompoundIconTextView != null) {
                    com.bytedance.tux.c.b a2 = com.bytedance.tux.c.c.a(new j(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.raw.icon_raising_star), Integer.valueOf((int) R.raw.icon_repost))).intValue())).a(this.f113961c);
                    if (gb.a()) {
                        tuxCompoundIconTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
                    } else {
                        tuxCompoundIconTextView.setCompoundDrawablesWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
        }
        View findViewById = view.findViewById(R.id.cpa);
        l.b(findViewById, "");
        this.f113960b = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.cp_);
        l.b(findViewById2, "");
        this.f113966i = (ImageView) findViewById2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Activity activity) {
        super(activity);
        l.d(activity, "");
        this.f113961c = activity;
        int[] iArr = new int[6];
        int i2 = 0;
        do {
            iArr[i2] = 0;
            i2++;
        } while (i2 < 6);
        this.f113962e = iArr;
        this.f113963f = h.i.a((h.f.a.a) k.f113976a);
        this.f113964g = new Integer[]{Integer.valueOf((int) R.id.cpe), Integer.valueOf((int) R.id.cpc), Integer.valueOf((int) R.id.cpb), Integer.valueOf((int) R.id.cpd), Integer.valueOf((int) R.id.cpf), Integer.valueOf((int) R.id.cpg)};
        this.f113965h = new TuxTextView[6];
        View a2 = com.a.b.c.a(this.f113961c, (int) R.layout.le);
        l.b(a2, "");
        setContentView(a2);
        setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this.f113961c, R.color.c9)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
        b(a2);
    }

    private final void c(View view) {
        boolean a2 = gb.a(this.f113961c);
        ViewGroup viewGroup = this.f113960b;
        if (viewGroup == null) {
            l.a("mRootView");
        }
        int measuredWidth = viewGroup.getMeasuredWidth();
        ViewGroup viewGroup2 = this.f113960b;
        if (viewGroup2 == null) {
            l.a("mRootView");
        }
        int measuredHeight = viewGroup2.getMeasuredHeight();
        int a3 = com.bytedance.common.utility.n.a(this.f113961c);
        ImageView imageView = this.f113966i;
        if (imageView == null) {
            l.a("mIvArrow");
        }
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredWidth3 = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f2 = (float) measuredWidth;
        float f3 = f2 / 2.0f;
        float f4 = ((float) iArr[0]) + (((float) measuredWidth3) / 2.0f);
        if (!a2) {
            float f5 = (float) a3;
            if (((float) (measuredWidth / 2)) + f4 >= f5) {
                f3 = f2 - (f5 - f4);
            }
        } else if (f4 - ((float) (measuredWidth / 2)) <= 0.0f) {
            f3 = f4;
        }
        a((int) (f3 - (((float) measuredWidth2) / 2.0f)));
        update((int) (f4 - f3), (int) ((((float) iArr[1]) - ((float) view.getHeight())) - com.bytedance.common.utility.n.b(this.f113961c, 8.0f)), measuredWidth, measuredHeight);
        ViewGroup viewGroup3 = this.f113960b;
        if (viewGroup3 == null) {
            l.a("mRootView");
        }
        viewGroup3.setPivotX(f3);
        ViewGroup viewGroup4 = this.f113960b;
        if (viewGroup4 == null) {
            l.a("mRootView");
        }
        viewGroup4.setPivotY((float) measuredHeight);
    }

    public final boolean a(View view) {
        l.d(view, "");
        c();
        if (!d()) {
            dismiss();
            Runnable runnable = this.f109176a;
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        if (this.f113961c != null && !isShowing() && !this.f113961c.isFinishing()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 51, iArr[0], iArr[1] - view.getHeight());
            ViewGroup viewGroup = this.f113960b;
            if (viewGroup == null) {
                l.a("mRootView");
            }
            viewGroup.measure(0, 0);
            c(view);
            f();
            com.ss.android.ugc.aweme.inbox.d.d.f104104b = SystemClock.uptimeMillis();
        }
        e();
        return true;
    }

    private static void a(TuxTextView tuxTextView, int i2) {
        if (i2 <= 0) {
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) i2));
        }
    }
}
