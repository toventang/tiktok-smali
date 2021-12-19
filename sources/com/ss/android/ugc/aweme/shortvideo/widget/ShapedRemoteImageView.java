package com.ss.android.ugc.aweme.shortvideo.widget;

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
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

public class ShapedRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f132847a;

    /* renamed from: b  reason: collision with root package name */
    private float f132848b;

    /* renamed from: c  reason: collision with root package name */
    private int f132849c = 637534208;

    /* renamed from: d  reason: collision with root package name */
    private float f132850d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f132851e;

    /* renamed from: f  reason: collision with root package name */
    private Path f132852f;

    /* renamed from: g  reason: collision with root package name */
    private Shape f132853g;

    /* renamed from: h  reason: collision with root package name */
    private Shape f132854h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f132855i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f132856j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f132857k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f132858l;

    /* renamed from: m  reason: collision with root package name */
    private a f132859m;
    private PorterDuffXfermode n;

    public interface a {
        static {
            Covode.recordClassIndex(86913);
        }
    }

    static {
        Covode.recordClassIndex(86912);
    }

    private void c() {
        Bitmap bitmap = this.f132858l;
        if (bitmap != null) {
            bitmap.recycle();
            this.f132858l = null;
        }
    }

    @Override // com.facebook.drawee.view.c
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f132858l == null) {
            b();
        }
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        k.a(this);
    }

    private Bitmap b() {
        MethodCollector.i(4826);
        if (this.f132850d <= 0.0f) {
            MethodCollector.o(4826);
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            MethodCollector.o(4826);
            return null;
        }
        c();
        this.f132858l = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f132858l);
        Paint paint = new Paint(1);
        paint.setColor(this.f132849c);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        Bitmap bitmap = this.f132858l;
        MethodCollector.o(4826);
        return bitmap;
    }

    public void setExtension(a aVar) {
        this.f132859m = aVar;
        requestLayout();
    }

    public void setShapeMode(int i2) {
        b(i2, this.f132848b);
    }

    public void setShapeRadius(float f2) {
        b(this.f132847a, f2);
    }

    public void setStrokeColor(int i2) {
        a(i2, this.f132850d);
    }

    public void setStrokeWidth(float f2) {
        a(this.f132849c, f2);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Shape shape;
        super.onDraw(canvas);
        if (!(this.f132850d <= 0.0f || this.f132854h == null || this.f132858l == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            this.f132856j.setXfermode(null);
            canvas.drawBitmap(this.f132858l, 0.0f, 0.0f, this.f132856j);
            float f2 = this.f132850d;
            canvas.translate(f2, f2);
            if (this.n == null) {
                this.n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.f132856j.setXfermode(this.n);
            this.f132854h.draw(canvas, this.f132856j);
            canvas.restoreToCount(saveLayer);
        }
        if (this.f132859m != null) {
            canvas.drawPath(this.f132852f, this.f132857k);
        }
        int i2 = this.f132847a;
        if ((i2 == 1 || i2 == 2) && (shape = this.f132853g) != null) {
            shape.draw(canvas, this.f132855i);
        }
    }

    private void b(int i2, float f2) {
        boolean z;
        if (this.f132847a == i2 && this.f132848b == f2) {
            z = false;
        } else {
            z = true;
        }
        this.f132851e = z;
        if (z) {
            this.f132847a = i2;
            this.f132848b = f2;
            this.f132853g = null;
            this.f132854h = null;
            requestLayout();
        }
    }

    private void a(int i2, float f2) {
        float f3 = this.f132850d;
        if (f3 > 0.0f) {
            if (f3 != f2) {
                this.f132850d = f2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Shape shape = this.f132854h;
                float f4 = this.f132850d;
                shape.resize(((float) measuredWidth) - (f4 * 2.0f), ((float) measuredHeight) - (f4 * 2.0f));
                postInvalidate();
            }
            if (this.f132849c != i2) {
                this.f132849c = i2;
                b();
                postInvalidate();
            }
        }
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2 = Build.VERSION.SDK_INT;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa7, R.attr.abr, R.attr.afp, R.attr.afq});
            this.f132847a = obtainStyledAttributes.getInt(1, 0);
            this.f132848b = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f132850d = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f132849c = obtainStyledAttributes.getColor(2, this.f132849c);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f132855i = paint;
        paint.setFilterBitmap(true);
        this.f132855i.setColor(-16777216);
        this.f132855i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.f132856j = paint2;
        paint2.setFilterBitmap(true);
        this.f132856j.setColor(-16777216);
        Paint paint3 = new Paint(1);
        this.f132857k = paint3;
        paint3.setFilterBitmap(true);
        this.f132857k.setColor(-16777216);
        this.f132857k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f132852f = new Path();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || this.f132851e) {
            this.f132851e = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f132847a == 2) {
                this.f132848b = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
            }
            if (this.f132853g == null || this.f132848b != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f132848b);
                this.f132853g = new RoundRectShape(fArr, null, null);
                this.f132854h = new RoundRectShape(fArr, null, null);
            }
            float f2 = (float) measuredWidth;
            float f3 = (float) measuredHeight;
            this.f132853g.resize(f2, f3);
            Shape shape = this.f132854h;
            float f4 = this.f132850d;
            shape.resize(f2 - (f4 * 2.0f), f3 - (f4 * 2.0f));
            b();
        }
    }
}
