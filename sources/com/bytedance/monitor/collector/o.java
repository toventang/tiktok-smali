package com.bytedance.monitor.collector;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f41576a;

    static {
        Covode.recordClassIndex(25432);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i2++;
            sb.append("\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
            if (i2 > 40) {
                break;
            }
        }
        return sb.toString();
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i2++;
            sb.append("\\tat " + stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\\n");
            if (i2 > 40) {
                break;
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            if (split.length == 2) {
                str2 = split[1];
            } else {
                str2 = "";
            }
            if (str.contains("{") && str.contains("}")) {
                String str3 = str.split("\\{")[0];
                try {
                    str = str3 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str3;
                }
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str2;
        } catch (Throwable unused2) {
            return str;
        }
    }
}
