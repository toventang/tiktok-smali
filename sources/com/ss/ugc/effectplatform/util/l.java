package com.ss.ugc.effectplatform.util;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.n;
import h.a.z;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f153971a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, float[]> f153972b;

    /* renamed from: c  reason: collision with root package name */
    private static final SparseArray<float[]> f153973c;

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f153974d = Pattern.compile("\\d+$");

    /* renamed from: e  reason: collision with root package name */
    private static final h f153975e = i.a((h.f.a.a) c.f153985a);

    static a a() {
        return (a) f153975e.getValue();
    }

    private l() {
    }

    static final class c extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f153985a = new c();

        static {
            Covode.recordClassIndex(102681);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return l.f153971a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f153976a = "unknown";

        /* renamed from: b  reason: collision with root package name */
        public String f153977b = "unknown";

        /* renamed from: c  reason: collision with root package name */
        public String f153978c = "unknown";

        /* renamed from: d  reason: collision with root package name */
        public int f153979d;

        /* renamed from: e  reason: collision with root package name */
        public int f153980e;

        /* renamed from: f  reason: collision with root package name */
        public int f153981f = -1;

        /* renamed from: g  reason: collision with root package name */
        public double f153982g = -1.0d;

        /* renamed from: h  reason: collision with root package name */
        public String f153983h = "unknown";

        static {
            Covode.recordClassIndex(102679);
        }

        public final String toString() {
            return "GPUInfo{renderer='" + this.f153976a + "', version='" + this.f153977b + "', vendor='" + this.f153978c + "', maxFreq=" + this.f153979d + ", minFreq=" + this.f153980e + ", glVer=" + this.f153981f + ", alusOrThroughput=" + this.f153982g + "}";
        }

        public final void a(String str) {
            h.f.b.l.c(str, "");
            this.f153977b = str;
        }
    }

    static {
        Covode.recordClassIndex(102678);
        HashMap<String, float[]> hashMap = new HashMap<>();
        f153972b = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        f153973c = sparseArray;
        hashMap.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        hashMap.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        hashMap.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        hashMap.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        hashMap.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        hashMap.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(200, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(203, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(205, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(420, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(505, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(506, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(508, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(510, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(512, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    public final a b() {
        GL gl;
        double d2;
        float[] fArr;
        Collection collection;
        a aVar = new a();
        try {
            f fVar = new f();
            int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
            EGL egl = EGLContext.getEGL();
            if (!(egl instanceof EGL10)) {
                egl = null;
            }
            EGL10 egl10 = (EGL10) egl;
            if (egl10 != null) {
                fVar.f153955b = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (fVar.f153955b == EGL10.EGL_NO_DISPLAY) {
                    fVar.a("unable to get EGL10 display");
                }
                fVar.a(egl10);
                if (!egl10.eglInitialize(fVar.f153955b, new int[2])) {
                    fVar.a("unable to initialize EGL10");
                }
                fVar.a(egl10);
                int[] iArr2 = new int[1];
                if (!egl10.eglChooseConfig(fVar.f153955b, iArr, null, 0, iArr2)) {
                    fVar.a("eglChooseConfig failed");
                }
                fVar.a(egl10);
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
                if (!egl10.eglChooseConfig(fVar.f153955b, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                    fVar.a("eglChooseConfig#2 failed");
                }
                fVar.a(egl10);
                fVar.f153956c = eGLConfigArr[0];
                if (fVar.f153956c == null) {
                    fVar.a("Unable to find a suitable EGLConfig");
                }
                fVar.f153957d = egl10.eglCreatePbufferSurface(fVar.f153955b, fVar.f153956c, new int[]{12375, 16, 12374, 16, 12344});
                if (fVar.f153957d == EGL10.EGL_NO_SURFACE || fVar.f153957d == null) {
                    fVar.a("surface was null");
                }
                fVar.a(egl10);
                fVar.f153958e = egl10.eglCreateContext(fVar.f153955b, fVar.f153956c, fVar.f153960g, new int[]{12440, 2, 12344});
                if (fVar.f153958e == EGL10.EGL_NO_CONTEXT || fVar.f153958e == null) {
                    fVar.a("context was null");
                }
                fVar.a(egl10);
                if (!egl10.eglMakeCurrent(fVar.f153955b, fVar.f153957d, fVar.f153957d, fVar.f153958e)) {
                    fVar.a("eglMakeCurrent failed");
                }
                fVar.a(egl10);
                EGLContext eGLContext = fVar.f153958e;
                if (eGLContext != null) {
                    gl = eGLContext.getGL();
                } else {
                    gl = null;
                }
                if (!(gl instanceof GL10)) {
                    gl = null;
                }
                fVar.f153959f = (GL10) gl;
                fVar.f153954a = egl10;
            }
            GL10 gl10 = fVar.f153959f;
            if (gl10 != null) {
                String glGetString = gl10.glGetString(7936);
                h.f.b.l.a((Object) glGetString, "");
                h.f.b.l.c(glGetString, "");
                aVar.f153978c = glGetString;
                String glGetString2 = gl10.glGetString(7938);
                h.f.b.l.a((Object) glGetString2, "");
                aVar.a(glGetString2);
                String glGetString3 = gl10.glGetString(7937);
                h.f.b.l.a((Object) glGetString3, "");
                h.f.b.l.c(glGetString3, "");
                aVar.f153976a = glGetString3;
                String glGetString4 = gl10.glGetString(7939);
                h.f.b.l.a((Object) glGetString4, "");
                h.f.b.l.c(glGetString4, "");
                aVar.f153983h = glGetString4;
            }
            EGL10 egl102 = fVar.f153954a;
            if (egl102 != null) {
                if (!fVar.f153961h) {
                    EGLDisplay eGLDisplay = fVar.f153955b;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl102.eglDestroySurface(fVar.f153955b, fVar.f153957d);
                    egl102.eglDestroyContext(fVar.f153955b, fVar.f153958e);
                    egl102.eglTerminate(fVar.f153955b);
                } else if (fVar.f153955b != EGL10.EGL_NO_DISPLAY) {
                    if (!(fVar.f153957d == null || fVar.f153957d == EGL10.EGL_NO_SURFACE)) {
                        EGLDisplay eGLDisplay2 = fVar.f153955b;
                        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                        egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                        egl102.eglDestroySurface(fVar.f153955b, fVar.f153957d);
                        fVar.f153957d = null;
                    }
                    if (fVar.f153958e != null) {
                        egl102.eglDestroyContext(fVar.f153955b, fVar.f153958e);
                        fVar.f153958e = null;
                    }
                    if (fVar.f153955b != null) {
                        egl102.eglTerminate(fVar.f153955b);
                        fVar.f153955b = null;
                    }
                }
            }
            String str = aVar.f153977b;
            if (p.b(str, "OpenGL ES", false)) {
                if (str != null) {
                    String substring = str.substring(9);
                    h.f.b.l.a((Object) substring, "");
                    if (substring != null) {
                        str = p.b((CharSequence) substring).toString();
                        List<String> split = new h.m.l(" ").split(str, 0);
                        if (!split.isEmpty()) {
                            ListIterator<String> listIterator = split.listIterator(split.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        collection = n.d((Iterable) split, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        collection = z.INSTANCE;
                        Object[] array = collection.toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length != 0) {
                                str = strArr[0];
                            }
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            aVar.a(str);
            aVar.f153979d = a(aVar.f153976a, "max");
            aVar.f153980e = a(aVar.f153976a, "min");
            String str2 = aVar.f153976a;
            h.f.b.l.c(str2, "");
            if (str2.length() > 0) {
                String lowerCase = str2.toLowerCase();
                h.f.b.l.a((Object) lowerCase, "");
                if (p.b(lowerCase, "mali", false)) {
                    fArr = f153972b.get(str2);
                } else {
                    String lowerCase2 = str2.toLowerCase();
                    h.f.b.l.a((Object) lowerCase2, "");
                    if (p.a((CharSequence) lowerCase2, (CharSequence) "adreno", false)) {
                        fArr = f153973c.get(a(str2));
                    }
                }
                if (fArr != null) {
                    d2 = (double) fArr[2];
                    aVar.f153982g = d2;
                    return aVar;
                }
            }
            d2 = -1.0d;
            aVar.f153982g = d2;
        } catch (Throwable th) {
            d.a.e.b.a("GPUUtils", "get gpu info error:" + th.getMessage(), null);
        }
        return aVar;
    }

    private static int a(String str) {
        Matcher matcher = f153974d.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(0);
            h.f.b.l.a((Object) group, "");
            if (group.length() > 0) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final b f153984a = new b();

        static {
            Covode.recordClassIndex(102680);
        }

        b() {
        }

        public final boolean accept(File file, String str) {
            h.f.b.l.a((Object) file, "");
            if (file.isDirectory()) {
                h.f.b.l.a((Object) str, "");
                if (p.a((CharSequence) str, (CharSequence) "kgsl", false)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static int a(String str, String str2) {
        boolean z;
        float f2;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            h.f.b.l.a((Object) lowerCase, "");
            if (p.b(lowerCase, "mali", false)) {
                float[] fArr = f153972b.get(str);
                if (fArr == null) {
                    return 850;
                }
                if (h.f.b.l.a((Object) "min", (Object) str2)) {
                    f2 = fArr[0];
                } else {
                    f2 = fArr[1];
                }
                return (int) f2;
            }
            String lowerCase2 = str.toLowerCase();
            h.f.b.l.a((Object) lowerCase2, "");
            if (p.b(lowerCase2, "adreno", false)) {
                return b(str, str2);
            }
            return -1;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static int b(String str, String str2) {
        Throwable th;
        int i2;
        boolean z;
        float[] fArr;
        MethodCollector.i(8991);
        int a2 = a(str);
        if (a2 <= 0 || (fArr = f153973c.get(a2)) == null) {
            File[] listFiles = new File("/sys/class/devfreq/").listFiles(b.f153984a);
            if (listFiles == null || listFiles.length == 0) {
                int i3 = a2 + 200;
                MethodCollector.o(8991);
                return i3;
            }
            int length = listFiles.length;
            for (int i4 = 0; i4 < length; i4++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(listFiles[i4], str2 + "_freq")));
                    try {
                        String readLine = bufferedReader2.readLine();
                        h.f.b.l.a((Object) readLine, "");
                        int length2 = readLine.length() - 1;
                        int i5 = 0;
                        boolean z2 = false;
                        while (i5 <= length2) {
                            if (!z2) {
                                i2 = i5;
                            } else {
                                i2 = length2;
                            }
                            if (readLine.charAt(i2) <= ' ') {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2) {
                                if (!z) {
                                    break;
                                }
                                length2--;
                            } else if (!z) {
                                z2 = true;
                            } else {
                                i5++;
                            }
                        }
                        int parseInt = Integer.parseInt(readLine.subSequence(i5, length2 + 1).toString()) / 1000000;
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.o(8991);
                        return parseInt;
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused4) {
                        }
                        MethodCollector.o(8991);
                        throw th;
                    }
                } catch (Exception unused5) {
                    if (0 == 0) {
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.o(8991);
                    throw th;
                }
            }
            MethodCollector.o(8991);
            return -1;
        }
        int i6 = (int) fArr[1];
        MethodCollector.o(8991);
        return i6;
    }
}
