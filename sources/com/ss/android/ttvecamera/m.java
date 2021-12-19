package com.ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static byte f61830a;

    /* renamed from: b  reason: collision with root package name */
    static final ArrayList<TEFrameSizei> f61831b = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(400, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)));

    /* renamed from: c  reason: collision with root package name */
    private static int f61832c = 1920;

    /* renamed from: d  reason: collision with root package name */
    private static String f61833d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f61834e = true;

    /* renamed from: f  reason: collision with root package name */
    private static String[] f61835f = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* renamed from: g  reason: collision with root package name */
    private static String[] f61836g = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* renamed from: h  reason: collision with root package name */
    private static boolean f61837h = true;

    /* renamed from: i  reason: collision with root package name */
    private static Class f61838i;

    /* renamed from: j  reason: collision with root package name */
    private static Field f61839j;

    /* renamed from: k  reason: collision with root package name */
    private static Method f61840k;

    public static int a(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private static int[] a(int[] iArr, List<int[]> list) {
        int[] b2;
        if (list == null || list.size() <= 0) {
            o.b("TECameraUtils", "supported fpsRange is null,use [7,30]");
            return new int[]{7, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr[0] > 1000) {
                if (iArr2[1] == 30000) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            } else if (iArr2[1] == 30) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<int[]>() {
                /* class com.ss.android.ttvecamera.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(38006);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                    return iArr2[0] - iArr[0];
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b2 = (int[]) it.next();
                if (b2[0] <= iArr[0]) {
                    break;
                }
            }
        }
        b2 = b(iArr, list);
        o.b("TECameraUtils", "calculate fps range = [" + b2[0] + "," + b2[1] + "]");
        return b2;
    }

    public static int[] a(int i2, int i3, int[] iArr, List<int[]> list) {
        o.b("TECameraUtils", "requiredFpsRange : [" + iArr[0] + "," + iArr[1] + "]");
        if (i2 == 1) {
            o.b("TECameraUtils", "fixed framerate for all cameras");
            return c(iArr, list);
        } else if (i2 == 2) {
            if (i3 == 0) {
                o.b("TECameraUtils", "fixed framerate for rear camera");
                return c(iArr, list);
            }
            o.b("TECameraUtils", "dynamic framerate for front camera");
            return a(iArr, list);
        } else if (i2 == 3) {
            o.b("TECameraUtils", "dynamic framerate without select");
            return b(iArr, list);
        } else {
            o.b("TECameraUtils", "dynamic framerate");
            return a(iArr, list);
        }
    }

    public static void a(int i2, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i2));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public static List<TEFrameSizei> a(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    public static boolean a(Object obj) {
        try {
            if (f61838i == null || f61839j == null || f61840k == null) {
                f61838i = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f61839j = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f61838i.getDeclaredMethod("finalize", new Class[0]);
                f61840k = declaredMethod;
                declaredMethod.setAccessible(true);
                f61839j.setAccessible(true);
            }
            f61840k.invoke(f61839j.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            o.c("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (NoSuchMethodException unused2) {
            o.c("TECameraUtils", "finalize method not found");
            return false;
        } catch (NoSuchFieldException unused3) {
            o.c("TECameraUtils", "mResults field not found");
            return false;
        } catch (IllegalAccessException unused4) {
            o.c("TECameraUtils", "illegal access");
            return false;
        } catch (InvocationTargetException unused5) {
            o.c("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            o.c("TECameraUtils", "unknown error");
            return false;
        }
    }

    public static boolean a(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Image image, byte[] bArr) {
        if (image == null) {
            o.d("TECameraUtils", "image is null");
            return false;
        } else if (image.getFormat() != 35) {
            o.d("TECameraUtils", "image format wrong: " + image.getFormat());
            return false;
        } else {
            int width = image.getWidth();
            int height = image.getHeight();
            if (bArr.length < ((width * height) * 3) / 2) {
                o.d("TECameraUtils", "output buffer size invalid...");
                return false;
            }
            Image.Plane[] planes = image.getPlanes();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i2 >= planes.length) {
                    return true;
                }
                Image.Plane plane = planes[i2];
                ByteBuffer buffer = plane.getBuffer();
                if (buffer == null) {
                    return false;
                }
                int rowStride = plane.getRowStride();
                if (rowStride <= 0) {
                    o.d("TECameraUtils", "imageToNV21, rowStride: ".concat(String.valueOf(width)));
                    rowStride = width;
                }
                int pixelStride = plane.getPixelStride();
                if (pixelStride <= 0) {
                    o.d("TECameraUtils", "imageToNV21, pixelStride: ".concat(String.valueOf(pixelStride)));
                } else {
                    i4 = pixelStride;
                }
                int i5 = height / i4;
                if (rowStride == width) {
                    buffer.get(bArr, i3, buffer.remaining());
                    i3 += rowStride * i5;
                } else {
                    for (int i6 = 0; i6 < i5 - 1; i6++) {
                        buffer.get(bArr, i3, rowStride);
                        i3 += width;
                    }
                    buffer.get(bArr, i3, Math.min(width, buffer.remaining()));
                    i3 += width;
                }
                i2 += 2;
            }
        }
    }

    static {
        Covode.recordClassIndex(38005);
        int i2 = 0;
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            a2 = a2.toUpperCase();
            String[] strArr = f61835f;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (a2.contains(strArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
            String[] strArr2 = f61836g;
            int length2 = strArr2.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (strArr2[i2].equals(str)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        o.a("TECameraUtils", "cpuHardware: " + a2 + ", isHighPerformanceCpu: " + f61834e + "model: " + str + ", isInAbortCapturesBlockList: " + f61837h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.m.a():java.lang.String");
    }

    public static int a(int i2) {
        return a(i2, -1000, 1000);
    }

    public static boolean a(Rect rect) {
        if (rect == null || rect.isEmpty() || rect.left < 0 || rect.right < 0 || rect.top < 0 || rect.bottom < 0) {
            return false;
        }
        return true;
    }

    public static int a(Context context) {
        int rotation = ((WindowManager) a(context, "window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return LiveFeedRefreshTimeSetting.DEFAULT;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    public static boolean b(Context context) {
        Object invoke;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            CameraManager cameraManager = (CameraManager) a(context, "camera");
            if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cameraManager.getClass(), "supportsCamera2ApiLocked", String.class);
                method.setAccessible(true);
                Object[] objArr = {"0"};
                Pair<Boolean, Object> a2 = a.a(method, new Object[]{cameraManager, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ttvecamera_TECameraUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    invoke = a2.second;
                } else {
                    invoke = method.invoke(cameraManager, objArr);
                    a.a(invoke, method, new Object[]{cameraManager, objArr}, "com_ss_android_ttvecamera_TECameraUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return ((Boolean) invoke).booleanValue();
            }
            Method declaredMethod = cameraManager.getClass().getDeclaredMethod("supportsCamera2ApiLocked", String.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(cameraManager, "0")).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    private static int[] b(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* class com.ss.android.ttvecamera.m.AnonymousClass3 */

            static {
                Covode.recordClassIndex(38008);
            }

            private int a(int[] iArr) {
                int i2;
                int i3;
                int[] iArr2 = iArr;
                if (iArr2[0] > iArr[0]) {
                    i2 = (iArr2[0] - iArr[0]) * 2;
                } else {
                    i2 = (iArr[0] - iArr2[0]) * 3;
                }
                if (iArr2[1] > iArr[1]) {
                    i3 = (iArr2[1] - iArr[1]) * 4;
                } else {
                    i3 = (iArr[1] - iArr2[1]) * 1;
                }
                return i2 + i3;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                return a(iArr) - a(iArr2);
            }
        });
    }

    private static TEFrameSizei b(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (tEFrameSizei3.f61374a > tEFrameSizei.f61374a && tEFrameSizei3.f61375b > tEFrameSizei.f61375b) {
                if (tEFrameSizei2 == null || tEFrameSizei3.f61374a < tEFrameSizei2.f61374a) {
                    tEFrameSizei2 = tEFrameSizei3;
                }
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    public static TEFrameSizei a(List<TEFrameSizei> list, float f2) {
        if (f2 <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f2, ((float) tEFrameSizei.f61374a) / ((float) tEFrameSizei.f61375b)) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = f61831b;
            if (arrayList.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                /* class com.ss.android.ttvecamera.m.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(38014);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                    TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                    TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                    return (tEFrameSizei4.f61374a * tEFrameSizei4.f61375b) - (tEFrameSizei3.f61374a * tEFrameSizei3.f61375b);
                }
            });
            return (TEFrameSizei) arrayList.get(0);
        }
        ArrayList<TEFrameSizei> arrayList4 = f61831b;
        if (arrayList2.contains(arrayList4.get(14))) {
            return arrayList4.get(14);
        }
        if (arrayList.contains(arrayList4.get(16))) {
            return arrayList4.get(16);
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(38007);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                return (tEFrameSizei4.f61374a * tEFrameSizei4.f61375b) - (tEFrameSizei3.f61374a * tEFrameSizei3.f61375b);
            }
        });
        return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
    }

    private static int[] c(int[] iArr, List<int[]> list) {
        int[] b2;
        if (list == null || list.size() <= 0) {
            o.b("TECameraUtils", "supported fpsRange is null,use [30,30]");
            return new int[]{30, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr2[1] == iArr2[0]) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<int[]>() {
                /* class com.ss.android.ttvecamera.m.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(38009);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                    return iArr2[1] - iArr[1];
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b2 = (int[]) it.next();
                if (((b2[0] >= 15 && b2[0] <= 30) || (b2[0] >= 15000 && b2[1] <= 30000)) && iArr[1] == b2[1]) {
                    break;
                }
            }
            o.b("TECameraUtils", "calculate fps range = [" + b2[0] + "," + b2[1] + "]");
            return b2;
        }
        b2 = b(iArr, list);
        o.b("TECameraUtils", "calculate fps range = [" + b2[0] + "," + b2[1] + "]");
        return b2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 155
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public static com.ss.android.ttvecamera.TEFrameSizei a(java.util.List<com.ss.android.ttvecamera.TEFrameSizei> r10, com.ss.android.ttvecamera.TEFrameSizei r11) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.m.a(java.util.List, com.ss.android.ttvecamera.TEFrameSizei):com.ss.android.ttvecamera.TEFrameSizei");
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(222);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
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
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(222);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static TEFrameSizei a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.f61374a * tEFrameSizei.f61375b != next.f61375b * tEFrameSizei.f61374a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* class com.ss.android.ttvecamera.m.AnonymousClass5 */

            static {
                Covode.recordClassIndex(38010);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                return (tEFrameSizei4.f61374a * tEFrameSizei4.f61375b) - (tEFrameSizei3.f61374a * tEFrameSizei3.f61375b);
            }
        });
        TEFrameSizei tEFrameSizei3 = null;
        for (TEFrameSizei tEFrameSizei4 : list) {
            if (tEFrameSizei3 != null) {
                if (tEFrameSizei4.f61374a == tEFrameSizei2.f61374a && tEFrameSizei4.f61375b == tEFrameSizei2.f61375b) {
                    return tEFrameSizei4;
                }
                if (tEFrameSizei4.f61375b <= tEFrameSizei2.f61375b || tEFrameSizei4.f61375b >= tEFrameSizei3.f61375b) {
                    if (tEFrameSizei4.f61375b < tEFrameSizei2.f61375b) {
                        return tEFrameSizei3;
                    }
                }
            }
            tEFrameSizei3 = tEFrameSizei4;
        }
        return tEFrameSizei3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r2 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        com.ss.android.ttvecamera.o.d("TECameraUtils", "unsupport high quality~~");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ttvecamera.TEFrameSizei a(java.util.List<com.ss.android.ttvecamera.TEFrameSizei> r4, com.ss.android.ttvecamera.TEFrameSizei r5, int r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.m.a(java.util.List, com.ss.android.ttvecamera.TEFrameSizei, int):com.ss.android.ttvecamera.TEFrameSizei");
    }
}
