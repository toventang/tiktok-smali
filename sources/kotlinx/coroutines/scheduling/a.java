package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

public final /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f159186a;

    static {
        Covode.recordClassIndex(105697);
        int[] iArr = new int[CoroutineScheduler.c.values().length];
        f159186a = iArr;
        iArr[CoroutineScheduler.c.PARKING.ordinal()] = 1;
        iArr[CoroutineScheduler.c.BLOCKING.ordinal()] = 2;
        iArr[CoroutineScheduler.c.CPU_ACQUIRED.ordinal()] = 3;
        iArr[CoroutineScheduler.c.DORMANT.ordinal()] = 4;
        iArr[CoroutineScheduler.c.TERMINATED.ordinal()] = 5;
    }
}
