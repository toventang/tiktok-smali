package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.a.d;
import com.bytedance.ies.xelement.picker.e.f;
import com.bytedance.ies.xelement.picker.f.c;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f37278f = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private float N;
    private long O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private float T;
    private boolean U;
    private com.bytedance.ies.xelement.c.a V;

    /* renamed from: a  reason: collision with root package name */
    public f f37279a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37280b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f37281c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture<?> f37282d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37283e;

    /* renamed from: g  reason: collision with root package name */
    private b f37284g;

    /* renamed from: h  reason: collision with root package name */
    private Context f37285h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f37286i;

    /* renamed from: j  reason: collision with root package name */
    private GestureDetector f37287j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37288k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f37289l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f37290m;
    private Paint n;
    private d o;
    private String p;
    private int q;
    private int r;
    private int s;
    private int t;
    private float u;
    private Typeface v;
    private int w;
    private int x;
    private int y;
    private int z;

    public final d getAdapter() {
        return this.o;
    }

    public Handler getHandler() {
        return this.f37286i;
    }

    public int getInitPosition() {
        return this.F;
    }

    public float getItemHeight() {
        return this.u;
    }

    public float getTotalScrollY() {
        return this.E;
    }

    public int getItemsCount() {
        d dVar = this.o;
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(22420);
    }

    private void b() {
        float f2 = this.A;
        if (f2 < 1.0f) {
            this.A = 1.0f;
        } else if (f2 > 4.0f) {
            this.A = 4.0f;
        }
    }

    public final void a() {
        ScheduledFuture<?> scheduledFuture = this.f37282d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f37282d.cancel(true);
            this.f37282d = null;
        }
    }

    public enum a {
        CLICK,
        FLING,
        DAGGLE;

        static {
            Covode.recordClassIndex(22422);
        }
    }

    public enum b {
        FILL,
        WRAP,
        CIRCLE;

        static {
            Covode.recordClassIndex(22423);
        }
    }

    public final int getCurrentItem() {
        int i2;
        d dVar = this.o;
        if (dVar == null) {
            return 0;
        }
        if (!this.f37283e || ((i2 = this.G) >= 0 && i2 < dVar.a())) {
            return Math.max(0, Math.min(this.G, this.o.a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.G) - this.o.a()), this.o.a() - 1));
    }

    private void c() {
        String str;
        if (this.o != null) {
            Rect rect = new Rect();
            for (int i2 = 0; i2 < this.o.a(); i2++) {
                String a2 = a(this.o.a(i2));
                this.f37290m.getTextBounds(a2, 0, a2.length(), rect);
                int width = rect.width();
                if (width > this.r) {
                    this.r = width;
                }
            }
            com.bytedance.ies.xelement.c.a aVar = this.V;
            String str2 = "Week";
            if (!(aVar == null || (str = aVar.a().get("wheel_text_bound_text")) == null || str.isEmpty())) {
                str2 = str;
            }
            this.f37290m.getTextBounds(str2, 0, 2, rect);
            int height = rect.height() + 2;
            this.s = height;
            float f2 = this.A * ((float) height);
            this.u = f2;
            int i3 = (int) (f2 * ((float) (this.I - 1)));
            double d2 = (double) (i3 * 2);
            Double.isNaN(d2);
            this.J = (int) (d2 / 3.141592653589793d);
            double d3 = (double) i3;
            Double.isNaN(d3);
            this.L = (int) (d3 / 3.141592653589793d);
            this.K = View.MeasureSpec.getSize(this.P);
            int i4 = this.J;
            float f3 = this.u;
            this.B = (((float) i4) - f3) / 2.0f;
            float f4 = (((float) i4) + f3) / 2.0f;
            this.C = f4;
            this.D = (f4 - ((f3 - ((float) this.s)) / 2.0f)) - this.T;
            if (this.F == -1) {
                if (this.f37283e) {
                    this.F = (this.o.a() + 1) / 2;
                } else {
                    this.F = 0;
                }
            }
            this.H = this.F;
        }
    }

    public void setAlphaGradient(boolean z2) {
        this.U = z2;
    }

    public final void setCyclic(boolean z2) {
        this.f37283e = z2;
    }

    public void setDividerType(b bVar) {
        this.f37284g = bVar;
    }

    public void setGravity(int i2) {
        this.Q = i2;
    }

    public void setIsOptions(boolean z2) {
        this.f37288k = z2;
    }

    public void setLabel(String str) {
        this.p = str;
    }

    public void setLocalizeAdapter(com.bytedance.ies.xelement.c.a aVar) {
        this.V = aVar;
    }

    public final void setOnItemSelectedListener(f fVar) {
        this.f37279a = fVar;
    }

    public void setTotalScrollY(float f2) {
        this.E = f2;
    }

    public WheelView(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i2) {
        this.y = i2;
        this.n.setColor(i2);
    }

    public void setTextColorCenter(int i2) {
        this.x = i2;
        this.f37290m.setColor(i2);
    }

    public void setTextColorOut(int i2) {
        this.w = i2;
        this.f37289l.setColor(i2);
    }

    private static String b(int i2) {
        if (i2 < 0 || i2 >= 10) {
            return String.valueOf(i2);
        }
        return f37278f[i2];
    }

    public final void setAdapter(d dVar) {
        this.o = dVar;
        c();
        invalidate();
    }

    public final void setCurrentIndex(int i2) {
        this.G = i2;
        this.F = i2;
        this.E = 0.0f;
        invalidate();
    }

    public void setDividerWidth(int i2) {
        this.z = i2;
        this.n.setStrokeWidth((float) i2);
    }

    public void setItemsVisibleCount(int i2) {
        if (i2 % 2 == 0) {
            i2++;
        }
        this.I = i2 + 2;
    }

    public void setLineSpacingMultiplier(float f2) {
        if (f2 != 0.0f) {
            this.A = f2;
            b();
        }
    }

    public void setTextXOffset(int i2) {
        this.t = i2;
        if (i2 != 0) {
            this.f37290m.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.v = typeface;
        this.f37289l.setTypeface(typeface);
        this.f37290m.setTypeface(this.v);
    }

    private int a(int i2) {
        if (i2 < 0) {
            return a(i2 + this.o.a());
        }
        if (i2 > this.o.a() - 1) {
            return a(i2 - this.o.a());
        }
        return i2;
    }

    public final void setTextSize(float f2) {
        if (f2 > 0.0f) {
            int i2 = (int) (this.f37285h.getResources().getDisplayMetrics().density * f2);
            this.q = i2;
            this.f37289l.setTextSize((float) i2);
            this.f37290m.setTextSize((float) this.q);
        }
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof com.bytedance.ies.xelement.picker.d.a) {
            return ((com.bytedance.ies.xelement.picker.d.a) obj).a();
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f37287j.onTouchEvent(motionEvent);
        float f2 = ((float) (-this.F)) * this.u;
        float a2 = ((float) ((this.o.a() - 1) - this.F)) * this.u;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.O = System.currentTimeMillis();
            a();
            this.N = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.N - motionEvent.getRawY();
            this.N = motionEvent.getRawY();
            float f3 = this.E + rawY;
            this.E = f3;
            if (!this.f37283e) {
                float f4 = this.u;
                if ((f3 - (f4 * 0.25f) < f2 && rawY < 0.0f) || ((f4 * 0.25f) + f3 > a2 && rawY > 0.0f)) {
                    this.E = f3 - rawY;
                    return true;
                }
            }
        } else if (!onTouchEvent) {
            float y2 = motionEvent.getY();
            int i2 = this.L;
            double acos = Math.acos((double) ((((float) i2) - y2) / ((float) i2)));
            double d2 = (double) this.L;
            Double.isNaN(d2);
            double d3 = acos * d2;
            float f5 = this.u;
            double d4 = (double) (f5 / 2.0f);
            Double.isNaN(d4);
            double d5 = d3 + d4;
            double d6 = (double) f5;
            Double.isNaN(d6);
            this.M = (int) ((((float) (((int) (d5 / d6)) - (this.I / 2))) * f5) - (((this.E % f5) + f5) % f5));
            if (System.currentTimeMillis() - this.O > 120) {
                a(a.DAGGLE);
            } else {
                a(a.CLICK);
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    private void a(String str) {
        Rect rect = new Rect();
        this.f37290m.getTextBounds(str, 0, str.length(), rect);
        int i2 = this.q;
        for (int width = rect.width(); width > this.K; width = rect.width()) {
            i2--;
            this.f37290m.setTextSize((float) i2);
            this.f37290m.getTextBounds(str, 0, str.length(), rect);
        }
        this.f37289l.setTextSize((float) i2);
    }

    public final void a(a aVar) {
        a();
        if (aVar == a.FLING || aVar == a.DAGGLE) {
            float f2 = this.E;
            float f3 = this.u;
            int i2 = (int) (((f2 % f3) + f3) % f3);
            this.M = i2;
            if (((float) i2) > f3 / 2.0f) {
                this.M = (int) (f3 - ((float) i2));
            } else {
                this.M = -i2;
            }
        }
        this.f37282d = this.f37281c.scheduleWithFixedDelay(new c(this, this.M), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        Object obj;
        float f3;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        if (this.o != null) {
            int i5 = 0;
            int min = Math.min(Math.max(0, this.F), this.o.a() - 1);
            this.F = min;
            try {
                this.H = min + (((int) (this.E / this.u)) % this.o.a());
            } catch (ArithmeticException unused) {
                LLog.a(6, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
            }
            if (!this.f37283e) {
                if (this.H < 0) {
                    this.H = 0;
                }
                if (this.H > this.o.a() - 1) {
                    this.H = this.o.a() - 1;
                }
            } else {
                if (this.H < 0) {
                    this.H = this.o.a() + this.H;
                }
                if (this.H > this.o.a() - 1) {
                    this.H -= this.o.a();
                }
            }
            float f4 = this.E % this.u;
            float f5 = 10.0f;
            if (this.f37284g == b.WRAP) {
                if (TextUtils.isEmpty(this.p)) {
                    i4 = (this.K - this.r) / 2;
                } else {
                    i4 = (this.K - this.r) / 4;
                }
                float f6 = (float) (i4 - 12);
                if (f6 <= 0.0f) {
                    f6 = 10.0f;
                }
                float f7 = ((float) this.K) - f6;
                float f8 = this.B;
                canvas.drawLine(f6, f8, f7, f8, this.n);
                float f9 = this.C;
                canvas.drawLine(f6, f9, f7, f9, this.n);
            } else if (this.f37284g == b.CIRCLE) {
                this.n.setStyle(Paint.Style.STROKE);
                this.n.setStrokeWidth((float) this.z);
                if (TextUtils.isEmpty(this.p)) {
                    f2 = ((float) (this.K - this.r)) / 2.0f;
                } else {
                    f2 = ((float) (this.K - this.r)) / 4.0f;
                }
                float f10 = f2 - 12.0f;
                if (f10 > 0.0f) {
                    f5 = f10;
                }
                canvas.drawCircle(((float) this.K) / 2.0f, ((float) this.J) / 2.0f, Math.max((((float) this.K) - f5) - f5, this.u) / 1.8f, this.n);
            } else {
                float f11 = this.B;
                canvas.drawLine(0.0f, f11, (float) this.K, f11, this.n);
                float f12 = this.C;
                canvas.drawLine(0.0f, f12, (float) this.K, f12, this.n);
            }
            if (!TextUtils.isEmpty(this.p) && this.f37280b) {
                int i6 = this.K;
                Paint paint = this.f37290m;
                String str3 = this.p;
                if (str3 == null || str3.length() <= 0) {
                    i3 = 0;
                } else {
                    int length = str3.length();
                    float[] fArr = new float[length];
                    paint.getTextWidths(str3, fArr);
                    i3 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        i3 += (int) Math.ceil((double) fArr[i7]);
                    }
                }
                canvas.drawText(this.p, ((float) (i6 - i3)) - this.T, this.D, this.f37290m);
            }
            int i8 = 0;
            while (true) {
                int i9 = this.I;
                if (i8 < i9) {
                    int i10 = this.H - ((i9 / 2) - i8);
                    if (this.f37283e) {
                        i10 = a(i10);
                    } else if (i10 < 0 || i10 > this.o.a() - 1) {
                        obj = "";
                        canvas.save();
                        double d2 = (double) (((this.u * ((float) i8)) - f4) / ((float) this.L));
                        Double.isNaN(d2);
                        f3 = (float) (90.0d - ((d2 / 3.141592653589793d) * 180.0d));
                        if (f3 <= 90.0f || f3 < -90.0f) {
                            canvas.restore();
                        } else {
                            String a2 = (this.f37280b || TextUtils.isEmpty(this.p) || TextUtils.isEmpty(a(obj))) ? a(obj) : a(obj) + this.p;
                            float pow = (float) Math.pow((double) (Math.abs(f3) / 90.0f), 2.2d);
                            a(a2);
                            Rect rect = new Rect();
                            this.f37290m.getTextBounds(a2, i5, a2.length(), rect);
                            int i11 = this.Q;
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    this.R = (this.K - rect.width()) - ((int) this.T);
                                } else if (i11 == 17) {
                                    if (this.f37288k || (str2 = this.p) == null || str2.equals("") || !this.f37280b) {
                                        double width = (double) (this.K - rect.width());
                                        Double.isNaN(width);
                                        this.R = (int) (width * 0.5d);
                                    } else {
                                        double width2 = (double) (this.K - rect.width());
                                        Double.isNaN(width2);
                                        this.R = (int) (width2 * 0.25d);
                                    }
                                }
                                i2 = 0;
                            } else {
                                i2 = 0;
                                this.R = 0;
                            }
                            Rect rect2 = new Rect();
                            this.f37289l.getTextBounds(a2, i2, a2.length(), rect2);
                            int i12 = this.Q;
                            if (i12 == 3) {
                                this.S = 0;
                            } else if (i12 == 5) {
                                this.S = (this.K - rect2.width()) - ((int) this.T);
                            } else if (i12 == 17) {
                                if (this.f37288k || (str = this.p) == null || str.equals("") || !this.f37280b) {
                                    double width3 = (double) (this.K - rect2.width());
                                    Double.isNaN(width3);
                                    this.S = (int) (width3 * 0.5d);
                                } else {
                                    double width4 = (double) (this.K - rect2.width());
                                    Double.isNaN(width4);
                                    this.S = (int) (width4 * 0.25d);
                                }
                            }
                            double d3 = (double) this.L;
                            double cos = Math.cos(d2);
                            double d4 = (double) this.L;
                            Double.isNaN(d4);
                            Double.isNaN(d3);
                            double d5 = d3 - (cos * d4);
                            double sin = Math.sin(d2);
                            double d6 = (double) this.s;
                            Double.isNaN(d6);
                            float f13 = (float) (d5 - ((sin * d6) / 2.0d));
                            canvas.translate(0.0f, f13);
                            float f14 = this.B;
                            if (f13 > f14 || ((float) this.s) + f13 < f14) {
                                float f15 = this.C;
                                if (f13 > f15 || ((float) this.s) + f13 < f15) {
                                    if (f13 >= f14) {
                                        int i13 = this.s;
                                        if (((float) i13) + f13 <= f15) {
                                            canvas.drawText(a2, (float) this.R, ((float) i13) - this.T, this.f37290m);
                                            this.G = this.H - ((this.I / 2) - i8);
                                        }
                                    }
                                    canvas.save();
                                    canvas.clipRect(0, 0, this.K, (int) this.u);
                                    canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                                    a(pow, f3);
                                    canvas.drawText(a2, ((float) this.S) + (((float) this.t) * pow), (float) this.s, this.f37289l);
                                    canvas.restore();
                                } else {
                                    canvas.save();
                                    canvas.clipRect(0.0f, 0.0f, (float) this.K, this.C - f13);
                                    canvas.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                                    canvas.drawText(a2, (float) this.R, ((float) this.s) - this.T, this.f37290m);
                                    canvas.restore();
                                    canvas.save();
                                    canvas.clipRect(0.0f, this.C - f13, (float) this.K, (float) ((int) this.u));
                                    canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                                    a(pow, f3);
                                    canvas.drawText(a2, (float) this.S, (float) this.s, this.f37289l);
                                    canvas.restore();
                                }
                            } else {
                                canvas.save();
                                canvas.clipRect(0.0f, 0.0f, (float) this.K, this.B - f13);
                                canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                                a(pow, f3);
                                canvas.drawText(a2, (float) this.S, (float) this.s, this.f37289l);
                                canvas.restore();
                                canvas.save();
                                canvas.clipRect(0.0f, this.B - f13, (float) this.K, (float) ((int) this.u));
                                canvas.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                                canvas.drawText(a2, (float) this.R, ((float) this.s) - this.T, this.f37290m);
                                canvas.restore();
                            }
                            canvas.restore();
                            this.f37290m.setTextSize((float) this.q);
                        }
                        i8++;
                        i5 = 0;
                    }
                    obj = this.o.a(i10);
                    canvas.save();
                    double d22 = (double) (((this.u * ((float) i8)) - f4) / ((float) this.L));
                    Double.isNaN(d22);
                    f3 = (float) (90.0d - ((d22 / 3.141592653589793d) * 180.0d));
                    if (f3 <= 90.0f) {
                    }
                    canvas.restore();
                    i8++;
                    i5 = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        this.P = i2;
        c();
        setMeasuredDimension(this.K, this.J);
    }

    private void a(float f2, float f3) {
        int i2;
        int i3;
        int i4 = this.t;
        int i5 = -1;
        if (i4 > 0) {
            i2 = 1;
        } else if (i4 < 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        Paint paint = this.f37289l;
        if (f3 <= 0.0f) {
            i5 = 1;
        }
        paint.setTextSkewX(((float) (i2 * i5)) * 0.5f * f2);
        if (this.U) {
            i3 = (int) (((90.0f - Math.abs(f3)) / 90.0f) * 255.0f);
        } else {
            i3 = 255;
        }
        this.f37289l.setAlpha(i3);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8919);
        this.f37280b = true;
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        this.f37281c = (ScheduledExecutorService) g.a(a2.a());
        this.v = Typeface.MONOSPACE;
        this.A = 1.6f;
        this.I = 11;
        this.M = 0;
        this.N = 0.0f;
        this.O = 0;
        this.Q = 17;
        this.R = 0;
        this.S = 0;
        this.U = false;
        this.q = getResources().getDimensionPixelSize(R.dimen.o_);
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 < 1.0f) {
            this.T = 2.4f;
        } else if (1.0f <= f2 && f2 < 2.0f) {
            this.T = 4.0f;
        } else if (2.0f <= f2 && f2 < 3.0f) {
            this.T = 6.0f;
        } else if (f2 >= 3.0f) {
            this.T = f2 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a78, R.attr.a79, R.attr.a7_, R.attr.a7a, R.attr.a7b, R.attr.a7c, R.attr.a7d}, 0, 0);
            this.Q = obtainStyledAttributes.getInt(2, 17);
            this.w = obtainStyledAttributes.getColor(5, -5723992);
            this.x = obtainStyledAttributes.getColor(4, -14013910);
            this.y = obtainStyledAttributes.getColor(0, -2763307);
            this.z = obtainStyledAttributes.getDimensionPixelSize(1, 2);
            this.q = obtainStyledAttributes.getDimensionPixelOffset(6, this.q);
            this.A = obtainStyledAttributes.getFloat(3, this.A);
            obtainStyledAttributes.recycle();
        }
        b();
        this.f37285h = context;
        this.f37286i = new com.bytedance.ies.xelement.picker.f.b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new com.bytedance.ies.xelement.picker.e.d(this));
        this.f37287j = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f37283e = true;
        this.E = 0.0f;
        this.F = -1;
        Paint paint = new Paint();
        this.f37289l = paint;
        paint.setColor(this.w);
        this.f37289l.setAntiAlias(true);
        this.f37289l.setTypeface(this.v);
        this.f37289l.setTextSize((float) this.q);
        Paint paint2 = new Paint();
        this.f37290m = paint2;
        paint2.setColor(this.x);
        this.f37290m.setAntiAlias(true);
        this.f37290m.setTextScaleX(1.1f);
        this.f37290m.setTypeface(this.v);
        this.f37290m.setTextSize((float) this.q);
        Paint paint3 = new Paint();
        this.n = paint3;
        paint3.setColor(this.y);
        this.n.setAntiAlias(true);
        setLayerType(1, null);
        MethodCollector.o(8919);
    }
}
