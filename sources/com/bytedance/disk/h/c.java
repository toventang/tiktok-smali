package com.bytedance.disk.h;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.c.a.a;
import com.bytedance.v.a.b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public final class c {
    static {
        Covode.recordClassIndex(16817);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static String c(String str) {
        if (TextUtils.equals(str, "valid_path")) {
            return str;
        }
        return f(str);
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                return 2;
            }
            if (file.isFile()) {
                return 1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long d(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.getUsableSpace();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new File(str).getCanonicalPath();
        } catch (IOException unused) {
            return str;
        }
    }

    private static long a(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (int i2 = 0; i2 < listFiles.length; i2++) {
            if (listFiles[i2].isDirectory()) {
                length = a(listFiles[i2]);
            } else {
                length = listFiles[i2].length();
            }
            j2 += length;
        }
        return j2;
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return 0;
            }
            if (file.isDirectory()) {
                return a(file);
            }
            return file.length();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Iterator<String> it = b.b(null).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                String c2 = b.c();
                if (str.startsWith(c2)) {
                    return str;
                }
                return c2 + str.substring(next.length());
            }
        }
        Iterator<String> it2 = b.c(null).iterator();
        while (it2.hasNext()) {
            String next2 = it2.next();
            if (str.startsWith(next2)) {
                String a2 = b.a();
                if (str.startsWith(a2)) {
                    return str;
                }
                return a2 + str.substring(next2.length());
            }
        }
        return str;
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i2 != 0 && i2 != 1) {
            return str;
        }
        if (i2 == 0) {
            a aVar = new a("path");
            byte[] a2 = aVar.a(Base64.decode(str, 0));
            aVar.a();
            return new String(a2).trim();
        }
        a aVar2 = new a("path");
        byte[] a3 = aVar2.a(str.getBytes());
        aVar2.a();
        return Base64.encodeToString(a3, 0).trim();
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length - length2 < 0) {
            return false;
        }
        int i2 = length2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2--;
            if (i2 >= 0) {
                int i5 = i3 + 1;
                int i6 = i4 + 1;
                if (str.charAt(i3) != str2.charAt(i4)) {
                    return false;
                }
                i3 = i5;
                i4 = i6;
            } else if (length == length2 || str.charAt(i3) == '/') {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean a(String str, boolean z) {
        if ((!z || new File(str).exists()) && !TextUtils.isEmpty(str) && str.startsWith("/")) {
            Iterator<String> it = b.b(null).iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
            Iterator<String> it2 = b.c(null).iterator();
            while (it2.hasNext()) {
                if (str.startsWith(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
