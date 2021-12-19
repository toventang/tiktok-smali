package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

public class LZ4Exception extends RuntimeException {
    private static final long serialVersionUID = 1;

    static {
        Covode.recordClassIndex(105986);
    }

    public LZ4Exception() {
    }

    public LZ4Exception(String str) {
        super(str);
    }

    public LZ4Exception(String str, Throwable th) {
        super(str, th);
    }
}
