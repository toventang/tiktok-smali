package leakcanary;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class KeyedWeakReference extends WeakReference<Object> {
    public static final a Companion = new a((byte) 0);
    public static volatile long heapDumpUptimeMillis;
    private final String key;
    private final String name;
    private volatile long retainedUptimeMillis = -1;
    private final long watchUptimeMillis;

    static {
        Covode.recordClassIndex(105807);
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j2) {
        heapDumpUptimeMillis = j2;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105808);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j2) {
        this.retainedUptimeMillis = j2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyedWeakReference(Object obj, String str, String str2, long j2, ReferenceQueue<Object> referenceQueue) {
        super(obj, referenceQueue);
        l.c(obj, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(referenceQueue, "");
        this.key = str;
        this.name = str2;
        this.watchUptimeMillis = j2;
    }
}
