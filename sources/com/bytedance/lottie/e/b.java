package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.a;
import com.bytedance.lottie.c.a.k;
import com.bytedance.lottie.g;

public final class b {
    static {
        Covode.recordClassIndex(24949);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static k a(JsonReader jsonReader, g gVar) {
        jsonReader.beginObject();
        k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                a aVar = null;
                a aVar2 = null;
                com.bytedance.lottie.c.a.b bVar = null;
                com.bytedance.lottie.c.a.b bVar2 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    switch (nextName2.hashCode()) {
                        case 116:
                            if (nextName2.equals("t")) {
                                bVar2 = d.a(jsonReader, gVar, true);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3261:
                            if (nextName2.equals("fc")) {
                                aVar = d.d(jsonReader, gVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3664:
                            if (nextName2.equals("sc")) {
                                aVar2 = d.d(jsonReader, gVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3684:
                            if (nextName2.equals("sw")) {
                                bVar = d.a(jsonReader, gVar, true);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                kVar = new k(aVar, aVar2, bVar, bVar2);
            }
        }
        jsonReader.endObject();
        if (kVar == null) {
            return new k(null, null, null, null);
        }
        return kVar;
    }
}
