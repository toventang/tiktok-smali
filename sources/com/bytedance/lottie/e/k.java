package com.bytedance.lottie.e;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.c;
import com.bytedance.lottie.c.b.d;
import com.bytedance.lottie.c.b.f;
import com.bytedance.lottie.g;

final class k {
    static {
        Covode.recordClassIndex(24958);
    }

    static d a(JsonReader jsonReader, g gVar) {
        f fVar = f.Linear;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        c cVar = null;
        com.bytedance.lottie.c.a.d dVar = null;
        com.bytedance.lottie.c.a.f fVar2 = null;
        com.bytedance.lottie.c.a.f fVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i2 = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        fVar3 = d.b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("k")) {
                                cVar = d.a(jsonReader, gVar, i2);
                            } else if (!nextName2.equals("p")) {
                                jsonReader.skipValue();
                            } else {
                                i2 = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endObject();
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
                        if (jsonReader.nextInt() == 1) {
                            fillType = Path.FillType.WINDING;
                            continue;
                        } else {
                            fillType = Path.FillType.EVEN_ODD;
                        }
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar2 = d.b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        if (jsonReader.nextInt() == 1) {
                            fVar = f.Linear;
                            continue;
                        } else {
                            fVar = f.Radial;
                        }
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
        return new d(str, fVar, fillType, cVar, dVar, fVar2, fVar3);
    }
}
