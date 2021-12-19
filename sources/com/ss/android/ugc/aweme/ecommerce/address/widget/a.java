package com.ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final C2019a f84613a = new C2019a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Paint f84614b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f84615c;

    static {
        Covode.recordClassIndex(52814);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.a$a  reason: collision with other inner class name */
    public static final class C2019a {
        static {
            Covode.recordClassIndex(52815);
        }

        private C2019a() {
        }

        public /* synthetic */ C2019a(byte b2) {
            this();
        }
    }

    public final void setButtonBackgroundColor(int i2) {
        this.f84614b.setColor(i2);
    }

    public final void setCrossLineColor(int i2) {
        this.f84615c.setColor(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4669);
        this.f84614b = new Paint();
        this.f84615c = new Paint();
        this.f84614b.setStyle(Paint.Style.FILL);
        this.f84614b.setAntiAlias(true);
        this.f84615c.setStyle(Paint.Style.STROKE);
        this.f84615c.setStrokeCap(Paint.Cap.ROUND);
        this.f84615c.setAntiAlias(true);
        setButtonBackgroundColor(b.c(context, R.color.bz));
        setCrossLineColor(b.c(context, R.color.f159928l));
        MethodCollector.o(4669);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(4661);
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.f84615c.getStrokeWidth() <= 0.0f) {
                this.f84615c.setStrokeWidth(((float) getHeight()) * 0.1f);
            }
            int height = getHeight();
            float height2 = ((float) getHeight()) / 2.0f;
            int width = getWidth() - getPaddingRight();
            float height3 = ((float) getHeight()) / 2.0f;
            float height4 = ((float) getHeight()) * 0.5f;
            float f2 = (float) height;
            float f3 = ((float) width) - ((f2 - height4) / 2.0f);
            float f4 = f3 - height4;
            float f5 = height4 / 2.0f;
            canvas.drawCircle(height3, height2, f2 / 2.0f, this.f84614b);
            canvas.save();
            canvas.rotate(45.0f, height3, height2);
            canvas.drawLine(f4, height2, f3, height2, this.f84615c);
            canvas.drawLine(height3, height2 - f5, height3, height2 + f5, this.f84615c);
            canvas.restore();
        }
        MethodCollector.o(4661);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
