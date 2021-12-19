package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class DmtThreeAngleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126030a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f126031b;

    /* renamed from: c  reason: collision with root package name */
    private int f126032c;

    /* renamed from: d  reason: collision with root package name */
    private int f126033d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f126034e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f126035f;

    static {
        Covode.recordClassIndex(82780);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82781);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void setOrientation(int i2) {
        this.f126033d = i2;
    }

    public final void setBgColor(int i2) {
        this.f126034e.setColor(i2);
    }

    public final void setRoundRadius(int i2) {
        this.f126034e.setPathEffect(new CornerPathEffect((float) i2));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        int i2 = this.f126033d;
        if (i2 == 1) {
            this.f126035f.moveTo(0.0f, (float) this.f126032c);
            this.f126035f.lineTo((float) (this.f126031b / 2), 0.0f);
            this.f126035f.lineTo((float) this.f126031b, (float) this.f126032c);
            this.f126035f.lineTo((float) this.f126031b, (float) this.f126032c);
            this.f126035f.lineTo(0.0f, (float) this.f126032c);
            this.f126035f.lineTo(0.0f, (float) this.f126032c);
        } else if (i2 == 2) {
            this.f126035f.moveTo(0.0f, 0.0f);
            this.f126035f.lineTo((float) (this.f126031b / 2), (float) this.f126032c);
            this.f126035f.lineTo((float) this.f126031b, (float) this.f126032c);
            this.f126035f.lineTo(0.0f, 0.0f);
        } else if (i2 == 3) {
            this.f126035f.moveTo((float) this.f126031b, 0.0f);
            this.f126035f.lineTo((float) this.f126031b, (float) this.f126032c);
            this.f126035f.lineTo(0.0f, (float) (this.f126032c / 2));
            this.f126035f.lineTo((float) this.f126031b, 0.0f);
        } else if (i2 == 4) {
            this.f126035f.moveTo(0.0f, 0.0f);
            this.f126035f.lineTo((float) this.f126031b, (float) (this.f126032c / 2));
            this.f126035f.lineTo(0.0f, (float) this.f126032c);
            this.f126035f.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.f126035f, this.f126034e);
    }

    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(4187);
        super.onMeasure(i2, i3);
        this.f126031b = View.MeasureSpec.getSize(i2);
        this.f126032c = View.MeasureSpec.getSize(i3);
        MethodCollector.o(4187);
    }

    private /* synthetic */ DmtThreeAngleView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtThreeAngleView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4200);
        this.f126033d = 1;
        Paint paint = new Paint();
        this.f126034e = paint;
        this.f126035f = new Path();
        paint.setAntiAlias(true);
        MethodCollector.o(4200);
    }
}
