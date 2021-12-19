package com.airbnb.lottie.h;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;

public final class f implements af<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f5664a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(2359);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.h.af
    public final /* synthetic */ Integer a(JsonReader jsonReader, float f2) {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
