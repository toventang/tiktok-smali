package h.m;

import com.bytedance.covode.number.Covode;

public enum n implements f {
    IGNORE_CASE(2),
    MULTILINE(8),
    LITERAL(16),
    UNIX_LINES(1),
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    CANON_EQ(128);
    
    private final int mask;
    private final int value;

    @Override // h.m.f
    public final int getMask() {
        return this.mask;
    }

    @Override // h.m.f
    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(105363);
    }

    private /* synthetic */ n(int i2) {
        this(i2, i2);
    }

    private n(int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }
}
