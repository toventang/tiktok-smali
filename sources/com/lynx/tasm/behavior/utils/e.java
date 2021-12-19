package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(35237);
    }

    public static String a(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i3 = 0;
        while (i3 < length) {
            if (str.charAt(i3) != '\\' || (i2 = i3 + 1) >= length) {
                sb.append(str.charAt(i3));
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (i2 < length && i2 < i3 + 5) {
                    char charAt = str.charAt(i2);
                    if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                        sb2.append(charAt);
                        i2++;
                    }
                }
                try {
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    i3 += sb2.length();
                } catch (Exception unused) {
                    sb.append(str.charAt(i3));
                }
            }
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b0, code lost:
        if (r6.equals("bdquo") == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        r1 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 834
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.utils.e.b(java.lang.String):java.lang.String");
    }
}
