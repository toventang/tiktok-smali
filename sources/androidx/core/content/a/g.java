package androidx.core.content.a;

import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(720);
    }

    public static final int b(TypedArray typedArray) {
        l.c(typedArray, "");
        a(typedArray, 2);
        return typedArray.getInt(2, 0);
    }

    public static final boolean a(TypedArray typedArray) {
        l.c(typedArray, "");
        a(typedArray, 0);
        return typedArray.getBoolean(0, false);
    }

    public static final void a(TypedArray typedArray, int i2) {
        if (!typedArray.hasValue(i2)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final int b(TypedArray typedArray, int i2) {
        l.c(typedArray, "");
        a(typedArray, i2);
        return typedArray.getColor(i2, 0);
    }
}
