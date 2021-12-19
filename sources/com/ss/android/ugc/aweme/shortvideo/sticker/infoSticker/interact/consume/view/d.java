package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import h.f.b.l;

public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    private float[] f130471a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f130472b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private final Path f130473c = new Path();

    static {
        Covode.recordClassIndex(85561);
    }

    public final Path getPath() {
        return this.f130473c;
    }

    public final float[] getPoints() {
        return this.f130471a;
    }

    public final void setPoints(float[] fArr) {
        this.f130471a = fArr;
    }

    public d(Context context) {
        super(context);
        MethodCollector.i(2505);
        MethodCollector.o(2505);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(2504);
        super.onDraw(canvas);
        Context context = getContext();
        l.b(context, "");
        if (c.a(context) && this.f130471a != null) {
            this.f130473c.reset();
            Path path = this.f130473c;
            float[] fArr = this.f130471a;
            if (fArr == null) {
                l.b();
            }
            float f2 = fArr[0];
            float[] fArr2 = this.f130471a;
            if (fArr2 == null) {
                l.b();
            }
            path.moveTo(f2, fArr2[1]);
            Path path2 = this.f130473c;
            float[] fArr3 = this.f130471a;
            if (fArr3 == null) {
                l.b();
            }
            float f3 = fArr3[2];
            float[] fArr4 = this.f130471a;
            if (fArr4 == null) {
                l.b();
            }
            path2.lineTo(f3, fArr4[3]);
            Path path3 = this.f130473c;
            float[] fArr5 = this.f130471a;
            if (fArr5 == null) {
                l.b();
            }
            float f4 = fArr5[6];
            float[] fArr6 = this.f130471a;
            if (fArr6 == null) {
                l.b();
            }
            path3.lineTo(f4, fArr6[7]);
            Path path4 = this.f130473c;
            float[] fArr7 = this.f130471a;
            if (fArr7 == null) {
                l.b();
            }
            float f5 = fArr7[4];
            float[] fArr8 = this.f130471a;
            if (fArr8 == null) {
                l.b();
            }
            path4.lineTo(f5, fArr8[5]);
            this.f130473c.close();
            if (canvas != null) {
                canvas.drawPath(this.f130473c, this.f130472b);
                MethodCollector.o(2504);
                return;
            }
        }
        MethodCollector.o(2504);
    }
}
