package androidx.core.f;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(753);
    }

    public static Spanned a(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i2);
        }
        return Html.fromHtml(str);
    }
}
