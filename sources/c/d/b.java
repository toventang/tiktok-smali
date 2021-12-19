package c.d;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class b {
    static {
        Covode.recordClassIndex(1933);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        char c2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c3 = charArray[i2];
            if (c3 != '/' || c2 != '/') {
                charArray[i3] = c3;
                i3++;
            }
            i2++;
            c2 = c3;
        }
        if (c2 == '/' && length > 1) {
            i3--;
        }
        if (i3 != length) {
            return new String(charArray, 0, i3);
        }
        return str;
    }

    public static Bundle a(String str, String[] strArr, int i2, int i3) {
        Bundle bundle = new Bundle();
        if (b()) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            if (b() && i2 > 0) {
                bundle.putString("android:query-arg-sql-limit", i2 + " offset " + i3);
            }
        }
        return bundle;
    }
}
