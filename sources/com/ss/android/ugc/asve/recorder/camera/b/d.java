package com.ss.android.ugc.asve.recorder.camera.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.f.i;
import h.f.b.l;

public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    float f62242a;

    /* renamed from: b  reason: collision with root package name */
    float f62243b;

    /* renamed from: c  reason: collision with root package name */
    float f62244c;

    /* renamed from: d  reason: collision with root package name */
    boolean f62245d;

    /* renamed from: e  reason: collision with root package name */
    private final float f62246e;

    /* renamed from: f  reason: collision with root package name */
    private final float f62247f;

    /* renamed from: g  reason: collision with root package name */
    private final float f62248g;

    /* renamed from: h  reason: collision with root package name */
    private final Bitmap f62249h;

    /* renamed from: i  reason: collision with root package name */
    private final float f62250i;

    /* renamed from: j  reason: collision with root package name */
    private final float f62251j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f62252k;

    /* renamed from: l  reason: collision with root package name */
    private final int f62253l;

    static {
        Covode.recordClassIndex(38250);
    }

    public final float getProgress() {
        return this.f62244c;
    }

    public final float getSeekBarTotalLength() {
        return this.f62246e;
    }

    public final void setProgress(float f2) {
        float f3 = this.f62244c + ((f2 / ((float) this.f62253l)) / this.f62246e);
        if (f3 > 1.0f) {
            this.f62244c = 1.0f;
        } else if (f3 < 0.0f) {
            this.f62244c = 0.0f;
        } else {
            this.f62244c = f3;
        }
        this.f62245d = true;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(9991);
        this.f62246e = i.a(context, 120.0f);
        float a2 = i.a(context, 1.5f);
        this.f62247f = a2;
        this.f62248g = i.a(context, 16.0f);
        this.f62249h = BitmapFactory.decodeResource(getContext().getResources(), 2131232295);
        this.f62250i = i.a(context, 11.5f);
        this.f62251j = i.a(context, 8.5f);
        this.f62244c = 0.5f;
        Paint paint = new Paint();
        this.f62252k = paint;
        this.f62253l = 10;
        paint.setColor(-1);
        paint.setStrokeWidth(a2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        MethodCollector.o(9991);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(9821);
        l.d(canvas, "");
        super.onDraw(canvas);
        float f2 = this.f62243b;
        double d2 = (double) f2;
        float f3 = this.f62244c;
        double d3 = (double) f3;
        Double.isNaN(d3);
        double d4 = 0.5d - d3;
        float f4 = this.f62246e;
        float f5 = this.f62248g;
        double d5 = (double) (f4 - (2.0f * f5));
        Double.isNaN(d5);
        Double.isNaN(d2);
        double d6 = d2 + (d4 * d5);
        float f6 = this.f62251j;
        float f7 = f6 + ((this.f62250i - f6) * f3);
        if (this.f62245d) {
            float f8 = (float) d6;
            double d7 = (double) f2;
            double d8 = (double) f4;
            Double.isNaN(d8);
            Double.isNaN(d7);
            double d9 = d7 - (d8 * 0.5d);
            float f9 = f8 - f5;
            if (((double) f9) > d9) {
                float f10 = this.f62242a;
                canvas.drawLine(f10, f9, f10, (float) d9, this.f62252k);
            }
            double d10 = (double) this.f62243b;
            double d11 = (double) this.f62246e;
            Double.isNaN(d11);
            Double.isNaN(d10);
            double d12 = d10 + (d11 * 0.5d);
            float f11 = f8 + this.f62248g;
            if (d12 > ((double) f11)) {
                float f12 = this.f62242a;
                canvas.drawLine(f12, (float) d12, f12, f11, this.f62252k);
            }
        }
        float f13 = this.f62242a;
        float f14 = f13 - f7;
        double d13 = (double) f7;
        Double.isNaN(d13);
        double d14 = d6 - d13;
        float f15 = f13 + f7;
        Double.isNaN(d13);
        double d15 = d6 + d13;
        Bitmap bitmap = this.f62249h;
        l.b(bitmap, "");
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f62249h;
        l.b(bitmap2, "");
        canvas.drawBitmap(this.f62249h, new Rect(0, 0, width, bitmap2.getHeight()), new Rect((int) f14, (int) d14, (int) f15, (int) d15), this.f62252k);
        MethodCollector.o(9821);
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
