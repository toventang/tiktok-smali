package com.ss.android.ugc.aweme.discover.b;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.a;
import com.facebook.fresco.animation.a.b;

public final class e extends b<a> {

    /* renamed from: b  reason: collision with root package name */
    public Integer f80841b;

    static {
        Covode.recordClassIndex(50261);
    }

    @Override // com.facebook.fresco.animation.a.b, com.facebook.fresco.animation.a.d
    public final int a() {
        Integer num = this.f80841b;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public e(a aVar, Integer num) {
        super(aVar);
        this.f80841b = num;
    }
}
