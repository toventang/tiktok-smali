package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.f;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.e.b.j;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class x {
    static {
        Covode.recordClassIndex(2378);
    }

    static j a(JsonReader jsonReader, e eVar) {
        String str = null;
        m<PointF, PointF> mVar = null;
        f fVar = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        mVar = a.b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar = d.a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar = d.b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new j(str, mVar, fVar, bVar);
    }
}
