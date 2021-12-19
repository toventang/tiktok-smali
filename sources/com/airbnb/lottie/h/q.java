package com.airbnb.lottie.h;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.a.j;
import com.airbnb.lottie.e.a.k;
import com.airbnb.lottie.e.a.l;
import com.airbnb.lottie.e.c.d;
import com.airbnb.lottie.i.g;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static int f5672a;

    static {
        Covode.recordClassIndex(2371);
    }

    public static d a(e eVar) {
        Rect rect = eVar.f5337h;
        return new d(Collections.emptyList(), eVar, "__container", -1, d.a.PreComp, -1, null, Collections.emptyList(), new l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), d.b.None, null);
    }

    public static d a(JsonReader jsonReader, e eVar) {
        d.b bVar = d.b.None;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        d.a aVar = null;
        Float valueOf2 = Float.valueOf(0.0f);
        l lVar = null;
        j jVar = null;
        k kVar = null;
        b bVar2 = null;
        long j2 = 0;
        long j3 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f4 = 1.0f;
        float f5 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        j3 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.airbnb.lottie.e.b.b a2 = g.a(jsonReader, eVar);
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
                        i6 = (int) (((float) jsonReader.nextInt()) * g.a());
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
                                    kVar = b.a(jsonReader, eVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                            } else if (!nextName2.equals("d")) {
                                jsonReader.skipValue();
                            } else {
                                jVar = new j(d.a(jsonReader, eVar, h.f5665a));
                            }
                        }
                        jsonReader.endObject();
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        i5 = (int) (((float) jsonReader.nextInt()) * g.a());
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
                        eVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
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
                        lVar = c.a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str2 = jsonReader.nextString();
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
                        i3 = (int) (((float) jsonReader.nextInt()) * g.a());
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
                        i2 = (int) (((float) jsonReader.nextInt()) * g.a());
                        continue;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        bVar2 = d.a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        bVar = d.b.values()[jsonReader.nextInt()];
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
                        j2 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList = arrayList;
                            arrayList.add(s.a(jsonReader, eVar));
                        }
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
            arrayList4.add(new a(eVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6)));
        }
        if (f7 <= 0.0f) {
            f7 = eVar.f5339j;
        }
        arrayList4.add(new a(eVar, valueOf, valueOf, null, f6, Float.valueOf(f7)));
        arrayList4.add(new a(eVar, valueOf2, valueOf2, null, f7, Float.valueOf(Float.MAX_VALUE)));
        if (str2 == null) {
            StringBuilder sb = new StringBuilder("layer_");
            int i7 = f5672a;
            f5672a = i7 + 1;
            str2 = sb.append(i7).append("_").append(str).toString();
        } else if (str2.endsWith(".ai") || "ai".equals(str3)) {
            eVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new d(arrayList2, eVar, str2, j2, aVar, j3, str, arrayList, lVar, i2, i3, i4, f4, f5, i5, i6, jVar, kVar, arrayList4, bVar, bVar2);
    }
}
