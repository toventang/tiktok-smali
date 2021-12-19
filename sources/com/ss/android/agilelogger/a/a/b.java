package com.ss.android.agilelogger.a.a;

import com.bytedance.covode.number.Covode;

public final class b implements a {
    static {
        Covode.recordClassIndex(36533);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split("\n");
        int length = split.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append("\n");
            }
            sb.append((char) 9553).append(split[i2]);
        }
        return sb.toString();
    }

    @Override // com.ss.android.agilelogger.a.b
    public final /* synthetic */ String a(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i2 = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i2] = str;
                i2++;
            }
        }
        if (i2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════\n");
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(a(strArr2[i3]));
            if (i3 != i2 - 1) {
                sb.append("\n╟───────────────────────────────────────────────────────────────────────────────────────────────────\n");
            } else {
                sb.append("\n╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
