package com.facebook.drawee.f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.Arrays;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public a f47475a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47476b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f47477c;

    /* renamed from: d  reason: collision with root package name */
    public int f47478d;

    /* renamed from: e  reason: collision with root package name */
    public float f47479e;

    /* renamed from: f  reason: collision with root package name */
    public int f47480f;

    /* renamed from: g  reason: collision with root package name */
    public float f47481g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47482h;

    static {
        Covode.recordClassIndex(28801);
    }

    public static e b() {
        e eVar = new e();
        eVar.f47476b = true;
        return eVar;
    }

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY;

        static {
            Covode.recordClassIndex(28802);
        }
    }

    public final float[] a() {
        if (this.f47477c == null) {
            this.f47477c = new float[8];
        }
        return this.f47477c;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        a aVar = this.f47475a;
        int i5 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = ((i2 * 31) + (this.f47476b ? 1 : 0)) * 31;
        float[] fArr = this.f47477c;
        if (fArr != null) {
            i3 = Arrays.hashCode(fArr);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f47478d) * 31;
        float f2 = this.f47479e;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        } else {
            i4 = 0;
        }
        int i8 = (((i7 + i4) * 31) + this.f47480f) * 31;
        float f3 = this.f47481g;
        if (f3 != 0.0f) {
            i5 = Float.floatToIntBits(f3);
        }
        return ((i8 + i5) * 31) + (this.f47482h ? 1 : 0);
    }

    public final e a(boolean z) {
        this.f47476b = z;
        return this;
    }

    public final e b(int i2) {
        this.f47480f = i2;
        return this;
    }

    public final e a(float f2) {
        Arrays.fill(a(), f2);
        return this;
    }

    public final e a(int i2) {
        this.f47478d = i2;
        this.f47475a = a.OVERLAY_COLOR;
        return this;
    }

    public final e c(float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "the border width cannot be < 0");
        this.f47479e = f2;
        return this;
    }

    public final e d(float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "the padding cannot be < 0");
        this.f47481g = f2;
        return this;
    }

    public static e b(float f2) {
        return new e().a(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f47476b == eVar.f47476b && this.f47478d == eVar.f47478d && Float.compare(eVar.f47479e, this.f47479e) == 0 && this.f47480f == eVar.f47480f && Float.compare(eVar.f47481g, this.f47481g) == 0 && this.f47475a == eVar.f47475a && this.f47482h == eVar.f47482h) {
            return Arrays.equals(this.f47477c, eVar.f47477c);
        }
        return false;
    }

    public final e a(int i2, float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "the border width cannot be < 0");
        this.f47479e = f2;
        this.f47480f = i2;
        return this;
    }

    public final e a(float f2, float f3, float f4, float f5) {
        float[] a2 = a();
        a2[1] = f2;
        a2[0] = f2;
        a2[3] = f3;
        a2[2] = f3;
        a2[5] = f4;
        a2[4] = f4;
        a2[7] = f5;
        a2[6] = f5;
        return this;
    }

    public static e b(float f2, float f3, float f4, float f5) {
        return new e().a(f2, f3, f4, f5);
    }
}
