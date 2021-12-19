package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.bf;
import com.google.android.play.core.d.q;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

public final class bw {

    /* renamed from: a  reason: collision with root package name */
    private static e f52933a;

    static {
        Covode.recordClassIndex(32715);
    }

    static long a(byte[] bArr, int i2) {
        return ((long) ((b(bArr, i2 + 2) << 16) | b(bArr, i2))) & 4294967295L;
    }

    static String a(List<File> list) {
        int read;
        MethodCollector.i(6904);
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    bf.a(th, th);
                }
            } while (read != -1);
            fileInputStream.close();
        }
        String encodeToString = Base64.encodeToString(instance.digest(), 11);
        MethodCollector.o(6904);
        return encodeToString;
        MethodCollector.o(6904);
        throw th;
    }

    public static boolean a(int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3;
    }

    static boolean a(int i2, int i3) {
        if (i2 == 5) {
            return i3 != 5;
        }
        if (i2 == 6) {
            return (i3 == 6 || i3 == 5) ? false : true;
        }
        if (i2 == 4) {
            return i3 != 4;
        }
        if (i2 == 3) {
            return i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    static int b(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static boolean b(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static boolean c(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    static synchronized e a(Context context) {
        e eVar;
        synchronized (bw.class) {
            MethodCollector.i(7006);
            if (f52933a == null) {
                ap apVar = new ap((byte) 0);
                apVar.f52801a = new da(q.a(context));
                an.a(apVar.f52801a, da.class);
                f52933a = new aq(apVar.f52801a);
            }
            eVar = f52933a;
            MethodCollector.o(7006);
        }
        return eVar;
    }
}
