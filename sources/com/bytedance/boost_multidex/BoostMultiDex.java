package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.StringTokenizer;

public class BoostMultiDex {
    static {
        Covode.recordClassIndex(15629);
    }

    public static Result install(Context context) {
        return install(context, null);
    }

    public static Result install(Context context, Monitor monitor) {
        Monitor.init(monitor);
        Monitor monitor2 = Monitor.get();
        monitor2.logInfo("BoostMultiDex is installing, version is 1.0.3");
        if (isVMCapable(System.getProperty("java.vm.version"))) {
            monitor2.logInfo("BoostMultiDex support library is disabled for VM capable");
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        Result result = Result.get();
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                File file = new File(applicationInfo.sourceDir);
                String processName = monitor2.getProcessName();
                if (processName == null) {
                    processName = Utility.getCurProcessName(context);
                }
                if (Utility.isOptimizeProcess(processName)) {
                    new DexInstallProcessor().doInstallationInOptProcess(context, file);
                    return null;
                }
                new DexInstallProcessor().doInstallation(context, file, result);
                monitor2.logInfo("install done");
                return result;
            }
            throw new RuntimeException("ApplicationInfo is NULL.");
        } catch (Throwable th) {
            monitor2.logError("BoostMultiDex installation failure", th);
            result.setFatalThrowable(th);
        }
    }

    public static boolean isOptimizeProcess(String str) {
        return Utility.isOptimizeProcess(str);
    }

    private static boolean isVMCapable(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        Monitor.get().logInfo("VM with version " + str + (z ? " has support" : " does not have support"));
        return z;
    }
}
