package com.lynx.tasm.behavior.shadow.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.d.c;
import java.util.ArrayList;
import java.util.List;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.c.a<String, Typeface[]> f56044a = new androidx.c.a<>();

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.c.a<Typeface, Typeface[]> f56045b = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f56046c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f56047d = {".ttf", ".otf"};

    /* renamed from: e  reason: collision with root package name */
    private static final List<a> f56048e = new ArrayList();

    public interface a {
        static {
            Covode.recordClassIndex(35016);
        }

        Typeface a(String str, int i2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(35017);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(35015);
    }

    public static void a(a aVar) {
        if (aVar != null) {
            f56048e.add(aVar);
        }
    }

    public static synchronized boolean a(String str) {
        boolean containsKey;
        synchronized (r.class) {
            MethodCollector.i(13481);
            containsKey = f56044a.containsKey(str);
            MethodCollector.o(13481);
        }
        return containsKey;
    }

    public static void a(AssetManager assetManager, String str, String str2) {
        int i2 = 0;
        do {
            Typeface a2 = a(assetManager, str, i2, str2);
            if (a2 != null) {
                a(str, i2, a2);
            }
            i2++;
        } while (i2 < 4);
    }

    private static synchronized void a(String str, int i2, Typeface typeface) {
        synchronized (r.class) {
            MethodCollector.i(13548);
            androidx.c.a<String, Typeface[]> aVar = f56044a;
            Typeface[] typefaceArr = aVar.get(str);
            if (typefaceArr == null) {
                typefaceArr = new Typeface[4];
                aVar.put(str, typefaceArr);
            }
            typefaceArr[i2] = typeface;
            f56045b.put(typeface, typefaceArr);
            MethodCollector.o(13548);
        }
    }

    public static synchronized Typeface a(j jVar, String str, int i2) {
        synchronized (r.class) {
            MethodCollector.i(13551);
            Typeface[] typefaceArr = f56044a.get(str);
            if (typefaceArr == null || typefaceArr[i2] == null) {
                for (a aVar : f56048e) {
                    Typeface a2 = aVar.a(str, i2);
                    if (a2 != null) {
                        a(str, i2, a2);
                        MethodCollector.o(13551);
                        return a2;
                    }
                }
                Typeface a3 = c.a.f56597a.a(jVar, str, i2, (b) null);
                if (a3 != null) {
                    MethodCollector.o(13551);
                    return a3;
                }
                LLog.a(2, "TypefaceCache", "Can't not find typeface for fontFamily: " + str + " in lynx.");
                MethodCollector.o(13551);
                return null;
            }
            Typeface typeface = typefaceArr[i2];
            MethodCollector.o(13551);
            return typeface;
        }
    }

    public static Typeface a(AssetManager assetManager, String str, int i2, String str2) {
        String str3 = f56046c[i2];
        StringBuilder append = new StringBuilder(32).append(str2);
        String str4 = "/";
        if (str2.endsWith(str4)) {
            str4 = "";
        }
        StringBuilder append2 = append.append(str4).append(str).append(str3);
        int length = append2.length();
        for (String str5 : f56047d) {
            try {
                return Typeface.createFromAsset(assetManager, append2.append(str5).toString());
            } catch (RuntimeException e2) {
                LLog.c("TypefaceCache", "Exception happens whe cacheTypefaceFromAssets with message " + e2.getMessage());
                append2.setLength(length);
            }
        }
        return null;
    }
}
