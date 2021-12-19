package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.c.a.h;
import com.bytedance.lottie.c.b.g;

final class s {
    static {
        Covode.recordClassIndex(24967);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    static g a(JsonReader jsonReader, com.bytedance.lottie.g gVar) {
        jsonReader.beginObject();
        g.a aVar = null;
        h hVar = null;
        d dVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        dVar = d.a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        hVar = d.c(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        String nextString = jsonReader.nextString();
                        nextString.hashCode();
                        switch (nextString.hashCode()) {
                            case 97:
                                if (nextString.equals("a")) {
                                    aVar = g.a.MaskModeAdd;
                                    break;
                                }
                                aVar = g.a.MaskModeAdd;
                                continue;
                            case 105:
                                if (nextString.equals("i")) {
                                    gVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    aVar = g.a.MaskModeIntersect;
                                    break;
                                }
                                aVar = g.a.MaskModeAdd;
                                continue;
                            case 115:
                                if (nextString.equals("s")) {
                                    aVar = g.a.MaskModeSubtract;
                                    break;
                                }
                                aVar = g.a.MaskModeAdd;
                                continue;
                            default:
                                aVar = g.a.MaskModeAdd;
                                continue;
                        }
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new g(aVar, hVar, dVar);
    }
}
