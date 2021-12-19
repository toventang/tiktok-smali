package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.List;

public final class j implements e {
    static {
        Covode.recordClassIndex(37020);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        float[] fArr = dVar.f59905b;
        a aVar = dVar.f59908e;
        List<String> list = dVar.f59906c;
        List<Float> oPTs = aVar.getOPTs();
        List<String> labels = aVar.getLabels();
        if (fArr[0] > oPTs.get(0).floatValue()) {
            list.add(labels.get(1));
        } else {
            list.add(labels.get(0));
        }
    }
}
