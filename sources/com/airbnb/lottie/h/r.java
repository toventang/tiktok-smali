package com.airbnb.lottie.h;

import android.util.JsonReader;
import androidx.c.h;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.c;
import com.airbnb.lottie.e.c.d;
import com.airbnb.lottie.e.d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class r {
    static {
        Covode.recordClassIndex(2372);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(JsonReader jsonReader, Map<String, c> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    float f2 = 0.0f;
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        switch (nextName2.hashCode()) {
                            case -1866931350:
                                if (nextName2.equals("fFamily")) {
                                    str = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case -1408684838:
                                if (nextName2.equals("ascent")) {
                                    f2 = (float) jsonReader.nextDouble();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case -1294566165:
                                if (nextName2.equals("fStyle")) {
                                    str3 = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case 96619537:
                                if (nextName2.equals("fName")) {
                                    str2 = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c cVar = new c(str, str2, str3, f2);
                    map.put(cVar.f5460b, cVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(JsonReader jsonReader, e eVar, h<d> hVar) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            double d2 = 0.0d;
            double d3 = 0.0d;
            char c2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1866931350:
                        if (nextName.equals("fFamily")) {
                            str2 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            d2 = jsonReader.nextDouble();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3173:
                        if (nextName.equals("ch")) {
                            c2 = jsonReader.nextString().charAt(0);
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3076010:
                        if (nextName.equals("data")) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g.a(jsonReader, eVar));
                                    }
                                    jsonReader.endArray();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3530753:
                        if (nextName.equals("size")) {
                            d3 = jsonReader.nextDouble();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 109780401:
                        if (nextName.equals("style")) {
                            str = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            d dVar = new d(arrayList, c2, d3, d2, str, str2);
            hVar.b(dVar.hashCode(), dVar);
        }
        jsonReader.endArray();
    }

    public static void a(JsonReader jsonReader, e eVar, List<com.airbnb.lottie.e.c.d> list, androidx.c.d<com.airbnb.lottie.e.c.d> dVar) {
        jsonReader.beginArray();
        int i2 = 0;
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.e.c.d a2 = q.a(jsonReader, eVar);
            if (a2.f5493e == d.a.Image) {
                i2++;
            }
            list.add(a2);
            dVar.b(a2.f5492d, a2);
            if (i2 > 4) {
                com.airbnb.lottie.d.a("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(JsonReader jsonReader, e eVar, Map<String, List<com.airbnb.lottie.e.c.d>> map, Map<String, com.airbnb.lottie.h> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            androidx.c.d dVar = new androidx.c.d();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            int i3 = 0;
            boolean z = true;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                com.airbnb.lottie.e.c.d a2 = q.a(jsonReader, eVar);
                                dVar.b(a2.f5492d, a2);
                                arrayList.add(a2);
                            }
                            jsonReader.endArray();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            i3 = jsonReader.nextInt();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 112:
                        if (nextName.equals("p")) {
                            str2 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 117:
                        if (nextName.equals("u")) {
                            str3 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            i2 = jsonReader.nextInt();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            str = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 92909918:
                        if (nextName.equals("alpha")) {
                            z = jsonReader.nextBoolean();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.airbnb.lottie.h hVar = new com.airbnb.lottie.h(i2, i3, str, str2, str3, z);
                map2.put(hVar.f5656c, hVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }
}
