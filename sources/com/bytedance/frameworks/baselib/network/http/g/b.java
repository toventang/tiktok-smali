package com.bytedance.frameworks.baselib.network.http.g;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class b extends IOException {
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    static {
        Covode.recordClassIndex(17120);
    }

    public final long getLength() {
        return this.length;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public b(int i2, long j2) {
        super("Download file too large: " + j2 + " exceed maxsize: " + i2);
        this.maxSize = i2;
        this.length = j2;
    }
}
