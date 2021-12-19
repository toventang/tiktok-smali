package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.List;

public final class l implements e {
    static {
        Covode.recordClassIndex(37022);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        float[] fArr = dVar.f59905b;
        List<Float> oPTs = dVar.f59908e.getOPTs();
        if (oPTs != null && oPTs.size() >= 2) {
            float floatValue = oPTs.get(0).floatValue();
            fArr[0] = (fArr[0] * floatValue) + oPTs.get(1).floatValue();
        }
    }
}
