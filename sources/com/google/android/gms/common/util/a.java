package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.c.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile int f50494a = -1;

    static {
        Covode.recordClassIndex(31459);
    }

    public static MessageDigest a(String str) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static byte[] a(Context context, String str) {
        MessageDigest a2;
        PackageInfo b2 = c.f50295a.a(context).b(str, 64);
        if (b2.signatures == null || b2.signatures.length != 1 || (a2 = a("SHA1")) == null) {
            return null;
        }
        return a2.digest(b2.signatures[0].toByteArray());
    }
}
