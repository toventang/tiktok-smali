package com.bytedance.lottie.e;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.a;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.c.b.m;
import com.bytedance.lottie.g;

final class ab {
    static {
        Covode.recordClassIndex(24944);
    }

    static m a(JsonReader jsonReader, g gVar) {
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
                        aVar = d.d(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        dVar = d.a(jsonReader, gVar);
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
