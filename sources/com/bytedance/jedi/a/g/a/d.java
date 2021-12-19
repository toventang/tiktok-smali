package com.bytedance.jedi.a.g.a;

import com.bytedance.covode.number.Covode;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class d {
    static {
        Covode.recordClassIndex(23988);
    }

    private static String a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e2) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(String.valueOf(str)), (Throwable) e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    static String a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        int i2 = 0;
        do {
            objArr[0] = a(objArr[0]);
            i2++;
        } while (i2 <= 0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        int i3 = 0;
        int i4 = 0;
        do {
            int indexOf = valueOf.indexOf("%s", 0);
            if (indexOf == -1) {
                break;
            }
            sb.append((CharSequence) valueOf, 0, indexOf);
            i3++;
            sb.append(objArr[0]);
            i4 = indexOf + 2;
        } while (i3 <= 0);
        sb.append((CharSequence) valueOf, i4, valueOf.length());
        if (i3 <= 0) {
            sb.append(" [");
            sb.append(objArr[0]);
            sb.append(']');
        }
        return sb.toString();
    }
}
