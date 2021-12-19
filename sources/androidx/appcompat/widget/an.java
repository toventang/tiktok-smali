package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class an {
    static {
        Covode.recordClassIndex(474);
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ao.a(view, charSequence);
        }
    }
}
