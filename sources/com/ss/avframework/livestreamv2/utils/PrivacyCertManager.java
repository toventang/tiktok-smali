package com.ss.avframework.livestreamv2.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.l;
import com.ss.avframework.utils.AVLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class PrivacyCertManager {
    private static int classAvailable = -1;
    public static Class<?> clazzPrivacyCert;
    public static String dataTypeAudio;
    public static String dataTypeVideo;
    private static PrivacyCertManager instance;
    public static Method methodCheckCert;
    private static Method methodConnect;
    private static Method methodDisconnect;
    private static Method methodSwitchCamera;
    private ThreadLocal<CertUnit>[] certList = new ThreadLocal[2];
    private final Object certListFence = new Object();

    private static Object com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static class CertUnit {
        private static int isPrivacyCertAvailable = -1;
        public Object cert;
        public int certType;
        public String methodName;

        private static Object com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        static {
            Covode.recordClassIndex(100493);
        }

        public void check() {
            int i2 = isPrivacyCertAvailable;
            if (i2 != 0) {
                if (i2 == -1) {
                    try {
                        Class<?> cls = Class.forName("com.bytedance.bpea.entry.auth.privacy.PrivacyCertAuthEntry");
                        if (PrivacyCertManager.clazzPrivacyCert == null) {
                            PrivacyCertManager.clazzPrivacyCert = Class.forName("com.bytedance.bpea.basics.PrivacyCert");
                        }
                        if (PrivacyCertManager.methodCheckCert == null) {
                            PrivacyCertManager.methodCheckCert = cls.getMethod("checkSDKCert", PrivacyCertManager.clazzPrivacyCert, String[].class, String.class, String.class);
                        }
                        if (PrivacyCertManager.dataTypeAudio == null || PrivacyCertManager.dataTypeVideo == null) {
                            Class<?> cls2 = Class.forName("com.bytedance.bpea.entry.common.DataType");
                            Field declaredField = cls2.getDeclaredField("AUDIO");
                            Field declaredField2 = cls2.getDeclaredField("VIDEO");
                            PrivacyCertManager.dataTypeAudio = (String) declaredField.get(cls2);
                            PrivacyCertManager.dataTypeVideo = (String) declaredField2.get(cls2);
                        }
                        isPrivacyCertAvailable = 1;
                    } catch (ClassNotFoundException e2) {
                        e2.printStackTrace();
                        isPrivacyCertAvailable = 0;
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                        isPrivacyCertAvailable = 0;
                    }
                }
                String dataType = getDataType(this.certType);
                if (isPrivacyCertAvailable > 0 && PrivacyCertManager.methodCheckCert != null && dataType != null) {
                    if (this.cert == null || PrivacyCertManager.clazzPrivacyCert.isInstance(this.cert)) {
                        AVLog.ioi("PrivacyCertManager", "checkSDKCert(" + this.cert + ", \"" + dataType + "\", \"LiveCore\", \"" + this.methodName + "\")");
                        com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(PrivacyCertManager.methodCheckCert, null, new Object[]{this.cert, new String[]{dataType}, "LiveCore", this.methodName});
                    }
                }
            }
        }

        private String getDataType(int i2) {
            if (i2 == 0) {
                return PrivacyCertManager.dataTypeVideo;
            }
            if (i2 != 1) {
                return null;
            }
            return PrivacyCertManager.dataTypeAudio;
        }

        public CertUnit(int i2, Object obj, String str) {
            this.certType = i2;
            this.cert = obj;
            this.methodName = str;
        }
    }

    static {
        Covode.recordClassIndex(100492);
    }

    public static synchronized PrivacyCertManager getInstance() {
        PrivacyCertManager privacyCertManager;
        synchronized (PrivacyCertManager.class) {
            MethodCollector.i(13792);
            if (instance == null) {
                instance = new PrivacyCertManager();
            }
            privacyCertManager = instance;
            MethodCollector.o(13792);
        }
        return privacyCertManager;
    }

    public static class RunnableWithCert implements Runnable {
        private HashMap<Integer, CertUnit> certMap = new HashMap<>();
        private Runnable runnable;

        static {
            Covode.recordClassIndex(100494);
        }

        public void run() {
            for (Map.Entry<Integer, CertUnit> entry : this.certMap.entrySet()) {
                PrivacyCertManager.getInstance().saveCert(entry.getKey().intValue(), entry.getValue());
            }
            Runnable runnable2 = this.runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
            for (Integer num : this.certMap.keySet()) {
                PrivacyCertManager.getInstance().popCert(num.intValue());
            }
        }

        public RunnableWithCert(Runnable runnable2, int[] iArr) {
            this.runnable = runnable2;
            for (int i2 : iArr) {
                if (i2 >= 0 && i2 < 2) {
                    this.certMap.put(Integer.valueOf(i2), PrivacyCertManager.getInstance().popCert(i2));
                }
            }
        }
    }

    private static void getClasses() {
        try {
            if (classAvailable == -1) {
                if (clazzPrivacyCert == null) {
                    clazzPrivacyCert = Class.forName("com.bytedance.bpea.basics.PrivacyCert");
                }
                if (methodConnect == null) {
                    methodConnect = TECameraCapture.class.getMethod("connect", l.class, clazzPrivacyCert);
                }
                if (methodDisconnect == null) {
                    methodDisconnect = TECameraCapture.class.getMethod("disConnect", clazzPrivacyCert);
                }
                if (methodSwitchCamera == null) {
                    methodSwitchCamera = TECameraCapture.class.getMethod("switchCamera", Integer.TYPE, clazzPrivacyCert);
                }
                classAvailable = 1;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            classAvailable = 0;
        }
    }

    public CertUnit popCert(int i2) {
        MethodCollector.i(13846);
        CertUnit certUnit = null;
        if (i2 < 0 || i2 >= 2) {
            MethodCollector.o(13846);
            return null;
        }
        synchronized (this.certListFence) {
            try {
                ThreadLocal<CertUnit>[] threadLocalArr = this.certList;
                if (threadLocalArr[i2] != null) {
                    this.certList[i2].set(null);
                    certUnit = threadLocalArr[i2].get();
                }
            } finally {
                MethodCollector.o(13846);
            }
        }
        return certUnit;
    }

    public static void cameraDisconnectWithCert(TECameraCapture tECameraCapture) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.disConnect with PrivacyCert");
                    com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(methodDisconnect, tECameraCapture, new Object[]{popCert.cert});
                    return;
                }
            } catch (Exception e2) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e2);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e2);
            }
        }
        tECameraCapture.disConnect();
    }

    public static int cameraConnectWithCert(TECameraCapture tECameraCapture, l lVar) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.connect with PrivacyCert");
                    return ((Integer) com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(methodConnect, tECameraCapture, new Object[]{lVar, popCert.cert})).intValue();
                }
            } catch (Exception e2) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraConnectWithCert failed", e2);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraConnectWithCert failed", e2);
                return -1128616532;
            }
        }
        return tECameraCapture.connect(lVar);
    }

    public static void switchCameraWithCert(TECameraCapture tECameraCapture, int i2) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.switchCamera with PrivacyCert");
                    com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(methodSwitchCamera, tECameraCapture, new Object[]{Integer.valueOf(i2), popCert.cert});
                    return;
                }
            } catch (Exception e2) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "switchCameraWithCert failed", e2);
                AVLog.logKibana(6, "PrivacyCertManager", "switchCameraWithCert failed", e2);
                return;
            }
        }
        tECameraCapture.switchCamera(i2);
    }

    public void saveCert(int i2, CertUnit certUnit) {
        MethodCollector.i(13836);
        if (i2 < 0 || i2 >= 2) {
            MethodCollector.o(13836);
            return;
        }
        synchronized (this.certListFence) {
            try {
                ThreadLocal<CertUnit>[] threadLocalArr = this.certList;
                if (!(threadLocalArr[i2] == null || threadLocalArr[i2].get() == null)) {
                    AVLog.ioe("PrivacyCertManager", "save cert while it's not emptied before.");
                    AVLog.logKibana(6, "PrivacyCertManager", "save cert while it's not emptied before.", new Throwable());
                }
                ThreadLocal<CertUnit>[] threadLocalArr2 = this.certList;
                if (threadLocalArr2[i2] == null) {
                    threadLocalArr2[i2] = new ThreadLocal<>();
                }
                this.certList[i2].set(certUnit);
            } finally {
                MethodCollector.o(13836);
            }
        }
    }

    public void saveCert(int i2, Object obj, String str) {
        saveCert(i2, new CertUnit(i2, obj, str));
    }
}
