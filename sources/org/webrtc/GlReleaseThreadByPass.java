package org.webrtc;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public class GlReleaseThreadByPass {
    static {
        Covode.recordClassIndex(106595);
    }

    public static boolean isEglReleaseThreadByPass() {
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }
}
