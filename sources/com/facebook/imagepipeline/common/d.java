package com.facebook.imagepipeline.common;

import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.k.b;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f47747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47748b;

    /* renamed from: c  reason: collision with root package name */
    public final float f47749c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47750d;

    static {
        Covode.recordClassIndex(28926);
    }

    public int hashCode() {
        return b.a(this.f47747a, this.f47748b);
    }

    public String toString() {
        return a.a(null, "%dx%d", new Object[]{Integer.valueOf(this.f47747a), Integer.valueOf(this.f47748b)});
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f47747a == dVar.f47747a && this.f47748b == dVar.f47748b) {
            return true;
        }
        return false;
    }

    public d(int i2, int i3) {
        this(i2, i3, (byte) 0);
    }

    private d(int i2, int i3, byte b2) {
        this(i2, i3, (char) 0);
    }

    private d(int i2, int i3, char c2) {
        boolean z;
        boolean z2 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        i.a(i3 <= 0 ? false : z2);
        this.f47747a = i2;
        this.f47748b = i3;
        this.f47749c = 2048.0f;
        this.f47750d = 0.6666667f;
    }
}
