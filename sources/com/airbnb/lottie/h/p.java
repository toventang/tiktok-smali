package com.airbnb.lottie.h;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.e;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class p {
    static {
        Covode.recordClassIndex(2370);
    }

    public static <T> void a(List<? extends a<T>> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            if (d.a.f5635k) {
                a aVar = (a) list.get(i3);
                a aVar2 = (a) list.get(i3 + 1);
                aVar.f5714f = Float.valueOf(aVar2.f5713e);
                if (aVar.f5711c == null && aVar2.f5710b != null) {
                    aVar.f5711c = aVar2.f5710b;
                    if (aVar instanceof h) {
                        ((h) aVar).a();
                    }
                }
            } else {
                ((a) list.get(i3)).f5714f = Float.valueOf(((a) list.get(i3 + 1)).f5713e);
            }
            i3++;
        }
        a aVar3 = (a) list.get(i2);
        if (d.a.f5635k) {
            if ((aVar3.f5710b == null || aVar3.f5711c == null) && list.size() > 1) {
                list.remove(aVar3);
            }
        } else if (aVar3.f5710b == null) {
            list.remove(aVar3);
        }
    }

    static <T> List<a<T>> a(JsonReader jsonReader, e eVar, float f2, af<T> afVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eVar.a("Lottie doesn't support expressions.");
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
                    arrayList.add(o.a(jsonReader, eVar, f2, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(o.a(jsonReader, eVar, f2, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(o.a(jsonReader, eVar, f2, afVar, false));
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }
}
