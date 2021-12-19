package androidx.core.d;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.bytedance.covode.number.Covode;

public final class h {
    static {
        Covode.recordClassIndex(734);
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
