package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.w;
import kotlinx.coroutines.internal.a;

public abstract class bl extends ah {
    private boolean shared;
    private a<bc<?>> unconfinedQueue;
    private long useCount;

    static {
        Covode.recordClassIndex(105565);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }

    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isActive() {
        if (this.useCount > 0) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedLoopActive() {
        if (this.useCount >= delta(true)) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedQueueEmpty() {
        a<bc<?>> aVar = this.unconfinedQueue;
        if (aVar != null) {
            return aVar.a();
        }
        return true;
    }

    public long getNextTime() {
        a<bc<?>> aVar = this.unconfinedQueue;
        if (aVar != null && !aVar.a()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public long processNextEvent() {
        if (!processUnconfinedEvent()) {
            return Long.MAX_VALUE;
        }
        return getNextTime();
    }

    public final boolean processUnconfinedEvent() {
        a<bc<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            return false;
        }
        bc bcVar = null;
        if (aVar.f159112b != aVar.f159113c) {
            Object obj = aVar.f159111a[aVar.f159112b];
            aVar.f159111a[aVar.f159112b] = null;
            aVar.f159112b = (aVar.f159112b + 1) & (aVar.f159111a.length - 1);
            if (obj != null) {
                bcVar = obj;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        bc bcVar2 = bcVar;
        if (bcVar2 == null) {
            return false;
        }
        bcVar2.run();
        return true;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (!z) {
            this.shared = true;
        }
    }

    public final void decrementUseCount(boolean z) {
        long delta = this.useCount - delta(z);
        this.useCount = delta;
        if (delta <= 0) {
            if (ar.f159021a && this.useCount != 0) {
                throw new AssertionError();
            } else if (this.shared) {
                shutdown();
            }
        }
    }

    public final void dispatchUnconfined(bc<?> bcVar) {
        a<bc<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            aVar = new a<>();
            this.unconfinedQueue = aVar;
        }
        aVar.f159111a[aVar.f159113c] = bcVar;
        aVar.f159113c = (aVar.f159113c + 1) & (aVar.f159111a.length - 1);
        if (aVar.f159113c == aVar.f159112b) {
            int length = aVar.f159111a.length;
            Object[] objArr = new Object[(length << 1)];
            i.a(aVar.f159111a, objArr, 0, aVar.f159112b, 0, 10);
            i.a(aVar.f159111a, objArr, aVar.f159111a.length - aVar.f159112b, 0, aVar.f159112b, 4);
            aVar.f159111a = objArr;
            aVar.f159112b = 0;
            aVar.f159113c = length;
        }
    }

    public static /* synthetic */ void decrementUseCount$default(bl blVar, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            blVar.decrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void incrementUseCount$default(bl blVar, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            blVar.incrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }
}
