package com.bytedance.helios.nativeaudio;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(17855);
    }

    public static String a(String str) {
        String[] split = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (!str2.contains("libart.so")) {
                sb.append(str2).append("\n");
            }
        }
        return sb.toString();
    }
}
