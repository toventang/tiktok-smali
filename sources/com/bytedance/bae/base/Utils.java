package com.bytedance.bae.base;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public class Utils {
    private static Context mContext;

    static {
        Covode.recordClassIndex(15356);
    }

    public static String getAppPath() {
        BaeLogging.enableLogToDebugOutput(BaeLogging.Severity.LS_INFO);
        BaeLogging.i("Utils", "this is jni logging test");
        if (mContext == null) {
            mContext = ContextUtils.getApplicationContext();
        }
        return com_bytedance_bae_base_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(mContext, "").toString();
    }

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static File com_bytedance_bae_base_Utils_com_ss_android_ugc_aweme_lancet_ContextLancet_getExternalFilesDir(Context context, String str) {
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
