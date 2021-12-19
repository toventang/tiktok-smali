package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.g;
import com.a;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4773a = g.a("PackageManagerHelper");

    static {
        Covode.recordClassIndex(1873);
    }

    public static void a(Context context, Class cls, boolean z) {
        int i2;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
            g.a();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            a.a("%s %s", objArr);
        } catch (Exception e2) {
            g.a();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            a.a("%s could not be %s", objArr2);
            new Throwable[1][0] = e2;
        }
    }
}
