package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class ak extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f21805a;

    /* renamed from: b  reason: collision with root package name */
    public int f21806b;

    /* renamed from: c  reason: collision with root package name */
    public Context f21807c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f21808d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f21809e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    private int f21810f;

    /* renamed from: g  reason: collision with root package name */
    private int f21811g;

    /* renamed from: h  reason: collision with root package name */
    private int f21812h;

    /* renamed from: i  reason: collision with root package name */
    private int f21813i;

    /* renamed from: j  reason: collision with root package name */
    private int f21814j = 12;

    /* renamed from: k  reason: collision with root package name */
    private int f21815k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f21816l;

    /* renamed from: m  reason: collision with root package name */
    private a f21817m;
    private a n;
    private PathEffect o;
    private float p;
    private float q;
    private float r;

    static {
        Covode.recordClassIndex(12850);
    }

    public final void setColor(int i2) {
        this.f21815k = i2;
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public float f21818a;

        /* renamed from: b  reason: collision with root package name */
        public float f21819b;

        /* renamed from: c  reason: collision with root package name */
        float f21820c = 2.0f;

        static {
            Covode.recordClassIndex(12851);
        }

        public a() {
            a(0);
        }

        public final void a(int i2) {
            float b2 = (((float) ak.this.f21805a) - n.b(ak.this.f21807c, 2.0f)) / this.f21820c;
            double d2 = (double) i2;
            Double.isNaN(d2);
            double d3 = (d2 * 3.141592653589793d) / 180.0d;
            this.f21818a = (((float) ak.this.f21805a) / this.f21820c) + (((float) Math.cos(d3)) * b2);
            this.f21819b = (((float) ak.this.f21806b) / this.f21820c) + (((float) Math.sin(d3)) * b2);
        }
    }

    public ak(Context context) {
        super(context);
        MethodCollector.i(866);
        this.f21807c = context;
        this.f21810f = 0;
        this.f21811g = 0;
        this.f21816l = new RectF();
        this.f21817m = new a();
        this.n = new a();
        this.o = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.p = n.b(this.f21807c, 1.9f);
        this.q = n.b(this.f21807c, 2.0f);
        this.r = n.b(this.f21807c, 2.0f) / 2.0f;
        MethodCollector.o(866);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(871);
        super.onDraw(canvas);
        if (this.f21808d == null) {
            Paint paint = new Paint();
            this.f21808d = paint;
            paint.setAntiAlias(true);
            this.f21808d.setStyle(Paint.Style.STROKE);
        }
        this.f21808d.setColor(this.f21815k);
        this.f21808d.setPathEffect(this.o);
        this.f21808d.setStrokeWidth(this.p);
        canvas.drawArc(this.f21816l, ((float) this.f21810f) / 4.0f, 359.0f, false, this.f21808d);
        this.f21808d.setPathEffect(null);
        int i2 = this.f21810f;
        double d2 = (double) i2;
        Double.isNaN(d2);
        int sin = (int) (Math.sin((d2 * 3.141592653589793d) / 90.0d) * 345.0d * -1.0d);
        if (i2 >= 0 && (i2 < 45 || ((135 <= i2 && i2 < 225) || (315 <= i2 && i2 < 360)))) {
            sin = -sin;
        }
        if (this.f21810f % 90 == 45) {
            int i3 = this.f21811g;
            int i4 = this.f21812h;
            this.f21813i = (i3 - i4) - 1;
            this.f21811g = i4 + 1;
        }
        if (sin == 0) {
            this.f21811g += this.f21813i;
        }
        this.f21808d.setStrokeWidth(this.q);
        canvas.drawArc(this.f21816l, (float) (this.f21811g - this.f21814j), (float) sin, false, this.f21808d);
        this.f21817m.a(this.f21811g - this.f21814j);
        this.n.a((this.f21811g - this.f21814j) + sin);
        this.f21809e.setColor(this.f21815k);
        canvas.drawCircle(this.f21817m.f21818a, this.f21817m.f21819b, this.r, this.f21809e);
        canvas.drawCircle(this.n.f21818a, this.n.f21819b, this.r, this.f21809e);
        int i5 = this.f21811g;
        this.f21812h = sin + i5;
        this.f21810f = (this.f21810f + 1) % 360;
        this.f21811g = (i5 + 1) % 360;
        postInvalidateDelayed(15);
        MethodCollector.o(871);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(867);
        super.onMeasure(i2, i3);
        this.f21805a = View.MeasureSpec.getSize(i2);
        this.f21806b = View.MeasureSpec.getSize(i3);
        float b2 = n.b(this.f21807c, 1.0f);
        this.f21816l.set(b2, b2, ((float) this.f21805a) - b2, ((float) this.f21806b) - b2);
        MethodCollector.o(867);
    }
}
