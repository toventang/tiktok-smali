package com.ss.android.ugc.aweme.profile.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class PinchImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f117331a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnLongClickListener f117332b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f117333c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    public RectF f117334d;

    /* renamed from: e  reason: collision with root package name */
    public int f117335e = 0;

    /* renamed from: f  reason: collision with root package name */
    public f f117336f;

    /* renamed from: g  reason: collision with root package name */
    a f117337g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f117338h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f117339i;

    /* renamed from: j  reason: collision with root package name */
    private List<Object> f117340j;

    /* renamed from: k  reason: collision with root package name */
    private List<Object> f117341k;

    /* renamed from: l  reason: collision with root package name */
    private int f117342l;

    /* renamed from: m  reason: collision with root package name */
    private PointF f117343m = new PointF();
    private PointF n = new PointF();
    private float o = 0.0f;
    private GestureDetector p = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
        /* class com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(75828);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.this.f117332b != null) {
                PinchImageView.this.f117332b.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.this.f117331a == null) {
                return true;
            }
            PinchImageView.this.f117331a.onClick(PinchImageView.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PinchImageView.this.f117335e == 1 && (PinchImageView.this.f117336f == null || !PinchImageView.this.f117336f.isRunning())) {
                PinchImageView.this.b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (PinchImageView.this.f117335e != 0) {
                return true;
            }
            if (PinchImageView.this.f117336f != null && PinchImageView.this.f117336f.isRunning()) {
                return true;
            }
            PinchImageView pinchImageView = PinchImageView.this;
            if (!pinchImageView.b()) {
                return true;
            }
            pinchImageView.c();
            pinchImageView.f117337g = new a(f2 / 60.0f, f3 / 60.0f);
            pinchImageView.f117337g.start();
            return true;
        }
    });

    static {
        Covode.recordClassIndex(75827);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    /* access modifiers changed from: package-private */
    public static class c extends d<Matrix> {
        static {
            Covode.recordClassIndex(75831);
        }

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.d
        public final /* synthetic */ Matrix a() {
            return new Matrix();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.d
        public final /* synthetic */ Matrix a(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class e extends d<RectF> {
        static {
            Covode.recordClassIndex(75833);
        }

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.d
        public final /* synthetic */ RectF a() {
            return new RectF();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.d
        public final /* synthetic */ RectF a(RectF rectF) {
            RectF rectF2 = rectF;
            if (rectF2 == null) {
                return new RectF();
            }
            rectF2.setEmpty();
            return rectF2;
        }
    }

    public int getPinchMode() {
        return this.f117335e;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static c f117347a = new c();

        /* renamed from: b  reason: collision with root package name */
        static e f117348b = new e();

        public static float[] b(float f2, float f3, float f4, float f5) {
            return new float[]{(f2 + f4) / 2.0f, (f3 + f5) / 2.0f};
        }

        public static RectF b() {
            return (RectF) f117348b.b();
        }

        static {
            Covode.recordClassIndex(75830);
        }

        public static Matrix a() {
            return (Matrix) f117347a.b();
        }

        public static Matrix a(Matrix matrix) {
            Matrix matrix2 = (Matrix) f117347a.b();
            if (matrix != null) {
                matrix2.set(matrix);
            }
            return matrix2;
        }

        public static float[] b(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        public static RectF a(float f2, float f3) {
            RectF rectF = (RectF) f117348b.b();
            rectF.set(0.0f, 0.0f, f2, f3);
            return rectF;
        }

        public static float[] a(float[] fArr, Matrix matrix) {
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix a2 = a();
            matrix.invert(a2);
            a2.mapPoints(fArr2, fArr);
            f117347a.b(a2);
            return fArr2;
        }

        public static float a(float f2, float f3, float f4, float f5) {
            float f6 = f2 - f4;
            float f7 = f3 - f5;
            return (float) Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class d<T> {

        /* renamed from: a  reason: collision with root package name */
        private int f117349a = 16;

        /* renamed from: b  reason: collision with root package name */
        private Queue<T> f117350b = new LinkedList();

        static {
            Covode.recordClassIndex(75832);
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        /* access modifiers changed from: protected */
        public abstract T a(T t);

        d() {
        }

        public final T b() {
            if (this.f117350b.size() == 0) {
                return a();
            }
            try {
                return a(this.f117350b.poll());
            } catch (NoSuchElementException unused) {
                return a();
            }
        }

        public final void b(T t) {
            if (t != null && this.f117350b.size() < this.f117349a) {
                this.f117350b.offer(t);
            }
        }
    }

    public RectF getMask() {
        if (this.f117334d != null) {
            return new RectF(this.f117334d);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        f fVar = this.f117336f;
        if (fVar != null) {
            fVar.cancel();
            this.f117336f = null;
        }
        a aVar = this.f117337g;
        if (aVar != null) {
            aVar.cancel();
            this.f117337g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private float getMinScale() {
        if (!b() || this.f117339i == null) {
            return 1.0f;
        }
        float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
        float width = ((float) getWidth()) / ((float) getHeight());
        if (intrinsicWidth >= ((float) this.f117339i.width()) / ((float) this.f117339i.height()) && intrinsicWidth >= width) {
            return ((float) this.f117339i.height()) / (((float) getWidth()) / intrinsicWidth);
        }
        return (((float) this.f117339i.width()) / ((float) getWidth())) * (((float) getWidth()) / (b.b(a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
    }

    /* access modifiers changed from: protected */
    public float getMaxScale() {
        float f2;
        float height;
        int intrinsicHeight;
        if (b()) {
            if (((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight()) < ((float) getWidth()) / ((float) getHeight())) {
                height = (float) getWidth();
                intrinsicHeight = getDrawable().getIntrinsicWidth();
            } else {
                height = (float) getHeight();
                intrinsicHeight = getDrawable().getIntrinsicHeight();
            }
            f2 = height / ((float) intrinsicHeight);
        } else {
            f2 = 4.0f;
        }
        return Math.max(f2, 4.0f);
    }

    public final void a() {
        List<Object> list;
        List<Object> list2 = this.f117340j;
        if (list2 != null) {
            this.f117342l++;
            Iterator<Object> it = list2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            int i2 = this.f117342l - 1;
            this.f117342l = i2;
            if (i2 == 0 && (list = this.f117341k) != null) {
                this.f117340j = list;
                this.f117341k = null;
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f117331a = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f117332b = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f117339i = rect;
        if (rect != null) {
            this.f117338h = true;
        }
    }

    private Matrix b(Matrix matrix) {
        Matrix a2 = a(matrix);
        a2.postConcat(this.f117333c);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public class a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        private float[] f117346b;

        static {
            Covode.recordClassIndex(75829);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PinchImageView pinchImageView = PinchImageView.this;
            float[] fArr = this.f117346b;
            boolean a2 = pinchImageView.a(fArr[0], fArr[1]);
            float[] fArr2 = this.f117346b;
            fArr2[0] = fArr2[0] * 0.9f;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a2 || b.a(0.0f, 0.0f, fArr2[0], fArr2[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        a(float f2, float f3) {
            setFloatValues(0.0f, 1.0f);
            setDuration(1000000L);
            addUpdateListener(this);
            this.f117346b = new float[]{f2, f3};
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b  reason: collision with root package name */
        private float[] f117352b;

        /* renamed from: c  reason: collision with root package name */
        private float[] f117353c;

        /* renamed from: d  reason: collision with root package name */
        private float[] f117354d;

        static {
            Covode.recordClassIndex(75834);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i2 = 0;
            do {
                float[] fArr = this.f117354d;
                float[] fArr2 = this.f117352b;
                fArr[i2] = fArr2[i2] + ((this.f117353c[i2] - fArr2[i2]) * floatValue);
                i2++;
            } while (i2 < 9);
            PinchImageView.this.f117333c.setValues(this.f117354d);
            PinchImageView.this.a();
            PinchImageView.this.invalidate();
        }

        f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, (byte) 0);
        }

        private f(Matrix matrix, Matrix matrix2, byte b2) {
            this.f117352b = new float[9];
            this.f117353c = new float[9];
            this.f117354d = new float[9];
            setFloatValues(0.0f, 1.0f);
            setDuration(200L);
            addUpdateListener(this);
            matrix.getValues(this.f117352b);
            matrix2.getValues(this.f117353c);
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f117335e == 2) {
            return true;
        }
        RectF a2 = a((RectF) null);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (a2.right > ((float) getWidth())) {
                return true;
            }
            return false;
        } else if (a2.left < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canScrollVertically(int i2) {
        if (this.f117335e == 2) {
            return true;
        }
        RectF a2 = a((RectF) null);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        if (i2 > 0) {
            if (a2.bottom > ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (a2.top < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (b()) {
            Matrix a2 = b.a();
            setImageMatrix(b(a2));
            b.f117347a.b(a2);
        }
        if (this.f117334d != null) {
            canvas.save();
            canvas.clipRect(this.f117334d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    private Matrix a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (b()) {
            RectF a2 = b.a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a3 = b.a((float) getWidth(), (float) getHeight());
            matrix.setRectToRect(a2, a3, Matrix.ScaleToFit.CENTER);
            b.f117348b.b(a3);
            b.f117348b.b(a2);
        }
        return matrix;
    }

    public final RectF a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!b()) {
            return rectF;
        }
        Matrix a2 = b.a();
        b(a2);
        rectF.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a2.mapRect(rectF);
        b.f117347a.b(a2);
        return rectF;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 675
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void b(float f2, float f3) {
        float f4;
        int width;
        float f5;
        int height;
        int width2;
        int height2;
        float f6;
        float f7;
        float f8;
        if (b()) {
            Matrix a2 = b.a();
            a(a2);
            float f9 = b.b(a2)[0];
            float f10 = b.b(this.f117333c)[0] * f9;
            if (this.f117338h) {
                f4 = (float) this.f117339i.left;
            } else {
                f4 = 0.0f;
            }
            if (this.f117338h) {
                width = this.f117339i.right;
            } else {
                width = getWidth();
            }
            float f11 = (float) width;
            if (this.f117338h) {
                f5 = (float) this.f117339i.top;
            } else {
                f5 = 0.0f;
            }
            if (this.f117338h) {
                height = this.f117339i.bottom;
            } else {
                height = getHeight();
            }
            float f12 = (float) height;
            if (this.f117338h) {
                width2 = this.f117339i.width();
            } else {
                width2 = getWidth();
            }
            float f13 = (float) width2;
            if (this.f117338h) {
                height2 = this.f117339i.height();
            } else {
                height2 = getHeight();
            }
            float f14 = (float) height2;
            float maxScale = getMaxScale();
            if (f10 < getMaxScale()) {
                f6 = getMaxScale();
            } else {
                f6 = f9;
            }
            if (f6 <= maxScale) {
                maxScale = f6;
            }
            if (maxScale >= f9) {
                f9 = maxScale;
            }
            Matrix a3 = b.a(this.f117333c);
            float f15 = f9 / f10;
            a3.postScale(f15, f15, f2, f3);
            float f16 = f13 / 2.0f;
            float f17 = f14 / 2.0f;
            a3.postTranslate(f16 - f2, f17 - f3);
            Matrix a4 = b.a(a2);
            a4.postConcat(a3);
            RectF a5 = b.a((float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            a4.mapRect(a5);
            if (a5.right - a5.left < f13) {
                f7 = f16 - ((a5.right + a5.left) / 2.0f);
            } else if (a5.left > f4) {
                f7 = f4 - a5.left;
            } else if (a5.right < f11) {
                f7 = f11 - a5.right;
            } else {
                f7 = 0.0f;
            }
            if (a5.bottom - a5.top < f14) {
                f8 = f17 - ((a5.bottom + a5.top) / 2.0f);
            } else if (a5.top > f5) {
                f8 = f5 - a5.top;
            } else if (a5.bottom < f12) {
                f8 = f12 - a5.bottom;
            } else {
                f8 = 0.0f;
            }
            a3.postTranslate(f7, f8);
            c();
            f fVar = new f(this, this.f117333c, a3);
            this.f117336f = fVar;
            fVar.start();
            b.f117348b.b(a5);
            b.f117347a.b(a4);
            b.f117347a.b(a3);
            b.f117347a.b(a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(float r12, float r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.a(float, float):boolean");
    }

    private void a(float f2, float f3, float f4, float f5) {
        this.o = b.b(this.f117333c)[0] / b.a(f2, f3, f4, f5);
        float[] a2 = b.a(b.b(f2, f3, f4, f5), this.f117333c);
        this.n.set(a2[0], a2[1]);
    }
}
