package androidx.k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

final class ae {

    /* renamed from: a  reason: collision with root package name */
    static final ai f3229a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f3230b = new Property<View, Float>(Float.class, "translationAlpha") {
        /* class androidx.k.ae.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1172);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(ae.f3229a.a(view));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f2) {
            ae.a(view, f2.floatValue());
        }
    };

    /* renamed from: c  reason: collision with root package name */
    static final Property<View, Rect> f3231c = new Property<View, Rect>(Rect.class, "clipBounds") {
        /* class androidx.k.ae.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1173);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Rect get(View view) {
            return v.x(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Rect rect) {
            v.a(view, rect);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static Field f3232d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3233e;

    static {
        Covode.recordClassIndex(1171);
        if (Build.VERSION.SDK_INT >= 22) {
            f3229a = new ah();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f3229a = new ag();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            f3229a = new af();
        }
    }

    static ad a(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return new ac(view);
    }

    static an b(View view) {
        int i2 = Build.VERSION.SDK_INT;
        return new am(view);
    }

    static void a(View view, float f2) {
        f3229a.a(view, f2);
    }

    static void a(View view, int i2) {
        if (!f3233e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3232d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3233e = true;
        }
        Field field = f3232d;
        if (field != null) {
            try {
                f3232d.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    static void a(View view, int i2, int i3, int i4, int i5) {
        f3229a.a(view, i2, i3, i4, i5);
    }
}
