package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.a.b.h;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.e;
import com.airbnb.lottie.e.a.i;
import com.airbnb.lottie.e.a.m;
import com.airbnb.lottie.i.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(2348);
    }

    public static e a(JsonReader jsonReader, com.airbnb.lottie.e eVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new h(eVar, o.a(jsonReader, eVar, g.a(), u.f5673a, z)));
            }
            jsonReader.endArray();
            p.a(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.j.a(n.b(jsonReader, g.a())));
        }
        return new e(arrayList);
    }

    static m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.e eVar) {
        jsonReader.beginObject();
        e eVar2 = null;
        b bVar = null;
        b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 107:
                    if (nextName.equals("k")) {
                        eVar2 = a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 120:
                    if (nextName.equals("x")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar = d.a(jsonReader, eVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar2 = d.a(jsonReader, eVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            eVar.a("Lottie doesn't support expressions.");
        }
        if (eVar2 != null) {
            return eVar2;
        }
        return new i(bVar, bVar2);
    }
}
