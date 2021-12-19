package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;

public final class FlashSaleBg extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f86820a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f86821b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f86822c;

    static {
        Covode.recordClassIndex(54399);
    }

    public FlashSaleBg(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FlashSaleBg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setFlashSaleBg(Bitmap bitmap) {
        l.d(bitmap, "");
        this.f86820a = bitmap;
        if (this.f86821b == null && getWidth() > 0 && getHeight() > 0) {
            a(bitmap);
        }
        invalidate();
    }

    private final void a(Bitmap bitmap) {
        MethodCollector.i(7815);
        float width = ((float) bitmap.getWidth()) / (((float) bitmap.getHeight()) / ((float) getHeight()));
        if (this.f86821b == null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) width, getHeight(), true);
            if (gb.a()) {
                l.b(createScaledBitmap, "");
                int width2 = createScaledBitmap.getWidth();
                int height = createScaledBitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(-1.0f, 1.0f);
                createScaledBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, width2, height, matrix, true);
            }
            this.f86821b = createScaledBitmap;
        }
        MethodCollector.o(7815);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(7882);
        try {
            Bitmap bitmap = this.f86820a;
            if (bitmap != null) {
                this.f86822c.setColor(bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1));
                a(bitmap);
            }
            Context context = getContext();
            l.b(context, "");
            if (i.a(context)) {
                if (canvas != null) {
                    Bitmap bitmap2 = this.f86821b;
                    if (bitmap2 == null) {
                        l.b();
                    }
                    int width = getWidth();
                    Bitmap bitmap3 = this.f86821b;
                    if (bitmap3 == null) {
                        l.b();
                    }
                    canvas.drawBitmap(bitmap2, (float) (width - bitmap3.getWidth()), 0.0f, this.f86822c);
                    canvas.drawRect(0.0f, 0.0f, ((float) getWidth()) - 100.0f, (float) getHeight(), this.f86822c);
                }
            } else if (canvas != null) {
                Bitmap bitmap4 = this.f86821b;
                if (bitmap4 == null) {
                    l.b();
                }
                canvas.drawBitmap(bitmap4, 0.0f, 0.0f, this.f86822c);
                canvas.drawRect(100.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f86822c);
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
        MethodCollector.o(7882);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlashSaleBg(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(7922);
        this.f86822c = new Paint();
        setWillNotDraw(false);
        MethodCollector.o(7922);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FlashSaleBg(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
