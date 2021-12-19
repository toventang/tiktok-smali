package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.List;

public final class c extends View {

    /* renamed from: a  reason: collision with root package name */
    private List<float[]> f130468a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f130469b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private final Path f130470c = new Path();

    static {
        Covode.recordClassIndex(85560);
    }

    public final List<float[]> getPoints() {
        return this.f130468a;
    }

    public final void setPoints(List<float[]> list) {
        this.f130468a = list;
    }

    public c(Context context) {
        super(context);
        MethodCollector.i(2493);
        MethodCollector.o(2493);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        List<float[]> list;
        MethodCollector.i(2492);
        super.onDraw(canvas);
        Context context = getContext();
        l.b(context, "");
        if (!com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(context) || (list = this.f130468a) == null) {
            MethodCollector.o(2492);
            return;
        }
        for (float[] fArr : list) {
            if (fArr != null) {
                this.f130470c.reset();
                this.f130470c.moveTo(fArr[0], fArr[1]);
                this.f130470c.lineTo(fArr[2], fArr[3]);
                this.f130470c.lineTo(fArr[6], fArr[7]);
                this.f130470c.lineTo(fArr[4], fArr[5]);
                this.f130470c.close();
                if (canvas != null) {
                    canvas.drawPath(this.f130470c, this.f130469b);
                }
            }
        }
        MethodCollector.o(2492);
    }
}
