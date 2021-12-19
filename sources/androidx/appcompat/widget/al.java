package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.a.a.a;
import androidx.core.content.a.f;
import com.bytedance.covode.number.Covode;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public final TypedArray f1549a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1550b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1551c;

    static {
        Covode.recordClassIndex(470);
    }

    public final CharSequence c(int i2) {
        return this.f1549a.getText(i2);
    }

    public final String d(int i2) {
        return this.f1549a.getString(i2);
    }

    public final boolean f(int i2) {
        return this.f1549a.hasValue(i2);
    }

    public final Drawable b(int i2) {
        int resourceId;
        if (!this.f1549a.hasValue(i2) || (resourceId = this.f1549a.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return h.a().a(this.f1550b, resourceId, true);
    }

    public final ColorStateList e(int i2) {
        int resourceId;
        ColorStateList a2;
        if (!this.f1549a.hasValue(i2) || (resourceId = this.f1549a.getResourceId(i2, 0)) == 0 || (a2 = a.a(this.f1550b, resourceId)) == null) {
            return this.f1549a.getColorStateList(i2);
        }
        return a2;
    }

    public final Drawable a(int i2) {
        int resourceId;
        if (!this.f1549a.hasValue(i2) || (resourceId = this.f1549a.getResourceId(i2, 0)) == 0) {
            return this.f1549a.getDrawable(i2);
        }
        return a.b(this.f1550b, resourceId);
    }

    private al(Context context, TypedArray typedArray) {
        this.f1550b = context;
        this.f1549a = typedArray;
    }

    public final float a(int i2, float f2) {
        return this.f1549a.getFloat(i2, f2);
    }

    public final int b(int i2, int i3) {
        return this.f1549a.getColor(i2, i3);
    }

    public final int c(int i2, int i3) {
        return this.f1549a.getInteger(i2, i3);
    }

    public final int d(int i2, int i3) {
        return this.f1549a.getDimensionPixelOffset(i2, i3);
    }

    public final int e(int i2, int i3) {
        return this.f1549a.getDimensionPixelSize(i2, i3);
    }

    public final int f(int i2, int i3) {
        return this.f1549a.getLayoutDimension(i2, i3);
    }

    public final int g(int i2, int i3) {
        return this.f1549a.getResourceId(i2, i3);
    }

    public final int a(int i2, int i3) {
        return this.f1549a.getInt(i2, i3);
    }

    public final boolean a(int i2, boolean z) {
        return this.f1549a.getBoolean(i2, z);
    }

    public static al a(Context context, int i2, int[] iArr) {
        return new al(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static al a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new al(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public final Typeface a(int i2, int i3, f.a aVar) {
        int resourceId = this.f1549a.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1551c == null) {
            this.f1551c = new TypedValue();
        }
        return f.a(this.f1550b, resourceId, this.f1551c, i3, aVar);
    }

    public static al a(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new al(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }
}
