package com.ss.android.ugc.effectmanager.common;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.StringUtils;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.regex.Pattern;

public class ModelNameProcessor {
    static {
        Covode.recordClassIndex(95246);
    }

    private static boolean isVersionString(String str) {
        return Pattern.matches("^[0-9(.|_)]+", str);
    }

    public static String getMD5OfModel(String str) {
        if (!str.contains("md5")) {
            return null;
        }
        try {
            return str.substring(str.indexOf("md5") + 3, str.lastIndexOf("_model"));
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getVersionIndex(String str) {
        if (str.contains("_size")) {
            return str.lastIndexOf("_size");
        }
        return StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
    }

    public static String getVersionOfModel(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, lastIndexOfRegex);
        }
        return "1.0";
    }

    public static int getSizeOfModel(String str) {
        int lastIndexOfRegex;
        if (!str.contains("size")) {
            return 0;
        }
        int lastIndexOf = str.lastIndexOf("size");
        if (str.contains("md5")) {
            lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "_md5");
        } else {
            lastIndexOfRegex = StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$");
        }
        if (lastIndexOf >= lastIndexOfRegex) {
            return -1;
        }
        try {
            return Integer.parseInt(str.substring(lastIndexOf + 4, lastIndexOfRegex));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String getFullNameFromModelInfo(ModelInfo modelInfo) {
        return modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + modelInfo.getMD5() + ".model";
    }

    public static String getNameOfModel(String str) {
        try {
            int lastIndexOf = str.lastIndexOf("/");
            int lastIndexOf2 = str.lastIndexOf("_v");
            int i2 = lastIndexOf + 1;
            if (StringUtils.substringSafetyCheck(str, i2, lastIndexOf2)) {
                int length = str.length();
                int versionIndex = getVersionIndex(str);
                if (versionIndex > 0) {
                    length = versionIndex;
                }
                if (!isVersionString(str.substring(lastIndexOf2 + 2, length))) {
                    return str;
                }
                return str.substring(i2, lastIndexOf2);
            }
            int min = Math.min(StringExtension.lastIndexOfRegex(str, "\\.model|_model|\\.dat$"), str.length());
            if (min > 0) {
                return str.substring(i2, min);
            }
            return str.substring(i2, str.length());
        } catch (Exception e2) {
            EPLog.e("ModelNameProcessor", "getNameOfModel failed!", e2);
            return str;
        }
    }

    public static boolean isBigVersionEquals(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            try {
                return TextUtils.equals(str.substring(0, str.indexOf(".")), str2.substring(0, str.indexOf(".")));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
