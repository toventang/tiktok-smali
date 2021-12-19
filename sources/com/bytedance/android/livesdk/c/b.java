package com.bytedance.android.livesdk.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b extends d {
    static {
        Covode.recordClassIndex(8231);
    }

    public b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(0.0f, 0.0f));
        arrayList.add(new g(0.32f, 0.94f));
        arrayList.add(new g(0.6f, 1.0f));
        arrayList.add(new g(1.0f, 1.0f));
        this.f14860a = new a(arrayList);
        this.f14861b = new f();
        if (this.f14860a != null) {
            if (this.f14861b == null) {
                this.f14861b = new f();
            }
            this.f14861b.a(this.f14860a);
            return;
        }
        throw new RuntimeException("Can not build curve sampler without curve,please create curve first");
    }
}
