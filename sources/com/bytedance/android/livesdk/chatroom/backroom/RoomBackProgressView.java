package com.bytedance.android.livesdk.chatroom.backroom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class RoomBackProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f14991a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f14992b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final float f14993c = ((float) y.a(2.0f));

    /* renamed from: d  reason: collision with root package name */
    private float f14994d = 0.0f;

    static {
        Covode.recordClassIndex(8325);
    }

    public float getProgress() {
        return this.f14994d;
    }

    private void a() {
        this.f14991a.setAntiAlias(true);
        this.f14991a.setStyle(Paint.Style.STROKE);
        this.f14991a.setStrokeCap(Paint.Cap.ROUND);
        this.f14991a.setStrokeWidth(this.f14993c);
        this.f14991a.setColor(-1);
    }

    public void setProgress(float f2) {
        this.f14994d = f2;
        invalidate();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawArc(this.f14992b, -90.0f, -this.f14994d, false, this.f14991a);
    }

    public RoomBackProgressView(Context context) {
        super(context);
        MethodCollector.i(10457);
        a();
        MethodCollector.o(10457);
    }

    public RoomBackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10458);
        a();
        MethodCollector.o(10458);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        RectF rectF = this.f14992b;
        float f2 = this.f14993c;
        float f3 = (float) i2;
        rectF.set(f2 / 2.0f, f2 / 2.0f, f3 - (f2 / 2.0f), f3 - (f2 / 2.0f));
    }
}
