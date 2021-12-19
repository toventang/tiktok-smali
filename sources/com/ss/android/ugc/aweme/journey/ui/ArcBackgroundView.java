package com.ss.android.ugc.aweme.journey.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ArcBackgroundView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f105184a;

    /* renamed from: b  reason: collision with root package name */
    private int f105185b;

    /* renamed from: c  reason: collision with root package name */
    private int f105186c;

    /* renamed from: d  reason: collision with root package name */
    private Path f105187d;

    /* renamed from: e  reason: collision with root package name */
    private int f105188e;

    /* renamed from: f  reason: collision with root package name */
    private ShapeDrawable f105189f;

    /* renamed from: g  reason: collision with root package name */
    private PathShape f105190g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f105191h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f105192i;

    static {
        Covode.recordClassIndex(67436);
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(6767);
        l.d(canvas, "");
        super.onDraw(canvas);
        Path path = this.f105187d;
        if (path == null) {
            l.b();
        }
        path.reset();
        Path path2 = this.f105187d;
        if (path2 == null) {
            l.b();
        }
        path2.moveTo(0.0f, 0.0f);
        RectF rectF = this.f105191h;
        if (rectF != null) {
            Path path3 = this.f105187d;
            if (path3 == null) {
                l.b();
            }
            path3.arcTo(rectF, 0.0f, 180.0f);
        }
        Path path4 = this.f105187d;
        if (path4 == null) {
            l.b();
        }
        path4.lineTo(0.0f, (float) this.f105185b);
        Path path5 = this.f105187d;
        if (path5 == null) {
            l.b();
        }
        path5.lineTo((float) this.f105184a, (float) this.f105185b);
        Path path6 = this.f105187d;
        if (path6 == null) {
            l.b();
        }
        path6.lineTo((float) this.f105184a, 0.0f);
        Path path7 = this.f105187d;
        if (path7 == null) {
            l.b();
        }
        path7.close();
        if (this.f105190g == null || this.f105192i) {
            Path path8 = this.f105187d;
            if (path8 == null) {
                l.b();
            }
            this.f105190g = new PathShape(path8, (float) this.f105184a, (float) this.f105185b);
            if (this.f105192i) {
                this.f105192i = false;
            }
        }
        ShapeDrawable shapeDrawable = this.f105189f;
        if (shapeDrawable == null) {
            l.b();
        }
        shapeDrawable.setShape(this.f105190g);
        ShapeDrawable shapeDrawable2 = this.f105189f;
        if (shapeDrawable2 == null) {
            l.b();
        }
        shapeDrawable2.setBounds(0, 0, this.f105184a, this.f105185b);
        ShapeDrawable shapeDrawable3 = this.f105189f;
        if (shapeDrawable3 == null) {
            l.b();
        }
        Paint paint = shapeDrawable3.getPaint();
        l.b(paint, "");
        paint.setColor(this.f105188e);
        ShapeDrawable shapeDrawable4 = this.f105189f;
        if (shapeDrawable4 == null) {
            l.b();
        }
        shapeDrawable4.draw(canvas);
        MethodCollector.o(6767);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(6759);
        super.onMeasure(i2, i3);
        this.f105184a = View.MeasureSpec.getSize(i2);
        this.f105185b = View.MeasureSpec.getSize(i3);
        this.f105192i = true;
        MethodCollector.o(6759);
    }

    private /* synthetic */ ArcBackgroundView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ArcBackgroundView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6771);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f159890a, R.attr.f159891b});
        l.b(obtainStyledAttributes, "");
        this.f105188e = obtainStyledAttributes.getColor(0, this.f105188e);
        this.f105186c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f105187d = new Path();
        obtainStyledAttributes.recycle();
        this.f105189f = new ShapeDrawable();
        int i2 = this.f105186c;
        this.f105191h = new RectF(0.0f, (float) (-i2), (float) (i2 * 2), (float) i2);
        MethodCollector.o(6771);
    }
}
