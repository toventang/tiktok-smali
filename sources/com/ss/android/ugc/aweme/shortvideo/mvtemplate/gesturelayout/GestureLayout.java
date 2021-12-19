package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.core.h.v;
import androidx.g.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.d;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.e;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.f;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public class GestureLayout extends b implements c {
    private static final Property<a, PointF> A = new Property<a, PointF>(PointF.class, "translations") {
        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass12 */

        static {
            Covode.recordClassIndex(84825);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, PointF pointF) {
            a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f129231c = pointF2.x;
            aVar2.f129232d = pointF2.y;
            aVar2.a();
        }
    };
    private static final Property<a, float[]> z = new Property<a, float[]>(float[].class, "nonTranslations") {
        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass11 */

        static {
            Covode.recordClassIndex(84824);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, float[] fArr) {
            a aVar2 = aVar;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, aVar2.f129230b, 0, fArr2.length);
            aVar2.a();
        }
    };
    private TimeInterpolator B = new b();

    /* renamed from: m  reason: collision with root package name */
    public a f129206m = new a(getContext(), new a.GestureDetector$OnDoubleTapListenerC3364a() {
        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(84822);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        private void b() {
            GestureLayout.this.q = 0.0f;
            GestureLayout.this.r = false;
            GestureLayout.this.s = 0.0f;
            GestureLayout.this.t = 0.0f;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final void a() {
            super.a();
            b();
            GestureLayout.this.a((float) ((int) GestureLayout.this.q));
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onDown(MotionEvent motionEvent) {
            if (GestureLayout.this.getChildCount() == 0) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (GestureLayout.this.n == null) {
                return true;
            }
            GestureLayout.this.n.a();
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final void a(int i2) {
            super.a(i2);
            int i3 = (int) GestureLayout.this.q;
            b();
            GestureLayout.this.f129206m.f129239d = true;
            GestureLayout.this.a((float) i3);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.GestureDetector$OnDoubleTapListenerC3364a
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            GestureLayout gestureLayout = GestureLayout.this;
            float f4 = -f2;
            float f5 = -f3;
            gestureLayout.s += f4;
            gestureLayout.t += f5;
            if (!gestureLayout.r && gestureLayout.t > Math.abs(gestureLayout.s)) {
                gestureLayout.r = true;
                gestureLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (gestureLayout.r) {
                gestureLayout.q += f5;
                Matrix matrix = new Matrix(gestureLayout.v);
                matrix.postTranslate(f4, f5);
                float min = 1.0f - Math.min(1.0f, Math.abs(gestureLayout.q) / (new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight()).height() * 1.0f));
                gestureLayout.u = min;
                if (gestureLayout.n != null) {
                    gestureLayout.n.a(min);
                }
                float min2 = ((Math.min(1.0f, Math.abs(gestureLayout.q) / (new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight()).height() * 1.0f)) * -0.5f) + 1.0f) / e.a(gestureLayout.v);
                matrix.postScale(min2, min2, motionEvent2.getX(), motionEvent2.getY());
                gestureLayout.setImageMatrix(matrix);
            }
            return true;
        }
    });
    public e n;
    public f o;
    public RectF p;
    public float q;
    public boolean r;
    public float s;
    public float t;
    float u = 1.0f;
    public Matrix v = new Matrix();
    public AnimatorSet w;
    public Runnable x;
    public a y;

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a() {
    }

    public TimeInterpolator getInterpolator() {
        return this.B;
    }

    private void b() {
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
        }
    }

    private Animator getAlphaToFullTransparentAnimator() {
        return b(0.0f);
    }

    public RectF getBaseOriginDisplayRect() {
        if (this.p != null) {
            return new RectF(this.p);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(84821);
    }

    /* access modifiers changed from: protected */
    public ValueAnimator getDefaultDisappearFallbackAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(84826);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureLayout.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                GestureLayout.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f129229a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final float[] f129230b;

        /* renamed from: c  reason: collision with root package name */
        float f129231c;

        /* renamed from: d  reason: collision with root package name */
        float f129232d;

        /* renamed from: e  reason: collision with root package name */
        private final GestureLayout f129233e;

        /* renamed from: f  reason: collision with root package name */
        private final RectF f129234f;

        /* renamed from: g  reason: collision with root package name */
        private final RectF f129235g = new RectF();

        static {
            Covode.recordClassIndex(84838);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f129229a.setValues(this.f129230b);
            this.f129229a.mapRect(this.f129235g, this.f129234f);
            this.f129229a.postTranslate(this.f129231c - this.f129235g.centerX(), this.f129232d - this.f129235g.centerY());
            this.f129233e.setImageMatrix(new Matrix(this.f129229a));
        }

        a(GestureLayout gestureLayout, float[] fArr) {
            this.f129233e = gestureLayout;
            this.f129234f = new RectF(gestureLayout.getBaseOriginDisplayRect());
            this.f129230b = (float[]) fArr.clone();
            a();
        }
    }

    public void setGestureCallback(f fVar) {
        this.o = fVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public void setGestureListener(f fVar) {
        this.n = fVar;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.B = timeInterpolator;
    }

    public void setImageMatrix(Matrix matrix) {
        this.v = matrix;
        invalidate();
    }

    private Animator b(float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u, f2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(84827);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (GestureLayout.this.n != null) {
                    GestureLayout.this.n.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        return ofFloat;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f129206m;
        l.d(motionEvent, "");
        if (aVar.f129240e) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            aVar.f129239d = false;
            aVar.f129241f = false;
        }
        if (aVar.f129239d) {
            if (!aVar.f129241f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                GestureDetector gestureDetector = aVar.f129237b;
                if (gestureDetector == null) {
                    l.b();
                }
                gestureDetector.onTouchEvent(obtain);
                ScaleGestureDetector scaleGestureDetector = aVar.f129236a;
                if (scaleGestureDetector == null) {
                    l.b();
                }
                scaleGestureDetector.onTouchEvent(obtain);
                aVar.f129241f = true;
            }
            return false;
        }
        GestureDetector gestureDetector2 = aVar.f129237b;
        if (gestureDetector2 == null) {
            l.b();
        }
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        aVar.f129242g = MotionEvent.obtain(motionEvent);
        ScaleGestureDetector scaleGestureDetector2 = aVar.f129236a;
        if (scaleGestureDetector2 == null) {
            l.b();
        }
        scaleGestureDetector2.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            a.GestureDetector$OnDoubleTapListenerC3364a aVar2 = aVar.f129238c;
            if (aVar2 == null) {
                l.b();
            }
            aVar2.a();
        }
        if (motionEvent.getActionMasked() == 6) {
            a.GestureDetector$OnDoubleTapListenerC3364a aVar3 = aVar.f129238c;
            if (aVar3 == null) {
                l.b();
            }
            aVar3.a(motionEvent.getPointerId(0));
        }
        return onTouchEvent;
    }

    public final void a(float f2) {
        e eVar;
        if (f2 > 0.0f && Math.abs(f2) > ((float) getHeight()) * 0.2f && (eVar = this.n) != null) {
            eVar.b();
        } else if (f2 != 0.0f) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofObject = ValueAnimator.ofObject(new d(), new Matrix(this.v), new Matrix(new Matrix()));
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(84828);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    GestureLayout.this.setImageMatrix(new Matrix((Matrix) valueAnimator.getAnimatedValue()));
                }
            });
            animatorSet.playTogether(ofObject, b(1.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(84829);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            animatorSet.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(int i2, int i3) {
        this.p = new RectF(0.0f, 0.0f, (float) i2, (float) i3);
        if (getWidth() > 0 && getHeight() > 0) {
            b();
        }
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Matrix a(Rect rect, g gVar) {
        float f2;
        float f3;
        int width = getWidth();
        int height = getHeight();
        int width2 = (int) this.p.width();
        int height2 = (int) this.p.height();
        if (i.a(width, height, width2, height2)) {
            f2 = (float) height;
            f3 = (float) height2;
        } else {
            f2 = (float) width;
            f3 = (float) width2;
        }
        float f4 = f2 / f3;
        int i2 = width2 / 2;
        int i3 = height2 / 2;
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4, (float) i2, (float) i3);
        matrix.postTranslate((float) ((width / 2) - i2), (float) ((height / 2) - i3));
        RectF rectF = new RectF(0.0f, 0.0f, (float) width2, (float) height2);
        matrix.mapRect(rectF, rectF);
        return gVar.a(rectF, rect);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
    public final boolean a(Canvas canvas, View view, long j2) {
        canvas.save();
        canvas.concat(this.v);
        boolean a2 = super.a(canvas, view, j2);
        canvas.restore();
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0041, code lost:
        if (r7 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.graphics.Matrix r10, android.graphics.Matrix r11, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a r12) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.a(android.graphics.Matrix, android.graphics.Matrix, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a):android.animation.Animator");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.p != null && getWidth() > 0 && getHeight() > 0) {
            b();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(Rect rect, Rect rect2, g gVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar) {
        this.x = new Runnable(rect, rect2, gVar, aVar, null, 0.0f) {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Rect f129213a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Rect f129214b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f129215c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a f129216d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int[] f129217e = null;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f129218f = 0.0f;

            static {
                Covode.recordClassIndex(84830);
            }

            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                GestureLayout.this.x = null;
                if (GestureLayout.this.p == null || GestureLayout.this.p.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                Rect rect = this.f129213a;
                if (rect == null || rect.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Rect rect2 = this.f129214b;
                if (rect2 == null || rect2.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || z2 || z3) {
                    GestureLayout.this.w = new AnimatorSet();
                    GestureLayout.this.w.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass6.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(84831);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            GestureLayout.this.w = null;
                        }
                    });
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass6.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(84832);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (GestureLayout.this.n != null) {
                                GestureLayout.this.n.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                            GestureLayout.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    GestureLayout.this.w.playTogether(ofFloat);
                    GestureLayout.this.w.setInterpolator(GestureLayout.this.getInterpolator());
                    GestureLayout.this.w.setDuration(200L);
                    GestureLayout.this.w.start();
                    return;
                }
                int[] iArr = new int[2];
                GestureLayout.this.getLocationOnScreen(iArr);
                this.f129213a.offset(-iArr[0], -iArr[1]);
                this.f129214b.offset(-iArr[0], -iArr[1]);
                Animator a2 = GestureLayout.this.a(new Matrix(GestureLayout.this.a(this.f129213a, this.f129215c)), new Matrix(GestureLayout.this.v), this.f129216d);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass6.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(84833);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (GestureLayout.this.n != null) {
                            GestureLayout.this.n.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar = this.f129216d;
                if (aVar != null) {
                    ofFloat2.setDuration(aVar.f129254i);
                    ofFloat2.setInterpolator(this.f129216d.f129249d);
                }
                ArrayList arrayList = new ArrayList();
                Rect rect3 = new Rect(this.f129213a);
                int[] iArr2 = this.f129217e;
                if (iArr2 != null) {
                    if (iArr2.length == 4) {
                        rect3.left += this.f129217e[0];
                        rect3.top += this.f129217e[1];
                        rect3.right -= this.f129217e[2];
                        rect3.bottom -= this.f129217e[3];
                    } else {
                        throw new IllegalArgumentException("maskInsetPixel length must equal 4");
                    }
                }
                arrayList.add(GestureLayout.this.a(rect3, this.f129214b, this.f129218f, false));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar2 = this.f129216d;
                if (aVar2 != null) {
                    animatorSet.setDuration(aVar2.f129253h);
                    animatorSet.setInterpolator(this.f129216d.f129248c);
                }
                GestureLayout.this.w = new AnimatorSet();
                GestureLayout.this.w.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass6.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(84834);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GestureLayout.this.w = null;
                    }
                });
                GestureLayout.this.w.playTogether(a2, animatorSet, ofFloat2);
                GestureLayout.this.w.setInterpolator(GestureLayout.this.getInterpolator());
                if (this.f129216d == null) {
                    GestureLayout.this.w.setDuration(200L);
                }
                GestureLayout.this.w.start();
            }

            {
                this.f129213a = r3;
                this.f129214b = r4;
                this.f129215c = r5;
                this.f129216d = r6;
            }
        };
        if (this.p != null && getWidth() > 0 && getHeight() > 0) {
            this.x.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c
    public final void a(Rect rect, Rect rect2, g gVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar, final h.f.a.a<z> aVar2) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (!v.y(this)) {
            aVar2.invoke();
            return;
        }
        RectF rectF = this.p;
        if (rectF == null || rectF.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rect == null || rect.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rect2 == null || rect2.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 || z3 || z4) {
            ValueAnimator defaultDisappearFallbackAnimator = getDefaultDisappearFallbackAnimator();
            defaultDisappearFallbackAnimator.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(84835);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    aVar2.invoke();
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(84836);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GestureLayout.this.w = null;
                }
            });
            this.w.playTogether(defaultDisappearFallbackAnimator, getAlphaToFullTransparentAnimator());
            this.w.setInterpolator(getInterpolator());
            this.w.setDuration(200L);
            this.w.start();
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        rect2.offset(-iArr[0], -iArr[1]);
        Animator a2 = a(new Matrix(this.v), new Matrix(a(rect, gVar)), aVar);
        Animator a3 = a(new Rect(rect), rect2, 0.0f, true);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(a3);
        if (aVar != null) {
            animatorSet2.setDuration(aVar.f129253h);
            animatorSet2.setInterpolator(aVar.f129248c);
        }
        Animator alphaToFullTransparentAnimator = getAlphaToFullTransparentAnimator();
        if (aVar != null) {
            alphaToFullTransparentAnimator.setDuration(aVar.f129254i);
            alphaToFullTransparentAnimator.setInterpolator(aVar.f129249d);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.w = animatorSet3;
        animatorSet3.playTogether(a2, animatorSet2, alphaToFullTransparentAnimator);
        this.w.setInterpolator(getInterpolator());
        if (aVar == null) {
            this.w.setDuration(200L);
        }
        this.w.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.AnonymousClass9 */

            static {
                Covode.recordClassIndex(84837);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GestureLayout.this.w = null;
                aVar2.invoke();
            }
        });
        this.w.start();
    }
}
