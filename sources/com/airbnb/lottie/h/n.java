package com.airbnb.lottie.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

final class n {
    static {
        Covode.recordClassIndex(2367);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.h.n$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5669a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 2368(0x940, float:3.318E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.h.n.AnonymousClass1.f5669a = r2
                android.util.JsonToken r0 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.h.n.AnonymousClass1.f5669a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.util.JsonToken r0 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.airbnb.lottie.h.n.AnonymousClass1.f5669a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.h.n.AnonymousClass1.<clinit>():void");
        }
    }

    static int a(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static float b(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i2 = AnonymousClass1.f5669a[peek.ordinal()];
        if (i2 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i2 == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(peek)));
    }

    private static PointF c(JsonReader jsonReader, float f2) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f2, nextDouble2 * f2);
    }

    private static PointF d(JsonReader jsonReader, float f2) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f2, nextDouble2 * f2);
    }

    private static PointF e(JsonReader jsonReader, float f2) {
        jsonReader.beginObject();
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("x")) {
                f3 = b(jsonReader);
            } else if (!nextName.equals("y")) {
                jsonReader.skipValue();
            } else {
                f4 = b(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f3 * f2, f4 * f2);
    }

    static List<PointF> a(JsonReader jsonReader, float f2) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(b(jsonReader, f2));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    static PointF b(JsonReader jsonReader, float f2) {
        int i2 = AnonymousClass1.f5669a[jsonReader.peek().ordinal()];
        if (i2 == 1) {
            return c(jsonReader, f2);
        }
        if (i2 == 2) {
            return d(jsonReader, f2);
        }
        if (i2 == 3) {
            return e(jsonReader, f2);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }
}
