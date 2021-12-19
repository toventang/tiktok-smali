package com.bytedance.ies.bullet.service.popup.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Paint f32911a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f32912b;

    /* renamed from: c  reason: collision with root package name */
    private Path f32913c;

    /* renamed from: d  reason: collision with root package name */
    private Path f32914d;

    /* renamed from: e  reason: collision with root package name */
    private Xfermode f32915e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f32916f;

    /* renamed from: g  reason: collision with root package name */
    private float f32917g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private View f32918h;

    static {
        Covode.recordClassIndex(19652);
    }

    public final void a(Canvas canvas) {
        if (this.f32917g > 0.0f) {
            canvas.saveLayer(this.f32912b, null, 31);
        }
    }

    public final void a(float f2) {
        this.f32917g = f2;
        float[] fArr = this.f32916f;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        View view = this.f32918h;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void a(View view) {
        PorterDuff.Mode mode;
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.parseColor("#00000000"));
        }
        this.f32918h = view;
        this.f32916f = new float[8];
        this.f32911a = new Paint();
        this.f32912b = new RectF();
        this.f32913c = new Path();
        this.f32914d = new Path();
        if (Build.VERSION.SDK_INT >= 23) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        this.f32915e = new PorterDuffXfermode(mode);
    }

    public final void b(Canvas canvas) {
        if (this.f32917g > 0.0f) {
            this.f32911a.reset();
            this.f32913c.reset();
            this.f32911a.setAntiAlias(true);
            this.f32911a.setStyle(Paint.Style.FILL);
            this.f32911a.setXfermode(this.f32915e);
            this.f32913c.addRoundRect(this.f32912b, this.f32916f, Path.Direction.CCW);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f32914d.reset();
                this.f32914d.addRect(this.f32912b, Path.Direction.CCW);
                this.f32914d.op(this.f32913c, Path.Op.DIFFERENCE);
                canvas.drawPath(this.f32914d, this.f32911a);
            } else {
                canvas.drawPath(this.f32913c, this.f32911a);
            }
            this.f32911a.setXfermode(null);
            canvas.restore();
        }
    }

    public final void a(int i2, int i3) {
        RectF rectF = this.f32912b;
        if (rectF != null && this.f32917g > 0.0f) {
            rectF.set(0.0f, 0.0f, (float) i2, (float) i3);
        }
    }
}
