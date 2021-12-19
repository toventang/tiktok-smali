package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.i;
import com.airbnb.lottie.e.b.q;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class n implements k, m, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5207a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f5208b;

    /* renamed from: c  reason: collision with root package name */
    private final g f5209c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a f5210d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, Float> f5211e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f5212f;

    /* renamed from: g  reason: collision with root package name */
    private final a<?, Float> f5213g;

    /* renamed from: h  reason: collision with root package name */
    private final a<?, Float> f5214h;

    /* renamed from: i  reason: collision with root package name */
    private final a<?, Float> f5215i;

    /* renamed from: j  reason: collision with root package name */
    private final a<?, Float> f5216j;

    /* renamed from: k  reason: collision with root package name */
    private final a<?, Float> f5217k;

    /* renamed from: l  reason: collision with root package name */
    private s f5218l;

    /* renamed from: m  reason: collision with root package name */
    private b f5219m;
    private boolean n;

    static {
        Covode.recordClassIndex(2200);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5208b;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.n = false;
        this.f5209c.invalidateSelf();
    }

    /* renamed from: com.airbnb.lottie.a.a.n$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5220a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2201(0x899, float:3.084E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.i$a[] r0 = com.airbnb.lottie.e.b.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.a.a.n.AnonymousClass1.f5220a = r2
                com.airbnb.lottie.e.b.i$a r0 = com.airbnb.lottie.e.b.i.a.Star     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.a.a.n.AnonymousClass1.f5220a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.i$a r0 = com.airbnb.lottie.e.b.i.a.Polygon     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.n.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.a.a.m
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
        b bVar;
        if (this.n) {
            return this.f5207a;
        }
        this.f5207a.reset();
        int i2 = AnonymousClass1.f5220a[this.f5210d.ordinal()];
        double d3 = 0.0d;
        if (i2 == 1) {
            float floatValue = this.f5211e.f().floatValue();
            a<?, Float> aVar = this.f5213g;
            if (aVar != null) {
                d3 = (double) aVar.f().floatValue();
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
            float floatValue2 = this.f5215i.f().floatValue();
            float floatValue3 = this.f5214h.f().floatValue();
            a<?, Float> aVar2 = this.f5216j;
            if (aVar2 != null) {
                f2 = aVar2.f().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            a<?, Float> aVar3 = this.f5217k;
            if (aVar3 != null) {
                f3 = aVar3.f().floatValue() / 100.0f;
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
                this.f5207a.moveTo(f4, f5);
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
                this.f5207a.moveTo(f4, f5);
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
                    this.f5207a.lineTo(f16, f17);
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
                    this.f5207a.cubicTo(f4 - f19, f5 - f20, f16 + f22, f17 + f23, f16, f17);
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
            PointF f24 = this.f5212f.f();
            this.f5207a.offset(f24.x, f24.y);
            this.f5207a.close();
        } else if (i2 == 2) {
            int floor = (int) Math.floor((double) this.f5211e.f().floatValue());
            a<?, Float> aVar4 = this.f5213g;
            if (aVar4 != null) {
                d3 = (double) aVar4.f().floatValue();
            }
            double radians2 = Math.toRadians(d3 - 90.0d);
            double d14 = (double) floor;
            Double.isNaN(d14);
            float floatValue4 = this.f5217k.f().floatValue() / 100.0f;
            float floatValue5 = this.f5215i.f().floatValue();
            double d15 = (double) floatValue5;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d15);
            float f25 = (float) (d15 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d15);
            float f26 = (float) (d15 * sin6);
            this.f5207a.moveTo(f25, f26);
            double d16 = (double) ((float) (6.283185307179586d / d14));
            Double.isNaN(d16);
            double d17 = radians2 + d16;
            double ceil2 = Math.ceil(d14);
            int i4 = 0;
            while (((double) i4) < ceil2) {
                double cos7 = Math.cos(d17);
                Double.isNaN(d15);
                float f27 = (float) (cos7 * d15);
                double sin7 = Math.sin(d17);
                Double.isNaN(d15);
                float f28 = (float) (d15 * sin7);
                if (floatValue4 != 0.0f) {
                    double atan23 = (double) ((float) (Math.atan2((double) f26, (double) f25) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (double) ((float) (Math.atan2((double) f28, (double) f27) - 1.5707963267948966d));
                    float f29 = floatValue5 * floatValue4 * 0.25f;
                    this.f5207a.cubicTo(f25 - (cos8 * f29), f26 - (sin8 * f29), f27 + (((float) Math.cos(atan24)) * f29), f28 + (f29 * ((float) Math.sin(atan24))), f27, f28);
                } else {
                    this.f5207a.lineTo(f27, f28);
                }
                Double.isNaN(d16);
                d17 += d16;
                i4++;
                f26 = f28;
                f25 = f27;
            }
            PointF f30 = this.f5212f.f();
            this.f5207a.offset(f30.x, f30.y);
            this.f5207a.close();
        }
        this.f5207a.close();
        if (!d.a.f5625a || (bVar = this.f5219m) == null) {
            com.airbnb.lottie.i.g.a(this.f5207a, this.f5218l);
        } else {
            bVar.a(this.f5207a);
        }
        this.n = true;
        return this.f5207a;
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        b bVar;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f5251a == q.a.Simultaneously) {
                    if (!d.a.f5625a || (bVar = this.f5219m) == null) {
                        this.f5218l = sVar;
                        sVar.a(this);
                    } else {
                        bVar.a(sVar);
                        sVar.a(this);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == k.s) {
            this.f5211e.a(cVar);
        } else if (t == k.t) {
            this.f5213g.a(cVar);
        } else if (t == k.f5744j) {
            this.f5212f.a(cVar);
        } else if (t == k.u && (aVar2 = this.f5214h) != null) {
            aVar2.a(cVar);
        } else if (t == k.v) {
            this.f5215i.a(cVar);
        } else if (t == k.w && (aVar = this.f5216j) != null) {
            aVar.a(cVar);
        } else if (t == k.x) {
            this.f5217k.a(cVar);
        }
    }

    public n(g gVar, com.airbnb.lottie.e.c.a aVar, i iVar) {
        if (d.a.f5625a) {
            this.f5219m = new b();
        }
        this.f5209c = gVar;
        this.f5208b = iVar.f5409a;
        i.a aVar2 = iVar.f5410b;
        this.f5210d = aVar2;
        a<Float, Float> a2 = iVar.f5411c.a();
        this.f5211e = a2;
        a<PointF, PointF> a3 = iVar.f5412d.a();
        this.f5212f = a3;
        a<Float, Float> a4 = iVar.f5413e.a();
        this.f5213g = a4;
        a<Float, Float> a5 = iVar.f5415g.a();
        this.f5215i = a5;
        a<Float, Float> a6 = iVar.f5417i.a();
        this.f5217k = a6;
        if (aVar2 == i.a.Star) {
            this.f5214h = iVar.f5414f.a();
            this.f5216j = iVar.f5416h.a();
        } else {
            this.f5214h = null;
            this.f5216j = null;
        }
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        aVar.a(a5);
        aVar.a(a6);
        if (aVar2 == i.a.Star) {
            aVar.a(this.f5214h);
            aVar.a(this.f5216j);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (aVar2 == i.a.Star) {
            this.f5214h.a(this);
            this.f5216j.a(this);
        }
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
