package com.ss.android.ugc.aweme.ecommerce.gallery.view.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.k;

public final class c extends b {
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public C2068c O;
    public b P;
    private com.facebook.drawee.view.b<com.facebook.drawee.f.a> Q;
    private long R;
    private boolean S;
    private Paint T;
    private Matrix U;

    public interface b {
        static {
            Covode.recordClassIndex(53876);
        }

        void a();

        void a(int i2, float f2);

        void a(int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(53869);
    }

    public final long getDuration() {
        return this.R;
    }

    public final int getState() {
        return this.H;
    }

    class a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        float f86096a;

        /* renamed from: b  reason: collision with root package name */
        float f86097b;

        /* renamed from: c  reason: collision with root package name */
        float f86098c;

        /* renamed from: d  reason: collision with root package name */
        float f86099d;

        static {
            Covode.recordClassIndex(53875);
        }

        @Override // java.lang.Object
        public final Object clone() {
            return super.clone();
        }

        public final String toString() {
            return "[left:" + this.f86096a + " top:" + this.f86097b + " width:" + this.f86098c + " height:" + this.f86099d + "]";
        }

        private a() {
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }
    }

    public final com.facebook.drawee.h.a getController() {
        return this.Q.f47495b;
    }

    public final void d() {
        this.I = 100;
        this.H = 1;
        this.S = true;
        invalidate();
    }

    public final void e() {
        this.I = 100;
        this.H = 2;
        this.S = true;
        invalidate();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.b();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.c();
        k.a(this);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.Q.b();
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.Q.c();
    }

    public final void setDuration(long j2) {
        this.R = j2;
    }

    public final void setOnTransferListener(b bVar) {
        this.P = bVar;
    }

    public final void setState(int i2) {
        this.H = i2;
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    public final void setController(com.facebook.drawee.h.a aVar) {
        this.Q.a(aVar);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q.a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == this.Q.d().f47455b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PropertyValuesHolder propertyValuesHolder3;
        PropertyValuesHolder propertyValuesHolder4;
        PropertyValuesHolder propertyValuesHolder5;
        C2068c cVar;
        boolean z;
        if (getDrawable() != null) {
            int i2 = this.H;
            if (i2 != 0) {
                if (this.S) {
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Drawable drawable = getDrawable();
                    if (!(drawable == null || getWidth() == 0 || getHeight() == 0)) {
                        this.O = new C2068c(z);
                        float intrinsicWidth = ((float) this.K) / ((float) drawable.getIntrinsicWidth());
                        float intrinsicHeight = ((float) this.L) / ((float) drawable.getIntrinsicHeight());
                        if (intrinsicWidth <= intrinsicHeight) {
                            intrinsicWidth = intrinsicHeight;
                        }
                        this.O.f86101a = intrinsicWidth;
                        float width = ((float) getWidth()) / ((float) drawable.getIntrinsicWidth());
                        float height = ((float) getHeight()) / ((float) drawable.getIntrinsicHeight());
                        if (width >= height) {
                            width = height;
                        }
                        if (this.I == 200 && this.J == 201) {
                            this.O.f86102b = intrinsicWidth;
                        } else {
                            this.O.f86102b = width;
                        }
                        this.O.f86105e = new a(this, (byte) 0);
                        this.O.f86105e.f86096a = (float) this.M;
                        this.O.f86105e.f86097b = (float) this.N;
                        this.O.f86105e.f86098c = (float) this.K;
                        this.O.f86105e.f86099d = (float) this.L;
                        this.O.f86106f = new a(this, (byte) 0);
                        float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * this.O.f86102b;
                        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * this.O.f86102b;
                        this.O.f86106f.f86096a = (((float) getWidth()) - intrinsicWidth2) / 2.0f;
                        this.O.f86106f.f86097b = (((float) getHeight()) - intrinsicHeight2) / 2.0f;
                        this.O.f86106f.f86098c = intrinsicWidth2;
                        this.O.f86106f.f86099d = intrinsicHeight2;
                        this.O.f86107g = new a(this, (byte) 0);
                    }
                }
                C2068c cVar2 = this.O;
                if (cVar2 == null) {
                    super.onDraw(canvas);
                    return;
                }
                if (this.S) {
                    int i3 = this.H;
                    if (i3 == 1) {
                        cVar2.f86103c = cVar2.f86101a;
                        try {
                            cVar2.f86107g = (a) cVar2.f86105e.clone();
                        } catch (CloneNotSupportedException e2) {
                            e2.printStackTrace();
                        }
                    } else if (i3 == 2) {
                        cVar2.f86103c = cVar2.f86102b;
                        try {
                            cVar2.f86107g = (a) cVar2.f86106f.clone();
                        } catch (CloneNotSupportedException e3) {
                            e3.printStackTrace();
                        }
                    } else if (i3 == 3) {
                        cVar2.f86103c = cVar2.f86101a;
                        try {
                            cVar2.f86107g = (a) cVar2.f86106f.clone();
                        } catch (CloneNotSupportedException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                canvas.drawPaint(this.T);
                int saveCount = canvas.getSaveCount();
                canvas.save();
                Drawable drawable2 = getDrawable();
                if (!(drawable2 == null || (cVar = this.O) == null)) {
                    this.U.setScale(cVar.f86103c, this.O.f86103c);
                    this.U.postTranslate(-(((this.O.f86103c * ((float) drawable2.getIntrinsicWidth())) / 2.0f) - (this.O.f86107g.f86098c / 2.0f)), -(((this.O.f86103c * ((float) drawable2.getIntrinsicHeight())) / 2.0f) - (this.O.f86107g.f86099d / 2.0f)));
                }
                canvas.translate(this.O.f86107g.f86096a, this.O.f86107g.f86097b);
                canvas.clipRect(0.0f, 0.0f, this.O.f86107g.f86098c, this.O.f86107g.f86099d);
                canvas.concat(this.U);
                getDrawable().draw(canvas);
                canvas.restoreToCount(saveCount);
                if (this.S && this.H != 3) {
                    this.S = false;
                    int i4 = this.I;
                    if (i4 != 100) {
                        if (i4 == 200 && this.O != null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            valueAnimator.setDuration(this.R);
                            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                            if (this.J == 201) {
                                valueAnimator.setValues(PropertyValuesHolder.ofFloat("left", this.O.f86105e.f86096a, this.O.f86106f.f86096a), PropertyValuesHolder.ofFloat("top", this.O.f86105e.f86097b, this.O.f86106f.f86097b), PropertyValuesHolder.ofFloat("width", this.O.f86105e.f86098c, this.O.f86106f.f86098c), PropertyValuesHolder.ofFloat("height", this.O.f86105e.f86099d, this.O.f86106f.f86099d));
                                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(53870);
                                    }

                                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        MethodCollector.i(6464);
                                        if (c.this.P != null) {
                                            c.this.P.a(c.this.H, valueAnimator.getAnimatedFraction());
                                        }
                                        c.this.O.f86107g.f86096a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                        c.this.O.f86107g.f86097b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                        c.this.O.f86107g.f86098c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                        c.this.O.f86107g.f86099d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                        c.this.invalidate();
                                        MethodCollector.o(6464);
                                    }
                                });
                            } else {
                                valueAnimator.setValues(PropertyValuesHolder.ofFloat("scale", this.O.f86101a, this.O.f86102b), PropertyValuesHolder.ofFloat("left", this.O.f86105e.f86096a, this.O.f86106f.f86096a), PropertyValuesHolder.ofFloat("top", this.O.f86105e.f86097b, this.O.f86106f.f86097b), PropertyValuesHolder.ofFloat("width", this.O.f86105e.f86098c, this.O.f86106f.f86098c), PropertyValuesHolder.ofFloat("height", this.O.f86105e.f86099d, this.O.f86106f.f86099d));
                                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(53871);
                                    }

                                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        MethodCollector.i(7461);
                                        c.this.O.f86107g.f86096a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                        c.this.O.f86107g.f86097b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                        c.this.O.f86107g.f86098c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                        c.this.O.f86107g.f86099d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                        c.this.O.f86103c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                                        c.this.invalidate();
                                        MethodCollector.o(7461);
                                    }
                                });
                            }
                            valueAnimator.addListener(new AnimatorListenerAdapter() {
                                /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(53872);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    if (c.this.P != null) {
                                        c.this.P.a();
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (c.this.J == 201) {
                                        c cVar = c.this;
                                        cVar.M = (int) cVar.O.f86106f.f86096a;
                                        c cVar2 = c.this;
                                        cVar2.N = (int) cVar2.O.f86106f.f86097b;
                                        c cVar3 = c.this;
                                        cVar3.K = (int) cVar3.O.f86106f.f86098c;
                                        c cVar4 = c.this;
                                        cVar4.L = (int) cVar4.O.f86106f.f86099d;
                                    }
                                    if (c.this.H == 1 && c.this.J == 202) {
                                        c.this.H = 0;
                                    }
                                    if (c.this.P != null) {
                                        c.this.P.a(c.this.H, c.this.I, c.this.J);
                                    }
                                }
                            });
                            if (this.H == 1) {
                                valueAnimator.start();
                            } else {
                                valueAnimator.reverse();
                            }
                        }
                    } else if (this.O != null) {
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        valueAnimator2.setDuration(this.R);
                        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                        if (this.O.f86105e.f86098c == 0.0f || this.O.f86105e.f86099d == 0.0f) {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.O.f86102b, this.O.f86102b);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.O.f86106f.f86096a, this.O.f86106f.f86096a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.O.f86106f.f86097b, this.O.f86106f.f86097b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.O.f86106f.f86098c, this.O.f86106f.f86098c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.O.f86106f.f86099d, this.O.f86106f.f86099d);
                        } else if (this.O.f86106f.f86098c == 0.0f || this.O.f86106f.f86099d == 0.0f) {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.O.f86101a, this.O.f86101a);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.O.f86105e.f86096a, this.O.f86105e.f86096a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.O.f86105e.f86097b, this.O.f86105e.f86097b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.O.f86105e.f86098c, this.O.f86105e.f86098c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.O.f86105e.f86099d, this.O.f86105e.f86099d);
                        } else {
                            propertyValuesHolder = PropertyValuesHolder.ofFloat("scale", this.O.f86101a, this.O.f86102b);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat("left", this.O.f86105e.f86096a, this.O.f86106f.f86096a);
                            propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", this.O.f86105e.f86097b, this.O.f86106f.f86097b);
                            propertyValuesHolder4 = PropertyValuesHolder.ofFloat("width", this.O.f86105e.f86098c, this.O.f86106f.f86098c);
                            propertyValuesHolder5 = PropertyValuesHolder.ofFloat("height", this.O.f86105e.f86099d, this.O.f86106f.f86099d);
                        }
                        valueAnimator2.setValues(propertyValuesHolder, propertyValuesHolder2, propertyValuesHolder3, propertyValuesHolder4, propertyValuesHolder5);
                        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(53873);
                            }

                            public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                                MethodCollector.i(7612);
                                if (c.this.P != null) {
                                    c.this.P.a(c.this.H, valueAnimator.getAnimatedFraction());
                                }
                                c.this.O.f86103c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                                c.this.O.f86107g.f86096a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                                c.this.O.f86107g.f86097b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                                c.this.O.f86107g.f86098c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                                c.this.O.f86107g.f86099d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                                c.this.invalidate();
                                MethodCollector.o(7612);
                            }
                        });
                        valueAnimator2.addListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(53874);
                            }

                            public final void onAnimationStart(Animator animator) {
                                if (c.this.P != null) {
                                    c.this.P.a();
                                }
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (c.this.P != null) {
                                    c.this.P.a(c.this.H, c.this.I, c.this.J);
                                }
                                if (c.this.H == 1) {
                                    c.this.H = 0;
                                }
                            }
                        });
                        if (this.H == 1) {
                            valueAnimator2.start();
                        } else {
                            valueAnimator2.reverse();
                        }
                    }
                }
            } else {
                canvas.drawPaint(this.T);
                try {
                    super.onDraw(canvas);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c$c  reason: collision with other inner class name */
    class C2068c {

        /* renamed from: a  reason: collision with root package name */
        float f86101a;

        /* renamed from: b  reason: collision with root package name */
        float f86102b;

        /* renamed from: c  reason: collision with root package name */
        float f86103c;

        /* renamed from: d  reason: collision with root package name */
        int f86104d;

        /* renamed from: e  reason: collision with root package name */
        a f86105e;

        /* renamed from: f  reason: collision with root package name */
        a f86106f;

        /* renamed from: g  reason: collision with root package name */
        a f86107g;

        static {
            Covode.recordClassIndex(53877);
        }

        C2068c(boolean z) {
            int i2;
            if (z) {
                i2 = 255;
            } else {
                i2 = 0;
            }
            this.f86104d = i2;
        }
    }

    private c(Context context, byte b2) {
        this(context, (char) 0);
    }

    private c(Context context, char c2) {
        super(context, null);
        this.I = 100;
        this.J = 201;
        this.R = 300;
        this.U = new Matrix();
        Paint paint = new Paint();
        this.T = paint;
        paint.setAlpha(0);
        if (this.Q == null) {
            com.facebook.drawee.f.a a2 = new com.facebook.drawee.f.b(getResources()).a();
            getContext();
            this.Q = com.facebook.drawee.view.b.a(a2);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.M = i2;
        this.N = i3;
        this.K = i4;
        this.L = i5;
    }
}
