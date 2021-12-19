package com.ss.android.ugc.aweme.shortvideo.sticker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

public final class ShapedImageView extends SimpleDraweeView {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130696a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f130697b;

    /* renamed from: c  reason: collision with root package name */
    private float f130698c;

    /* renamed from: d  reason: collision with root package name */
    private int f130699d = 637534208;

    /* renamed from: e  reason: collision with root package name */
    private float f130700e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f130701f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f130702g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private Shape f130703h;

    /* renamed from: i  reason: collision with root package name */
    private Shape f130704i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f130705j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f130706k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f130707l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f130708m;
    private b n;
    private PorterDuffXfermode o;

    public interface b {
        static {
            Covode.recordClassIndex(85691);
        }
    }

    static {
        Covode.recordClassIndex(85689);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85690);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        Bitmap bitmap = this.f130708m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f130708m = null;
        }
    }

    @Override // com.facebook.drawee.view.c
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f130708m == null) {
            a();
        }
    }

    @Override // com.facebook.drawee.view.c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        k.a(this);
    }

    private final Bitmap a() {
        MethodCollector.i(5682);
        if (this.f130700e <= 0.0f) {
            MethodCollector.o(5682);
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            MethodCollector.o(5682);
            return null;
        }
        b();
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        this.f130708m = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(this.f130699d);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        Bitmap bitmap = this.f130708m;
        MethodCollector.o(5682);
        return bitmap;
    }

    public final void setExtension(b bVar) {
        this.n = bVar;
        requestLayout();
    }

    public final void setShapeMode(int i2) {
        b(i2, this.f130698c);
    }

    public final void setShapeRadius(float f2) {
        b(this.f130697b, f2);
    }

    public final void setStrokeColor(int i2) {
        a(i2, this.f130700e);
    }

    public final void setStrokeWidth(float f2) {
        a(this.f130699d, f2);
    }

    @Override // com.facebook.drawee.view.c
    public final void onDraw(Canvas canvas) {
        Shape shape;
        l.d(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmap = this.f130708m;
        if (!(this.f130700e <= 0.0f || this.f130704i == null || bitmap == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            Paint paint = this.f130706k;
            if (paint == null) {
                l.b();
            }
            paint.setXfermode(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f130706k);
            float f2 = this.f130700e;
            canvas.translate(f2, f2);
            if (this.o == null) {
                this.o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            Paint paint2 = this.f130706k;
            if (paint2 == null) {
                l.b();
            }
            paint2.setXfermode(this.o);
            Shape shape2 = this.f130704i;
            if (shape2 == null) {
                l.b();
            }
            shape2.draw(canvas, this.f130706k);
            canvas.restoreToCount(saveLayer);
        }
        if (this.n != null) {
            canvas.drawPath(this.f130702g, this.f130707l);
        }
        int i2 = this.f130697b;
        if ((i2 == 1 || i2 == 2) && (shape = this.f130703h) != null) {
            shape.draw(canvas, this.f130705j);
        }
    }

    private void b(int i2, float f2) {
        boolean z;
        if (this.f130697b == i2 && this.f130698c == f2) {
            z = false;
        } else {
            z = true;
        }
        this.f130701f = z;
        if (z) {
            this.f130697b = i2;
            this.f130698c = f2;
            this.f130703h = null;
            this.f130704i = null;
            requestLayout();
        }
    }

    private void a(int i2, float f2) {
        float f3 = this.f130700e;
        if (f3 > 0.0f) {
            if (f3 != f2) {
                this.f130700e = f2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Shape shape = this.f130704i;
                if (shape == null) {
                    l.b();
                }
                float f4 = this.f130700e;
                shape.resize(((float) measuredWidth) - (f4 * 2.0f), ((float) measuredHeight) - (f4 * 2.0f));
                postInvalidate();
            }
            if (this.f130699d != i2) {
                this.f130699d = i2;
                a();
                postInvalidate();
            }
        }
    }

    public ShapedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f130705j = paint;
        Paint paint2 = new Paint(1);
        this.f130706k = paint2;
        Paint paint3 = new Paint(1);
        this.f130707l = paint3;
        int i2 = Build.VERSION.SDK_INT;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv, R.attr.akw, R.attr.akx});
            l.b(obtainStyledAttributes, "");
            this.f130697b = obtainStyledAttributes.getInt(16, 0);
            this.f130698c = obtainStyledAttributes.getDimension(15, 0.0f);
            this.f130700e = obtainStyledAttributes.getDimension(18, 0.0f);
            this.f130699d = obtainStyledAttributes.getColor(17, this.f130699d);
            obtainStyledAttributes.recycle();
        }
        paint.setFilterBitmap(true);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        paint2.setColor(-16777216);
        paint3.setFilterBitmap(true);
        paint3.setColor(-16777216);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || this.f130701f) {
            this.f130701f = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f130697b == 2) {
                this.f130698c = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
            }
            if (this.f130703h == null || this.f130698c != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f130698c);
                this.f130703h = new RoundRectShape(fArr, null, null);
                this.f130704i = new RoundRectShape(fArr, null, null);
            }
            Shape shape = this.f130703h;
            if (shape == null) {
                l.b();
            }
            float f2 = (float) measuredWidth;
            float f3 = (float) measuredHeight;
            shape.resize(f2, f3);
            Shape shape2 = this.f130704i;
            if (shape2 == null) {
                l.b();
            }
            float f4 = this.f130700e;
            shape2.resize(f2 - (f4 * 2.0f), f3 - (f4 * 2.0f));
            a();
            b bVar = this.n;
        }
    }
}
