package com.bytedance.lottie.e;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.j;
import com.bytedance.lottie.c.a.k;
import com.bytedance.lottie.c.a.l;
import com.bytedance.lottie.c.c.d;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.a;
import java.util.ArrayList;
import java.util.Collections;

public final class q {
    static {
        Covode.recordClassIndex(24965);
    }

    public static d a(g gVar) {
        Rect rect = gVar.f40712h;
        return new d(Collections.emptyList(), gVar, "__container", -1, d.a.PreComp, -1, null, Collections.emptyList(), new l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), d.b.None, null);
    }

    public static d a(JsonReader jsonReader, g gVar) {
        d.b bVar = d.b.None;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        d.a aVar = null;
        Float valueOf2 = Float.valueOf(0.0f);
        String str = "UNSET";
        String str2 = null;
        l lVar = null;
        j jVar = null;
        k kVar = null;
        b bVar2 = null;
        long j2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f4 = 1.0f;
        float f5 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        long j3 = 0;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        j2 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.lottie.c.b.b a2 = g.a(jsonReader, gVar);
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        }
                        jsonReader.endArray();
                        continue;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        i6 = (int) (((float) jsonReader.nextInt()) * h.a());
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("a")) {
                                jsonReader.beginArray();
                                if (jsonReader.hasNext()) {
                                    kVar = b.a(jsonReader, gVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                            } else if (!nextName2.equals("d")) {
                                jsonReader.skipValue();
                            } else {
                                jVar = new j(d.a(jsonReader, gVar, h.f40674a));
                            }
                        }
                        jsonReader.endObject();
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        i5 = (int) (((float) jsonReader.nextInt()) * h.a());
                        continue;
                    }
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        str3 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        jsonReader.beginArray();
                        ArrayList arrayList3 = new ArrayList();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                nextName3.hashCode();
                                if (!nextName3.equals("nm")) {
                                    jsonReader.skipValue();
                                } else {
                                    arrayList3.add(jsonReader.nextString());
                                }
                            }
                            jsonReader.endObject();
                        }
                        jsonReader.endArray();
                        gVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                        continue;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        f2 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        lVar = c.a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        f3 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        i4 = Color.parseColor(jsonReader.nextString());
                        continue;
                    }
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        i3 = (int) (((float) jsonReader.nextInt()) * h.a());
                        continue;
                    }
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        f4 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        f5 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        i2 = (int) (((float) jsonReader.nextInt()) * h.a());
                        continue;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        bVar2 = d.a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        bVar = d.b.values()[jsonReader.nextInt()];
                        gVar.a(1);
                        continue;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt < d.a.Unknown.ordinal()) {
                            aVar = d.a.values()[nextInt];
                            continue;
                        } else {
                            aVar = d.a.Unknown;
                        }
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        j3 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        str2 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList = arrayList;
                            arrayList.add(s.a(jsonReader, gVar));
                        }
                        gVar.a(arrayList.size());
                        jsonReader.endArray();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        float f6 = f2 / f4;
        float f7 = f3 / f4;
        ArrayList arrayList4 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList4.add(new a(gVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6)));
        }
        if (f7 <= 0.0f) {
            f7 = gVar.f40714j;
        }
        arrayList4.add(new a(gVar, valueOf, valueOf, null, f6, Float.valueOf(f7)));
        arrayList4.add(new a(gVar, valueOf2, valueOf2, null, f7, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new d(arrayList2, gVar, str, j3, aVar, j2, str2, arrayList, lVar, i2, i3, i4, f4, f5, i5, i6, jVar, kVar, arrayList4, bVar, bVar2);
    }
}
