package ms.bd.o;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;

public class v1 {

    /* renamed from: a  reason: collision with root package name */
    private static int f159560a;

    static {
        Covode.recordClassIndex(105966);
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f159560a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return new StringBuilder().append(f159560a).toString();
    }
}
