package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.HashMap;

public final class m implements e {
    static {
        Covode.recordClassIndex(37023);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        HashMap<String, Object> hashMap = dVar.f59904a;
        c cVar = dVar.f59907d;
        for (String str : cVar.getArgs()) {
            Number number = (Number) com.ss.android.ml.e.a(hashMap, str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Double.valueOf(1.0d / (Math.exp((double) (-number.floatValue())) + 1.0d)));
            }
        }
    }
}
