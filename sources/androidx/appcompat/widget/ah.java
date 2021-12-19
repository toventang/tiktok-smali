package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.graphics.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ah {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f1530a = {-16842910};

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1531b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1532c = {16843518};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1533d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1534e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1535f = {16842913};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1536g = {-16842919, -16842908};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f1537h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1538i = new ThreadLocal<>();

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1539j = new int[1];

    static {
        Covode.recordClassIndex(466);
    }

    private static TypedValue a() {
        ThreadLocal<TypedValue> threadLocal = f1538i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static int a(Context context, int i2) {
        int[] iArr = f1539j;
        iArr[0] = i2;
        al a2 = al.a(context, (AttributeSet) null, iArr);
        try {
            return a2.b(0, 0);
        } finally {
            a2.f1549a.recycle();
        }
    }

    public static ColorStateList b(Context context, int i2) {
        int[] iArr = f1539j;
        iArr[0] = i2;
        al a2 = al.a(context, (AttributeSet) null, iArr);
        try {
            return a2.e(0);
        } finally {
            a2.f1549a.recycle();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(f1530a, b2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(16842803, a2, true);
        return a(context, i2, a2.getFloat());
    }

    private static int a(Context context, int i2, float f2) {
        int a2 = a(context, i2);
        return a.b(a2, Math.round(((float) Color.alpha(a2)) * f2));
    }
}
