package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class am {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class, Integer> f5010b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    s<?> f5011a;

    am() {
    }

    static {
        Covode.recordClassIndex(2114);
    }

    static int a(s<?> sVar) {
        int a2 = sVar.a();
        if (a2 != 0) {
            return a2;
        }
        Class<?> cls = sVar.getClass();
        Map<Class, Integer> map = f5010b;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final s<?> a(d dVar, int i2) {
        s<?> sVar = this.f5011a;
        if (sVar != null && a(sVar) == i2) {
            return this.f5011a;
        }
        dVar.a(new IllegalStateException("Last model did not match expected view type"));
        for (s<?> sVar2 : dVar.a()) {
            if (a(sVar2) == i2) {
                return sVar2;
            }
        }
        x xVar = new x();
        if (i2 == xVar.a()) {
            return xVar;
        }
        throw new IllegalStateException("Could not find model for view type: ".concat(String.valueOf(i2)));
    }
}
