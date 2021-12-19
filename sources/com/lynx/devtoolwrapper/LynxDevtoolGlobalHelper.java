package com.lynx.devtoolwrapper;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.utils.ic;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LynxDevtoolGlobalHelper {
    private Object bridge;
    private Method enableTelemetryDebug;
    private Map<String, String> mAppInfo;
    private Context mContext;
    private Method prepareRemoteDebug;
    private Method registerCardListener;
    private boolean remoteDebugAvailable;
    private Method setAppInfo;
    private Method setContext;
    private Method shouldPrepareRemoteDebug;
    private Method showDebugView;
    private boolean telemetryAvailable;

    /* renamed from: com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(34712);
        }
    }

    static {
        Covode.recordClassIndex(34711);
    }

    private static Object com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static LynxDevtoolGlobalHelper getInstance() {
        return a.f55437a;
    }

    public boolean isRemoteDebugAvailable() {
        return this.remoteDebugAvailable;
    }

    public boolean isTelemetryAvailable() {
        return this.telemetryAvailable;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final LynxDevtoolGlobalHelper f55437a = new LynxDevtoolGlobalHelper(null);

        static {
            Covode.recordClassIndex(34713);
        }
    }

    private LynxDevtoolGlobalHelper() {
        HashMap hashMap = new HashMap();
        this.mAppInfo = hashMap;
        LynxEnv.b();
        hashMap.put("sdkVersion", "2.1.5-rc.33-cxxshared");
        initTelemetry();
    }

    private void initTelemetry() {
        try {
            this.enableTelemetryDebug = Class.forName("com.lynx.devtool.helper.TelemetryConnector").getMethod("enableTelemetryDebug", new Class[0]);
            this.telemetryAvailable = true;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }

    public void enableTelemetryDebug() {
        if (this.telemetryAvailable) {
            try {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.enableTelemetryDebug, null, new Object[0]);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean initRemoteDebugIfNecessary() {
        if (!LynxEnv.b().f()) {
            Context context = this.mContext;
            if (context != null) {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_show(Toast.makeText(context, "Lynx initialization not finished!", 0));
            }
            LLog.a(5, "LynxDevtoolGlobalHelper", "liblynx.so not loaded!");
            return false;
        } else if (this.remoteDebugAvailable) {
            return true;
        } else {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxGlobalDebugBridge");
                Method method = cls.getMethod("getInstance", new Class[0]);
                this.shouldPrepareRemoteDebug = cls.getMethod("shouldPrepareRemoteDebug", String.class);
                this.prepareRemoteDebug = cls.getMethod("prepareRemoteDebug", String.class);
                this.setContext = cls.getMethod("setContext", Context.class);
                this.showDebugView = cls.getDeclaredMethod("showDebugView", ViewGroup.class);
                this.registerCardListener = cls.getDeclaredMethod("registerCardListener", e.class);
                this.setAppInfo = cls.getDeclaredMethod("setAppInfo", Context.class, Map.class);
                this.bridge = method.invoke(null, new Object[0]);
                this.remoteDebugAvailable = true;
            } catch (ClassNotFoundException unused) {
                LLog.a(5, "LynxDevtoolGlobalHelper", "Could not find LynxGlobalDebugBridge. Shall ignore this exception if expected.");
            } catch (NoSuchMethodException e2) {
                LLog.a(5, "LynxDevtoolGlobalHelper", e2.toString());
            } catch (IllegalAccessException e3) {
                LLog.a(5, "LynxDevtoolGlobalHelper", e3.toString());
            } catch (InvocationTargetException e4) {
                LLog.a(5, "LynxDevtoolGlobalHelper", e4.toString());
            }
            return this.remoteDebugAvailable;
        }
    }

    /* synthetic */ LynxDevtoolGlobalHelper(AnonymousClass1 r1) {
        this();
    }

    public static void com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_show(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    public void registerCardListener(e eVar) {
        if (initRemoteDebugIfNecessary()) {
            try {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.registerCardListener, this.bridge, new Object[]{eVar});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void showDebugView(ViewGroup viewGroup) {
        if (initRemoteDebugIfNecessary()) {
            try {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.showDebugView, this.bridge, new Object[]{viewGroup});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
        if (initRemoteDebugIfNecessary()) {
            try {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.setContext, this.bridge, new Object[]{context});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public boolean shouldPrepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        try {
            return ((Boolean) com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.shouldPrepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public boolean prepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        if (!LynxEnv.b().f55537g) {
            Context context = this.mContext;
            if (context != null) {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_show(Toast.makeText(context, "Debugging not supported in this package", 0));
            }
            LLog.a(5, "LynxDevtoolGlobalHelper", "Debugging not supported in this package");
            return false;
        } else if (!LynxEnv.b().d()) {
            Context context2 = this.mContext;
            if (context2 != null) {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_show(Toast.makeText(context2, "Devtool not enabled, turn on the switch!", 0));
            }
            LLog.a(5, "LynxDevtoolGlobalHelper", "Devtool not enabled, turn on the switch!");
            return false;
        } else {
            setAppInfo(this.mContext, (Map<String, String>) null);
            try {
                return ((Boolean) com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.prepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return false;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return false;
            }
        }
    }

    public void setAppInfo(String str, String str2) {
        setAppInfo(null, str, str2);
    }

    public void setAppInfo(Context context, Map<String, String> map) {
        if (map != null) {
            this.mAppInfo.putAll(map);
        }
        if (initRemoteDebugIfNecessary()) {
            try {
                com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(this.setAppInfo, this.bridge, new Object[]{context, this.mAppInfo});
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void setAppInfo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App", str);
        hashMap.put("AppVersion", str2);
        setAppInfo(context, hashMap);
    }
}
