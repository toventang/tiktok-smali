package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.h;
import com.airbnb.lottie.e.b.o;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ac {
    static {
        Covode.recordClassIndex(2351);
    }

    static o a(JsonReader jsonReader, e eVar) {
        String str = null;
        h hVar = null;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 3432:
                    if (nextName.equals("ks")) {
                        hVar = d.c(jsonReader, eVar);
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
