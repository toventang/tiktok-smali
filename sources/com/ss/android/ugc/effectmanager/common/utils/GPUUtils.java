package com.ss.android.ugc.effectmanager.common.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import h.a.n;
import h.a.z;
import h.f.a.a;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m.p;
import h.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public final class GPUUtils {
    static final /* synthetic */ i[] $$delegatedProperties = {new y(ab.a(GPUUtils.class), "gpuInfo", "getGpuInfo()Lcom/ss/android/ugc/effectmanager/common/utils/GPUUtils$GPUInfo;")};
    public static final GPUUtils INSTANCE = new GPUUtils();
    private static final h gpuInfo$delegate = h.i.a((a) GPUUtils$gpuInfo$2.INSTANCE);
    private static final SparseArray<float[]> sAdrenoGpuFreqMap;
    private static final Pattern sAdrenoSerialPattern = Pattern.compile("\\d+$");
    private static final HashMap<String, float[]> sMaliGpuFreqMap;

    private final GPUInfo getGpuInfo() {
        return (GPUInfo) gpuInfo$delegate.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class GPUInfo {
        private double alusOrThroughput = -1.0d;
        private String glExtension = "unknown";
        private int glVer = -1;
        private int maxFreq;
        private int minFreq;
        private String renderer = "unknown";
        private String vendor = "unknown";
        private String version = "unknown";

        static {
            Covode.recordClassIndex(95340);
        }

        public final double getAlusOrThroughput() {
            return this.alusOrThroughput;
        }

        public final String getGlExtension() {
            return this.glExtension;
        }

        public final int getGlVer() {
            return this.glVer;
        }

        public final int getMaxFreq() {
            return this.maxFreq;
        }

        public final int getMinFreq() {
            return this.minFreq;
        }

        public final String getRenderer() {
            return this.renderer;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String toString() {
            return "GPUInfo{renderer='" + this.renderer + "', version='" + this.version + "', vendor='" + this.vendor + "', maxFreq=" + this.maxFreq + ", minFreq=" + this.minFreq + ", glVer=" + this.glVer + ", alusOrThroughput=" + this.alusOrThroughput + "}";
        }

        public final void setAlusOrThroughput(double d2) {
            this.alusOrThroughput = d2;
        }

        public final void setGlVer(int i2) {
            this.glVer = i2;
        }

        public final void setMaxFreq(int i2) {
            this.maxFreq = i2;
        }

        public final void setMinFreq(int i2) {
            this.minFreq = i2;
        }

        public final void setGlExtension(String str) {
            l.c(str, "");
            this.glExtension = str;
        }

        public final void setRenderer(String str) {
            l.c(str, "");
            this.renderer = str;
        }

        public final void setVendor(String str) {
            l.c(str, "");
            this.vendor = str;
        }

        public final void setVersion(String str) {
            l.c(str, "");
            this.version = str;
        }
    }

    private GPUUtils() {
    }

    public final double getAlusOrThroughput() {
        return getGpuInfo().getAlusOrThroughput();
    }

    public final String getGlExtension() {
        return getGpuInfo().getGlExtension();
    }

    public final int getGlVer() {
        return getGpuInfo().getGlVer();
    }

    public final String getGpuInfoStr() {
        return getGpuInfo().toString();
    }

    public final int getMaxFreq() {
        return getGpuInfo().getMaxFreq();
    }

    public final int getMinFreq() {
        return getGpuInfo().getMinFreq();
    }

    public final String getRenderer() {
        return getGpuInfo().getRenderer();
    }

    public final String getVendor() {
        return getGpuInfo().getVendor();
    }

    public final String getVersion() {
        return getGpuInfo().getVersion();
    }

    public final GPUInfo generateGPUInfo() {
        Collection collection;
        GPUInfo gPUInfo = new GPUInfo();
        try {
            EGLUtils eGLUtils = new EGLUtils();
            eGLUtils.eglInit(16, 16);
            GL10 gl10 = eGLUtils.getGl10();
            if (gl10 != null) {
                String glGetString = gl10.glGetString(7936);
                l.a((Object) glGetString, "");
                gPUInfo.setVendor(glGetString);
                String glGetString2 = gl10.glGetString(7938);
                l.a((Object) glGetString2, "");
                gPUInfo.setVersion(glGetString2);
                String glGetString3 = gl10.glGetString(7937);
                l.a((Object) glGetString3, "");
                gPUInfo.setRenderer(glGetString3);
                String glGetString4 = gl10.glGetString(7939);
                l.a((Object) glGetString4, "");
                gPUInfo.setGlExtension(glGetString4);
            }
            eGLUtils.destroy();
            String version = gPUInfo.getVersion();
            if (p.b(version, "OpenGL ES", false)) {
                if (version != null) {
                    String substring = version.substring(9);
                    l.a((Object) substring, "");
                    if (substring != null) {
                        version = p.b((CharSequence) substring).toString();
                        List<String> split = new h.m.l(" ").split(version, 0);
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
                        if (collection != null) {
                            Object[] array = collection.toArray(new String[0]);
                            if (array != null) {
                                String[] strArr = (String[]) array;
                                if (strArr.length != 0) {
                                    version = strArr[0];
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
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            gPUInfo.setVersion(version);
            gPUInfo.setMaxFreq(getGpuMHz(gPUInfo.getRenderer(), "max"));
            gPUInfo.setMinFreq(getGpuMHz(gPUInfo.getRenderer(), "min"));
            gPUInfo.setAlusOrThroughput(getAlusOrThroughput(gPUInfo.getRenderer()));
        } catch (Throwable th) {
            EPLog.e("GPUUtils", "get gpu info error:" + th.getMessage());
        }
        return gPUInfo;
    }

    static {
        Covode.recordClassIndex(95339);
        HashMap<String, float[]> hashMap = new HashMap<>();
        sMaliGpuFreqMap = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        sAdrenoGpuFreqMap = sparseArray;
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

    private final int getAdrenoSerial(String str) {
        Matcher matcher = sAdrenoSerialPattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(0);
            l.a((Object) group, "");
            if (group.length() > 0) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    public final int getGpuOpenGlVersion(Context context) {
        l.c(context, "");
        Object com_ss_android_ugc_effectmanager_common_utils_GPUUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService = com_ss_android_ugc_effectmanager_common_utils_GPUUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
        if (com_ss_android_ugc_effectmanager_common_utils_GPUUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService != null) {
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) com_ss_android_ugc_effectmanager_common_utils_GPUUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService).getDeviceConfigurationInfo();
            if (deviceConfigurationInfo != null) {
                return deviceConfigurationInfo.reqGlEsVersion;
            }
            return -1;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final double getAlusOrThroughput(String str) {
        float[] fArr;
        l.c(str, "");
        if (str.length() <= 0) {
            return -1.0d;
        }
        String lowerCase = str.toLowerCase();
        l.a((Object) lowerCase, "");
        if (p.b(lowerCase, "mali", false)) {
            fArr = sMaliGpuFreqMap.get(str);
        } else {
            String lowerCase2 = str.toLowerCase();
            l.a((Object) lowerCase2, "");
            if (!p.a((CharSequence) lowerCase2, (CharSequence) "adreno", false)) {
                return -1.0d;
            }
            fArr = sAdrenoGpuFreqMap.get(getAdrenoSerial(str));
        }
        if (fArr != null) {
            return (double) fArr[2];
        }
        return -1.0d;
    }

    private final int getMaliGpuFreq(String str, String str2) {
        float f2;
        float[] fArr = sMaliGpuFreqMap.get(str);
        if (fArr == null) {
            return 850;
        }
        if (l.a((Object) "min", (Object) str2)) {
            f2 = fArr[0];
        } else {
            f2 = fArr[1];
        }
        return (int) f2;
    }

    public static Object com_ss_android_ugc_effectmanager_common_utils_GPUUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(188);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(188);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private final int getGpuMHz(String str, String str2) {
        boolean z;
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
            l.a((Object) lowerCase, "");
            if (p.b(lowerCase, "mali", false)) {
                return getMaliGpuFreq(str, str2);
            }
            String lowerCase2 = str.toLowerCase();
            l.a((Object) lowerCase2, "");
            if (p.b(lowerCase2, "adreno", false)) {
                return getAdrenoGpuFreq(str, str2);
            }
            return -1;
        }
        throw new w("null cannot be cast to non-null type");
    }

    private final int getAdrenoGpuFreq(String str, String str2) {
        Throwable th;
        int i2;
        boolean z;
        float[] fArr;
        MethodCollector.i(195);
        int adrenoSerial = getAdrenoSerial(str);
        if (adrenoSerial <= 0 || (fArr = sAdrenoGpuFreqMap.get(adrenoSerial)) == null) {
            File[] listFiles = new File("/sys/class/devfreq/").listFiles(GPUUtils$getAdrenoGpuFreq$kgslPaths$1.INSTANCE);
            if (listFiles == null || listFiles.length == 0) {
                int i3 = adrenoSerial + 200;
                MethodCollector.o(195);
                return i3;
            }
            int length = listFiles.length;
            for (int i4 = 0; i4 < length; i4++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(listFiles[i4], str2 + "_freq")));
                    try {
                        String readLine = bufferedReader2.readLine();
                        l.a((Object) readLine, "");
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
                        MethodCollector.o(195);
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
                        MethodCollector.o(195);
                        throw th;
                    }
                } catch (Exception unused5) {
                    if (0 == 0) {
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.o(195);
                    throw th;
                }
            }
            MethodCollector.o(195);
            return -1;
        }
        int i6 = (int) fArr[1];
        MethodCollector.o(195);
        return i6;
    }
}
