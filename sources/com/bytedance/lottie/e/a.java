package com.bytedance.lottie.e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.h;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.e;
import com.bytedance.lottie.c.a.i;
import com.bytedance.lottie.c.a.m;
import com.bytedance.lottie.g;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(24942);
    }

    public static e a(JsonReader jsonReader, g gVar) {
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
                arrayList.add(new h(gVar, o.a(jsonReader, gVar, com.bytedance.lottie.f.h.a(), u.f40681a, z)));
            }
            jsonReader.endArray();
            p.a(arrayList);
        } else {
            arrayList.add(new com.bytedance.lottie.g.a(n.b(jsonReader, com.bytedance.lottie.f.h.a())));
        }
        return new e(arrayList);
    }

    static m<PointF, PointF> b(JsonReader jsonReader, g gVar) {
        jsonReader.beginObject();
        e eVar = null;
        b bVar = null;
        b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 107:
                    if (nextName.equals("k")) {
                        eVar = a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 120:
                    if (nextName.equals("x")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar = d.a(jsonReader, gVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar2 = d.a(jsonReader, gVar, true);
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
            gVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new i(bVar, bVar2);
    }
}
