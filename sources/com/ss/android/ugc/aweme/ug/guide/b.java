package com.ss.android.ugc.aweme.ug.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import h.f.b.l;
import java.util.Objects;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f141884d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final a f141885e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f141886a;

    /* renamed from: b  reason: collision with root package name */
    public int f141887b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.common.widget.c f141888c;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f141889f;

    /* renamed from: g  reason: collision with root package name */
    private final LoadMoreFrameLayout f141890g;

    public static final class a {
        static {
            Covode.recordClassIndex(92718);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92717);
    }

    public final void a() {
        f141884d = false;
        PagerAdapter adapter = this.f141888c.getAdapter();
        l.b(adapter, "");
        if (adapter.getCount() - 1 == this.f141888c.getCurrentItem()) {
            this.f141890g.g();
            return;
        }
        ValueAnimator valueAnimator = this.f141889f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            View childAt = this.f141888c.getChildAt(0);
            l.b(childAt, "");
            this.f141886a = (((float) childAt.getHeight()) * -1.0f) / 100.0f;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
            this.f141889f = ofInt;
            if (ofInt != null) {
                ofInt.addUpdateListener(new C3777b(this));
            }
            ValueAnimator valueAnimator2 = this.f141889f;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new c(this));
            }
            ValueAnimator valueAnimator3 = this.f141889f;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141892a;

        static {
            Covode.recordClassIndex(92720);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f141892a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f141892a.f141888c.c();
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f141892a.f141888c.b()) {
                this.f141892a.f141888c.d();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f141892a.f141888c.b()) {
                this.f141892a.f141888c.d();
            }
            this.f141892a.f141887b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$b  reason: collision with other inner class name */
    public static final class C3777b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141891a;

        static {
            Covode.recordClassIndex(92719);
        }

        C3777b(b bVar) {
            this.f141891a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f141891a.f141888c.b()) {
                com.ss.android.ugc.aweme.common.widget.c cVar = this.f141891a.f141888c;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                cVar.a(((float) (((Integer) animatedValue).intValue() - this.f141891a.f141887b)) * this.f141891a.f141886a);
            }
            b bVar = this.f141891a;
            l.b(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            bVar.f141887b = ((Integer) animatedValue2).intValue();
        }
    }

    public b(com.ss.android.ugc.aweme.common.widget.c cVar, LoadMoreFrameLayout loadMoreFrameLayout) {
        l.d(cVar, "");
        l.d(loadMoreFrameLayout, "");
        this.f141888c = cVar;
        this.f141890g = loadMoreFrameLayout;
    }
}
