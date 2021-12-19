package h;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class o extends Error {
    static {
        Covode.recordClassIndex(105381);
    }

    public o() {
        this(null, 1, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(str);
        l.d(str, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
