package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.b;

final class f extends e {
    static {
        Covode.recordClassIndex(49640);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.e
    public final int getPageType(int i2) {
        return i2 + 3000;
    }

    f(String str) {
        super(str);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa, com.ss.android.ugc.aweme.detail.operators.e
    public final void request(int i2, b bVar, int i3, boolean z) {
        this.f79802a.f79768a = bVar.getPageType();
        super.request(i2, bVar, i3, z);
    }
}
