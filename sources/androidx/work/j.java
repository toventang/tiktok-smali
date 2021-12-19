package androidx.work;

import android.content.Context;
import androidx.work.impl.f;
import androidx.work.impl.utils.b.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.d;

public abstract class j {
    static {
        Covode.recordClassIndex(1886);
    }

    public static j a() {
        d.a();
        f b2 = f.b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void a(Context context, b bVar) {
        synchronized (f.f4698l) {
            if (f.f4696j != null && f.f4697k != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
            } else if (f.f4696j == null) {
                Context a2 = f.a(context);
                if (f.f4697k == null) {
                    f.f4697k = new f(a2, bVar, new b());
                }
                f.f4696j = f.f4697k;
            }
        }
    }
}
