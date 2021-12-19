package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.a;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.d;
import com.airbnb.lottie.e.b.p;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class ad {
    static {
        Covode.recordClassIndex(2352);
    }

    static p a(JsonReader jsonReader, e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        b bVar = null;
        a aVar = null;
        d dVar = null;
        b bVar2 = null;
        p.a aVar2 = null;
        p.b bVar3 = null;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        aVar = d.d(jsonReader, eVar);
                        continue;
                    }
                    break;
                case com.bytedance.nita.c.a.f41622a:
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
                                    bVar4 = d.a(jsonReader, eVar, true);
                                }
                            }
                            jsonReader.endObject();
                            str2.hashCode();
                            switch (str2.hashCode()) {
                                case com.bytedance.nita.c.a.f41622a:
                                    if (!str2.equals("d")) {
                                        break;
                                    }
                                    arrayList.add(bVar4);
                                    break;
                                case 103:
                                    if (!str2.equals("g")) {
                                        break;
                                    }
                                    arrayList.add(bVar4);
                                    break;
                                case 111:
                                    if (str2.equals("o")) {
                                        bVar = bVar4;
                                        break;
                                    } else {
                                        break;
                                    }
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
                case 111:
                    if (nextName.equals("o")) {
                        dVar = d.a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        bVar2 = d.a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar2 = p.a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar3 = p.b.values()[jsonReader.nextInt() - 1];
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
        return new p(str, bVar, arrayList, aVar, dVar, bVar2, aVar2, bVar3, f2);
    }
}
