package com.bytedance.android.livesdk.widget.roundcorner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    int f22644a;

    /* renamed from: b  reason: collision with root package name */
    int f22645b;

    /* renamed from: c  reason: collision with root package name */
    int f22646c;

    /* renamed from: d  reason: collision with root package name */
    int f22647d;

    /* renamed from: e  reason: collision with root package name */
    final RectF f22648e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    final float[] f22649f = new float[8];

    /* renamed from: g  reason: collision with root package name */
    final Path f22650g = new Path();

    /* renamed from: h  reason: collision with root package name */
    final Paint f22651h = new Paint(1);

    /* renamed from: i  reason: collision with root package name */
    final PorterDuffXfermode f22652i = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    /* renamed from: j  reason: collision with root package name */
    final a f22653j;

    static {
        Covode.recordClassIndex(13369);
    }

    public c(a aVar) {
        l.d(aVar, "");
        this.f22653j = aVar;
    }

    static int a(Canvas canvas, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 21) {
            return canvas.saveLayer(rectF, paint);
        }
        return canvas.saveLayer(rectF, paint, 31);
    }
}
