package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f12440e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f12441f = new Rect();

    static {
        Covode.recordClassIndex(6831);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.a
    public final int b(Paint paint) {
        l.d(paint, "");
        int width = (this.f12435b * this.f12440e.getWidth()) / this.f12440e.getHeight();
        this.f12441f.right = width;
        this.f12441f.bottom = this.f12435b;
        return width;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, Bitmap bitmap) {
        super(context);
        l.d(context, "");
        l.d(bitmap, "");
        this.f12440e = bitmap;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.a
    public final void a(Canvas canvas, Paint paint) {
        l.d(canvas, "");
        l.d(paint, "");
        if (!this.f12440e.isRecycled()) {
            canvas.drawBitmap(this.f12440e, (Rect) null, this.f12441f, (Paint) null);
        }
    }
}
