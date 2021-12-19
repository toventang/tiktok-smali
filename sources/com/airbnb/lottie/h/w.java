package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.e.b.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class w {
    static {
        Covode.recordClassIndex(2377);
    }

    static i a(JsonReader jsonReader, e eVar) {
        String str = null;
        i.a aVar = null;
        b bVar = null;
        m<PointF, PointF> mVar = null;
        b bVar2 = null;
        b bVar3 = null;
        b bVar4 = null;
        b bVar5 = null;
        b bVar6 = null;
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
                        bVar2 = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        bVar3 = d.a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        bVar5 = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        bVar4 = d.a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        bVar6 = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        bVar = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        aVar = i.a.forValue(jsonReader.nextInt());
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }
}
