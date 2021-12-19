package com.lynx.tasm.d;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f56598a;

    /* renamed from: b  reason: collision with root package name */
    private Typeface[] f56599b;

    static {
        Covode.recordClassIndex(35293);
    }

    d(Typeface typeface) {
        Typeface[] typefaceArr = new Typeface[4];
        this.f56599b = typefaceArr;
        this.f56598a = typeface;
        typefaceArr[0] = typeface;
    }

    /* access modifiers changed from: package-private */
    public final Typeface a(int i2) {
        if (i2 < 0 || i2 > 3) {
            i2 = 0;
        }
        Typeface[] typefaceArr = this.f56599b;
        if (typefaceArr[i2] == null) {
            typefaceArr[i2] = Typeface.create(this.f56598a, i2);
        }
        return this.f56599b[i2];
    }
}
