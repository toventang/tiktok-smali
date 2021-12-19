package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.l;
import com.bytedance.lottie.c.b.k;
import com.bytedance.lottie.g;

final class y {
    static {
        Covode.recordClassIndex(24973);
    }

    static k a(JsonReader jsonReader, g gVar) {
        String str = null;
        b bVar = null;
        b bVar2 = null;
        l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        bVar = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar2 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        lVar = c.a(jsonReader, gVar);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new k(str, bVar, bVar2, lVar);
    }
}
