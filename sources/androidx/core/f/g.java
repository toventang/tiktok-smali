package androidx.core.f;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f2394a = new Locale("", "");

    static {
        Covode.recordClassIndex(766);
    }

    public static int a(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    private static int b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality == 1 || directionality == 2) {
            return 1;
        }
        return 0;
    }
}
