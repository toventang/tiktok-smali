package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.Objects;

public final class ScaleGestureLayout extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b implements c {
    public static final a E = new a((byte) 0);
    public final androidx.g.a.a.b A;
    public f B;
    int C;
    int D;
    private Runnable F;
    private final com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.d G;
    private final g H;
    private final a I;

    /* renamed from: m  reason: collision with root package name */
    public Matrix f129295m;
    RectF n;
    public Rect o;
    public boolean p;
    public final OverScroller q;
    public boolean r;
    boolean s;
    Animator t;
    Animator u;
    public AnimatorSet v;
    float w;
    float x;
    public float y;
    float z;

    static {
        Covode.recordClassIndex(84872);
    }

    public ScaleGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84874);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
    public final boolean a(Canvas canvas, View view, long j2) {
        l.d(canvas, "");
        l.d(view, "");
        canvas.save();
        canvas.concat(this.f129295m);
        boolean a2 = super.a(canvas, view, j2);
        canvas.restore();
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final RectF getCurrentDisplayRectF() {
        RectF rectF = new RectF(this.n);
        this.f129295m.mapRect(rectF);
        return rectF;
    }

    public final void b() {
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 1.0f;
        this.z = 1.0f;
        this.r = false;
        this.s = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public final void computeScroll() {
        if (this.q.computeScrollOffset()) {
            int i2 = this.C;
            int i3 = this.D;
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            this.C = currX;
            this.D = currY;
            a((float) (currX - i2), (float) (currY - i3));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a() {
        this.f129295m.reset();
        this.t = null;
        this.v = null;
        this.u = null;
        b();
        invalidate();
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Rect f129298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f129299c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g f129300d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a f129301e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int[] f129302f = null;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f129303g = 0.0f;

        static {
            Covode.recordClassIndex(84875);
        }

        b(ScaleGestureLayout scaleGestureLayout, Rect rect, Rect rect2, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g gVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar, int[] iArr, float f2) {
            this.f129297a = scaleGestureLayout;
            this.f129298b = rect;
            this.f129299c = rect2;
            this.f129300d = gVar;
            this.f129301e = aVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            boolean z3;
            Rect rect;
            Rect rect2 = this.f129297a.o;
            if (rect2 != null) {
                z = rect2.isEmpty();
            } else {
                z = true;
            }
            Rect rect3 = this.f129298b;
            if (rect3 != null) {
                z2 = rect3.isEmpty();
            } else {
                z2 = true;
            }
            Rect rect4 = this.f129299c;
            if (rect4 != null) {
                z3 = rect4.isEmpty();
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this));
                this.f129297a.v = new AnimatorSet();
                AnimatorSet animatorSet = this.f129297a.v;
                if (animatorSet != null) {
                    animatorSet.addListener(new c(this, ofFloat));
                    animatorSet.playTogether(ofFloat);
                    animatorSet.setInterpolator(this.f129297a.A);
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                    return;
                }
                return;
            }
            Rect rect5 = this.f129298b;
            if (rect5 != null && (rect = this.f129299c) != null) {
                int[] iArr = new int[2];
                this.f129297a.getLocationOnScreen(iArr);
                rect5.offset(-iArr[0], -iArr[1]);
                rect.offset(-iArr[0], -iArr[1]);
                AnimatorSet a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a.a(new Matrix(com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a.a(this.f129298b, this.f129297a.getWidth(), this.f129297a.getHeight(), this.f129297a.o, this.f129300d)), new Matrix(), this.f129297a.o, this.f129301e, new e(this));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new C3366b(this));
                ofFloat2.setDuration(this.f129301e.f129254i);
                ofFloat2.setInterpolator(this.f129301e.f129249d);
                Rect rect6 = new Rect(this.f129298b);
                int[] iArr2 = this.f129302f;
                if (iArr2 != null) {
                    if (iArr2.length == 4) {
                        rect6.left += iArr2[0];
                        rect6.top += iArr2[1];
                        rect6.right -= iArr2[2];
                        rect6.bottom -= iArr2[3];
                    } else {
                        throw new IllegalArgumentException("maskInsetPixel length must equal 4".toString());
                    }
                }
                Animator a3 = this.f129297a.a(rect6, this.f129299c, this.f129303g, false);
                a3.setDuration(this.f129301e.f129253h);
                a3.setInterpolator(this.f129301e.f129248c);
                this.f129297a.v = new AnimatorSet();
                AnimatorSet animatorSet2 = this.f129297a.v;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new d(this, a2, a3, ofFloat2));
                    animatorSet2.playTogether(a2, a3, ofFloat2);
                    animatorSet2.setInterpolator(this.f129297a.A);
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }

        public static final class c extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129306a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ValueAnimator f129307b;

            static {
                Covode.recordClassIndex(84878);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f129306a.f129297a.v = null;
            }

            c(b bVar, ValueAnimator valueAnimator) {
                this.f129306a = bVar;
                this.f129307b = valueAnimator;
            }
        }

        static final class e extends m implements h.f.a.b<Matrix, z> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(84880);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Matrix matrix) {
                Matrix matrix2 = matrix;
                l.d(matrix2, "");
                this.this$0.f129297a.f129295m = matrix2;
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$b  reason: collision with other inner class name */
        static final class C3366b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129305a;

            static {
                Covode.recordClassIndex(84877);
            }

            C3366b(b bVar) {
                this.f129305a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar;
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (fVar = this.f129305a.f129297a.B) != null) {
                    fVar.a(((Number) animatedValue).floatValue());
                }
            }
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129304a;

            static {
                Covode.recordClassIndex(84876);
            }

            a(b bVar) {
                this.f129304a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    f fVar = this.f129304a.f129297a.B;
                    if (fVar != null) {
                        fVar.a(((Number) animatedValue).floatValue());
                    }
                    this.f129304a.f129297a.setAlpha(((Number) animatedValue).floatValue());
                }
            }
        }

        public static final class d extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f129308a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnimatorSet f129309b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Animator f129310c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ValueAnimator f129311d;

            static {
                Covode.recordClassIndex(84879);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                super.onAnimationEnd(animator);
                this.f129308a.f129297a.b();
                this.f129308a.f129297a.f129295m.reset();
                v.c(this.f129308a.f129297a);
                this.f129308a.f129297a.v = null;
            }

            d(b bVar, AnimatorSet animatorSet, Animator animator, ValueAnimator valueAnimator) {
                this.f129308a = bVar;
                this.f129309b = animatorSet;
                this.f129310c = animator;
                this.f129311d = valueAnimator;
            }
        }
    }

    public static final class g implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129321a;

        static {
            Covode.recordClassIndex(84885);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final void d(MotionEvent motionEvent) {
            l.d(motionEvent, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ScaleGestureLayout scaleGestureLayout) {
            this.f129321a = scaleGestureLayout;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean a(MotionEvent motionEvent) {
            l.d(motionEvent, "");
            f fVar = this.f129321a.B;
            if (fVar == null) {
                return true;
            }
            fVar.a();
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean a(e eVar) {
            l.d(eVar, "");
            boolean z = false;
            this.f129321a.getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f129321a.y >= 1.0f) {
                z = true;
                f fVar = this.f129321a.B;
                if (fVar != null) {
                    fVar.c();
                }
            }
            return z;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final void a(com.ss.android.ugc.tools.utils.a.b bVar) {
            l.d(bVar, "");
            if (this.f129321a.p) {
                this.f129321a.p = false;
                return;
            }
            ScaleGestureLayout scaleGestureLayout = this.f129321a;
            if (scaleGestureLayout.y > 1.0f) {
                return;
            }
            if (scaleGestureLayout.x <= 0.0f || Math.abs(scaleGestureLayout.x) <= ((float) scaleGestureLayout.getHeight()) * 0.2f) {
                Animator animator = scaleGestureLayout.u;
                if (animator == null || !animator.isRunning()) {
                    Animator a2 = scaleGestureLayout.a(new Matrix(scaleGestureLayout.f129295m), new Matrix());
                    a2.addListener(new j(scaleGestureLayout));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a2, scaleGestureLayout.a(1.0f));
                    animatorSet.start();
                    scaleGestureLayout.u = animatorSet;
                    return;
                }
                return;
            }
            f fVar = scaleGestureLayout.B;
            if (fVar != null) {
                fVar.b();
            }
            scaleGestureLayout.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean c(MotionEvent motionEvent) {
            ViewParent parent;
            l.d(motionEvent, "");
            if (motionEvent.getPointerCount() > 2) {
                this.f129321a.getParent().requestDisallowInterceptTouchEvent(true);
            }
            AnimatorSet animatorSet = this.f129321a.v;
            if (animatorSet != null && animatorSet.isRunning()) {
                return false;
            }
            if (this.f129321a.y > 1.0f && (parent = this.f129321a.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f129321a.q.forceFinished(true);
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final void b(e eVar) {
            p<Float, Float> a2;
            l.d(eVar, "");
            this.f129321a.p = true;
            f fVar = this.f129321a.B;
            if (fVar != null) {
                fVar.d();
            }
            ScaleGestureLayout scaleGestureLayout = this.f129321a;
            if (scaleGestureLayout.y >= 1.0f) {
                Animator animator = scaleGestureLayout.t;
                if (animator == null || !animator.isRunning()) {
                    Animator animator2 = scaleGestureLayout.u;
                    if ((animator2 == null || !animator2.isRunning()) && scaleGestureLayout.q.isFinished() && (a2 = scaleGestureLayout.a(scaleGestureLayout.getCurrentDisplayRectF())) != null) {
                        Matrix matrix = new Matrix(scaleGestureLayout.f129295m);
                        matrix.postTranslate(a2.getFirst().floatValue(), a2.getSecond().floatValue());
                        Animator a3 = scaleGestureLayout.a(new Matrix(scaleGestureLayout.f129295m), matrix);
                        a3.start();
                        scaleGestureLayout.t = a3;
                        return;
                    }
                    return;
                }
                return;
            }
            Animator animator3 = scaleGestureLayout.u;
            if (animator3 == null || !animator3.isRunning()) {
                Animator a4 = scaleGestureLayout.a(scaleGestureLayout.f129295m, new Matrix());
                a4.addListener(new k(scaleGestureLayout));
                a4.start();
                scaleGestureLayout.u = a4;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean c(e eVar) {
            float min;
            l.d(eVar, "");
            if (eVar.f129358l == -1.0f) {
                if (eVar.f129356j == -1.0f) {
                    float f2 = eVar.f129354h;
                    float f3 = eVar.f129355i;
                    eVar.f129356j = (float) Math.sqrt((double) ((f2 * f2) + (f3 * f3)));
                }
                float f4 = eVar.f129356j;
                if (eVar.f129357k == -1.0f) {
                    float f5 = eVar.f129352f;
                    float f6 = eVar.f129353g;
                    eVar.f129357k = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
                }
                eVar.f129358l = f4 / eVar.f129357k;
            }
            float f7 = eVar.f129358l;
            float f8 = eVar.f129350d;
            float f9 = eVar.f129351e;
            if (Float.isNaN(f7) || Float.isInfinite(f7)) {
                return false;
            }
            ScaleGestureLayout scaleGestureLayout = this.f129321a;
            if (f7 == 1.0f) {
                return true;
            }
            float a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.e.a(scaleGestureLayout.f129295m);
            if (f7 < 1.0f) {
                min = Math.max(0.7f / a2, f7);
            } else {
                min = Math.min(10.0f / a2, f7);
            }
            p<Float, Float> b2 = scaleGestureLayout.b(f8, f9);
            scaleGestureLayout.f129295m.postScale(min, min, b2.getFirst().floatValue(), b2.getSecond().floatValue());
            scaleGestureLayout.y = com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.e.a(scaleGestureLayout.f129295m);
            scaleGestureLayout.invalidate();
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean b(MotionEvent motionEvent) {
            Animator animator;
            Matrix matrix;
            Animator animator2;
            l.d(motionEvent, "");
            ScaleGestureLayout scaleGestureLayout = this.f129321a;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            AnimatorSet animatorSet = scaleGestureLayout.v;
            if ((animatorSet == null || !animatorSet.isRunning()) && ((animator = scaleGestureLayout.t) == null || !animator.isRunning())) {
                Animator animator3 = scaleGestureLayout.u;
                if (!(animator3 == null || !animator3.isRunning() || (animator2 = scaleGestureLayout.u) == null)) {
                    animator2.cancel();
                }
                float f2 = 3.0f;
                if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.c(scaleGestureLayout.y, 3.0f)) {
                    matrix = new Matrix();
                } else {
                    if (scaleGestureLayout.y * 3.0f > 3.0f) {
                        f2 = 3.0f / scaleGestureLayout.y;
                    }
                    matrix = new Matrix(scaleGestureLayout.f129295m);
                    p<Float, Float> b2 = scaleGestureLayout.b(x, y);
                    matrix.postScale(f2, f2, b2.getFirst().floatValue(), b2.getSecond().floatValue());
                    RectF rectF = new RectF(scaleGestureLayout.n);
                    matrix.mapRect(rectF);
                    p<Float, Float> a2 = scaleGestureLayout.a(rectF);
                    if (a2 != null) {
                        matrix.postTranslate(a2.getFirst().floatValue(), a2.getSecond().floatValue());
                    }
                }
                Animator a3 = scaleGestureLayout.a(new Matrix(scaleGestureLayout.f129295m), matrix);
                a3.start();
                scaleGestureLayout.u = a3;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            Animator animator;
            AnimatorSet animatorSet;
            boolean z;
            boolean z2;
            l.d(motionEvent, "");
            l.d(motionEvent2, "");
            ScaleGestureLayout scaleGestureLayout = this.f129321a;
            Animator animator2 = scaleGestureLayout.t;
            if ((animator2 == null || !animator2.isRunning()) && (((animator = scaleGestureLayout.u) == null || !animator.isRunning()) && ((animatorSet = scaleGestureLayout.v) == null || !animatorSet.isRunning()))) {
                RectF currentDisplayRectF = scaleGestureLayout.getCurrentDisplayRectF();
                if (currentDisplayRectF.width() >= ((float) scaleGestureLayout.getWidth()) || currentDisplayRectF.height() >= ((float) scaleGestureLayout.getHeight())) {
                    float f4 = -Math.max(currentDisplayRectF.right - ((float) scaleGestureLayout.getWidth()), 0.0f);
                    float max = Math.max(0.0f - currentDisplayRectF.left, 0.0f);
                    float f5 = -Math.max(currentDisplayRectF.bottom - ((float) scaleGestureLayout.getHeight()), 0.0f);
                    float max2 = Math.max(0.0f - currentDisplayRectF.top, 0.0f);
                    if (!com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(f4, 0.0f) || !com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(max, 0.0f) || !com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(f5, 0.0f) || !com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(max2, 0.0f)) {
                        if ((f2 <= 0.0f || max <= 0.0f) && (f2 >= 0.0f || f4 >= 0.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if ((f3 <= 0.0f || max2 <= 0.0f) && (f3 >= 0.0f || f5 >= 0.0f)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z || z2) {
                            scaleGestureLayout.C = 0;
                            scaleGestureLayout.D = 0;
                            scaleGestureLayout.q.fling(0, 0, (int) f2, (int) f3, (int) f4, (int) max, (int) f5, (int) max2);
                            v.c(scaleGestureLayout);
                        }
                    }
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
            /*
            // Method dump skipped, instructions count: 659
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.g.b(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    public static final class j extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129325a;

        static {
            Covode.recordClassIndex(84888);
        }

        j(ScaleGestureLayout scaleGestureLayout) {
            this.f129325a = scaleGestureLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f129325a.b();
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129326a;

        static {
            Covode.recordClassIndex(84889);
        }

        k(ScaleGestureLayout scaleGestureLayout) {
            this.f129326a = scaleGestureLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f129326a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void setGestureListener(f fVar) {
        l.d(fVar, "");
        this.B = fVar;
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129314b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f129315c;

        static {
            Covode.recordClassIndex(84882);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f129313a.v = null;
            this.f129314b.invoke();
        }

        d(ScaleGestureLayout scaleGestureLayout, h.f.a.a aVar, ValueAnimator valueAnimator) {
            this.f129313a = scaleGestureLayout;
            this.f129314b = aVar;
            this.f129315c = valueAnimator;
        }
    }

    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f129317b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnimatorSet f129318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Animator f129319d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Animator f129320e;

        static {
            Covode.recordClassIndex(84883);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f129316a.v = null;
            this.f129317b.invoke();
        }

        e(ScaleGestureLayout scaleGestureLayout, h.f.a.a aVar, AnimatorSet animatorSet, Animator animator, Animator animator2) {
            this.f129316a = scaleGestureLayout;
            this.f129317b = aVar;
            this.f129318c = animatorSet;
            this.f129319d = animator;
            this.f129320e = animator2;
        }
    }

    static final class f extends m implements h.f.a.b<Matrix, z> {
        final /* synthetic */ ScaleGestureLayout this$0;

        static {
            Covode.recordClassIndex(84884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ScaleGestureLayout scaleGestureLayout) {
            super(1);
            this.this$0 = scaleGestureLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Matrix matrix) {
            Matrix matrix2 = matrix;
            l.d(matrix2, "");
            this.this$0.f129295m = matrix2;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129322a;

        static {
            Covode.recordClassIndex(84886);
        }

        h(ScaleGestureLayout scaleGestureLayout) {
            this.f129322a = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            f fVar;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (fVar = this.f129322a.B) != null) {
                fVar.a(((Number) animatedValue).floatValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Animator a(float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z, f2);
        ofFloat.addUpdateListener(new h(this));
        l.b(ofFloat, "");
        return ofFloat;
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129312a;

        static {
            Covode.recordClassIndex(84881);
        }

        c(ScaleGestureLayout scaleGestureLayout) {
            this.f129312a = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScaleGestureLayout scaleGestureLayout = this.f129312a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            scaleGestureLayout.setScaleX(((Float) animatedValue).floatValue());
            ScaleGestureLayout scaleGestureLayout2 = this.f129312a;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            scaleGestureLayout2.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f129323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScaleGestureLayout f129324b;

        static {
            Covode.recordClassIndex(84887);
        }

        i(ValueAnimator valueAnimator, ScaleGestureLayout scaleGestureLayout) {
            this.f129323a = valueAnimator;
            this.f129324b = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Matrix) {
                this.f129324b.f129295m = (Matrix) animatedValue;
                ScaleGestureLayout scaleGestureLayout = this.f129324b;
                scaleGestureLayout.y = com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.e.a(scaleGestureLayout.f129295m);
                v.c(this.f129324b);
            }
            this.f129323a.setInterpolator(this.f129324b.A);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.p<java.lang.Float, java.lang.Float> a(android.graphics.RectF r6) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.a(android.graphics.RectF):h.p");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r8 != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(int i2, int i3) {
        this.o = new Rect(0, 0, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final Animator a(Matrix matrix, Matrix matrix2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.G, matrix, matrix2);
        ofObject.addUpdateListener(new i(ofObject, this));
        l.b(ofObject, "");
        return ofObject;
    }

    /* access modifiers changed from: package-private */
    public final p<Float, Float> b(float f2, float f3) {
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.d(f2, currentDisplayRectF.left)) {
            f2 = currentDisplayRectF.left;
        } else if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.b(f2, currentDisplayRectF.right)) {
            f2 = currentDisplayRectF.right;
        }
        if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.d(f3, currentDisplayRectF.top)) {
            f3 = currentDisplayRectF.top;
        } else if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.b(f3, currentDisplayRectF.bottom)) {
            f3 = currentDisplayRectF.bottom;
        }
        return new p<>(Float.valueOf(f2), Float.valueOf(f3));
    }

    public final void a(float f2, float f3) {
        if (!com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(f2, 0.0f) || !com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.b.a(f3, 0.0f)) {
            this.f129295m.postTranslate(f2, f3);
            invalidate();
        }
    }

    private /* synthetic */ ScaleGestureLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ScaleGestureLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f129295m = new Matrix();
        this.q = new OverScroller(context);
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = new androidx.g.a.a.b();
        this.G = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.d();
        post(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ScaleGestureLayout f129296a;

            static {
                Covode.recordClassIndex(84873);
            }

            {
                this.f129296a = r1;
            }

            public final void run() {
                float f2;
                ScaleGestureLayout scaleGestureLayout = this.f129296a;
                float width = (float) scaleGestureLayout.getWidth();
                float height = (float) this.f129296a.getHeight();
                Rect rect = scaleGestureLayout.o;
                if (rect != null) {
                    float width2 = (float) rect.width();
                    Rect rect2 = scaleGestureLayout.o;
                    if (rect2 != null) {
                        float height2 = (float) rect2.height();
                        float f3 = width2 / height2;
                        float f4 = width / height;
                        float f5 = 0.0f;
                        if (f3 > f4) {
                            float f6 = (height2 / width2) * width;
                            float f7 = (height - f6) / 2.0f;
                            f2 = f7;
                            height = f7 + f6;
                        } else {
                            if (f3 < f4) {
                                float f8 = f3 * height;
                                float f9 = (width - f8) / 2.0f;
                                f5 = f9;
                                width = f9 + f8;
                            }
                            f2 = 0.0f;
                        }
                        scaleGestureLayout.n = new RectF(f5, f2, width, height);
                    }
                }
            }
        });
        g gVar = new g(this);
        this.H = gVar;
        this.I = new a(context, gVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        Runnable runnable;
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.o != null && getWidth() > 0 && getHeight() > 0 && this.f129295m.isIdentity() && (runnable = this.F) != null) {
            runnable.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(Rect rect, Rect rect2, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g gVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar) {
        Runnable runnable;
        l.d(gVar, "");
        l.d(aVar, "");
        this.F = new b(this, rect, rect2, gVar, aVar, null, 0.0f);
        if (this.o != null && getWidth() > 0 && getHeight() > 0 && (runnable = this.F) != null) {
            runnable.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(Rect rect, Rect rect2, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g gVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar, h.f.a.a<z> aVar2) {
        boolean z2;
        boolean z3;
        boolean z4;
        l.d(gVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        if (!v.y(this)) {
            aVar2.invoke();
            return;
        }
        Rect rect3 = this.o;
        if (rect3 != null) {
            z2 = rect3.isEmpty();
        } else {
            z2 = true;
        }
        if (rect != null) {
            z3 = rect.isEmpty();
        } else {
            z3 = true;
        }
        if (rect2 != null) {
            z4 = rect2.isEmpty();
        } else {
            z4 = true;
        }
        if (z2 || z3 || z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new c(this));
            AnimatorSet animatorSet = new AnimatorSet();
            this.v = animatorSet;
            animatorSet.addListener(new d(this, aVar2, ofFloat));
            animatorSet.playTogether(ofFloat, a(0.0f));
            animatorSet.setInterpolator(this.A);
            animatorSet.setDuration(200L);
            animatorSet.start();
        } else if (rect != null && rect2 != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.offset(-iArr[0], -iArr[1]);
            rect2.offset(-iArr[0], -iArr[1]);
            AnimatorSet a2 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a.a(new Matrix(this.f129295m), new Matrix(com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a.a(rect, getWidth(), getHeight(), this.o, gVar)), this.o, aVar, new f(this));
            Animator a3 = a(new Rect(rect), rect2, 0.0f, true);
            a3.setDuration(aVar.f129253h);
            a3.setInterpolator(aVar.f129248c);
            Animator a4 = a(0.0f);
            a4.setDuration(aVar.f129253h);
            a4.setInterpolator(aVar.f129248c);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            animatorSet2.addListener(new e(this, aVar2, a2, a3, a4));
            animatorSet2.playTogether(a2, a3, a4);
            animatorSet2.setInterpolator(this.A);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }
}
