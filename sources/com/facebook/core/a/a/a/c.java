package com.facebook.core.a.a.a;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class c {
    static {
        Covode.recordClassIndex(28697);
    }

    private static String a(int i2) {
        return "#" + Integer.toHexString(i2);
    }

    public static String a(Resources resources, int i2) {
        String str;
        if (resources == null) {
            try {
                return a(i2);
            } catch (Resources.NotFoundException unused) {
                return a(i2);
            }
        } else {
            String str2 = "";
            if (((i2 >>> 24) & 255) != 127) {
                str2 = resources.getResourcePackageName(i2);
                str = ":";
            } else {
                str = str2;
            }
            String resourceTypeName = resources.getResourceTypeName(i2);
            String resourceEntryName = resources.getResourceEntryName(i2);
            StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
            sb.append("@");
            sb.append(str2);
            sb.append(str);
            sb.append(resourceTypeName);
            sb.append("/");
            sb.append(resourceEntryName);
            return sb.toString();
        }
    }
}
