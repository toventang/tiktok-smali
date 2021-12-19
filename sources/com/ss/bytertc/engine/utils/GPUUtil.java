package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;

public class GPUUtil {
    private static String glRenderer = "unknown";
    private static String glVendor = "unknown";
    private static boolean initialized;

    public static int com_ss_bytertc_engine_utils_GPUUtil_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static String getGPURendererFallback() {
        return glRenderer;
    }

    static {
        Covode.recordClassIndex(101046);
    }

    public static String getGPURenderer() {
        if (!initialized) {
            Initialize();
        }
        return glRenderer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017c, code lost:
        if (r11 == false) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6 A[Catch:{ Exception -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Initialize() {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.utils.GPUUtil.Initialize():void");
    }
}
