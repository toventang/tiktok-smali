package g.a.a.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

public abstract class b extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f158083a;

    /* renamed from: b  reason: collision with root package name */
    private float f158084b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f158085c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f158086d;

    /* renamed from: e  reason: collision with root package name */
    private int f158087e;

    /* renamed from: f  reason: collision with root package name */
    private int f158088f;

    /* renamed from: g  reason: collision with root package name */
    private PointF f158089g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f158090h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f158091i;

    /* renamed from: j  reason: collision with root package name */
    private AbstractC4179b f158092j;

    /* renamed from: k  reason: collision with root package name */
    private c f158093k;

    /* renamed from: m  reason: collision with root package name */
    protected g.a.a.a.a.b f158094m;
    protected Matrix n;
    protected Matrix o;
    protected Matrix p;
    protected Handler q;
    protected Runnable r;
    protected boolean s;
    protected final Matrix t;
    protected final float[] u;
    protected a v;
    protected final int w;
    protected RectF x;
    protected RectF y;
    protected RectF z;

    /* renamed from: g.a.a.a.b.b$b  reason: collision with other inner class name */
    public interface AbstractC4179b {
        static {
            Covode.recordClassIndex(104961);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(104962);
        }
    }

    static {
        Covode.recordClassIndex(104956);
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.f158089g;
    }

    public a getDisplayType() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.n.reset();
            super.setImageDrawable(null);
        }
        if (f2 == -1.0f || f3 == -1.0f) {
            this.f158084b = -1.0f;
            this.f158083a = -1.0f;
            this.f158086d = false;
            this.f158085c = false;
        } else {
            float min = Math.min(f2, f3);
            float max = Math.max(min, f3);
            this.f158084b = min;
            this.f158083a = max;
            this.f158086d = true;
            this.f158085c = true;
            if (this.v == a.FIT_TO_SCREEN || this.v == a.FIT_IF_BIGGER) {
                if (this.f158084b >= 1.0f) {
                    this.f158086d = false;
                    this.f158084b = -1.0f;
                }
                if (this.f158083a <= 1.0f) {
                    this.f158085c = true;
                    this.f158083a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.p = new Matrix(matrix);
        }
        this.f158091i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f158088f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f158087e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f158088f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f158088f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f158088f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            int i2 = this.f158087e;
            if (rectF.right + rectF2.left <= ((float) (i2 + 0))) {
                rectF2.left = (float) ((int) (((float) (i2 + 0)) - rectF.right));
            }
        }
    }

    public float getBaseScale() {
        return c(this.n);
    }

    public RectF getBitmapRect() {
        return d(this.o);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.o);
    }

    public Matrix getImageViewMatrix() {
        return b(this.o);
    }

    public float getScale() {
        return c(this.o);
    }

    public enum a {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER;

        static {
            Covode.recordClassIndex(104960);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (getDrawable() != null) {
            RectF a2 = a(this.o);
            if (a2.left != 0.0f || a2.top != 0.0f) {
                a(a2.left, a2.top);
            }
        }
    }

    public float getMaxScale() {
        float max;
        if (this.f158083a == -1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                max = 1.0f;
            } else {
                max = Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f158087e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f158088f)) * 8.0f;
            }
            this.f158083a = max;
        }
        return this.f158083a;
    }

    public float getMinScale() {
        if (this.f158084b == -1.0f) {
            float f2 = 1.0f;
            if (getDrawable() != null) {
                f2 = Math.min(1.0f, 1.0f / c(this.n));
            }
            this.f158084b = f2;
        }
        return this.f158084b;
    }

    public final void a() {
        this.o = new Matrix();
        float a2 = a(this.v);
        setImageMatrix(getImageViewMatrix());
        if (a2 != getScale()) {
            c(a2);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f2) {
        this.f158083a = f2;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f2) {
        this.f158084b = f2;
    }

    public void setOnDrawableChangedListener(AbstractC4179b bVar) {
        this.f158092j = bVar;
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f158093k = cVar;
    }

    public void setImageDrawable(Drawable drawable) {
        b(drawable, null, -1.0f, -1.0f);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    private Matrix b(Matrix matrix) {
        this.t.set(this.n);
        this.t.postConcat(matrix);
        return this.t;
    }

    private float c(Matrix matrix) {
        matrix.getValues(this.u);
        return this.u[0];
    }

    public void setDisplayType(a aVar) {
        if (aVar != this.v) {
            this.s = false;
            this.v = aVar;
            this.f158090h = true;
            requestLayout();
        }
    }

    public void setImageResource(int i2) {
        setImageDrawable(getContext().getResources().getDrawable(i2));
    }

    private float a(a aVar) {
        if (aVar == a.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (aVar == a.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / c(this.n));
        }
        return 1.0f / c(this.n);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            b(new g.a.a.a.b.a.a(bitmap), null, -1.0f, -1.0f);
        } else {
            b(null, null, -1.0f, -1.0f);
        }
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if (matrix == null) {
            imageMatrix.isIdentity();
        } else {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    private void c(float f2) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        if (f2 < getMinScale()) {
            f2 = getMinScale();
        }
        PointF center = getCenter();
        a(f2, center.x, center.y);
    }

    private RectF d(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix b2 = b(matrix);
        this.x.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        b2.mapRect(this.x);
        return this.x;
    }

    /* access modifiers changed from: protected */
    public final RectF a(Matrix matrix) {
        float f2;
        float f3;
        float f4;
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.y.set(0.0f, 0.0f, 0.0f, 0.0f);
        RectF d2 = d(matrix);
        float height = d2.height();
        float width = d2.width();
        float f5 = (float) this.f158088f;
        if (height < f5) {
            f2 = ((f5 - height) / 2.0f) - d2.top;
        } else if (d2.top > 0.0f) {
            f2 = -d2.top;
        } else if (d2.bottom < f5) {
            f2 = ((float) this.f158088f) - d2.bottom;
        } else {
            f2 = 0.0f;
        }
        float f6 = (float) this.f158087e;
        if (width < f6) {
            f6 = (f6 - width) / 2.0f;
            f4 = d2.left;
        } else {
            if (d2.left > 0.0f) {
                f3 = -d2.left;
            } else if (d2.right < f6) {
                f4 = d2.right;
            } else {
                f3 = 0.0f;
            }
            this.y.set(f3, f2, 0.0f, 0.0f);
            return this.y;
        }
        f3 = f6 - f4;
        this.y.set(f3, f2, 0.0f, 0.0f);
        return this.y;
    }

    public final void b(float f2) {
        PointF center = getCenter();
        a(f2, center.x, center.y, 50.0f);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void c(float f2, float f3) {
        a((double) f2, (double) f3);
    }

    /* access modifiers changed from: protected */
    public final void d(float f2, float f3) {
        final double d2 = (double) f2;
        final double d3 = (double) f3;
        final long currentTimeMillis = System.currentTimeMillis();
        this.q.post(new Runnable() {
            /* class g.a.a.a.b.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            double f158100a;

            /* renamed from: b  reason: collision with root package name */
            double f158101b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ double f158102c = 300.0d;

            static {
                Covode.recordClassIndex(104958);
            }

            public final void run() {
                double min = Math.min(this.f158102c, (double) (System.currentTimeMillis() - currentTimeMillis));
                double a2 = b.this.f158094m.a(min, d2, this.f158102c);
                double a3 = b.this.f158094m.a(min, d3, this.f158102c);
                b.this.a(a2 - this.f158100a, a3 - this.f158101b);
                this.f158100a = a2;
                this.f158101b = a3;
                if (min < this.f158102c) {
                    b.this.q.post(this);
                    return;
                }
                b bVar = b.this;
                RectF a4 = bVar.a(bVar.o);
                if (a4.left != 0.0f || a4.top != 0.0f) {
                    b.this.c(a4.left, a4.top);
                }
            }
        });
    }

    private void a(float f2, float f3) {
        if (f2 != 0.0f || f3 != 0.0f) {
            this.o.postTranslate(f2, f3);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(double d2, double d3) {
        RectF bitmapRect = getBitmapRect();
        this.z.set((float) d2, (float) d3, 0.0f, 0.0f);
        a(bitmapRect, this.z);
        a(this.z.left, this.z.top);
        b();
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i2) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void b(float f2, float f3, float f4) {
        this.o.postScale(f2, f2, f3, f4);
        setImageMatrix(getImageViewMatrix());
    }

    public b(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f158094m = new g.a.a.a.a.a();
        this.n = new Matrix();
        this.o = new Matrix();
        this.q = new Handler();
        this.r = null;
        this.s = false;
        this.f158083a = -1.0f;
        this.f158084b = -1.0f;
        this.t = new Matrix();
        this.u = new float[9];
        this.f158087e = -1;
        this.f158088f = -1;
        this.f158089g = new PointF();
        this.v = a.NONE;
        this.w = 200;
        this.x = new RectF();
        this.y = new RectF();
        this.z = new RectF();
        a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, float f4) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        b(f2 / getScale(), f3, f4);
        getScale();
        b();
    }

    public final void b(final Drawable drawable, final Matrix matrix, final float f2, final float f3) {
        if (getWidth() <= 0) {
            this.r = new Runnable() {
                /* class g.a.a.a.b.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(104957);
                }

                public final void run() {
                    b.this.b(drawable, matrix, f2, f3);
                }
            };
        } else {
            a(drawable, matrix, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(float f2, float f3, float f4, final float f5) {
        if (f2 > getMaxScale()) {
            f2 = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f6 = f2 - scale;
        Matrix matrix = new Matrix(this.o);
        matrix.postScale(f2, f2, f3, f4);
        RectF a2 = a(matrix);
        final float f7 = f3 + (a2.left * f2);
        final float f8 = f4 + (a2.top * f2);
        this.q.post(new Runnable() {
            /* class g.a.a.a.b.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(104959);
            }

            public final void run() {
                float min = Math.min(f5, (float) (System.currentTimeMillis() - currentTimeMillis));
                b.this.a(scale + ((float) b.this.f158094m.b((double) min, (double) f6, (double) f5)), f7, f8);
                if (min < f5) {
                    b.this.q.post(this);
                    return;
                }
                b bVar = b.this;
                bVar.a(bVar.getScale());
                b.this.b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bb, code lost:
        if (r7 != getScale()) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.b.b.onLayout(boolean, int, int, int, int):void");
    }
}
