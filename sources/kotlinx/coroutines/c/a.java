package kotlinx.coroutines.c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public enum a {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle");
    
    private final String s;

    public final String toString() {
        return this.s;
    }

    static {
        Covode.recordClassIndex(105587);
    }

    private a(String str) {
        this.s = str;
    }
}
