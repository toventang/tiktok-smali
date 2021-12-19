package com.airbnb.lottie.h;

import android.util.JsonReader;
import com.airbnb.lottie.e.b.h;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class t {
    static {
        Covode.recordClassIndex(2374);
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
