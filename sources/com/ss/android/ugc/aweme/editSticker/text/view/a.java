package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    Paint f88643a;

    /* renamed from: b  reason: collision with root package name */
    int f88644b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f88645c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f88646d;

    /* renamed from: e  reason: collision with root package name */
    private int f88647e;

    static {
        Covode.recordClassIndex(55780);
    }

    public final int getColor() {
        return this.f88644b;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        float f2 = (float) width;
        canvas.drawCircle(f2, f2, (float) ((width - this.f88647e) - 4), this.f88646d);
        canvas.drawCircle(f2, f2, (float) (width - (this.f88647e * 2)), this.f88643a);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i2), getDefaultSize(getSuggestedMinimumHeight(), i3));
    }

    private a(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(3679);
        this.f88647e = 6;
        this.f88644b = -1;
        Paint paint = new Paint();
        this.f88646d = paint;
        paint.setColor(-1);
        this.f88646d.setAntiAlias(true);
        this.f88646d.setStyle(Paint.Style.STROKE);
        this.f88646d.setStrokeWidth((float) this.f88647e);
        Paint paint2 = new Paint();
        this.f88643a = paint2;
        paint2.setColor(this.f88644b);
        this.f88643a.setAntiAlias(true);
        this.f88643a.setStyle(Paint.Style.FILL);
        this.f88643a.setStrokeWidth((float) this.f88647e);
        MethodCollector.o(3679);
    }
}
