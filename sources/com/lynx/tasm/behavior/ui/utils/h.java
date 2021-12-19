package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.List;

public class h {

    /* renamed from: f  reason: collision with root package name */
    static ThreadLocal<double[]> f56426f = new ThreadLocal<double[]>() {
        /* class com.lynx.tasm.behavior.ui.utils.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35198);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ double[] initialValue() {
            return new double[16];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public g f56427a;

    /* renamed from: b  reason: collision with root package name */
    public float f56428b;

    /* renamed from: c  reason: collision with root package name */
    public float f56429c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f56430d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    public LinkedHashMap<String, Float> f56431e = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(35197);
    }

    public h() {
        this.f56430d.reset();
        this.f56431e.clear();
    }

    public final float b() {
        Float f2 = this.f56431e.get("translateY");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float c() {
        Float f2 = this.f56431e.get("translateZ");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float d() {
        Float f2 = this.f56431e.get("rotate");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float e() {
        Float f2 = this.f56431e.get("rotateX");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float f() {
        Float f2 = this.f56431e.get("rotateY");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    public final float g() {
        Float f2 = this.f56431e.get("scaleX");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 1.0f;
    }

    public final float h() {
        Float f2 = this.f56431e.get("scaleY");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 1.0f;
    }

    public final float a() {
        Float f2 = this.f56431e.get("translateX");
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    private void b(float f2) {
        this.f56431e.put("translateX", Float.valueOf(f2));
    }

    private void c(float f2) {
        this.f56431e.put("translateY", Float.valueOf(f2));
    }

    private void d(float f2) {
        this.f56431e.put("translateZ", Float.valueOf(f2));
    }

    private void e(float f2) {
        this.f56431e.put("rotate", Float.valueOf(f2));
    }

    private void f(float f2) {
        this.f56431e.put("rotateX", Float.valueOf(f2));
    }

    private void g(float f2) {
        this.f56431e.put("rotateY", Float.valueOf(f2));
    }

    private void h(float f2) {
        this.f56431e.put("scaleX", Float.valueOf(f2));
    }

    private void i(float f2) {
        this.f56431e.put("scaleY", Float.valueOf(f2));
    }

    static double a(float f2) {
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (d2 * 3.141592653589793d) / 180.0d;
    }

    public static h a(g gVar, float f2, float f3) {
        h hVar = new h();
        hVar.f56427a = gVar;
        hVar.f56428b = f2 * 0.5f;
        hVar.f56429c = 0.5f * f3;
        if (!(gVar == null || gVar == g.f56421c)) {
            if (gVar.a()) {
                float f4 = gVar.f56422a;
                if (gVar.c()) {
                    f4 *= f2;
                }
                hVar.f56428b = f4;
            }
            if (gVar.b()) {
                float f5 = gVar.f56423b;
                if (gVar.d()) {
                    f5 *= f3;
                }
                hVar.f56429c = f5;
            }
        }
        return hVar;
    }

    public static h a(List<i> list, float f2, float f3, float f4) {
        float f5;
        float f6;
        h hVar = new h();
        if (list != null && !list.isEmpty()) {
            for (i iVar : list) {
                int i2 = iVar.f56432a;
                if (i2 != 1) {
                    if (i2 == 2) {
                        boolean a2 = iVar.a();
                        float f7 = iVar.f56433b;
                        if (a2) {
                            f7 *= f3;
                        }
                        hVar.b(f7);
                    } else if (i2 == 4) {
                        boolean a3 = iVar.a();
                        float f8 = iVar.f56433b;
                        if (a3) {
                            f8 *= f4;
                        }
                        hVar.c(f8);
                    } else if (i2 == 8) {
                        boolean a4 = iVar.a();
                        float f9 = iVar.f56433b;
                        if (a4) {
                            f9 *= f2;
                        }
                        hVar.d(f9);
                    } else if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 == 64) {
                                hVar.f(iVar.f56433b);
                            } else if (i2 == 128) {
                                hVar.g(iVar.f56433b);
                            } else if (i2 != 256) {
                                if (i2 == 512) {
                                    hVar.h(iVar.f56433b);
                                    hVar.i(iVar.f56434c);
                                } else if (i2 == 1024) {
                                    hVar.h(iVar.f56433b);
                                } else if (i2 != 2048) {
                                    return null;
                                } else {
                                    hVar.i(iVar.f56433b);
                                }
                            }
                        }
                        hVar.e(iVar.f56433b);
                    }
                }
                if (iVar.a()) {
                    f5 = iVar.f56433b * f3;
                } else {
                    f5 = iVar.f56433b;
                }
                hVar.b(f5);
                if (iVar.b()) {
                    f6 = iVar.f56434c * f4;
                } else {
                    f6 = iVar.f56434c;
                }
                hVar.c(f6);
                hVar.d(iVar.f56435d);
            }
        }
        return hVar;
    }
}
