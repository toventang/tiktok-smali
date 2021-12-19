package com.bytedance.mobsec.matrix.net;

import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ms.bd.o.b;
import ms.bd.o.h;

public abstract class a extends b.a {
    static {
        Covode.recordClassIndex(25334);
    }

    protected static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                h.a(16777217, 0, 0, "685339", new byte[]{42, 57, 121, 68, 5});
            }
        }
    }

    protected static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                h.a(16777217, 0, 0, "dd5cf3", new byte[]{120, 101, 121, 20, 86});
            }
        }
    }

    public abstract Object[] a(String str, String str2);

    public abstract Object[] a(String str, byte[] bArr, String str2);

    public abstract Object[] b(String str, String str2);

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.bd.o.b.a
    public final Object a(int i2, int i3, long j2, String str, Object obj) {
        boolean z;
        String[] strArr = {h.a(16777217, 0, 0, "4576bb", new byte[]{36, 57, 64, 80, 82, 124, 51, 90, 118, 99, 55, 58, 77, 81, 78, 124, 56, 26, 40, 79, 11, 3, 97, 112, 115, 80, 3})};
        try {
            Context context = ms.bd.o.a.f159493a.f159494b;
            int i4 = 0;
            while (true) {
                if (i4 <= 0) {
                    if (context.checkPermission(strArr[0], Process.myPid(), Process.myUid()) != 0) {
                        break;
                    }
                    i4++;
                } else {
                    z = true;
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        z = false;
        if (!z) {
            return null;
        }
        switch (i2) {
            case 196609:
                Object[] objArr = (Object[]) obj;
                return a(str, (byte[]) objArr[0], (String) objArr[1]);
            case 196610:
                return a(str, (String) obj);
            case 196611:
                return b(str, (String) obj);
            default:
                return super.a(i2, i3, j2, str, obj);
        }
    }
}
