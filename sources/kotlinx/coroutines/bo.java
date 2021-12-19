package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.v;

public final class bo {

    /* renamed from: a  reason: collision with root package name */
    public static final v f159048a = new v("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    public static final v f159049b = new v("CLOSED_EMPTY");

    public static final long a(long j2) {
        if (j2 <= 0) {
            return 0;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j2 * 1000000;
    }

    static {
        Covode.recordClassIndex(105568);
    }
}
