package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.e.b;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2454a;

    /* renamed from: b  reason: collision with root package name */
    public static final androidx.c.e<String, Typeface> f2455b = new androidx.c.e<>(16);

    static {
        Covode.recordClassIndex(796);
        if (Build.VERSION.SDK_INT >= 29) {
            f2454a = new j();
        } else if (Build.VERSION.SDK_INT >= 28) {
            f2454a = new i();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f2454a = new h();
        } else if (Build.VERSION.SDK_INT >= 24 && g.f2461a != null) {
            f2454a = new g();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f2454a = new f();
        } else {
            f2454a = new k();
        }
    }

    public static Typeface a(Context context, b.C0030b[] bVarArr, int i2) {
        return f2454a.a(context, (CancellationSignal) null, bVarArr, i2);
    }

    public static String a(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        Typeface a2 = f2454a.a(context, resources, i2, str, i3);
        if (a2 != null) {
            f2455b.a(a(resources, i2, i3), a2);
        }
        return a2;
    }
}
