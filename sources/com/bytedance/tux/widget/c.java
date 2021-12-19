package com.bytedance.tux.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.a;
import h.f.b.l;

public final class c implements a.AbstractC1122a {

    /* renamed from: a  reason: collision with root package name */
    float[] f45659a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f45660b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f45661c;

    /* renamed from: d  reason: collision with root package name */
    public final Region f45662d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f45663e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45664f;

    /* renamed from: g  reason: collision with root package name */
    public int f45665g;

    /* renamed from: h  reason: collision with root package name */
    public int f45666h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f45667i;

    static {
        Covode.recordClassIndex(27792);
    }

    @Override // com.bytedance.tux.widget.a.AbstractC1122a
    public final boolean a() {
        return this.f45667i;
    }

    @Override // com.bytedance.tux.widget.a.AbstractC1122a
    public final float[] b() {
        return this.f45659a;
    }

    private /* synthetic */ c() {
        this(false, -1, 0, false, 0, 0, 0, 0);
    }

    public final void a(View view) {
        float width;
        l.c(view, "");
        int width2 = (int) this.f45663e.width();
        int height = (int) this.f45663e.height();
        RectF rectF = new RectF();
        rectF.left = (float) view.getPaddingLeft();
        rectF.top = (float) view.getPaddingTop();
        float f2 = (float) width2;
        rectF.right = f2 - ((float) view.getPaddingRight());
        float f3 = (float) height;
        rectF.bottom = f3 - ((float) view.getPaddingBottom());
        this.f45660b.reset();
        if (this.f45664f) {
            if (rectF.width() >= rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f4 = width / 2.0f;
            float f5 = (float) (width2 / 2);
            float f6 = (float) (height / 2);
            PointF pointF = new PointF(f5, f6);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f45660b.addCircle(pointF.x, pointF.y, f4, Path.Direction.CW);
                this.f45660b.moveTo(0.0f, 0.0f);
                this.f45660b.moveTo(f2, f3);
            } else {
                float f7 = f6 - f4;
                this.f45660b.moveTo(rectF.left, f7);
                this.f45660b.addCircle(pointF.x, f7 + f4, f4, Path.Direction.CW);
            }
        } else {
            this.f45660b.addRoundRect(rectF, this.f45659a, Path.Direction.CW);
        }
        this.f45662d.setPath(this.f45660b, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }

    public c(boolean z, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
        this.f45664f = z;
        this.f45665g = i2;
        this.f45666h = i3;
        this.f45667i = z2;
        float f2 = (float) i4;
        float f3 = (float) i5;
        float f4 = (float) i7;
        float f5 = (float) i6;
        this.f45659a = new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        this.f45660b = new Path();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        this.f45661c = paint;
        this.f45662d = new Region();
        this.f45663e = new RectF();
    }
}
