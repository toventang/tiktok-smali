package com.ss.android.ugc.aweme.profile.f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.d;
import h.q;
import h.r;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f116428a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(75163);
    }

    public static final String a(String str, String str2, String str3, String str4) {
        byte[] decode;
        Object obj;
        String str5;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        byte[] bytes = str.getBytes(d.f158808a);
        l.b(bytes, "");
        byte[] bytes2 = str2.getBytes(d.f158808a);
        l.b(bytes2, "");
        byte[] bytes3 = str4.getBytes(d.f158808a);
        l.b(bytes3, "");
        String str6 = null;
        if (bytes == null) {
            decode = null;
        } else {
            decode = Base64.decode(bytes, 2);
        }
        byte[] a2 = a(decode, bytes2, "AES", str3, bytes3);
        if (a2 != null) {
            try {
                str5 = new String(a2, d.f158808a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
        } else {
            str5 = null;
        }
        obj = q.m223constructorimpl(str5);
        if (!q.m228isFailureimpl(obj)) {
            str6 = obj;
        }
        String str7 = str6;
        if (str7 == null) {
            return "";
        }
        return str7;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || str2 == null) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Cipher instance = Cipher.getInstance(str2);
            l.b(instance, "");
            if (bArr3 == null || bArr3.length == 0) {
                instance.init(2, secretKeySpec);
            } else {
                instance.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            }
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
