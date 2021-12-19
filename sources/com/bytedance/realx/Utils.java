package com.bytedance.realx;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.realx.base.RXLogging;
import com.ss.android.ugc.aweme.lancet.d;
import dalvik.system.PathClassLoader;
import java.io.File;
import org.webrtc.ContextUtils;

public class Utils {
    private static Context mContext;

    static {
        Covode.recordClassIndex(25930);
    }

    public static int com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static String getAppPath() {
        RXLogging.enableLogToDebugOutput(RXLogging.Severity.LS_INFO);
        RXLogging.i("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(mContext, "").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static String getAppLibPath(String str) {
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String findLibrary = ((PathClassLoader) mContext.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                return "";
            }
            return findLibrary;
        } catch (Exception e2) {
            RXLogging.e("realx Utils", "getAppLibPath Exception : " + e2.getMessage());
            com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_LogLancet_e("realx Utils", "getAppLibPath Exception : " + e2.getMessage());
            throw e2;
        }
    }

    public static File com_bytedance_realx_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }
}
