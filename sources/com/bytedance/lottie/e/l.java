package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.c;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.c.b.e;
import com.bytedance.lottie.c.b.f;
import com.bytedance.lottie.c.b.p;
import com.bytedance.lottie.g;
import com.bytedance.nita.c.a;
import java.util.ArrayList;

final class l {
    static {
        Covode.recordClassIndex(24959);
    }

    static e a(JsonReader jsonReader, g gVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        f fVar = null;
        c cVar = null;
        d dVar = null;
        com.bytedance.lottie.c.a.f fVar2 = null;
        com.bytedance.lottie.c.a.f fVar3 = null;
        b bVar = null;
        p.a aVar = null;
        p.b bVar2 = null;
        float f2 = 0.0f;
        b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case a.f41622a:
                    if (nextName.equals("d")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            String str2 = null;
                            b bVar4 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.hashCode();
                                if (nextName2.equals("n")) {
                                    str2 = jsonReader.nextString();
                                } else if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    bVar4 = d.a(jsonReader, gVar, true);
                                }
                            }
                            jsonReader.endObject();
                            if (str2.equals("o")) {
                                bVar3 = bVar4;
                            } else if (str2.equals("d") || str2.equals("g")) {
                                gVar.o = true;
                                arrayList.add(bVar4);
                            }
                        }
                        jsonReader.endArray();
                        if (arrayList.size() == 1) {
                            arrayList.add(arrayList.get(0));
                        } else {
                            continue;
                        }
                    }
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        fVar3 = d.b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        jsonReader.beginObject();
                        int i2 = -1;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("k")) {
                                cVar = d.a(jsonReader, gVar, i2);
                            } else if (!nextName3.equals("p")) {
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
                case 119:
                    if (nextName.equals("w")) {
                        bVar = d.a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar = p.a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar2 = p.b.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        f2 = (float) jsonReader.nextDouble();
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
        return new e(str, fVar, cVar, dVar, fVar2, fVar3, bVar, aVar, bVar2, f2, arrayList, bVar3);
    }
}
