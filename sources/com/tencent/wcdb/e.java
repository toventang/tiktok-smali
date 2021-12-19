package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;

public final class e extends IndexOutOfBoundsException {
    static {
        Covode.recordClassIndex(103068);
    }

    public e(String str) {
        super(str);
    }

    public e(int i2, int i3) {
        super("Index " + i2 + " requested, with a size of " + i3);
    }
}
