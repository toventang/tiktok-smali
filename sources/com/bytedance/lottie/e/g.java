package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.b;
import com.bytedance.lottie.c.b.n;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class g {
    static {
        Covode.recordClassIndex(24954);
    }

    static b a(JsonReader jsonReader, com.bytedance.lottie.g gVar) {
        jsonReader.beginObject();
        int i2 = 2;
        while (true) {
            b bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            String str = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("d")) {
                i2 = jsonReader.nextInt();
            } else if (!nextName.equals("ty")) {
                jsonReader.skipValue();
            } else {
                String nextString = jsonReader.nextString();
                if (nextString != null) {
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 3239:
                            if (nextString.equals("el")) {
                                bVar = e.a(jsonReader, gVar, i2);
                                break;
                            }
                            break;
                        case 3270:
                            if (nextString.equals("fl")) {
                                bVar = ab.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3295:
                            if (nextString.equals("gf")) {
                                bVar = k.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3307:
                            if (nextString.equals("gr")) {
                                ArrayList arrayList = new ArrayList();
                                while (jsonReader.hasNext()) {
                                    String nextName2 = jsonReader.nextName();
                                    nextName2.hashCode();
                                    if (nextName2.equals("it")) {
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            b a2 = a(jsonReader, gVar);
                                            if (a2 != null) {
                                                arrayList.add(a2);
                                            }
                                        }
                                        jsonReader.endArray();
                                    } else if (!nextName2.equals("nm")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str = jsonReader.nextString();
                                    }
                                }
                                bVar = new n(str, arrayList);
                                break;
                            }
                            break;
                        case 3308:
                            if (nextString.equals("gs")) {
                                bVar = l.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3488:
                            if (nextString.equals("mm")) {
                                bVar = t.a(jsonReader);
                                gVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                                break;
                            }
                            break;
                        case 3633:
                            if (nextString.equals("rc")) {
                                bVar = x.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3646:
                            if (nextString.equals("rp")) {
                                bVar = y.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3669:
                            if (nextString.equals("sh")) {
                                bVar = ac.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3679:
                            if (nextString.equals("sr")) {
                                bVar = w.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3681:
                            if (nextString.equals("st")) {
                                bVar = ad.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3705:
                            if (nextString.equals("tm")) {
                                bVar = ae.a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3710:
                            if (nextString.equals("tr")) {
                                bVar = c.a(jsonReader, gVar);
                                break;
                            }
                            break;
                    }
                    while (jsonReader.hasNext()) {
                        jsonReader.skipValue();
                    }
                    jsonReader.endObject();
                    return bVar;
                }
            }
        }
        return null;
    }
}
