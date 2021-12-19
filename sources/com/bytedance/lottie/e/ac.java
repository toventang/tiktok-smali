package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.h;
import com.bytedance.lottie.c.b.o;
import com.bytedance.lottie.g;

final class ac {
    static {
        Covode.recordClassIndex(24945);
    }

    static o a(JsonReader jsonReader, g gVar) {
        String str = null;
        h hVar = null;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 3432:
                    if (nextName.equals("ks")) {
                        hVar = d.c(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        i2 = jsonReader.nextInt();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new o(str, i2, hVar);
    }
}
