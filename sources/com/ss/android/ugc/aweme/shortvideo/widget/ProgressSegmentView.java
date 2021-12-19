package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class ProgressSegmentView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final int f132817a;
    private long A;
    private boolean B;
    private String C;
    private ValueAnimator D;
    private ValueAnimator E;
    private boolean F;

    /* renamed from: b  reason: collision with root package name */
    protected List<TimeSpeedModelExtension> f132818b;

    /* renamed from: c  reason: collision with root package name */
    protected TimeSpeedModelExtension f132819c;

    /* renamed from: d  reason: collision with root package name */
    protected long f132820d;

    /* renamed from: e  reason: collision with root package name */
    protected Paint f132821e;

    /* renamed from: f  reason: collision with root package name */
    protected Paint f132822f;

    /* renamed from: g  reason: collision with root package name */
    protected Paint f132823g;

    /* renamed from: h  reason: collision with root package name */
    protected Paint f132824h;

    /* renamed from: i  reason: collision with root package name */
    protected Paint f132825i;

    /* renamed from: j  reason: collision with root package name */
    protected Paint f132826j;

    /* renamed from: k  reason: collision with root package name */
    protected Paint f132827k;

    /* renamed from: l  reason: collision with root package name */
    protected Paint f132828l;

    /* renamed from: m  reason: collision with root package name */
    protected long f132829m;
    protected float n;
    protected float o;
    protected boolean p;
    protected int q;
    protected List<VERecordData.VERecordSegmentData> r;
    protected int s;
    protected long t;
    protected List<TimeSpeedModelExtension> u;
    private Paint v;
    private long w;
    private long x;
    private long y;
    private long z;

    public static void b() {
        throw new IllegalAccessException("NOT Implement, please tell to CHENWEI");
    }

    private long getLongVideoAnchorPosition() {
        return a(this.z);
    }

    public final void a() {
        this.p = true;
        this.E.start();
        a(false);
    }

    static {
        Covode.recordClassIndex(86906);
        Context applicationContext = i.f115645a.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        f132817a = (int) n.b(applicationContext, 3.0f);
    }

    private boolean c() {
        if (this.f132829m <= 30000 || this.f132820d >= this.z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D.removeAllUpdateListeners();
            this.D = null;
        }
        ValueAnimator valueAnimator2 = this.E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E.removeAllUpdateListeners();
            this.E = null;
        }
    }

    public void setAnchorDuration(long j2) {
        this.z = j2;
    }

    public void setNeedDrawAnchor(boolean z2) {
        this.B = z2;
    }

    public void setMaxDuration(long j2) {
        this.f132829m = j2;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ValueAnimator valueAnimator) {
        this.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void setAnchorString(String str) {
        this.C = str;
        this.A = (long) this.v.measureText(str);
    }

    private float a(List<VERecordData.VERecordSegmentData> list) {
        long j2 = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            j2 += list.get(i2).f150796c;
        }
        return ((float) this.w) / ((float) j2);
    }

    private long a(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) this.w;
        Double.isNaN(d3);
        double d4 = d2 * 1.0d * d3;
        double d5 = (double) this.f132829m;
        Double.isNaN(d5);
        return (long) (d4 / d5);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void a(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.f124750d != null) {
            this.r = retakeVideoContext.f124750d.f150790b;
            this.s = retakeVideoContext.f124749c;
            this.q = 2;
            if (this.u != null) {
                this.u = null;
            }
            this.t = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void b(Canvas canvas) {
        TimeSpeedModelExtension timeSpeedModelExtension = this.f132819c;
        long j2 = 0;
        if (timeSpeedModelExtension != null) {
            j2 = 0 + ((long) timeSpeedModelExtension.getDuration());
            int a2 = (int) a(j2);
            if (((long) a2) < this.w) {
                canvas.drawRect((float) (a2 - f132817a), 0.0f, (float) a2, (float) this.x, this.f132824h);
            }
        }
        if (this.f132818b != null) {
            for (int i2 = 0; i2 < this.f132818b.size(); i2++) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = this.f132818b.get(i2);
                j2 += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                int a3 = (int) a(j2);
                if (((long) a3) < this.w) {
                    canvas.drawRect((float) (a3 - f132817a), 0.0f, (float) a3, (float) this.x, this.f132824h);
                }
            }
            if (this.B && c()) {
                long longVideoAnchorPosition = getLongVideoAnchorPosition();
                long j3 = longVideoAnchorPosition - 2;
                canvas.drawRect((float) j3, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.x, this.f132824h);
                canvas.drawText(this.C, (float) (j3 - (this.A / 2)), (getY() + ((float) (this.x * 2))) - ((float) dh.c(getContext())), this.v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas) {
        float f2;
        float a2 = a(this.r);
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < this.r.size()) {
            int i3 = (int) (((float) this.r.get(i2).f150796c) * a2);
            if (i2 == this.s) {
                this.f132821e.setStrokeCap(Paint.Cap.BUTT);
                long j2 = this.y;
                float f5 = ((float) i3) + f4;
                canvas.drawLine(f4, (float) j2, f5, (float) j2, this.f132821e);
                if (this.u != null) {
                    long j3 = this.t;
                    if (j3 >= 0) {
                        float f6 = a2 * 1000.0f;
                        if (j3 > 0) {
                            float f7 = (((float) j3) * f6) + f4;
                            float min = Math.min(f7, f5);
                            int i4 = this.s;
                            if (i4 == 0) {
                                canvas.save();
                                canvas.clipRect(f3, f3, (float) this.y, (float) this.x);
                                long j4 = this.y;
                                canvas.drawCircle((float) j4, (float) j4, (float) j4, this.f132822f);
                                canvas.restore();
                                f2 = ((float) this.y) + f4;
                            } else {
                                if (f7 >= f5 && i4 == this.r.size() - 1) {
                                    canvas.save();
                                    canvas.clipRect(f5 - ((float) this.y), f3, f5, (float) this.x);
                                    long j5 = this.y;
                                    canvas.drawCircle(f5 - ((float) j5), (float) j5, (float) j5, this.f132822f);
                                    canvas.restore();
                                    min = f5 - ((float) this.y);
                                }
                                f2 = f4;
                            }
                            canvas.drawRect(f2, 0.0f, min, (float) this.x, this.f132822f);
                        }
                        if (this.u != null) {
                            float f8 = f4;
                            for (int i5 = 0; i5 < this.u.size(); i5++) {
                                TimeSpeedModelExtension timeSpeedModelExtension = this.u.get(i5);
                                f8 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f6;
                                if (this.s != this.r.size() - 1 || f8 < f5) {
                                    float min2 = Math.min(f8, f5);
                                    canvas.drawRect(min2 - ((float) f132817a), 0.0f, min2, (float) this.x, this.f132824h);
                                }
                            }
                        }
                    }
                }
                if (this.p) {
                    this.f132828l.setAlpha((int) (this.o * 255.0f));
                    canvas.drawRect(f4, 0.0f, f5, (float) this.x, this.f132828l);
                }
                f4 = f5;
            } else {
                if (i2 == 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                    long j6 = this.y;
                    canvas.drawCircle((float) j6, (float) j6, (float) j6, this.f132823g);
                    canvas.restore();
                    long j7 = this.y;
                    canvas.drawRect((float) j7, 0.0f, (float) Math.min((long) i3, this.w - j7), (float) this.x, this.f132823g);
                } else if (i2 == this.r.size() - 1) {
                    canvas.save();
                    long j8 = this.w;
                    canvas.clipRect((float) (j8 - this.y), 0.0f, (float) j8, (float) this.x);
                    long j9 = this.w;
                    long j10 = this.y;
                    canvas.drawCircle((float) (j9 - j10), (float) j10, (float) j10, this.f132823g);
                    canvas.restore();
                    canvas.drawRect(f4, 0.0f, (float) (this.w - this.y), (float) this.x, this.f132823g);
                } else {
                    canvas.drawRect(f4, 0.0f, f4 + ((float) i3), (float) this.x, this.f132823g);
                }
                f4 += (float) i3;
                if (i2 == this.s - 1) {
                    this.f132827k.setAlpha((int) (this.n * 255.0f));
                    canvas.drawRect(f4 - ((float) f132817a), 0.0f, f4, (float) this.x, this.f132827k);
                } else if (i2 != this.r.size() - 1) {
                    canvas.drawRect(f4 - ((float) f132817a), 0.0f, f4, (float) this.x, this.f132824h);
                }
            }
            i2++;
            f3 = 0.0f;
        }
    }

    public final void a(boolean z2) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            if (z2) {
                valueAnimator.start();
                return;
            }
            valueAnimator.end();
            this.n = 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        long j2;
        float f2;
        long j3 = 0;
        Canvas canvas2 = canvas;
        if (this.q != 2) {
            long a2 = a(this.f132820d);
            if (this.f132820d <= this.f132829m) {
                if (this.F) {
                    float f3 = (float) (this.w - a2);
                    long j4 = this.y;
                    canvas2 = canvas2;
                    canvas2.drawLine(f3, (float) j4, 0.0f, (float) j4, this.f132821e);
                } else {
                    long j5 = this.y;
                    canvas2 = canvas2;
                    canvas2.drawLine((float) a2, (float) j5, (float) this.w, (float) j5, this.f132821e);
                }
            }
            if (this.F) {
                TimeSpeedModelExtension timeSpeedModelExtension = this.f132819c;
                if (timeSpeedModelExtension == null) {
                    if (a2 > 0) {
                        canvas2.save();
                        long j6 = this.w;
                        canvas2.clipRect((float) (j6 - this.y), 0.0f, (float) j6, (float) this.x);
                        long j7 = this.w;
                        long j8 = this.y;
                        canvas2.drawCircle((float) (j7 - j8), (float) j8, (float) j8, this.f132822f);
                        canvas2.restore();
                        long j9 = this.w;
                        long j10 = this.y;
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j9 - j10), 0.0f, (float) Math.max(j10, j9 - a2), (float) this.x, this.f132822f);
                    }
                    if (this.f132820d > this.f132829m) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                        long j11 = this.y;
                        canvas2.drawCircle((float) j11, (float) j11, (float) j11, this.f132822f);
                        canvas2.restore();
                    }
                } else {
                    long a3 = a((long) timeSpeedModelExtension.getDuration());
                    canvas2.save();
                    long j12 = this.w;
                    canvas2.clipRect((float) (j12 - this.y), 0.0f, (float) j12, (float) this.x);
                    long j13 = this.w;
                    long j14 = this.y;
                    canvas2.drawCircle((float) (j13 - j14), (float) j14, (float) j14, this.f132825i);
                    canvas2.restore();
                    long j15 = this.w;
                    canvas2.drawRect((float) (j15 - this.y), 0.0f, (float) (j15 - a3), (float) this.x, this.f132825i);
                    if (a2 > a3) {
                        long j16 = this.w;
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j16 - a3), 0.0f, (float) Math.max(this.y, j16 - a2), (float) this.x, this.f132826j);
                    }
                    if (this.f132820d > this.f132829m) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                        long j17 = this.y;
                        canvas2.drawCircle((float) j17, (float) j17, (float) j17, this.f132826j);
                        canvas2.restore();
                    }
                }
                TimeSpeedModelExtension timeSpeedModelExtension2 = this.f132819c;
                if (timeSpeedModelExtension2 != null) {
                    j2 = ((long) timeSpeedModelExtension2.getDuration()) + 0;
                    long a4 = (long) ((int) a(j2));
                    long j18 = this.w;
                    if (a4 < j18) {
                        canvas2 = canvas2;
                        canvas2.drawRect((float) (j18 - a4), 0.0f, (float) ((j18 - a4) - ((long) f132817a)), (float) this.x, this.f132824h);
                    }
                } else {
                    j2 = 0;
                }
                if (this.f132818b != null) {
                    for (int i2 = 0; i2 < this.f132818b.size(); i2++) {
                        TimeSpeedModelExtension timeSpeedModelExtension3 = this.f132818b.get(i2);
                        j2 += (long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension3.getDuration(), timeSpeedModelExtension3.getSpeed());
                        long a5 = (long) ((int) a(j2));
                        long j19 = this.w;
                        if (a5 < j19) {
                            canvas2 = canvas2;
                            canvas2.drawRect((float) (j19 - a5), 0.0f, (float) ((j19 - a5) - ((long) f132817a)), (float) this.x, this.f132824h);
                        }
                    }
                    if (this.B && c()) {
                        long longVideoAnchorPosition = getLongVideoAnchorPosition();
                        long j20 = this.w;
                        canvas2.drawRect((float) ((j20 - longVideoAnchorPosition) - 2), 0.0f, (float) ((j20 - longVideoAnchorPosition) + 2), (float) this.x, this.f132824h);
                        canvas2.drawText(this.C, (float) (((this.w - longVideoAnchorPosition) - 2) - (this.A / 2)), (getY() + ((float) (this.x * 2))) - ((float) dh.c(getContext())), this.v);
                        return;
                    }
                    return;
                }
                return;
            }
            TimeSpeedModelExtension timeSpeedModelExtension4 = this.f132819c;
            if (timeSpeedModelExtension4 == null) {
                if (a2 > 0) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                    long j21 = this.y;
                    canvas2.drawCircle((float) j21, (float) j21, (float) j21, this.f132822f);
                    canvas2.restore();
                    long j22 = this.y;
                    canvas2 = canvas2;
                    canvas2.drawRect((float) j22, 0.0f, (float) Math.min(a2, this.w - j22), (float) this.x, this.f132822f);
                }
                if (this.f132820d > this.f132829m) {
                    canvas2.save();
                    long j23 = this.w;
                    canvas2.clipRect((float) (j23 - this.y), 0.0f, (float) j23, (float) this.x);
                    long j24 = this.w;
                    long j25 = this.y;
                    canvas2.drawCircle((float) (j24 - j25), (float) j25, (float) j25, this.f132822f);
                    canvas2.restore();
                }
            } else {
                long a6 = a((long) timeSpeedModelExtension4.getDuration());
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                long j26 = this.y;
                canvas2.drawCircle((float) j26, (float) j26, (float) j26, this.f132825i);
                canvas2.restore();
                float f4 = (float) a6;
                canvas2 = canvas2;
                canvas2.drawRect((float) this.y, 0.0f, f4, (float) this.x, this.f132825i);
                if (a2 > a6) {
                    canvas2.drawRect(f4, 0.0f, (float) Math.min(a2, this.w - this.y), (float) this.x, this.f132826j);
                }
                if (this.f132820d > this.f132829m) {
                    canvas2.save();
                    long j27 = this.w;
                    canvas2.clipRect((float) (j27 - this.y), 0.0f, (float) j27, (float) this.x);
                    long j28 = this.w;
                    long j29 = this.y;
                    canvas2.drawCircle((float) (j28 - j29), (float) j29, (float) j29, this.f132826j);
                    canvas2.restore();
                }
            }
            b(canvas2);
        } else if (this.F) {
            float a7 = a(this.r);
            int i3 = 0;
            float f5 = 0.0f;
            while (i3 < this.r.size()) {
                int i4 = (int) (((float) this.r.get(i3).f150796c) * a7);
                if (i3 == this.s) {
                    this.f132821e.setStrokeCap(Paint.Cap.BUTT);
                    long j30 = this.w;
                    float f6 = (float) i4;
                    long j31 = this.y;
                    canvas2.drawLine((((float) j30) - f5) - f6, (float) j31, ((float) j30) - f5, (float) j31, this.f132821e);
                    if (this.u != null) {
                        long j32 = this.t;
                        if (j32 >= j3) {
                            float f7 = f5 + f6;
                            float f8 = a7 * 1000.0f;
                            if (j32 > j3) {
                                float f9 = (((float) j32) * f8) + f5;
                                float min = Math.min(f9, f7);
                                int i5 = this.s;
                                if (i5 == 0) {
                                    canvas2.save();
                                    long j33 = this.w;
                                    canvas2.clipRect((float) (j33 - this.y), 0.0f, (float) j33, (float) this.x);
                                    long j34 = this.w;
                                    long j35 = this.y;
                                    canvas2.drawCircle((float) (j34 - j35), (float) j35, (float) j35, this.f132822f);
                                    canvas2.restore();
                                    f2 = ((float) this.y) + f5;
                                } else {
                                    if (f9 >= f7 && i5 == this.r.size() - 1) {
                                        canvas2.save();
                                        canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                                        long j36 = this.y;
                                        canvas2.drawCircle((float) j36, (float) j36, (float) j36, this.f132822f);
                                        canvas2.restore();
                                        min = f7 - ((float) this.y);
                                    }
                                    f2 = f5;
                                }
                                long j37 = this.w;
                                canvas2.drawRect(((float) j37) - f2, 0.0f, ((float) j37) - min, (float) this.x, this.f132822f);
                            }
                            if (this.u != null) {
                                float f10 = f5;
                                for (int i6 = 0; i6 < this.u.size(); i6++) {
                                    TimeSpeedModelExtension timeSpeedModelExtension5 = this.u.get(i6);
                                    f10 += ((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension5.getDuration(), timeSpeedModelExtension5.getSpeed()))) * f8;
                                    if (this.s != this.r.size() - 1 || f10 < f7) {
                                        float min2 = Math.min(f10, f7);
                                        long j38 = this.w;
                                        canvas2.drawRect(((float) j38) - (min2 - ((float) f132817a)), 0.0f, ((float) j38) - min2, (float) this.x, this.f132824h);
                                    }
                                }
                            }
                        }
                    }
                    if (this.p) {
                        this.f132828l.setAlpha((int) (this.o * 255.0f));
                        long j39 = this.w;
                        canvas2.drawRect((((float) j39) - f5) - f6, 0.0f, ((float) j39) - f5, (float) this.x, this.f132828l);
                    }
                    f5 += f6;
                } else {
                    if (i3 == 0) {
                        canvas2.save();
                        long j40 = this.w;
                        canvas2.clipRect((float) (j40 - this.y), 0.0f, (float) j40, (float) this.x);
                        long j41 = this.w;
                        long j42 = this.y;
                        canvas2.drawCircle((float) (j41 - j42), (float) j42, (float) j42, this.f132823g);
                        canvas2.restore();
                        long j43 = this.w;
                        long j44 = this.y;
                        canvas2.drawRect((float) (j43 - j44), 0.0f, (float) Math.max(j44, j43 - ((long) i4)), (float) this.x, this.f132823g);
                    } else if (i3 == this.r.size() - 1) {
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.y, (float) this.x);
                        long j45 = this.y;
                        canvas2.drawCircle((float) j45, (float) j45, (float) j45, this.f132823g);
                        canvas2.restore();
                        canvas2.drawRect(((float) this.w) - f5, 0.0f, (float) this.y, (float) this.x, this.f132823g);
                    } else {
                        long j46 = this.w;
                        canvas2.drawRect(((float) j46) - f5, 0.0f, (((float) j46) - f5) - ((float) i4), (float) this.x, this.f132823g);
                    }
                    f5 += (float) i4;
                    if (i3 == this.s - 1) {
                        this.f132827k.setAlpha((int) (this.n * 255.0f));
                        long j47 = this.w;
                        canvas2 = canvas2;
                        canvas2.drawRect(((float) j47) - (f5 - ((float) f132817a)), 0.0f, ((float) j47) - f5, (float) this.x, this.f132827k);
                    } else if (i3 != this.r.size() - 1) {
                        long j48 = this.w;
                        canvas2 = canvas2;
                        canvas2.drawRect(((float) j48) - (f5 - ((float) f132817a)), 0.0f, ((float) j48) - f5, (float) this.x, this.f132824h);
                    }
                }
                i3++;
                j3 = 0;
            }
        } else {
            a(canvas2);
        }
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(List<TimeSpeedModelExtension> list, long j2) {
        this.u = list;
        this.t = j2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(10530);
        super.onMeasure(i2, i3);
        this.w = (long) getMeasuredWidth();
        long measuredHeight = (long) (getMeasuredHeight() / 3);
        this.x = measuredHeight;
        this.y = measuredHeight >> 1;
        MethodCollector.o(10530);
    }

    public final void a(List<TimeSpeedModelExtension> list, long j2) {
        this.f132818b = list;
        TimeSpeedModelExtension timeSpeedModelExtension = this.f132819c;
        if (timeSpeedModelExtension != null) {
            this.f132820d = j2 + ((long) timeSpeedModelExtension.getDuration());
        } else {
            this.f132820d = j2;
        }
        this.q = 1;
        postInvalidate();
    }

    public final void a(List<TimeSpeedModelExtension> list, long j2, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f132819c = timeSpeedModelExtension;
        a(list, j2);
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(11058);
        this.z = 15000;
        this.f132829m = 15000;
        this.B = true;
        this.C = "15s";
        this.q = 1;
        setWillNotDraw(false);
        if (c.a(context)) {
            this.F = true;
        }
        Paint paint = new Paint(1);
        this.f132821e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f132821e.setStrokeCap(Paint.Cap.ROUND);
        this.f132821e.setStrokeWidth(n.b(context, 6.0f));
        this.f132821e.setColor(b.c(getContext(), R.color.n2));
        Paint paint2 = new Paint(1);
        this.f132823g = paint2;
        paint2.setColor(b.c(getContext(), R.color.bm));
        this.f132823g.setAlpha(86);
        Paint paint3 = new Paint(1);
        this.f132822f = paint3;
        paint3.setColor(b.c(getContext(), R.color.bm));
        Paint paint4 = new Paint(1);
        this.f132825i = paint4;
        paint4.setColor(b.c(getContext(), R.color.bh));
        Paint paint5 = new Paint(1);
        this.f132826j = paint5;
        paint5.setColor(b.c(getContext(), R.color.bm));
        Paint paint6 = new Paint(1);
        this.f132824h = paint6;
        paint6.setStyle(Paint.Style.FILL);
        this.f132824h.setColor(b.c(getContext(), R.color.f159928l));
        Paint paint7 = new Paint(1);
        this.f132827k = paint7;
        paint7.setStyle(Paint.Style.FILL);
        this.f132827k.setColor(b.c(getContext(), R.color.f159928l));
        Paint paint8 = new Paint(1);
        this.f132828l = paint8;
        paint8.setStyle(Paint.Style.FILL);
        this.f132828l.setColor(b.c(getContext(), R.color.f159928l));
        Paint paint9 = new Paint(1);
        this.v = paint9;
        paint9.setStyle(Paint.Style.FILL);
        this.v.setColor(b.c(getContext(), R.color.f159928l));
        this.v.setTextSize(n.a(getContext(), 12.0f));
        this.v.setShadowLayer(4.0f, 0.0f, 2.0f, b.c(getContext(), R.color.bl));
        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g);
        if (a2 != null) {
            this.v.setTypeface(a2);
        }
        this.A = (long) this.v.measureText(this.C);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(350L);
        this.D = duration;
        duration.setRepeatCount(-1);
        this.D.setRepeatMode(2);
        this.D.addUpdateListener(new g(this));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f).setDuration(700L);
        this.E = duration2;
        duration2.addUpdateListener(new h(this));
        MethodCollector.o(11058);
    }
}
