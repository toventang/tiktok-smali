package com.airbnb.lottie;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.c.h;
import com.airbnb.lottie.e.g;
import com.airbnb.lottie.f.c;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h.r;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, m<e>> f5531a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5532b = false;

    /* renamed from: c  reason: collision with root package name */
    private static ComponentCallbacks2 f5533c = new ComponentCallbacks2() {
        /* class com.airbnb.lottie.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2304);
        }

        public final void onConfigurationChanged(Configuration configuration) {
        }

        public final void onLowMemory() {
            f.a();
        }

        public final void onTrimMemory(int i2) {
            if (i2 == 5 || i2 == 10 || i2 == 40) {
                f.a();
            }
        }
    };

    public static void a() {
        if (d.a.f5625a) {
            f5531a.clear();
            g.f5527a.f5528b.a();
        }
    }

    public static void a(Context context) {
        if (!f5532b) {
            f5532b = true;
            if (d.a.f5633i && context != null) {
                b(context).registerComponentCallbacks(f5533c);
            }
        }
    }

    static {
        Covode.recordClassIndex(2303);
    }

    public static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    static String a(int i2) {
        return "rawRes_".concat(String.valueOf(i2));
    }

    public static m<e> a(Context context, String str) {
        return c.a(context, str);
    }

    public static l<e> a(ZipInputStream zipInputStream, String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            com.airbnb.lottie.i.g.a(zipInputStream);
        }
    }

    private static h a(e eVar, String str) {
        for (h hVar : eVar.f5332c.values()) {
            if (hVar.f5657d.equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    public static l<e> a(Context context, int i2) {
        MethodCollector.i(7580);
        try {
            l<e> a2 = a(context.getResources().openRawResource(i2), a(i2), true);
            MethodCollector.o(7580);
            return a2;
        } catch (Resources.NotFoundException e2) {
            l<e> lVar = new l<>(e2);
            MethodCollector.o(7580);
            return lVar;
        }
    }

    public static l<e> b(Context context, String str) {
        MethodCollector.i(7578);
        try {
            String concat = "asset_".concat(String.valueOf(str));
            if (str.endsWith(".zip")) {
                l<e> a2 = a(new ZipInputStream(context.getAssets().open(str)), concat);
                MethodCollector.o(7578);
                return a2;
            }
            l<e> a3 = a(context.getAssets().open(str), concat, true);
            MethodCollector.o(7578);
            return a3;
        } catch (IOException e2) {
            l<e> lVar = new l<>(e2);
            MethodCollector.o(7578);
            return lVar;
        }
    }

    public static m<e> a(final JsonReader jsonReader, final String str) {
        return a(str, new Callable<l<e>>() {
            /* class com.airbnb.lottie.f.AnonymousClass8 */

            static {
                Covode.recordClassIndex(2311);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ l<e> call() {
                return f.b(jsonReader, str);
            }
        });
    }

    public static m<e> a(final InputStream inputStream, final String str) {
        return a(str, new Callable<l<e>>() {
            /* class com.airbnb.lottie.f.AnonymousClass6 */

            static {
                Covode.recordClassIndex(2309);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ l<e> call() {
                return f.a(inputStream, str, true);
            }
        });
    }

    public static l<e> b(JsonReader jsonReader, String str) {
        try {
            float a2 = com.airbnb.lottie.i.g.a();
            androidx.c.d<com.airbnb.lottie.e.c.d> dVar = new androidx.c.d<>();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            h<com.airbnb.lottie.e.d> hVar = new h<>();
            e eVar = new e();
            jsonReader.beginObject();
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            int i2 = 0;
            int i3 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1408207997:
                        if (nextName.equals("assets")) {
                            r.a(jsonReader, eVar, hashMap, hashMap2);
                            continue;
                        }
                        break;
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            r.a(jsonReader, eVar, arrayList, dVar);
                            continue;
                        }
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            i3 = jsonReader.nextInt();
                            continue;
                        }
                        break;
                    case 118:
                        if (nextName.equals("v")) {
                            String[] split = jsonReader.nextString().split("\\.");
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int parseInt3 = Integer.parseInt(split[2]);
                            if (parseInt >= 4) {
                                if (parseInt > 4) {
                                    continue;
                                } else if (parseInt2 >= 4) {
                                    if (parseInt2 <= 4) {
                                        if (parseInt3 >= 0) {
                                        }
                                    }
                                }
                            }
                            eVar.a("Lottie only supports bodymovin >= 4.4.0");
                        }
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            i2 = jsonReader.nextInt();
                            continue;
                        }
                        break;
                    case 3276:
                        if (nextName.equals("fr")) {
                            f4 = (float) jsonReader.nextDouble();
                            continue;
                        }
                        break;
                    case 3367:
                        if (nextName.equals("ip")) {
                            f2 = (float) jsonReader.nextDouble();
                            continue;
                        }
                        break;
                    case 3553:
                        if (nextName.equals("op")) {
                            f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                            continue;
                        }
                        break;
                    case 94623709:
                        if (nextName.equals("chars")) {
                            r.a(jsonReader, eVar, hVar);
                            continue;
                        }
                        break;
                    case 97615364:
                        if (nextName.equals("fonts")) {
                            r.a(jsonReader, hashMap3);
                            continue;
                        }
                        break;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            eVar.f5337h = new Rect(0, 0, (int) (((float) i2) * a2), (int) (((float) i3) * a2));
            eVar.f5338i = f2;
            eVar.f5339j = f3;
            eVar.f5340k = f4;
            eVar.f5336g = arrayList;
            eVar.f5335f = dVar;
            eVar.f5331b = hashMap;
            eVar.f5332c = hashMap2;
            eVar.f5334e = hVar;
            eVar.f5333d = hashMap3;
            g.f5527a.a(str, eVar);
            return new l<>(eVar);
        } catch (Exception e2) {
            return new l<>(e2);
        }
    }

    static m<e> a(final String str, Callable<l<e>> callable) {
        if (str != null) {
            final e a2 = g.f5527a.a(str);
            if (a2 != null) {
                return new m<>(new Callable<l<e>>() {
                    /* class com.airbnb.lottie.f.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(2312);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ l<e> call() {
                        return new l(a2);
                    }
                });
            }
            if (str != null) {
                Map<String, m<e>> map = f5531a;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
            }
        }
        m<e> mVar = new m<>(callable);
        if (str != null) {
            mVar.a((i<e>) new i<e>() {
                /* class com.airbnb.lottie.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(2305);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.airbnb.lottie.i
                public final /* synthetic */ void a(e eVar) {
                    f.f5531a.remove(str);
                }
            });
            mVar.c(new i<Throwable>() {
                /* class com.airbnb.lottie.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(2306);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.airbnb.lottie.i
                public final /* synthetic */ void a(Throwable th) {
                    f.f5531a.remove(str);
                }
            });
            f5531a.put(str, mVar);
        }
        return mVar;
    }

    private static l<e> b(ZipInputStream zipInputStream, String str) {
        MethodCollector.i(7708);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            V v = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        v = a(zipInputStream, str, false).f5748a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (v == null) {
                l<e> lVar = new l<>(new IllegalArgumentException("Unable to parse composition"));
                MethodCollector.o(7708);
                return lVar;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                h a2 = a((e) v, (String) entry.getKey());
                if (a2 != null) {
                    if (d.a.f5625a) {
                        a2.f5660g = com.airbnb.lottie.i.g.a((Bitmap) entry.getValue(), a2.f5654a, a2.f5655b, a2);
                    } else {
                        a2.f5660g = (Bitmap) entry.getValue();
                    }
                }
            }
            for (Map.Entry<String, h> entry2 : v.f5332c.entrySet()) {
                if (entry2.getValue().f5660g == null) {
                    l<e> lVar2 = new l<>(new IllegalStateException("There is no image for " + entry2.getValue().f5657d));
                    MethodCollector.o(7708);
                    return lVar2;
                }
            }
            g.f5527a.a(str, v);
            l<e> lVar3 = new l<>((e) v);
            MethodCollector.o(7708);
            return lVar3;
        } catch (IOException e2) {
            l<e> lVar4 = new l<>(e2);
            MethodCollector.o(7708);
            return lVar4;
        }
    }

    public static l<e> a(InputStream inputStream, String str, boolean z) {
        try {
            return b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.airbnb.lottie.i.g.a(inputStream);
            }
        }
    }
}
