package android.ss.com.vboost;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

class CapabilityNativeInf {
    private static native boolean nativeIsSupportCapability(CapabilityType capabilityType);

    private static native void nativeLoadMethod();

    private static native void nativeRegisterApplication(Context context);

    private static native void nativeRequestVibrateCapability(int i2, float f2, float f3, float f4, String str);

    CapabilityNativeInf() {
    }

    static {
        Covode.recordClassIndex(3);
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.b("vboost", false, null);
            m.a(uptimeMillis, "vboost");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}
