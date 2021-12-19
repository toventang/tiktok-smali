package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.k;
import com.facebook.imagepipeline.d.q;

public final class h implements k<q> {

    /* renamed from: a  reason: collision with root package name */
    private int f39985a;

    static {
        Covode.recordClassIndex(24647);
    }

    public h() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.d.k
    public final /* synthetic */ q b() {
        int i2 = this.f39985a;
        if (i2 <= 0) {
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i2 = 1048576;
            } else if (min < 33554432) {
                i2 = 2097152;
            } else {
                i2 = 4194304;
            }
        }
        return new q(i2, Integer.MAX_VALUE, i2, i2 / 8);
    }

    public h(int i2) {
        this.f39985a = i2;
    }
}
