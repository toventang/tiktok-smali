package f.a;

import com.bytedance.covode.number.Covode;

public enum a {
    MISSING,
    ERROR,
    BUFFER,
    DROP,
    LATEST;

    static {
        Covode.recordClassIndex(104348);
    }
}
