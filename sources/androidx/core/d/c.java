package androidx.core.d;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(728);
    }

    public static boolean a(Handler handler, Runnable runnable, Object obj, long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j2);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j2);
    }
}
