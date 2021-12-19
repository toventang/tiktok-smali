package androidx.core.d;

import android.os.Build;
import android.os.Environment;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class b {
    static {
        Covode.recordClassIndex(727);
    }

    public static String a(File file) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Environment.getExternalStorageState(file);
        }
        int i2 = Build.VERSION.SDK_INT;
        return Environment.getStorageState(file);
    }
}
