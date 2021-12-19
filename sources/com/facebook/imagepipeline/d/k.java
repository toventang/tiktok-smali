package com.facebook.imagepipeline.d;

import com.bytedance.covode.number.Covode;

public final class k implements com.facebook.common.d.k<q> {
    static {
        Covode.recordClassIndex(28953);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.d.k
    public final /* synthetic */ q b() {
        int i2;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i2 = 1048576;
        } else if (min < 33554432) {
            i2 = 2097152;
        } else {
            i2 = 4194304;
        }
        return new q(i2, Integer.MAX_VALUE, i2, i2 / 8);
    }
}
