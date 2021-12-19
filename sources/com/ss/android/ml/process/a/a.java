package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.HashMap;
import java.util.List;

public final class a implements e {
    static {
        Covode.recordClassIndex(37011);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        float f2;
        HashMap<String, Object> hashMap = dVar.f59904a;
        c cVar = dVar.f59907d;
        List<String> args = cVar.getArgs();
        Number number = (Number) com.ss.android.ml.e.a(hashMap, args.get(0));
        Number number2 = (Number) com.ss.android.ml.e.a(hashMap, args.get(1));
        float f3 = 0.0f;
        if (number != null) {
            f2 = number.floatValue();
        } else {
            f2 = 0.0f;
        }
        if (number2 != null) {
            f3 = number2.floatValue();
        }
        hashMap.put(cVar.getFeature(), Float.valueOf(f2 / f3));
    }
}
