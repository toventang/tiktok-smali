package com.bytedance.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.c.g;
import com.bytedance.lottie.e.r;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, o<g>> f40741a = new HashMap();

    static String a(int i2) {
        return "rawRes_".concat(String.valueOf(i2));
    }

    private static boolean a(g gVar) {
        if (gVar == null) {
            return false;
        }
        for (Map.Entry<String, j> entry : gVar.f40707c.entrySet()) {
            if (entry.getValue().f40801g == null) {
                return false;
            }
        }
        return true;
    }

    static void a(final g gVar, d dVar, final a aVar) {
        if (gVar.f40707c == null || gVar.f40707c.size() == 0) {
            gVar.f40716l = true;
            aVar.a(gVar);
        } else if (gVar.f40707c != null) {
            final AtomicInteger atomicInteger = new AtomicInteger(gVar.f40707c.size());
            for (Map.Entry<String, j> entry : gVar.f40707c.entrySet()) {
                if (dVar != null) {
                    final j value = entry.getValue();
                    if ("%s".equals(value.f40798d)) {
                        gVar.f40717m = true;
                        if (atomicInteger.decrementAndGet() == 0) {
                            gVar.f40716l = true;
                            aVar.a(gVar);
                        }
                    } else {
                        dVar.a(value, new f<Bitmap>() {
                            /* class com.bytedance.lottie.h.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(24997);
                            }

                            @Override // com.bytedance.lottie.f
                            public final void a() {
                                gVar.f40716l = false;
                                aVar.a("");
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.lottie.f
                            public final /* synthetic */ void a(Bitmap bitmap) {
                                value.f40801g = bitmap;
                                if (atomicInteger.decrementAndGet() == 0) {
                                    gVar.f40716l = true;
                                    aVar.a(gVar);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static void a(final String str, d dVar, a aVar) {
        g a2 = g.f40652a.a(null);
        if (a(a2)) {
            aVar.a(a2);
        } else {
            o.f40817a.execute(new p(dVar, aVar) {
                /* class com.bytedance.lottie.h.AnonymousClass11 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f40747b = null;

                static {
                    Covode.recordClassIndex(24994);
                }

                public final void run() {
                    MethodCollector.i(2271);
                    String str = str;
                    String str2 = this.f40747b;
                    WeakReference<d> weakReference = this.f40827c;
                    WeakReference<a> weakReference2 = this.f40828d;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        MethodCollector.o(2271);
                        return;
                    }
                    d dVar = weakReference.get();
                    a aVar = weakReference2.get();
                    try {
                        V v = h.a((InputStream) new FileInputStream(new File(str)), str2, true).f40815a;
                        if (v == null) {
                            aVar.a("fromJsonFileAsyncInternal Unable to parse composition and composition is null");
                            MethodCollector.o(2271);
                            return;
                        }
                        h.a((g) v, dVar, (a) new a(str2, aVar) {
                            /* class com.bytedance.lottie.h.AnonymousClass3 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f40750a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ a f40751b;

                            static {
                                Covode.recordClassIndex(24996);
                            }

                            @Override // com.bytedance.lottie.a
                            public final void a(String str) {
                                this.f40751b.a(str);
                            }

                            @Override // com.bytedance.lottie.a
                            public final void a(g gVar) {
                                g.f40652a.a(this.f40750a, gVar);
                                this.f40751b.a(gVar);
                            }

                            {
                                this.f40750a = r1;
                                this.f40751b = r2;
                            }
                        });
                        MethodCollector.o(2271);
                    } catch (Exception e2) {
                        aVar.a("fromJsonFileAsyncInternal Unable to parse composition. Error msg is " + e2.toString());
                        MethodCollector.o(2271);
                    }
                }
            });
        }
    }

    public static void a(Context context, final String str, final String str2, d dVar, a aVar) {
        g a2 = g.f40652a.a(str2);
        if (a(a2)) {
            aVar.a(a2);
        } else {
            o.f40817a.execute(new p(dVar, aVar, context) {
                /* class com.bytedance.lottie.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(24995);
                }

                public final void run() {
                    WeakReference<Context> weakReference = this.f40829e;
                    String str = str;
                    String str2 = str2;
                    WeakReference<d> weakReference2 = this.f40827c;
                    WeakReference<a> weakReference3 = this.f40828d;
                    if (weakReference.get() != null && weakReference2.get() != null && weakReference3.get() != null) {
                        Context context = weakReference.get();
                        a aVar = weakReference3.get();
                        d dVar = weakReference2.get();
                        try {
                            V v = h.a(context, str).f40815a;
                            if (v == null) {
                                aVar.a("fromJsonAssetSyncInternal Unable to parse composition and composition is null");
                            } else {
                                h.a((g) v, dVar, (a) new a(str2, aVar) {
                                    /* class com.bytedance.lottie.h.AnonymousClass5 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ String f40756a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ a f40757b;

                                    static {
                                        Covode.recordClassIndex(24998);
                                    }

                                    @Override // com.bytedance.lottie.a
                                    public final void a(String str) {
                                        this.f40757b.a(str);
                                    }

                                    @Override // com.bytedance.lottie.a
                                    public final void a(g gVar) {
                                        g.f40652a.a(this.f40756a, gVar);
                                        this.f40757b.a(gVar);
                                    }

                                    {
                                        this.f40756a = r1;
                                        this.f40757b = r2;
                                    }
                                });
                            }
                        } catch (Exception e2) {
                            aVar.a("load composition failed from asset. " + e2.getMessage());
                        }
                    }
                }
            });
        }
    }

    static o<g> a(final String str, Callable<n<g>> callable) {
        final g a2 = g.f40652a.a(str);
        if (a2 != null) {
            return new o<>(new Callable<n<g>>() {
                /* class com.bytedance.lottie.h.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(24999);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ n<g> call() {
                    return new n(a2);
                }
            });
        }
        Map<String, o<g>> map = f40741a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        o<g> oVar = new o<>(callable);
        oVar.a(new k<g>() {
            /* class com.bytedance.lottie.h.AnonymousClass7 */

            static {
                Covode.recordClassIndex(25000);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.lottie.k
            public final /* synthetic */ void a(g gVar) {
                g gVar2 = gVar;
                if (str != null) {
                    g.f40652a.a(str, gVar2);
                }
                h.f40741a.remove(str);
            }
        });
        oVar.c(new k<Throwable>() {
            /* class com.bytedance.lottie.h.AnonymousClass8 */

            static {
                Covode.recordClassIndex(25001);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.lottie.k
            public final /* synthetic */ void a(Throwable th) {
                h.f40741a.remove(str);
            }
        });
        map.put(str, oVar);
        return oVar;
    }

    static {
        Covode.recordClassIndex(24991);
    }

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static j a(g gVar, String str) {
        for (j jVar : gVar.f40707c.values()) {
            if (jVar.f40798d.equals(str)) {
                return jVar;
            }
        }
        return null;
    }

    public static n<g> a(Context context, int i2) {
        MethodCollector.i(2346);
        try {
            n<g> a2 = a(context.getResources().openRawResource(i2), a(i2), true);
            MethodCollector.o(2346);
            return a2;
        } catch (Resources.NotFoundException e2) {
            n<g> nVar = new n<>(e2);
            MethodCollector.o(2346);
            return nVar;
        }
    }

    public static n<g> a(Context context, String str) {
        MethodCollector.i(2345);
        try {
            String concat = "asset_".concat(String.valueOf(str));
            if (str.endsWith(".zip")) {
                n<g> a2 = a(new ZipInputStream(context.getAssets().open(str)), concat);
                MethodCollector.o(2345);
                return a2;
            }
            n<g> a3 = a(context.getAssets().open(str), concat, true);
            MethodCollector.o(2345);
            return a3;
        } catch (IOException e2) {
            n<g> nVar = new n<>(e2);
            MethodCollector.o(2345);
            return nVar;
        }
    }

    private static n<g> b(ZipInputStream zipInputStream, String str) {
        MethodCollector.i(2664);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            V v = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        v = a((InputStream) zipInputStream, str, false).f40815a;
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
                n<g> nVar = new n<>(new IllegalArgumentException("Unable to parse composition"));
                MethodCollector.o(2664);
                return nVar;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                j a2 = a((g) v, (String) entry.getKey());
                if (a2 != null) {
                    a2.f40801g = (Bitmap) entry.getValue();
                }
            }
            for (Map.Entry<String, j> entry2 : v.f40707c.entrySet()) {
                if (entry2.getValue().f40801g == null) {
                    n<g> nVar2 = new n<>(new IllegalStateException("There is no image for " + entry2.getValue().f40798d));
                    MethodCollector.o(2664);
                    return nVar2;
                }
            }
            g.f40652a.a(str, v);
            n<g> nVar3 = new n<>((g) v);
            MethodCollector.o(2664);
            return nVar3;
        } catch (IOException e2) {
            n<g> nVar4 = new n<>(e2);
            MethodCollector.o(2664);
            return nVar4;
        }
    }

    public static n<g> a(ZipInputStream zipInputStream, String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            com.bytedance.lottie.f.h.a(zipInputStream);
        }
    }

    public static o<g> a(final JsonReader jsonReader, String str) {
        return a((String) null, new Callable<n<g>>(null) {
            /* class com.bytedance.lottie.h.AnonymousClass10 */

            static {
                Covode.recordClassIndex(24993);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ n<g> call() {
                return h.a(jsonReader, null, true);
            }
        });
    }

    public static n<g> a(InputStream inputStream, String str, boolean z) {
        try {
            return a(new JsonReader(new InputStreamReader(inputStream)), str, false);
        } finally {
            if (z) {
                com.bytedance.lottie.f.h.a(inputStream);
            }
        }
    }

    public static n<g> a(JsonReader jsonReader, String str, boolean z) {
        try {
            float a2 = com.bytedance.lottie.f.h.a();
            d<com.bytedance.lottie.c.c.d> dVar = new d<>();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            androidx.c.h<com.bytedance.lottie.c.d> hVar = new androidx.c.h<>();
            g gVar = new g();
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
                            r.a(jsonReader, gVar, hashMap, hashMap2);
                            continue;
                        }
                        break;
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            r.a(jsonReader, gVar, arrayList, dVar);
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
                            gVar.a("Lottie only supports bodymovin >= 4.4.0");
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
                            r.a(jsonReader, gVar, hVar);
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
            gVar.f40712h = new Rect(0, 0, (int) (((float) i2) * a2), (int) (((float) i3) * a2));
            gVar.f40713i = f2;
            gVar.f40714j = f3;
            gVar.f40715k = f4;
            gVar.f40711g = arrayList;
            gVar.f40710f = dVar;
            gVar.f40706b = hashMap;
            gVar.f40707c = hashMap2;
            gVar.f40709e = hVar;
            gVar.f40708d = hashMap3;
            g.f40652a.a(str, gVar);
            n<g> nVar = new n<>(gVar);
            if (z) {
                com.bytedance.lottie.f.h.a(jsonReader);
            }
            return nVar;
        } catch (Throwable th) {
            if (z) {
                com.bytedance.lottie.f.h.a(jsonReader);
            }
            throw th;
        }
    }
}
