package com.bytedance.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g.d;

public final class z implements af<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final z f40683a = new z();

    private z() {
    }

    static {
        Covode.recordClassIndex(24974);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ d a(JsonReader jsonReader, float f2) {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new d((nextDouble / 100.0f) * f2, (nextDouble2 / 100.0f) * f2);
    }
}
