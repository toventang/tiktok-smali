package com.facebook.drawee.e;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f47364a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f47365b;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f47366c;

    /* renamed from: d  reason: collision with root package name */
    private int f47367d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f47368e = -1;

    static {
        Covode.recordClassIndex(28765);
    }

    public final void a(boolean z) {
        this.f47367d = z ? 1 : 0;
    }

    public final void b(boolean z) {
        this.f47368e = z ? 1 : 0;
    }

    public final void a(ColorFilter colorFilter) {
        this.f47366c = colorFilter;
        this.f47365b = true;
    }

    public final void a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            int i2 = this.f47364a;
            if (i2 != -1) {
                drawable.setAlpha(i2);
            }
            if (this.f47365b) {
                drawable.setColorFilter(this.f47366c);
            }
            int i3 = this.f47367d;
            boolean z2 = true;
            if (i3 != -1) {
                if (i3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            int i4 = this.f47368e;
            if (i4 != -1) {
                if (i4 == 0) {
                    z2 = false;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }
}
