package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.l;
import java.util.HashMap;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Integer> f76612a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f76613b;

    static {
        Covode.recordClassIndex(47299);
    }

    public final void a() {
        for (String str : this.f76612a.keySet()) {
            if (this.f76613b.f().containsKey(str)) {
                l lVar = this.f76613b.f().get(str);
                if (lVar == null) {
                    h.f.b.l.b();
                }
                l lVar2 = lVar;
                Integer num = this.f76612a.get(str);
                if (num == null) {
                    h.f.b.l.b();
                }
                lVar2.f110788a = num.intValue();
            }
        }
    }

    public x(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f76613b = dVar;
    }
}
