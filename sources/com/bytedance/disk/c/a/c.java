package com.bytedance.disk.c.a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f28538a = {66, 68};

    static {
        Covode.recordClassIndex(16775);
    }

    public static String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    private static b b(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar = new a("path");
                byte[] a2 = aVar.a(Base64.decode(str, 0));
                aVar.a();
                if (a2 != null) {
                    str2 = new String(a2);
                } else {
                    str2 = null;
                }
                int length = f28538a.length + 16;
                if (str2 != null && str2.length() > length) {
                    int i2 = 0;
                    while (true) {
                        byte[] bArr = f28538a;
                        if (i2 >= bArr.length) {
                            b bVar = new b(str2, length);
                            if (bVar.f28532a != -1 && bVar.f28536e != -1 && bVar.f28534c >= 0 && bVar.f28534c <= 7 && bVar.f28535d >= 0 && bVar.f28535d <= 2) {
                                if (!TextUtils.isEmpty(bVar.f28533b)) {
                                    return bVar;
                                }
                            }
                        } else if (str2.charAt(i2 + 16) != bArr[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
