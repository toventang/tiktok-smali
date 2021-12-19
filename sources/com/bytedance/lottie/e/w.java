package com.bytedance.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.m;
import com.bytedance.lottie.c.b.i;
import com.bytedance.lottie.g;

final class w {
    static {
        Covode.recordClassIndex(24971);
    }

    static i a(JsonReader jsonReader, g gVar) {
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
                        mVar = a.b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar2 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        bVar3 = d.a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        bVar5 = d.a(jsonReader, gVar, false);
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
                        bVar4 = d.a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        bVar6 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        bVar = d.a(jsonReader, gVar, false);
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
