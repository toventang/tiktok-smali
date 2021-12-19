package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.l;
import com.airbnb.lottie.e.b.k;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class y {
    static {
        Covode.recordClassIndex(2379);
    }

    static k a(JsonReader jsonReader, e eVar) {
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
                        bVar = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar2 = d.a(jsonReader, eVar, false);
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
                        lVar = c.a(jsonReader, eVar);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new k(str, bVar, bVar2, lVar);
    }
}
