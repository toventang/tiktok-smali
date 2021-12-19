package androidx.core.h;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.bytedance.covode.number.Covode;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public Object f2555a;

    static {
        Covode.recordClassIndex(870);
    }

    private s(Object obj) {
        this.f2555a = obj;
    }

    public static s a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new s(PointerIcon.getSystemIcon(context, 1002));
        }
        return new s(null);
    }
}
