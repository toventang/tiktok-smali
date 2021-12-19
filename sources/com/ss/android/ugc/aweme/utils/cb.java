package com.ss.android.ugc.aweme.utils;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class cb {

    /* renamed from: a  reason: collision with root package name */
    public static final cb f142761a = new cb();

    private cb() {
    }

    static {
        Covode.recordClassIndex(93381);
    }

    public static Drawable a(int i2, float f2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        l.b(paint, "");
        paint.setColor(i2);
        Paint paint2 = shapeDrawable.getPaint();
        l.b(paint2, "");
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = shapeDrawable.getPaint();
        l.b(paint3, "");
        paint3.setAntiAlias(true);
        return shapeDrawable;
    }

    public static Drawable a(int[] iArr, GradientDrawable.Orientation orientation, float f2) {
        l.d(iArr, "");
        l.d(orientation, "");
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static Drawable a(int i2, float f2, float f3, float f4, float f5) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, null, null));
        Paint paint = shapeDrawable.getPaint();
        l.b(paint, "");
        paint.setColor(i2);
        Paint paint2 = shapeDrawable.getPaint();
        l.b(paint2, "");
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint3 = shapeDrawable.getPaint();
        l.b(paint3, "");
        paint3.setAntiAlias(true);
        return shapeDrawable;
    }
}
