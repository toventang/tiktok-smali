package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class cn {
    static {
        Covode.recordClassIndex(31707);
    }

    private static String a(Object obj) {
        String str;
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length()).append(name).append('@').append(hexString).toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb);
            if (valueOf.length() != 0) {
                str = "Exception during lenientFormat for ".concat(valueOf);
            } else {
                str = new String("Exception during lenientFormat for ");
            }
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", str, (Throwable) e2);
            String name2 = e2.getClass().getName();
            return new StringBuilder(String.valueOf(sb).length() + 9 + String.valueOf(name2).length()).append("<").append(sb).append(" threw ").append(name2).append(">").toString();
        }
    }

    public static String a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            objArr[i3] = a(objArr[i3]);
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i4 = 0;
        while (i2 < objArr.length && (indexOf = valueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) valueOf, i4, indexOf);
            sb.append(objArr[i2]);
            i4 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) valueOf, i4, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
