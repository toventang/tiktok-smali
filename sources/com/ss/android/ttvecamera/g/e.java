package com.ss.android.ttvecamera.g;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.j;
import com.ss.android.ttvecamera.m;
import com.ss.android.ttvecamera.o;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class e {

    /* renamed from: b  reason: collision with root package name */
    protected static String f61547b = "-1";

    /* renamed from: c  reason: collision with root package name */
    public static int f61548c = 1;

    /* renamed from: a  reason: collision with root package name */
    protected Context f61549a;

    public static String c() {
        return f61547b;
    }

    static {
        Covode.recordClassIndex(37883);
    }

    public boolean a() {
        if (!b().equals("0")) {
            return true;
        }
        return false;
    }

    public String b() {
        CameraManager cameraManager = (CameraManager) a(this.f61549a, "camera");
        try {
            return a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException | IllegalArgumentException e2) {
            e2.printStackTrace();
            return "0";
        }
    }

    public final boolean d() {
        boolean z = false;
        try {
            if (f61548c != 1) {
                long currentTimeMillis = System.currentTimeMillis();
                Class<?> cls = Class.forName("com.google.ar.core.ArCoreApk");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Object invoke2 = cls.getMethod("checkAvailability", Context.class).invoke(invoke, this.f61549a);
                o.a("TECameraHardware2Proxy", "cost: " + (System.currentTimeMillis() - currentTimeMillis) + ", ARCore availability " + invoke2.toString());
                z = "SUPPORTED_INSTALLED".equals(invoke2.toString());
            }
            j.a("te_record_camera_is_support_arcore", String.valueOf(z));
            return z;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e2.printStackTrace();
            j.a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            j.a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            j.a("te_record_camera_is_support_arcore", "false");
            return false;
        } catch (Throwable unused) {
            j.a("te_record_camera_is_support_arcore", "false");
            return false;
        }
    }

    public e(Context context) {
        this.f61549a = context;
    }

    public static boolean b(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    public static boolean d(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        for (int i2 : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i2 == 11) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean f(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public static float a(CameraCharacteristics cameraCharacteristics) {
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format((double) ((((float) (rect.width() - ((int) (((float) rect.width()) / floatValue)))) / floatValue) / ((float) rect.width()))).trim()).floatValue();
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return 0.01f;
        }
    }

    public boolean c(CameraCharacteristics cameraCharacteristics) {
        int i2;
        int[] iArr;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (iArr2[i3] == 1) {
                    i2 |= 2;
                    break;
                } else {
                    i3++;
                }
            }
        }
        o.a("TECameraHardware2Proxy", "Stabilization type: " + Integer.toBinaryString(i2));
        j.a("te_record_camera_stabilization", (long) i2);
        if (i2 > 0) {
            return true;
        }
        return false;
    }

    public void a(int i2, CameraManager cameraManager) {
        try {
            f61547b = a(cameraManager.getCameraIdList(), cameraManager);
            o.a("TECameraHardware2Proxy", "fillWideCameraID mWideCameraID = " + f61547b);
        } catch (CameraAccessException | IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    public static String b(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f2 = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    if (fArr[0] > f2) {
                        f2 = fArr[0];
                        str = str2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public static e a(Context context, int i2) {
        e eVar;
        MethodCollector.i(204);
        o.a("TECameraHardware2Proxy", "getDeviceProxy, cameraType: ".concat(String.valueOf(i2)));
        f61548c = i2;
        synchronized (e.class) {
            if (i2 == 3) {
                try {
                    eVar = new g(context);
                } catch (Throwable th) {
                    MethodCollector.o(204);
                    throw th;
                }
            } else if (i2 == 4) {
                eVar = new b(context);
            } else if (i2 == 6) {
                eVar = new a(context);
            } else if (i2 == 8) {
                eVar = new h(context);
            } else if (d.a()) {
                eVar = new j(context);
            } else {
                String lowerCase = Build.HARDWARE.toLowerCase();
                if (lowerCase.equals("qcom") || lowerCase.matches("msm[0-9]*")) {
                    o.b("TECameraHardware2", "QCOM Platform.");
                    eVar = new i(context);
                } else if (Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
                    o.b("TECameraHardware2", "MTK Platform.");
                    eVar = new f(context);
                } else {
                    String lowerCase2 = Build.BRAND.toLowerCase();
                    if (lowerCase2.equals("huawei") || lowerCase2.equals("honor")) {
                        eVar = new c(context);
                    } else {
                        o.d("TECameraHardware2Proxy", "Unknown platform");
                        eVar = new e(context);
                    }
                }
            }
        }
        MethodCollector.o(204);
        return eVar;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(210);
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
                    MethodCollector.o(210);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String a(String[] strArr, CameraManager cameraManager) {
        float[] fArr;
        String str = "0";
        try {
            float f2 = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if ((num == null || num.intValue() != 0) && (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) != null && fArr.length > 0) {
                    float f3 = fArr[0];
                    if (f3 != -1.0f && f3 <= f2) {
                        str = str2;
                        f2 = f3;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public static float a(CameraCharacteristics cameraCharacteristics, int i2, float f2) {
        Float f3 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f3 == null) {
            return 0.0f;
        }
        float floatValue = f3.floatValue();
        if (f2 != -1.0f) {
            return floatValue * f2;
        }
        if (i2 != 6) {
            return floatValue / 2.0f;
        }
        return floatValue;
    }

    public int a(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            o.a("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                o.a("TECameraHardware2Proxy", "EIS mode: ".concat(String.valueOf(i2)));
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    o.a("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            o.a("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                o.a("TECameraHardware2Proxy", "OIS mode: ".concat(String.valueOf(i3)));
                if (i3 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    o.a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
            return -200;
        }
        o.a("TECameraHardware2Proxy", "Don't supported OIS");
        return -200;
    }

    public static TEFrameRateRange a(CameraCharacteristics cameraCharacteristics, int i2, int i3, int i4, int i5) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i2, i3);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i6 = tEFrameRateRange.f61373c;
        int i7 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i6, ((Integer) range.getUpper()).intValue() * i6};
            arrayList.add(iArr);
            if (i7 < iArr[1]) {
                i7 = iArr[1];
            }
        }
        j.a("te_record_camera_max_fps", (long) i7);
        int[] a2 = m.a(i4, i5, tEFrameRateRange.a(), arrayList);
        tEFrameRateRange.f61371a = a2[0];
        tEFrameRateRange.f61372b = a2[1];
        return tEFrameRateRange;
    }
}
