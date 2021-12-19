package com.lynx.tasm.image.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.image.a.a;
import com.lynx.tasm.image.b;

/* access modifiers changed from: package-private */
public final class d extends com.lynx.tasm.image.d {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuffXfermode f56698b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: c  reason: collision with root package name */
    private final Paint f56699c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private final Rect f56700d = new Rect();

    static {
        Covode.recordClassIndex(35335);
    }

    d(com.lynx.tasm.image.d dVar) {
        super(dVar);
    }

    @Override // com.lynx.tasm.image.d
    public final void b(Canvas canvas, Bitmap bitmap, b bVar) {
        a aVar = bVar.q;
        if (aVar == null) {
            super.b(canvas, bitmap, bVar);
            return;
        }
        int i2 = 0;
        com.lynx.tasm.behavior.ui.a.a aVar2 = aVar.f56674a;
        int i3 = bVar.f56678d;
        int i4 = bVar.f56679e;
        if (aVar2 != null) {
            i2 = canvas.saveLayer(0.0f, 0.0f, (float) i3, (float) i4, null, 31);
        }
        super.b(canvas, bitmap, bVar);
        if (aVar2 != null) {
            this.f56700d.right = i3;
            this.f56700d.bottom = i4;
            aVar2.setBounds(this.f56700d);
            Shader shader = aVar2.f56100a;
            this.f56699c.setXfermode(f56698b);
            this.f56699c.setShader(shader);
            canvas.drawRect(this.f56700d, this.f56699c);
            canvas.restoreToCount(i2);
        }
    }
}
