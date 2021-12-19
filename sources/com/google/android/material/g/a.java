package com.google.android.material.g;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f52426a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f52427b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f52428c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f52429d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f52430e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f52431f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f52432g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f52433h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f52434i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f52435j = {16842913};

    static {
        boolean z;
        Covode.recordClassIndex(32520);
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f52426a = z;
    }

    private static int a(int i2) {
        return androidx.core.graphics.a.b(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f52426a) {
            return new ColorStateList(new int[][]{f52435j, StateSet.NOTHING}, new int[]{a(colorStateList, f52431f), a(colorStateList, f52427b)});
        }
        int[] iArr = f52431f;
        int[] iArr2 = f52432g;
        int[] iArr3 = f52433h;
        int[] iArr4 = f52434i;
        int[] iArr5 = f52427b;
        int[] iArr6 = f52428c;
        int[] iArr7 = f52429d;
        int[] iArr8 = f52430e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f52435j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{a(colorStateList, iArr), a(colorStateList, iArr2), a(colorStateList, iArr3), a(colorStateList, iArr4), 0, a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), a(colorStateList, iArr8), 0});
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int i2;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i2 = 0;
        }
        if (f52426a) {
            return a(i2);
        }
        return i2;
    }
}
