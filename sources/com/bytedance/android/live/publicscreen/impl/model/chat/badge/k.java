package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.android.live.design.widget.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k extends a {

    /* renamed from: e  reason: collision with root package name */
    public int f12453e = -16777216;

    /* renamed from: f  reason: collision with root package name */
    public int f12454f;

    /* renamed from: g  reason: collision with root package name */
    public int f12455g;

    /* renamed from: h  reason: collision with root package name */
    public String f12456h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f12457i = -16777216;

    /* renamed from: j  reason: collision with root package name */
    public int f12458j;

    /* renamed from: k  reason: collision with root package name */
    public int f12459k = 8;

    /* renamed from: l  reason: collision with root package name */
    public int f12460l = 400;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f12461m = new RectF();

    static {
        Covode.recordClassIndex(6841);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f12456h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        l.d(context, "");
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.a
    public final int b(Paint paint) {
        l.d(paint, "");
        c.a(this.f12437d, paint, this.f12459k, this.f12460l);
        return ((int) paint.measureText(this.f12456h)) + (this.f12455g * 2) + this.f12458j;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.a
    public final void a(Canvas canvas, Paint paint) {
        l.d(canvas, "");
        l.d(paint, "");
        paint.setAntiAlias(true);
        this.f12461m.bottom = (float) this.f12435b;
        this.f12461m.right = (float) this.f12434a;
        paint.setColor(this.f12453e);
        RectF rectF = this.f12461m;
        int i2 = this.f12454f;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        c.a(this.f12437d, paint, this.f12459k, this.f12460l);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.f12457i);
        canvas.drawText(this.f12456h, (float) this.f12455g, ((float) ((this.f12435b - fontMetricsInt.bottom) - fontMetricsInt.top)) / 2.0f, paint);
    }
}
