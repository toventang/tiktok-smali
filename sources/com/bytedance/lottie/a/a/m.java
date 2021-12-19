package com.bytedance.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.i;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import java.util.List;

public final class m implements j, l, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40368a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f40369b;

    /* renamed from: c  reason: collision with root package name */
    private final i f40370c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a f40371d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, Float> f40372e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f40373f;

    /* renamed from: g  reason: collision with root package name */
    private final a<?, Float> f40374g;

    /* renamed from: h  reason: collision with root package name */
    private final a<?, Float> f40375h;

    /* renamed from: i  reason: collision with root package name */
    private final a<?, Float> f40376i;

    /* renamed from: j  reason: collision with root package name */
    private final a<?, Float> f40377j;

    /* renamed from: k  reason: collision with root package name */
    private final a<?, Float> f40378k;

    /* renamed from: l  reason: collision with root package name */
    private r f40379l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f40380m;

    static {
        Covode.recordClassIndex(24844);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40369b;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40380m = false;
        this.f40370c.invalidateSelf();
    }

    /* renamed from: com.bytedance.lottie.a.a.m$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40381a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24845(0x610d, float:3.4815E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.i$a[] r0 = com.bytedance.lottie.c.b.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.a.a.m.AnonymousClass1.f40381a = r2
                com.bytedance.lottie.c.b.i$a r0 = com.bytedance.lottie.c.b.i.a.Star     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.a.a.m.AnonymousClass1.f40381a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.i$a r0 = com.bytedance.lottie.c.b.i.a.Polygon     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.a.a.m.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        float f2;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f40380m) {
            return this.f40368a;
        }
        this.f40368a.reset();
        int i2 = AnonymousClass1.f40381a[this.f40371d.ordinal()];
        double d3 = 0.0d;
        if (i2 == 1) {
            float floatValue = this.f40372e.d().floatValue();
            a<?, Float> aVar = this.f40374g;
            if (aVar != null) {
                d3 = (double) aVar.d().floatValue();
            }
            double radians = Math.toRadians(d3 - 90.0d);
            double d4 = (double) floatValue;
            Double.isNaN(d4);
            float f13 = (float) (6.283185307179586d / d4);
            float f14 = f13 / 2.0f;
            float f15 = floatValue - ((float) ((int) floatValue));
            if (f15 != 0.0f) {
                double d5 = (double) ((1.0f - f15) * f14);
                Double.isNaN(d5);
                radians += d5;
            }
            float floatValue2 = this.f40376i.d().floatValue();
            float floatValue3 = this.f40375h.d().floatValue();
            a<?, Float> aVar2 = this.f40377j;
            if (aVar2 != null) {
                f2 = aVar2.d().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            a<?, Float> aVar3 = this.f40378k;
            if (aVar3 != null) {
                f3 = aVar3.d().floatValue() / 100.0f;
            } else {
                f3 = 0.0f;
            }
            if (f15 != 0.0f) {
                f6 = ((floatValue2 - floatValue3) * f15) + floatValue3;
                double d6 = (double) f6;
                double cos = Math.cos(radians);
                Double.isNaN(d6);
                f4 = (float) (d6 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d6);
                f5 = (float) (d6 * sin);
                this.f40368a.moveTo(f4, f5);
                double d7 = (double) ((f13 * f15) / 2.0f);
                Double.isNaN(d7);
                d2 = radians + d7;
            } else {
                double d8 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d8);
                f4 = (float) (cos2 * d8);
                double sin2 = Math.sin(radians);
                Double.isNaN(d8);
                f5 = (float) (d8 * sin2);
                this.f40368a.moveTo(f4, f5);
                double d9 = (double) f14;
                Double.isNaN(d9);
                d2 = radians + d9;
                f6 = 0.0f;
            }
            double d10 = 2.0d;
            double ceil = Math.ceil(d4) * 2.0d;
            boolean z = false;
            int i3 = 0;
            while (true) {
                double d11 = (double) i3;
                if (d11 >= ceil) {
                    break;
                }
                if (z) {
                    f7 = floatValue2;
                } else {
                    f7 = floatValue3;
                }
                if (f6 == 0.0f || d11 != ceil - d10) {
                    f8 = f14;
                } else {
                    f8 = (f13 * f15) / 2.0f;
                }
                if (f6 != 0.0f && d11 == ceil - 1.0d) {
                    f7 = f6;
                    f6 = f7;
                }
                double d12 = (double) f7;
                double cos3 = Math.cos(d2);
                Double.isNaN(d12);
                float f16 = (float) (d12 * cos3);
                double sin3 = Math.sin(d2);
                Double.isNaN(d12);
                float f17 = (float) (d12 * sin3);
                if (f2 == 0.0f && f3 == 0.0f) {
                    this.f40368a.lineTo(f16, f17);
                } else {
                    double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f4) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) f17, (double) f16) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    if (z) {
                        f9 = f2;
                        f10 = f3;
                        f11 = floatValue3;
                        f12 = floatValue2;
                    } else {
                        f9 = f3;
                        f10 = f2;
                        f11 = floatValue2;
                        f12 = floatValue3;
                    }
                    float f18 = f11 * f9 * 0.47829f;
                    float f19 = cos4 * f18;
                    float f20 = f18 * sin4;
                    float f21 = f12 * f10 * 0.47829f;
                    float f22 = cos5 * f21;
                    float f23 = f21 * sin5;
                    if (f15 != 0.0f) {
                        if (i3 == 0) {
                            f19 *= f15;
                            f20 *= f15;
                        } else if (d11 == ceil - 1.0d) {
                            f22 *= f15;
                            f23 *= f15;
                        }
                    }
                    this.f40368a.cubicTo(f4 - f19, f5 - f20, f16 + f22, f17 + f23, f16, f17);
                }
                double d13 = (double) f8;
                Double.isNaN(d13);
                d2 += d13;
                z = !z;
                i3++;
                f4 = f16;
                d10 = 2.0d;
                f5 = f17;
            }
            PointF d14 = this.f40373f.d();
            this.f40368a.offset(d14.x, d14.y);
            this.f40368a.close();
        } else if (i2 == 2) {
            int floor = (int) Math.floor((double) this.f40372e.d().floatValue());
            a<?, Float> aVar4 = this.f40374g;
            if (aVar4 != null) {
                d3 = (double) aVar4.d().floatValue();
            }
            double radians2 = Math.toRadians(d3 - 90.0d);
            double d15 = (double) floor;
            Double.isNaN(d15);
            float floatValue4 = this.f40378k.d().floatValue() / 100.0f;
            float floatValue5 = this.f40376i.d().floatValue();
            double d16 = (double) floatValue5;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d16);
            float f24 = (float) (d16 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d16);
            float f25 = (float) (d16 * sin6);
            this.f40368a.moveTo(f24, f25);
            double d17 = (double) ((float) (6.283185307179586d / d15));
            Double.isNaN(d17);
            double d18 = radians2 + d17;
            double ceil2 = Math.ceil(d15);
            int i4 = 0;
            while (((double) i4) < ceil2) {
                double cos7 = Math.cos(d18);
                Double.isNaN(d16);
                float f26 = (float) (cos7 * d16);
                double sin7 = Math.sin(d18);
                Double.isNaN(d16);
                float f27 = (float) (d16 * sin7);
                if (floatValue4 != 0.0f) {
                    double atan23 = (double) ((float) (Math.atan2((double) f25, (double) f24) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (double) ((float) (Math.atan2((double) f27, (double) f26) - 1.5707963267948966d));
                    float f28 = floatValue5 * floatValue4 * 0.25f;
                    this.f40368a.cubicTo(f24 - (cos8 * f28), f25 - (sin8 * f28), f26 + (((float) Math.cos(atan24)) * f28), f27 + (f28 * ((float) Math.sin(atan24))), f26, f27);
                } else {
                    this.f40368a.lineTo(f26, f27);
                }
                Double.isNaN(d17);
                d18 += d17;
                i4++;
                f25 = f27;
                f24 = f26;
            }
            PointF d19 = this.f40373f.d();
            this.f40368a.offset(d19.x, d19.y);
            this.f40368a.close();
        }
        this.f40368a.close();
        h.a(this.f40368a, this.f40379l);
        this.f40380m = true;
        return this.f40368a;
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f40410a == q.a.Simultaneously) {
                    this.f40379l = rVar;
                    rVar.a(this);
                }
            }
        }
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == com.bytedance.lottie.m.o) {
            this.f40372e.a(cVar);
        } else if (t == com.bytedance.lottie.m.p) {
            this.f40374g.a(cVar);
        } else if (t == com.bytedance.lottie.m.f40809h) {
            this.f40373f.a(cVar);
        } else if (t == com.bytedance.lottie.m.q && (aVar2 = this.f40375h) != null) {
            aVar2.a(cVar);
        } else if (t == com.bytedance.lottie.m.r) {
            this.f40376i.a(cVar);
        } else if (t == com.bytedance.lottie.m.s && (aVar = this.f40377j) != null) {
            aVar.a(cVar);
        } else if (t == com.bytedance.lottie.m.t) {
            this.f40378k.a(cVar);
        }
    }

    public m(com.bytedance.lottie.i iVar, com.bytedance.lottie.c.c.a aVar, com.bytedance.lottie.c.b.i iVar2) {
        this.f40370c = iVar;
        this.f40369b = iVar2.f40533a;
        i.a aVar2 = iVar2.f40534b;
        this.f40371d = aVar2;
        a<Float, Float> a2 = iVar2.f40535c.a();
        this.f40372e = a2;
        a<PointF, PointF> a3 = iVar2.f40536d.a();
        this.f40373f = a3;
        a<Float, Float> a4 = iVar2.f40537e.a();
        this.f40374g = a4;
        a<Float, Float> a5 = iVar2.f40539g.a();
        this.f40376i = a5;
        a<Float, Float> a6 = iVar2.f40541i.a();
        this.f40378k = a6;
        if (aVar2 == i.a.Star) {
            this.f40375h = iVar2.f40538f.a();
            this.f40377j = iVar2.f40540h.a();
        } else {
            this.f40375h = null;
            this.f40377j = null;
        }
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        aVar.a(a5);
        aVar.a(a6);
        if (aVar2 == i.a.Star) {
            aVar.a(this.f40375h);
            aVar.a(this.f40377j);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (aVar2 == i.a.Star) {
            this.f40375h.a(this);
            this.f40377j.a(this);
        }
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
