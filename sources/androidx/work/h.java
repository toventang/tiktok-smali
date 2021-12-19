package androidx.work;

import com.bytedance.covode.number.Covode;

public enum h {
    NOT_REQUIRED,
    CONNECTED,
    UNMETERED,
    NOT_ROAMING,
    METERED;

    static {
        Covode.recordClassIndex(1755);
    }
}
