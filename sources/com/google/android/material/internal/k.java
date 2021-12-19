package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.al;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f52566a = {R.attr.ol};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f52567b = {R.attr.oo};

    static {
        Covode.recordClassIndex(32565);
    }

    public static void a(Context context) {
        a(context, f52566a, "Theme.AppCompat");
    }

    private static void b(Context context) {
        a(context, f52567b, "Theme.MaterialComponents");
    }

    private static boolean a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    private static void a(Context context, int[] iArr, String str) {
        if (!a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    private static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.t3, R.attr.t4}, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            b(context);
        }
        a(context);
    }

    public static TypedArray a(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        c(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static al b(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        c(context, attributeSet, iArr, i2, i3, iArr2);
        return al.a(context, attributeSet, iArr, i2, i3);
    }

    private static boolean d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        for (int i4 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i4, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static void c(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.t3, R.attr.t4}, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = d(context, attributeSet, iArr, i2, i3, iArr2);
        } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
