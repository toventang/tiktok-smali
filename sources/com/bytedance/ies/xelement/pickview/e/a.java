package com.bytedance.ies.xelement.pickview.e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.a.c;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class a extends View {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f37392g = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.xelement.pickview.c.b f37393a;
    private float aa;
    private boolean ab;
    private com.bytedance.ies.xelement.c.a ac;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37394b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f37395c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture<?> f37396d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37397e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f37398f;

    /* renamed from: h  reason: collision with root package name */
    private b f37399h;

    /* renamed from: i  reason: collision with root package name */
    private Context f37400i;

    /* renamed from: j  reason: collision with root package name */
    private Handler f37401j;

    /* renamed from: k  reason: collision with root package name */
    private GestureDetector f37402k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f37403l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f37404m;
    private Paint n;
    private Paint o;
    private Paint p;
    private c q;
    private String r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;
    private float x;
    private Typeface y;
    private int z;

    public final c getAdapter() {
        return this.q;
    }

    public final Handler getHandler() {
        return this.f37401j;
    }

    public final int getInitPosition() {
        return this.I;
    }

    public final float getItemHeight() {
        return this.w;
    }

    public final float getTotalScrollY() {
        return this.H;
    }

    public final int getItemDefaultOrUserHeight() {
        float f2 = this.x;
        if (f2 > 0.0f) {
            return (int) f2;
        }
        return (int) this.w;
    }

    public final int getItemsCount() {
        c cVar = this.q;
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(22474);
    }

    private void b() {
        float f2 = this.D;
        if (f2 < 1.0f) {
            this.D = 1.0f;
        } else if (f2 > 4.0f) {
            this.D = 4.0f;
        }
    }

    public final void a() {
        ScheduledFuture<?> scheduledFuture = this.f37396d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f37396d.cancel(true);
            this.f37396d = null;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.pickview.e.a$a  reason: collision with other inner class name */
    public enum EnumC0918a {
        CLICK,
        FLING,
        DAGGLE;

        static {
            Covode.recordClassIndex(22476);
        }
    }

    public enum b {
        FILL,
        WRAP,
        CIRCLE;

        static {
            Covode.recordClassIndex(22477);
        }
    }

    public final int getCurrentItem() {
        int i2;
        c cVar = this.q;
        if (cVar == null) {
            return 0;
        }
        if (!this.f37397e || ((i2 = this.J) >= 0 && i2 < cVar.a())) {
            return Math.max(0, Math.min(this.J, this.q.a() - 1));
        }
        return Math.max(0, Math.min(Math.abs(Math.abs(this.J) - this.q.a()), this.q.a() - 1));
    }

    private void c() {
        String str;
        if (this.q != null) {
            Rect rect = new Rect();
            for (int i2 = 0; i2 < this.q.a(); i2++) {
                String a2 = a(this.q.a(i2));
                this.n.getTextBounds(a2, 0, a2.length(), rect);
                int width = rect.width();
                if (width > this.t) {
                    this.t = width;
                }
            }
            com.bytedance.ies.xelement.c.a aVar = this.ac;
            String str2 = "Week";
            if (!(aVar == null || (str = aVar.a().get("wheel_text_bound_text")) == null || str.isEmpty())) {
                str2 = str;
            }
            this.n.getTextBounds(str2, 0, 2, rect);
            int height = rect.height() + 2;
            this.u = height;
            this.w = this.D * ((float) height);
            float f2 = this.x;
            if (f2 > 0.0f) {
                this.w = f2;
            }
            int i3 = (int) (this.w * ((float) (this.L - 1)));
            double d2 = (double) (i3 * 2);
            Double.isNaN(d2);
            this.M = (int) (d2 / 3.141592653589793d);
            double d3 = (double) i3;
            Double.isNaN(d3);
            this.O = (int) (d3 / 3.141592653589793d);
            this.N = View.MeasureSpec.getSize(this.S);
            int i4 = this.M;
            float f3 = this.w;
            this.E = (((float) i4) - f3) / 2.0f;
            float f4 = (((float) i4) + f3) / 2.0f;
            this.F = f4;
            this.G = (f4 - ((f3 - ((float) this.u)) / 2.0f)) - this.aa;
            if (this.I == -1) {
                if (this.f37397e) {
                    this.I = (this.q.a() + 1) / 2;
                } else {
                    this.I = 0;
                }
            }
            this.K = this.I;
        }
    }

    public final void setAlphaGradient(boolean z2) {
        this.ab = z2;
    }

    public final void setCyclic(boolean z2) {
        this.f37397e = z2;
    }

    public final void setDividerType(b bVar) {
        this.f37399h = bVar;
    }

    public final void setGravity(int i2) {
        this.U = i2;
    }

    public final void setIsOptions(boolean z2) {
        this.f37403l = z2;
    }

    public final void setLabel(String str) {
        this.r = str;
    }

    public final void setLocalizeAdapter(com.bytedance.ies.xelement.c.a aVar) {
        this.ac = aVar;
    }

    public final void setOnItemSelectedListener(com.bytedance.ies.xelement.pickview.c.b bVar) {
        this.f37393a = bVar;
    }

    public final void setTotalScrollY(float f2) {
        this.H = f2;
    }

    public final void setUserItemHeight(int i2) {
        this.x = (float) i2;
    }

    public a(Context context) {
        this(context, (byte) 0);
    }

    public final void setDividerColor(int i2) {
        this.B = i2;
        this.o.setColor(i2);
    }

    public final void setTextColorCenter(int i2) {
        this.A = i2;
        this.n.setColor(i2);
    }

    public final void setTextColorOut(int i2) {
        this.z = i2;
        this.f37404m.setColor(i2);
    }

    private static String b(int i2) {
        if (i2 < 0 || i2 >= 10) {
            return String.valueOf(i2);
        }
        return f37392g[i2];
    }

    public final void setCenterWeight(String str) {
        if (str.contains("bold")) {
            this.n.setFakeBoldText(true);
        }
    }

    public final void setCurrentIndex(int i2) {
        this.J = i2;
        this.I = i2;
        this.H = 0.0f;
        invalidate();
    }

    public final void setDividerWidth(int i2) {
        this.C = i2;
        this.o.setStrokeWidth((float) i2);
    }

    public final void setLineSpacingMultiplier(float f2) {
        if (f2 != 0.0f) {
            this.D = f2;
            b();
        }
    }

    public final void setTextXOffset(int i2) {
        this.v = i2;
        if (i2 != 0) {
            this.n.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.y = typeface;
        this.f37404m.setTypeface(typeface);
        this.n.setTypeface(this.y);
    }

    public final void setItemsVisibleCount(int i2) {
        if (i2 % 2 == 0) {
            i2++;
        }
        int i3 = i2 + 2;
        if (this.L != i3) {
            this.L = i3;
            c();
            invalidate();
        }
    }

    public final void setMaskColor(int i2) {
        if (this.p == null) {
            this.p = new Paint();
        }
        this.p.setColor(i2);
    }

    public final void setTextSizePx(int i2) {
        if (((float) i2) > 0.0f) {
            this.s = i2;
            this.f37404m.setTextSize((float) i2);
            this.n.setTextSize((float) this.s);
        }
    }

    private int a(int i2) {
        if (i2 < 0) {
            return a(i2 + this.q.a());
        }
        if (i2 > this.q.a() - 1) {
            return a(i2 - this.q.a());
        }
        return i2;
    }

    public final void setAdapter(c cVar) {
        this.q = cVar;
        int a2 = cVar.a();
        if (a2 == 0) {
            setCurrentIndex(0);
        } else {
            int i2 = this.J;
            int i3 = a2 - 1;
            if (i2 > i3) {
                setCurrentIndex(i3);
            } else if (i2 < 0) {
                setCurrentIndex(0);
            }
        }
        c();
        invalidate();
    }

    public final void setTextSize(float f2) {
        if (f2 > 0.0f) {
            int i2 = (int) (this.f37400i.getResources().getDisplayMetrics().density * f2);
            this.s = i2;
            this.f37404m.setTextSize((float) i2);
            this.n.setTextSize((float) this.s);
        }
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof com.bytedance.ies.xelement.pickview.a.b) {
            return ((com.bytedance.ies.xelement.pickview.a.b) obj).a();
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        return obj.toString();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.q == null) {
            return false;
        }
        boolean onTouchEvent = this.f37402k.onTouchEvent(motionEvent);
        float f2 = ((float) (-this.I)) * this.w;
        float a2 = ((float) ((this.q.a() - 1) - this.I)) * this.w;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.R = System.currentTimeMillis();
            a();
            this.Q = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.Q - motionEvent.getRawY();
            this.Q = motionEvent.getRawY();
            float f3 = this.H + rawY;
            this.H = f3;
            if (!this.f37397e) {
                float f4 = this.w;
                if ((f3 - (f4 * 0.25f) < f2 && rawY < 0.0f) || ((f4 * 0.25f) + f3 > a2 && rawY > 0.0f)) {
                    this.H = f3 - rawY;
                    return true;
                }
            }
        } else if (!onTouchEvent) {
            float y2 = motionEvent.getY();
            int i2 = this.O;
            double acos = Math.acos((double) ((((float) i2) - y2) / ((float) i2)));
            double d2 = (double) this.O;
            Double.isNaN(d2);
            double d3 = acos * d2;
            float f5 = this.w;
            double d4 = (double) (f5 / 2.0f);
            Double.isNaN(d4);
            double d5 = d3 + d4;
            double d6 = (double) f5;
            Double.isNaN(d6);
            this.P = (int) ((((float) (((int) (d5 / d6)) - (this.L / 2))) * f5) - (((this.H % f5) + f5) % f5));
            if (System.currentTimeMillis() - this.R > 120) {
                a(EnumC0918a.DAGGLE);
            } else {
                a(EnumC0918a.CLICK);
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    private void a(String str) {
        Rect rect = new Rect();
        this.n.getTextBounds(str, 0, str.length(), rect);
        int i2 = this.s;
        for (int width = rect.width(); width > this.N; width = rect.width()) {
            i2--;
            this.n.setTextSize((float) i2);
            this.n.getTextBounds(str, 0, str.length(), rect);
        }
        this.f37404m.setTextSize((float) i2);
    }

    public final void a(EnumC0918a aVar) {
        a();
        if (aVar == EnumC0918a.FLING || aVar == EnumC0918a.DAGGLE) {
            float f2 = this.H;
            float f3 = this.w;
            int i2 = (int) (((f2 % f3) + f3) % f3);
            this.P = i2;
            if (((float) i2) > f3 / 2.0f) {
                this.P = (int) (f3 - ((float) i2));
            } else {
                this.P = -i2;
            }
        }
        this.f37396d = this.f37395c.scheduleWithFixedDelay(new com.bytedance.ies.xelement.pickview.d.c(this, this.P), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f2;
        Object obj;
        float f3;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        if (this.q != null) {
            int i5 = 0;
            int min = Math.min(Math.max(0, this.I), this.q.a() - 1);
            this.I = min;
            try {
                this.K = min + (((int) (this.H / this.w)) % this.q.a());
            } catch (ArithmeticException unused) {
                LLog.a(6, "WheelView", "Error！adapter.getItemsCount() == 0，adapter data doesn't match");
            }
            if (!this.f37397e) {
                if (this.K < 0) {
                    this.K = 0;
                }
                if (this.K > this.q.a() - 1) {
                    this.K = this.q.a() - 1;
                }
            } else {
                if (this.K < 0) {
                    this.K = this.q.a() + this.K;
                }
                if (this.K > this.q.a() - 1) {
                    this.K -= this.q.a();
                }
            }
            float f4 = this.H % this.w;
            float f5 = 10.0f;
            if (this.f37399h == b.WRAP) {
                if (TextUtils.isEmpty(this.r)) {
                    i4 = (this.N - this.t) / 2;
                } else {
                    i4 = (this.N - this.t) / 4;
                }
                float f6 = (float) (i4 - 12);
                if (f6 <= 0.0f) {
                    f6 = 10.0f;
                }
                float f7 = ((float) this.N) - f6;
                float f8 = this.E;
                canvas.drawLine(f6, f8, f7, f8, this.o);
                float f9 = this.F;
                canvas.drawLine(f6, f9, f7, f9, this.o);
            } else if (this.f37399h == b.CIRCLE) {
                this.o.setStyle(Paint.Style.STROKE);
                this.o.setStrokeWidth((float) this.C);
                if (TextUtils.isEmpty(this.r)) {
                    f2 = ((float) (this.N - this.t)) / 2.0f;
                } else {
                    f2 = ((float) (this.N - this.t)) / 4.0f;
                }
                float f10 = f2 - 12.0f;
                if (f10 > 0.0f) {
                    f5 = f10;
                }
                canvas.drawCircle(((float) this.N) / 2.0f, ((float) this.M) / 2.0f, Math.max((((float) this.N) - f5) - f5, this.w) / 1.8f, this.o);
            } else {
                float f11 = this.E;
                canvas.drawLine(0.0f, f11, (float) this.N, f11, this.o);
                float f12 = this.F;
                canvas.drawLine(0.0f, f12, (float) this.N, f12, this.o);
            }
            if (!TextUtils.isEmpty(this.r) && this.f37394b) {
                int i6 = this.N;
                Paint paint = this.n;
                String str3 = this.r;
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
                canvas.drawText(this.r, ((float) (i6 - i3)) - this.aa, this.G, this.n);
            }
            int i8 = 0;
            while (true) {
                int i9 = this.L;
                if (i8 >= i9) {
                    break;
                }
                int i10 = this.K - ((i9 / 2) - i8);
                if (this.f37397e) {
                    i10 = a(i10);
                } else if (i10 < 0 || i10 > this.q.a() - 1) {
                    obj = "";
                    canvas.save();
                    double d2 = (double) (((this.w * ((float) i8)) - f4) / ((float) this.O));
                    Double.isNaN(d2);
                    f3 = (float) (90.0d - ((d2 / 3.141592653589793d) * 180.0d));
                    if (f3 <= 90.0f || f3 < -90.0f) {
                        canvas.restore();
                    } else {
                        String a2 = (this.f37394b || TextUtils.isEmpty(this.r) || TextUtils.isEmpty(a(obj))) ? a(obj) : a(obj) + this.r;
                        float pow = (float) Math.pow((double) (Math.abs(f3) / 90.0f), 2.2d);
                        a(a2);
                        Rect rect = new Rect();
                        this.n.getTextBounds(a2, i5, a2.length(), rect);
                        int i11 = this.U;
                        if (i11 != 3) {
                            if (i11 == 5) {
                                this.V = (this.N - rect.width()) - ((int) this.aa);
                            } else if (i11 == 17) {
                                if (this.f37403l || (str2 = this.r) == null || str2.equals("") || !this.f37394b) {
                                    double width = (double) (this.N - rect.width());
                                    Double.isNaN(width);
                                    this.V = (int) (width * 0.5d);
                                } else {
                                    double width2 = (double) (this.N - rect.width());
                                    Double.isNaN(width2);
                                    this.V = (int) (width2 * 0.25d);
                                }
                            }
                            i2 = 0;
                        } else {
                            i2 = 0;
                            this.V = 0;
                        }
                        Rect rect2 = new Rect();
                        this.f37404m.getTextBounds(a2, i2, a2.length(), rect2);
                        int i12 = this.U;
                        if (i12 == 3) {
                            this.W = 0;
                        } else if (i12 == 5) {
                            this.W = (this.N - rect2.width()) - ((int) this.aa);
                        } else if (i12 == 17) {
                            if (this.f37403l || (str = this.r) == null || str.equals("") || !this.f37394b) {
                                double width3 = (double) (this.N - rect2.width());
                                Double.isNaN(width3);
                                this.W = (int) (width3 * 0.5d);
                            } else {
                                double width4 = (double) (this.N - rect2.width());
                                Double.isNaN(width4);
                                this.W = (int) (width4 * 0.25d);
                            }
                        }
                        double d3 = (double) this.O;
                        double cos = Math.cos(d2);
                        double d4 = (double) this.O;
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        double d5 = d3 - (cos * d4);
                        double sin = Math.sin(d2);
                        double d6 = (double) this.u;
                        Double.isNaN(d6);
                        float f13 = (float) (d5 - ((sin * d6) / 2.0d));
                        canvas.translate(0.0f, f13);
                        float f14 = this.E;
                        if (f13 > f14 || ((float) this.u) + f13 < f14) {
                            float f15 = this.F;
                            if (f13 > f15 || ((float) this.u) + f13 < f15) {
                                if (f13 >= f14) {
                                    int i13 = this.u;
                                    if (((float) i13) + f13 <= f15) {
                                        canvas.drawText(a2, (float) this.V, ((float) i13) - this.aa, this.n);
                                        this.J = this.K - ((this.L / 2) - i8);
                                    }
                                }
                                canvas.save();
                                canvas.clipRect(0, 0, this.N, (int) this.w);
                                canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                                a(pow, f3);
                                canvas.drawText(a2, ((float) this.W) + (((float) this.v) * pow), (float) this.u, this.f37404m);
                                canvas.restore();
                            } else {
                                canvas.save();
                                canvas.clipRect(0.0f, 0.0f, (float) this.N, this.F - f13);
                                canvas.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                                canvas.drawText(a2, (float) this.V, ((float) this.u) - this.aa, this.n);
                                canvas.restore();
                                canvas.save();
                                canvas.clipRect(0.0f, this.F - f13, (float) this.N, (float) ((int) this.w));
                                canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                                a(pow, f3);
                                canvas.drawText(a2, (float) this.W, (float) this.u, this.f37404m);
                                canvas.restore();
                            }
                        } else {
                            canvas.save();
                            canvas.clipRect(0.0f, 0.0f, (float) this.N, this.E - f13);
                            canvas.scale(1.0f, ((float) Math.sin(d2)) * 0.8f);
                            a(pow, f3);
                            canvas.drawText(a2, (float) this.W, (float) this.u, this.f37404m);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(0.0f, this.E - f13, (float) this.N, (float) ((int) this.w));
                            canvas.scale(1.0f, ((float) Math.sin(d2)) * 1.0f);
                            canvas.drawText(a2, (float) this.V, ((float) this.u) - this.aa, this.n);
                            canvas.restore();
                        }
                        canvas.restore();
                        this.n.setTextSize((float) this.s);
                    }
                    i8++;
                    i5 = 0;
                }
                obj = this.q.a(i10);
                canvas.save();
                double d22 = (double) (((this.w * ((float) i8)) - f4) / ((float) this.O));
                Double.isNaN(d22);
                f3 = (float) (90.0d - ((d22 / 3.141592653589793d) * 180.0d));
                if (f3 <= 90.0f) {
                }
                canvas.restore();
                i8++;
                i5 = 0;
            }
            Paint paint2 = this.p;
            if (paint2 != null) {
                canvas.drawRect(0.0f, 0.0f, (float) this.N, this.E, paint2);
                canvas.drawRect(0.0f, this.F, (float) this.N, (float) this.M, this.p);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        this.S = i2;
        this.T = i3;
        c();
        setMeasuredDimension(this.N, this.M);
    }

    private void a(float f2, float f3) {
        int i2;
        int i3;
        int i4 = this.v;
        int i5 = -1;
        if (i4 > 0) {
            i2 = 1;
        } else if (i4 < 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        Paint paint = this.f37404m;
        if (f3 <= 0.0f) {
            i5 = 1;
        }
        paint.setTextSkewX(((float) (i2 * i5)) * 0.5f * f2);
        if (this.ab) {
            i3 = (int) (((90.0f - Math.abs(f3)) / 90.0f) * 255.0f);
        } else {
            i3 = 255;
        }
        this.f37404m.setAlpha(i3);
    }

    private a(Context context, byte b2) {
        super(context, null);
        MethodCollector.i(4343);
        this.f37394b = true;
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        this.f37395c = (ScheduledExecutorService) g.a(a2.a());
        this.y = Typeface.MONOSPACE;
        this.D = 1.6f;
        this.L = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = 0;
        this.U = 17;
        this.V = 0;
        this.W = 0;
        this.ab = false;
        this.f37398f = new Handler(Looper.getMainLooper());
        this.s = getResources().getDimensionPixelSize(R.dimen.of);
        float f2 = getResources().getDisplayMetrics().density;
        if (f2 < 1.0f) {
            this.aa = 2.4f;
        } else if (1.0f <= f2 && f2 < 2.0f) {
            this.aa = 4.0f;
        } else if (2.0f <= f2 && f2 < 3.0f) {
            this.aa = 6.0f;
        } else if (f2 >= 3.0f) {
            this.aa = f2 * 2.5f;
        }
        this.U = 17;
        this.z = -16777216;
        this.A = -16777216;
        this.B = -16777216;
        this.C = 2;
        this.x = context.getResources().getDimension(R.dimen.oe);
        b();
        this.f37400i = context;
        this.f37401j = new com.bytedance.ies.xelement.pickview.d.b(this);
        GestureDetector gestureDetector = new GestureDetector(context, new com.bytedance.ies.xelement.pickview.c.a(this));
        this.f37402k = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f37397e = true;
        this.H = 0.0f;
        this.I = -1;
        Paint paint = new Paint();
        this.f37404m = paint;
        paint.setColor(this.z);
        this.f37404m.setAntiAlias(true);
        this.f37404m.setTypeface(this.y);
        this.f37404m.setTextSize((float) this.s);
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setColor(this.A);
        this.n.setAntiAlias(true);
        this.n.setTextScaleX(1.1f);
        this.n.setTypeface(this.y);
        this.n.setTextSize((float) this.s);
        Paint paint3 = new Paint();
        this.o = paint3;
        paint3.setColor(this.B);
        this.o.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.p = paint4;
        paint4.setColor(Integer.MAX_VALUE);
        setLayerType(1, null);
        MethodCollector.o(4343);
    }
}
