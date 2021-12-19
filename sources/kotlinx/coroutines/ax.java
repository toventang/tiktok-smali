package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.z;

public interface ax {
    static {
        Covode.recordClassIndex(105547);
    }

    bh invokeOnTimeout(long j2, Runnable runnable);

    void scheduleResumeAfterDelay(long j2, m<? super z> mVar);

    public static final class a {
        static {
            Covode.recordClassIndex(105548);
        }

        public static bh a(long j2, Runnable runnable) {
            return au.f159027a.invokeOnTimeout(j2, runnable);
        }
    }
}
