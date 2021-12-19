package com.ss.android.ugc.tools.view.style;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f150136a = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f150137l = new float[0];

    /* renamed from: b  reason: collision with root package name */
    private Integer f150138b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f150139c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f150140d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f150141e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f150142f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f150143g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f150144h;

    /* renamed from: i  reason: collision with root package name */
    private Float f150145i;

    /* renamed from: j  reason: collision with root package name */
    private float[] f150146j;

    /* renamed from: k  reason: collision with root package name */
    private GradientDrawable.Orientation f150147k;

    public static final class a {
        static {
            Covode.recordClassIndex(98827);
        }

        private a() {
        }

        public static b a() {
            return new b((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private b() {
        this.f150146j = f150137l;
    }

    static {
        Covode.recordClassIndex(98826);
    }

    public final GradientDrawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.f150138b;
        if (num != null) {
            gradientDrawable.setShape(num.intValue());
        }
        Integer num2 = this.f150139c;
        if (num2 != null) {
            gradientDrawable.setColor(num2.intValue());
        }
        int[] iArr = this.f150140d;
        if (iArr != null) {
            gradientDrawable.setColors(iArr);
        }
        Integer num3 = this.f150141e;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.f150142f;
            if (num4 == null) {
                l.b();
            }
            gradientDrawable.setStroke(num4.intValue(), intValue);
        }
        Integer num5 = this.f150143g;
        if (num5 != null) {
            int intValue2 = num5.intValue();
            Integer num6 = this.f150144h;
            if (num6 == null) {
                l.b();
            }
            gradientDrawable.setSize(intValue2, num6.intValue());
        }
        Float f2 = this.f150145i;
        if (f2 != null) {
            gradientDrawable.setCornerRadius(f2.floatValue());
        }
        float[] fArr = this.f150146j;
        if (fArr != f150137l) {
            gradientDrawable.setCornerRadii(fArr);
        }
        GradientDrawable.Orientation orientation = this.f150147k;
        if (orientation != null) {
            gradientDrawable.setOrientation(orientation);
        }
        return gradientDrawable;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public final b a(float[] fArr) {
        this.f150146j = fArr;
        return this;
    }

    public final b a(float f2) {
        this.f150145i = Float.valueOf(f2);
        return this;
    }

    public final b b(int i2) {
        this.f150139c = Integer.valueOf(i2);
        return this;
    }

    public final b a(int i2) {
        this.f150138b = Integer.valueOf(i2);
        return this;
    }

    public final b a(int i2, int i3) {
        this.f150141e = Integer.valueOf(i2);
        this.f150142f = Integer.valueOf(i3);
        return this;
    }
}
