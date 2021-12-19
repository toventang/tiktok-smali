package com.bytedance.lottie.e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.a;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class p {
    static {
        Covode.recordClassIndex(24964);
    }

    public static void a(List<? extends a<?>> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            i3++;
            ((a) list.get(i3)).f40724g = Float.valueOf(((a) list.get(i3)).f40723f);
        }
        a aVar = (a) list.get(i2);
        if (aVar.f40720c == null) {
            list.remove(aVar);
        }
    }

    static <T> List<a<T>> a(JsonReader jsonReader, g gVar, float f2, af<T> afVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            gVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(o.a(jsonReader, gVar, f2, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(o.a(jsonReader, gVar, f2, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(o.a(jsonReader, gVar, f2, afVar, false));
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }
}
