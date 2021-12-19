package com.ss.android.ml.process.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import java.util.List;

public final class k implements e {
    static {
        Covode.recordClassIndex(37021);
    }

    @Override // com.ss.android.ml.process.e
    public final void a(d dVar) {
        float[] fArr = dVar.f59905b;
        a aVar = dVar.f59908e;
        List<String> list = dVar.f59906c;
        List<String> labels = aVar.getLabels();
        int i2 = -1;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (f2 <= fArr[i3]) {
                f2 = fArr[i3];
                i2 = i3;
            }
        }
        list.add(labels.get(i2));
    }
}
