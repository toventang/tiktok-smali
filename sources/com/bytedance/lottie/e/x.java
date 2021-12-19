package com.bytedance.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.f;
import com.bytedance.lottie.c.a.m;
import com.bytedance.lottie.c.b.j;
import com.bytedance.lottie.g;

final class x {
    static {
        Covode.recordClassIndex(24972);
    }

    static j a(JsonReader jsonReader, g gVar) {
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
                        mVar = a.b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar = d.a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar = d.b(jsonReader, gVar);
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
