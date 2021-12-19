package com.bytedance.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;

public final class v implements af<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final v f40682a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(24970);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ PointF a(JsonReader jsonReader, float f2) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return n.b(jsonReader, f2);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return n.b(jsonReader, f2);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
