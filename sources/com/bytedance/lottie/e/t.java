package com.bytedance.lottie.e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.h;

final class t {
    static {
        Covode.recordClassIndex(24968);
    }

    static h a(JsonReader jsonReader) {
        String str = null;
        h.a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("mm")) {
                aVar = h.a.forId(jsonReader.nextInt());
            } else if (!nextName.equals("nm")) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        return new h(str, aVar);
    }
}
