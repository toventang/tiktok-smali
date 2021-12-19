package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.HashMap;
import java.util.List;

public final class i implements e {
    static {
        Covode.recordClassIndex(37019);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        float f2;
        HashMap<String, Object> hashMap = dVar.f59904a;
        c cVar = dVar.f59907d;
        List<String> labels = cVar.getLabels();
        List<String> args = cVar.getArgs();
        List<Float> oPTs = cVar.getOPTs();
        String str = args.get(0);
        int indexOf = labels.indexOf(com.ss.android.ml.e.a(hashMap, str));
        if (indexOf < 0) {
            indexOf = (int) oPTs.get(0).floatValue();
        }
        for (int i2 = 0; i2 < labels.size(); i2++) {
            String str2 = str + "#" + i2;
            if (indexOf == i2) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            hashMap.put(str2, Float.valueOf(f2));
        }
    }
}
