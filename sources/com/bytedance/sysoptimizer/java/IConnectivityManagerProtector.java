package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class IConnectivityManagerProtector {
    private static final List<String> PROTECTED_METHODS = Arrays.asList("getNetworkCapabilities", "getAllNetworks", "getLinkProperties", "getLinkPropertiesForType");
    private static boolean sIsInit;

    static {
        Covode.recordClassIndex(27022);
    }

    public static Context com_bytedance_sysoptimizer_java_IConnectivityManagerProtector_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void install(Context context) {
        if (!sIsInit && context != null) {
            sIsInit = BinderServiceWrapperProtector.install(com_bytedance_sysoptimizer_java_IConnectivityManagerProtector_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context), "connectivity", PROTECTED_METHODS, "ICMP", new BinderServiceWrapperProtector.AdminResult() {
                /* class com.bytedance.sysoptimizer.java.IConnectivityManagerProtector.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27023);
                }

                public static int com_bytedance_sysoptimizer_java_IConnectivityManagerProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                    return 0;
                }

                @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
                public final Object getDefaultResult(Object obj, Method method, Object[] objArr) {
                    if (Build.VERSION.SDK_INT < 21) {
                        com_bytedance_sysoptimizer_java_IConnectivityManagerProtector$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("ICMP", "it shouldn't reach here");
                        return null;
                    }
                    String name = method.getName();
                    if (!"getNetworkCapabilities".equals(name) && !"getAllNetworks".equals(name) && !"getLinkProperties".equals(name)) {
                        return new Object();
                    }
                    return null;
                }
            });
        }
    }
}
