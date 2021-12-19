package com.bytedance.router.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.c.b;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ClassUtils {
    private static final String SECONDARY_FOLDER_NAME = ("code_cache" + File.separator + "secondary-dexes");

    public static int com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(26203);
    }

    private static boolean isYunOS() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            if ((property2 == null || !property2.toLowerCase().contains("lemur")) && (property == null || property.trim().length() <= 0)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r0 <= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (java.lang.Integer.valueOf(java.lang.System.getProperty("ro.build.version.sdk")).intValue() >= 21) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isVMMultidexCapable() {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.util.ClassUtils.isVMMultidexCapable():boolean");
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return d.a(context, "multidex.version", 4);
    }

    public static List<String> getSourcePaths(Context context) {
        ApplicationInfo com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo = com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 0);
        File file = new File(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!isVMMultidexCapable()) {
            int i2 = getMultiDexPreferences(context).getInt("dex.number", 1);
            File file2 = new File(com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            for (int i3 = 2; i3 <= i2; i3++) {
                File file3 = new File(file2, str + i3 + ".zip");
                if (file3.isFile()) {
                    arrayList.add(file3.getAbsolutePath());
                } else {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
            }
        }
        return arrayList;
    }

    public static List<String> getFileNameByPackageName(Context context, String str) {
        DexFile dexFile;
        MethodCollector.i(14431);
        ArrayList arrayList = new ArrayList();
        for (String str2 : getSourcePaths(context)) {
            if (str2.endsWith(".zip")) {
                dexFile = DexFile.loadDex(str2, str2 + ".tmp", 0);
            } else {
                dexFile = new DexFile(str2);
            }
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                if (nextElement.contains(str)) {
                    arrayList.add(nextElement);
                }
            }
        }
        com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d("galaxy", "Filter " + arrayList.size() + " classes by packageName <" + str + ">");
        MethodCollector.o(14431);
        return arrayList;
    }

    public static ApplicationInfo com_bytedance_router_util_ClassUtils_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return b.f107191a;
    }
}
