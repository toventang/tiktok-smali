package com.airbnb.lottie.h;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.a;
import com.airbnb.lottie.e.a.d;
import com.airbnb.lottie.e.b.m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ab {
    static {
        Covode.recordClassIndex(2350);
    }

    static m a(JsonReader jsonReader, e eVar) {
        Path.FillType fillType;
        String str = null;
        a aVar = null;
        d dVar = null;
        int i2 = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -396065730:
                    if (nextName.equals("fillEnabled")) {
                        z = jsonReader.nextBoolean();
                        continue;
                    }
                    break;
                case 99:
                    if (nextName.equals("c")) {
                        aVar = d.d(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        dVar = d.a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        i2 = jsonReader.nextInt();
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
        if (i2 == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new m(str, z, fillType, aVar, dVar);
    }
}
