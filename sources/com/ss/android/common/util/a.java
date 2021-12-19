package com.ss.android.common.util;

import com.bytedance.covode.number.Covode;

public final class a extends Exception {
    private static final long serialVersionUID = -1098012010869697449L;
    final long length;
    final int maxSize;

    static {
        Covode.recordClassIndex(36671);
    }

    public final long getLength() {
        return this.length;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public a(int i2, long j2) {
        super("Download file too large: " + i2 + " " + j2);
        this.maxSize = i2;
        this.length = j2;
    }
}
