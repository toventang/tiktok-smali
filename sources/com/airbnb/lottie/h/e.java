package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.e.a.f;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.e.b.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class e {
    static {
        Covode.recordClassIndex(2358);
    }

    static a a(JsonReader jsonReader, com.airbnb.lottie.e eVar, int i2) {
        boolean z;
        if (i2 == 3) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        m<PointF, PointF> mVar = null;
        f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case com.bytedance.nita.c.a.f41622a:
                    if (nextName.equals("d")) {
                        if (jsonReader.nextInt() == 3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                        }
                    }
                    break;
                case 112:
                    if (nextName.equals("p")) {
                        mVar = a.b(jsonReader, eVar);
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
        return new a(str, mVar, fVar, z);
    }
}
