package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.d;
import com.airbnb.lottie.e.a.h;
import com.airbnb.lottie.e.b.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class s {
    static {
        Covode.recordClassIndex(2373);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    static g a(JsonReader jsonReader, e eVar) {
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
                        dVar = d.a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        hVar = d.c(jsonReader, eVar);
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
                                    eVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
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
