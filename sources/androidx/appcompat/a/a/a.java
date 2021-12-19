package androidx.appcompat.a.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.h;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f832a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0017a>> f833b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f834c = new Object();

    static {
        Covode.recordClassIndex(226);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.a.a.a$a  reason: collision with other inner class name */
    public static class C0017a {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f835a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f836b;

        static {
            Covode.recordClassIndex(227);
        }

        C0017a(ColorStateList colorStateList, Configuration configuration) {
            this.f835a = colorStateList;
            this.f836b = configuration;
        }
    }

    public static Drawable b(Context context, int i2) {
        return h.a().a(context, i2);
    }

    private static ColorStateList c(Context context, int i2) {
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f832a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i2, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return androidx.core.content.a.a.a(resources2, resources2.getXml(i2), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    private static ColorStateList d(Context context, int i2) {
        C0017a aVar;
        synchronized (f834c) {
            SparseArray<C0017a> sparseArray = f833b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i2)) == null)) {
                if (aVar.f836b.equals(context.getResources().getConfiguration())) {
                    return aVar.f835a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList a(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList d2 = d(context, i2);
        if (d2 != null) {
            return d2;
        }
        ColorStateList c2 = c(context, i2);
        if (c2 == null) {
            return b.b(context, i2);
        }
        synchronized (f834c) {
            WeakHashMap<Context, SparseArray<C0017a>> weakHashMap = f833b;
            SparseArray<C0017a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0017a(c2, context.getResources().getConfiguration()));
        }
        return c2;
    }
}
