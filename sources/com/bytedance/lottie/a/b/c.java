package com.bytedance.lottie.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.a;
import java.util.List;

public final class c extends f<Float> {

    /* renamed from: e  reason: collision with root package name */
    private static final Float f40422e = Float.valueOf(0.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final Float f40423f = Float.valueOf(1.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final Float f40424g = Float.valueOf(30.0f);

    /* renamed from: h  reason: collision with root package name */
    private static final Float f40425h = Float.valueOf(35.0f);

    /* renamed from: i  reason: collision with root package name */
    private static final Float f40426i = Float.valueOf(60.0f);

    /* renamed from: j  reason: collision with root package name */
    private static final Float f40427j = Float.valueOf(90.0f);

    /* renamed from: k  reason: collision with root package name */
    private static final Float f40428k = Float.valueOf(100.0f);

    /* renamed from: l  reason: collision with root package name */
    private static final Float f40429l = Float.valueOf(180.0f);

    /* renamed from: m  reason: collision with root package name */
    private static final Float f40430m = Float.valueOf(197.0f);

    static {
        Covode.recordClassIndex(24854);
    }

    public c(List<a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.a.b.a
    public final /* synthetic */ Object a(a aVar, float f2) {
        Object a2;
        if (aVar.f40720c == null || aVar.f40721d == null) {
            if (aVar.f40719b != null) {
                throw new IllegalStateException("Missing values for keyframe. and " + aVar.toString() + ".Composition is" + aVar.f40719b.toString());
            }
            throw new IllegalStateException("Missing values for keyframe. and " + aVar.toString());
        } else if (this.f40419d != null && (a2 = this.f40419d.a(aVar.f40723f, aVar.f40724g.floatValue(), aVar.f40720c, aVar.f40721d, f2, b(), this.f40418c)) != null) {
            return a2;
        } else {
            float floatValue = aVar.f40720c.floatValue();
            float floatValue2 = floatValue + (f2 * (aVar.f40721d.floatValue() - floatValue));
            if (floatValue2 == 0.0f) {
                return f40422e;
            }
            if (floatValue2 == 1.0f) {
                return f40423f;
            }
            if (floatValue2 == 30.0f) {
                return f40424g;
            }
            if (floatValue2 == 35.0f) {
                return f40425h;
            }
            if (floatValue2 == 60.0f) {
                return f40426i;
            }
            if (floatValue2 == 90.0f) {
                return f40427j;
            }
            if (floatValue2 == 100.0f) {
                return f40428k;
            }
            if (floatValue2 == 180.0f) {
                return f40429l;
            }
            if (floatValue2 == 197.0f) {
                return f40430m;
            }
            return Float.valueOf(floatValue2);
        }
    }
}
