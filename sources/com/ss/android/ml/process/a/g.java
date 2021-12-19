package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.HashMap;
import java.util.List;

public final class g implements e {
    static {
        Covode.recordClassIndex(37017);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        HashMap<String, Object> hashMap = dVar.f59904a;
        c cVar = dVar.f59907d;
        List<String> args = cVar.getArgs();
        List<Float> oPTs = cVar.getOPTs();
        for (String str : args) {
            Number number = (Number) com.ss.android.ml.e.a(hashMap, str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Float.valueOf(Math.min(number.floatValue(), oPTs.get(0).floatValue())));
            }
        }
    }
}
