package com.bytedance.tux.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.d;
import com.bytedance.tux.h.i;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Integer f44775a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f44776b;

    /* renamed from: c  reason: collision with root package name */
    public Float f44777c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f44778d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f44779e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f44780f;

    /* renamed from: g  reason: collision with root package name */
    public int f44781g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f44782h = -1;

    /* renamed from: i  reason: collision with root package name */
    public Float f44783i;

    /* renamed from: j  reason: collision with root package name */
    public Float f44784j;

    /* renamed from: k  reason: collision with root package name */
    public Float f44785k;

    /* renamed from: l  reason: collision with root package name */
    public Float f44786l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f44787m = true;

    static {
        Covode.recordClassIndex(27348);
    }

    public final Drawable a(Context context) {
        float f2;
        float f3;
        float f4;
        l.c(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.f44776b;
        if (num != null) {
            Integer a2 = a(context, num);
            if (a2 != null) {
                gradientDrawable.setColor(a2.intValue());
            }
        } else {
            Integer num2 = this.f44775a;
            if (num2 != null) {
                gradientDrawable.setColor(num2.intValue());
            }
        }
        Integer num3 = this.f44778d;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.f44780f;
            if (num4 != null) {
                Integer a3 = a(context, num4);
                if (a3 != null) {
                    gradientDrawable.setStroke(intValue, a3.intValue());
                }
            } else {
                Integer num5 = this.f44779e;
                if (num5 != null) {
                    gradientDrawable.setStroke(intValue, num5.intValue());
                }
            }
        }
        Float f5 = this.f44777c;
        if (f5 != null) {
            gradientDrawable.setCornerRadius(f5.floatValue());
        }
        Float f6 = this.f44783i;
        if (!(f6 == null && this.f44784j == null && this.f44785k == null && this.f44786l == null)) {
            float f7 = 0.0f;
            if (f6 != null) {
                f2 = f6.floatValue();
            } else {
                f2 = 0.0f;
            }
            Float f8 = this.f44784j;
            if (f8 != null) {
                f3 = f8.floatValue();
            } else {
                f3 = 0.0f;
            }
            Float f9 = this.f44786l;
            if (f9 != null) {
                f4 = f9.floatValue();
            } else {
                f4 = 0.0f;
            }
            Float f10 = this.f44785k;
            if (f10 != null) {
                f7 = f10.floatValue();
            }
            gradientDrawable.setCornerRadii((!this.f44787m || !i.a(context)) ? new float[]{f2, f2, f3, f3, f4, f4, f7, f7} : new float[]{f3, f3, f2, f2, f7, f7, f4, f4});
        }
        int i2 = this.f44782h;
        if (i2 >= 0 || this.f44781g >= 0) {
            gradientDrawable.setSize(i2, this.f44781g);
        }
        return gradientDrawable;
    }

    private static Integer a(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return d.a(context, num.intValue());
    }
}
