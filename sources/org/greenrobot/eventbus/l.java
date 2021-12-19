package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.logging.Level;

public interface l {
    static {
        Covode.recordClassIndex(106481);
    }

    void a(Level level, String str);

    void a(Level level, String str, Throwable th);

    public static class a {
        static {
            Covode.recordClassIndex(106482);
        }

        static Object a() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static class b implements l {
        static {
            Covode.recordClassIndex(106483);
        }

        @Override // org.greenrobot.eventbus.l
        public final void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // org.greenrobot.eventbus.l
        public final void a(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }
}
