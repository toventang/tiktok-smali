package androidx.core.d;

import com.bytedance.covode.number.Covode;

public final class d extends RuntimeException {
    static {
        Covode.recordClassIndex(729);
    }

    public d() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
