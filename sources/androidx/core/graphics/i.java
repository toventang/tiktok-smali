package androidx.core.graphics;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i extends h {
    static {
        Covode.recordClassIndex(800);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.h
    public final Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2465a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2471g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.h
    public final Method a(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
