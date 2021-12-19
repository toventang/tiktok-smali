package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.g;

final class ae {
    static {
        Covode.recordClassIndex(24947);
    }

    static q a(JsonReader jsonReader, g gVar) {
        String str = null;
        q.a aVar = null;
        b bVar = null;
        b bVar2 = null;
        b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        bVar2 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        aVar = q.a.forId(jsonReader.nextInt());
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar3 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        bVar = d.a(jsonReader, gVar, false);
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
        return new q(str, aVar, bVar, bVar2, bVar3);
    }
}
